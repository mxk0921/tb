package tb;

import android.app.Activity;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ek1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUTH_BROWSER = "auth_browser";
    public static final String AUTH_INNER = "auth_inner";
    public static final String BAICHUAN_SKIP = "sso_auth";
    public static final String QUESTION = "?";

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a6a72c", new Object[]{activity});
        } else {
            Toast.makeText(activity, "非法的回调地址", 0).show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01d8 A[Catch: all -> 0x0105, Exception -> 0x0139, TRY_LEAVE, TryCatch #1 {all -> 0x0105, blocks: (B:19:0x00b9, B:20:0x00ec, B:22:0x00f6, B:24:0x00fa, B:37:0x0122, B:40:0x013e, B:41:0x0151, B:42:0x01a2, B:43:0x01ac, B:45:0x01d8), top: B:92:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(java.lang.String r20, android.app.Activity r21) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ek1.b(java.lang.String, android.app.Activity):void");
    }
}
