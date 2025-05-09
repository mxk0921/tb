package tb;

import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.thread.ThreadPoolType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class n2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lhb f24458a;
    public NetRequest b;
    public Handler c;
    public final String d;
    public final String e;
    public final wzc f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public NetResponse f24459a;
        public NetBaseOutDo b;

        static {
            t2o.a(806355961);
        }

        public a(n2 n2Var) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends AsyncTask<Void, Void, a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f24460a;
        public final Class<?> b;

        static {
            t2o.a(806355962);
        }

        public b(int i, Class<?> cls, boolean z) {
            this.f24460a = z;
            this.b = cls;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/AFCDetailBusiness$RequestTask");
        }

        /* renamed from: b */
        public void onPostExecute(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3243a96c", new Object[]{this, aVar});
            }
        }

        /* renamed from: a */
        public a doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("471e84ce", new Object[]{this, voidArr});
            }
            try {
                if (!(n2.a(n2.this) == null || n2.b(n2.this) == null)) {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(n2.c(n2.this))) {
                        hashMap.put(p1t.kLiveMtopBizCodeKey, n2.c(n2.this));
                    }
                    if (!TextUtils.isEmpty(n2.d(n2.this))) {
                        hashMap.put("x-m-biz-live-biztoken", n2.d(n2.this));
                    }
                    if (n2.e(n2.this) != null) {
                        hashMap.putAll(n2.e(n2.this));
                    }
                    n2.a(n2.this).setRequestHeaders(hashMap);
                    n2.a(n2.this).setUseWua(this.f24460a);
                    if (n2.f(n2.this) != null) {
                        n2.a(n2.this).setRequestNotifyHandler(n2.f(n2.this));
                    }
                    NetResponse a2 = n2.b(n2.this).a(n2.a(n2.this));
                    a aVar = new a(n2.this);
                    aVar.f24459a = a2;
                    if (a2.isApiSuccess()) {
                        System.currentTimeMillis();
                        if (!(this.b == null || a2.getBytedata() == null || a2.getBytedata().length <= 0)) {
                            aVar.b = (NetBaseOutDo) JSON.parseObject(a2.getBytedata(), this.b, new Feature[0]);
                        }
                    }
                    lhb lhbVar = n2.this.f24458a;
                    if (lhbVar != null) {
                        lhbVar.a(aVar.f24459a, aVar.b);
                    }
                    return aVar;
                }
                return null;
            } catch (Exception e) {
                Log.e("AFCDetailBusiness", "do in background error ", e);
                lhb lhbVar2 = n2.this.f24458a;
                if (lhbVar2 != null) {
                    lhbVar2.onError();
                }
                return null;
            }
        }
    }

    static {
        t2o.a(806355960);
    }

    public n2(wzc wzcVar) {
        this(wzcVar, "TAOBAO", null);
    }

    public static /* synthetic */ NetRequest a(n2 n2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetRequest) ipChange.ipc$dispatch("a7c27856", new Object[]{n2Var});
        }
        return n2Var.b;
    }

    public static /* synthetic */ wzc b(n2 n2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wzc) ipChange.ipc$dispatch("90674985", new Object[]{n2Var});
        }
        return n2Var.f;
    }

    public static /* synthetic */ String c(n2 n2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6df35ac1", new Object[]{n2Var});
        }
        return n2Var.d;
    }

    public static /* synthetic */ String d(n2 n2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1a18582", new Object[]{n2Var});
        }
        return n2Var.e;
    }

    public static /* synthetic */ HashMap e(n2 n2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("443cee20", new Object[]{n2Var});
        }
        n2Var.getClass();
        return null;
    }

    public static /* synthetic */ Handler f(n2 n2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e3378c2a", new Object[]{n2Var});
        }
        return n2Var.c;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
        this.f24458a = null;
    }

    public final NetRequest h(INetDataObject iNetDataObject) {
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

    public void i(lhb lhbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae6b6692", new Object[]{this, lhbVar});
        } else {
            this.f24458a = lhbVar;
        }
    }

    public void j(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0731b2b", new Object[]{this, handler});
        } else {
            this.c = handler;
        }
    }

    public void k(int i, INetDataObject iNetDataObject, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c52a92", new Object[]{this, new Integer(i), iNetDataObject, cls});
        } else {
            l(i, iNetDataObject, cls, false);
        }
    }

    public void l(int i, INetDataObject iNetDataObject, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e0da82", new Object[]{this, new Integer(i), iNetDataObject, cls, new Boolean(z)});
        } else {
            m(i, iNetDataObject, cls, z, false);
        }
    }

    public void m(int i, INetDataObject iNetDataObject, Class<?> cls, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b2892", new Object[]{this, new Integer(i), iNetDataObject, cls, new Boolean(z), new Boolean(z2)});
            return;
        }
        NetRequest h = h(iNetDataObject);
        if (h != null) {
            h.setPost(z2);
        }
        n(i, h, cls, z);
    }

    public void n(int i, NetRequest netRequest, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2a2763", new Object[]{this, new Integer(i), netRequest, cls, new Boolean(z)});
            return;
        }
        this.b = netRequest;
        if (netRequest == null) {
            o3s.b(cwd.LOG_TAG, " mtop request is null");
        } else {
            ve1.a(new b(i, cls, z), ThreadPoolType.MTOP, new Void[0]);
        }
    }

    public n2(wzc wzcVar, String str, String str2) {
        this.f = wzcVar;
        this.d = str;
        this.e = str2;
    }
}
