package tb;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uw6 implements swn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANIMATE_IMAGE = 2;
    public static final int STATIC_BITMAP = 1;

    /* renamed from: a  reason: collision with root package name */
    public final wd8 f29646a;
    public final int b;
    public final Bitmap c;
    public final Rect d;
    public final by0 e;
    public final boolean f;

    static {
        t2o.a(620757085);
    }

    public uw6(wd8 wd8Var, Bitmap bitmap) {
        this(wd8Var, bitmap, null, null);
    }

    public by0 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (by0) ipChange.ipc$dispatch("f01eaadf", new Object[]{this});
        }
        return this.e;
    }

    public Bitmap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        return this.c;
    }

    public Rect c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("d762c3bc", new Object[]{this});
        }
        return this.d;
    }

    public wd8 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wd8) ipChange.ipc$dispatch("5caf3f0e", new Object[]{this});
        }
        return this.f29646a;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue();
        }
        int i = this.b;
        if ((i != 1 || this.c == null) && (i != 2 || this.e == null)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2967fc92", new Object[]{this})).booleanValue();
        }
        if (this.b == 1) {
            return true;
        }
        return false;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d21d85e3", new Object[]{this})).booleanValue();
        }
        wd8 wd8Var = this.f29646a;
        if ((wd8Var == null || wd8Var.g) && !this.f) {
            return true;
        }
        return false;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a46b9c4e", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    @Override // tb.swn
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        wd8 wd8Var = this.f29646a;
        if (wd8Var != null) {
            wd8Var.release();
        }
        by0 by0Var = this.e;
        if (by0Var != null) {
            by0Var.dispose();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DecodedImage(type=" + this.b + ", bitmap=" + this.c + ", animated=" + this.e + f7l.BRACKET_END_STR;
    }

    public uw6(wd8 wd8Var, Bitmap bitmap, by0 by0Var, Rect rect) {
        this(wd8Var, bitmap, by0Var, rect, false);
    }

    public uw6(wd8 wd8Var, Bitmap bitmap, by0 by0Var, Rect rect, boolean z) {
        if (bitmap != null) {
            this.b = 1;
        } else {
            this.b = 2;
        }
        this.f29646a = wd8Var;
        this.c = bitmap;
        this.e = by0Var;
        this.d = rect;
        this.f = z;
    }
}
