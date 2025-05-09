package tb;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class bs6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final tox f16595a = new tox(caa.c());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DATA_TYPE_YUV = 1;
        public final byte[] f;

        static {
            t2o.a(481297587);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(byte[] r7, int r8, int r9, int r10, int r11, boolean r12) {
            /*
                r6 = this;
                if (r12 == 0) goto L_0x0007
                r8 = 90
                r3 = 90
                goto L_0x000b
            L_0x0007:
                r8 = 270(0x10e, float:3.78E-43)
                r3 = 270(0x10e, float:3.78E-43)
            L_0x000b:
                r0 = r6
                r1 = r9
                r2 = r10
                r4 = r12
                r5 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.bs6.b.<init>(byte[], int, int, int, int, boolean):void");
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/util/DataProjector$CamDataInput");
        }

        @Override // tb.bs6.c
        public Bitmap a(RectF rectF, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("e22449af", new Object[]{this, rectF, new Boolean(z)});
            }
            Bitmap e = bs6.b().e(h(), f(), d(), this.f, rectF, i(), g());
            if (!j() || !z) {
                return e;
            }
            return gd2.q(e, -1.0f, 1.0f);
        }

        @Override // tb.bs6.c
        public int g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("26f94674", new Object[]{this})).intValue();
            }
            if (k()) {
                return d();
            }
            return f();
        }

        @Override // tb.bs6.c
        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7c9ef88b", new Object[]{this})).intValue();
            }
            if (j()) {
                return ((c() - e()) + 360) % 360;
            }
            return (720 - (c() + e())) % 360;
        }

        @Override // tb.bs6.c
        public int i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5616ec8d", new Object[]{this})).intValue();
            }
            if (k()) {
                return f();
            }
            return d();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f16596a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;

        static {
            t2o.a(481297588);
        }

        public c(int i, int i2, int i3, boolean z, int i4) {
            this.f16596a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
            this.e = i4;
        }

        public abstract Bitmap a(RectF rectF, boolean z);

        public d b(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("66c8334f", new Object[]{this, new Integer(i), new Integer(i2)});
            }
            return new d(this, i, i2, true);
        }

        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5bad3730", new Object[]{this})).intValue();
            }
            return this.e;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3f9bb661", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f6652138", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4ea04b00", new Object[]{this})).intValue();
            }
            return this.f16596a;
        }

        public abstract int g();

        public abstract int h();

        public abstract int i();

        public boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("de7dcb6f", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        public boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("837db6fc", new Object[]{this})).booleanValue();
            }
            if (h() % 180 == 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final c f16597a;
        public final RectF b;
        public final boolean c;

        static {
            t2o.a(481297590);
        }

        public Bitmap a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("b190b130", new Object[]{this});
            }
            return this.f16597a.a(this.b, this.c);
        }

        public d(c cVar, int i, int i2, boolean z) {
            this.f16597a = cVar;
            PointF pointF = new PointF(cVar.i(), cVar.g());
            PointF a2 = grn.a(new PointF(i, i2), pointF);
            float f = (pointF.x - a2.x) / 2.0f;
            float f2 = (pointF.y - a2.y) / 2.0f;
            float f3 = pointF.x;
            float f4 = pointF.y;
            this.b = new RectF(f / f3, f2 / f4, (f + a2.x) / f3, (f2 + a2.y) / f4);
            this.c = z;
        }
    }

    static {
        t2o.a(481297583);
    }

    public static c a(byte[] bArr, int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f7e19671", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
        }
        return new b(bArr, 1, i, i2, i3, z);
    }

    public static /* synthetic */ tox b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tox) ipChange.ipc$dispatch("f593bf", new Object[0]);
        }
        return f16595a;
    }
}
