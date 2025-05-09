package tb;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class wkn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CAN_REQUEST = 1;
    public static final a Companion = new a(null);
    public static final int SHOW_CARD = 1;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f30748a;
    public final Integer b;
    public final int c;
    public final String d;
    public final int e;
    public Bitmap f;
    public final long g;
    public final float h;
    public final RectF i;
    public final float j;
    public final float k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481297082);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481297081);
    }

    public wkn(Rect rect, Integer num, int i, String str, int i2, Bitmap bitmap, long j, float f, RectF rectF) {
        ckf.g(rect, "bbox");
        ckf.g(str, "objectCategory");
        ckf.g(rectF, "originRateBox");
        this.f30748a = rect;
        this.b = num;
        this.c = i;
        this.d = str;
        this.e = i2;
        this.f = bitmap;
        this.g = j;
        this.h = f;
        this.i = rectF;
        this.j = (rect.left + rect.right) / 2;
        this.k = (rect.top + rect.bottom) / 2;
    }

    public final float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44f54b7a", new Object[]{this})).floatValue();
        }
        return this.h;
    }

    public final Rect b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("538d806f", new Object[]{this});
        }
        return this.f30748a;
    }

    public final Integer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("a6023ac3", new Object[]{this});
        }
        return this.b;
    }

    public final float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cfc8064", new Object[]{this})).floatValue();
        }
        return this.j;
    }

    public final float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d0a97e5", new Object[]{this})).floatValue();
        }
        return this.k;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6ce4b39", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final Bitmap g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b7bc4829", new Object[]{this});
        }
        return this.f;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("810e0e86", new Object[]{this});
        }
        return this.d;
    }

    public final RectF i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("e15fc091", new Object[]{this});
        }
        return this.i;
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d9a7c1d", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue();
        }
        return this.g;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980fc", new Object[]{this});
            return;
        }
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f = null;
    }
}
