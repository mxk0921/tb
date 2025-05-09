package com.alibaba.android.umf;

import com.alibaba.android.umf.node.service.parse.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import tb.c4e;
import tb.d4e;
import tb.exu;
import tb.f4e;
import tb.gz;
import tb.hxu;
import tb.k4e;
import tb.qwu;
import tb.qxu;
import tb.sxu;
import tb.t2o;
import tb.u3e;
import tb.uwu;
import tb.v3e;
import tb.ywu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFCoreUMFServicePluginCenter implements IUMFPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740659);
        t2o.a(79691983);
    }

    @Override // com.alibaba.android.umf.IUMFPluginCenter
    public Map<String, Class<? extends v3e>> extensionImplMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4a7df19", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("umf.ability.impl.render.native.component.creator", exu.class);
        hashMap.put("umf.ability.impl.render.container", hxu.class);
        hashMap.put("umf.ability.impl.render.default.component.creator", ywu.class);
        hashMap.put("umf.ability.impl.adjustRules", qwu.class);
        hashMap.put("umf.ability.impl.render.dx.component.creator", uwu.class);
        return hashMap;
    }

    @Override // com.alibaba.android.umf.IUMFPluginCenter
    public Map<String, AbstractMap.SimpleEntry<String, Class<? extends v3e>>> extensionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b59c5d9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("umf.ability.render.event", new AbstractMap.SimpleEntry("umf.service.render", u3e.class));
        hashMap.put("umf.ability.render.component.creator", new AbstractMap.SimpleEntry("umf.service.render", d4e.class));
        hashMap.put("umf.ability.parse.ext", new AbstractMap.SimpleEntry("umf.service.parse", c4e.class));
        hashMap.put("umf.ability.render.container", new AbstractMap.SimpleEntry("umf.service.render", f4e.class));
        hashMap.put("umf.ability.rule.common", new AbstractMap.SimpleEntry("umf.service.rule", k4e.class));
        return hashMap;
    }

    @Override // com.alibaba.android.umf.IUMFPluginCenter
    public Map<String, Class<? extends gz>> serviceMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e7e56123", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("umf.service.parse", a.class);
        hashMap.put("umf.service.render", qxu.class);
        hashMap.put("umf.service.rule", sxu.class);
        return hashMap;
    }
}
