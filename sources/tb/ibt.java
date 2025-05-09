package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ibt implements azd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Map<String, String> CLASS_MAPPING;
    public static final String TAG = "AbilityCompontent";

    /* renamed from: a  reason: collision with root package name */
    public Map<OpenAbilityCompontentTypeEnum, sxk> f21218a = new HashMap();

    public ibt a(jbt jbtVar) {
        Map<String, Object> map;
        this.f21218a = new txk().a(jbtVar);
        if (!(jbtVar == null || (map = jbtVar.f) == null || !nqo.b())) {
            String str = CLASS_MAPPING.get(yqq.g(map.get("OpenWatchType")));
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f21218a = (Map) Class.forName(str).getMethod("customizedPluginMap", Map.class, Map.class).invoke(null, this.f21218a, map);
                } catch (Exception e) {
                    Log.e(TAG, "createComponentWithContext", e);
                }
            }
        }
        return this;
    }

    public sxk b(OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxk) ipChange.ipc$dispatch("6975a698", new Object[]{this, openAbilityCompontentTypeEnum});
        }
        Map<OpenAbilityCompontentTypeEnum, sxk> map = this.f21218a;
        if (map != null) {
            return map.get(openAbilityCompontentTypeEnum);
        }
        return null;
    }

    public Object c(OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum) {
        sxk sxkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("710a798", new Object[]{this, openAbilityCompontentTypeEnum});
        }
        Map<OpenAbilityCompontentTypeEnum, sxk> map = this.f21218a;
        if (map == null || (sxkVar = map.get(openAbilityCompontentTypeEnum)) == null) {
            return null;
        }
        return sxkVar.c;
    }

    public boolean d(OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum) {
        sxk sxkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a714e6c9", new Object[]{this, openAbilityCompontentTypeEnum})).booleanValue();
        }
        Map<OpenAbilityCompontentTypeEnum, sxk> map = this.f21218a;
        if (map == null || (sxkVar = map.get(openAbilityCompontentTypeEnum)) == null) {
            return false;
        }
        return sxkVar.b;
    }

    static {
        t2o.a(779093043);
        t2o.a(806355750);
        HashMap hashMap = new HashMap();
        CLASS_MAPPING = hashMap;
        hashMap.put("tab2", "com.taobao.android.tab2liveroom.liveroom.plugins.SubLiveAbilityCostomizedPlugin");
        hashMap.put("shop2F", "com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent");
    }
}
