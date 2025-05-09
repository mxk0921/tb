package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b0d f24284a;
    public NetRequest b;
    public long c;
    public final String d;
    public final boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public NetResponse f24285a;
        public NetBaseOutDo b;

        public a(mt1 mt1Var) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AsyncTask<Void, Void, a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f24286a;
        public final boolean b;
        public final Class<?> c;

        public b(int i, Class<?> cls, boolean z) {
            this.f24286a = i;
            this.b = z;
            this.c = cls;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/message_sdk/mtop/BaseDetailBusiness$RequestTask");
        }

        /* renamed from: a */
        public a doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("73e1d47", new Object[]{this, voidArr});
            }
            try {
                if (!(mt1.a(mt1.this) == null || v2s.o().w() == null)) {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(mt1.b(mt1.this))) {
                        hashMap.put(p1t.kLiveMtopBizCodeKey, mt1.b(mt1.this));
                    }
                    if (!TextUtils.isEmpty(mt1.c(mt1.this))) {
                        hashMap.put("x-m-biz-live-biztoken", mt1.c(mt1.this));
                    }
                    if (zxg.LIVE_DETAIL_QUERY.equals(mt1.a(mt1.this).getApiName()) || zxg.LIVE_DETAIL.equals(mt1.a(mt1.this).getApiName())) {
                        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "live");
                        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, "source=taobao");
                    }
                    mt1.a(mt1.this).setRequestHeaders(hashMap);
                    mt1.a(mt1.this).setUseWua(this.b);
                    mt1.a(mt1.this).setPost(mt1.d(mt1.this));
                    NetResponse a2 = v2s.o().w().a(mt1.a(mt1.this));
                    a aVar = new a(mt1.this);
                    aVar.f24285a = a2;
                    if (a2.isApiSuccess()) {
                        System.currentTimeMillis();
                        if (!(this.c == null || a2.getBytedata() == null || a2.getBytedata().length <= 0)) {
                            aVar.b = (NetBaseOutDo) JSON.parseObject(a2.getBytedata(), this.c, new Feature[0]);
                        }
                    }
                    return aVar;
                }
            } catch (Exception unused) {
            }
            return null;
        }

        /* renamed from: b */
        public void onPostExecute(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31fdeca3", new Object[]{this, aVar});
            } else if (aVar == null) {
                mt1 mt1Var = mt1.this;
                b0d b0dVar = mt1Var.f24284a;
                if (b0dVar != null) {
                    b0dVar.onError(this.f24286a, null, mt1Var);
                }
            } else {
                mt1.this.getClass();
                String.format("time=%d;source=java", Long.valueOf(System.currentTimeMillis() - mt1.e(mt1.this)));
                NetResponse netResponse = aVar.f24285a;
                if (netResponse == null) {
                    mt1 mt1Var2 = mt1.this;
                    b0d b0dVar2 = mt1Var2.f24284a;
                    if (b0dVar2 != null) {
                        b0dVar2.onError(this.f24286a, null, mt1Var2);
                    }
                } else if (netResponse.isApiSuccess()) {
                    NetBaseOutDo netBaseOutDo = aVar.b;
                    mt1 mt1Var3 = mt1.this;
                    mt1.f(mt1Var3, this.f24286a, aVar.f24285a, netBaseOutDo, mt1Var3);
                } else if (qsj.h(aVar.f24285a)) {
                    mt1 mt1Var4 = mt1.this;
                    mt1.g(mt1Var4, this.f24286a, aVar.f24285a, mt1Var4);
                } else if (qsj.i(aVar.f24285a)) {
                    mt1 mt1Var5 = mt1.this;
                    mt1.g(mt1Var5, this.f24286a, aVar.f24285a, mt1Var5);
                } else {
                    mt1 mt1Var6 = mt1.this;
                    mt1.h(mt1Var6, this.f24286a, aVar.f24285a, mt1Var6);
                }
            }
        }
    }

    public mt1(b0d b0dVar, int i, boolean z) {
        this.d = null;
        this.e = false;
        this.f24284a = b0dVar;
        this.d = String.valueOf(i);
        this.e = z;
    }

    public static /* synthetic */ NetRequest a(mt1 mt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetRequest) ipChange.ipc$dispatch("dbafc1b3", new Object[]{mt1Var});
        }
        return mt1Var.b;
    }

    public static /* synthetic */ String b(mt1 mt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a14ce21", new Object[]{mt1Var});
        }
        return mt1Var.d;
    }

    public static /* synthetic */ String c(mt1 mt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8083400", new Object[]{mt1Var});
        }
        mt1Var.getClass();
        return null;
    }

    public static /* synthetic */ boolean d(mt1 mt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fc918e5", new Object[]{mt1Var})).booleanValue();
        }
        return mt1Var.e;
    }

    public static /* synthetic */ long e(mt1 mt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53589d16", new Object[]{mt1Var})).longValue();
        }
        return mt1Var.c;
    }

    public static /* synthetic */ void f(mt1 mt1Var, int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad5b2cd", new Object[]{mt1Var, new Integer(i), netResponse, netBaseOutDo, obj});
        } else {
            mt1Var.l(i, netResponse, netBaseOutDo, obj);
        }
    }

    public static /* synthetic */ void g(mt1 mt1Var, int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d31f16", new Object[]{mt1Var, new Integer(i), netResponse, obj});
        } else {
            mt1Var.m(i, netResponse, obj);
        }
    }

    public static /* synthetic */ void h(mt1 mt1Var, int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449f07b5", new Object[]{mt1Var, new Integer(i), netResponse, obj});
        } else {
            mt1Var.k(i, netResponse, obj);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f24284a = null;
        this.b = null;
    }

    public final NetRequest j(INetDataObject iNetDataObject) {
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

    public final void k(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        b0d b0dVar = this.f24284a;
        if (b0dVar != null) {
            b0dVar.onError(i, netResponse, this);
        }
    }

    public final void l(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        b0d b0dVar = this.f24284a;
        if (b0dVar != null) {
            b0dVar.onSuccess(i, netResponse, netBaseOutDo, this);
        }
    }

    public final void m(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        b0d b0dVar = this.f24284a;
        if (b0dVar != null) {
            b0dVar.onSystemError(i, netResponse, this);
        }
    }

    public void n(int i, INetDataObject iNetDataObject, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c52a92", new Object[]{this, new Integer(i), iNetDataObject, cls});
        } else {
            o(i, iNetDataObject, cls, false);
        }
    }

    public void o(int i, INetDataObject iNetDataObject, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e0da82", new Object[]{this, new Integer(i), iNetDataObject, cls, new Boolean(z)});
        } else {
            p(i, iNetDataObject, cls, z, false);
        }
    }

    public void p(int i, INetDataObject iNetDataObject, Class<?> cls, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b2892", new Object[]{this, new Integer(i), iNetDataObject, cls, new Boolean(z), new Boolean(z2)});
            return;
        }
        NetRequest j = j(iNetDataObject);
        if (j != null) {
            j.setPost(z2);
        }
        q(i, j, cls, z);
    }

    public void q(int i, NetRequest netRequest, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2a2763", new Object[]{this, new Integer(i), netRequest, cls, new Boolean(z)});
            return;
        }
        this.b = netRequest;
        if (netRequest == null) {
            k6s.a(cwd.LOG_TAG, "mtop request is null");
            return;
        }
        new b(i, cls, z).execute(new Void[0]);
        this.c = System.currentTimeMillis();
    }
}
