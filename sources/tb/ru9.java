package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ru9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120562);
    }

    public static float a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f571fcf4", new Object[]{str})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        String[] split = str.split(",");
        if (split.length < 2) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(split[1].trim()) / 2.0f;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb38036e", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str) || str.toLowerCase().indexOf("bold") == -1) {
            return 0;
        }
        return 1;
    }
}
