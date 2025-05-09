package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.alibaba.android.aura.service.nextrpc.extension.IAURANextRPCPrefetchExtension;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bi;
import tb.bn;
import tb.c4e;
import tb.ccb;
import tb.dcb;
import tb.dl;
import tb.gn;
import tb.ibb;
import tb.icb;
import tb.jbb;
import tb.jcb;
import tb.kcb;
import tb.lbb;
import tb.lcb;
import tb.mt;
import tb.ncb;
import tb.pm;
import tb.qbb;
import tb.qt;
import tb.ri;
import tb.t2o;
import tb.tcb;
import tb.tk;
import tb.ucb;
import tb.uf;
import tb.vbb;
import tb.vh;
import tb.wbb;
import tb.xg;
import tb.zab;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURACoreUMFServicePluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740353);
    }

    public static /* synthetic */ Object ipc$super(AURACoreUMFServicePluginCenter aURACoreUMFServicePluginCenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/AURACoreUMFServicePluginCenter");
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
        hashMap.put("aura.impl.render.component.creator.default", vh.class);
        hashMap.put("aura.impl.event.adjustRules", uf.class);
        hashMap.put("aura.impl.render.component.creator.dividerLine", bi.class);
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, AbstractMap.SimpleEntry<String, Class<? extends lbb>>> extensionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b59c5d9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aura.extension.event#1", new AbstractMap.SimpleEntry(ri.CODE, ibb.class));
        hashMap.put("aura.extension.parse.renderTreeFilter#1", new AbstractMap.SimpleEntry(dl.PARSE_SERVICE_CODE, ccb.class));
        hashMap.put("aura.extension.render.scroll#1", new AbstractMap.SimpleEntry(pm.RENDER_SERVICE_CODE, tcb.class));
        hashMap.put("aura.extension.render#1", new AbstractMap.SimpleEntry(pm.RENDER_SERVICE_CODE, ncb.class));
        hashMap.put("aura.extension.render.component.creator#1", new AbstractMap.SimpleEntry(pm.RENDER_SERVICE_CODE, jcb.class));
        hashMap.put("aura.extension.nextrpc.prefetch#1", new AbstractMap.SimpleEntry(tk.NEXT_RPC_SERVICE_CODE, IAURANextRPCPrefetchExtension.class));
        hashMap.put("aura.extension.render#2", new AbstractMap.SimpleEntry(pm.RENDER_SERVICE_CODE, ucb.class));
        hashMap.put("aura.extension.nextrpc.stream.handler#1", new AbstractMap.SimpleEntry(tk.NEXT_RPC_SERVICE_CODE, qt.class));
        hashMap.put("aura.extension.event.redirect#1", new AbstractMap.SimpleEntry(ri.CODE, jbb.class));
        hashMap.put("aura.extension.parse.ext#1", new AbstractMap.SimpleEntry(dl.PARSE_SERVICE_CODE, c4e.class));
        hashMap.put("aura.extension.nextrpc#1", new AbstractMap.SimpleEntry(tk.NEXT_RPC_SERVICE_CODE, vbb.class));
        hashMap.put("aura.extension.parse.stateTree#1", new AbstractMap.SimpleEntry(dl.PARSE_SERVICE_CODE, dcb.class));
        hashMap.put("aura.extension.rule.localAdjust#1", new AbstractMap.SimpleEntry("umf.service.rule", qbb.class));
        hashMap.put("aura.extension.render.canScroll#1", new AbstractMap.SimpleEntry(pm.RENDER_SERVICE_CODE, icb.class));
        hashMap.put("aura.extension.component.lifeCycle#1", new AbstractMap.SimpleEntry(pm.RENDER_SERVICE_CODE, kcb.class));
        hashMap.put("aura.extension.component.lifeCycle#2", new AbstractMap.SimpleEntry(pm.RENDER_SERVICE_CODE, lcb.class));
        hashMap.put("aura.extension.render.freeNode#1", new AbstractMap.SimpleEntry(pm.RENDER_SERVICE_CODE, mt.class));
        hashMap.put("aura.extension.nextrpc.handle#1", new AbstractMap.SimpleEntry(tk.NEXT_RPC_SERVICE_CODE, wbb.class));
        return Collections.unmodifiableMap(hashMap);
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
        HashMap hashMap = new HashMap();
        hashMap.put(bn.CODE, bn.class);
        hashMap.put("aura.service.cache", xg.class);
        hashMap.put(tk.NEXT_RPC_SERVICE_CODE, tk.class);
        hashMap.put(pm.RENDER_SERVICE_CODE, pm.class);
        hashMap.put(ri.CODE, ri.class);
        hashMap.put(dl.PARSE_SERVICE_CODE, dl.class);
        return Collections.unmodifiableMap(hashMap);
    }
}
