package com.taobao.android.detail2.core.optimize.preload;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.net.prerequest.PreRequestParams;
import com.taobao.android.detail2.core.optimize.preload.a;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.byj;
import tb.fbh;
import tb.g8n;
import tb.h5o;
import tb.o2r;
import tb.o8n;
import tb.oj7;
import tb.r19;
import tb.t2o;
import tb.txj;
import tb.ue7;
import tb.y9a;
import tb.ynm;
import tb.zg7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NavPreRequestManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static NavPreRequestManager c;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, d> f7227a = new HashMap();
    public final ReentrantLock b = new ReentrantLock();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class NavPreRequestOpenImmedListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, d> mRequestMap;
        private String mToken;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f7229a;
            public final /* synthetic */ a.C0395a b;

            public a(d dVar, a.C0395a aVar) {
                this.f7229a = dVar;
                this.b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NavPreRequestOpenImmedListener navPreRequestOpenImmedListener = NavPreRequestOpenImmedListener.this;
                NavPreRequestManager.g(NavPreRequestManager.this, this.f7229a, NavPreRequestOpenImmedListener.access$400(navPreRequestOpenImmedListener), this.b);
            }
        }

        static {
            t2o.a(352322197);
            t2o.a(589299719);
        }

        public NavPreRequestOpenImmedListener(String str, Map<String, d> map) {
            this.mToken = str;
            this.mRequestMap = map;
        }

        public static /* synthetic */ String access$400(NavPreRequestOpenImmedListener navPreRequestOpenImmedListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b6a73bb6", new Object[]{navPreRequestOpenImmedListener});
            }
            return navPreRequestOpenImmedListener.mToken;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                NavPreRequestManager.f(NavPreRequestManager.this, this.mToken, mtopResponse.getRetMsg());
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            d dVar = this.mRequestMap.get(this.mToken);
            if (dVar != null && !dVar.c) {
                r19.d0().post(new a(dVar, com.taobao.android.detail2.core.optimize.preload.a.g(mtopResponse)));
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                NavPreRequestManager.f(NavPreRequestManager.this, this.mToken, mtopResponse.getRetMsg());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f7230a;
        public final /* synthetic */ String b;

        public a(d dVar, String str) {
            this.f7230a = dVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NavPreRequestManager.e(NavPreRequestManager.this, this.f7230a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f7231a;
        public final /* synthetic */ String b;

        public b(d dVar, String str) {
            this.f7231a = dVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NavPreRequestManager.h(NavPreRequestManager.this, this.f7231a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f7232a = 0;
        public int b = 0;
        public boolean c;
        public JSONObject d;
        public String e;
        public JSONObject f;
        public c g;
        public h5o h;
        public HandlerThread i;
        public zg7 j;
        public zg7 k;
        public boolean l;
        public boolean m;

        static {
            t2o.a(352322199);
        }

        public d() {
            IpChange ipChange = NavPreRequestManager.$ipChange;
        }
    }

    static {
        t2o.a(352322191);
    }

    public static /* synthetic */ void c(NavPreRequestManager navPreRequestManager, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6e1657", new Object[]{navPreRequestManager, str, str2});
        } else {
            navPreRequestManager.o(str, str2);
        }
    }

    public static /* synthetic */ void d(NavPreRequestManager navPreRequestManager, d dVar, a.C0395a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbe2ae9", new Object[]{navPreRequestManager, dVar, aVar});
        } else {
            navPreRequestManager.u(dVar, aVar);
        }
    }

    public static /* synthetic */ void e(NavPreRequestManager navPreRequestManager, d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("377eb46", new Object[]{navPreRequestManager, dVar, str});
        } else {
            navPreRequestManager.t(dVar, str);
        }
    }

    public static /* synthetic */ void f(NavPreRequestManager navPreRequestManager, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5169a0b4", new Object[]{navPreRequestManager, str, str2});
        } else {
            navPreRequestManager.n(str, str2);
        }
    }

    public static /* synthetic */ void g(NavPreRequestManager navPreRequestManager, d dVar, String str, a.C0395a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb188b1b", new Object[]{navPreRequestManager, dVar, str, aVar});
        } else {
            navPreRequestManager.s(dVar, str, aVar);
        }
    }

    public static /* synthetic */ void h(NavPreRequestManager navPreRequestManager, d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4fe714a", new Object[]{navPreRequestManager, dVar, str});
        } else {
            navPreRequestManager.r(dVar, str);
        }
    }

    public static NavPreRequestManager l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavPreRequestManager) ipChange.ipc$dispatch("12108a9c", new Object[0]);
        }
        if (c == null) {
            c = new NavPreRequestManager();
        }
        return c;
    }

    public void A(Context context, com.taobao.android.detail2.core.framework.data.global.a aVar, ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf28439", new Object[]{this, context, aVar, ue7Var});
            return;
        }
        try {
            try {
                this.b.lock();
                txj.e(txj.TAG_RENDER, "startRealRequestWhenNav Lock acquired. Performing task.");
                txj.e(txj.TAG_RENDER, "startRealRequestWhenNav, token: " + aVar.G());
                if (aVar.M() != null && aVar.M().d(aVar.R().x)) {
                    z(context, aVar.G(), aVar, ue7Var);
                }
            } catch (Exception unused) {
                Thread.currentThread().interrupt();
                txj.e(txj.TAG_RENDER, "Thread was interrupted.");
            }
        } finally {
            this.b.unlock();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa6bd57", new Object[]{this, str});
            return;
        }
        d dVar = (d) ((HashMap) this.f7227a).get(str);
        if (dVar == null) {
            dVar = new d();
            ((HashMap) this.f7227a).put(str, dVar);
        }
        dVar.m = true;
        zg7 zg7Var = dVar.j;
        if (zg7Var != null) {
            zg7Var.a();
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee4feed", new Object[]{this, str});
            return;
        }
        d dVar = (d) ((HashMap) this.f7227a).get(str);
        if (dVar == null) {
            dVar = new d();
            ((HashMap) this.f7227a).put(str, dVar);
        }
        dVar.l = true;
        zg7 zg7Var = dVar.k;
        if (zg7Var != null) {
            zg7Var.a();
        }
    }

    public final JSONArray i(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b80f7d28", new Object[]{this, intent});
        }
        if (intent == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        String str = new fbh().g(y9a.b()).c;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> g = g8n.g(o8n.a(intent.getData()), byj.GUIDE_PRELOAD_PARAMS_BLACKLIST, byj.DEFAULT_GUIDE_PRELOAD_PARAMS_BLACKLIST);
        if (!TextUtils.isEmpty(str) && !"0".equals(str)) {
            g.put(g8n.B, str);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("queryParams", (Object) g);
        jSONObject.put("bizParams", (Object) jSONObject2);
        String b2 = o8n.b(intent);
        if (TextUtils.isEmpty(b2)) {
            txj.e(txj.TAG_RENDER, "nav阶段预请求构建id为空，直接返回");
            return null;
        }
        jSONObject.put("itemId", (Object) b2);
        jSONArray.add(jSONObject);
        return jSONArray;
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60d430b", new Object[]{this, str});
            return;
        }
        d dVar = (d) ((HashMap) this.f7227a).get(str);
        if (dVar != null) {
            if (dVar.i != null) {
                txj.e(txj.TAG_RENDER, str + " NavPreRequestManager线程quitSafely");
                dVar.i.quitSafely();
            }
            zg7 zg7Var = dVar.j;
            if (zg7Var != null) {
                zg7Var.a();
            }
            zg7 zg7Var2 = dVar.k;
            if (zg7Var2 != null) {
                zg7Var2.a();
            }
            ((HashMap) this.f7227a).remove(str);
        }
    }

    public h5o k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h5o) ipChange.ipc$dispatch("6411a284", new Object[]{this, str});
        }
        d dVar = (d) ((HashMap) this.f7227a).get(str);
        if (dVar == null) {
            return null;
        }
        return dVar.h;
    }

    public ReentrantLock m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantLock) ipChange.ipc$dispatch("1e33ae04", new Object[]{this});
        }
        return this.b;
    }

    public final void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b5dad2", new Object[]{this, str, str2});
            return;
        }
        d dVar = (d) ((HashMap) this.f7227a).get(str);
        if (dVar != null) {
            r19.d0().post(new b(dVar, str2));
        }
    }

    public final void o(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df8a9628", new Object[]{this, str, str2});
            return;
        }
        txj.e(txj.TAG_RENDER, "handleRealDataFailed, token: " + str + ", msg: " + str2);
        d dVar = (d) ((HashMap) this.f7227a).get(str);
        if (dVar != null) {
            dVar.c = true;
            r19.d0().post(new a(dVar, str2));
        }
    }

    public boolean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("379254be", new Object[]{this, str})).booleanValue();
        }
        d dVar = (d) ((HashMap) this.f7227a).get(str);
        if (dVar == null || dVar.f7232a == 0) {
            return false;
        }
        return true;
    }

    public boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d13fc28", new Object[]{this, str})).booleanValue();
        }
        d dVar = (d) ((HashMap) this.f7227a).get(str);
        if (dVar == null || dVar.b == 0) {
            return false;
        }
        return true;
    }

    public final void r(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9af4d64", new Object[]{this, dVar, str});
        } else {
            dVar.f7232a = e;
        }
    }

    public final void s(d dVar, String str, a.C0395a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d260088", new Object[]{this, dVar, str, aVar});
            return;
        }
        txj.e(txj.TAG_RENDER, "notifyOpenImmedDataSuccess: " + str);
        dVar.f7232a = f;
        JSONObject jSONObject = aVar.f7233a;
        dVar.f = jSONObject;
        c cVar = dVar.g;
        if (cVar != null) {
            ((DetailDataManager.e) cVar).a(jSONObject);
        }
    }

    public final void t(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a64cd2", new Object[]{this, dVar, str});
            return;
        }
        dVar.b = e;
        c cVar = dVar.g;
        if (cVar != null) {
            ((DetailDataManager.e) cVar).c(str);
        }
    }

    public final void u(d dVar, a.C0395a aVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9bce00", new Object[]{this, dVar, aVar});
            return;
        }
        txj.e(txj.TAG_RENDER, "NavRequestNotifyRealDataSuccess");
        if (!aVar.f || (jSONObject = aVar.f7233a) == null) {
            t(dVar, aVar.b);
            return;
        }
        com.taobao.android.detail2.core.optimize.preload.a.k(jSONObject, dVar.h);
        dVar.b = f;
        JSONObject jSONObject2 = aVar.f7233a;
        dVar.d = jSONObject2;
        String str = aVar.e;
        dVar.e = str;
        c cVar = dVar.g;
        if (cVar != null) {
            ((DetailDataManager.e) cVar).d(jSONObject2, str);
        }
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20f8d5b", new Object[]{this, str});
            return;
        }
        d dVar = (d) ((HashMap) this.f7227a).get(str);
        if (dVar == null) {
            dVar = new d();
            ((HashMap) this.f7227a).put(str, dVar);
        }
        if (dVar.i == null) {
            HandlerThread handlerThread = new HandlerThread("NewDetailPreRealRequestCallbackThread");
            dVar.i = handlerThread;
            handlerThread.start();
        }
    }

    public void w(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1483e808", new Object[]{this, str, cVar});
            return;
        }
        d dVar = (d) ((HashMap) this.f7227a).get(str);
        if (dVar == null) {
            dVar = new d();
            ((HashMap) this.f7227a).put(str, dVar);
        }
        dVar.g = cVar;
        JSONObject jSONObject = dVar.d;
        if (jSONObject == null) {
            JSONObject jSONObject2 = dVar.f;
            if (jSONObject2 != null && cVar != null) {
                ((DetailDataManager.e) cVar).a(jSONObject2);
            }
        } else if (cVar != null) {
            ((DetailDataManager.e) cVar).d(jSONObject, dVar.e);
        }
    }

    public void x(Context context, Intent intent, com.taobao.android.detail2.core.framework.data.global.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d864ba7", new Object[]{this, context, intent, aVar});
            return;
        }
        try {
            try {
                this.b.lock();
                txj.e(txj.TAG_RENDER, "startAllRequestWhenNav Lock acquired. Performing task.");
                txj.e(txj.TAG_RENDER, "startAllRequestWhenNav, token: " + aVar.G());
                if (aVar.M() != null && aVar.M().e(aVar.R().x)) {
                    y(intent, aVar, aVar.G());
                }
                if (aVar.M() != null && aVar.M().d(aVar.R().x)) {
                    z(context, aVar.G(), aVar, null);
                }
            } catch (Exception unused) {
                Thread.currentThread().interrupt();
                txj.e(txj.TAG_RENDER, "Thread was interrupted.");
            }
            this.b.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public final void y(Intent intent, com.taobao.android.detail2.core.framework.data.global.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c7463", new Object[]{this, intent, aVar, str});
            return;
        }
        txj.e(txj.TAG_RENDER, "startOpenImmedRequest : " + str);
        if (intent == null) {
            txj.e(txj.TAG_RENDER, "startOpenImmedRequest intent == null return : " + str);
            return;
        }
        d dVar = (d) ((HashMap) this.f7227a).get(str);
        if (dVar == null) {
            dVar = new d();
            ((HashMap) this.f7227a).put(str, dVar);
        }
        if (dVar.m) {
            txj.e(txj.TAG_RENDER, "startOpenImmedRequest isAbandon : " + str);
            return;
        }
        if (dVar.i == null) {
            HandlerThread handlerThread = new HandlerThread("NewDetailPreRealRequestCallbackThread");
            dVar.i = handlerThread;
            handlerThread.start();
        }
        PreRequestParams preRequestParams = new PreRequestParams();
        JSONArray i = i(intent);
        if (i == null) {
            txj.e(txj.TAG_RENDER, "nav阶段预请求batchparams为空，直接返回，不发起瞬开预请求:" + str);
            return;
        }
        preRequestParams.setBatchParams(i);
        preRequestParams.setNewDetailChannel(ynm.d(intent.getData()));
        preRequestParams.setNewDetailVisibleSizeInfo(oj7.e(aVar));
        preRequestParams.setNavRequest(true);
        if (aVar.R().k()) {
            preRequestParams.setRecAppId(PreRequestParams.REC_APP_ID);
        }
        zg7 zg7Var = new zg7(y9a.b(), preRequestParams, "NewDetailPreloadNav", aVar.M().f(aVar.R().x));
        dVar.j = zg7Var;
        zg7Var.c(new Handler(dVar.i.getLooper()));
        zg7Var.d(new NavPreRequestOpenImmedListener(str, this.f7227a));
        txj.e(txj.TAG_RENDER, "startOpenImmedRequest调用,发起mtop调用" + str);
        zg7Var.b();
        dVar.f7232a = d;
    }

    public final void z(Context context, final String str, com.taobao.android.detail2.core.framework.data.global.a aVar, ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3ac04", new Object[]{this, context, str, aVar, ue7Var});
            return;
        }
        txj.e(txj.TAG_RENDER, "startRealRequest, token: " + str);
        o2r.a("startRealRequest");
        final h5o c2 = com.taobao.android.detail2.core.optimize.preload.a.c(aVar, ue7Var, false);
        d dVar = (d) ((HashMap) this.f7227a).get(str);
        if (dVar == null) {
            dVar = new d();
            ((HashMap) this.f7227a).put(str, dVar);
        }
        if (dVar.l) {
            txj.e(txj.TAG_RENDER, "abandon startRealRequest, token: " + str);
            return;
        }
        dVar.h = c2;
        if (dVar.i == null) {
            HandlerThread handlerThread = new HandlerThread("NewDetailPreRealRequestCallbackThread");
            dVar.i = handlerThread;
            handlerThread.start();
        }
        zg7 zg7Var = new zg7(context, c2.k, "NewNewDetailFirst", aVar.M().f(aVar.R().x));
        dVar.k = zg7Var;
        zg7Var.c(new Handler(dVar.i.getLooper()));
        zg7Var.d(new IRemoteBaseListener() { // from class: com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager$1$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ d f7228a;
                public final /* synthetic */ a.C0395a b;

                public a(d dVar, a.C0395a aVar) {
                    this.f7228a = dVar;
                    this.b = aVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NavPreRequestManager.d(NavPreRequestManager.this, this.f7228a, this.b);
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    NavPreRequestManager.c(NavPreRequestManager.this, str, mtopResponse.getRetMsg());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                txj.e(txj.TAG_RENDER, "onNavRealRequestMtopSuccess");
                d dVar2 = (d) ((HashMap) NavPreRequestManager.this.f7227a).get(str);
                if (dVar2 == null) {
                    txj.e(txj.TAG_RENDER, "onNavRealRequestMtopSuccessStatusNUll");
                    return;
                }
                dVar2.c = true;
                a.C0395a h = com.taobao.android.detail2.core.optimize.preload.a.h(mtopResponse, false, com.taobao.android.detail2.core.optimize.preload.a.e(false, dVar2.h), c2);
                txj.e(txj.TAG_RENDER, "onNavRealRequestMtopSuccessBeforeMainPost");
                r19.d0().post(new a(dVar2, h));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    NavPreRequestManager.c(NavPreRequestManager.this, str, mtopResponse.getRetMsg());
                }
            }
        });
        o2r.a("realClient.execute");
        zg7Var.b();
        dVar.b = d;
        o2r.b();
        o2r.b();
    }
}
