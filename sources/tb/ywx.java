package tb;

import android.text.TextUtils;
import com.nirvana.tools.jsoner.JsonerTag;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ywx {

    /* renamed from: a  reason: collision with root package name */
    public final String f32399a;
    public final Class<?> b;
    public final boolean c;

    public ywx(Field field) {
        JsonerTag jsonerTag = (JsonerTag) field.getAnnotation(JsonerTag.class);
        if (jsonerTag != null) {
            this.f32399a = jsonerTag.keyName();
            this.c = jsonerTag.isExcluded();
        }
        if (TextUtils.isEmpty(this.f32399a)) {
            this.f32399a = field.getName();
        }
        this.b = field.getType();
    }

    public static boolean b(Class<?> cls) {
        if (Integer.TYPE.equals(cls) || Integer.class.equals(cls) || int[].class.equals(cls) || Integer[].class.equals(cls) || Short.TYPE.equals(cls) || Short.class.equals(cls) || short[].class.equals(cls) || Short[].class.equals(cls) || Long.TYPE.equals(cls) || Long.class.equals(cls) || long[].class.equals(cls) || Long[].class.equals(cls) || Float.TYPE.equals(cls) || Float.class.equals(cls) || float[].class.equals(cls) || Float[].class.equals(cls) || Double.TYPE.equals(cls) || Double.class.equals(cls) || double[].class.equals(cls) || Double[].class.equals(cls)) {
            return true;
        }
        return false;
    }

    public static boolean d(Class<?> cls) {
        if (String.class.equals(cls) || StringBuilder.class.equals(cls) || String[].class.equals(cls) || StringBuilder[].class.equals(cls) || StringBuffer.class.equals(cls) || CharSequence.class.equals(cls) || StringBuffer[].class.equals(cls) || CharSequence[].class.equals(cls)) {
            return true;
        }
        return false;
    }

    public static boolean e(Class<?> cls) {
        if (Byte.TYPE.equals(cls) || Byte.class.equals(cls) || byte[].class.equals(cls) || Byte[].class.equals(cls) || Character.TYPE.equals(cls) || Character.class.equals(cls) || char[].class.equals(cls) || Character[].class.equals(cls)) {
            return true;
        }
        return false;
    }

    public static boolean f(Class<?> cls) {
        if (Boolean.TYPE.equals(cls) || Boolean.class.equals(cls) || boolean[].class.equals(cls) || Boolean[].class.equals(cls)) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        Class<?> cls = this.b;
        if (f(cls) || e(cls) || b(cls) || d(cls)) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        Class<?>[] interfaces = this.b.getInterfaces();
        if (interfaces != null && interfaces.length > 0) {
            for (Class<?> cls : interfaces) {
                if (cls == pxf.class) {
                    return true;
                }
            }
        }
        return false;
    }
}
