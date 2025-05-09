package tb;

import android.content.Context;
import android.net.Uri;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoRequest;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponse;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fgv implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_ALL = "all";
    public static final String TYPE_PART = "part";
    public static final String VALUE_ITEM_HOLD_TYPE_CARD = "multiItemCard";

    /* renamed from: a  reason: collision with root package name */
    public boolean f19284a;
    public UnImportantLiveInfoResponseData c;
    public dgv f;
    public clo g;
    public String h;
    public final CopyOnWriteArrayList<e> b = new CopyOnWriteArrayList<>();
    public int d = -9999;
    public NetResponse e = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f19285a;

        public a(e eVar) {
            this.f19285a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f19285a != null && fgv.a(fgv.this) != null) {
                this.f19285a.onUnImportantLiveInfoSuccess(fgv.b(fgv.this), fgv.a(fgv.this), fgv.c(fgv.this), fgv.d(fgv.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NetResponse f19286a;
        public final /* synthetic */ e b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;

        public b(NetResponse netResponse, e eVar, int i, Object obj) {
            this.f19286a = netResponse;
            this.b = eVar;
            this.c = i;
            this.d = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetResponse netResponse = this.f19286a;
            if (netResponse != null) {
                this.b.onUnImportantLiveInfoSuccess(this.c, netResponse, fgv.c(fgv.this), this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f19287a;
        public final /* synthetic */ int b;
        public final /* synthetic */ NetResponse c;
        public final /* synthetic */ Object d;

        public c(e eVar, int i, NetResponse netResponse, Object obj) {
            this.f19287a = eVar;
            this.b = i;
            this.c = netResponse;
            this.d = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f19287a.onUnImportantLiveInfoError(this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f19288a;
        public final /* synthetic */ int b;
        public final /* synthetic */ NetResponse c;
        public final /* synthetic */ Object d;

        public d(e eVar, int i, NetResponse netResponse, Object obj) {
            this.f19288a = eVar;
            this.b = i;
            this.c = netResponse;
            this.d = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f19288a.onUnImportantLiveInfoSystemError(this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface e {
        void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj);

        void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj);

        void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj);
    }

    static {
        t2o.a(806356148);
        t2o.a(806355932);
    }

    public static /* synthetic */ NetResponse a(fgv fgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetResponse) ipChange.ipc$dispatch("5842da2b", new Object[]{fgvVar});
        }
        return fgvVar.e;
    }

    public static /* synthetic */ int b(fgv fgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74d87418", new Object[]{fgvVar})).intValue();
        }
        return fgvVar.d;
    }

    public static /* synthetic */ UnImportantLiveInfoResponseData c(fgv fgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UnImportantLiveInfoResponseData) ipChange.ipc$dispatch("72e10cc5", new Object[]{fgvVar});
        }
        return fgvVar.c;
    }

    public static /* synthetic */ dgv d(fgv fgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dgv) ipChange.ipc$dispatch("241a55b1", new Object[]{fgvVar});
        }
        return fgvVar.f;
    }

    public void f(Context context, clo cloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef75fd1b", new Object[]{this, context, cloVar});
        } else if (g() && !this.f19284a) {
            h("init");
            this.f19284a = true;
            this.f = new dgv(this);
            this.g = cloVar;
            this.h = UUID.randomUUID().toString();
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        return ggv.a();
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else if (this.g != null) {
            eir.a("UnImportantLiveInfoService", this.g.p() + " " + str);
        } else {
            eir.a("UnImportantLiveInfoService", "null " + str);
        }
    }

    public void i(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb65ec3", new Object[]{this, eVar});
        } else if (g()) {
            if (this.c != null) {
                ADaemon.postMainLooper(new a(eVar), new long[0]);
            } else {
                this.b.add(eVar);
            }
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7835f0c", new Object[]{this, str});
        } else if (ggv.b()) {
            HashMap hashMap = new HashMap();
            hashMap.put("requestId", this.h);
            clo cloVar = this.g;
            if (cloVar != null) {
                hashMap.put("liveId", cloVar.i);
            }
            hashMap.put("requestParams", Uri.encode(str));
            if (v2s.o().E() != null) {
                v2s.o().E().track4Click("Page_TaobaoLiveWatch", "mtopMergedReqMonitor", hashMap);
            }
        }
    }

    public final void k(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a7f7bd", new Object[]{this, str, new Boolean(z)});
        } else if (ggv.b()) {
            h("RequestRet " + z + " traceId = " + str);
            HashMap hashMap = new HashMap();
            hashMap.put("requestId", this.h);
            clo cloVar = this.g;
            if (cloVar != null) {
                hashMap.put("liveId", cloVar.i);
            }
            hashMap.put("traceId", str);
            hashMap.put("isSuccess", String.valueOf(z));
            if (v2s.o().E() != null) {
                v2s.o().E().track4Click("Page_TaobaoLiveWatch", "mtopMergedResMonitor", hashMap);
            }
        }
    }

    public void l(UnImportantLiveInfoRequest unImportantLiveInfoRequest) {
        dgv dgvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea379ed", new Object[]{this, unImportantLiveInfoRequest});
        } else if (g() && unImportantLiveInfoRequest != null && (dgvVar = this.f) != null) {
            dgvVar.K(unImportantLiveInfoRequest);
            String i = fkx.i(unImportantLiveInfoRequest);
            h("request " + i);
            j(i);
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else if (g()) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                e eVar = this.b.get(i2);
                if (eVar != null) {
                    z1i.a().c(new c(eVar, i, netResponse, obj));
                }
            }
            this.b.clear();
            k(e(netResponse), false);
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (g()) {
            if (netBaseOutDo instanceof UnImportantLiveInfoResponse) {
                this.c = (UnImportantLiveInfoResponseData) ((UnImportantLiveInfoResponse) netBaseOutDo).getData();
            }
            this.d = i;
            this.e = netResponse;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                e eVar = this.b.get(i2);
                if (eVar != null) {
                    ADaemon.postMainLooper(new b(netResponse, eVar, i, obj), new long[0]);
                }
            }
            this.b.clear();
            k(e(netResponse), true);
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else if (g()) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                e eVar = this.b.get(i2);
                if (eVar != null) {
                    z1i.a().c(new d(eVar, i, netResponse, obj));
                }
            }
            this.b.clear();
            k(e(netResponse), false);
        }
    }

    public final String e(NetResponse netResponse) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c405ad4", new Object[]{this, netResponse});
        }
        if (netResponse == null) {
            return "";
        }
        try {
            if (netResponse.getHeaderFields() == null || (list = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) == null || list.size() <= 0) {
                return "";
            }
            return list.get(0);
        } catch (Exception unused) {
            return "";
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec0ab50", new Object[]{this});
        } else if (g() && this.f19284a) {
            h("unInit");
            this.f19284a = false;
            this.d = -9999;
            this.b.clear();
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
        }
    }
}
