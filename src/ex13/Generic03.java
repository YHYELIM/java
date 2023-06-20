package ex13;

import javax.print.DocFlavor.STRING;

class Data<T> {
    int status;// 어떤 숫자 넣을거고
    T body;// 어떤 값
}

public class Generic03 {

    Data<?> getNum(int check) {// 물음표넣으면 여러가지 타입으로 리턴할수있다(와이드카드)
        if (check == 1) {
            Data<String> data = new Data<>();
            return data;

        } else {
            Data<Integer> data = new Data<>();
            return data;
        }

    }

    Object getNum2(int check) {
        if (check == 1) {

            return "안녕";

        } else {

            return 1;
        }

    }

    public static void main(String[] args) {
        Generic03 g3 = new Generic03();
        int n = (int) g3.getNum2(1);
        Data<?> d = g3.getNum(1);

    }

}
