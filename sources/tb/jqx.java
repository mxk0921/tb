package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jqx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ZIP_COMMENT_TTID_TYPE = "zipComment";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f22169a = false;
    public static String b;

    static {
        t2o.a(775946338);
    }

    public static final String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87421545", new Object[]{context});
        }
        if (f22169a) {
            return b;
        }
        synchronized (jqx.class) {
            try {
                if (f22169a) {
                    return b;
                }
                JSONObject b2 = pqx.b(context);
                b2.toString();
                String optString = b2.optString("t");
                if (!TextUtils.isEmpty(optString)) {
                    String a2 = isq.a(optString, "Y9RxCqWwTJeLK3n7DkLoR5JcDonJfYsr");
                    b = a2;
                    if (a2 != null) {
                        b = a2.trim();
                    }
                }
                f22169a = true;
                return b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
