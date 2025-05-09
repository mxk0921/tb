package com.taobao.monitor.procedure;

import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import tb.cj8;
import tb.j8e;
import tb.khh;
import tb.mdd;
import tb.odd;
import tb.r1w;
import tb.ugq;
import tb.w9a;
import tb.wua;
import tb.wxm;
import tb.zq6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ProcedureImpl implements odd, j8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile long j = System.currentTimeMillis();
    public static final Set<String> k;

    /* renamed from: a  reason: collision with root package name */
    public final String f11128a;
    public final String b;
    public final mdd c;
    public final r1w d;
    public Status e = Status.INIT;
    public final List<mdd> f = new LinkedList();
    public b g;
    public final boolean h;
    public final Map<String, Long> i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum Status {
        INIT,
        RUNNING,
        STOPPED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Status status, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/procedure/ProcedureImpl$Status");
        }

        public static Status valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Status) ipChange.ipc$dispatch("3b636fa3", new Object[]{str});
            }
            return (Status) Enum.valueOf(Status.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((odd) ProcedureImpl.w(ProcedureImpl.this)).t(ProcedureImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void a(r1w r1wVar);

        void b(r1w r1wVar);

        void c(r1w r1wVar, cj8 cj8Var);

        void d(r1w r1wVar, ugq ugqVar);
    }

    static {
        HashSet hashSet = new HashSet();
        k = hashSet;
        hashSet.add("name");
        hashSet.add("start");
        hashSet.add("end");
    }

    public ProcedureImpl(String str, mdd mddVar, String str2, boolean z, boolean z2) {
        this.f11128a = str;
        this.c = mddVar;
        this.h = z;
        r1w r1wVar = new r1w(str, z, z2);
        this.d = r1wVar;
        if (mddVar != null) {
            r1wVar.d("parentSession", mddVar.r());
        }
        if (TextUtils.isEmpty(str2)) {
            long j2 = j;
            j = 1 + j2;
            this.b = String.valueOf(j2);
        } else {
            this.b = str2;
        }
        r1wVar.d(MspGlobalDefine.SESSION, this.b);
        r1wVar.e(this.b);
        this.i = new HashMap();
    }

    public static /* synthetic */ mdd w(ProcedureImpl procedureImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("f82b223a", new Object[]{procedureImpl});
        }
        return procedureImpl.c;
    }

    @Override // tb.mdd
    public mdd a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("97fa7e26", new Object[]{this, str, obj});
        }
        if (isAlive()) {
            this.d.d(str, obj);
        }
        return this;
    }

    @Override // tb.mdd
    public mdd b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("710326c5", new Object[]{this, str, map});
        }
        if (str != null && isAlive()) {
            this.d.a(str, map);
        }
        return this;
    }

    @Override // tb.mdd
    public mdd c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("73340a13", new Object[]{this});
        }
        if (this.e == Status.INIT) {
            this.e = Status.RUNNING;
            mdd mddVar = this.c;
            if (mddVar instanceof odd) {
                ((odd) mddVar).f(this);
            }
            b bVar = this.g;
            if (bVar != null) {
                bVar.a(this.d);
            }
        }
        return this;
    }

    @Override // tb.mdd
    public mdd d(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("d85a89dd", new Object[]{this, str, map});
        }
        if (str != null && isAlive()) {
            cj8 cj8Var = new cj8(str, map);
            this.d.k(cj8Var);
            b bVar = this.g;
            if (bVar != null) {
                bVar.c(this.d, cj8Var);
            }
        }
        return this;
    }

    @Override // tb.mdd
    public mdd e(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("4c31e53a", new Object[]{this, str, map});
        }
        return this;
    }

    @Override // tb.mdd
    public mdd end() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("7daf1745", new Object[]{this});
        }
        return q(false);
    }

    @Override // tb.odd
    public void f(mdd mddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5409f598", new Object[]{this, mddVar});
        } else if (mddVar != null && isAlive()) {
            synchronized (this.f) {
                ((LinkedList) this.f).add(mddVar);
            }
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        if (this.e == Status.RUNNING) {
            khh.b(new RuntimeException("Please call end function first!"));
        }
    }

    @Override // tb.mdd
    public mdd g(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("b8132913", new Object[]{this, str, new Long(j2)});
        }
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.i).put(str, Long.valueOf(j2));
        }
        return this;
    }

    @Override // tb.mdd
    public mdd h(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("bdeff6b2", new Object[]{this, str, map});
        }
        if (str != null && isAlive()) {
            this.d.b(str, map);
        }
        return this;
    }

    @Override // tb.mdd
    public mdd i(String str, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("d3a54738", new Object[]{this, str, new Long(j2), new Long(j3)});
        }
        g(str, j2);
        n(str, j3, null);
        return this;
    }

    @Override // tb.mdd
    public boolean isAlive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89930ce", new Object[]{this})).booleanValue();
        }
        if (Status.STOPPED != this.e) {
            return true;
        }
        return false;
    }

    @Override // tb.mdd
    public mdd j(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("f8564df8", new Object[]{this, str, new Long(j2)});
        }
        if (str != null && isAlive()) {
            ugq ugqVar = new ugq(str, j2);
            this.d.q(ugqVar);
            b bVar = this.g;
            if (bVar != null) {
                bVar.d(this.d, ugqVar);
            }
        }
        return this;
    }

    @Override // tb.mdd
    public mdd k(String str, long j2, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("123baf2f", new Object[]{this, str, new Long(j2), str2, map});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "UNKNOWN";
        }
        map.put("errorType", str2);
        n(str, j2, map);
        return this;
    }

    @Override // tb.mdd
    public mdd l(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("48dfa2fc", new Object[]{this, str, obj});
        }
        if (isAlive() && !this.d.n().containsKey(str)) {
            this.d.d(str, obj);
        }
        return this;
    }

    @Override // tb.mdd
    public mdd m(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("3de93262", new Object[]{this, str, new Long(j2)});
        }
        if (str != null && isAlive()) {
            ugq ugqVar = new ugq(str, j2);
            if (this.d.r().contains(ugqVar)) {
                return this;
            }
            this.d.q(ugqVar);
            b bVar = this.g;
            if (bVar != null) {
                bVar.d(this.d, ugqVar);
            }
        }
        return this;
    }

    @Override // tb.mdd
    public mdd o(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("15eafc4b", new Object[]{this, str, map});
        }
        if (str != null && isAlive()) {
            this.d.c(str, map);
        }
        return this;
    }

    @Override // tb.mdd
    public mdd p(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("4c7abda9", new Object[]{this, str, str2, map});
        }
        return this;
    }

    @Override // tb.mdd
    public mdd q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("c494e695", new Object[]{this, new Boolean(z)});
        }
        if (this.e == Status.RUNNING) {
            synchronized (this.f) {
                try {
                    for (mdd mddVar : this.f) {
                        if (mddVar instanceof wxm) {
                            mdd y = ((wxm) mddVar).y();
                            if (y instanceof ProcedureImpl) {
                                ProcedureImpl procedureImpl = (ProcedureImpl) y;
                                if (procedureImpl.isAlive()) {
                                    this.d.h(procedureImpl.z());
                                }
                                if (!procedureImpl.h || z) {
                                    ((ProcedureImpl) y).q(z);
                                }
                            } else {
                                y.q(z);
                            }
                        } else {
                            mddVar.q(z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.c instanceof odd) {
                w9a.g().f().post(new a());
            }
            mdd mddVar2 = this.c;
            if (mddVar2 instanceof j8e) {
                ((j8e) mddVar2).s(z());
            }
            b bVar = this.g;
            if (bVar != null) {
                bVar.b(this.d);
            }
            this.e = Status.STOPPED;
        }
        return this;
    }

    @Override // tb.mdd
    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d369af2", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.j8e
    public void s(r1w r1wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb010b8e", new Object[]{this, r1wVar});
        } else if (isAlive()) {
            this.d.h(r1wVar);
        }
    }

    @Override // tb.odd
    public void t(mdd mddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b894d715", new Object[]{this, mddVar});
        } else if (mddVar != null) {
            synchronized (this.f) {
                ((LinkedList) this.f).remove(mddVar);
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f11128a;
    }

    @Override // tb.mdd
    public mdd u(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("e3faa03f", new Object[]{this, str, obj});
        }
        if (isAlive()) {
            this.d.f(str, obj);
        }
        return this;
    }

    @Override // tb.mdd
    public mdd v(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mdd) ipChange.ipc$dispatch("d292def7", new Object[]{this, str}) : this;
    }

    public ProcedureImpl x(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcedureImpl) ipChange.ipc$dispatch("74f837e3", new Object[]{this, bVar});
        }
        this.g = bVar;
        return this;
    }

    public r1w y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("e2d714e0", new Object[]{this});
        }
        return this.d;
    }

    public r1w z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1w) ipChange.ipc$dispatch("702d8764", new Object[]{this});
        }
        return this.d.v();
    }

    @Override // tb.mdd
    public mdd n(String str, long j2, Map<String, Object> map) {
        Long l;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("d027d992", new Object[]{this, str, new Long(j2), map});
        }
        if (!TextUtils.isEmpty(str) && (l = (Long) ((HashMap) this.i).get(str)) != null && this.f != null && isAlive()) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", str);
            hashMap.put("start", l);
            hashMap.put("end", Long.valueOf(j2));
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (!((HashSet) k).contains(entry.getKey())) {
                        hashMap.put(entry.getKey(), entry.getValue());
                    } else if (khh.a()) {
                        throw new RuntimeException("The " + entry.getKey() + " field cannot be added to the Apm subTask.");
                    }
                }
                obj = map.get("tag");
            } else {
                obj = null;
            }
            float nextFloat = new Random(System.currentTimeMillis()).nextFloat();
            Object obj2 = this.d.n().get("pageName");
            boolean z = nextFloat < ProcedureGlobal.f().c(obj2 == null ? null : obj2.toString());
            if ("pageLoad".equals(obj) || z) {
                this.d.g(hashMap);
            }
            ((HashMap) this.i).remove(str);
            zq6.a("ProcedureImpl", MspGlobalDefine.SESSION, this.b, "subTaskName", str, "startTime", l, "endTime", Long.valueOf(j2), wua.KEY_PROPERTIES, map);
        }
        return this;
    }
}
