package tb;

import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eb7 extends owq {
    public static final String API_NAME = "mtop.taobao.wsearch.suggest";
    public static final String API_VERSION = "1.0";

    static {
        t2o.a(815792916);
    }

    public eb7(String str) {
        super("mtop.taobao.wsearch.suggest", "1.0", true, false, "suggest");
        a("area", "active_page");
        a("src", "c2c");
        a(q5c.HISTORY, "off");
        a("action", pg1.ATOM_EXT_del);
        if (!TextUtils.isEmpty(str)) {
            a("q", str);
        }
    }
}
