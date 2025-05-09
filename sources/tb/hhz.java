package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class hhz implements Comparable<hhz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c Companion = new c(null);

    /* renamed from: a  reason: collision with root package name */
    private bgz<hhz> f20650a;
    private boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends hhz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Object c;

        static {
            t2o.a(598737337);
        }

        public a(Object obj) {
            super(null);
            this.c = obj;
        }

        public static /* synthetic */ a L(a aVar, Object obj, int i, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b5c98862", new Object[]{aVar, obj, new Integer(i), obj2});
            }
            if ((i & 1) != 0) {
                obj = aVar.c;
            }
            return aVar.K(obj);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/func_vm/expr/NCExprVar$AnyVar");
        }

        public final Object J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8b379b37", new Object[]{this});
            }
            return this.c;
        }

        public final a K(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("399beb29", new Object[]{this, obj});
            }
            return new a(obj);
        }

        public final Object M() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return this.c;
        }

        @Override // tb.hhz
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && ckf.b(this.c, ((a) obj).c)) {
                return true;
            }
            return false;
        }

        @Override // tb.hhz
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            Object obj = this.c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "AnyVar(value=" + this.c + ')';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737339);
        }

        public /* synthetic */ c(a07 a07Var) {
            this();
        }

        public final hhz a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("64d564fd", new Object[]{this});
            }
            return l.INSTANCE;
        }

        public final hhz b(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("c00717b6", new Object[]{this, new Double(d)});
            }
            return new d(d);
        }

        public final hhz c(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("5b8607b8", new Object[]{this, new Float(f)});
            }
            return new f(f);
        }

        public final hhz d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("44c46fbb", new Object[]{this, new Integer(i)});
            }
            return new g(i);
        }

        public final hhz e(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("9283e7bc", new Object[]{this, new Long(j)});
            }
            return new i(j);
        }

        public final hhz f(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("d4649c50", new Object[]{this, obj});
            }
            if (obj instanceof Integer) {
                return new g(((Number) obj).intValue());
            }
            if (obj instanceof Long) {
                return new i(((Number) obj).longValue());
            }
            if (obj instanceof Double) {
                return new d(((Number) obj).doubleValue());
            }
            if (obj instanceof Float) {
                return new f(((Number) obj).floatValue());
            }
            if (obj instanceof Boolean) {
                return new b(((Boolean) obj).booleanValue());
            }
            if (obj instanceof String) {
                return new m((String) obj);
            }
            if (obj instanceof Map) {
                if (obj != null) {
                    return new j((Map) obj);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            } else if (obj instanceof List) {
                if (obj != null) {
                    return new h((List) obj);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            } else if (obj instanceof xgz) {
                return new e((xgz) obj);
            } else {
                return new a(obj);
            }
        }

        public final hhz g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("6a0509be", new Object[]{this, str});
            }
            ckf.g(str, "value");
            return new m(str);
        }

        public final hhz h(List<? extends Object> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("41877225", new Object[]{this, list});
            }
            ckf.g(list, "value");
            return new h(list);
        }

        public final hhz i(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("2884ed3d", new Object[]{this, map});
            }
            ckf.g(map, "value");
            return new j(map);
        }

        public final hhz j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("6e7b67cc", new Object[]{this, new Boolean(z)});
            }
            return new b(z);
        }

        public final hhz k(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("96b5ed31", new Object[]{this, obj});
            }
            if (obj == null) {
                return m();
            }
            return f(obj);
        }

        public final hhz l(List<lfz> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("af0b6a5c", new Object[]{this, list});
            }
            ckf.g(list, "value");
            return new k(list);
        }

        public final hhz m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("9db7b15b", new Object[]{this});
            }
            return l.INSTANCE;
        }

        public final hhz n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("97b8628", new Object[]{this});
            }
            return n.INSTANCE;
        }

        public c() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e extends hhz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final xgz c;

        static {
            t2o.a(598737341);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xgz xgzVar) {
            super(null);
            ckf.g(xgzVar, "value");
            this.c = xgzVar;
        }

        public static /* synthetic */ e L(e eVar, xgz xgzVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("68b6ae09", new Object[]{eVar, xgzVar, new Integer(i), obj});
            }
            if ((i & 1) != 0) {
                xgzVar = eVar.c;
            }
            return eVar.K(xgzVar);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/func_vm/expr/NCExprVar$ExprFuncVar");
        }

        public final xgz J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xgz) ipChange.ipc$dispatch("d3648da", new Object[]{this});
            }
            return this.c;
        }

        public final e K(xgz xgzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("cc987e87", new Object[]{this, xgzVar});
            }
            ckf.g(xgzVar, "value");
            return new e(xgzVar);
        }

        public final xgz M() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xgz) ipChange.ipc$dispatch("21d2ce93", new Object[]{this});
            }
            return this.c;
        }

        @Override // tb.hhz
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && ckf.b(this.c, ((e) obj).c)) {
                return true;
            }
            return false;
        }

        @Override // tb.hhz
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.c.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ExprFuncVar(value=" + this.c + ')';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class l extends hhz {
        public static final l INSTANCE = new l();

        static {
            t2o.a(598737348);
        }

        private l() {
            super(null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class n extends hhz {
        public static final n INSTANCE = new n();

        static {
            t2o.a(598737350);
        }

        private n() {
            super(null);
        }
    }

    static {
        t2o.a(598737336);
    }

    public /* synthetic */ hhz(a07 a07Var) {
        this();
    }

    public final hhz A(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("33ead53b", new Object[]{this, hhzVar});
        }
        ckf.g(hhzVar, "other");
        if (hhzVar.w()) {
            return l.INSTANCE;
        }
        boolean z = this instanceof g;
        if (z && (hhzVar instanceof g)) {
            return new g(((g) this).J() % ((g) hhzVar).J());
        }
        if (z && (hhzVar instanceof i)) {
            return new i(((g) this).J() % ((i) hhzVar).J());
        }
        if (z && (hhzVar instanceof d)) {
            return new d(((g) this).J() % ((d) hhzVar).J());
        }
        if (z && (hhzVar instanceof f)) {
            return new f(((g) this).J() % ((f) hhzVar).J());
        }
        boolean z2 = this instanceof i;
        if (z2 && (hhzVar instanceof i)) {
            return new i(((i) this).J() % ((i) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof g)) {
            return new i(((i) this).J() % ((g) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof d)) {
            return new d(((i) this).J() % ((d) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof f)) {
            return new f(((float) ((i) this).J()) % ((f) hhzVar).J());
        }
        boolean z3 = this instanceof d;
        if (z3 && (hhzVar instanceof d)) {
            return new d(((d) this).J() % ((d) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof g)) {
            return new d(((d) this).J() % ((g) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof i)) {
            return new d(((d) this).J() % ((i) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof f)) {
            return new d(((d) this).J() % ((f) hhzVar).J());
        }
        boolean z4 = this instanceof f;
        if (z4 && (hhzVar instanceof f)) {
            return new f(((f) this).J() % ((f) hhzVar).J());
        }
        if (z4 && (hhzVar instanceof g)) {
            return new f(((f) this).J() % ((g) hhzVar).J());
        }
        if (z4 && (hhzVar instanceof i)) {
            return new f(((f) this).J() % ((float) ((i) hhzVar).J()));
        }
        if (z4 && (hhzVar instanceof d)) {
            return new d(((f) this).J() % ((d) hhzVar).J());
        }
        throw new NCExprException("Can't do rem left " + this + " + right " + hhzVar);
    }

    public final void B(bgz<hhz> bgzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7b1abc", new Object[]{this, bgzVar});
        } else {
            this.f20650a = bgzVar;
        }
    }

    public final hhz C(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("1b611c0f", new Object[]{this, hhzVar});
        }
        ckf.g(hhzVar, "other");
        boolean z = this instanceof g;
        if (z && (hhzVar instanceof g)) {
            return new g(((g) this).J() * ((g) hhzVar).J());
        }
        if (z && (hhzVar instanceof i)) {
            return new i(((g) this).J() * ((i) hhzVar).J());
        }
        if (z && (hhzVar instanceof d)) {
            return new d(((g) this).J() * ((d) hhzVar).J());
        }
        if (z && (hhzVar instanceof f)) {
            return new f(((g) this).J() * ((f) hhzVar).J());
        }
        boolean z2 = this instanceof i;
        if (z2 && (hhzVar instanceof i)) {
            return new i(((i) this).J() * ((i) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof g)) {
            return new i(((i) this).J() * ((g) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof d)) {
            return new d(((i) this).J() * ((d) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof f)) {
            return new f(((float) ((i) this).J()) * ((f) hhzVar).J());
        }
        boolean z3 = this instanceof d;
        if (z3 && (hhzVar instanceof d)) {
            return new d(((d) this).J() * ((d) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof g)) {
            return new d(((d) this).J() * ((g) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof i)) {
            return new d(((d) this).J() * ((i) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof f)) {
            return new d(((d) this).J() * ((f) hhzVar).J());
        }
        boolean z4 = this instanceof f;
        if (z4 && (hhzVar instanceof f)) {
            return new f(((f) this).J() * ((f) hhzVar).J());
        }
        if (z4 && (hhzVar instanceof g)) {
            return new f(((f) this).J() * ((g) hhzVar).J());
        }
        if (z4 && (hhzVar instanceof i)) {
            return new f(((f) this).J() * ((float) ((i) hhzVar).J()));
        }
        if (z4 && (hhzVar instanceof d)) {
            return new d(((f) this).J() * ((d) hhzVar).J());
        }
        throw new NCExprException("Can't do times left " + this + " + right " + hhzVar);
    }

    public final String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5014c4e8", new Object[]{this});
        }
        if (this instanceof l) {
            return pg1.ATOM_EXT_Null;
        }
        if (this instanceof g) {
            return "Int";
        }
        if (this instanceof i) {
            return "Long";
        }
        if (this instanceof d) {
            return "Double";
        }
        if (this instanceof f) {
            return "Float";
        }
        if (this instanceof b) {
            return pg1.ATOM_Boolean;
        }
        if (this instanceof m) {
            return pg1.ATOM_String;
        }
        if (this instanceof a) {
            return "Any";
        }
        if (this instanceof e) {
            return "ExprFunc";
        }
        if (this instanceof k) {
            return "Modifier";
        }
        if (this instanceof j) {
            return pg1.ATOM_Map;
        }
        if (this instanceof h) {
            return "List";
        }
        if (this instanceof n) {
            return "Void";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final hhz F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("7f7f251e", new Object[]{this});
        }
        if (this instanceof g) {
            return new g(-((g) this).J());
        }
        if (this instanceof i) {
            return new i(-((i) this).J());
        }
        if (this instanceof d) {
            return new d(-((d) this).J());
        }
        if (this instanceof f) {
            return new f(-((f) this).J());
        }
        return l.INSTANCE;
    }

    public final void G(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207b9d17", new Object[]{this, hhzVar});
            return;
        }
        ckf.g(hhzVar, "other");
        if ((this instanceof m) && (hhzVar instanceof m)) {
            ((m) this).K(((m) hhzVar).J());
        } else if ((this instanceof g) && (hhzVar instanceof g)) {
            ((g) this).K(((g) hhzVar).J());
        } else if ((this instanceof i) && (hhzVar instanceof i)) {
            ((i) this).K(((i) hhzVar).J());
        } else if ((this instanceof f) && (hhzVar instanceof f)) {
            ((f) this).K(((f) hhzVar).J());
        } else if ((this instanceof d) && (hhzVar instanceof d)) {
            ((d) this).K(((d) hhzVar).J());
        } else if ((this instanceof j) && (hhzVar instanceof j)) {
            ((j) this).N(((j) hhzVar).M());
        } else if ((this instanceof h) && (hhzVar instanceof h)) {
            ((h) this).N(((h) hhzVar).M());
        } else if (!(this instanceof k) || !(hhzVar instanceof k)) {
            throw new NCExprException("Can't update value of " + dun.b(getClass()) + " 类型不匹配或者不支持 " + dun.b(hhzVar.getClass()) + ' ');
        } else {
            ((k) this).N(((k) hhzVar).M());
        }
        if (v()) {
            bgz<hhz> bgzVar = this.f20650a;
            ckf.d(bgzVar);
            bgzVar.b(this);
        }
    }

    public final Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b7a4831f", new Object[]{this});
        }
        if (this instanceof a) {
            return ((a) this).M();
        }
        throw new IllegalStateException("ExprVar does not contain Any type");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c8d82c", new Object[]{this});
        } else {
            this.b = true;
        }
    }

    public final void c(jhz jhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f9d8c", new Object[]{this, jhzVar});
            return;
        }
        ckf.g(jhzVar, "funcContext");
        this.f20650a = new bgz<>(this, jhzVar);
    }

    /* renamed from: d */
    public int compareTo(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e027a1f2", new Object[]{this, hhzVar})).intValue();
        }
        ckf.g(hhzVar, "other");
        boolean z = this instanceof g;
        if (z && (hhzVar instanceof g)) {
            return ckf.i(((g) this).J(), ((g) hhzVar).J());
        }
        if (z && (hhzVar instanceof i)) {
            return ckf.j(((g) this).J(), ((i) hhzVar).J());
        }
        if (z && (hhzVar instanceof d)) {
            return Double.compare(((g) this).J(), ((d) hhzVar).J());
        }
        if (z && (hhzVar instanceof f)) {
            return Float.compare(((g) this).J(), ((f) hhzVar).J());
        }
        boolean z2 = this instanceof i;
        if (z2 && (hhzVar instanceof i)) {
            return ckf.j(((i) this).J(), ((i) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof g)) {
            return ckf.j(((i) this).J(), ((g) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof d)) {
            return Double.compare(((i) this).J(), ((d) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof f)) {
            return Float.compare((float) ((i) this).J(), ((f) hhzVar).J());
        }
        boolean z3 = this instanceof d;
        if (z3 && (hhzVar instanceof d)) {
            return Double.compare(((d) this).J(), ((d) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof g)) {
            return Double.compare(((d) this).J(), ((g) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof i)) {
            return Double.compare(((d) this).J(), ((i) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof f)) {
            return Double.compare(((d) this).J(), ((f) hhzVar).J());
        }
        boolean z4 = this instanceof f;
        if (z4 && (hhzVar instanceof f)) {
            return Float.compare(((f) this).J(), ((f) hhzVar).J());
        }
        if (z4 && (hhzVar instanceof g)) {
            return Float.compare(((f) this).J(), ((g) hhzVar).J());
        }
        if (z4 && (hhzVar instanceof i)) {
            return Float.compare(((f) this).J(), (float) ((i) hhzVar).J());
        }
        if (z4 && (hhzVar instanceof d)) {
            return Double.compare(((f) this).J(), ((d) hhzVar).J());
        }
        if ((this instanceof m) || (hhzVar instanceof m)) {
            return h().compareTo(hhzVar.h());
        }
        throw new NCExprException("Can't do compareTo left " + this + " + right " + hhzVar);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhz)) {
            return false;
        }
        if (!(this instanceof g) || !(obj instanceof g)) {
            if (!(this instanceof i) || !(obj instanceof i)) {
                if (!(this instanceof d) || !(obj instanceof d)) {
                    if (!(this instanceof f) || !(obj instanceof f)) {
                        if (!(this instanceof b) || !(obj instanceof b)) {
                            boolean z = this instanceof m;
                            if (z && (obj instanceof m)) {
                                return ckf.b(((m) this).J(), ((m) obj).J());
                            }
                            if ((this instanceof a) && (obj instanceof a)) {
                                return ckf.b(((a) this).M(), ((a) obj).M());
                            }
                            if ((this instanceof e) && (obj instanceof e)) {
                                return ckf.b(((e) this).M(), ((e) obj).M());
                            }
                            if ((this instanceof k) && (obj instanceof k)) {
                                return ckf.b(((k) this).M(), ((k) obj).M());
                            }
                            if ((this instanceof l) && (obj instanceof l)) {
                                return true;
                            }
                            if (z || (obj instanceof m)) {
                                return ckf.b(h(), ((hhz) obj).h());
                            }
                        } else if (((b) this).M() == ((b) obj).M()) {
                            return true;
                        }
                    } else if (((f) this).J() == ((f) obj).J()) {
                        return true;
                    }
                } else if (((d) this).J() == ((d) obj).J()) {
                    return true;
                }
            } else if (((i) this).J() == ((i) obj).J()) {
                return true;
            }
        } else if (((g) this).J() == ((g) obj).J()) {
            return true;
        }
        return false;
    }

    public final long f() {
        Long o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0c92aa5", new Object[]{this})).longValue();
        }
        if (this instanceof g) {
            return ((g) this).J();
        }
        if (this instanceof i) {
            return ((i) this).J();
        }
        if (this instanceof d) {
            return (long) ((d) this).J();
        }
        if (this instanceof f) {
            return ((f) this).J();
        }
        if (this instanceof b) {
            if (((b) this).M()) {
                return 1L;
            }
        } else if (!(this instanceof l) && (this instanceof m) && (o = ssq.o(((m) this).J())) != null) {
            return o.longValue();
        }
        return 0L;
    }

    public final List<Object> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5df5a09e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        if (this instanceof h) {
            for (Object obj : ((h) this).M()) {
                arrayList.add(obj);
            }
        } else {
            arrayList.add(ehz.INSTANCE.b(this));
        }
        return arrayList;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("819f4b1a", new Object[]{this});
        }
        if (this instanceof m) {
            return ((m) this).J();
        }
        if (this instanceof g) {
            return String.valueOf(((g) this).J());
        }
        if (this instanceof i) {
            return String.valueOf(((i) this).J());
        }
        if (this instanceof d) {
            return String.valueOf(((d) this).J());
        }
        if (this instanceof f) {
            return String.valueOf(((f) this).J());
        }
        if (this instanceof b) {
            return String.valueOf(((b) this).M());
        }
        if (this instanceof j) {
            return ((j) this).M().toString();
        }
        if (this instanceof h) {
            return ((h) this).M().toString();
        }
        if (this instanceof a) {
            return "Any";
        }
        if (this instanceof e) {
            return pg1.ATOM_Function;
        }
        if (this instanceof k) {
            return "Modifier";
        }
        if (this instanceof n) {
            return "Void";
        }
        if (this instanceof l) {
            return pg1.ATOM_EXT_Null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        if ((this instanceof l) || (this instanceof n)) {
            return 0;
        }
        if (this instanceof g) {
            return ((g) this).J();
        }
        if (this instanceof i) {
            return en9.a(((i) this).J());
        }
        if (this instanceof d) {
            return Double.doubleToLongBits(((d) this).J());
        }
        if (this instanceof f) {
            return Float.floatToIntBits(((f) this).J());
        }
        if (this instanceof b) {
            return bbz.a(((b) this).M());
        }
        if (this instanceof m) {
            return ((m) this).J().hashCode();
        }
        if (this instanceof a) {
            Object M = ((a) this).M();
            if (M == null) {
                return 0;
            }
            return M.hashCode();
        } else if (this instanceof e) {
            return ((e) this).M().hashCode();
        } else {
            if (this instanceof k) {
                return ((k) this).M().hashCode();
            }
            if (this instanceof j) {
                return ((j) this).M().hashCode();
            }
            if (this instanceof h) {
                return ((h) this).M().hashCode();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final hhz i(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("af8cf824", new Object[]{this, hhzVar});
        }
        ckf.g(hhzVar, "other");
        if (!hhzVar.w()) {
            boolean z = this instanceof g;
            if (z && (hhzVar instanceof g)) {
                return new g(((g) this).J() / ((g) hhzVar).J());
            }
            boolean z2 = this instanceof i;
            if (z2 && (hhzVar instanceof i)) {
                return new i(((i) this).J() / ((i) hhzVar).J());
            }
            boolean z3 = this instanceof d;
            if (z3 && (hhzVar instanceof d)) {
                return new d(((d) this).J() / ((d) hhzVar).J());
            }
            boolean z4 = this instanceof f;
            if (z4 && (hhzVar instanceof f)) {
                return new f(((f) this).J() / ((f) hhzVar).J());
            }
            if (z && (hhzVar instanceof i)) {
                return new i(((g) this).J() / ((i) hhzVar).J());
            }
            if (z && (hhzVar instanceof d)) {
                return new d(((g) this).J() / ((d) hhzVar).J());
            }
            if (z && (hhzVar instanceof f)) {
                return new f(((g) this).J() / ((f) hhzVar).J());
            }
            if (z2 && (hhzVar instanceof g)) {
                return new i(((i) this).J() / ((g) hhzVar).J());
            }
            if (z2 && (hhzVar instanceof d)) {
                return new d(((i) this).J() / ((d) hhzVar).J());
            }
            if (z2 && (hhzVar instanceof f)) {
                return new f(((float) ((i) this).J()) / ((f) hhzVar).J());
            }
            if (z3 && (hhzVar instanceof g)) {
                return new d(((d) this).J() / ((g) hhzVar).J());
            }
            if (z3 && (hhzVar instanceof i)) {
                return new d(((d) this).J() / ((i) hhzVar).J());
            }
            if (z3 && (hhzVar instanceof f)) {
                return new d(((d) this).J() / ((f) hhzVar).J());
            }
            if (z4 && (hhzVar instanceof g)) {
                return new f(((f) this).J() / ((g) hhzVar).J());
            }
            if (z4 && (hhzVar instanceof i)) {
                return new f(((f) this).J() / ((float) ((i) hhzVar).J()));
            }
            if (z4 && (hhzVar instanceof d)) {
                return new f(((f) this).J() / ((float) ((d) hhzVar).J()));
            }
            throw new NCExprException("Can't do div left " + this + " + right " + hhzVar);
        }
        throw new NCExprException("Can't do div when right is zero");
    }

    public final double j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c9967bc", new Object[]{this})).doubleValue();
        }
        if (this instanceof f) {
            return ((f) this).J();
        }
        if (this instanceof d) {
            return ((d) this).J();
        }
        throw new NCExprException("Can't get value of " + dun.b(getClass()) + " 类型不匹配 Double ");
    }

    public final float k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81828a1d", new Object[]{this})).floatValue();
        }
        if (this instanceof f) {
            return ((f) this).J();
        }
        if (this instanceof d) {
            return (float) ((d) this).J();
        }
        throw new NCExprException("Can't get value of " + dun.b(getClass()) + " 类型不匹配 Float ");
    }

    public final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b268c8b3", new Object[]{this})).intValue();
        }
        if (this instanceof g) {
            return ((g) this).J();
        }
        if (this instanceof i) {
            return (int) ((i) this).J();
        }
        throw new NCExprException("Can't get value of " + dun.b(getClass()) + " 类型不匹配 Int ");
    }

    public final long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ea6d", new Object[]{this})).longValue();
        }
        if (this instanceof g) {
            return ((g) this).J();
        }
        if (this instanceof i) {
            return ((i) this).J();
        }
        throw new NCExprException("Can't get value of " + dun.b(getClass()) + " 类型不匹配 Long ");
    }

    public final List<lfz> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("33ff0973", new Object[]{this});
        }
        if (this instanceof k) {
            return ((k) this).M();
        }
        throw new IllegalStateException("ExprVar does not contain Modifier type");
    }

    public final bgz<hhz> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bgz) ipChange.ipc$dispatch("6ca63524", new Object[]{this});
        }
        return this.f20650a;
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f06a652", new Object[]{this});
        }
        if (this instanceof m) {
            return ((m) this).J();
        }
        throw new NCExprException("Can't get value of " + dun.b(getClass()) + " 类型不匹配 String ");
    }

    public final /* synthetic */ <T> T q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("82bb133a", new Object[]{this});
        }
        if (this instanceof g) {
            ckf.m(4, "T");
            throw null;
        } else if (this instanceof i) {
            ckf.m(4, "T");
            throw null;
        } else if (this instanceof d) {
            ckf.m(4, "T");
            throw null;
        } else if (this instanceof f) {
            ckf.m(4, "T");
            throw null;
        } else if (this instanceof b) {
            ckf.m(4, "T");
            throw null;
        } else if (this instanceof m) {
            ckf.m(4, "T");
            throw null;
        } else if (this instanceof j) {
            ckf.m(4, "T");
            throw null;
        } else if (this instanceof h) {
            ckf.m(4, "T");
            throw null;
        } else {
            ckf.m(4, "T");
            throw null;
        }
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8525add", new Object[]{this})).booleanValue();
        }
        return this instanceof f;
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c39784f", new Object[]{this})).booleanValue();
        }
        if ((this instanceof g) || (this instanceof i)) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b47ec91", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c23d6dbc", new Object[]{this})).booleanValue();
        }
        return this instanceof l;
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9d6da92", new Object[]{this})).booleanValue();
        }
        if (this.f20650a != null) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83b760e6", new Object[]{this})).booleanValue();
        }
        if (this instanceof g) {
            if (((g) this).J() != 0) {
                return false;
            }
        } else if (this instanceof i) {
            if (((i) this).J() != 0) {
                return false;
            }
        } else if (this instanceof d) {
            if (((d) this).J() != vu3.b.GEO_NOT_SUPPORT) {
                return false;
            }
        } else if (!(this instanceof f) || ((f) this).J() != 0.0f) {
            return false;
        }
        return true;
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("239570e6", new Object[]{this})).booleanValue();
        }
        return this instanceof m;
    }

    public final hhz y(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("f1988025", new Object[]{this, hhzVar});
        }
        ckf.g(hhzVar, "other");
        boolean z = this instanceof g;
        if (z && (hhzVar instanceof g)) {
            return new g(((g) this).J() - ((g) hhzVar).J());
        }
        boolean z2 = this instanceof i;
        if (z2 && (hhzVar instanceof i)) {
            return new i(((i) this).J() - ((i) hhzVar).J());
        }
        boolean z3 = this instanceof d;
        if (z3 && (hhzVar instanceof d)) {
            return new d(((d) this).J() - ((d) hhzVar).J());
        }
        boolean z4 = this instanceof f;
        if (z4 && (hhzVar instanceof f)) {
            return new f(((f) this).J() - ((f) hhzVar).J());
        }
        if (z && (hhzVar instanceof i)) {
            return new i(((g) this).J() - ((i) hhzVar).J());
        }
        if (z && (hhzVar instanceof d)) {
            return new d(((g) this).J() - ((d) hhzVar).J());
        }
        if (z && (hhzVar instanceof f)) {
            return new f(((g) this).J() - ((f) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof g)) {
            return new i(((i) this).J() - ((g) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof d)) {
            return new d(((i) this).J() - ((d) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof f)) {
            return new f(((float) ((i) this).J()) - ((f) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof g)) {
            return new d(((d) this).J() - ((g) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof i)) {
            return new d(((d) this).J() - ((i) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof f)) {
            return new d(((d) this).J() - ((f) hhzVar).J());
        }
        if (z4 && (hhzVar instanceof g)) {
            return new f(((f) this).J() - ((g) hhzVar).J());
        }
        if (z4 && (hhzVar instanceof i)) {
            return new f(((f) this).J() - ((float) ((i) hhzVar).J()));
        }
        if (z4 && (hhzVar instanceof d)) {
            return new f(((f) this).J() - ((float) ((d) hhzVar).J()));
        }
        throw new NCExprException("Can't do minus left " + this + " + right " + hhzVar);
    }

    public final hhz z(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("3262a03b", new Object[]{this, hhzVar});
        }
        ckf.g(hhzVar, "other");
        boolean z = this instanceof g;
        if (z && (hhzVar instanceof g)) {
            return new g(((g) this).J() + ((g) hhzVar).J());
        }
        if (z && (hhzVar instanceof i)) {
            return new i(((g) this).J() + ((i) hhzVar).J());
        }
        if (z && (hhzVar instanceof d)) {
            return new d(((g) this).J() + ((d) hhzVar).J());
        }
        if (z && (hhzVar instanceof f)) {
            return new f(((g) this).J() + ((f) hhzVar).J());
        }
        boolean z2 = this instanceof i;
        if (z2 && (hhzVar instanceof i)) {
            return new i(((i) this).J() + ((i) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof g)) {
            return new i(((i) this).J() + ((g) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof d)) {
            return new d(((i) this).J() + ((d) hhzVar).J());
        }
        if (z2 && (hhzVar instanceof f)) {
            return new f(((float) ((i) this).J()) + ((f) hhzVar).J());
        }
        boolean z3 = this instanceof d;
        if (z3 && (hhzVar instanceof d)) {
            return new d(((d) this).J() + ((d) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof g)) {
            return new d(((d) this).J() + ((g) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof i)) {
            return new d(((d) this).J() + ((i) hhzVar).J());
        }
        if (z3 && (hhzVar instanceof f)) {
            return new d(((d) this).J() + ((f) hhzVar).J());
        }
        boolean z4 = this instanceof f;
        if (z4 && (hhzVar instanceof f)) {
            return new f(((f) this).J() + ((f) hhzVar).J());
        }
        if (z4 && (hhzVar instanceof g)) {
            return new f(((f) this).J() + ((g) hhzVar).J());
        }
        if (z4 && (hhzVar instanceof i)) {
            return new f(((f) this).J() + ((float) ((i) hhzVar).J()));
        }
        if (z4 && (hhzVar instanceof d)) {
            return new d(((f) this).J() + ((d) hhzVar).J());
        }
        if ((this instanceof m) || (hhzVar instanceof m)) {
            return new m(ckf.p(h(), hhzVar.h()));
        }
        throw new NCExprException("Can't do plus left " + this + " + right " + hhzVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b extends hhz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean c;

        static {
            t2o.a(598737338);
        }

        public b(boolean z) {
            super(null);
            this.c = z;
        }

        private final boolean J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4f047d5f", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public static /* synthetic */ b L(b bVar, boolean z, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("56d8ef5c", new Object[]{bVar, new Boolean(z), new Integer(i), obj});
            }
            if ((i & 1) != 0) {
                z = bVar.c;
            }
            return bVar.K(z);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/func_vm/expr/NCExprVar$BoolVar");
        }

        public final b K(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("20d54e75", new Object[]{this, new Boolean(z)});
            }
            return new b(z);
        }

        public final boolean M() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d1b766c6", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public final void N(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a71da05", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }

        @Override // tb.hhz
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return bbz.a(this.c);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "BoolVar(value=" + this.c + ')';
        }

        @Override // tb.hhz
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!ckf.b(b.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj != null) {
                return this.c == ((b) obj).c;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprVar.BoolVar");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d extends hhz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private double c;

        static {
            t2o.a(598737340);
        }

        public d(double d) {
            super(null);
            this.c = d;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/func_vm/expr/NCExprVar$DoubleVar");
        }

        public final double J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b0", new Object[]{this})).doubleValue();
            }
            return this.c;
        }

        public final void K(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a71876f", new Object[]{this, new Double(d)});
            } else {
                this.c = d;
            }
        }

        @Override // tb.hhz
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return Double.doubleToLongBits(this.c);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "DoubleVar(value=" + this.c + ')';
        }

        @Override // tb.hhz
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!ckf.b(d.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj != null) {
                return this.c == ((d) obj).c;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprVar.DoubleVar");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class f extends hhz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float c;

        static {
            t2o.a(598737342);
        }

        public f(float f) {
            super(null);
            this.c = f;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/func_vm/expr/NCExprVar$FloatVar");
        }

        public final float J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b2", new Object[]{this})).floatValue();
            }
            return this.c;
        }

        public final void K(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a718ef1", new Object[]{this, new Float(f)});
            } else {
                this.c = f;
            }
        }

        @Override // tb.hhz
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return Float.floatToIntBits(this.c);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FloatVar(value=" + this.c + ')';
        }

        @Override // tb.hhz
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!ckf.b(f.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj != null) {
                return this.c == ((f) obj).c;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprVar.FloatVar");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class g extends hhz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int c;

        static {
            t2o.a(598737343);
        }

        public g(int i) {
            super(null);
            this.c = i;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/func_vm/expr/NCExprVar$IntVar");
        }

        public final int J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public final void K(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a719a34", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        @Override // tb.hhz
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "IntVar(value=" + this.c + ')';
        }

        @Override // tb.hhz
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!ckf.b(g.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj != null) {
                return this.c == ((g) obj).c;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprVar.IntVar");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class h extends hhz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<? extends Object> c;

        static {
            t2o.a(598737344);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<? extends Object> list) {
            super(null);
            ckf.g(list, "_value");
            this.c = list;
        }

        private final List<Object> J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f131938c", new Object[]{this});
            }
            return this.c;
        }

        public static /* synthetic */ h L(h hVar, List list, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("56619277", new Object[]{hVar, list, new Integer(i), obj});
            }
            if ((i & 1) != 0) {
                list = hVar.c;
            }
            return hVar.K(list);
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/func_vm/expr/NCExprVar$ListVar");
        }

        public final h K(List<? extends Object> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("54b373fe", new Object[]{this, list});
            }
            ckf.g(list, "_value");
            return new h(list);
        }

        public final List<Object> M() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f8dfcf45", new Object[]{this});
            }
            return this.c;
        }

        public final void N(List<? extends Object> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9615fda0", new Object[]{this, list});
                return;
            }
            ckf.g(list, "newValue");
            this.c = list;
        }

        @Override // tb.hhz
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.c.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ListVar(value=" + this.c + ')';
        }

        @Override // tb.hhz
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!ckf.b(h.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj != null) {
                return ckf.b(this.c, ((h) obj).c);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprVar.ListVar");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class i extends hhz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long c;

        static {
            t2o.a(598737345);
        }

        public i(long j) {
            super(null);
            this.c = j;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/func_vm/expr/NCExprVar$LongVar");
        }

        public final long J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b6", new Object[]{this})).longValue();
            }
            return this.c;
        }

        public final void K(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a719df5", new Object[]{this, new Long(j)});
            } else {
                this.c = j;
            }
        }

        @Override // tb.hhz
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return en9.a(this.c);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "LongVar(value=" + this.c + ')';
        }

        @Override // tb.hhz
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!ckf.b(i.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj != null) {
                return this.c == ((i) obj).c;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprVar.LongVar");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class j extends hhz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, ? extends Object> c;

        static {
            t2o.a(598737346);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Map<String, ? extends Object> map) {
            super(null);
            ckf.g(map, "_value");
            this.c = map;
        }

        private final Map<String, Object> J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("41969450", new Object[]{this});
            }
            return this.c;
        }

        public static /* synthetic */ j L(j jVar, Map map, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("3bcd5003", new Object[]{jVar, map, new Integer(i), obj});
            }
            if ((i & 1) != 0) {
                map = jVar.c;
            }
            return jVar.K(map);
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/func_vm/expr/NCExprVar$MapVar");
        }

        public final j K(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("8deb1508", new Object[]{this, map});
            }
            ckf.g(map, "_value");
            return new j(map);
        }

        public final Map<String, Object> M() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ffc57d77", new Object[]{this});
            }
            return this.c;
        }

        public final void N(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("693218f6", new Object[]{this, map});
                return;
            }
            ckf.g(map, "newValue");
            this.c = map;
        }

        @Override // tb.hhz
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.c.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MapVar(value=" + this.c + ')';
        }

        @Override // tb.hhz
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!ckf.b(j.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj != null) {
                return ckf.b(this.c, ((j) obj).c);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprVar.MapVar");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class k extends hhz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<lfz> c;

        static {
            t2o.a(598737347);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List<lfz> list) {
            super(null);
            ckf.g(list, "_value");
            this.c = list;
        }

        private final List<lfz> J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f131938c", new Object[]{this});
            }
            return this.c;
        }

        public static /* synthetic */ k L(k kVar, List list, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k) ipChange.ipc$dispatch("97165757", new Object[]{kVar, list, new Integer(i), obj});
            }
            if ((i & 1) != 0) {
                list = kVar.c;
            }
            return kVar.K(list);
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/func_vm/expr/NCExprVar$ModifierVar");
        }

        public final k K(List<lfz> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k) ipChange.ipc$dispatch("dd1fbb7", new Object[]{this, list});
            }
            ckf.g(list, "_value");
            return new k(list);
        }

        public final List<lfz> M() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f8dfcf45", new Object[]{this});
            }
            return this.c;
        }

        public final void N(List<lfz> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9615fda0", new Object[]{this, list});
                return;
            }
            ckf.g(list, "newValue");
            this.c = list;
        }

        @Override // tb.hhz
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.c.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ModifierVar(value=" + this.c + ')';
        }

        @Override // tb.hhz
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!ckf.b(k.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj != null) {
                return ckf.b(this.c, ((k) obj).c);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprVar.ModifierVar");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class m extends hhz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String c;

        static {
            t2o.a(598737349);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(null);
            ckf.g(str, "_value");
            this.c = str;
        }

        public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/func_vm/expr/NCExprVar$StringVar");
        }

        public final String J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
            }
            return this.c;
        }

        public final void K(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41d32ab9", new Object[]{this, str});
                return;
            }
            ckf.g(str, "newValue");
            this.c = str;
        }

        @Override // tb.hhz
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.c.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "StringVar(value=" + this.c + ')';
        }

        @Override // tb.hhz
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!ckf.b(m.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj != null) {
                return ckf.b(this.c, ((m) obj).c);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprVar.StringVar");
        }
    }

    private hhz() {
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3f8b823", new Object[]{this})).booleanValue();
        }
        if (this instanceof b) {
            return ((b) this).M();
        }
        if (this instanceof l ? true : this instanceof n) {
            return false;
        }
        if (this instanceof g) {
            if (((g) this).J() == 0) {
                return false;
            }
        } else if (this instanceof i) {
            if (((i) this).J() == 0) {
                return false;
            }
        } else if (this instanceof d) {
            if (((d) this).J() == vu3.b.GEO_NOT_SUPPORT) {
                return false;
            }
        } else if (this instanceof f) {
            if (((f) this).J() == 0.0f) {
                return false;
            }
        } else if (this instanceof m) {
            m mVar = (m) this;
            String J = mVar.J();
            if (J != null) {
                String lowerCase = J.toLowerCase(Locale.ROOT);
                ckf.f(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                if (ckf.b(lowerCase, "false") || ckf.b(mVar.J(), "0")) {
                    return false;
                }
                if (!(mVar.J().length() > 0)) {
                    return false;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } else if (this instanceof j) {
            return ((j) this).M().isEmpty();
        } else {
            if (this instanceof h) {
                return ((h) this).M().isEmpty();
            }
        }
        return true;
    }
}
