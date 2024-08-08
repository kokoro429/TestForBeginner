package org.example;

import java.util.Scanner;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  public static void main(String[] args) {
    /*
    Javaの基本構文を使用して、簡単な計算機プログラムを作成してください。
    加減乗除の四則演算ができ、ユーザーから入力を受け取り、結果を表示するものとします。


    入力例:
    1番目の数字を入力してください: 10
    演算子を入力してください (+, -, *, /): +
        2番目の数字を入力してください: 5

    期待される出力例:
    計算結果: 10 + 5 = 15

     */

    Scanner scanner = new Scanner(System.in);

    //num1の入力＆検証
    double num1 = InputValidator.getValidatedDouble(scanner);

    //演算子の入力＆検証
    char operator = InputValidator.getValidatedOperator(scanner);

    //num2の入力＆検証
    double num2 = InputValidator.getValidatedDouble(scanner);

    double result = 0;

    //演算子に応じて実行
    switch (operator) {
      case '+':
        result = num1 + num2;
        break;

      case '-':
        result = num1 - num2;
        break;

      case '*':
        result = num1 * num2;
        break;

      case '/':
        if (num2 != 0) {
          result = num1 / num2;
        } else {
          System.out.println("０で割ることは出来ません。");
          return;
        }
        break;

      default:
        System.out.println("無効な演算子です。");
        return;
    }

    //結果
    System.out.println("計算結果：" + result);

  }
}