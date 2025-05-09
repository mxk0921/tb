package tb;

import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import tb.ck;
import tb.ubb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_PREFETCH_EXPIRE_TIME = 15000;
    public final long c;
    public final AURANextRPCEndpoint h;
    public ubb.a i;
    public kk k;
    public mn l;
    public List<kk> m;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f26791a = new ReentrantLock();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public volatile long d = 0;
    public long e = 0;
    public long f = 0;
    public long g = 0;
    public final AtomicBoolean j = new AtomicBoolean(false);

    static {
        t2o.a(80740485);
    }

    public qk(String str, AURANextRPCEndpoint aURANextRPCEndpoint) {
        this.c = 5000L;
        this.h = b(aURANextRPCEndpoint);
        long a2 = aURANextRPCEndpoint.getNextRPCPrefetch().a();
        if (a2 != 0) {
            this.c = a2;
        }
    }

    public void a(List<kk> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cdd765", new Object[]{this, list});
        } else if (list != null) {
            if (this.m == null) {
                this.m = new ArrayList();
            }
            this.m.addAll(list);
        }
    }

    public final AURANextRPCEndpoint b(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("d600149e", new Object[]{this, aURANextRPCEndpoint});
        }
        AURANextRPCEndpoint.a E = new AURANextRPCEndpoint.a().J(aURANextRPCEndpoint.isPostMethod()).F(aURANextRPCEndpoint.isNeedEncode()).G(aURANextRPCEndpoint.isNeedSession()).z(aURANextRPCEndpoint.getApi()).V(aURANextRPCEndpoint.getVersion()).E(aURANextRPCEndpoint.useMainThread());
        Map<String, String> dataParams = aURANextRPCEndpoint.getDataParams();
        if (dataParams != null) {
            E.I(new HashMap(dataParams));
        }
        Map<String, String> requestHeaders = aURANextRPCEndpoint.getRequestHeaders();
        if (requestHeaders != null) {
            E.N(new HashMap(requestHeaders));
        }
        return E.B();
    }

    public List<kk> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("deef0988", new Object[]{this});
        }
        return this.m;
    }

    public ubb.a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ubb.a) ipChange.ipc$dispatch("48604550", new Object[]{this});
        }
        return this.i;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17b347fd", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fd6a445", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f299b56a", new Object[]{this})).longValue();
        }
        return this.g;
    }

    public <T extends kk> T h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((kk) ipChange.ipc$dispatch("881e4434", new Object[]{this}));
        }
        T t = (T) this.k;
        if (t != null) {
            return t;
        }
        return this.l;
    }

    public AURANextRPCEndpoint i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("6c8d8704", new Object[]{this});
        }
        return this.h;
    }

    public long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7291b79f", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.j.get();
    }

    public void m(ubb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943f88dc", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }

    public void n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f147579f", new Object[]{this, new Long(j)});
        } else {
            this.f = j;
        }
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f7a3056", new Object[]{this, new Boolean(z)});
        } else {
            this.j.set(z);
        }
    }

    public void p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893d81a", new Object[]{this, new Long(j)});
        } else {
            this.g = j;
        }
    }

    public void r(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3bc0ed", new Object[]{this, new Long(j)});
        } else if (this.d == 0) {
            this.d = j;
        }
    }

    public void s(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c94730", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public <T extends kk> void q(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("632e9e04", new Object[]{this, t});
        } else if (t instanceof mn) {
            mn mnVar = (mn) t;
            if (mnVar.y() == 1) {
                this.l = mnVar;
                return;
            }
            JSONObject b = h9v.b(this.l.b(), t.b());
            ck.g().e("预请求流式数据合并操作", ck.b.b().i("stream").a());
            this.l.n(b);
            this.l.B(true);
        } else {
            this.k = t;
        }
    }
}
