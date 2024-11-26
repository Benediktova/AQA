/*
1. Реализовать сохранение данных в csv файл;
2. Реализовать загрузку данных из csv файла. Файл читается целиком.

Структура csv файла:
- Строка заголовок с набором столбцов
- Набор строк с целочисленными значениями
- Разделитель между столбцами - символ точка с запятой (;)

Пример:
Для хранения данных использовать класс вида:
public class AppData {
   private String[] header;
   private int[][] data;
   // ...
}
Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(String.join(";", header));
            writer.newLine();

            for (int[] row : data) {
                StringBuilder rowString = new StringBuilder();
                for (int value : row) {
                    rowString.append(value).append(";");
                }
                writer.write(rowString.substring(0, rowString.length() - 1));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData load(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String headerLine = reader.readLine();
            String[] header = headerLine.split(";");

            String line;
            int[][] data = new int[100][];
            int rowCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                int[] row = new int[values.length];
                for (int i = 0; i < values.length; i++) {
                    row[i] = Integer.parseInt(values[i]);
                }
                data[rowCount++] = row;
            }
            int[][] trimmedData = new int[rowCount][];
            System.arraycopy(data, 0, trimmedData, 0, rowCount);

            return new AppData(header, trimmedData);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}