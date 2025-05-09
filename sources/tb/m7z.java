package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class m7z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f23832a;
    public final Integer b;
    public final hhz c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737371);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final m7z a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m7z) ipChange.ipc$dispatch("987c756c", new Object[]{this, new Integer(i)});
            }
            return new m7z(0, Integer.valueOf(i), null, 4, null);
        }

        public final m7z b(hhz hhzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m7z) ipChange.ipc$dispatch("cd49197", new Object[]{this, hhzVar});
            }
            ckf.g(hhzVar, "constValue");
            return new m7z(1, null, hhzVar, 2, null);
        }

        public a() {
        }
    }

    static {
        t2o.a(598737370);
    }

    public m7z(int i, Integer num, hhz hhzVar) {
        this.f23832a = i;
        this.b = num;
        this.c = hhzVar;
    }

    public final hhz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("c8d16ba1", new Object[]{this});
        }
        return this.c;
    }

    public final Integer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("1acc29d5", new Object[]{this});
        }
        return this.b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc57462", new Object[]{this})).booleanValue();
        }
        if (this.f23832a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a1f7c94", new Object[]{this})).booleanValue();
        }
        if (this.f23832a == 1) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7z)) {
            return false;
        }
        m7z m7zVar = (m7z) obj;
        if (this.f23832a == m7zVar.f23832a && ckf.b(this.b, m7zVar.b) && ckf.b(this.c, m7zVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i3 = this.f23832a * 31;
        Integer num = this.b;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i4 = (i3 + i) * 31;
        hhz hhzVar = this.c;
        if (hhzVar != null) {
            i2 = hhzVar.hashCode();
        }
        return i4 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FuncCodeInfo(type=" + this.f23832a + ", exprIndex=" + this.b + ", constValue=" + this.c + ')';
    }

    public /* synthetic */ m7z(int i, Integer num, hhz hhzVar, int i2, a07 a07Var) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : hhzVar);
    }
}
