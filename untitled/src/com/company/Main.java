package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int hora = 0, minutos = 0, segundos = 0;

        while(true){
            //si es menor que 10, escribimos un cero delante
            if(hora < 10){
                System.out.print("0");
            }
            System.out.print(hora + ":");

            if (minutos < 10){
                System.out.print("0");
            }

            System.out.print(minutos + ":");

            if (segundos < 10){
                System.out.print("0");

            }

            //salto de linea
            System.out.println(segundos);
            //aumento el tiempo
            segundos++;

            //comprovar tiempo
            if (segundos ==60){
                //reinicio los segundos
                segundos = 0;
                minutos++;
                if (minutos == 60){
                    //reinicio los minutos
                    minutos = 0;

                    //aumento las horas
                    hora++;
                    if (hora == 24){
                        //reinicio las horas

                        hora = 0;
                    }

                }
            }

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }

}

