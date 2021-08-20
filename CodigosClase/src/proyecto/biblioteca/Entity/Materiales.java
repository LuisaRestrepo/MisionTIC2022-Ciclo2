/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.biblioteca.Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "materiales")
@NamedQueries({
    @NamedQuery(name = "Materiales.findAll", query = "SELECT m FROM Materiales m"),
    @NamedQuery(name = "Materiales.findByIdMaterial", query = "SELECT m FROM Materiales m WHERE m.idMaterial = :idMaterial"),
    @NamedQuery(name = "Materiales.findByTitulo", query = "SELECT m FROM Materiales m WHERE m.titulo = :titulo"),
    @NamedQuery(name = "Materiales.findByCodigo", query = "SELECT m FROM Materiales m WHERE m.codigo = :codigo"),
    @NamedQuery(name = "Materiales.findByAutor", query = "SELECT m FROM Materiales m WHERE m.autor = :autor"),
    @NamedQuery(name = "Materiales.findByAnio", query = "SELECT m FROM Materiales m WHERE m.anio = :anio"),
    @NamedQuery(name = "Materiales.findByEstado", query = "SELECT m FROM Materiales m WHERE m.estado = :estado")})
public class Materiales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMaterial")
    private Integer idMaterial;
    @Basic(optional = false)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "autor")
    private String autor;
    @Basic(optional = false)
    @Column(name = "anio")
    @Temporal(TemporalType.DATE)
    private Date anio;
    @Basic(optional = false)
    @Column(name = "estado")
    private boolean estado;
    @ManyToMany(mappedBy = "materialesCollection")
    private Collection<Autores> autoresCollection;
    @JoinColumns({
        @JoinColumn(name = "bibliotecas_idbibliotecas", referencedColumnName = "idbibliotecas"),
        @JoinColumn(name = "bibliotecas_idbibliotecas", referencedColumnName = "idbibliotecas")})
    @ManyToOne(optional = false)
    private Bibliotecas bibliotecas;
    @JoinColumns({
        @JoinColumn(name = "Categorias_idCategorias", referencedColumnName = "idCategorias"),
        @JoinColumn(name = "Categorias_idCategorias", referencedColumnName = "idCategorias")})
    @ManyToOne(optional = false)
    private Categorias categorias;

    public Materiales() {
    }

    public Materiales(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Materiales(Integer idMaterial, String titulo, String codigo, String autor, Date anio, boolean estado) {
        this.idMaterial = idMaterial;
        this.titulo = titulo;
        this.codigo = codigo;
        this.autor = autor;
        this.anio = anio;
        this.estado = estado;
    }

    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Collection<Autores> getAutoresCollection() {
        return autoresCollection;
    }

    public void setAutoresCollection(Collection<Autores> autoresCollection) {
        this.autoresCollection = autoresCollection;
    }

    public Bibliotecas getBibliotecas() {
        return bibliotecas;
    }

    public void setBibliotecas(Bibliotecas bibliotecas) {
        this.bibliotecas = bibliotecas;
    }

    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaterial != null ? idMaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materiales)) {
            return false;
        }
        Materiales other = (Materiales) object;
        if ((this.idMaterial == null && other.idMaterial != null) || (this.idMaterial != null && !this.idMaterial.equals(other.idMaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.biblioteca.Entity.Materiales[ idMaterial=" + idMaterial + " ]";
    }
    
}
