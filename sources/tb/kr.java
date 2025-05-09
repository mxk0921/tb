package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class kr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f22861a;
    public final String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a extends kr {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final int c;
        public final String d;

        static {
            t2o.a(803209219);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, String str) {
            super(i, str, null);
            ckf.g(str, "errorMsg");
            this.c = i;
            this.d = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbicontext/AbilityResult$Error");
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (this.c != aVar.c || !ckf.b(this.d, aVar.d)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            int i2 = this.c * 31;
            String str = this.d;
            if (str != null) {
                i = str.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Error(errorCode=" + this.c + ", errorMsg=" + this.d + f7l.BRACKET_END_STR;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b extends kr {
        public static final b INSTANCE = new b();

        static {
            t2o.a(803209220);
        }

        public b() {
            super(0, null, null);
        }
    }

    static {
        t2o.a(803209218);
    }

    public kr(int i, String str) {
        this.f22861a = i;
        this.b = str;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.f22861a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
        }
        return this.b;
    }

    public /* synthetic */ kr(int i, String str, a07 a07Var) {
        this(i, str);
    }
}
