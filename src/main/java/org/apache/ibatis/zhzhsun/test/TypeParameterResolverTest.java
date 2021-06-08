package org.apache.ibatis.zhzhsun.test;

import org.apache.ibatis.reflection.TypeParameterResolver;

import java.lang.reflect.Type;
import java.util.List;

/**
 * TODO
 *
 * @author SunZhenZhou
 * @date 2021/6/8 20:27
 */
public class TypeParameterResolverTest {

    public static void main(String[] args) throws NoSuchMethodException {
        Type type1 = TypeParameterResolver.resolveReturnType(User.class.getMethod("getInfo"), User.class);
        System.out.println("User类中getInfo方法的输出结果类型：" + type1);

        Type type2 = TypeParameterResolver.resolveReturnType(User.class.getMethod("getInfo"), Student.class);
        System.out.println("Student类中getInfo方法的输出结果类型：" + type2);
    }

}


class User<T> {
    public List<T> getInfo() {
        return null;
    }
}

class Student extends User<Number> {
}
