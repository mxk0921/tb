package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.index.c;
import com.taobao.android.remoteso.index.d;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.d;
import com.taobao.android.remoteso.resolver2.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ran implements agd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f27232a;
    public final d b;
    public final c c;
    public final b7o d;
    public final kc7 e = new kc7();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements nan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ebo f27233a;

        public a(ran ranVar, ebo eboVar) {
            this.f27233a = eboVar;
        }

        @Override // tb.nan
        public void a(pan panVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("168e9942", new Object[]{this, panVar});
            } else {
                this.f27233a.a(panVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final z6o f27234a;
        public final List<String> b;
        public final nan c;
        public final Map<String, a7o> d;
        public final Map<String, a7o> e;
        public final AtomicInteger f = new AtomicInteger(0);

        public b(z6o z6oVar, List<String> list, nan nanVar) {
            this.f27234a = z6oVar;
            this.b = list;
            this.c = nanVar;
            this.d = new ConcurrentHashMap(list.size());
            this.e = new ConcurrentHashMap(list.size());
        }

        @Override // com.taobao.android.remoteso.resolver2.d.a
        public void a(a7o a7oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def47b8e", new Object[]{this, a7oVar});
                return;
            }
            RSoLog.d("puller ->  CombinedResolveCallback, result = " + a7oVar);
            if (a7oVar.j()) {
                ((ConcurrentHashMap) this.d).put(a7oVar.e(), a7oVar);
            } else {
                ((ConcurrentHashMap) this.e).put(a7oVar.e(), a7oVar);
            }
            int incrementAndGet = this.f.incrementAndGet();
            if (incrementAndGet != this.b.size()) {
                RSoLog.d("puller ->  CombinedResolveCallback, skip,  i = " + incrementAndGet + ", libNames.size = " + this.b.size());
                return;
            }
            pan b = b();
            RSoLog.d("puller ->  CombinedResolveCallback, finish,  pullResult = " + b);
            this.c.a(b);
        }

        public final pan b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pan) ipChange.ipc$dispatch("63f77e0a", new Object[]{this});
            }
            ArrayList arrayList = new ArrayList(this.b.size());
            for (String str : this.b) {
                a7o a7oVar = (a7o) ((ConcurrentHashMap) this.d).get(str);
                if (a7oVar != null) {
                    arrayList.add(a7oVar);
                } else {
                    a7o a7oVar2 = (a7o) ((ConcurrentHashMap) this.e).get(str);
                    if (a7oVar2 != null) {
                        return new pan(this.f27234a, a7oVar2);
                    }
                    rbn.e("tryGetResult", this.d + " , " + this.e + " , " + str);
                    return ran.d(this.f27234a, RSoException.error(6310));
                }
            }
            if (arrayList.size() != this.b.size()) {
                return ran.d(this.f27234a, RSoException.error(6310));
            }
            return new pan(this.f27234a, arrayList);
        }
    }

    public ran(cgd cgdVar, com.taobao.android.remoteso.index.d dVar, c cVar, b7o b7oVar) {
        this.f27232a = cgdVar;
        this.b = dVar;
        this.c = cVar;
        this.d = b7oVar;
    }

    public static /* synthetic */ pan d(z6o z6oVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("34740191", new Object[]{z6oVar, rSoException});
        }
        return e(z6oVar, rSoException);
    }

    public static pan e(z6o z6oVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("20dca438", new Object[]{z6oVar, rSoException});
        }
        return new pan(z6oVar, j.f(z6oVar, rSoException, "puller-error"));
    }

    @Override // tb.agd
    public void a(String str, nan nanVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202931b2", new Object[]{this, str, nanVar});
            return;
        }
        pan i = i(str);
        if (i.f()) {
            nanVar.a(i);
        } else {
            j(str, nanVar);
        }
    }

    @Override // tb.agd
    public pan b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("74404968", new Object[]{this, str});
        }
        return i(str);
    }

    @Override // tb.agd
    public pan c(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("f3fef1e3", new Object[]{this, str});
        }
        pan i = i(str);
        if (i.f()) {
            return i;
        }
        ebo eboVar = new ebo();
        j(str, new a(this, eboVar));
        z6o f = f(str, this.b.i());
        pan panVar = (pan) eboVar.c(oan.a(this.f27232a, f));
        if (panVar == null) {
            return e(f, RSoException.error(6304));
        }
        return panVar;
    }

    public final z6o f(String str, SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6o) ipChange.ipc$dispatch("aa43dac0", new Object[]{this, str, soIndexData});
        }
        return j.g(this.b, str, soIndexData);
    }

    public final pan h(z6o z6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("b3e7e260", new Object[]{this, z6oVar});
        }
        String b2 = z6oVar.b();
        for (SoIndexData soIndexData : this.c.j()) {
            try {
                if (!trq.d("kernelu4_7z_uc", b2)) {
                    SoIndexData.SoFileInfo l = this.b.l(b2, soIndexData);
                    if (l != null) {
                        z6o i = z6o.i(b2, l, null);
                        a7o h = this.d.h(i);
                        if (h.j()) {
                            RSoLog.d("puller ->  last, last prefer, " + b2);
                            return new pan(i, h);
                        }
                    } else {
                        continue;
                    }
                } else if (oan.b(soIndexData)) {
                    RSoLog.d("isUCVerAvailable, found data for u4 kernel, ver=" + soIndexData.getAppVersion());
                    pan g = g(z6oVar, soIndexData);
                    if (g.f()) {
                        RSoLog.d("puller ->  last, use last uc kernel, " + g.b().d());
                        return g;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                rbn.f("obtainIncludeLast,error", b2, th);
            }
        }
        RSoLog.d("puller ->  last, result=fail, not found result, " + z6oVar.b());
        return e(z6oVar, RSoException.error(6005));
    }

    public final a7o k(SoIndexData soIndexData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("43b12e46", new Object[]{this, soIndexData, str});
        }
        try {
            return this.d.h(f(str, soIndexData));
        } catch (Throwable th) {
            String l = j.l(str);
            if (l != null) {
                return j.h(j.e(str), l, "prefer-apk");
            }
            throw RSoException.error(6090, th);
        }
    }

    public final void l(String str, SoIndexData soIndexData, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15ce0827", new Object[]{this, str, soIndexData, bVar});
            return;
        }
        try {
            this.d.i(f(str, soIndexData), bVar);
        } catch (Throwable th) {
            String l = j.l(str);
            if (l != null) {
                bVar.a(j.h(j.e(str), l, "prefer-apk"));
                return;
            }
            throw RSoException.error(6090, th);
        }
    }

    public final pan g(z6o z6oVar, SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("2d67cf8", new Object[]{this, z6oVar, soIndexData});
        }
        List<String> b2 = this.e.b(z6oVar.b(), soIndexData);
        if (b2.size() >= 1) {
            RSoLog.d("puller ->  obtainFromDataOrError, start,  targetReq=" + z6oVar.b() + ",  dep libs=" + b2);
            ArrayList arrayList = new ArrayList(b2.size());
            for (String str : b2) {
                a7o k = k(soIndexData, str);
                if (!k.j()) {
                    RSoLog.d("puller ->  obtainFromDataOrError, result=fail, dep fail,  targetReq=" + z6oVar.b() + ",  dep lib=" + str);
                    return new pan(z6oVar, k);
                }
                arrayList.add(k);
            }
            if (arrayList.size() == b2.size()) {
                return new pan(z6oVar, arrayList);
            }
            RSoLog.d("puller ->  obtainFromDataOrError, result=fail, dep fail,  targetReq=" + z6oVar.b() + ",  succResults.len=" + arrayList.size() + ", libNames.len=" + b2.size());
            return e(z6oVar, RSoException.error(6310));
        }
        throw new IllegalArgumentException(z6oVar + " got ordered libNames size < 1, wtf??");
    }

    public final pan i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("a68e2735", new Object[]{this, str});
        }
        RSoLog.d("puller ->  obtainIncludeLast, start,  targetReq=" + str);
        SoIndexData i = this.b.i();
        z6o f = f(str, i);
        pan g = g(f, i);
        if (g.f()) {
            RSoLog.d("puller ->  obtainIncludeLast, result=succ, from current, " + f.b());
            return g;
        } else if (this.c.i(f.b())) {
            RSoLog.d("puller ->  obtainIncludeLast, result=fail, last cache disabled by config, lib=" + f.b());
            return g;
        } else {
            SoInfo2 k = f.k();
            if (k == null || !k.ext.allowLastIndex) {
                RSoLog.d("puller ->  obtainIncludeLast, result=fail, not allow last index, " + f.b());
                return g;
            }
            f.l(true);
            return h(f);
        }
    }

    public final void j(String str, nan nanVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ec38be", new Object[]{this, str, nanVar});
            return;
        }
        RSoLog.d("puller ->  obtainOrResolve, start,  targetReq=" + str + ",  callback=" + nanVar);
        SoIndexData i = this.b.i();
        z6o f = f(str, i);
        List<String> b2 = this.e.b(f.b(), i);
        if (b2.size() >= 1) {
            RSoLog.d("puller ->  obtainOrResolve, result=fail, will resolve,  targetReq=" + f.b() + ",  dep lib =" + b2);
            b bVar = new b(f, b2, nanVar);
            for (String str2 : b2) {
                l(str2, i, bVar);
            }
            return;
        }
        throw new IllegalArgumentException(f + " got ordered libNames size < 1, wtf??");
    }
}
