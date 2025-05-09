package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.extension.ability.validate.AlibuyValidateExtension;
import com.taobao.android.buy.module.scrollbar.extension.AliBuyScrollbarCreatorExtension;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.am0;
import tb.bm0;
import tb.cm0;
import tb.cn0;
import tb.co0;
import tb.dm0;
import tb.dn0;
import tb.em0;
import tb.en0;
import tb.eo0;
import tb.fo0;
import tb.gn;
import tb.go0;
import tb.hn0;
import tb.ho0;
import tb.in0;
import tb.jn0;
import tb.kn0;
import tb.lbb;
import tb.lo0;
import tb.mm0;
import tb.mn0;
import tb.mo0;
import tb.no0;
import tb.oo0;
import tb.pn0;
import tb.po0;
import tb.qm0;
import tb.qn0;
import tb.ro0;
import tb.t2o;
import tb.tn0;
import tb.vn0;
import tb.wm0;
import tb.wn0;
import tb.xm0;
import tb.yl0;
import tb.ym0;
import tb.zab;
import tb.zl0;
import tb.zm0;
import tb.zr0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURAAliBuyCorePluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989889);
    }

    public static /* synthetic */ Object ipc$super(AURAAliBuyCorePluginCenter aURAAliBuyCorePluginCenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/AURAAliBuyCorePluginCenter");
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
        hashMap.put("alibuy.impl.nextrpc.prefetch", mn0.class);
        hashMap.put("alibuy.impl.event.openurl.native.params.addAddress", dn0.class);
        hashMap.put("alibuy.impl.render.performance.jsTracker", tn0.class);
        hashMap.put("alibuy.impl.event.userTrack.pageInfo", ro0.class);
        hashMap.put("alibuy.impl.event.executeAbility.callBack.noAddress", qm0.class);
        hashMap.put("alibuy.impl.render.scroll", wn0.class);
        hashMap.put("alibuy.impl.lifecycle.reset.state", xm0.class);
        hashMap.put("alibuy.impl.aspect.lifecycle.skeleton", co0.class);
        hashMap.put("alibuy.impl.event.bubble", dm0.class);
        hashMap.put("alibuy.impl.event.addAddress", yl0.class);
        hashMap.put("alibuy.impl.event.handler.popupWindow.stream", zm0.class);
        hashMap.put("alibuy.impl.component.userMonitor", po0.class);
        hashMap.put("alibuy.impl.aspect.performance.jsTracker", in0.class);
        hashMap.put("alibuy.impl.render.component.creator.scrollbar", AliBuyScrollbarCreatorExtension.class);
        hashMap.put("alibuy.impl.nextrpc.passParams", hn0.class);
        hashMap.put("alibuy.impl.aspect.lifecycle.fullScreen.loading", am0.class);
        hashMap.put("alibuy.impl.aspect.lifecycle.loading", bm0.class);
        hashMap.put("alibuy.impl.parse.protocol.verify", qn0.class);
        hashMap.put("alibuy.impl.aspect.error.submit", lo0.class);
        hashMap.put("alibuy.impl.aspect.lifecycle.dxDownload.monitor", mm0.class);
        hashMap.put("alibuy.impl.autoTrack.config", cm0.class);
        hashMap.put(cn0.CODE, cn0.class);
        hashMap.put("alibuy.impl.nextrpc.monitor", vn0.class);
        hashMap.put("alibuy.impl.performance.customStage.containerTime", jn0.class);
        hashMap.put("alibuy.impl.submit.result.handler", oo0.class);
        hashMap.put("alibuy.impl.rule.localAdjust.validateData", zr0.class);
        hashMap.put("alibuy.impl.event.adjust.cache", fo0.class);
        hashMap.put("alibuy.impl.event.validateData", AlibuyValidateExtension.class);
        hashMap.put("alibuy.impl.lifecycle.dxEngine.config", wm0.class);
        hashMap.put("alibuy.impl.popupWindow.ext", kn0.class);
        hashMap.put("alibuy.impl.event.openurl.native.params.changeAddress", en0.class);
        hashMap.put("alibuy.impl.nextrpc.protocol.cache", pn0.class);
        hashMap.put("alibuy.impl.linkage.adjust.config", ym0.class);
        hashMap.put("alibuy.impl.aspect.error.alarm.monitor.handler", zl0.class);
        hashMap.put("alibuy.impl.parse.stateTree.ccrc", em0.class);
        hashMap.put("alibuy.impl.nextrpc.stream.handler", go0.class);
        hashMap.put("alibuy.impl.linkage.adjust.streamResponse", eo0.class);
        hashMap.put("alibuy.impl.event.submit.business.default", no0.class);
        hashMap.put("alibuy.impl.aspect.lifecycle.stream", ho0.class);
        hashMap.put("alibuy.impl.submit.linkage.config", mo0.class);
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
