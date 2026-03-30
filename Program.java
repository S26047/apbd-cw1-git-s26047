public class Program {
    public static void main(String[] args) {
        System.out.println("Witaj świecie");
        System.out.println("Hello world");
        int[] values = {1, 2, 3, 4, 5, 6};
        CalculateAverage(values);
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

    public void CalculateMax(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }

    public void CalculateMin(int[] values) {
        int min = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        System.out.println(min);
    }
}