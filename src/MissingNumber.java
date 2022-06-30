import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class MissingNumber {

    final static class Reader {
        BufferedReader reader;
        StringTokenizer tokenizer = null;
        Reader() {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }

        private void initializer() throws IOException {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        private String nextToken() throws IOException {
            if (tokenizer == null || !tokenizer.hasMoreTokens())
                initializer();
            return tokenizer.nextToken();
        }

        public void close() throws IOException {
            reader.close();
        }
        public int[] nextIntArray(int n) throws IOException {
            int []data=new int[n];
            for (int i=0;i<n;i++)
                data[i]=Integer.parseInt(nextToken());
            return data;
        }

        public float[] nextFloatArray(int n) throws IOException {
            float []data=new float[n];
            for (int i=0;i<n;i++)
                data[i]=Float.parseFloat(nextToken());
            return data;
        }

        public double[] nextDoubleArray(int n) throws IOException {
            double []data=new double[n];
            for (int i=0;i<n;i++)
                data[i]=Double.parseDouble(nextToken());
            return data;
        }

        public String[] nextStringArray(int n) throws IOException {
            String []data=new String[n];
            for (int i=0;i<n;i++)
                data[i]=nextToken();
            return data;
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public String next() throws IOException {
            return nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(nextToken());
        }

        public float nextFloat() throws IOException {
            return Float.parseFloat(nextToken());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(nextToken());
        }

    }
    final static class Writer{
        PrintWriter writer;
        Writer(){
            writer=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        }
        public void print(int val){
            writer.print(val);
        }
        public void print(char c){
            writer.print(c);
        }
        public void print(String str){
            writer.print(str);
        }
        public  void print(double d){
            writer.print(d);
        }
        public  void print(float f){
            writer.print(f);
        }
        public void println(int val){
            writer.println(val);
        }
        public void println(char c){
            writer.println(c);
        }
        public void println(String str){
            writer.println(str);
        }
        public  void println(double d){
            writer.println(d);
        }
        public  void println(float f){
            writer.println(f);
        }


        public  void println(long l){
            writer.println(l);
        }

        public void close(){
            writer.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        Writer writer = new Writer();
        long n = reader.nextInt();
        int [] data = reader.nextIntArray((int)n-1);
        // HashSet<Integer> set = new HashSet<>();
        // for (int i :data)
        //   set.add(i);
        // for (int i = 1;i<=n;i++)if (!set.contains(i)) writer.println(i);
        // writer.close();
        long sum = 0;
        for (int i:data)
            sum+=i;
        writer.println((n*(n+1))/2 - sum);
        writer.close();

    }
}
