public class TableauInt extends Annimal2
{
        private Comparable[] t;

        /*-----------------------------------------------*/

        public TableauInt(int taille)
        {
                t = new Comparable[taille];
        }

        /*-----------------------------------------------*/

        public TableauInt(TableauInt other)
        {
                t = new Comparable[other.t.length];
                for (int i = 0; i < t.length; i++)
                        t[i] = other.t[i];
        }

        /*-----------------------------------------------*/

        public TableauInt copie()
        {
                return new TableauInt(this);
        }

        /*-----------------------------------------------*/

        public String toString()
        {
                String res = "[";
                if (t.length >= 1)
                        res += t[0];
                for (int i = 1; i < t.length; i++)
                        res += ", " + t[i];
                res += "]";
                return res;
        }

        /*-----------------------------------------------*/

        public Comparable get(int index)
        {
                return t[index];
        }

        /*-----------------------------------------------*/

        public void set(int index, Comparable value)
        {
                t[index] = value;
        }

        /*-----------------------------------------------*/

        public void echange(int i, int j)
        {
                Comparable temp = t[i];
                t[i] = t[j];
                t[j] = temp;
        }

        /*-----------------------------------------------*/

        public void triSelection()
        {
                for (int i = 0; i < t.length - 1; i++)
                {
                        int indiceMin = i;
                        for (int j = i + 1; j < t.length; j++)
                                if (t[indiceMin].compareTo(t[j]) >0)
                                        indiceMin = j;
                        echange(i, indiceMin);
                }
        }

        /*-----------------------------------------------*/
        
   
        @Override
		public int compareTo(Comparable other) {
			// TODO Auto-generated method stub
			return 0;
		}
        
        
        public static void main(String[] args)
        {
                int n = 10;
                TableauInt tab = new TableauInt(n);
                
                
                
                System.out.println(tab);
                tab.triSelection();
                System.out.println(tab);
        }

}