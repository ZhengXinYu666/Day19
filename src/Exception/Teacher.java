package Exception;

public class Teacher {
    public void check(int score) throws MyException{
        if(score>100 || score<0){
            throw new MyException("分数不能超过100!");
        }else{
            System.out.println("分数没有问题");
        }
    }
}
