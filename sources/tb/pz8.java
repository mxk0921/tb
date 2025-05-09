package tb;

import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognationPO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.StageList;
import com.taobao.falco.FalcoEnvironmentImpl;
import com.taobao.falco.c;
import com.taobao.falco.e;
import com.taobao.falco.k;
import com.taobao.falco.l;
import com.taobao.falco.p;
import com.taobao.falco.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pz8 extends cck implements oz8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean k;
    public final boolean l;
    public final s9u o;
    public volatile Runnable s;
    public static final uqq MODULE = new uqq("_module");
    public static final bef STATUS = new bef("_status");
    public static final uqq LAYER = new uqq("_layer");
    public static final pug STAGES = new pug("_stages");
    public static final uqq PARENT_STAGE = new uqq("_pStage");
    public static final uqq ENV_FALCO_ID = new uqq("envFalcoId");
    public static final uqq u = new uqq("afcId");
    public static final uqq v = new uqq("afcType");
    public static final ckh w = new ckh("processStart");
    public static final bef b0 = new bef("processRecovery");
    public static final ckh x = new ckh("launchStart");
    public static final uqq y = new uqq("launchType");
    public static final uqq z = new uqq("installation");
    public static final bef A = new bef("launchStatus");
    public static final bef B = new bef("lowPowerMode");
    public static final bef C = new bef("temperature");
    public static final uqq D = new uqq("netType");
    public static final bef E = new bef("netQualityLevel");
    public static final uqq F = new uqq("deviceLevel");
    public static final uqq G = new uqq(k7m.KEY_DEVICE_TYPE);
    public static final ckh H = new ckh("lastColdStart");
    public static final CopyOnWriteArrayList<String> I = new CopyOnWriteArrayList<>();
    public final StageList m = new StageList();
    public final StageList n = new StageList();
    public int p = 0;
    public int q = 0;
    public volatile long r = 0;
    public String t = tfb.UNFINISHED;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f26408a;
        public final /* synthetic */ String b;

        public a(long j, String str) {
            this.f26408a = j;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            pz8.N0(pz8.this, null);
            if (!pz8.this.B0()) {
                pz8.this.U0(this.f26408a, this.b);
                pz8.this.S0(this.f26408a, this.b);
            }
        }
    }

    public static /* synthetic */ Runnable N0(pz8 pz8Var, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("c6f544a3", new Object[]{pz8Var, runnable});
        }
        pz8Var.s = runnable;
        return runnable;
    }

    public static /* synthetic */ Object ipc$super(pz8 pz8Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 504520428) {
            return super.J0((ess) objArr[0], objArr[1]);
        }
        if (hashCode == 1300355690) {
            super.H(((Number) objArr[0]).longValue());
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/analysis/v3/FalcoSpanImpl");
    }

    @Override // tb.oz8
    public void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e0d08e", new Object[]{this, str});
        } else {
            m1(str, null);
        }
    }

    @Override // tb.cck, tb.paq
    public void H(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d81da6a", new Object[]{this, new Long(j)});
        } else {
            R0(j, "succeed");
        }
    }

    @Override // tb.oz8
    public void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44dcfc2", new Object[]{this, str});
        } else {
            Q0(str, null);
        }
    }

    public final String O0(Iterable<Map.Entry<String, String>> iterable) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c92695c4", new Object[]{this, iterable});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : iterable) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && !"_scene".equals(key) && !"_stage".equals(key)) {
                if (z2) {
                    sb.append(",");
                }
                sb.append(zxv.c(key));
                sb.append("=");
                sb.append(zxv.c(value));
                z2 = true;
            }
        }
        return sb.toString();
    }

    public final String P0() {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59a48b8c", new Object[]{this});
        }
        String Z0 = Z0();
        String d0 = d0();
        String a1 = a1();
        StringBuilder sb = new StringBuilder();
        sb.append(a().b());
        sb.append(",");
        sb.append(a().c());
        sb.append(",");
        sb.append(zxv.c(Z0));
        sb.append(",");
        sb.append(zxv.c(b1()));
        sb.append(",");
        sb.append(zxv.c(X0()));
        sb.append(",");
        sb.append(z());
        sb.append(",");
        sb.append(z0());
        sb.append(",");
        sb.append(c1(this.t));
        if (!TextUtils.isEmpty(d0) && !d0.equals(Z0)) {
            sb.append(",");
            sb.append(zxv.c(d0));
            z2 = true;
        }
        if (!TextUtils.isEmpty(a1)) {
            if (!z2) {
                sb.append(",");
            }
            sb.append(",");
            sb.append(zxv.c(a1));
        }
        return sb.toString();
    }

    public void Q0(String str, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73564f83", new Object[]{this, str, map});
        } else if (this.k) {
            this.o.p().debugLog(this, W0(str, map));
        }
    }

    public void R0(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d0fdb4", new Object[]{this, new Long(j), str});
        } else if (!B0()) {
            V0(j, str);
            q1();
            long j2 = this.r;
            if (j2 > 0) {
                a aVar = new a(j, str);
                this.s = aVar;
                crt.g(aVar, j2, TimeUnit.MILLISECONDS);
                return;
            }
            U0(j, str);
            S0(j, str);
        }
    }

    @Override // tb.oz8
    public void T(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e8449c", new Object[]{this, new Long(j)});
            return;
        }
        if (j > 10000) {
            j = 10000;
        }
        this.r = j;
        A("delayFinishTime=" + j);
    }

    public void T0(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0511be", new Object[]{this, l});
            return;
        }
        int size = this.m.size();
        if (size > 0) {
            for (int i = size - 1; i >= 0; i--) {
                rz8 rz8Var = this.m.get(i);
                if (rz8Var.d <= 0) {
                    rz8Var.c(l);
                    return;
                }
            }
        }
    }

    public void U0(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7266a477", new Object[]{this, new Long(j), str});
        }
    }

    public void V0(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eff74e", new Object[]{this, new Long(j), str});
        }
    }

    public String X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e50923e", new Object[]{this});
        }
        return String.valueOf(A0(LAYER.getKey()));
    }

    public int Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73f64629", new Object[]{this})).intValue();
        }
        return this.q;
    }

    public String Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1e176d7", new Object[]{this});
        }
        return String.valueOf(A0(MODULE.getKey()));
    }

    public String a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abaf567b", new Object[]{this});
        }
        Object A0 = A0(PARENT_STAGE.getKey());
        if (A0 != null) {
            return String.valueOf(A0);
        }
        return "";
    }

    public String b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this});
        }
        return y0("_scene");
    }

    public int d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d62c78aa", new Object[]{this})).intValue();
        }
        return this.p;
    }

    public final boolean e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7423890", new Object[]{this})).booleanValue();
        }
        if (e1r.d() || this.o.B(b1())) {
            return true;
        }
        if (this.o.A(Z0()) && C0()) {
            I.add(a().b());
            return true;
        } else if (I.contains(a().b())) {
            return true;
        } else {
            return false;
        }
    }

    public List<String> f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3ef41017", new Object[]{this});
        }
        return null;
    }

    @Override // tb.cck, tb.paq
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            t("succeed");
        }
    }

    /* renamed from: g1 */
    public oz8 D0(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oz8) ipChange.ipc$dispatch("982a972d", new Object[]{this, new Long(j), str});
        }
        if (!this.k || TextUtils.isEmpty(str)) {
            return this;
        }
        return log(str);
    }

    /* renamed from: h1 */
    public oz8 E0(long j, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oz8) ipChange.ipc$dispatch("695bfc24", new Object[]{this, new Long(j), map});
        }
        if (!this.k || map == null) {
            return this;
        }
        return log(j + "," + map.toString());
    }

    /* renamed from: i1 */
    public oz8 log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oz8) ipChange.ipc$dispatch("d6bcda7b", new Object[]{this, str});
        }
        if (this.k && !TextUtils.isEmpty(str)) {
            this.q += str.length();
            this.o.p().releaseLog(this, W0(str, null));
        }
        return this;
    }

    /* renamed from: j1 */
    public oz8 F0(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oz8) ipChange.ipc$dispatch("c7fb2b96", new Object[]{this, map});
        }
        if (!this.k || map == null) {
            return this;
        }
        return log(map.toString());
    }

    public final String k1(Map<String, ?> map, List<String> list) {
        Object remove;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e06fbbf", new Object[]{this, map, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && (remove = map.remove(str)) != null) {
                if (z2) {
                    sb.append(",");
                }
                sb.append(zxv.c(str));
                sb.append("=");
                sb.append(zxv.c(String.valueOf(remove)));
                z2 = true;
            }
        }
        return sb.toString();
    }

    public final String l1(Map<String, ?> map) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc976ecd", new Object[]{this, map});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null && !LAYER.getKey().equals(key) && !MODULE.getKey().equals(key) && !STATUS.getKey().equals(key) && !STAGES.getKey().equals(key) && !PARENT_STAGE.getKey().equals(key)) {
                if (z2) {
                    sb.append(",");
                }
                sb.append(zxv.c(key));
                sb.append("=");
                sb.append(zxv.c(String.valueOf(value)));
                z2 = true;
            }
        }
        return sb.toString();
    }

    @Override // tb.oz8
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a381e3a3", new Object[]{this});
            return;
        }
        Runnable runnable = this.s;
        this.r = 0L;
        this.s = null;
        if (runnable != null) {
            crt.f(runnable);
        }
    }

    public void m1(String str, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a01d37", new Object[]{this, str, map});
        } else if (this.k) {
            this.q += str.length();
            this.o.p().releaseLog(this, W0(str, map));
        }
    }

    @Override // tb.oz8
    public qz8 n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qz8) ipChange.ipc$dispatch("32e5f1bc", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<rz8> it = this.n.iterator();
        while (it.hasNext()) {
            rz8 next = it.next();
            if (str.equals(next.name())) {
                return next;
            }
        }
        v15 v15Var = new v15(str);
        this.n.add(v15Var);
        g0("_stage", str);
        return v15Var;
    }

    public final void n1() {
        StageList stageList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601c853e", new Object[]{this});
            return;
        }
        T0(Long.valueOf(cck.H0()));
        if (this.n.size() > 0) {
            stageList = this.n;
        } else {
            stageList = this.m;
        }
        if (!stageList.isEmpty()) {
            p1(STAGES, stageList);
        }
    }

    public final <T> void o1(ess<T> essVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a5eada", new Object[]{this, essVar, t});
        } else if (A0(essVar.getKey()) == null) {
            p1(essVar, t);
        }
    }

    public final <T> void p1(ess<T> essVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a87821", new Object[]{this, essVar, t});
        } else {
            super.J0(essVar, t);
        }
    }

    public final void q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95cf3c34", new Object[]{this});
            return;
        }
        FalcoEnvironmentImpl m = FalcoEnvironmentImpl.m();
        if (m != null) {
            String c = m.c();
            e k = m.k();
            q s = m.s();
            l a2 = m.a();
            k l = m.l();
            p g = m.g();
            c d = m.d();
            o1(ENV_FALCO_ID, c);
            o1(u, l.f10470a);
            o1(v, l.b);
            o1(w, Long.valueOf(s.c));
            o1(b0, Integer.valueOf(s.d));
            o1(x, Long.valueOf(a2.b));
            o1(y, a2.f10471a);
            o1(z, a2.d);
            o1(A, Integer.valueOf(a2.f));
            o1(B, Integer.valueOf(d.c));
            o1(C, Integer.valueOf(d.d));
            o1(D, g.f10475a);
            o1(E, Integer.valueOf(g.k));
            o1(F, k.b);
            o1(G, k.f10462a);
            long j = a2.h;
            if (j > 0) {
                o1(H, Long.valueOf(j));
            }
        }
    }

    public boolean r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("573aacde", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public rz8 s1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rz8) ipChange.ipc$dispatch("bf377130", new Object[]{this, str});
        }
        Iterator<rz8> it = this.m.iterator();
        while (it.hasNext()) {
            rz8 next = it.next();
            if (str.equals(next.name())) {
                return next;
            }
        }
        jhq jhqVar = new jhq(str);
        this.m.add(jhqVar);
        if (this.n.size() <= 0) {
            g0("_stage", str);
        }
        return jhqVar;
    }

    @Override // tb.oz8
    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86ec6e4", new Object[]{this, str});
        } else {
            R0(cck.H0(), str);
        }
    }

    public final String t1(Map<String, ?> map) {
        boolean z2 = true;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3e069bc", new Object[]{this, map});
        }
        String k1 = k1(map, f1());
        String k12 = k1(map, w1());
        String l1 = l1(map);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(k1)) {
            sb.append(k1);
            z3 = true;
        }
        if (!TextUtils.isEmpty(l1)) {
            if (z3) {
                sb.append(",");
            }
            sb.append(l1);
        } else {
            z2 = z3;
        }
        if (!TextUtils.isEmpty(k12)) {
            if (z2) {
                sb.append(",");
            }
            sb.append(k12);
        }
        return sb.toString();
    }

    @Override // tb.cck
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return v1(a().a(), j0());
    }

    public final String v1(Iterable<Map.Entry<String, String>> iterable, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc58ca37", new Object[]{this, iterable, map});
        }
        String P0 = P0();
        String O0 = O0(iterable);
        String t1 = t1(map);
        Object A0 = A0(STAGES.getKey());
        String valueOf = A0 != null ? String.valueOf(A0) : null;
        LinkedList linkedList = new LinkedList();
        if (!TextUtils.isEmpty(valueOf)) {
            linkedList.addFirst(valueOf);
            linkedList.addFirst("|");
        }
        if (!TextUtils.isEmpty(t1)) {
            linkedList.addFirst(t1);
            linkedList.addFirst("|");
        } else if (!linkedList.isEmpty()) {
            linkedList.addFirst("|");
        }
        if (!TextUtils.isEmpty(O0)) {
            linkedList.addFirst(O0);
            linkedList.addFirst("|");
        } else if (!linkedList.isEmpty()) {
            linkedList.addFirst("|");
        }
        linkedList.addFirst(P0);
        StringBuilder sb = new StringBuilder();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String sb2 = sb.toString();
        this.p += sb2.length();
        return sb2;
    }

    public List<String> w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f1f8722d", new Object[]{this});
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:6|(2:8|(1:10))|11|(1:13)|14|(2:50|15)|(3:34|36|(1:38)(2:39|(1:41)(4:(1:43)|(1:45)|46|47)))|26|52|27|48|28|29|36|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:6|(2:8|(1:10))|11|(1:13)|14|50|15|(3:34|36|(1:38)(2:39|(1:41)(4:(1:43)|(1:45)|46|47)))|26|52|27|48|28|29|36|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        r8 = r7;
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
        r1 = null;
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
        anet.channel.util.ALog.e("falco.FalcoSpanImpl", "[finishInternal] error", null, r7, new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void S0(long r6, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pz8.S0(long, java.lang.String):void");
    }

    public final String u1(Iterable<Map.Entry<String, String>> iterable, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a5f77bf", new Object[]{this, iterable, map});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("finishTime", s0());
            JSONObject jSONObject2 = new JSONObject();
            if (iterable != null) {
                for (Map.Entry<String, String> entry : iterable) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("baggage", jSONObject2);
            Object A0 = A0(STAGES.getKey());
            JSONArray jSONArray = new JSONArray();
            if (A0 instanceof List) {
                for (Object obj : (List) A0) {
                    jSONArray.put(String.valueOf(obj));
                }
            }
            jSONObject.put("stages", jSONArray);
            jSONObject.put("traceID", a().b());
            jSONObject.put("scene", b1());
            jSONObject.put("tags", new JSONObject(map));
            jSONObject.put("spanID", a().c());
            jSONObject.put("module", Z0());
            jSONObject.put("operationName", d0());
            jSONObject.put(ExperimentCognationPO.TYPE_LAYER, X0());
            jSONObject.put("errorCode", A0("errorCode"));
            jSONObject.put("startTime", z());
            jSONObject.put("status", this.t);
            jSONObject.put("pStage", a1());
            return jSONObject.toString();
        } catch (Exception e) {
            ALog.e("falco.FalcoSpanImpl", "[toJsonString] error", null, e, new Object[0]);
            return "";
        }
    }

    public final String W0(String str, Map<String, ?> map) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5e8ca59", new Object[]{this, str, map});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a().b());
        sb.append(",");
        sb.append(a().c());
        sb.append(",");
        sb.append(Z0());
        Object A0 = A0(STAGES.getKey());
        if (A0 != null) {
            sb.append(",");
            sb.append(A0);
        }
        sb.append("|");
        if (map != null && !map.isEmpty()) {
            sb.append("@{");
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                if (z2) {
                    sb.append(",");
                }
                sb.append(zxv.c(entry.getKey()));
                sb.append("=");
                sb.append(zxv.c(String.valueOf(entry.getValue())));
                z2 = true;
            }
            sb.append("},");
        }
        sb.append(str);
        return sb.toString();
    }

    public final int c1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5f3bf6b", new Object[]{this, str})).intValue();
        }
        if ("succeed".equals(str)) {
            return 1;
        }
        if ("failed".equals(str)) {
            return 2;
        }
        return "cancel".equals(str) ? 3 : 0;
    }

    public pz8(s9u s9uVar, String str, String str2, long j, Map<String, Object> map, List<utn> list, String str3) {
        super(s9uVar, str2, j, map, list);
        boolean z2 = false;
        this.o = s9uVar;
        p1(MODULE, str2);
        p1(STATUS, 0);
        p1(LAYER, str3);
        if (C0()) {
            if (!TextUtils.isEmpty(str)) {
                g0("_scene", str);
            } else {
                g0("_scene", "unknownScene");
            }
        }
        String y0 = y0("_stage");
        if (!TextUtils.isEmpty(y0)) {
            p1(PARENT_STAGE, y0);
            g0("_stage", null);
        }
        if (e1() && !B0()) {
            z2 = true;
        }
        this.k = z2;
        this.l = s9uVar.y(y0("_scene"));
        if (z2 && r1()) {
            s9uVar.p().startSpan(this);
        }
    }
}
