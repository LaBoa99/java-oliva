package date;

public class MyDate {
    
    private byte dia = 1;
    private byte mes = 1;
    private int anio = 1;

    public MyDate(){

    }

    public MyDate(int dia, int mes, int anio){

        this.dia = (byte) dia;
        this.mes = (byte) mes;
        this.anio = anio;

        this.setDia((byte) dia);
        this.setMes((byte) mes);
        this.setAnio(anio);
    }
    

    public byte getDia() {
        return this.dia;
    }

    public void setDia(int dia){
        this.setDia((byte) dia);
    }

    
    public void setDia(byte dia) {
        if(dia < 1 || dia > 31){
            byte temp = this.dia;
            this.dia = dia;
            System.out.println(this.toString());
            this.dia = temp;
            return;
        }
        this.dia = dia;
    }
    
    public byte getMes() {
        return this.mes;
    }
    
    public void setMes(int mes){
        this.setMes((byte) mes);
    }

    public void setMes(byte mes) {
        if(mes > 12 || mes < 1){
            byte temp = this.mes;
            this.mes = mes;
            System.out.println(this.toString());
            this.mes = temp;
            return;
        }
        this.mes = mes;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        if(anio > 2026){
            int temp = this.anio;
            this.anio = anio;
            System.out.println(this.toString());
            this.anio = temp;
            return;
        }
        this.anio = anio;
    }

    private boolean hasError(){
        return 
            (this.dia < 1 || this.dia > 31) ||
            (this.mes < 1 || this.mes > 12) ||
            (this.anio > 2026);
    }

    private String normalizeTwoDigits(byte number){
        if(number > 9 || number < 1){
            return "" + number;
        }
        return "0" + number;
    }
    

    @Override
    public String toString() {
        String currentDate = this.normalizeTwoDigits(this.dia) + "/" + this.normalizeTwoDigits(this.mes) + "/" + this.anio;
        if(this.hasError()){
            return currentDate + ", Fecha Invalida";
        }
        return  currentDate;
    }
}
