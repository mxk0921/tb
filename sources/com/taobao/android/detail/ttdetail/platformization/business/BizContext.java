package com.taobao.android.detail.ttdetail.platformization.business;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import com.taobao.android.detail.ttdetail.data.meta.Merged;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.taobao.R;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ctd;
import tb.evb;
import tb.ir;
import tb.mvb;
import tb.oa4;
import tb.qub;
import tb.t2o;
import tb.uob;
import tb.w9e;
import tb.yzc;
import tb.ze7;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class BizContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private ze7 mDetailContext;
    private BizLifecycle mFrameworkBizLifecycle;
    private Intent mIntent;
    private w9e mViewFinder;

    static {
        t2o.a(912262143);
    }

    private <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}));
        }
        return (T) this.mViewFinder.findViewById(i);
    }

    public final void attachBizContext(ze7 ze7Var, Context context, Intent intent, w9e w9eVar, BizLifecycle bizLifecycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad52df0c", new Object[]{this, ze7Var, context, intent, w9eVar, bizLifecycle});
        } else if (this.mDetailContext == null && this.mContext == null && this.mIntent == null && this.mViewFinder == null && this.mFrameworkBizLifecycle == null) {
            this.mDetailContext = ze7Var;
            this.mContext = context;
            this.mIntent = intent;
            this.mViewFinder = w9eVar;
            this.mFrameworkBizLifecycle = bizLifecycle;
        } else {
            throw new IllegalStateException("BizContext#attachBizContext(DetailContext, Context, Intent, BizLifecycle) method can not invoke twice or invoke by business");
        }
    }

    public abstract String bizId();

    public oa4 findComponentByUltronName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("97436efd", new Object[]{this, str});
        }
        return this.mDetailContext.h().c(str);
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    public ze7 getDetailContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("ee649aeb", new Object[]{this});
        }
        return this.mDetailContext;
    }

    public ViewGroup getFloatView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("17154e63", new Object[]{this});
        }
        return (ViewGroup) findViewById(R.id.fl_tt_detail_opening_biz_fliggy_container);
    }

    public ViewGroup getGalleryFloatView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("42e58729", new Object[]{this});
        }
        return (ViewGroup) findViewById(R.id.tt_tmall_header_float_container);
    }

    public Intent getIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
        }
        return this.mIntent;
    }

    public <M extends Merged> M getMergedData(Class<M> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ((Merged) ipChange.ipc$dispatch("8c55ab17", new Object[]{this, cls}));
        }
        return (M) this.mDetailContext.e().f(cls);
    }

    public void getStreamingFinalData(ctd ctdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716d8c3b", new Object[]{this, ctdVar});
        } else {
            this.mDetailContext.e().i(ctdVar);
        }
    }

    public boolean hasStreamingFinalDataListener(ctd ctdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d5e4227", new Object[]{this, ctdVar})).booleanValue();
        }
        return this.mDetailContext.e().n(ctdVar);
    }

    public boolean isPreloadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e44eb9d4", new Object[]{this})).booleanValue();
        }
        return this.mDetailContext.e().o();
    }

    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public boolean onFrameworkDowngrade(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79ed54b7", new Object[]{this, jSONObject})).booleanValue();
        }
        return false;
    }

    public boolean onInterceptResponse(Map<String, String> map, MtopResponse mtopResponse, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1323cb08", new Object[]{this, map, mtopResponse, new Integer(i)})).booleanValue();
        }
        return false;
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    public boolean onSendRequest(Map<String, String> map, yzc yzcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d91c2128", new Object[]{this, map, yzcVar, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    public void postAbility(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49cb7596", new Object[]{this, irVar, runtimeAbilityParamArr});
        } else {
            this.mDetailContext.b().h(irVar, runtimeAbilityParamArr);
        }
    }

    public void putComponentViewMeta(String str, ComponentViewMeta componentViewMeta) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce597556", new Object[]{this, str, componentViewMeta});
        } else {
            this.mDetailContext.d().h(str, componentViewMeta);
        }
    }

    public void registerAbilityImplementor(String str, zre zreVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d526f11", new Object[]{this, str, zreVar});
        } else {
            this.mDetailContext.b().i(str, zreVar);
        }
    }

    public boolean registerComponentBuilder(String str, String str2, uob uobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14be5507", new Object[]{this, str, str2, uobVar})).booleanValue();
        }
        return this.mDetailContext.d().i(str, str2, uobVar);
    }

    public void registerDinamicXDataParser(long j, evb evbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e9361f", new Object[]{this, new Long(j), evbVar});
        } else {
            this.mDetailContext.g().C(j, evbVar);
        }
    }

    public void registerDinamicXEvent(long j, mvb mvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c592c478", new Object[]{this, new Long(j), mvbVar});
        } else {
            this.mDetailContext.g().D(j, mvbVar);
        }
    }

    public void registerDinamicXWidget(long j, qub qubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796f558", new Object[]{this, new Long(j), qubVar});
        } else {
            this.mDetailContext.g().F(j, qubVar);
        }
    }

    public void removeStreamingFinalDataListener(ctd ctdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21357679", new Object[]{this, ctdVar});
        } else {
            this.mDetailContext.e().r(ctdVar);
        }
    }

    public void set2001PageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb9d14c", new Object[]{this, str});
        } else {
            this.mFrameworkBizLifecycle.m(str);
        }
    }

    public String setMtopData(Map<String, String> map, MtopResponse mtopResponse, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52bb970c", new Object[]{this, map, mtopResponse, new Integer(i)});
        }
        return this.mFrameworkBizLifecycle.n(map, mtopResponse, i);
    }

    public void setUserTrackArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a22443", new Object[]{this, map});
        } else {
            this.mFrameworkBizLifecycle.o(map);
        }
    }
}
