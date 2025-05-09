package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.alibaba.android.aura.taobao.adapter.extension.completeExposure.AURAExposureCompleteItemEventTriggerExtension;
import com.alibaba.android.aura.taobao.adapter.extension.event.locator.AURALocatorEvent;
import com.alibaba.android.aura.taobao.adapter.extension.event.locator.a;
import com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.AURAOpenUrlEvent;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.aura.taobao.adapter.extension.monitor.extension.impl.AURAAlarmMonitorSliceSliceExtensions;
import com.alibaba.android.aura.taobao.adapter.extension.performance.AURARenderPerformanceExtension;
import com.alibaba.android.aura.taobao.adapter.extension.tinct.AURAUserMarkTinctExtension;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.adb;
import tb.aj;
import tb.bdb;
import tb.bg;
import tb.bk;
import tb.bt;
import tb.cbb;
import tb.co;
import tb.dbb;
import tb.ddb;
import tb.dg;
import tb.edb;
import tb.eg;
import tb.fcb;
import tb.fg;
import tb.gcb;
import tb.gj;
import tb.gk;
import tb.gn;
import tb.go;
import tb.gs;
import tb.hcb;
import tb.hj;
import tb.hs;
import tb.ht;
import tb.ig;
import tb.ih;
import tb.il;
import tb.in;
import tb.io;
import tb.is;
import tb.jl;
import tb.js;
import tb.kbb;
import tb.kg;
import tb.kh;
import tb.kj;
import tb.kl;
import tb.lbb;
import tb.lg;
import tb.lh;
import tb.ll;
import tb.ml;
import tb.mo;
import tb.ng;
import tb.nl;
import tb.no;
import tb.og;
import tb.ol;
import tb.oo;
import tb.pbb;
import tb.pf;
import tb.pg;
import tb.qg;
import tb.qn;
import tb.qo;
import tb.qs;
import tb.rn;
import tb.rt;
import tb.scb;
import tb.sh;
import tb.si;
import tb.sn;
import tb.ss;
import tb.t2o;
import tb.tab;
import tb.tbb;
import tb.tf;
import tb.tg;
import tb.ti;
import tb.tl;
import tb.to;
import tb.uab;
import tb.uh;
import tb.ui;
import tb.vab;
import tb.vf;
import tb.vi;
import tb.vo;
import tb.vt;
import tb.wcb;
import tb.wf;
import tb.wh;
import tb.wj;
import tb.wk;
import tb.wl;
import tb.wm;
import tb.wo;
import tb.xcb;
import tb.xf;
import tb.xj;
import tb.xo;
import tb.yab;
import tb.ycb;
import tb.yf;
import tb.yj;
import tb.ys;
import tb.zab;
import tb.zbb;
import tb.zcb;
import tb.zh;
import tb.zj;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURATaobaoAdapterPluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81788931);
    }

    public static /* synthetic */ Object ipc$super(AURATaobaoAdapterPluginCenter aURATaobaoAdapterPluginCenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/AURATaobaoAdapterPluginCenter");
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter
    public Map<String, Class<? extends zab>> branchConditionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df0580bf", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aura.condition.debuggable", uh.class);
        hashMap.put("aura.condition.orange", wk.class);
        hashMap.put("aura.condition.deviceEvaluation", wh.class);
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends lbb>> extensionImplMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4a7df19", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aura.impl.aspect.lifecycle.eventTrigger", ti.class);
        hashMap.put("aura.impl.event.locator", AURALocatorEvent.class);
        hashMap.put(kh.EXTENSION_CODE, kh.class);
        hashMap.put("aura.impl.protocolCropper.ultron.adjust", wf.class);
        hashMap.put("aura.impl.component.lifeCycle.asyncModuleEntry.build", ig.class);
        hashMap.put(qn.CODE, qn.class);
        hashMap.put("aura.impl.aspect.lifecycle.logger", eg.class);
        hashMap.put(gj.CODE, gj.class);
        hashMap.put("aura.impl.event.pop", ll.class);
        hashMap.put("aura.impl.aspect.error.alarm.monitor.slice", AURAAlarmMonitorSliceSliceExtensions.class);
        hashMap.put("aura.impl.render.scroll.component.blink", a.class);
        hashMap.put("aura.impl.aspect.lifecycle.protocolCache", fg.class);
        hashMap.put("aura.impl.event.adjust.trigger", vf.class);
        hashMap.put("aura.impl.component.lifeCycle.completeExposure", AURAExposureCompleteItemEventTriggerExtension.class);
        hashMap.put("aura.impl.aspect.error.alarm.monitor.sampling", yf.class);
        hashMap.put("aura.impl.lifecycle.dxEngine.config.autoTrack", qg.class);
        hashMap.put("aura.impl.event.dismissFloat", zh.class);
        hashMap.put("aura.impl.parse.stateTree.container.cache", lh.class);
        hashMap.put("aura.impl.component.userMotion", mo.class);
        hashMap.put("aura.impl.parse.dataRef", sh.class);
        hashMap.put("aura.impl.parse.stateTree.shareContext", in.class);
        hashMap.put("aura.impl.render.scroll.userMotion", oo.class);
        hashMap.put("aura.impl.event.weex2", vo.class);
        hashMap.put(wm.CODE, wm.class);
        hashMap.put("aura.impl.event.quantityChange", tl.class);
        hashMap.put("aura.impl.component.lifeCycle.autoTrack", pg.class);
        hashMap.put(hj.CODE, hj.class);
        hashMap.put("aura.impl.lifeCycle.linkage", yj.class);
        hashMap.put("aura.impl.component.lifeCycle.exposureItem", vi.class);
        hashMap.put("aura.impl.aspect.error.umbrella.monitor", io.class);
        hashMap.put("aura.impl.parse.stateTree.async.component", ng.class);
        hashMap.put("aura.impl.aspect.lifecycle.popupWindow", nl.class);
        hashMap.put("aura.impl.render.component.creator.rax", wl.class);
        hashMap.put("aura.impl.parse.stateTree.linkage", zj.class);
        hashMap.put("aura.impl.rule.localAdjust.writeShareContext", bk.class);
        hashMap.put("aura.impl.parse.stateTree.autoTrack", tg.class);
        hashMap.put("aura.impl.protocolCropper.ultron.submit", sn.class);
        hashMap.put("aura.impl.userMarkTinct", AURAUserMarkTinctExtension.class);
        hashMap.put("aura.impl.aspect.lifecycle.eventTrigger.afterRender", si.class);
        hashMap.put("aura.impl.component.lifeCycle.createItem", ih.class);
        hashMap.put("aura.impl.render.component.creator.weex2", to.class);
        hashMap.put("aura.impl.event.popupWindow", ml.class);
        hashMap.put("aura.impl.parse.stateTree.decrypt", aj.class);
        hashMap.put(xf.AURA_CODE, xf.class);
        hashMap.put("aura.impl.aspect.lifecycle.dxDownload", dg.class);
        hashMap.put("aura.impl.event.adjust.judge.dataChange", wj.class);
        hashMap.put("aura.impl.parse.stateTree.abTest", pf.class);
        hashMap.put("aura.impl.render.component.creator.weex", xo.class);
        hashMap.put("aura.impl.event.executeAbility", ui.class);
        hashMap.put("aura.impl.performance.render", AURARenderPerformanceExtension.class);
        hashMap.put("aura.impl.parse.component.groupSelected", kj.class);
        hashMap.put("aura.impl.aspect.error.logger", bg.class);
        hashMap.put("aura.impl.performance", kl.class);
        hashMap.put("aura.impl.event.submit", AURASubmitEvent.class);
        hashMap.put("aura.impl.event.toast", co.class);
        hashMap.put("aura.impl.render.scroll.async.component", og.class);
        hashMap.put("aura.impl.performance.commonArgs", il.class);
        hashMap.put("aura.impl.component.lifeCycle.userMotion", no.class);
        hashMap.put(AURAOpenUrlEvent.CODE, AURAOpenUrlEvent.class);
        hashMap.put("aura.impl.performance.customStage", jl.class);
        hashMap.put("aura.impl.event.adjust", tf.class);
        hashMap.put("aura.impl.event.redirect.mega", gk.class);
        hashMap.put("aura.impl.performance.monitor.ut", go.class);
        hashMap.put("aura.impl.event.asyncMR", kg.class);
        hashMap.put(qo.AURA_CODE, qo.class);
        hashMap.put("aura.impl.component.lifeCycle.async.component", lg.class);
        hashMap.put("aura.impl.aspect.lifecycle.exposurereset", com.alibaba.android.aura.taobao.adapter.extension.completeExposure.a.class);
        hashMap.put("aura.impl.performance.monitor.weex2.render", wo.class);
        hashMap.put("aura.impl.parse.popupWindow", ol.class);
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, AbstractMap.SimpleEntry<String, Class<? extends lbb>>> extensionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b59c5d9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aura.extension.render.creator.freeNode#1", new AbstractMap.SimpleEntry("aura.impl.render.creator.freeNode#AURA_CODE_SPLIT#aura.impl.parse.renderTreeFilter.freeNode", bt.class));
        hashMap.put("aura.extension.render.component.creator.weex.lifecycle#1", new AbstractMap.SimpleEntry("aura.impl.render.component.creator.weex", edb.class));
        hashMap.put("aura.extension.render.component.creator.weex2.lifecycle#1", new AbstractMap.SimpleEntry("aura.impl.render.component.creator.weex2", ddb.class));
        hashMap.put("aura.extension.aspect.error.alarm.monitor.handler#1", new AbstractMap.SimpleEntry(xf.AURA_CODE, vt.class));
        hashMap.put("aura.extension.performance.customStage#1", new AbstractMap.SimpleEntry("aura.impl.performance.customStage", ht.class));
        hashMap.put("aura.extension.event.userTrack.args#1", new AbstractMap.SimpleEntry(qo.AURA_CODE, adb.class));
        hashMap.put("aura.extension.autoTrack.config#1", new AbstractMap.SimpleEntry("aura.impl.aspect.lifecycle.dxDownload", yab.class));
        hashMap.put("aura.extension.submit.result#1", new AbstractMap.SimpleEntry(rn.CODE, ycb.class));
        hashMap.put("aura.extension.performance.monitor.render.ext#1", new AbstractMap.SimpleEntry("aura.impl.performance.monitor.render", scb.class));
        hashMap.put("aura.extension.aspect.error.alarm.monitor.slice#1", new AbstractMap.SimpleEntry(xf.AURA_CODE, vab.class));
        hashMap.put("aura.extension.render.component.creator.dx.autoSize#1", new AbstractMap.SimpleEntry(kh.EXTENSION_CODE, qs.class));
        hashMap.put("aura.extension.event.adjust.judge#1", new AbstractMap.SimpleEntry("aura.impl.event.adjust", is.class));
        hashMap.put("aura.extension.lifecycle.dxEngine.config#1", new AbstractMap.SimpleEntry("aura.impl.aspect.lifecycle.dxDownload", dbb.class));
        hashMap.put("aura.extension.performance.monitor#1", new AbstractMap.SimpleEntry("aura.impl.performance#AURA_CODE_SPLIT#aura.impl.performance.render#AURA_CODE_SPLIT#aura.impl.performance.monitor.weex2.render#AURA_CODE_SPLIT#aura.impl.performance.commonArgs", gcb.class));
        hashMap.put("aura.extension.event.adjust.confirmComponent#1", new AbstractMap.SimpleEntry("aura.impl.event.adjust", gs.class));
        hashMap.put("aura.extension.aspect.lifecycle.dxDownload.ext#1", new AbstractMap.SimpleEntry("aura.impl.aspect.lifecycle.dxDownload", ss.class));
        hashMap.put("aura.extension.exposureItem.strategy#1", new AbstractMap.SimpleEntry("aura.impl.component.lifeCycle.exposureItem", kbb.class));
        hashMap.put("aura.extension.performance.monitor.ext#1", new AbstractMap.SimpleEntry("aura.impl.performance.monitor", fcb.class));
        hashMap.put("aura.extension.submit.linkage#1", new AbstractMap.SimpleEntry(rn.CODE, wcb.class));
        hashMap.put("aura.extension.event.handler#1", new AbstractMap.SimpleEntry("aura.impl.event.popupWindow#AURA_CODE_SPLIT#aura.impl.event.adjust#AURA_CODE_SPLIT#aura.impl.event.submit", ys.class));
        hashMap.put("aura.extension.event.userTrack.commit#1", new AbstractMap.SimpleEntry(qo.AURA_CODE, bdb.class));
        hashMap.put("aura.extension.event.openUrl.native.params#1", new AbstractMap.SimpleEntry(AURAOpenUrlEvent.CODE, zbb.class));
        hashMap.put("aura.extension.linkage.submit.data#1", new AbstractMap.SimpleEntry(qn.CODE, rt.class));
        hashMap.put("aura.extension.aspect.error.alarm.monitor.sampling#1", new AbstractMap.SimpleEntry(xf.AURA_CODE, uab.class));
        hashMap.put("aura.extension.performance.monitor.network.ext#1", new AbstractMap.SimpleEntry("aura.impl.performance.monitor.network", tbb.class));
        hashMap.put("aura.extension.event.adjust.trigger#2", new AbstractMap.SimpleEntry("aura.impl.event.adjust", js.class));
        hashMap.put("aura.extension.event.submit.business#1", new AbstractMap.SimpleEntry("aura.impl.event.submit", xcb.class));
        hashMap.put("aura.extension.linkage.adjust.data#1", new AbstractMap.SimpleEntry(xj.CODE, hs.class));
        hashMap.put("aura.extension.popupWindow.ext#1", new AbstractMap.SimpleEntry("aura.impl.event.popupWindow", hcb.class));
        hashMap.put("aura.extension.userMotion.config#1", new AbstractMap.SimpleEntry("aura.impl.component.userMotion", zcb.class));
        hashMap.put("aura.extension.linkage.adjust#1", new AbstractMap.SimpleEntry(xj.CODE, pbb.class));
        hashMap.put("aura.extension.render.dx.video.lifecycle#1", new AbstractMap.SimpleEntry(kh.EXTENSION_CODE, cbb.class));
        hashMap.put("aura.extension.event.executeAbility.callBack#1", new AbstractMap.SimpleEntry("aura.impl.event.executeAbility", tab.class));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<Class, List<Class<? extends IAURAInputField>>> inputFieldsTargetClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("994890c0", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(AURARaxComponentExtension_InputField_floatView.class);
        hashMap.put(wl.class, arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(AURADismissFloatEvent_InputField_floatView.class);
        hashMap.put(zh.class, arrayList2);
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter, com.alibaba.android.aura.IAURAPluginCenter
    public Map<String, Class<? extends gn>> serviceMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e7e56123", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(xj.CODE, xj.class);
        hashMap.put(rn.CODE, rn.class);
        return Collections.unmodifiableMap(hashMap);
    }
}
