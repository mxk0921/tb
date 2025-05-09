package com.alibaba.poplayer.trigger;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.alibaba.poplayer.config.model.predeal.PreDealCustomEventParams;
import com.alibaba.poplayer.config.model.predeal.PreDealIndexContent;
import com.alibaba.poplayer.config.model.style.StyleModel;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.linkage.pop.small.SmallPopView;
import java.util.Map;
import tb.jd0;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a extends PopRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String n;
    public final BaseConfigItem o;
    public final Event p;
    public final boolean q;

    static {
        t2o.a(626000013);
    }

    public a(Event event, BaseConfigItem baseConfigItem, Activity activity, PopRequest.b bVar) {
        super(baseConfigItem.layerType, activity, event.attachKeyCode, bVar, Q(event, baseConfigItem), baseConfigItem.enqueue, baseConfigItem.forcePopRespectingPriority, baseConfigItem.exclusive);
        this.q = false;
        this.p = event;
        this.o = baseConfigItem;
        this.n = baseConfigItem.indexID;
        this.i.a(baseConfigItem, event, this.j);
        A();
        if (I()) {
            this.l = event.getAugeCode();
            this.m = event.getUcpBackFlowTrackInfo();
        }
        if (event.source == 4) {
            OnePopModule k = k();
            PreDealCustomEventParams preDealCustomEventParams = event.getPreDealCustomEventParams();
            k.h0 = preDealCustomEventParams.getTraceId();
            preDealCustomEventParams.syncModuleByIndexId(baseConfigItem.indexID, k);
            long preDealCostTime = preDealCustomEventParams.getPreDealCostTime();
            if (preDealCostTime > 0) {
                k.T = String.valueOf(preDealCostTime);
            }
            long generateSdkWaitTime = preDealCustomEventParams.generateSdkWaitTime();
            if (generateSdkWaitTime > 0) {
                k.W = String.valueOf(generateSdkWaitTime);
            }
        }
    }

    public static BaseConfigItem J(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("c8aa3546", new Object[]{popRequest});
        }
        try {
            if (popRequest instanceof a) {
                return ((a) popRequest).o;
            }
            return null;
        } catch (Throwable th) {
            wdm.h("getConfigFromRequest error", th);
            return null;
        }
    }

    public static Event M(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("40d54cfc", new Object[]{popRequest});
        }
        try {
            if (popRequest instanceof a) {
                return ((a) popRequest).L();
            }
            return null;
        } catch (Throwable th) {
            wdm.h("getConfigFromRequest error", th);
            return null;
        }
    }

    public static String P(PopRequest popRequest) {
        BaseConfigItem baseConfigItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42081ff6", new Object[]{popRequest});
        }
        try {
            if (!(popRequest instanceof a) || (baseConfigItem = ((a) popRequest).o) == null) {
                return "";
            }
            return baseConfigItem.indexID;
        } catch (Throwable th) {
            wdm.h("getIndexId error", th);
        }
        return "";
    }

    public static int Q(Event event, BaseConfigItem baseConfigItem) {
        Map<String, PreDealIndexContent> indexMap;
        PreDealIndexContent preDealIndexContent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7242a40e", new Object[]{event, baseConfigItem})).intValue();
        }
        if (event.source != 4 || !event.getPreDealCustomEventParams().isValid() || (indexMap = event.getPreDealCustomEventParams().getIndexMap()) == null || (preDealIndexContent = indexMap.get(baseConfigItem.indexID)) == null || SmallPopView.VIEW_TYPE.equals(baseConfigItem.type)) {
            return baseConfigItem.priority;
        }
        return preDealIndexContent.getPriority();
    }

    public static String R(PopRequest popRequest) {
        BaseConfigItem baseConfigItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28385efc", new Object[]{popRequest});
        }
        try {
            if (!(popRequest instanceof a) || (baseConfigItem = ((a) popRequest).o) == null) {
                return "";
            }
            return baseConfigItem.uuid;
        } catch (Throwable th) {
            wdm.h("getUUID error", th);
        }
        return "";
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 896084260) {
            return super.q();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/poplayer/trigger/HuDongPopRequest");
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35e84220", new Object[]{this})).booleanValue();
        }
        Event event = this.p;
        if (event == null || event.source != 5) {
            return true ^ TextUtils.isEmpty(d());
        }
        return true;
    }

    public BaseConfigItem K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("ed43f178", new Object[]{this});
        }
        return this.o;
    }

    public Event L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("fb9ce845", new Object[]{this});
        }
        return this.p;
    }

    public String N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3188090", new Object[]{this});
        }
        Event event = this.p;
        if (event.source != 4 || event.getPreDealCustomEventParams() == null) {
            return this.p.param;
        }
        return this.p.getPreDealCustomEventParams().getContentById(this.o.indexID);
    }

    public String O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ec6ba02", new Object[]{this});
        }
        return this.n;
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbe32933", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9295f73d", new Object[]{this})).booleanValue();
        }
        Event event = this.p;
        if (event == null || event.source != 3) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean a() {
        BaseConfigItem baseConfigItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed4b1749", new Object[]{this})).booleanValue();
        }
        if ((jd0.c().a() == null || !jd0.c().a().isOpenImmersiveByDefault()) && (baseConfigItem = this.o) != null && !baseConfigItem.enableFullScreenInImmersive) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("536a2b84", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.l)) {
            return this.l;
        }
        BaseConfigItem baseConfigItem = this.o;
        if (baseConfigItem != null && !TextUtils.isEmpty(baseConfigItem.extra)) {
            try {
                this.l = JSON.parseObject(this.o.extra).getString("augeCode");
            } catch (Throwable th) {
                wdm.h("getAugeCode.error", th);
                this.l = "";
            }
        }
        return this.l;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof a)) {
            return super.equals(obj);
        }
        a aVar = (a) obj;
        if (aVar.T()) {
            if (TextUtils.isEmpty(this.o.uuid) || !this.p.equals(aVar.p) || !this.o.uuid.equals(aVar.o.uuid)) {
                return false;
            }
            return true;
        } else if (!TextUtils.isEmpty(this.o.indexID)) {
            if (!this.p.equals(aVar.p) || !this.o.indexID.equals(aVar.o.indexID)) {
                return false;
            }
            return true;
        } else if (TextUtils.isEmpty(this.o.uuid)) {
            return super.equals(obj);
        } else {
            if (!this.p.equals(aVar.p) || !this.o.uuid.equals(aVar.o.uuid)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        BaseConfigItem baseConfigItem = this.o;
        if (baseConfigItem != null) {
            return baseConfigItem.type;
        }
        return super.q();
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f23000da", new Object[]{this})).booleanValue();
        }
        if (v() || x()) {
            return false;
        }
        return this.o.embed;
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8171e81", new Object[]{this})).booleanValue();
        }
        if (!s() || o() != PopRequest.Status.SHOWING) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean u() {
        StyleModel styleModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9940ce8a", new Object[]{this})).booleanValue();
        }
        BaseConfigItem baseConfigItem = this.o;
        if (baseConfigItem == null || (styleModel = baseConfigItem.styleConfigs) == null || !styleModel.isValid()) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean v() {
        KeepModel keepModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f4c0c66", new Object[]{this})).booleanValue();
        }
        BaseConfigItem baseConfigItem = this.o;
        if (baseConfigItem == null || !baseConfigItem.isAppMode() || (keepModel = this.o.keepConfigs) == null || !KeepModel.MODE_KEEP_LIVE.equals(keepModel.mode)) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f8d3d75", new Object[]{this})).booleanValue();
        }
        if (!v() || o() != PopRequest.Status.SHOWING) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a8d12b", new Object[]{this})).booleanValue();
        }
        if (!x() || o() != PopRequest.Status.SHOWING) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean x() {
        KeepModel keepModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbd39970", new Object[]{this})).booleanValue();
        }
        BaseConfigItem baseConfigItem = this.o;
        return baseConfigItem != null && baseConfigItem.isAppMode() && (keepModel = this.o.keepConfigs) != null && KeepModel.MODE_PAGE_LIVE.equals(keepModel.mode);
    }

    public a(Event event, String str, Activity activity, PopRequest.b bVar) {
        super("", activity, event.attachKeyCode, bVar, 0, false, false, false);
        this.p = event;
        this.o = null;
        this.n = str;
        this.q = true;
        this.i.a(null, event, this.j);
        A();
        if (I()) {
            D(event.getUcpBackFlowTrackInfo());
        }
        if (event.source == 4) {
            OnePopModule k = k();
            PreDealCustomEventParams preDealCustomEventParams = event.getPreDealCustomEventParams();
            k.h0 = preDealCustomEventParams.getTraceId();
            preDealCustomEventParams.syncModuleByIndexId(str, k);
            long preDealCostTime = preDealCustomEventParams.getPreDealCostTime();
            if (preDealCostTime > 0) {
                k.T = String.valueOf(preDealCostTime);
            }
            long generateSdkWaitTime = preDealCustomEventParams.generateSdkWaitTime();
            if (generateSdkWaitTime > 0) {
                k.W = String.valueOf(generateSdkWaitTime);
            }
        }
    }
}
