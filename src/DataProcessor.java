public class DataProcessor {
    public void processData(MyData data) {

        int result = processDataInternally(data);
        displayResult(result);
    }

    private int processDataInternally(MyData data) {

        int sum = 0;
        for (int value : data.getValues()) {
            sum += value;
        }
        return sum;
    }

    private void displayResult(int result) {
        // Виведення результату обробки даних
        System.out.println("Processed result: " + result);
    }
}
