package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class wke {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float FRACTION = 0.3f;

    /* renamed from: a  reason: collision with root package name */
    public static final pvn f30743a = new a();
    public static final pvn b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements pvn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pvn
        public void a(RectF rectF, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69836475", new Object[]{this, rectF, new Float(f)});
                return;
            }
            ckf.g(rectF, "rectF");
            rectF.offset(f, 0.0f);
        }

        @Override // tb.pvn
        public float b(RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ffa83b54", new Object[]{this, rectF})).floatValue();
            }
            ckf.g(rectF, "rectF");
            return rectF.right;
        }

        @Override // tb.pvn
        public void c(RectF rectF, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e24bbdaf", new Object[]{this, rectF, new Float(f)});
                return;
            }
            ckf.g(rectF, "rectF");
            rectF.right = f;
        }

        @Override // tb.pvn
        public void d(RectF rectF, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1f2cb08", new Object[]{this, rectF, new Float(f)});
                return;
            }
            ckf.g(rectF, "rectF");
            rectF.left = f;
        }

        @Override // tb.pvn
        public float e(RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7470872d", new Object[]{this, rectF})).floatValue();
            }
            ckf.g(rectF, "rectF");
            return rectF.left;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements pvn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pvn
        public void a(RectF rectF, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69836475", new Object[]{this, rectF, new Float(f)});
                return;
            }
            ckf.g(rectF, "rectF");
            rectF.offset(0.0f, f);
        }

        @Override // tb.pvn
        public float b(RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ffa83b54", new Object[]{this, rectF})).floatValue();
            }
            ckf.g(rectF, "rectF");
            return rectF.bottom;
        }

        @Override // tb.pvn
        public void c(RectF rectF, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e24bbdaf", new Object[]{this, rectF, new Float(f)});
                return;
            }
            ckf.g(rectF, "rectF");
            rectF.bottom = f;
        }

        @Override // tb.pvn
        public void d(RectF rectF, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1f2cb08", new Object[]{this, rectF, new Float(f)});
                return;
            }
            ckf.g(rectF, "rectF");
            rectF.top = f;
        }

        @Override // tb.pvn
        public float e(RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7470872d", new Object[]{this, rectF})).floatValue();
            }
            ckf.g(rectF, "rectF");
            return rectF.top;
        }
    }

    static {
        t2o.a(481297403);
    }

    public static final /* synthetic */ pvn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pvn) ipChange.ipc$dispatch("c1b20b8d", new Object[0]);
        }
        return f30743a;
    }

    public static final /* synthetic */ pvn b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pvn) ipChange.ipc$dispatch("b3039b0e", new Object[0]);
        }
        return b;
    }
}
