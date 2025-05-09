package tb;

import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class grr {
    public static final long KEEP_ALIVE_TIME;
    public static final boolean METHOD_TRACE;
    public static final int ORANGE_FAKE;
    public static final int TOTAL_GLOBAL_HANDLER_COUNT;

    static {
        h1r h1rVar = new h1r(lb9.a().b(new File(u9a.a().getFilesDir(), ".orange_fake.txt")));
        ORANGE_FAKE = h1rVar.a("ORANGE_FAKE", -1);
        KEEP_ALIVE_TIME = h1rVar.a("KEEP_ALIVE_TIME", 3000);
        METHOD_TRACE = h1rVar.b("METHOD_TRACE", true);
        TOTAL_GLOBAL_HANDLER_COUNT = h1rVar.a("TOTAL_GLOBAL_HANDLER_COUNT", 1);
    }
}
