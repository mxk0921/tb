package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class vz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final nqk f30356a = new d();
    public static final nqk b = new a();
    public static final nqk c = new b();
    public static final nqk d = new c();
    public static final float e = zb7.b(37.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements nqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.nqk
        public void a(RectF rectF, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3487243", new Object[]{this, rectF, new Float(f), new Float(f2)});
                return;
            }
            ckf.g(rectF, "percentRegion");
            float f3 = rectF.bottom + f;
            rectF.bottom = f3;
            rectF.bottom = hfn.e(1.0f, hfn.b(f3, rectF.top + f2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements nqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.nqk
        public void a(RectF rectF, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3487243", new Object[]{this, rectF, new Float(f), new Float(f2)});
                return;
            }
            ckf.g(rectF, "percentRegion");
            float f3 = rectF.left + f;
            rectF.left = f3;
            rectF.left = hfn.b(0.0f, hfn.e(f3, rectF.right - f2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements nqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.nqk
        public void a(RectF rectF, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3487243", new Object[]{this, rectF, new Float(f), new Float(f2)});
                return;
            }
            ckf.g(rectF, "percentRegion");
            float f3 = rectF.right + f;
            rectF.right = f3;
            rectF.right = hfn.e(1.0f, hfn.b(f3, rectF.left + f2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements nqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.nqk
        public void a(RectF rectF, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3487243", new Object[]{this, rectF, new Float(f), new Float(f2)});
                return;
            }
            ckf.g(rectF, "percentRegion");
            float f3 = rectF.top + f;
            rectF.top = f3;
            rectF.top = hfn.b(0.0f, hfn.e(f3, rectF.bottom - f2));
        }
    }

    static {
        t2o.a(481297393);
    }

    public static final nqk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nqk) ipChange.ipc$dispatch("c0027919", new Object[0]);
        }
        return b;
    }

    public static final nqk b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nqk) ipChange.ipc$dispatch("2f03dd75", new Object[0]);
        }
        return c;
    }

    public static final float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e589825", new Object[0])).floatValue();
        }
        return e;
    }

    public static final nqk d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nqk) ipChange.ipc$dispatch("800f323e", new Object[0]);
        }
        return d;
    }

    public static final nqk e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nqk) ipChange.ipc$dispatch("a719e4b7", new Object[0]);
        }
        return f30356a;
    }
}
