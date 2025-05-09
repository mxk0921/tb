package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class k7m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DEVICE_TYPE = "deviceType";
    public static final String KEY_SCREEN_STYLE = "screenStyle";
    public static final String TAG_PREFIX = "AutoSize_";

    /* renamed from: a  reason: collision with root package name */
    public static String f22450a = "";

    static {
        t2o.a(481296406);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37b43413", new Object[0]);
        }
        if (TextUtils.isEmpty(f22450a)) {
            if (caa.s()) {
                f22450a = "foldingmobile";
            } else if (caa.t()) {
                f22450a = "pad";
            } else {
                f22450a = "mobile";
            }
        }
        return f22450a;
    }
}
