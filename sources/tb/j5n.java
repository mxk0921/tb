package tb;

import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class j5n implements agd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FETCH_FROM_BUSI_CALL = "busi_call";
    public static final String FETCH_FROM_LOAD = "load";

    /* renamed from: a  reason: collision with root package name */
    public final agd f21776a;
    public final String b;
    public final String c;
    public final long d = uos.b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements nan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ unq f21777a;
        public final /* synthetic */ nan b;

        public a(unq unqVar, nan nanVar) {
            this.f21777a = unqVar;
            this.b = nanVar;
        }

        @Override // tb.nan
        public void a(pan panVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("168e9942", new Object[]{this, panVar});
                return;
            }
            RSoLog.d(j5n.d(j5n.this) + " [puller].resolveAsync() exit -> result=" + panVar);
            this.f21777a.d("end", "begin");
            j5n.e(j5n.this, panVar, this.f21777a, "fetchAsync");
            this.b.a(panVar);
        }
    }

    public j5n(agd agdVar, String str, String str2) {
        this.f21776a = agdVar;
        this.b = str;
        this.c = str2;
    }

    public static /* synthetic */ String d(j5n j5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("946ef7d", new Object[]{j5nVar});
        }
        return j5nVar.c;
    }

    public static /* synthetic */ void e(j5n j5nVar, pan panVar, unq unqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8efb8", new Object[]{j5nVar, panVar, unqVar, str});
        } else {
            j5nVar.f(panVar, unqVar, str);
        }
    }

    @Override // tb.agd
    public void a(String str, nan nanVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202931b2", new Object[]{this, str, nanVar});
            return;
        }
        RSoLog.d(this.c + " [puller].resolveAsync() enter -> libName=" + str);
        unq unqVar = new unq("fetchAsync");
        unqVar.c("begin");
        this.f21776a.a(str, new a(unqVar, nanVar));
    }

    @Override // tb.agd
    public pan b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("74404968", new Object[]{this, str});
        }
        RSoLog.d(this.c + " [puller].resolve() enter -> libName=" + str);
        unq unqVar = new unq(CredentialRpcData.ACTION_FETCH);
        unqVar.c("begin");
        pan b = this.f21776a.b(str);
        unqVar.d("end", "begin");
        f(b, unqVar, CredentialRpcData.ACTION_FETCH);
        RSoLog.d(this.c + " [puller].resolve() exit -> result=" + b);
        return b;
    }

    @Override // tb.agd
    public pan c(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("f3fef1e3", new Object[]{this, str});
        }
        RSoLog.d(this.c + " [puller].resolveSync() enter -> libName=" + str);
        unq unqVar = new unq("fetchSync");
        unqVar.c("begin");
        pan c = this.f21776a.c(str);
        unqVar.d("end", "begin");
        f(c, unqVar, "fetchSync");
        RSoLog.d(this.c + " [puller].resolveSync() exit -> result=" + c);
        return c;
    }

    public final void f(pan panVar, unq unqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571f864e", new Object[]{this, panVar, unqVar, str});
            return;
        }
        try {
            SoIndexData.SoFileInfo c = panVar.c();
            a7o b = panVar.b();
            SoIndexData.SoFileInfo c2 = b.c();
            HashMap hashMap = new HashMap();
            hashMap.put(ngd.ARGS_LIB_NAME, panVar.d());
            hashMap.put("targetMajorVer", trq.h(c.getMajorVersion()));
            hashMap.put("targetMinorVer", trq.h(c.getMinorVersion()));
            hashMap.put("targetLength", Long.valueOf(c.getLength()));
            hashMap.put("resultMajorVer", trq.h(c2.getMajorVersion()));
            hashMap.put("resultMinorVer", trq.h(c2.getMinorVersion()));
            hashMap.put("resultLength", Long.valueOf(c2.getLength()));
            hashMap.put(ngd.ARGS_FETCH_FROM, this.c);
            hashMap.put(ngd.ARGS_CALL_TYPE, this.c + "_" + str);
            hashMap.put(ngd.ARGS_INTERVAL_FROM_INIT, Long.valueOf(uos.b() - this.d));
            hashMap.put("source", b.i());
            hashMap.putAll(unqVar.b());
            if (b.j()) {
                rbn.j(this.b, hashMap);
            } else {
                rbn.h(this.b, hashMap, b.b());
            }
        } catch (Throwable th) {
            rbn.g("PullerTrackWrapper,logFetchResult", th);
        }
    }
}
