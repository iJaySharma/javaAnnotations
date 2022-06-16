import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ThinkingMachines
{

}
@ThinkingMachines
class abcd
{

}
class pqrs
{

}
class psp
{
public static void main(String gg[])
{
Class a=abcd.class; // Class a=Class.forName("abcd");
Class p=pqrs.class; // Class p=Class.forName("pqrs");
Annotation aa=a.getAnnotation(ThinkingMachines.class);
System.out.println(aa);
Annotation pp=p.getAnnotation(ThinkingMachines.class);
System.out.println(pp);

}
}