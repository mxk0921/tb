package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class l83 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COLLISION_COVER = 0;
    public static final int COLLISION_HORIZONTAL_MOVE = 2;
    public static final int COLLISION_VERTICAL_MOVE = 1;
    public static final int COLLISION_VERTICAL_MOVE_FIXED = 3;
    public static final a Companion = new a(null);
    public static final int LAYOUT_CENTER = 2;
    public static final int LAYOUT_COVER_ANCHOR = 0;
    public static final int LAYOUT_NOT_COVER_ANCHOR = 1;

    /* renamed from: a  reason: collision with root package name */
    public int f23166a;
    public int b;
    public boolean c = true;
    public RectF d;
    public float e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481297561);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481297560);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4a292d9", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("129843d1", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79fa48f4", new Object[]{this})).intValue();
        }
        return this.f23166a;
    }

    public final RectF d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("549f7573", new Object[]{this});
        }
        return this.d;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51f9829c", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6ef2e9", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public final void g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268d700b", new Object[]{this, new Float(f)});
        } else {
            this.e = f;
        }
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34016674", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc25e396", new Object[]{this, new Integer(i)});
        } else {
            this.f23166a = i;
        }
    }

    public final void j(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55178df9", new Object[]{this, rectF});
        } else {
            this.d = rectF;
        }
    }
}
