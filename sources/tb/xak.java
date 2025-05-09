package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378904);
    }

    public static float a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1646a52a", new Object[]{str})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    public static long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6eaba914", new Object[]{str})).longValue();
        }
        if (!TextUtils.isDigitsOnly(str)) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return -1L;
        }
    }
}
