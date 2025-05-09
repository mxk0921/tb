package com.taobao.tao.recommend4.manager;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.gateway.msgcenter.Message;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend4.manager.OldRecommendManagerImpl;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.RecommendRecyclerAdapter;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.bqa;
import tb.etc;
import tb.h6b;
import tb.kmn;
import tb.knn;
import tb.mhd;
import tb.t2o;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c implements etc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f12680a = new Handler(Looper.getMainLooper());
    public b b;
    public final WeakReference<HomeChildRecyclerView> c;
    public z4a d;
    public final mhd e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12681a;
        public final /* synthetic */ JSONObject b;

        public a(String str, JSONObject jSONObject) {
            this.f12681a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c.b(c.this, this.f12681a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    static {
        t2o.a(729809967);
        t2o.a(475005025);
    }

    public c(z4a z4aVar, HomeChildRecyclerView homeChildRecyclerView, mhd mhdVar) {
        this.c = new WeakReference<>(homeChildRecyclerView);
        this.d = z4aVar;
        this.e = mhdVar;
    }

    public static /* synthetic */ void b(c cVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55965e04", new Object[]{cVar, str, jSONObject});
        } else {
            cVar.f(str, jSONObject);
        }
    }

    @Override // tb.etc
    public void a(Message message) {
        JSONObject params;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5ee06e", new Object[]{this, message});
        } else if (TextUtils.equals(message.getChannelId(), d()) && (params = message.getParams()) != null) {
            String string = params.getString("_msgType");
            if (!TextUtils.isEmpty(string)) {
                if (kmn.l()) {
                    f(string, params);
                } else {
                    this.f12680a.post(new a(string, params));
                }
            }
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this});
        }
        return "recmd.container";
    }

    public final void g(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80469c95", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        b bVar = this.b;
        if (bVar != null) {
            ((OldRecommendManagerImpl.d) bVar).b(z, z2, z3);
        }
    }

    public final void h(JSONObject jSONObject, String str, HomeChildRecyclerView homeChildRecyclerView) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593aaee8", new Object[]{this, jSONObject, str, homeChildRecyclerView});
            return;
        }
        try {
            z = jSONObject.getBooleanValue("animated");
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            homeChildRecyclerView.smoothScrollToPosition(0);
        } else {
            homeChildRecyclerView.scrollToPosition(0);
        }
    }

    public void i(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9dec14", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    public final void j(JSONObject jSONObject, String str, HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a44838e", new Object[]{this, jSONObject, str, homeChildRecyclerView});
            return;
        }
        String string = jSONObject.getString("dataChangeType");
        if (TextUtils.isEmpty(string)) {
            ((RecommendRecyclerAdapter) homeChildRecyclerView.getAdapter()).e0();
            this.e.f();
            b bVar = this.b;
            if (bVar != null) {
                ((OldRecommendManagerImpl.d) bVar).a();
                return;
            }
            return;
        }
        AwesomeGetContainerData awesomeGetContainerData = (AwesomeGetContainerData) jSONObject.get("containerModel");
        if (awesomeGetContainerData == null || awesomeGetContainerData.getBaseData() == null || awesomeGetContainerData.getPageParams() == null || awesomeGetContainerData.getTotalData() == null) {
            b bVar2 = this.b;
            if (bVar2 != null) {
                ((OldRecommendManagerImpl.d) bVar2).a();
            }
            this.e.f();
            return;
        }
        boolean e = e(str, awesomeGetContainerData, string);
        boolean equals = TextUtils.equals(jSONObject.getString("dataSourceType"), "local");
        boolean u = kmn.u(awesomeGetContainerData.getPageParams().isLastPage);
        b bVar3 = this.b;
        if (bVar3 != null) {
            ((OldRecommendManagerImpl.d) bVar3).c(e);
        }
        try {
            RecommendRecyclerAdapter recommendRecyclerAdapter = (RecommendRecyclerAdapter) homeChildRecyclerView.getAdapter();
            if (!equals || recommendRecyclerAdapter.getItemCount() <= 1 || !TextUtils.equals(this.d.f32522a, str)) {
                if (e) {
                    recommendRecyclerAdapter.c0(0);
                } else {
                    recommendRecyclerAdapter.c0(-1);
                }
                g(e, equals, u);
                this.e.j(e, equals, u);
                return;
            }
            g(e, true, u);
        } catch (Throwable unused) {
            bqa.d("RecmdContainerChannel4", "");
        }
    }

    public void k(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb065cc3", new Object[]{this, z4aVar});
        } else {
            this.d = z4aVar;
        }
    }

    public final void f(String str, JSONObject jSONObject) {
        HomeChildRecyclerView homeChildRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5886259a", new Object[]{this, str, jSONObject});
        } else if (TextUtils.equals(str, "dinamicX3")) {
            c(jSONObject);
        } else {
            String string = jSONObject.getString("containerId");
            if (!TextUtils.isEmpty(string)) {
                String substring = string.substring(string.lastIndexOf(95) + 1);
                if (TextUtils.isEmpty(substring) || (homeChildRecyclerView = this.c.get()) == null) {
                    return;
                }
                if (TextUtils.equals(str, "scrollToTop")) {
                    h(jSONObject, substring, homeChildRecyclerView);
                } else if (TextUtils.equals(str, "uiRefresh")) {
                    j(jSONObject, string, homeChildRecyclerView);
                }
            }
        }
    }

    public final void c(JSONObject jSONObject) {
        HomeChildRecyclerView homeChildRecyclerView;
        List<SectionModel> data;
        int f;
        View findViewByPosition;
        View childAt;
        DinamicXEngine h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a044941f", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("sectionBizCode");
        Object obj = jSONObject.get("DX3Params");
        if (!TextUtils.isEmpty(string) && obj != null && (obj instanceof JSONObject) && (homeChildRecyclerView = this.c.get()) != null && (data = ((RecommendRecyclerAdapter) homeChildRecyclerView.getAdapter()).getData()) != null && !data.isEmpty() && (f = kmn.f(string, data)) >= 0 && f < data.size() && (findViewByPosition = homeChildRecyclerView.getLayoutManager().findViewByPosition(f)) != null && (findViewByPosition instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) findViewByPosition;
            if (viewGroup.getChildCount() >= 1 && (childAt = viewGroup.getChildAt(0)) != null && (childAt instanceof DXRootView) && (h = knn.g().h()) != null) {
                h.y0((DXRootView) childAt, obj);
            }
        }
    }

    public final boolean e(String str, IContainerDataModel<?> iContainerDataModel, String str2) {
        IPageDataModel pageParams;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c054f618", new Object[]{this, str, iContainerDataModel, str2})).booleanValue();
        }
        boolean equals = TextUtils.equals(str2, "base");
        if (!Boolean.parseBoolean(h6b.a(str, "isNextPageToDeltaRefresh", "true")) || !equals || (pageParams = iContainerDataModel.getBase().getPageParams()) == null) {
            return equals;
        }
        if (pageParams.getPageNum() != 0) {
            z = false;
        }
        return z;
    }
}
