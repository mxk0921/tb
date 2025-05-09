package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.LayoutDirection;
import com.taobao.weex.common.WXConfig;
import tb.can;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class d3z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends d3z {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        static {
            t2o.a(598737084);
        }

        public a() {
            super(null);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/RowColumn/CrossAxisAlignment$CenterCrossAxisAlignment");
        }

        @Override // tb.d3z
        public int a(int i, LayoutDirection layoutDirection, qjz qjzVar, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f4c57de3", new Object[]{this, new Integer(i), layoutDirection, qjzVar, new Integer(i2)})).intValue();
            }
            ckf.g(layoutDirection, WXConfig.layoutDirection);
            ckf.g(qjzVar, "placeable");
            return i / 2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737085);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public final d3z a(can.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d3z) ipChange.ipc$dispatch("3ddfc083", new Object[]{this, bVar});
            }
            ckf.g(bVar, "horizontal");
            return new d(bVar);
        }

        public final d3z b(can.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d3z) ipChange.ipc$dispatch("544f9f5f", new Object[]{this, cVar});
            }
            ckf.g(cVar, "vertical");
            return new f(cVar);
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c extends d3z {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        static {
            t2o.a(598737086);
        }

        public c() {
            super(null);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/RowColumn/CrossAxisAlignment$EndCrossAxisAlignment");
        }

        @Override // tb.d3z
        public int a(int i, LayoutDirection layoutDirection, qjz qjzVar, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f4c57de3", new Object[]{this, new Integer(i), layoutDirection, qjzVar, new Integer(i2)})).intValue();
            }
            ckf.g(layoutDirection, WXConfig.layoutDirection);
            ckf.g(qjzVar, "placeable");
            if (layoutDirection == LayoutDirection.Ltr) {
                return i;
            }
            return 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d extends d3z {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final can.b f17559a;

        static {
            t2o.a(598737087);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(can.b bVar) {
            super(null);
            ckf.g(bVar, "horizontal");
            this.f17559a = bVar;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/RowColumn/CrossAxisAlignment$HorizontalCrossAxisAlignment");
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && ckf.b(this.f17559a, ((d) obj).f17559a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.f17559a.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f17559a + ')';
        }

        @Override // tb.d3z
        public int a(int i, LayoutDirection layoutDirection, qjz qjzVar, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f4c57de3", new Object[]{this, new Integer(i), layoutDirection, qjzVar, new Integer(i2)})).intValue();
            }
            ckf.g(layoutDirection, WXConfig.layoutDirection);
            ckf.g(qjzVar, "placeable");
            return this.f17559a.a(0, i, layoutDirection);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e extends d3z {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final e INSTANCE = new e();

        static {
            t2o.a(598737088);
        }

        public e() {
            super(null);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/RowColumn/CrossAxisAlignment$StartCrossAxisAlignment");
        }

        @Override // tb.d3z
        public int a(int i, LayoutDirection layoutDirection, qjz qjzVar, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f4c57de3", new Object[]{this, new Integer(i), layoutDirection, qjzVar, new Integer(i2)})).intValue();
            }
            ckf.g(layoutDirection, WXConfig.layoutDirection);
            ckf.g(qjzVar, "placeable");
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class f extends d3z {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final can.c f17560a;

        static {
            t2o.a(598737089);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(can.c cVar) {
            super(null);
            ckf.g(cVar, "vertical");
            this.f17560a = cVar;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/RowColumn/CrossAxisAlignment$VerticalCrossAxisAlignment");
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && ckf.b(this.f17560a, ((f) obj).f17560a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.f17560a.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "VerticalCrossAxisAlignment(vertical=" + this.f17560a + ')';
        }

        @Override // tb.d3z
        public int a(int i, LayoutDirection layoutDirection, qjz qjzVar, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f4c57de3", new Object[]{this, new Integer(i), layoutDirection, qjzVar, new Integer(i2)})).intValue();
            }
            ckf.g(layoutDirection, WXConfig.layoutDirection);
            ckf.g(qjzVar, "placeable");
            return this.f17560a.a(0, i);
        }
    }

    static {
        t2o.a(598737082);
        IpChange ipChange = a.$ipChange;
        IpChange ipChange2 = e.$ipChange;
        IpChange ipChange3 = c.$ipChange;
    }

    public /* synthetic */ d3z(a07 a07Var) {
        this();
    }

    public abstract int a(int i, LayoutDirection layoutDirection, qjz qjzVar, int i2);

    public Integer b(qjz qjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("61bfd508", new Object[]{this, qjzVar});
        }
        ckf.g(qjzVar, "placeable");
        return null;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cdc4426", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public d3z() {
    }
}
