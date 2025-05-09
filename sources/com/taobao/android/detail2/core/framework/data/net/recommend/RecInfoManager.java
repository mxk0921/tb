package com.taobao.android.detail2.core.framework.data.net.recommend;

import android.os.Looper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.optimize.preload.a;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.cxj;
import tb.h5o;
import tb.mbq;
import tb.mqj;
import tb.o2r;
import tb.q0j;
import tb.r19;
import tb.t2o;
import tb.txj;
import tb.zg7;
import tb.zxu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RecInfoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REC_APP_ID = "31750";

    /* renamed from: a  reason: collision with root package name */
    public h5o f7125a;
    public final cxj b;
    public final Queue<b> c = new ArrayDeque();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail2.core.framework.data.net.recommend.RecInfoManager$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class AnonymousClass1 implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean val$isPageUp;
        public final /* synthetic */ boolean val$isRealtimeRequest;
        public final /* synthetic */ b val$listener;
        public final /* synthetic */ int val$pageIndex;
        public final /* synthetic */ String val$requestToken;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.detail2.core.framework.data.net.recommend.RecInfoManager$1$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a extends r19.e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MtopResponse f7126a;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.detail2.core.framework.data.net.recommend.RecInfoManager$1$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class C0390a extends r19.e {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ a.C0395a f7127a;

                public C0390a(a.C0395a aVar) {
                    this.f7127a = aVar;
                }

                public static /* synthetic */ Object ipc$super(C0390a aVar, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/data/net/recommend/RecInfoManager$1$1$1");
                }

                @Override // tb.r19.e
                public String c() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
                    }
                    return "dealMtopSuccess";
                }

                @Override // tb.r19.e
                public void d() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("9425d337", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = this.f7127a.f7233a;
                    if (jSONObject != null) {
                        com.taobao.android.detail2.core.optimize.preload.a.k(jSONObject, RecInfoManager.c(RecInfoManager.this));
                    }
                    a.C0395a aVar = this.f7127a;
                    if (!aVar.f || aVar.f7233a == null) {
                        if (RecInfoManager.this.o()) {
                            txj.e(txj.TAG_DATA, "NdRecManagerCB新链路 getRecData.onSuccess.notifyFail requestToken:" + AnonymousClass1.this.val$requestToken);
                            AnonymousClass1 r0 = AnonymousClass1.this;
                            RecInfoManager.f(RecInfoManager.this, r0.val$isPageUp, r0.val$pageIndex, this.f7127a.b, r0.val$listener);
                            return;
                        }
                        AnonymousClass1 r02 = AnonymousClass1.this;
                        RecInfoManager.g(RecInfoManager.this, r02.val$isPageUp, r02.val$pageIndex, this.f7127a.b, r02.val$listener, r02.val$isRealtimeRequest);
                    } else if (RecInfoManager.this.o()) {
                        txj.e(txj.TAG_DATA, "NdRecManagerCB新链路 getRecData.onSuccess.dealSuc requestToken:" + AnonymousClass1.this.val$requestToken);
                        a aVar2 = a.this;
                        AnonymousClass1 r1 = AnonymousClass1.this;
                        RecInfoManager.d(RecInfoManager.this, r1.val$isPageUp, r1.val$pageIndex, this.f7127a.f7233a, aVar2.f7126a, r1.val$requestToken, r1.val$listener);
                    } else {
                        txj.e(txj.TAG_DATA, "NdRecManagerCB旧链路 getRecData.onSuccess.dealSuc requestToken:" + AnonymousClass1.this.val$requestToken);
                        a aVar3 = a.this;
                        AnonymousClass1 r12 = AnonymousClass1.this;
                        RecInfoManager.e(RecInfoManager.this, r12.val$isPageUp, r12.val$pageIndex, this.f7127a.f7233a, aVar3.f7126a, r12.val$requestToken, r12.val$listener, r12.val$isRealtimeRequest);
                    }
                }
            }

            public a(MtopResponse mtopResponse) {
                this.f7126a = mtopResponse;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/data/net/recommend/RecInfoManager$1$1");
            }

            @Override // tb.r19.e
            public String c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
                }
                return "preCheckMtopDataForAsync";
            }

            @Override // tb.r19.e
            public void d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9425d337", new Object[]{this});
                    return;
                }
                txj.e(txj.TAG_DATA, "NdInsertCard 网络请求回来。 requestToken:" + AnonymousClass1.this.val$requestToken);
                o2r.a("preCheckMtopData");
                MtopResponse mtopResponse = this.f7126a;
                AnonymousClass1 r1 = AnonymousClass1.this;
                a.C0395a h = com.taobao.android.detail2.core.optimize.preload.a.h(mtopResponse, r1.val$isPageUp, r1.val$pageIndex, RecInfoManager.c(RecInfoManager.this));
                o2r.b();
                r19.d0().post(new C0390a(h));
                if (!h.f || h.f7233a == null) {
                    q0j.q("recommend", h.c, h.d, RecInfoManager.b(RecInfoManager.this).j().T(), "", h.e);
                } else {
                    mbq.b("new_detail", this.f7126a);
                }
            }
        }

        public AnonymousClass1(boolean z, boolean z2, int i, b bVar, String str) {
            this.val$isRealtimeRequest = z;
            this.val$isPageUp = z2;
            this.val$pageIndex = i;
            this.val$listener = bVar;
            this.val$requestToken = str;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            RecInfoManager.a(RecInfoManager.this, this.val$isPageUp, this.val$pageIndex, mtopResponse, this.val$listener, this.val$isRealtimeRequest);
            mbq.a("new_detail", mtopResponse);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            o2r.a("request_onSuccess");
            if (this.val$isRealtimeRequest) {
                q0j.g("eventProcess", q0j.UMBRELLA_TAG_INSERT_CARD_MTOP_SUC, null);
            }
            if (!this.val$isPageUp && this.val$pageIndex == 0) {
                q0j.x(RecInfoManager.b(RecInfoManager.this).h(), q0j.SECTION_FIRST_TPP_REQUEST, "");
                q0j.z(RecInfoManager.b(RecInfoManager.this).h(), q0j.SECTION_FIRST_TPP_REQUEST_PARSE, "");
            }
            if (r19.u0()) {
                mqj.j(new a(mtopResponse));
                o2r.b();
                return;
            }
            JSONObject h = RecInfoManager.h(RecInfoManager.this, this.val$isPageUp, this.val$pageIndex, mtopResponse, this.val$listener, this.val$isRealtimeRequest);
            if (h == null) {
                o2r.b();
                return;
            }
            if (RecInfoManager.this.o()) {
                txj.e(txj.TAG_DATA, "NdRecManagerCB新链路 noAsyncParse.getRecData.onSuccess.dealSuc");
                RecInfoManager.d(RecInfoManager.this, this.val$isPageUp, this.val$pageIndex, h, mtopResponse, this.val$requestToken, this.val$listener);
            } else {
                txj.e(txj.TAG_DATA, "NdRecManagerCB旧链路 noAsyncParse.getRecData.onSuccess.dealSuc");
                RecInfoManager.e(RecInfoManager.this, this.val$isPageUp, this.val$pageIndex, h, mtopResponse, this.val$requestToken, this.val$listener, this.val$isRealtimeRequest);
            }
            mbq.b("new_detail", mtopResponse);
            o2r.b();
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            if (this.val$isRealtimeRequest) {
                q0j.g("eventProcess", q0j.UMBRELLA_TAG_INSERT_CARD_MTOP_ERR, null);
            }
            RecInfoManager.a(RecInfoManager.this, this.val$isPageUp, this.val$pageIndex, mtopResponse, this.val$listener, this.val$isRealtimeRequest);
            mbq.a("new_detail", mtopResponse);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f7128a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ JSONArray c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ MtopResponse e;
        public final /* synthetic */ String f;

        public a(b bVar, boolean z, JSONArray jSONArray, JSONObject jSONObject, MtopResponse mtopResponse, String str) {
            this.f7128a = bVar;
            this.b = z;
            this.c = jSONArray;
            this.d = jSONObject;
            this.e = mtopResponse;
            this.f = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f7128a.a(this.b, this.c, this.d, this.e, this.f);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(boolean z, JSONArray jSONArray, JSONObject jSONObject, MtopResponse mtopResponse, String str);

        void b(boolean z, int i, String str);
    }

    static {
        t2o.a(352321822);
    }

    public RecInfoManager(cxj cxjVar) {
        this.b = cxjVar;
    }

    public static /* synthetic */ void a(RecInfoManager recInfoManager, boolean z, int i, MtopResponse mtopResponse, b bVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb103538", new Object[]{recInfoManager, new Boolean(z), new Integer(i), mtopResponse, bVar, new Boolean(z2)});
        } else {
            recInfoManager.i(z, i, mtopResponse, bVar, z2);
        }
    }

    public static /* synthetic */ cxj b(RecInfoManager recInfoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("f83e9c57", new Object[]{recInfoManager});
        }
        return recInfoManager.b;
    }

    public static /* synthetic */ h5o c(RecInfoManager recInfoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h5o) ipChange.ipc$dispatch("9cfcb66", new Object[]{recInfoManager});
        }
        return recInfoManager.f7125a;
    }

    public static /* synthetic */ void d(RecInfoManager recInfoManager, boolean z, int i, JSONObject jSONObject, MtopResponse mtopResponse, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6207a7f", new Object[]{recInfoManager, new Boolean(z), new Integer(i), jSONObject, mtopResponse, str, bVar});
        } else {
            recInfoManager.k(z, i, jSONObject, mtopResponse, str, bVar);
        }
    }

    public static /* synthetic */ void e(RecInfoManager recInfoManager, boolean z, int i, JSONObject jSONObject, MtopResponse mtopResponse, String str, b bVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f7a1af6", new Object[]{recInfoManager, new Boolean(z), new Integer(i), jSONObject, mtopResponse, str, bVar, new Boolean(z2)});
        } else {
            recInfoManager.j(z, i, jSONObject, mtopResponse, str, bVar, z2);
        }
    }

    public static /* synthetic */ void f(RecInfoManager recInfoManager, boolean z, int i, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3558abc", new Object[]{recInfoManager, new Boolean(z), new Integer(i), str, bVar});
        } else {
            recInfoManager.r(z, i, str, bVar);
        }
    }

    public static /* synthetic */ void g(RecInfoManager recInfoManager, boolean z, int i, String str, b bVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dba4477", new Object[]{recInfoManager, new Boolean(z), new Integer(i), str, bVar, new Boolean(z2)});
        } else {
            recInfoManager.q(z, i, str, bVar, z2);
        }
    }

    public static /* synthetic */ JSONObject h(RecInfoManager recInfoManager, boolean z, int i, MtopResponse mtopResponse, b bVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a2606c71", new Object[]{recInfoManager, new Boolean(z), new Integer(i), mtopResponse, bVar, new Boolean(z2)});
        }
        return recInfoManager.s(z, i, mtopResponse, bVar, z2);
    }

    public final void i(boolean z, int i, MtopResponse mtopResponse, b bVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8367e2", new Object[]{this, new Boolean(z), new Integer(i), mtopResponse, bVar, new Boolean(z2)});
            return;
        }
        if (o()) {
            txj.e(txj.TAG_DATA, "NdRecManagerCB新链路 dealMtopError notifyFail");
            r(z, i, mtopResponse.getRetMsg(), bVar);
        } else {
            q(z, i, mtopResponse.getRetMsg(), bVar, z2);
        }
        q0j.g("eventProcess", q0j.UMBRELLA_TAG_REQUEST_FAIL, null);
        if ("FAIL_SYS_SERVICE_TIMEOUT".equals(mtopResponse.getRetCode())) {
            q0j.g("eventProcess", q0j.UMBRELLA_TAG_REQUEST_TIME_OUT, null);
        }
    }

    public final void j(boolean z, int i, JSONObject jSONObject, MtopResponse mtopResponse, String str, b bVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac11d2d", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, mtopResponse, str, bVar, new Boolean(z2)});
        } else if (z2 && n()) {
            txj.e(txj.TAG_DATA, "NdRecManagerCB旧链路 仅实时插卡升级 dealMtopSuccess requestToken:" + str);
            k(z, i, jSONObject, mtopResponse, str, bVar);
        } else if (r19.O0()) {
            l(z, i, jSONObject, mtopResponse, str, bVar, z2);
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("sectionList");
            if (jSONArray == null || jSONArray.isEmpty()) {
                q(z, i, "no more items", bVar, z2);
                return;
            }
            ArrayList arrayList = new ArrayList();
            while (((ArrayDeque) this.c).peek() != null) {
                arrayList.add((b) ((ArrayDeque) this.c).poll());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((b) it.next()).a(z, jSONArray, jSONObject, mtopResponse, str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public final void k(boolean z, int i, JSONObject jSONObject, MtopResponse mtopResponse, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60d98c8", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, mtopResponse, str, bVar});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("sectionList");
        if (jSONArray == null || jSONArray.isEmpty()) {
            r(z, i, "no more items", bVar);
            return;
        }
        try {
            bVar.a(z, jSONArray, jSONObject, mtopResponse, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((ArrayDeque) this.c).clear();
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a79c0398", new Object[]{this})).booleanValue();
        }
        return this.b.j().e();
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("871de598", new Object[]{this})).booleanValue();
        }
        return this.b.j().g();
    }

    public void p(boolean z, int i, RecRequestParamsV2 recRequestParamsV2, b bVar, boolean z2, boolean z3, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626896f", new Object[]{this, new Boolean(z), new Integer(i), recRequestParamsV2, bVar, new Boolean(z2), new Boolean(z3), str});
        } else if (x(z, i, bVar)) {
            if (o()) {
                txj.e(txj.TAG_DATA, "NdRecManagerCB新链路 getRecData requestToken:" + str);
            } else if (!z3 || !n()) {
                txj.e(txj.TAG_DATA, "NdRecManagerCB旧链路 getRecData requestToken:" + str);
                ((ArrayDeque) this.c).offer(bVar);
            } else {
                txj.e(txj.TAG_DATA, "NdRecManagerCB旧链路 仅实时插卡升级 getRecData requestToken:" + str);
            }
            RecRequestParamsV2 a2 = com.taobao.android.detail2.core.optimize.preload.a.a(recRequestParamsV2, this.b.j(), this.f7125a, i);
            if (i == 0) {
                str2 = "NewNewDetailFirst";
            } else {
                str2 = "NewNewDetailNext";
            }
            zg7 zg7Var = new zg7(this.b.i(), a2, str2, z2);
            if (z3) {
                q0j.g("eventProcess", q0j.UMBRELLA_TAG_INSERT_CARD_MTOP_START, null);
            }
            zg7Var.d(new AnonymousClass1(z3, z, i, bVar, str));
            w(z, i);
            zg7Var.b();
        }
    }

    public final void q(boolean z, int i, String str, b bVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3624bf", new Object[]{this, new Boolean(z), new Integer(i), str, bVar, new Boolean(z2)});
        } else if (!z2 || !n()) {
            ArrayList arrayList = new ArrayList();
            while (((ArrayDeque) this.c).peek() != null) {
                arrayList.add((b) ((ArrayDeque) this.c).poll());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((b) it.next()).b(z, i, str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } else {
            txj.e(txj.TAG_DATA, "NdRecManagerCB旧链路 仅实时插卡升级 notifyLoadFailed requestToken");
            r(z, i, str, bVar);
        }
    }

    public final void r(boolean z, int i, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a10094", new Object[]{this, new Boolean(z), new Integer(i), str, bVar});
            return;
        }
        try {
            bVar.b(z, i, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void t(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec83c879", new Object[]{this, str, jSONObject});
        } else {
            this.f7125a.i.put(str, (Object) jSONObject);
        }
    }

    public void u(h5o h5oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1130076f", new Object[]{this, h5oVar});
        } else {
            this.f7125a = h5oVar;
        }
    }

    public final void v(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc07587", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("passParams");
        if (jSONObject2 != null) {
            this.f7125a.h = jSONObject2;
        }
    }

    public final void w(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92475b80", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        if (!z && i == 0) {
            q0j.x(this.b.h(), q0j.SECTION_CONTAINER_INIT, "");
            q0j.z(this.b.h(), q0j.SECTION_FIRST_TPP_REQUEST, "");
            q0j.g("eventProcess", q0j.UMBRELLA_TAG_FIRST_PAGE_REQUEST, null);
        }
        q0j.g("eventProcess", q0j.UMBRELLA_TAG_REQUEST, null);
    }

    public final boolean x(boolean z, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bff1edc3", new Object[]{this, new Boolean(z), new Integer(i), bVar})).booleanValue();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        if (bVar != null) {
            try {
                bVar.b(z, i, "please call method in main thread");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public final void l(boolean z, int i, JSONObject jSONObject, MtopResponse mtopResponse, String str, b bVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f0899c", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, mtopResponse, str, bVar, new Boolean(z2)});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("sectionList");
        if (jSONArray == null || jSONArray.isEmpty()) {
            q(z, i, "no more items", bVar, z2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (((ArrayDeque) this.c).peek() != null) {
            arrayList.add((b) ((ArrayDeque) this.c).poll());
        }
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            r19.d0().postDelayed(new a((b) it.next(), z, jSONArray, jSONObject, mtopResponse, str), (2 * j) + 1);
            j++;
        }
    }

    @Deprecated
    public final JSONObject s(boolean z, int i, MtopResponse mtopResponse, b bVar, boolean z2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8b65bac5", new Object[]{this, new Boolean(z), new Integer(i), mtopResponse, bVar, new Boolean(z2)});
        }
        try {
            jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
        } catch (Throwable th) {
            th.printStackTrace();
            jSONObject = null;
        }
        String g = zxu.g(mtopResponse);
        if (jSONObject == null || jSONObject.keySet().size() == 0) {
            if (o()) {
                txj.e(txj.TAG_DATA, "NdRecManagerCB新链路 preCheckMtopData notifyFail01");
                r(z, i, "empty data", bVar);
            } else {
                q(z, i, "empty data", bVar, z2);
            }
            q0j.q("recommend", q0j.ERROR_CODE_RECOMMEND_DATA_EMPTY, "推荐data数据为空, itemId: " + this.f7125a.j + ", isPageUp: " + z + ", pageIndex: " + i, this.b.j().T(), "", g);
            return jSONObject;
        }
        v(jSONObject);
        if (jSONObject.getJSONArray("sectionList") != null) {
            return jSONObject;
        }
        if (o()) {
            txj.e(txj.TAG_DATA, "NdRecManagerCB新链路 preCheckMtopData notifyFail02");
            r(z, i, "empty sectionList", bVar);
        } else {
            q(z, i, "empty sectionList", bVar, z2);
        }
        q0j.q("recommend", q0j.ERROR_CODE_RECOMMEND_SECTION_EMPTY, "推荐section列表数据为空, itemId: " + this.f7125a.j + ", isPageUp: " + z + ", pageIndex: " + i, this.b.j().T(), "", g);
        return null;
    }
}
