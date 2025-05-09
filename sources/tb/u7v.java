package tb;

import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class u7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f29214a = null;

    static {
        t2o.a(794820635);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("571d3b83", new Object[0])).booleanValue();
        }
        Boolean bool = f29214a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
        } catch (Exception e) {
            tcu.p(wh8.j("ultron").l("isTaobaoError").p(e.getMessage()));
            f29214a = Boolean.TRUE;
        }
        if (GlobalAppRuntimeInfo.getContext() == null) {
            return true;
        }
        f29214a = Boolean.valueOf("com.taobao.taobao".equals(GlobalAppRuntimeInfo.getContext().getApplicationInfo().packageName));
        return f29214a.booleanValue();
    }
}
