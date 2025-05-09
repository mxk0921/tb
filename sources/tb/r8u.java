package tb;

import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class r8u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Trace";

    /* renamed from: a  reason: collision with root package name */
    public static long f27197a;
    public static Method b;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5235938d", new Object[]{str});
        } else {
            s8u.a(str);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcca111", new Object[0]);
        } else {
            s8u.b();
        }
    }

    public static void c(String str, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95bd3b2e", new Object[]{str, exc});
        } else if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        } else {
            StringBuilder sb = new StringBuilder("Unable to call ");
            sb.append(str);
            sb.append(" via reflection");
        }
    }

    public static boolean d() {
        boolean isEnabled;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[0])).booleanValue();
        }
        try {
            if (b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    public static boolean e() {
        try {
            if (b == null) {
                f27197a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(f27197a))).booleanValue();
        } catch (Exception e) {
            c("isTagEnabled", e);
            return false;
        }
    }
}
