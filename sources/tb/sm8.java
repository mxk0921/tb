package tb;

import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class sm8 {
    public static void a(Throwable th, Throwable th2) {
        ckf.g(th, "<this>");
        ckf.g(th2, "exception");
        if (th != th2) {
            d5m.IMPLEMENTATIONS.a(th, th2);
        }
    }

    public static String b(Throwable th) {
        ckf.g(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        ckf.f(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
