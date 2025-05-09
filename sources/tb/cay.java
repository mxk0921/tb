package tb;

import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cay {
    public static cay e;

    /* renamed from: a  reason: collision with root package name */
    public String f16953a = "";
    public String b = "";
    public String c = "";
    public String d = "";

    public static cay a() {
        cay yayVar;
        if (e == null) {
            if (Locale.getDefault().toString().startsWith("zh")) {
                yayVar = new may();
            } else {
                yayVar = new yay();
            }
            e = yayVar;
        }
        return e;
    }
}
