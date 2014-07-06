/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio13_22;

import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Ariel
 */
public class Ejercicio13_23 {
    
     public class Ejercicio13
    {
         public int[] Ordenar(int[] valores)
          {
            int respaldo[] = new int[valores.length];
            int cont = 0;
            for (int i = 0; i < valores.length; i++) 
            {
            if (valores[i] < 0) {
                respaldo[cont] = valores[i];
                cont++;
                }
            }
                for (int i = 0; i < valores.length; i++)
                 {
                   if (valores[i] >= 0)
                   {
                    respaldo[cont] = valores[i];
                    cont++;
                   }
                }
        return respaldo;
    }
    
    }
    public class Ejercicio14
    {
     public int serie(int x, int y, int z)
     {
        int vector[] = new int[z+1];
        int Z = -1;
        int cont = 0;
        if ((x<=0)||(x>255)||(y<=0)||(y>255)||(z<=0)||(z>255)) {
            return Z;
        }else{
            do {
                vector[cont]= Integer.parseInt(String.valueOf(x)+String.valueOf(y));
                vector[cont+1]= Integer.parseInt(String.valueOf(y)+String.valueOf(x));
                x = x + 1;
                y = y + 1;
                cont = cont + 2;
            }while (z>=cont);
        }
        return vector[z-1];
    }
    }
    
    public class Ejercicio16
    {
        public int serie(int x, int y , int z)
        {
        int cont = 0;
        int a = 0;
        int acum = 0;
        int vector[] = new int[z+1];
        if (y>z) {
            return 0;
        }
        if ((x<=0)||(x>255)||(y<=0)||(y>255)||(z<=0)||(z>255)) {
            return -1;
        }
        do {
            if (a==0) {
                vector[cont]=x;
            }else{
                vector[cont]=vector[cont-1]*a;
            }
            cont++;
            a=a+2;
        } while (z>=cont);
        for (int i = y-1; i < z; i++) {
            acum = acum + vector[i];
        }
        return acum;
    }
    
    }
    
    public class Ejercicio17
    {
    public String letraanumeros(String numero)
    {
        String[] Letras = {"UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE",
        "DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE",
        "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA",
        "CIEN", "CIENTO", "DOSCIENTOS"};
        Integer[] Valores = {1, 2, 3, 4, 5, 6, 7, 8, 9,
        10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
        20, 30, 40, 50, 60, 70, 80, 90,
        100, 100, 200};
        
        List lstLetras = java.util.Arrays.asList(Letras);
        StringTokenizer st = new StringTokenizer(numero);
        Integer numer = 0;
        while (st.hasMoreTokens()) {
            String t = st.nextToken();
            if (lstLetras.indexOf(t) > -1) {
                numer += Valores[lstLetras.indexOf(t)];
            }
        }
        if ((numer>255)) {
            return String.valueOf(-1);
        }
        return String.valueOf(numer);
    }
    }
    
    public class Ejercicio18
    {
         public String[] Ordenar(String[] valores)
         {
        for(int i=0;i<valores.length;i++) {
            for(int j=0;j<valores.length-i;j++) {
                if (valores[j].compareTo(valores[j+1])>0) {
                    String aux;
                    aux=valores[j];
                    valores[j]=valores[j+1];
                    valores[j+1]=aux;
                }
            }
        }
             return valores;
          }
    
    }
    
    public class Ejercicio19
    {
    public int Binario(int num)
    {
        int coc = 0, res=0,binario = 0;
        while (num >= 2){
                coc = num / 2;
                res = num % 2;
                num = coc;
                if (res == 1) {
                    binario++;
            }
        }
        return binario;
    }
    }
    
    public class Ejercicio20
    {
         public int particion(int num)
         {
        int total = num;
        int count = 0;
	  for(int numParts=1; numParts<=total; ++numParts) {
	    count += particion(num, numParts);
	  }
	  return count;
    }
    
    public int particion(int sum, int numParts)
    {
	  if ( numParts > sum ) {
	    return 0;
	  } else if ( numParts == sum ) {
	    return 1;
	  } else {
	    return particion(sum-1, numParts-1) +
	           particion(sum-numParts, numParts);
	  }
    }  
    
    }
    
    public class Ejercicio21
    {
         public String Matriz1(String [][]n)
         {
        String res = null;
        int[][] M = new int[3][3];
        for (int a = 0; a < 3 / 2; a++) {
            for (int i = a; i < 3 - a; i++) {
            res = res + String.valueOf(M[a][i]);
        }
        for (int i = a; i <= 3 - a; i++) {
            res = res + String.valueOf(M[i][3 - a + 1]);
        }
        for (int i = 3 - a + 1; i >= a + 1; i--) {
            res = res + String.valueOf(M[3 - a + 1][i]);
        }
        for (int i = 3 - a + 1; i >= a + 1; i--) {
            res = res + String.valueOf(M[i][a]);
        }
        }
        if (3 % 2 == 1) {
            res = res + String.valueOf(M[3 / 2 + 1][3 / 2 + 1]);
        }
        return res;
      }
    
    }
    
    public class Ejercicio22
    {
        public String Matriz1(String [][]n)
        {
         String res = null;
         int[][] M = new int[3][3];
         for (int a = 0; a < 3 / 2; a++) 
          {
            for (int i = a; i < 3 - a; i++)
            {
              res = res + String.valueOf(M[a][i]);
            }
            for (int i = a; i <= 3 - a; i++)
            {
            res = res + String.valueOf(M[i][3 - a + 1]);
            }
            for (int i = 3 - a + 1; i >= a + 1; i--) 
            {
            res = res + String.valueOf(M[3 - a + 1][i]);
         }
         for (int i = 3 - a + 1; i >= a + 1; i--) 
         {
            res = res + String.valueOf(M[i][a]);
         }
         }
          if (3 % 2 == 1) {
            res = res + String.valueOf(M[3 / 2 + 1][3 / 2 + 1]);
          }
          return res;
       }
    
    }
    
    
}
