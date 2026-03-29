public class Program {
    public static void main(String[] args) {
        System.out.println("Witaj świecie");
    }

    public void CalculateAverage(int[] values) {
        int sum = 0;
        double average = 0;
        for(int value : values){
            sum += value;
        }
        average = (double) sum / values.length;
        System.out.println(average);
    }
}