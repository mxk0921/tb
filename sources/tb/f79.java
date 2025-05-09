package tb;

import java.lang.reflect.Constructor;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class f79 {
    public static final long DISABLE_UNSAFE = 36028797018963968L;
    public static final long FIELD_MASK = 4503599627370496L;
    public static final long RAW_VALUE_MASK = 1125899906842624L;
    public static final long READ_ONLY = 72057594037927936L;
    public static final long READ_USING_MASK = 2251799813685248L;
    public static final long UNWRAPPED_MASK = 562949953421312L;
    public static final long VALUE_MASK = 281474976710656L;

    /* renamed from: a  reason: collision with root package name */
    public String f19065a;
    public String b;
    public String c;
    public int d;
    public long e;
    public boolean f;
    public String[] g;
    public Class<?> h;
    public Class<?> i;
    public boolean j;
    public String k;
    public Locale l;

    public jdk a() {
        Class<?> cls = this.i;
        if (cls != null && jdk.class.isAssignableFrom(cls)) {
            try {
                Constructor<?> declaredConstructor = this.i.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return (jdk) declaredConstructor.newInstance(new Object[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void b() {
        this.f19065a = null;
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = 0L;
        this.f = false;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = false;
        this.k = null;
        this.l = null;
    }
}
