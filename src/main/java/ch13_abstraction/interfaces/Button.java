package ch13_abstraction.interfaces;
/*
    클래스는 단일 상속만 가능한데, 키워드는 extends
    인터페이스는 다중 상속(구현)이 가능합니다. 키워드는 implements
 */
// 추상 메서드가 하나라도 있으면 클래스도 추상 클래스로 바껴야함
public abstract class Button implements Press, Up, Down{
    @Override
    public void onDown() {} // 일반 메서드입니다. {}가 있으니까. 근데 안에 아무것도 안 써놨습니다.

    @Override
    public abstract void onPressed(); // 얘는 추상 메서드로 만들겁니다.

    @Override
    public String onUp() {
        return " 올립니다.";
    }
}
