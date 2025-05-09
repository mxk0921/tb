package tb;

import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.IRemoteExtendListener;
import com.taobao.taolive.sdk.thread.ThreadPoolType;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_BUINESS_ARG = "time=%d;source=java";
    public static final String MONITOR_MOUDLE = "taolive";
    public static final JSONArray k = new JSONArray();

    /* renamed from: a  reason: collision with root package name */
    public b0d f24935a;
    public IRemoteExtendListener b;
    public NetRequest c;
    public boolean d;
    public long e;
    public String f;
    public final String g;
    public final String h;
    public HashMap<String, String> i;
    public a j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends AsyncTask<Void, Void, y6j> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f24936a;
        public final boolean b;
        public final Class<?> c;
        public final boolean d;

        static {
            t2o.a(806355964);
        }

        public a(int i, Class<?> cls, boolean z, boolean z2) {
            this.f24936a = i;
            this.b = z;
            this.c = cls;
            this.d = z2;
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("93826a23", new Object[]{aVar})).booleanValue();
            }
            return aVar.d;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/BaseDetailBusiness$RequestTask");
        }

        /* renamed from: c */
        public void onPostExecute(y6j y6jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8167a941", new Object[]{this, y6jVar});
            } else if (!this.d) {
                d(y6jVar);
            } else {
                TLog.loge("tblive", "BaseDetailBusiness", "worker thread 已经完成回调");
            }
        }

        /* renamed from: b */
        public y6j doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y6j) ipChange.ipc$dispatch("15a223a3", new Object[]{this, voidArr});
            }
            try {
                if (!(nt1.e(nt1.this) == null || v2s.o().w() == null)) {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(nt1.f(nt1.this))) {
                        hashMap.put(p1t.kLiveMtopBizCodeKey, nt1.f(nt1.this));
                    }
                    if (!TextUtils.isEmpty(nt1.i(nt1.this))) {
                        hashMap.put("x-m-biz-live-biztoken", nt1.i(nt1.this));
                    }
                    if ((zxg.LIVE_DETAIL_QUERY.equals(nt1.e(nt1.this).getApiName()) || zxg.LIVE_DETAIL.equals(nt1.e(nt1.this).getApiName())) && v2s.o().f() != null) {
                        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "live");
                        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, "source=" + v2s.o().f().getAppName(null));
                    }
                    if (nt1.j(nt1.this) != null) {
                        hashMap.putAll(nt1.j(nt1.this));
                    }
                    nt1.e(nt1.this).setRequestHeaders(hashMap);
                    nt1.e(nt1.this).setUseWua(this.b);
                    if (nt1.k(nt1.this) != null) {
                        nt1.e(nt1.this).setRequestNotifyHandler(nt1.k(nt1.this));
                    }
                    if (iw0.j(v2s.o().f().getApplication())) {
                        cwd A = v2s.o().A();
                        A.c(cwd.LOG_TAG, "request " + JSON.toJSONString(nt1.e(nt1.this)));
                    }
                    NetResponse a2 = v2s.o().w().a(nt1.e(nt1.this));
                    y6j y6jVar = new y6j();
                    y6jVar.f31880a = System.currentTimeMillis();
                    y6jVar.d = a2;
                    if (a2.isApiSuccess()) {
                        y6jVar.b = System.currentTimeMillis();
                        if (!(this.c == null || a2.getBytedata() == null || a2.getBytedata().length <= 0)) {
                            y6jVar.e = (NetBaseOutDo) JSON.parseObject(a2.getBytedata(), this.c, new Feature[0]);
                        }
                        y6jVar.c = System.currentTimeMillis();
                    }
                    nt1.this.getClass();
                    if (this.d) {
                        d(y6jVar);
                    }
                    return y6jVar;
                }
                return null;
            } catch (Exception e) {
                o3s.c("BaseDetailBusiness", "do in background error ", e);
                nt1.this.getClass();
                return null;
            }
        }

        public final void d(y6j y6jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("314127ff", new Object[]{this, y6jVar});
            } else if (y6jVar == null) {
                if (nt1.l(nt1.this)) {
                    String format = String.format("time=%d;source=java", Long.valueOf(System.currentTimeMillis() - nt1.m(nt1.this)));
                    if (v2s.o().e() != null) {
                        v2s.o().e().commitFail("taolive", nt1.n(nt1.this), format, "0", "response is null 2");
                    }
                }
                nt1 nt1Var = nt1.this;
                b0d b0dVar = nt1Var.f24935a;
                if (b0dVar != null) {
                    b0dVar.onError(this.f24936a, null, nt1Var);
                }
            } else {
                nt1.o(nt1.this, y6jVar);
                String format2 = String.format("time=%d;source=java", Long.valueOf(System.currentTimeMillis() - nt1.m(nt1.this)));
                NetResponse netResponse = y6jVar.d;
                if (netResponse == null) {
                    if (nt1.l(nt1.this) && v2s.o().e() != null) {
                        v2s.o().e().commitFail("taolive", nt1.n(nt1.this), format2, "response is null");
                    }
                    nt1 nt1Var2 = nt1.this;
                    b0d b0dVar2 = nt1Var2.f24935a;
                    if (b0dVar2 != null) {
                        b0dVar2.onError(this.f24936a, null, nt1Var2);
                    }
                } else if (netResponse.isApiSuccess()) {
                    NetBaseOutDo netBaseOutDo = y6jVar.e;
                    if (nt1.l(nt1.this) && v2s.o().e() != null) {
                        v2s.o().e().commitSuccess("taolive", nt1.n(nt1.this), format2);
                    }
                    if (nt1.q()) {
                        try {
                            nt1 nt1Var3 = nt1.this;
                            nt1.p(nt1Var3, this.f24936a, y6jVar, netBaseOutDo, nt1Var3);
                        } catch (Throwable th) {
                            igq.n().p("mtopCrash", igq.n().k(th));
                        }
                    } else {
                        nt1 nt1Var4 = nt1.this;
                        nt1.p(nt1Var4, this.f24936a, y6jVar, netBaseOutDo, nt1Var4);
                    }
                } else {
                    if (nt1.l(nt1.this) && v2s.o().e() != null) {
                        v2s.o().e().commitFail("taolive", nt1.n(nt1.this), format2, y6jVar.d.getRetCode(), y6jVar.d.getRetMsg());
                    }
                    if (qsj.h(y6jVar.d)) {
                        nt1 nt1Var5 = nt1.this;
                        nt1.g(nt1Var5, this.f24936a, y6jVar.d, nt1Var5);
                    } else if (qsj.i(y6jVar.d)) {
                        nt1 nt1Var6 = nt1.this;
                        nt1.g(nt1Var6, this.f24936a, y6jVar.d, nt1Var6);
                    } else {
                        nt1 nt1Var7 = nt1.this;
                        nt1.h(nt1Var7, this.f24936a, y6jVar.d, nt1Var7);
                    }
                }
            }
        }
    }

    static {
        t2o.a(806355963);
    }

    public nt1(b0d b0dVar) {
        this(b0dVar, "TAOBAO", null);
    }

    public static /* synthetic */ NetRequest e(nt1 nt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetRequest) ipChange.ipc$dispatch("82a6d0f3", new Object[]{nt1Var});
        }
        return nt1Var.c;
    }

    public static /* synthetic */ String f(nt1 nt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4d59e61", new Object[]{nt1Var});
        }
        return nt1Var.g;
    }

    public static /* synthetic */ void g(nt1 nt1Var, int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f3e58d", new Object[]{nt1Var, new Integer(i), netResponse, obj});
        } else {
            nt1Var.x(i, netResponse, obj);
        }
    }

    public static /* synthetic */ void h(nt1 nt1Var, int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e612f5ac", new Object[]{nt1Var, new Integer(i), netResponse, obj});
        } else {
            nt1Var.v(i, netResponse, obj);
        }
    }

    public static /* synthetic */ String i(nt1 nt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6eccbc0", new Object[]{nt1Var});
        }
        return nt1Var.h;
    }

    public static /* synthetic */ HashMap j(nt1 nt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6711c0c4", new Object[]{nt1Var});
        }
        return nt1Var.i;
    }

    public static /* synthetic */ Handler k(nt1 nt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("332fe124", new Object[]{nt1Var});
        }
        nt1Var.getClass();
        return null;
    }

    public static /* synthetic */ boolean l(nt1 nt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ceb27", new Object[]{nt1Var})).booleanValue();
        }
        return nt1Var.d;
    }

    public static /* synthetic */ long m(nt1 nt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10c2b7d8", new Object[]{nt1Var})).longValue();
        }
        return nt1Var.e;
    }

    public static /* synthetic */ String n(nt1 nt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3160ae9b", new Object[]{nt1Var});
        }
        return nt1Var.f;
    }

    public static /* synthetic */ void o(nt1 nt1Var, y6j y6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e39c4a", new Object[]{nt1Var, y6jVar});
        } else {
            nt1Var.y(y6jVar);
        }
    }

    public static /* synthetic */ void p(nt1 nt1Var, int i, y6j y6jVar, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9397ee8", new Object[]{nt1Var, new Integer(i), y6jVar, netBaseOutDo, obj});
        } else {
            nt1Var.w(i, y6jVar, netBaseOutDo, obj);
        }
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4acc81b", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableMtopCatch", "false"));
    }

    public void A(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f729ddf", new Object[]{this, hashMap});
        } else {
            this.i = hashMap;
        }
    }

    public void B(IRemoteExtendListener iRemoteExtendListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636bea08", new Object[]{this, iRemoteExtendListener});
        } else {
            this.b = iRemoteExtendListener;
        }
    }

    public void C(int i, INetDataObject iNetDataObject, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c52a92", new Object[]{this, new Integer(i), iNetDataObject, cls});
        } else {
            D(i, iNetDataObject, cls, false);
        }
    }

    public void D(int i, INetDataObject iNetDataObject, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e0da82", new Object[]{this, new Integer(i), iNetDataObject, cls, new Boolean(z)});
        } else {
            E(i, iNetDataObject, cls, z, false);
        }
    }

    public void E(int i, INetDataObject iNetDataObject, Class<?> cls, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b2892", new Object[]{this, new Integer(i), iNetDataObject, cls, new Boolean(z), new Boolean(z2)});
        } else {
            F(i, iNetDataObject, cls, z, z2, false);
        }
    }

    public void F(int i, INetDataObject iNetDataObject, Class<?> cls, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2a9c82", new Object[]{this, new Integer(i), iNetDataObject, cls, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        NetRequest r = r(iNetDataObject);
        if (r != null) {
            r.setPost(z2);
        }
        J(i, r, cls, z, z3);
    }

    public void G(int i, NetRequest netRequest, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999e3d91", new Object[]{this, new Integer(i), netRequest, cls});
        } else {
            I(i, netRequest, cls, false);
        }
    }

    public void I(int i, NetRequest netRequest, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2a2763", new Object[]{this, new Integer(i), netRequest, cls, new Boolean(z)});
        } else {
            J(i, netRequest, cls, z, false);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f24935a = null;
        this.c = null;
        if (this.j != null && qvs.m()) {
            if (!this.j.isCancelled()) {
                this.j.cancel(true);
            }
            this.j = null;
        }
    }

    public final NetRequest r(INetDataObject iNetDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetRequest) ipChange.ipc$dispatch("d9347026", new Object[]{this, iNetDataObject});
        }
        NetRequest netRequest = new NetRequest();
        if (iNetDataObject != null) {
            return qsj.b(iNetDataObject);
        }
        return netRequest;
    }

    public final void u(AccessListenerEnum accessListenerEnum, Object... objArr) {
        ATaoLiveOpenEntity A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f07751", new Object[]{this, accessListenerEnum, objArr});
            return;
        }
        ux9 d = vx9.d();
        if (d != null && d.A() != null && (A = d.A()) != null) {
            A.accessListener(accessListenerEnum, objArr);
        }
    }

    public final void w(final int i, final y6j y6jVar, final NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("507dda6c", new Object[]{this, new Integer(i), y6jVar, netBaseOutDo, obj});
            return;
        }
        if (!(this.f24935a == null || y6jVar == null)) {
            final long currentTimeMillis = System.currentTimeMillis();
            final String api = y6jVar.d.getApi();
            Runnable jt1Var = new Runnable() { // from class: tb.jt1
                @Override // java.lang.Runnable
                public final void run() {
                    nt1.this.s(api, i, y6jVar, netBaseOutDo, currentTimeMillis);
                }
            };
            if (y7j.a().contains(api) || a.a(this.j)) {
                jt1Var.run();
            } else {
                ADaemon.postMainLooper(jt1Var, new long[0]);
            }
        }
        if (y6jVar != null) {
            u(AccessListenerEnum.mtopRequestSuccess, y6jVar.d);
        }
    }

    public final void x(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        b0d b0dVar = this.f24935a;
        if (b0dVar != null) {
            b0dVar.onSystemError(i, netResponse, this);
            Map<String, String> m = igq.n().m();
            m.put("api", netResponse.getApi() + netResponse.getV());
            igq.n().c("liveroomMtop", JSON.toJSONString(m), netResponse.getRetMsg(), netResponse.getRetCode());
        }
    }

    public final void z(String str, y6j y6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0214e2", new Object[]{this, str, y6jVar});
        } else if (y6jVar != null && y6jVar.d != null && qvs.K()) {
            o3s.b("BaseDetailBusiness", "MTop请求回调完成，开始解析(byte-->JsonObject):" + y6jVar.b + ", 结束解析(byte-->JsonObject)：" + y6jVar.c + " 耗时:" + (y6jVar.c - y6jVar.b) + ", API:" + str);
            IRemoteExtendListener iRemoteExtendListener = this.b;
            if (iRemoteExtendListener != null) {
                iRemoteExtendListener.responseReceive(y6jVar);
            }
        }
    }

    public nt1(b0d b0dVar, boolean z) {
        this(b0dVar, "TAOBAO", null, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void t(tb.y6j r7) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nt1.t(tb.y6j):void");
    }

    public void J(int i, NetRequest netRequest, Class<?> cls, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1b77d1", new Object[]{this, new Integer(i), netRequest, cls, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.c = netRequest;
        if (this.d && this.f == null) {
            if (netRequest != null) {
                this.f = netRequest.getApiName();
            } else {
                this.d = false;
            }
        }
        if (this.c == null) {
            v2s.o().A().c(cwd.LOG_TAG, "mtop request is null");
            return;
        }
        a aVar = new a(i, cls, z, z2);
        this.j = aVar;
        ve1.a(aVar, ThreadPoolType.MTOP, new Void[0]);
        this.e = System.currentTimeMillis();
    }

    public final /* synthetic */ void s(String str, int i, y6j y6jVar, NetBaseOutDo netBaseOutDo, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea5eef8", new Object[]{this, str, new Integer(i), y6jVar, netBaseOutDo, new Long(j)});
            return;
        }
        q9u.a("mtop_" + str);
        b0d b0dVar = this.f24935a;
        if (b0dVar != null) {
            b0dVar.onSuccess(i, y6jVar.d, netBaseOutDo, this);
        }
        if (d4s.e("enableTLiveMtopLpm", true)) {
            t(y6jVar);
        }
        q9u.c();
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> m = igq.n().m();
        m.put("api", y6jVar.d.getApi() + y6jVar.d.getV());
        StringBuilder sb = new StringBuilder("");
        sb.append(y6jVar.c - y6jVar.b);
        m.put("dataParseTime", sb.toString());
        m.put("threadSwitch", "" + (j - y6jVar.c));
        m.put("onSuccessTime", "" + (currentTimeMillis - j));
        m.put("totalTime", "" + (currentTimeMillis - this.e));
        m.put("deviceLevel", "" + ekr.i());
        m.put("enableCommonThreadPool", "" + e4s.a());
        igq.n().e("liveroomMtop", JSON.toJSONString(m));
    }

    public nt1(b0d b0dVar, String str, String str2) {
        this(b0dVar, str, str2, false);
    }

    public final void v(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        b0d b0dVar = this.f24935a;
        if (b0dVar != null) {
            b0dVar.onError(i, netResponse, this);
            Map<String, String> m = igq.n().m();
            m.put("api", netResponse.getApi() + netResponse.getV());
            igq.n().c("liveroomMtop", JSON.toJSONString(m), netResponse.getRetMsg(), netResponse.getRetCode());
        }
        u(AccessListenerEnum.mtopRequestFail, netResponse);
    }

    public nt1(b0d b0dVar, String str, String str2, boolean z) {
        this.f = null;
        this.f24935a = b0dVar;
        this.d = z;
        this.g = str;
        this.h = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r3.equals(tb.zxg.SHOP_CARD_DETAIL) == false) goto L_0x0034;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(tb.y6j r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.nt1.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0016
            java.lang.String r4 = "f1eb0a3b"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0016:
            if (r7 == 0) goto L_0x0090
            com.taobao.taolive.sdk.adapter.network.NetResponse r3 = r7.d
            if (r3 != 0) goto L_0x001e
            goto L_0x0090
        L_0x001e:
            java.lang.String r3 = r3.getApi()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0029
            return
        L_0x0029:
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1922374796: goto L_0x0064;
                case -1593480726: goto L_0x005a;
                case -1385158785: goto L_0x004e;
                case -414309054: goto L_0x0042;
                case 1852958894: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            r0 = -1
            goto L_0x006f
        L_0x0036:
            java.lang.String r0 = "mtop.tblive.live.item.getVideoDetailItemListWithPagination"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0040
            goto L_0x0034
        L_0x0040:
            r0 = 4
            goto L_0x006f
        L_0x0042:
            java.lang.String r0 = "mtop.mediaplatform.live.livedetail"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x0034
        L_0x004c:
            r0 = 3
            goto L_0x006f
        L_0x004e:
            java.lang.String r0 = "mtop.tblive.live.detail.query"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0058
            goto L_0x0034
        L_0x0058:
            r0 = 2
            goto L_0x006f
        L_0x005a:
            java.lang.String r1 = "mtop.tblive.live.detail.query.room"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x006f
            goto L_0x0034
        L_0x0064:
            java.lang.String r0 = "mtop.mediaplatform.live.recommend.livedetail"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x006e
            goto L_0x0034
        L_0x006e:
            r0 = 0
        L_0x006f:
            switch(r0) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0080;
                case 2: goto L_0x0080;
                case 3: goto L_0x0073;
                case 4: goto L_0x0073;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x0083
        L_0x0073:
            com.taobao.taolive.sdk.business.IRemoteExtendListener r0 = r6.b
            if (r0 == 0) goto L_0x007c
            long r1 = r7.b
            r0.dataParseBegin(r1)
        L_0x007c:
            r6.z(r3, r7)
            goto L_0x0083
        L_0x0080:
            r6.z(r3, r7)
        L_0x0083:
            java.lang.String r0 = tb.qvs.C0()
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 == 0) goto L_0x0090
            r6.z(r3, r7)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nt1.y(tb.y6j):void");
    }
}
