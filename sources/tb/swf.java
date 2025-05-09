package tb;

import com.nirvana.tools.jsoner.JsonHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class swf<T> {
    private Constructor mConstructor;
    private Class<? super T> mGenericsClz;

    public static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return JsonHelper.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    private void setup() {
        Class<? super T> cls = (Class<? super T>) JsonHelper.e(getSuperclassTypeParameter(getClass()));
        this.mGenericsClz = cls;
        if (cls != null) {
            try {
                this.mConstructor = cls.getDeclaredConstructor(new Class[0]);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalArgumentException("JsonType's generics is not recognizable!");
        }
    }

    public T newInstance() {
        if (this.mConstructor == null) {
            setup();
        }
        Constructor constructor = this.mConstructor;
        if (constructor == null) {
            return null;
        }
        try {
            constructor.setAccessible(true);
            return (T) this.mConstructor.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
