package C24B2;

    public class celularAtribEjer2 {
        // objeto celular//


        private String marca;
        private String color;
        private String tamaño;
        private String calidad;
        private String peso;

        public celularAtribEjer2  (String marca, String color, String tamaño, String calidad, String peso){
            this.marca=marca;
            this.color=color;
            this.tamaño=tamaño;
            this.calidad=calidad;
            this.peso=peso;

        }

        //metodos//

        public void llamar(String numero){
            System.out.println("llamar al numero " + numero);
        }

        public void enviarMensaje(String numero,String mensaje){
            System.out.println("enviar mensaje al numero " +  numero + " "+mensaje);
        }

        public void mostrarCaracteristicas(){
            System.out.println("La marca del telefono es " + marca);
            System.out.println("El color del telefono es " + color);
            System.out.println("La calidad del telefono es  " + calidad);
            System.out.println("La tamaño del telefono es " + tamaño);
            System.out.println("La peso del telefono es  " + peso);


        }

        public static void main(String[] args) {
            celularAtribEjer2 celular1 =  new celularAtribEjer2("motorola","negro","10x15","Excelente","20g");
            celular1.llamar("3005804690");
            celular1.mostrarCaracteristicas();
            celular1.enviarMensaje("3004809240"," Hola estas disponible?");

        }




    }


