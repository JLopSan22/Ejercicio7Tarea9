package daw.programacion;

import java.util.*;


/**
 * Class Lugar
 */
public class Lugar {

  //
  // Fields
  //

  private int id;
  private String direccion;
  private String localidad;
  private String provincia;
  
  //
  // Constructors
  //
  public Lugar () { };

  public Lugar(int id, String direccion, String localidad, String provincia) {
    this.id = id;
    this.direccion = direccion;
    this.localidad = localidad;
    this.provincia = provincia;
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

  /**
   * Set the value of direccion
   * @param newVar the new value of direccion
   */
  public void setDireccion (String newVar) {
    direccion = newVar;
  }

  /**
   * Get the value of direccion
   * @return the value of direccion
   */
  public String getDireccion () {
    return direccion;
  }

  /**
   * Set the value of localidad
   * @param newVar the new value of localidad
   */
  public void setLocalidad (String newVar) {
    localidad = newVar;
  }

  /**
   * Get the value of localidad
   * @return the value of localidad
   */
  public String getLocalidad () {
    return localidad;
  }

  /**
   * Set the value of provincia
   * @param newVar the new value of provincia
   */
  public void setProvincia (String newVar) {
    provincia = newVar;
  }

  /**
   * Get the value of provincia
   * @return the value of provincia
   */
  public String getProvincia () {
    return provincia;
  }

  //
  // Other methods
  //

}
