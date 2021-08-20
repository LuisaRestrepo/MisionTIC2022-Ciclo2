/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.biblioteca.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "empleados")
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e"),
    @NamedQuery(name = "Empleados.findByIdEmpleado", query = "SELECT e FROM Empleados e WHERE e.idEmpleado = :idEmpleado"),
    @NamedQuery(name = "Empleados.findByUsuario", query = "SELECT e FROM Empleados e WHERE e.usuario = :usuario"),
    @NamedQuery(name = "Empleados.findByClave", query = "SELECT e FROM Empleados e WHERE e.clave = :clave"),
    @NamedQuery(name = "Empleados.findByEstado", query = "SELECT e FROM Empleados e WHERE e.estado = :estado"),
    @NamedQuery(name = "Empleados.findByNombre", query = "SELECT e FROM Empleados e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empleados.findByFechaRegistro", query = "SELECT e FROM Empleados e WHERE e.fechaRegistro = :fechaRegistro")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmpleado")
    private Integer idEmpleado;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @Column(name = "estado")
    private boolean estado;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @JoinColumns({
        @JoinColumn(name = "bibliotecas_idbibliotecas", referencedColumnName = "idbibliotecas"),
        @JoinColumn(name = "bibliotecas_idbibliotecas", referencedColumnName = "idbibliotecas")})
    @ManyToOne(optional = false)
    private Bibliotecas bibliotecas;
    @JoinColumn(name = "tipo_usuario_idtipo_usuario", referencedColumnName = "idtipo_usuario")
    @ManyToOne(optional = false)
    private TipoUsuario tipoUsuarioIdtipoUsuario;

    public Empleados() {
    }

    public Empleados(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empleados(Integer idEmpleado, String usuario, String clave, boolean estado, String nombre, Date fechaRegistro) {
        this.idEmpleado = idEmpleado;
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Bibliotecas getBibliotecas() {
        return bibliotecas;
    }

    public void setBibliotecas(Bibliotecas bibliotecas) {
        this.bibliotecas = bibliotecas;
    }

    public TipoUsuario getTipoUsuarioIdtipoUsuario() {
        return tipoUsuarioIdtipoUsuario;
    }

    public void setTipoUsuarioIdtipoUsuario(TipoUsuario tipoUsuarioIdtipoUsuario) {
        this.tipoUsuarioIdtipoUsuario = tipoUsuarioIdtipoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.biblioteca.Entity.Empleados[ idEmpleado=" + idEmpleado + " ]";
    }
    
}
