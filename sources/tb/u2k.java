package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class u2k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final u2k INSTANCE = new u2k();

    @JvmStatic
    public static final void a(String str, String str2, long j, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0137a0", new Object[]{str, str2, new Long(j), map});
            return;
        }
        ckf.g(str, "code");
        ckf.g(str2, "message");
        try {
            RVLLevel rVLLevel = RVLLevel.Error;
            if (TextUtils.isEmpty(str)) {
                str = "common";
            }
            icn l = lcn.a(rVLLevel, "NextRPC/".concat(str)).l(rVLLevel);
            if (j <= 0) {
                l.n(System.currentTimeMillis());
            } else {
                l.n(j);
            }
            l.a("message", str2);
            l.b(map);
            l.f();
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void b(String str, String str2, long j, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be7bec2", new Object[]{str, str2, new Long(j), map, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            j = System.currentTimeMillis();
        }
        if ((i & 8) != 0) {
            map = null;
        }
        a(str, str2, j, map);
    }
}
