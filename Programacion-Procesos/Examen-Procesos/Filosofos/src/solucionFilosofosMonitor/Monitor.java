package solucionFilosofosMonitor;

public class Monitor 
{
        boolean palilloLibre[];
        
        public Monitor(int numPalillos)
        {
                palilloLibre = new  boolean[numPalillos];
                
                for (int i=0; i<numPalillos; i++)
                {
                        palilloLibre[i]=true;
                } 
        }
        public synchronized boolean intentarCogerPalillos(int pos1, int pos2)
        {
            boolean losCoge = (palilloLibre[pos1]) &&  (palilloLibre[pos2]);
            //Vemos si podemos coger ambos tenedores, están libres
            if (losCoge)
            {
                    palilloLibre[pos1]=false;
                    palilloLibre[pos2]=false;
            } 
            return losCoge;
        }

        public void liberarPalillos(int pos1, int pos2)
        {
                palilloLibre[pos1]=true;
                palilloLibre[pos2]=true;
        }
}
