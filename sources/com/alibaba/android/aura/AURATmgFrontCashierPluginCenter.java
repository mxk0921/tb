package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.al1;
import tb.bl1;
import tb.ghl;
import tb.gn;
import tb.lbb;
import tb.ogl;
import tb.pgl;
import tb.qgl;
import tb.t2o;
import tb.zab;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURATmgFrontCashierPluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(860880897);
    }

    public static /* synthetic */ Object ipc$super(AURATmgFrontCashierPluginCenter aURATmgFrontCashierPluginCenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/AURATmgFrontCashierPluginCenter");
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter
    public Map<String, Class<? extends zab>> branchConditionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df0580bf", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("albbcashier.condition.frontCashier.autoOpenCashier", bl1.class);
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends lbb>> extensionImplMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4a7df19", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("albbcashier.impl.aspect.lifecycle.event.monitor", ogl.class);
        hashMap.put("albbcashier.impl.parse.stateTree.preRender", pgl.class);
        hashMap.put("albbcashier.impl.submit.result.monitor", al1.class);
        hashMap.put("overseabuy.impl.response.monitor", qgl.class);
        hashMap.put("overseabuy.impl.nextrpc.attacch.response", ghl.class);
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
