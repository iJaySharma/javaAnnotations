import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ThinkingMachines
{
public int value();
}
@ThinkingMachines(100)
class abcd
{

}
class psp
{
public static void main(String gg[])
{
Class a=abcd.class; // Class a=Class.forName("abcd");
Annotation aa=a.getAnnotation(ThinkingMachines.class);
if(aa!=null)
{
ThinkingMachines tm=(ThinkingMachines)aa;
System.out.println(tm.value());
}
}
}