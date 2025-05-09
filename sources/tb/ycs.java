package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ycs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TMSSessionUtils";
    public static final ycs INSTANCE = new ycs();

    /* renamed from: a  reason: collision with root package name */
    public static String f31991a = "";

    static {
        t2o.a(839909978);
    }

    @JvmStatic
    public static final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e5a7bec", new Object[]{str});
        }
        try {
            String c = c("");
            if (q9s.u(str) && !TextUtils.isEmpty(c)) {
                String uri = ies.g(str).buildUpon().appendQueryParameter("tms_session_id", f31991a).build().toString();
                ckf.f(uri, "targetUri.buildUpon().ap…ionId).build().toString()");
                TMSLogger.b("sessionId", ckf.p("newUrl is: ", uri));
                return uri;
            }
            return str;
        } catch (Exception e) {
            TMSLogger.b(TAG, ckf.p("addUrlSessionId error: ", e.getMessage()));
            return str;
        }
    }

    @JvmStatic
    public static final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c09d110b", new Object[0]);
        } else {
            f31991a = "";
        }
    }

    @JvmStatic
    public static final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d098253", new Object[]{str});
        }
        ckf.g(str, "utdid");
        if (!TextUtils.isEmpty(f31991a)) {
            return f31991a;
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String o = o9s.o(ckf.p(str, Long.valueOf(System.currentTimeMillis())));
        ckf.f(o, "stringToMD5(utdid + System.currentTimeMillis())");
        f31991a = o;
        return o;
    }
}
