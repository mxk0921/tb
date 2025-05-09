package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.extension.utTrack.TBBuyUserTrackParserExtension;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a9r;
import tb.b9r;
import tb.c8r;
import tb.c9r;
import tb.car;
import tb.e8r;
import tb.gn;
import tb.i8r;
import tb.k9r;
import tb.lbb;
import tb.m9r;
import tb.n9r;
import tb.o8r;
import tb.p7r;
import tb.q7r;
import tb.r7r;
import tb.t2o;
import tb.t7r;
import tb.t8r;
import tb.u8r;
import tb.xng;
import tb.y9r;
import tb.yng;
import tb.zab;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURATaobaoPurchasePluginCenter extends AbsAURAPluginCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837377);
    }

    public static /* synthetic */ Object ipc$super(AURATaobaoPurchasePluginCenter aURATaobaoPurchasePluginCenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/AURATaobaoPurchasePluginCenter");
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
        hashMap.put("tbbuy.impl.render.component.creator.dx.autoSize", c8r.class);
        hashMap.put("tbbuy.impl.aspect.lifecycle.popupWindow", c9r.class);
        hashMap.put("tbbuy.impl.aspect.zcache.prefetch", car.class);
        hashMap.put("tbbuy.impl.aspect.error.adjust", p7r.class);
        hashMap.put("tbbuy.impl.event.adjust.autorefresh", q7r.class);
        hashMap.put("tbbuy.impl.parse.stateTree.userTrack", TBBuyUserTrackParserExtension.class);
        hashMap.put("tbbuy.impl.aspect.bx.tracker", r7r.class);
        hashMap.put("tbbuy.impl.nextrpc.infoFlow.preload", o8r.class);
        hashMap.put("tbbuy.impl.event.verifyIdentity", k9r.class);
        hashMap.put("tbbuy.impl.nextrpc.refresh.extparams", m9r.class);
        hashMap.put("tbbuy.impl.aspect.error.adjust.popupWindow", b9r.class);
        hashMap.put("tbbuy.impl.nextrpc.userTrack", y9r.class);
        hashMap.put("tbbuy.impl.render.creator.freeNode.actionBar", i8r.class);
        hashMap.put("tbbuy.impl.aspect.error.build", t7r.class);
        hashMap.put("lightbuy.impl.nextrpc.attachedData.weex", yng.class);
        hashMap.put("lightbuy.impl.nextrpc.requestParams", xng.class);
        hashMap.put("tbbuy.impl.aspect.error.downgrade", e8r.class);
        hashMap.put("tbbuy.impl.render.component.creator.dx.float.autoSize", a9r.class);
        hashMap.put("tbbuy.impl.component.lifeCycle.native", u8r.class);
        hashMap.put("tbbuy.impl.event.refresh", n9r.class);
        hashMap.put("tbbuy.impl.aspect.monitor.buy2.0", t8r.class);
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
