package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lh4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lh4 INSTANCE = new lh4();

    static {
        t2o.a(998244354);
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71766d0f", new Object[0])).booleanValue();
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("app_dev_tools", "enable", "true"));
    }
}
