package tb;

import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class v7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f29844a = null;

    static {
        t2o.a(83886321);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("571d3b83", new Object[0])).booleanValue();
        }
        Boolean bool = f29844a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
        } catch (Exception e) {
            f9v.q(xh8.a("ultron").c("isTaobaoError").message(e.getMessage()));
            f29844a = Boolean.TRUE;
        }
        if (GlobalAppRuntimeInfo.getContext() == null) {
            return true;
        }
        f29844a = Boolean.valueOf("com.taobao.taobao".equals(GlobalAppRuntimeInfo.getContext().getApplicationInfo().packageName));
        return f29844a.booleanValue();
    }
}
