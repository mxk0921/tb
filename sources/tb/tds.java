package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tds {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TypeUtils";

    static {
        t2o.a(849346579);
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6eaba914", new Object[]{str})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable th) {
            Log.e(TAG, "parse long exception.", th);
            return 0L;
        }
    }
}
