package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
/*
    配列とリストまたはStreamAPIを使用して、学生の名前と点数を管理するプログラムを作成してください。
    名前の追加、削除、点数の更新、平均点の計算ができるようにしてください。
    処理をループさせるにはWhile文を使って実現してください。


    入力例:
    1. 学生を追加
    2. 学生を削除
    3. 点数を更新
    4. 平均点を計算
    5. 全学生の情報を表示
    6. 終了
    選択してください: 1

    学生の名前を入力してください: 山田太郎
    山田太郎の点数を入力してください: 85

    1. 学生を追加
    2. 学生を削除
    3. 点数を更新
    4. 平均点を計算
    5. 全学生の情報を表示
    6. 終了
    選択してください: 1

    学生の名前を入力してください: 鈴木花子
    鈴木花子の点数を入力してください: 92

期待される出力例:
    1. 学生を追加
    2. 学生を削除
    3. 点数を更新
    4. 平均点を計算
    5. 全学生の情報を表示
    6. 終了
    選択してください: 5

    学生一覧:
    山田太郎: 85点
    鈴木花子: 92点

    1. 学生を追加
    2. 学生を削除
    3. 点数を更新
    4. 平均点を計算
    5. 全学生の情報を表示
    6. 終了
    選択してください: 4

    平均点: 88.5点

    1. 学生を追加
    2. 学生を削除
    3. 点数を更新
    4. 平均点を計算
    5. 全学生の情報を表示
    6. 終了
    選択してください: 6

    プログラムを終了します。

     */


public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    StudentManagement studentManagement = new StudentManagement();

    while (true) {
      //表示
      System.out.println("1. 学生を追加");
      System.out.println("2. 学生を削除");
      System.out.println("3. 点数を更新");
      System.out.println("4. 平均点を計算");
      System.out.println("5. 全学生の情報を表示");
      System.out.println("6. 終了");
      System.out.println("選択してください:");
      //ユーザーが選んだ番号を受け取る
      int choice = scanner.nextInt();
      //Enterキーを消費
      scanner.nextLine();

      // 入力に応じて処理
      switch (choice) {
        case 1:
          studentManagement.addStudent();
          break;

        case 2:
          studentManagement.deleteStudent();
          break;

        case 3:
          studentManagement.updateStudentScore();
          break;

        case 4:
          studentManagement.averageScore();
          break;

        case 5:
          studentManagement.displayAllStudents();
          break;

        case 6:
          System.out.println("プログラムを終了します。");
          scanner.close();
          ;
          return;
        default:
          System.out.println("無効な選択です。");
          return;
      }
    }
  }
}