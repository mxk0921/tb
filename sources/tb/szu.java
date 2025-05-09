package tb;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class szu extends g1v {
    static {
        t2o.a(962593150);
    }

    public szu(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        if (!hsq.f(str)) {
            super.setProperty(g1v.FIELD_PAGE, str);
        }
        super.setProperty(g1v.FIELD_EVENT_ID, String.valueOf(i));
        if (!hsq.f(str2)) {
            super.setProperty(g1v.FIELD_ARG1, str2);
        }
        if (!hsq.f(str3)) {
            super.setProperty(g1v.FIELD_ARG2, str3);
        }
        if (!hsq.f(str4)) {
            super.setProperty(g1v.FIELD_ARG3, str4);
        }
        super.setProperties(map);
    }
}
