package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wvg implements vvg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093328);
        t2o.a(806355646);
    }

    @Override // tb.vvg
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210dd456", new Object[]{this, str, map});
        } else {
            vkr.d(vx9.d(), str, map);
        }
    }

    @Override // tb.vvg
    public boolean b(ViewGroup viewGroup, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57e31e59", new Object[]{this, viewGroup, str, map})).booleanValue();
        }
        return vkr.f(vx9.d(), viewGroup, str, map);
    }

    @Override // tb.vvg
    public ux9 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("df3e9fab", new Object[]{this});
        }
        return vx9.d();
    }

    @Override // tb.vvg
    public void showShare(Activity activity, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e315412c", new Object[]{this, activity, new Boolean(z), map});
        } else {
            u90.p(activity, z, map);
        }
    }
}
