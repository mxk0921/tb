package tb;

import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.HttpHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.ssrcore.callback.SsrCallbackImpl;
import tb.egq;
import tb.zu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ufq implements htj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final efq f29343a;
    public final yrd b;
    public boolean c = false;
    public boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o9o f29344a;

        public a(o9o o9oVar) {
            this.f29344a = o9oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(this.f29344a.d, HttpHeaderConstant.X_RETCODE);
                String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(this.f29344a.d, "x-sec-reason");
                String singleHeaderFieldByKey3 = HttpHelper.getSingleHeaderFieldByKey(this.f29344a.d, "Location");
                if (ufq.a(ufq.this, singleHeaderFieldByKey) || ufq.a(ufq.this, singleHeaderFieldByKey2) || !ufq.b(ufq.this, this.f29344a.b, singleHeaderFieldByKey3)) {
                    i7j i7jVar = ufq.this.f29343a.d;
                    i7jVar.D = i7jVar.d();
                    mfq.k(ufq.this.f29343a.d);
                    ufq.this.f29343a.d.L = this.f29344a.f;
                    egq a2 = new egq.b().b(this.f29344a.b).e(singleHeaderFieldByKey).c(this.f29344a.d).d(this.f29344a.c).a();
                    ufq ufqVar = ufq.this;
                    efq efqVar = ufqVar.f29343a;
                    efqVar.f = a2;
                    ufqVar.b.a(null, efqVar);
                    return;
                }
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    String str = ufq.this.f29343a.b;
                    TBSdkLog.e("ssr.SsrNetworkCallbackAdapter", str, "redirect location=" + singleHeaderFieldByKey3);
                }
                ufq.c(ufq.this, singleHeaderFieldByKey3);
            } catch (Throwable th) {
                TBSdkLog.e("ssr.SsrNetworkCallbackAdapter", ufq.this.f29343a.b, "onFinish failed.", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f29345a;
        public final /* synthetic */ Map b;

        public b(int i, Map map) {
            this.f29345a = i;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            efq efqVar = ufq.this.f29343a;
            MtopListener mtopListener = efqVar.k;
            if (mtopListener instanceof SsrCallbackImpl) {
                String str = efqVar.b;
                TBSdkLog.d("ssr.SsrNetworkCallbackAdapter", str, "onResponse code" + this.f29345a);
                ((SsrCallbackImpl) mtopListener).onResponse(ufq.this.f29343a.g, this.f29345a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f29346a;

        public c(byte[] bArr) {
            this.f29346a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            efq efqVar = ufq.this.f29343a;
            MtopListener mtopListener = efqVar.k;
            if (mtopListener instanceof SsrCallbackImpl) {
                TBSdkLog.d("ssr.SsrNetworkCallbackAdapter", efqVar.b, "onReceiveData");
                ((SsrCallbackImpl) mtopListener).onReceiveData(ufq.this.f29343a.g, this.f29346a);
            }
        }
    }

    public ufq(efq efqVar) {
        this.f29343a = efqVar;
        if (efqVar != null) {
            a7c a7cVar = efqVar.j.getMtopConfig().mFilterManager;
            if (a7cVar instanceof yrd) {
                this.b = (yrd) a7cVar;
            }
        }
    }

    public static /* synthetic */ boolean a(ufq ufqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8aec559", new Object[]{ufqVar, str})).booleanValue();
        }
        return ufqVar.d(str);
    }

    public static /* synthetic */ boolean b(ufq ufqVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eba94205", new Object[]{ufqVar, new Integer(i), str})).booleanValue();
        }
        return ufqVar.e(i, str);
    }

    public static /* synthetic */ void c(ufq ufqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a17157", new Object[]{ufqVar, str});
        } else {
            ufqVar.i(str);
        }
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3db76c8", new Object[]{this, str})).booleanValue();
        }
        if (!ErrorConstant.isSessionInvalid(str) || this.f29343a.h.q() != 0 || TextUtils.equals(this.f29343a.h.p(), "none")) {
            return false;
        }
        return true;
    }

    public final boolean e(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bd5d758", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !lfq.b(this.f29343a.h.o, i)) {
            return false;
        }
        return true;
    }

    public void f(o9o o9oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c2737a", new Object[]{this, o9oVar});
            return;
        }
        i7j i7jVar = this.f29343a.d;
        i7jVar.C = i7jVar.d();
        a aVar = new a(o9oVar);
        efq efqVar = this.f29343a;
        lfq.e(efqVar.f18534a.handler, aVar, efqVar.b.hashCode());
    }

    public void g(byte[] bArr) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24c16dc", new Object[]{this, bArr});
        } else if (!this.c) {
            if (!this.d) {
                i7j i7jVar = this.f29343a.d;
                i7jVar.q = i7jVar.d();
                this.f29343a.d.r = System.currentTimeMillis();
                i7j i7jVar2 = this.f29343a.d;
                if (bArr != null) {
                    j = bArr.length;
                } else {
                    j = 0;
                }
                i7jVar2.t = j;
                this.d = true;
            }
            c cVar = new c(bArr);
            efq efqVar = this.f29343a;
            lfq.e(efqVar.f18534a.handler, cVar, efqVar.b.hashCode());
        }
    }

    public void h(int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
            return;
        }
        k(map);
        boolean j = j(map, i);
        this.c = j;
        if (!j) {
            i7j i7jVar = this.f29343a.d;
            i7jVar.p = i7jVar.d();
            b bVar = new b(i, map);
            efq efqVar = this.f29343a;
            lfq.e(efqVar.f18534a.handler, bVar, efqVar.b.hashCode());
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("671f3185", new Object[]{this, str});
            return;
        }
        zu2.a aVar = this.f29343a.j.getMtopConfig().callFactory;
        efq efqVar = this.f29343a;
        efqVar.e = efqVar.e.b().A(str).g();
        aVar.a(this.f29343a.e).a(new ufq(this.f29343a));
        this.f29343a.h.o++;
    }

    public boolean j(Map<String, List<String>> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a9e49d", new Object[]{this, map, new Integer(i)})).booleanValue();
        }
        try {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, HttpHeaderConstant.X_RETCODE);
            String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "x-sec-reason");
            boolean e = e(i, HttpHelper.getSingleHeaderFieldByKey(map, "Location"));
            if (d(singleHeaderFieldByKey)) {
                return true;
            }
            if (!d(singleHeaderFieldByKey2) && !e) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TBSdkLog.e("ssr.SsrNetworkCallbackAdapter", this.f29343a.b, "shouldInterruptedCallback.", th);
            return false;
        }
    }

    public final void k(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710b9c8e", new Object[]{this, map});
            return;
        }
        try {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, HttpHeaderConstant.X_SERVICE_DOMAIN);
            String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, HttpHeaderConstant.X_SSR_TOKEN_VALIDATION);
            if (!TextUtils.isEmpty(singleHeaderFieldByKey2)) {
                this.f29343a.d.Z = singleHeaderFieldByKey2;
            }
            if (!TextUtils.isEmpty(singleHeaderFieldByKey)) {
                efq efqVar = this.f29343a;
                efqVar.d.d0 = singleHeaderFieldByKey;
                ggq.f(efqVar.j.getMtopConfig().context, Uri.parse(this.f29343a.g.f16375a).getHost(), singleHeaderFieldByKey);
            }
        } catch (Throwable th) {
            TBSdkLog.e("ssr.SsrNetworkCallbackAdapter", this.f29343a.b, "ssr domain parse error", th);
        }
    }

    @Override // tb.htj
    public void onCancel(zu2 zu2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b9b7f3", new Object[]{this, zu2Var});
        }
    }

    @Override // tb.htj
    public void onFailure(zu2 zu2Var, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8b04c1", new Object[]{this, zu2Var, exc});
        }
    }

    @Override // tb.htj
    public void onResponse(zu2 zu2Var, o9o o9oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7ed339", new Object[]{this, zu2Var, o9oVar});
        } else {
            f(o9oVar);
        }
    }
}
