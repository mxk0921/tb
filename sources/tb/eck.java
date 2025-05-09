package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.opentracing.impl.exception.UnsupportedFormatException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bw9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public mhh f18473a;
    public final Map<bw9<?>, ky3<?>> b;
    public final xuo c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements t9u {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f18474a;
        public List<utn> b = Collections.emptyList();
        public final Map<String, Object> c = new HashMap();
        public boolean d = false;

        static {
            t2o.a(315621415);
            t2o.a(315621384);
        }

        public a(eck eckVar, String str) {
        }

        public t9u b(raq raqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t9u) ipChange.ipc$dispatch("64507e29", new Object[]{this, raqVar});
            }
            return k("child_of", raqVar);
        }

        public t9u k(String str, raq raqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t9u) ipChange.ipc$dispatch("ee7ca51c", new Object[]{this, str, raqVar});
            }
            if (this.b == null) {
                return this;
            }
            dck dckVar = (dck) raqVar;
            if (!"child_of".equals(str) && !"follows_from".equals(str)) {
                return this;
            }
            if (this.b.isEmpty()) {
                this.b = Collections.singletonList(new utn(dckVar, str));
            } else {
                if (this.b.size() == 1) {
                    this.b = new ArrayList(this.b);
                }
                this.b.add(new utn(dckVar, str));
            }
            return this;
        }

        public t9u l(paq paqVar) {
            raq raqVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t9u) ipChange.ipc$dispatch("48b8b0a8", new Object[]{this, paqVar});
            }
            if (paqVar != null) {
                raqVar = paqVar.a();
            } else {
                raqVar = null;
            }
            return k("child_of", raqVar);
        }

        public List<utn> m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("fdeeafa2", new Object[]{this});
            }
            return this.b;
        }

        public long n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a88103ef", new Object[]{this})).longValue();
            }
            return this.f18474a;
        }

        public Map<String, Object> o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("6c88d54b", new Object[]{this});
            }
            return this.c;
        }

        public t9u p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t9u) ipChange.ipc$dispatch("f9e224a1", new Object[]{this});
            }
            this.d = true;
            return this;
        }

        public boolean q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b4a67eb7", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        public t9u r(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t9u) ipChange.ipc$dispatch("9ed4f2db", new Object[]{this, new Long(j)});
            }
            this.f18474a = j;
            return this;
        }

        public t9u s(String str, Number number) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t9u) ipChange.ipc$dispatch("da658e8f", new Object[]{this, str, number});
            }
            ((HashMap) this.c).put(str, number);
            return this;
        }

        public t9u t(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t9u) ipChange.ipc$dispatch("8f9b52c7", new Object[]{this, str, str2});
            }
            ((HashMap) this.c).put(str, str2);
            return this;
        }

        public t9u u(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t9u) ipChange.ipc$dispatch("92312a7", new Object[]{this, str, new Boolean(z)});
            }
            ((HashMap) this.c).put(str, Boolean.valueOf(z));
            return this;
        }

        public <T> t9u v(ess<T> essVar, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t9u) ipChange.ipc$dispatch("31482f98", new Object[]{this, essVar, t});
            }
            if (!(essVar == null || essVar.getKey() == null)) {
                ((HashMap) this.c).put(essVar.getKey(), t);
            }
            return this;
        }
    }

    static {
        t2o.a(315621414);
        t2o.a(315621383);
    }

    public eck() {
        this(new bck());
    }

    public vuo l(paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vuo) ipChange.ipc$dispatch("699f8bbc", new Object[]{this, paqVar});
        }
        return this.c.b(paqVar);
    }

    public paq m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("7a0bb35f", new Object[]{this});
        }
        return this.c.a();
    }

    public <C> raq n(bw9<C> bw9Var, C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (raq) ipChange.ipc$dispatch("b23adf83", new Object[]{this, bw9Var, c});
        }
        ky3 ky3Var = (ky3) ((HashMap) this.b).get(bw9Var);
        if (ky3Var != null) {
            return ky3Var.a(c);
        }
        throw new UnsupportedFormatException(bw9Var);
    }

    public <T> void o(raq raqVar, bw9<T> bw9Var, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36891963", new Object[]{this, raqVar, bw9Var, t});
            return;
        }
        ky3 ky3Var = (ky3) ((HashMap) this.b).get(bw9Var);
        if (ky3Var != null) {
            ky3Var.b((dck) raqVar, t);
            return;
        }
        throw new UnsupportedFormatException(bw9Var);
    }

    public mhh p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mhh) ipChange.ipc$dispatch("62325079", new Object[]{this});
        }
        if (this.f18473a == null) {
            this.f18473a = new zbk();
        }
        return this.f18473a;
    }

    public void q(mhh mhhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85e3358", new Object[]{this, mhhVar});
        } else if (mhhVar != null) {
            this.f18473a = mhhVar;
        }
    }

    public xuo r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xuo) ipChange.ipc$dispatch("b4390999", new Object[]{this});
        }
        return this.c;
    }

    public eck(xuo xuoVar) {
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put(bw9.a.TEXT_MAP, new xlt(false));
        hashMap.put(bw9.a.HTTP_HEADERS, new xlt(true));
        hashMap.put(bw9.a.BINARY, new ma2());
        this.c = xuoVar;
    }
}
