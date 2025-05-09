package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pa9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T> T a(Object obj, Field field) throws IllegalAccessException {
        field.setAccessible(true);
        return (T) field.get(obj);
    }

    public static boolean b(Object obj, Field field, Object obj2, Object obj3) throws IllegalAccessException {
        if (obj2 == obj3) {
            return false;
        }
        field.setAccessible(true);
        field.set(obj, obj3);
        return true;
    }
}
