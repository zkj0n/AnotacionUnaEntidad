package es.albarregas.beans;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity

@Table(name="profesoresAnot")
@DynamicUpdate(true)
public class Profesor implements Serializable {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name="idProf")
    private int id;

    @Column(name="nombre", length = 20, nullable = false)
    private String nombre;

    @Column(name="ape1", length = 15, nullable = false)
    private String ape1;

    @Column(name="ape2", length = 15, nullable = true)
    private String ape2;

    public Profesor(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(nombre, profesor.nombre) && Objects.equals(ape1, profesor.ape1) && Objects.equals(ape2, profesor.ape2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ape1, ape2);
    }
}
