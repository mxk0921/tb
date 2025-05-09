package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBottomH5Fragment;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bza implements z1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public bza(HomeBottomH5Fragment homeBottomH5Fragment) {
    }

    @Override // tb.z1e
    public void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10db17d0", new Object[]{this, str, str2, hashMap});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", hashMap).build());
        }
    }

    @Override // tb.z1e
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686d1575", new Object[]{this, str, str2, str3});
        } else {
            TLog.loge(str, str2, str3);
        }
    }

    @Override // tb.z1e
    public void c(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19d48be", new Object[]{this, str, str2, hashMap});
            return;
        }
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str, "Button-" + str2);
        uTHitBuilders$UTControlHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
    }
}
