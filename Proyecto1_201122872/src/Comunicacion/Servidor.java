/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comunicacion;

/**
 *
 * @author Alina
 */
import java.io.* ;
import java.net.* ;
class Servidor {
  static final int PUERTO=5000;
  public Servidor( ) {
    try {
 System.out.println("Inicializando SERVIDOR");
//creamos un objeto de la clase ServerSocket para esperar conexiones por el puerto designado
ServerSocket socketServidor = new ServerSocket(PUERTO);
//Imprimimos en pantalla que estamos escuchando al puerto
System.out.println("Escucho el puerto " + PUERTO );
System.out.println("Esperando conexiones de clientes ..." );

//Mediante un bucle for restringimos la atención a solamente 3 clientes
for ( int numeroCliente = 0; numeroCliente < 3; numeroCliente++ ) {
    //Creamos un objeto de la clase Socket para Gestionar las conexiones de cada cliente
    //El método .accept() crea un nuevo socket para atender a un cliente que se ha conectado al servidor
  Socket socketCliente = socketServidor.accept(); 
  //Imprimemos en pantalla que estamos atendiendo al cliente numeroCliente
  System.out.println("Sirvo al cliente " + numeroCliente + " en el puerto de comunicaciones "+socketCliente.getPort());
  // creamos un stream de salida para enviar los mensajes a los clientes
  OutputStream mensajeParaCliente = socketCliente.getOutputStream();
  //La clase DataOutputStream es útil para escribir datos del tipo primitivo de una forma portable. Esta clase tiene un sólo constructor que toma un objeto de la clase OutputStream o sus derivadas como parámetro. 
  DataOutputStream flujoSecuencial= new DataOutputStream( mensajeParaCliente );
  //Escribimos en el flujoSecuencial del socket mediante .writeUTF y lo enviamos al cliente
  flujoSecuencial.writeUTF( "Bienvenido cliente " + numeroCliente +".\nEl puerto de escucha es el "+ socketCliente.getLocalPort()+ " y el puerto de comunicaciones bidireccional es "+ socketCliente.getPort() );
 //Cerramos el socket después de haber enviado los mensajes al cliente
  socketCliente.close();
  
}
    System.out.println("Demasiados clientes por hoy");
    System.out.println("Solamente puedo atender 3 Clientes");
    } catch( Exception e ) {
System.out.println( e.getMessage() );
    }
  }
  public static void main( String[] arg ) {
    Servidor miServidor=new Servidor();//creamos un objeto de la clase Servidor
  }
}
