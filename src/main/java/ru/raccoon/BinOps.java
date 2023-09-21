package ru.raccoon;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        // вывод с добавлением лидирующих нулей (4 байта для int)
        return String.format("%32s", Integer.toBinaryString(intA + intB)).replace(' ', '0');
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        // вывод с добавлением лидирующих нулей (4 байта для int)
        return String.format("%32s", Integer.toBinaryString(intA * intB)).replace(' ', '0');
    }
}
