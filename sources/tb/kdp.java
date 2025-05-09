package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.service.ServiceImpl;
import java.lang.reflect.Constructor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kdp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705569);
    }

    public static <T> T a(Class<T> cls, Object... objArr) {
        int i;
        Constructor<?> constructor;
        Constructor<?>[] constructors;
        ServiceImpl serviceImpl = (ServiceImpl) cls.getAnnotation(ServiceImpl.class);
        if (serviceImpl != null) {
            try {
                Class<?> cls2 = Class.forName(serviceImpl.value());
                if (objArr == null) {
                    i = 0;
                } else {
                    i = objArr.length;
                }
                Class<?>[] clsArr = new Class[i];
                for (int i2 = 0; i2 < i; i2++) {
                    clsArr[i2] = objArr[i2].getClass();
                }
                if (i == 0) {
                    constructor = cls2.getConstructor(clsArr);
                } else {
                    Constructor<?> constructor2 = null;
                    for (Constructor<?> constructor3 : cls2.getConstructors()) {
                        Class<?>[] parameterTypes = constructor3.getParameterTypes();
                        if (parameterTypes.length == i) {
                            boolean z = true;
                            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                                if (!parameterTypes[i3].isAssignableFrom(clsArr[i3])) {
                                    z = false;
                                }
                            }
                            if (z) {
                                constructor2 = constructor3;
                            }
                        }
                    }
                    constructor = constructor2;
                }
                if (constructor != null) {
                    constructor.setAccessible(true);
                    return (T) constructor.newInstance(objArr);
                }
                throw new NoSuchMethodException("Do you have right constructor with right params input");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Please make sure you have right ServiceImpl annotation, and keep class avoid proguard ", e);
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException("Do you have right constructor with right params input", e2);
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        } else {
            throw new IllegalArgumentException(cls.getName().concat(" must annotate BeanImpl"));
        }
    }
}
