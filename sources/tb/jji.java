package tb;

import android.content.Context;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jji {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            }
        }
    }

    public static void a(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27837b12", new Object[]{context, map});
            return;
        }
        AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(new zq(c9x.CART_BIZ_NAME, "cart").a(context));
        HashMap hashMap = new HashMap();
        hashMap.put("bizId", c9x.CART_BIZ_NAME);
        hashMap.put("eventName", "cartRefreshData");
        hashMap.put("isOpenCart", Boolean.TRUE);
        if (map != null) {
            hashMap.put("detail", map);
        }
        abilityHubAdapter.j("broadcast", "dispatchEvent", new xq().p(null), hashMap, new a());
    }
}
