package org.example;

import java.util.Scanner;

public class InputValidator {

  //数字の入力とチェック
  public static double getValidatedDouble(
      Scanner scanner) {//複数箇所で使用するときにインスタンス生成せずに呼び出せるように＆インスタンスの状態に依存しないためstaticを使用。
    double num = 0;
    boolean valid = false;

    while (!valid) {
      try {
        System.out.println("数字を入力して下さい：");
        num = scanner.nextDouble();
        valid = true;
      } catch (Exception e) {
        System.out.println("無効な入力です。再度数字を入力して下さい。");
        scanner.next();//無効な入力を削除
      }
    }
    return num;
  }

  //演算子の入力とチェック
  public static char getValidatedOperator(Scanner scanner) {
    char operator = ' ';
    boolean validOperator = false;

    while (!validOperator) {
      try {
        System.out.println("演算子 (+, -, *, /) を入力してください:");
        operator = scanner.next().charAt(0);

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
          validOperator = true;
        } else {
          throw new IllegalArgumentException("無効な演算子です。再入力してください。");
        }
      } catch (IllegalArgumentException e) {//IllegalArgumentException用のcatch。
        System.out.println(e.getMessage());
      } catch (Exception e) {//その他のエラー
        System.out.println("エラーが発生しました。再入力してください。");
        scanner.next();//無効な入力を消費
      }
    }
    return operator;
  }
}
