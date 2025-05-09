package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.waitpay.extension.TBBuyRegisterRefreshExtension;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.d8r;
import tb.ezr;
import tb.fzr;
import tb.gn;
import tb.gzr;
import tb.izr;
import tb.kzr;
import tb.lbb;
import tb.nzr;
import tb.ozr;
import tb.szr;
import tb.t2o;
import tb.tzr;
import tb.uzr;
import tb.vzr;
import tb.zab;
import tb.zzr;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURATaobaoWaitPayDetailPluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(725614593);
    }

    public static /* synthetic */ Object ipc$super(AURATaobaoWaitPayDetailPluginCenter aURATaobaoWaitPayDetailPluginCenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/AURATaobaoWaitPayDetailPluginCenter");
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter
    public Map<String, Class<? extends zab>> branchConditionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df0580bf", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends lbb>> extensionImplMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4a7df19", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tbwaitpay.impl.render.creator.freeNode.actionBar", ezr.class);
        hashMap.put("tbwaitpay.impl.event.refresh", vzr.class);
        hashMap.put("tbwaitpay.impl.popupWindow.ext", szr.class);
        hashMap.put("tbwaitpay.impl.render.recyclerView.provider", uzr.class);
        hashMap.put("tbwaitpay.impl.submit.linkage.config", zzr.class);
        hashMap.put("tbwaitpay.impl.aspect.error.downgrade", d8r.class);
        hashMap.put("tbwaitpay.impl.event.submit.business.default", ozr.class);
        hashMap.put("tbwaitpay.impl.aspect.error.submit", nzr.class);
        hashMap.put("tbwaitpay.impl.aspect.error.build", izr.class);
        hashMap.put("tbwaitpay.impl.lifecycle.dxEngine.config", kzr.class);
        hashMap.put("tbwaitpay.impl.event.registerNotify", TBBuyRegisterRefreshExtension.class);
        hashMap.put("tbwaitpay.impl.aspect.error.adjust", gzr.class);
        hashMap.put("tbwaitpay.impl.render.component.creator.recommend", tzr.class);
        hashMap.put("tbwaitpay.impl.linkage.adjust.config", fzr.class);
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, AbstractMap.SimpleEntry<String, Class<? extends lbb>>> extensionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b59c5d9", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<Class, List<Class<? extends IAURAInputField>>> inputFieldsTargetClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("994890c0", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends gn>> serviceMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e7e56123", new Object[]{this});
        }
        return null;
    }
}
