/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.posystem.gui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Ren
 */
@Entity
@Table(name = "purchases", catalog = "posystemdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Purchases.findAll", query = "SELECT p FROM Purchases p")
    , @NamedQuery(name = "Purchases.findById", query = "SELECT p FROM Purchases p WHERE p.id = :id")
    , @NamedQuery(name = "Purchases.findByProductName", query = "SELECT p FROM Purchases p WHERE p.productName = :productName")
    , @NamedQuery(name = "Purchases.findByPrice", query = "SELECT p FROM Purchases p WHERE p.price = :price")
    , @NamedQuery(name = "Purchases.findByQuantity", query = "SELECT p FROM Purchases p WHERE p.quantity = :quantity")
    , @NamedQuery(name = "Purchases.findByColor", query = "SELECT p FROM Purchases p WHERE p.color = :color")
    , @NamedQuery(name = "Purchases.findBySize", query = "SELECT p FROM Purchases p WHERE p.size = :size")})
public class Purchases implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "productName")
    private String productName;
    @Basic(optional = false)
    @Column(name = "Price")
    private String price;
    @Basic(optional = false)
    @Column(name = "Quantity")
    private int quantity;
    @Column(name = "Color")
    private String color;
    @Column(name = "Size")
    private String size;
    @Basic(optional = false)
    @Lob
    @Column(name = "Orders")
    private String orders;

    public Purchases() {
    }

    public Purchases(Integer id) {
        this.id = id;
    }

    public Purchases(Integer id, String productName, String price, int quantity, String orders) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.orders = orders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        String oldProductName = this.productName;
        this.productName = productName;
        changeSupport.firePropertyChange("productName", oldProductName, productName);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        String oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        int oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String oldColor = this.color;
        this.color = color;
        changeSupport.firePropertyChange("color", oldColor, color);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        String oldSize = this.size;
        this.size = size;
        changeSupport.firePropertyChange("size", oldSize, size);
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        String oldOrders = this.orders;
        this.orders = orders;
        changeSupport.firePropertyChange("orders", oldOrders, orders);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Purchases)) {
            return false;
        }
        Purchases other = (Purchases) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.posystem.gui.Purchases[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
