/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.biblioteca.Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "autores")
@NamedQueries({
    @NamedQuery(name = "Autores.findAll", query = "SELECT a FROM Autores a"),
    @NamedQuery(name = "Autores.findByIdautores", query = "SELECT a FROM Autores a WHERE a.idautores = :idautores"),
    @NamedQuery(name = "Autores.findByNombre", query = "SELECT a FROM Autores a WHERE a.nombre = :nombre")})
public class Autores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idautores")
    private Integer idautores;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @JoinTable(name = "autores_has_materiales", joinColumns = {
        @JoinColumn(name = "autores_idautores", referencedColumnName = "idautores"),
        @JoinColumn(name = "autores_idautores", referencedColumnName = "idautores")}, inverseJoinColumns = {
        @JoinColumn(name = "materiales_idMaterial", referencedColumnName = "idMaterial"),
        @JoinColumn(name = "materiales_idMaterial", referencedColumnName = "idMaterial")})
    @ManyToMany
    private Collection<Materiales> materialesCollection;

    public Autores() {
    }

    public Autores(Integer idautores) {
        this.idautores = idautores;
    }

    public Autores(Integer idautores, String nombre) {
        this.idautores = idautores;
        this.nombre = nombre;
    }

    public Integer getIdautores() {
        return idautores;
    }

    public void setIdautores(Integer idautores) {
        this.idautores = idautores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        hash += (idautores != null ? idautores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autores)) {
            return false;
        }
        Autores other = (Autores) object;
        if ((this.idautores == null && other.idautores != null) || (this.idautores != null && !this.idautores.equals(other.idautores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.biblioteca.Entity.Autores[ idautores=" + idautores + " ]";
    }
    
}
