package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import vista.VistaVentana;

public class ControladorVistaVentana implements MouseListener, ActionListener{
    VistaVentana VV;

    public ControladorVistaVentana(){
    }
    
    
    public ControladorVistaVentana(VistaVentana VistaVentana) {
        this.VV = VistaVentana;
        this.VV.setVisible(true);
        listeners();
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        Object Source = e.getSource();
        System.out.println(Source);
        if(Source == this.VV.BtnSalir){
            System.exit(0);
        }
        if(Source == this.VV.BtnVerde){
            this.VV.BtnVerde.setBackground(Color.green);
        }

        if(Source == this.VV.BtnRojo){
            this.VV.BtnRojo.setBackground(Color.red);
        }
        if(Source == this.VV.BtnVer || Source == this.VV.BtnOcultar){
            this.VV.BtnSalir.setVisible(Source == this.VV.BtnVer);
        }
    }

    public static int getRandom(int n, int m) {
        if (n > m) {
            throw new IllegalArgumentException("El mínimo no puede ser mayor que el máximo");
        }
        Random r = new Random();
        // nextInt(limite) genera de 0 a limite-1. 
        // Sumamos 1 para incluir m, y luego sumamos n para desplazar el rango.
        return r.nextInt((m - n) + 1) + n;
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == this.VV){
            this.VV.CalabazinContainer.setBounds(getRandom(64, 640 - 64), getRandom(64, 480 - 64), 64, 64);
            this.VV.CalabazinContainer.setVisible(true);
            this.VV.repaint();
            this.VV.revalidate();
        }
    }


    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == this.VV){
            this.VV.CalabazinContainer.setVisible(false);
            this.VV.repaint();
            this.VV.revalidate();
        }
    }


    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }


    private void listeners(){
        this.VV.BtnOcultar.addMouseListener(this);
        this.VV.BtnSalir.addMouseListener(this);
        this.VV.BtnVer.addMouseListener(this);
        this.VV.BtnVerde.addMouseListener(this);
        this.VV.BtnRojo.addMouseListener(this);
        
        this.VV.addMouseListener(this);

        // Menus+
    
        this.VV.ItemSalir.addActionListener(this);
        this.VV.ItemCambiarPosicion.addActionListener(this);
        this.VV.ItemGuardar.addActionListener(this);
        this.VV.ItemSalir.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object Source = e.getSource();
        if(Source == this.VV.ItemSalir){
            System.exit(0);
        }
    }

}
