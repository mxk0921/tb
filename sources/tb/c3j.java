package tb;

import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c3j {
    public static final String TAG = "MSP-LOG-SDK-";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16818a;
    public static final i27 b = new i27();

    static {
        t2o.a(253755431);
        g();
    }

    public static void a(String str, String str2) {
        if (d()) {
            b.a(TAG + str, str2);
        }
    }

    public static void b(String str, String str2) {
        b.b(TAG + str, str2);
    }

    public static void c(String str, Throwable th) {
        b.b(TAG + str, e(th));
    }

    public static boolean d() {
        return f16818a;
    }

    public static String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    public static void f(String str, String str2) {
        b.d(TAG + str, str2);
    }

    public static void g() {
        boolean parseBoolean = Boolean.parseBoolean(swx.b("persist.sys.assert.panic", "false"));
        boolean parseBoolean2 = Boolean.parseBoolean(swx.b("persist.sys.assert.enable", "false"));
        if (parseBoolean || parseBoolean2) {
            f16818a = true;
        }
        f(TAG, "isDebug=false ,IS_SYSOPEN=" + f16818a);
    }

    public static void h(String str, Exception exc) {
        b.e(TAG + str, e(exc));
    }
}
