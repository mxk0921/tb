package com.taobao.search.infoflow;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.search.infoflow.a;
import tb.anx;
import tb.cnx;
import tb.f64;
import tb.fmi;
import tb.mmi;
import tb.npc;
import tb.r4p;
import tb.rfo;
import tb.rv6;
import tb.sr3;
import tb.t2o;
import tb.y5p;
import tb.yak;
import tb.yko;
import tb.znd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchInfoFlowImpl implements com.taobao.search.infoflow.a, LifecycleObserver, cnx, npc, fmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f11534a;
    public final Context b;
    public com.taobao.android.weex_framework.a c;
    public mmi d;
    public LifecycleOwner e;
    public a.AbstractC0651a f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements znd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.AbstractC0651a f11535a;

        public a(a.AbstractC0651a aVar) {
            this.f11535a = aVar;
        }

        @Override // tb.znd
        public void a(y5p y5pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("105ed04b", new Object[]{this, y5pVar});
            } else if (this.f11535a != null) {
                SearchInfoFlowImpl searchInfoFlowImpl = SearchInfoFlowImpl.this;
                RecyclerView e = SearchInfoFlowImpl.e(searchInfoFlowImpl, SearchInfoFlowImpl.d(searchInfoFlowImpl).getRenderRoot());
                if (e instanceof SearchChildRecyclerView) {
                    this.f11535a.b((SearchChildRecyclerView) e);
                }
            }
        }
    }

    static {
        t2o.a(815792269);
        t2o.a(815792266);
        t2o.a(993002201);
        t2o.a(982515990);
    }

    public SearchInfoFlowImpl(String str, Context context, LifecycleOwner lifecycleOwner) {
        this.f11534a = str;
        this.b = context;
        this.e = lifecycleOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    public static /* synthetic */ com.taobao.android.weex_framework.a d(SearchInfoFlowImpl searchInfoFlowImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("515137d4", new Object[]{searchInfoFlowImpl});
        }
        return searchInfoFlowImpl.c;
    }

    public static /* synthetic */ RecyclerView e(SearchInfoFlowImpl searchInfoFlowImpl, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("cce1d793", new Object[]{searchInfoFlowImpl, view});
        }
        return searchInfoFlowImpl.h(view);
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2107aac5", new Object[]{str});
        }
        yko ykoVar = yak.f31939a;
        String b = ykoVar != null ? sr3.b("search_info_flow_url", ykoVar) : null;
        if (TextUtils.isEmpty(b)) {
            b = rfo.b().c(g(str), r4p.SERVER_VERSION_VALUE);
        }
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        if (rv6.a()) {
            return "https://dev.g.alicdn.com/asr-pages/shopping-item-page/0.0.1/weex/home.v20.wlm";
        }
        return "https://g.alicdn.com/asr-pages/shopping-item-page/0.0.1/weex/home.v20.wlm";
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa783f7b", new Object[]{str});
        }
        if ("OrderSearch".equals(str) || "orderList_search".equals(str)) {
            return "order-item-page";
        }
        return "shopping-item-page";
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onActivityDestroyInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01a1cf0", new Object[]{this});
        } else {
            destroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void onActivityPauseInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ad256c", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null && !aVar.isDestroyed()) {
            this.c.onActivityPause();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void onActivityResumeInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1240903f", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null && !aVar.isDestroyed()) {
            this.c.onActivityResume();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private void onActivityStartInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762981d8", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null && !aVar.isDestroyed()) {
            this.c.onActivityStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void onActivityStopInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfed8c14", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null && !aVar.isDestroyed()) {
            this.c.onActivityStop();
        }
    }

    @Override // tb.cnx
    public boolean K(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f36856c", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.search.infoflow.a
    public View a(JSONObject jSONObject, a.AbstractC0651a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d2ef3460", new Object[]{this, jSONObject, aVar});
        }
        com.taobao.android.weex_framework.a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.destroy();
        }
        this.f = aVar;
        String f = f(this.f11534a);
        if (!TextUtils.isEmpty(f)) {
            if (this.d == null) {
                this.d = new mmi(this.b, "xsl_search_event", this);
            }
            com.taobao.android.weex_framework.a a2 = anx.a(this.b, this, null);
            this.c = a2;
            a2.renderByUrl(f, f, jSONObject, null);
            this.c.registerRenderListener(this);
            this.c.setTag(XslMUSComponent.TAG_XSL_NESTED_MOD, "true");
            this.c.setTag(XslMUSComponent.PAGE_PERF_STATICS_CALLBACK, new a(aVar));
            return this.c.getRenderRoot();
        } else if (!rv6.a()) {
            return new FrameLayout(this.b);
        } else {
            throw new IllegalStateException("无法获取" + this.f11534a + "对应的页面url");
        }
    }

    @Override // tb.fmi
    public void b(Object obj) {
        com.taobao.android.weex_framework.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
        } else if ((obj instanceof JSONObject) && (aVar = this.c) != null && !aVar.isDestroyed() && this.f != null) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.getIntValue("instanceId") == this.c.getInstanceId()) {
                String string = jSONObject.getString("event");
                if ("searchSuccess".equals(string)) {
                    this.f.onSuccess();
                } else if ("searchFail".equals(string)) {
                    this.f.a("request");
                }
            }
        }
    }

    @Override // com.taobao.search.infoflow.a
    public void c(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407ce11a", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null && !aVar.isDestroyed()) {
            if (z) {
                this.c.refresh(jSONObject, null);
            } else {
                this.c.sendInstanceMessage("MUISE", "updateParams", jSONObject);
            }
        }
    }

    @Override // com.taobao.search.infoflow.a
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null && !aVar.isDestroyed()) {
            this.c.destroy();
            LifecycleOwner lifecycleOwner = this.e;
            if (lifecycleOwner != null) {
                lifecycleOwner.getLifecycle().removeObserver(this);
                this.e = null;
            }
            mmi mmiVar = this.d;
            if (mmiVar != null) {
                mmiVar.a();
                this.d = null;
            }
        }
    }

    public final RecyclerView h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("374839d3", new Object[]{this, view});
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            RecyclerView h = h(viewGroup.getChildAt(i));
            if (h != null) {
                return h;
            }
        }
        return null;
    }

    @Override // tb.cnx
    public boolean m2(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac25dbb", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        return false;
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // tb.npc
    public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
        }
    }

    @Override // tb.npc
    public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        a.AbstractC0651a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.a("render");
        }
    }

    @Override // tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
        }
    }
}
