package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.a;
import com.taobao.tao.navigation.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s74 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f27839a = -4;

    static {
        t2o.a(1032847442);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        if (f27839a < 0) {
            f27839a = c21.g().getInt("deviceLevel", -1);
        }
        return f27839a;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("378ae883", new Object[0])).booleanValue();
        }
        b r = a.r(a68.TAG);
        if (r == null) {
            TLog.loge("tab3edlp", "isEDLPUser navigationTab error");
        }
        return r != null && TextUtils.equals(r.e(), a68.TAG);
    }
}
