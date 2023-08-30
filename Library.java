package test;

import java.util.Objects;

import static java.lang.Boolean.FALSE;

public class Library {

    private String[] list;
    private int count;
    public Library(int size) {

        if (size <= 0) {
            throw new IllegalArgumentException("도서관 크기는 1보다 작은 값을 넣을 수 없습니다.");
        }
        list = new String[size];
        count = 0;

        for (int i = 0; i < size; i++) {
            list[i] = "";
        }
    }

    public void add(String s) {
        if(count== list.length)throw new IllegalArgumentException( "책장이 꽉 찼습니다. 책장을 비워주세요.");
        if (check(s))throw new IllegalArgumentException( "["+s+"]" +" 은 이미 있는 책 입니다.");

        list[count]=s;
        count++;
        System.out.println("["+s+"]" +" 책을 추가 했습니다.");
    }

    public void delete(String s) {
        if(count== 0)throw new IllegalArgumentException( "책장이 비어 있습니다. 삭제가 불가능 합니다.");
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(s)) {
                for (int j = i; j < list.length - 1; j++) {
                    list[i] = list[i + 1];
                }
                list[list.length - 1] = "";
                count -= 1;
                return;
            }
        }
        System.out.println("[" + s + "]" + " 책을 삭제 했습니다.");
    }

    public void find(String s) {
        for (int i = 0; i < count; i++) {
            if(Objects.equals(list[i], s)) System.out.println((i+1) + " " + list[i]);
        }
    }

    public void findall() {
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + " " + list[i]);
        }
    }
    public boolean check(String s){
        for (int i = 0; i < count; i++) {
            if(list[i].equals(s))
                return true;
        }
        return false;
    }

}
