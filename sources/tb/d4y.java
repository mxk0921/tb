package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class d4y implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k5y f17583a;

    static {
        t2o.a(499122200);
        t2o.a(613416995);
    }

    public d4y(k5y k5yVar) {
        this.f17583a = k5yVar;
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        try {
            k5y.c(this.f17583a, "normal_switch", OrangeConfig.getInstance().getConfig("keepalive", "normal_switch", "true"));
            k5y.c(this.f17583a, "speed_switch", OrangeConfig.getInstance().getConfig("keepalive", "speed_switch", "true"));
            k5y.c(this.f17583a, "adj_adjust_range", OrangeConfig.getInstance().getConfig("keepalive", "adj_adjust_range", ""));
            k5y.c(this.f17583a, "prevent_rt_kill_receiver_range", OrangeConfig.getInstance().getConfig("keepalive", "prevent_rt_kill_receiver_range", ""));
            k5y.c(this.f17583a, "account_sync_range", OrangeConfig.getInstance().getConfig("keepalive", "account_sync_range", "36-36"));
            k5y.c(this.f17583a, "recent_entrance_range", OrangeConfig.getInstance().getConfig("keepalive", "recent_entrance_range", "38-38"));
            k5y.c(this.f17583a, "reduce_account_range", OrangeConfig.getInstance().getConfig("keepalive", "reduce_account_range", "39-39"));
            k5y.c(this.f17583a, "prevent_rt_kill_receiver_delay", OrangeConfig.getInstance().getConfig("keepalive", "prevent_rt_kill_receiver_delay", ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE));
            k5y.c(this.f17583a, "r_e_kill_delay", OrangeConfig.getInstance().getConfig("keepalive", "r_e_kill_delay", "2880"));
        } catch (Exception e) {
            pxx.f26392a.d("RemoteConfig", "[onConfigUpdate] error.", null, e);
        }
    }
}
