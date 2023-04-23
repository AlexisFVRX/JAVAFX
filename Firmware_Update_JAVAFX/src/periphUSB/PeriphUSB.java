/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package periphUSB;
import com.fazecast.jSerialComm.SerialPort;

/**
 *
 * @author alexis
 */
public class PeriphUSB {
    
   public static void main(String[] args){
       SerialPort[] ports = SerialPort.getCommPorts();
       
       for (SerialPort port : ports) {
           
            System.out.println("SystemPortName : "+port.getSystemPortName());
            System.out.println("SystemPortPath : "+port.getSystemPortPath());
            System.out.println("PortLocation : "+port.getPortLocation());
            System.out.println("PortDescription : "+port.getPortDescription());
            System.out.println("DescriptivePortName : "+port.getDescriptivePortName());
            System.out.println("BaudRate : "+port.getBaudRate());
            System.out.println("-----------");
            
            
       }
   }
    
}
