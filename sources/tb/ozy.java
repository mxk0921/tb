package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.LayoutDirection;
import com.taobao.weex.common.WXConfig;
import tb.can;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ozy implements can {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f25775a;
    public final float b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements can.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float f25776a;

        static {
            t2o.a(598737078);
            t2o.a(598737037);
        }

        public a(float f) {
            this.f25776a = f;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && ckf.b(Float.valueOf(this.f25776a), Float.valueOf(((a) obj).f25776a))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return Float.floatToIntBits(this.f25776a);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Horizontal(bias=" + this.f25776a + ')';
        }

        @Override // tb.can.b
        public int a(int i, int i2, LayoutDirection layoutDirection) {
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b058dc25", new Object[]{this, new Integer(i), new Integer(i2), layoutDirection})).intValue();
            }
            ckf.g(layoutDirection, WXConfig.layoutDirection);
            float f2 = (i2 - i) / 2.0f;
            if (layoutDirection == LayoutDirection.Ltr) {
                f = this.f25776a;
            } else {
                f = (-1) * this.f25776a;
            }
            return iai.d(f2 * (1 + f));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements can.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float f25777a;

        static {
            t2o.a(598737079);
            t2o.a(598737038);
        }

        public b(float f) {
            this.f25777a = f;
        }

        @Override // tb.can.c
        public int a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("21105e5f", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
            }
            return iai.d(((i2 - i) / 2.0f) * (1 + this.f25777a));
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && ckf.b(Float.valueOf(this.f25777a), Float.valueOf(((b) obj).f25777a))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return Float.floatToIntBits(this.f25777a);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Vertical(bias=" + this.f25777a + ')';
        }
    }

    static {
        t2o.a(598737077);
        t2o.a(598737035);
    }

    public ozy(float f, float f2) {
        this.f25775a = f;
        this.b = f2;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozy)) {
            return false;
        }
        ozy ozyVar = (ozy) obj;
        if (ckf.b(Float.valueOf(this.f25775a), Float.valueOf(ozyVar.f25775a)) && ckf.b(Float.valueOf(this.b), Float.valueOf(ozyVar.b))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (Float.floatToIntBits(this.f25775a) * 31) + Float.floatToIntBits(this.b);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BiasAlignment(horizontalBias=" + this.f25775a + ", verticalBias=" + this.b + ')';
    }

    @Override // tb.can
    public long a(long j, long j2, LayoutDirection layoutDirection) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79e98ea8", new Object[]{this, new Long(j), new Long(j2), layoutDirection})).longValue();
        }
        ckf.g(layoutDirection, WXConfig.layoutDirection);
        float f2 = (haz.f(j2) - haz.f(j)) / 2.0f;
        float e = (haz.e(j2) - haz.e(j)) / 2.0f;
        if (layoutDirection == LayoutDirection.Ltr) {
            f = this.f25775a;
        } else {
            f = (-1) * this.f25775a;
        }
        float f3 = 1;
        return faz.a(iai.d(f2 * (f + f3)), iai.d(e * (f3 + this.b)));
    }
}
