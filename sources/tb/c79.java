package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.lang.reflect.Method;
import tb.hdv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c79<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile T f16899a;
    public volatile Class<T> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a<V> {
    }

    public c79(Class<T> cls) {
        this.b = cls;
    }

    public static <T> T b(Class<T> cls) {
        String str;
        String name = cls.getName();
        if (name.endsWith("Interface")) {
            str = name.replace("Interface", "Imp");
        } else {
            str = name.concat("Imp");
        }
        try {
            Class<?> cls2 = Class.forName(str);
            try {
                Method declaredMethod = cls2.getDeclaredMethod("getInstance", new Class[0]);
                if (declaredMethod != null) {
                    return (T) declaredMethod.invoke(null, new Object[0]);
                }
                return null;
            } catch (Exception unused) {
                PrintStream printStream = System.out;
                printStream.println("UmbrellaServiceFetcher, error when use getInstance() -> " + str + "interface name = " + name);
                try {
                    return (T) cls2.newInstance();
                } catch (Exception unused2) {
                    PrintStream printStream2 = System.out;
                    printStream2.println("UmbrellaServiceFetcher, error when use constructor -> " + str + "interface name = " + name);
                    return null;
                }
            }
        } catch (Exception unused3) {
            PrintStream printStream3 = System.out;
            printStream3.println("UmbrellaServiceFetcher, error when Class.forName(" + str + "), interface name = " + name);
            return null;
        }
    }

    public T a(a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("24d1963e", new Object[]{this, aVar});
        }
        if (this.f16899a == null) {
            synchronized (c79.class) {
                try {
                    if (this.f16899a == null) {
                        this.f16899a = (T) b(this.b);
                        if (this.f16899a == null) {
                            this.f16899a = (T) ((hdv.a) aVar).b();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f16899a;
    }
}
