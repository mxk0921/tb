package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class was {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ImageUtil";

    /* renamed from: a  reason: collision with root package name */
    public static final String f30572a = "data:image/gif;base64,";
    public static final String b = "data:image/png;base64,";
    public static final String c = "data:image/jpeg;base64,";
    public static final String d = "data:image/x-icon;base64,";

    static {
        t2o.a(849346571);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9b681ab", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.startsWith(f30572a) && !str.startsWith(b) && !str.startsWith(c) && !str.startsWith(d)) {
            return false;
        }
        return true;
    }
}
