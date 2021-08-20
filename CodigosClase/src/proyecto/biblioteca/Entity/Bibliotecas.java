/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.biblioteca.Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "bibliotecas")
@NamedQueries({
    @NamedQuery(name = "Bibliotecas.findAll", query = "SELECT b FROM Bibliotecas b"),
    @NamedQuery(name = "Bibliotecas.findByIdbibliotecas", query = "SELECT b FROM Bibliotecas b WHERE b.idbibliotecas = :idbibliotecas"),
    @NamedQuery(name = "Bibliotecas.findByNombre", query = "SELECT b FROM Bibliotecas b WHERE b.nombre = :nombre")})
public class Bibliotecas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbibliotecas")
    private Integer idbibliotecas;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bibliotecas")
    private Collection<Empleados> empleadosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bibliotecas")
    private Collection<Materiales> materialesCollection;

    public Bibliotecas() {
    }

    public Bibliotecas(Integer idbibliotecas) {
        this.idbibliotecas = idbibliotecas;
    }

    public Bibliotecas(Integer idbibliotecas, String nombre) {
        this.idbibliotecas = idbibliotecas;
        this.nombre = nombre;
    }

    public Integer getIdbibliotecas() {
        return idbibliotecas;
    }

    public void setIdbibliotecas(Integer idbibliotecas) {
        this.idbibliotecas = idbibliotecas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Empleados> getEmpleadosCollection() {
        return empleadosCollection;
    }

    public void setEmpleadosCollection(Collection<Empleados> empleadosCollection) {
        this.empleadosCollection = empleadosCollection;
    }

    public Collection<Materiales> getMaterialesCollection() {
        return materialesCollection;
    }

    public void setMaterialesCollection(Collection<Materiales> materialesCollection) {
        this.materialesCollection = materialesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbibliotecas != null ? idbibliotecas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bibliotecas)) {
            return false;
        }
        Bibliotecas other = (Bibliotecas) object;
        if ((this.idbibliotecas == null && other.idbibliotecas != null) || (this.idbibliotecas != null && !this.idbibliotecas.equals(other.idbibliotecas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.biblioteca.Entity.Bibliotecas[ idbibliotecas=" + idbibliotecas + " ]";
    }
    
}
