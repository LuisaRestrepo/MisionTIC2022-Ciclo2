package proyecto.parqueadero;

public class Parqueadero {

    public int pisos;
    public int espacios;
    public int cantidadParqueados;
    public int historial;
    public Vehiculo[][] matriz;

    public Parqueadero(int p, int e, int pCarro, int pMoto) {
        this.pisos = p;
        this.espacios = e;
        Carro.precio = pCarro;
        Moto.precio = pMoto;
        this.matriz = new Vehiculo[p][e];
    }

    public String imprimeVacios() {
        String info = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == null) {
                    info = info + "Piso: " + (i + 1) + ", Espacio: " + (j + 1) + " - VACIO\n";
                }
            }
        }
        return info;
    }

    public String parqueaVehiculo(int p, int e, int tipo, String placa) {
        try{
        if (matriz[p][e] == null) {
            switch (tipo) {
                case 1:
                    matriz[p][e] = new Carro(placa);
                    break;
                case 2:
                    matriz[p][e] = new Moto(placa);
                    break;
                default:
                    return "Opción desconocida";
            }
         return "Vehiculo parqueadeo";    
        } else {
            return "Lugar no disponible";
        }
        
        } catch(Exception exep){
            return "Piso y espacio ingresado no existe";
        }
    }
    
    public String estadoParqueadero(){
        String info = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == null) {
                    info = info + "Piso: " + (i + 1) + ", Espacio: " + (j + 1) + " - VACIO\n";
                }else{
                    info = info + "Piso: " + (i + 1) + ", Espacio: " + (j + 1) + " - "+ matriz[i][j].info()+"\n";
                }
            }
        }
        return info;
    }

}
