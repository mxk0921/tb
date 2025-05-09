package tb;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y91 {

    /* renamed from: a  reason: collision with root package name */
    public final Animation f31918a;
    public final Animation b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int e;
        public Animation g;
        public Animation h;

        /* renamed from: a  reason: collision with root package name */
        public boolean f31919a = false;
        public boolean b = false;
        public boolean c = false;
        public int d = 81;
        public final int f = -1;

        static {
            t2o.a(976224264);
        }

        public y91 a() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y91) ipChange.ipc$dispatch("3afbb4a7", new Object[]{this});
            }
            if (this.g == null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setInterpolator(new DecelerateInterpolator());
                alphaAnimation.setDuration(500L);
                this.g = alphaAnimation;
            }
            if (this.h == null) {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setInterpolator(new AccelerateInterpolator());
                alphaAnimation2.setDuration(500L);
                this.h = alphaAnimation2;
            }
            boolean z = this.f31919a;
            boolean z2 = this.c;
            boolean z3 = this.b;
            int i2 = this.d;
            int i3 = this.e;
            int i4 = this.f;
            if (i4 <= 0) {
                i = 4000;
            } else {
                i = i4;
            }
            return new y91(z, z2, z3, i2, 0, 0, 0, i3, i, this.g, this.h);
        }

        public b b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9343b2bb", new Object[]{this, new Boolean(z)});
            }
            this.f31919a = z;
            return this;
        }

        public b c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("148ac6f0", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public b d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ddf75cf7", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public b e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("34e172e2", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public b f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e86a2c2a", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }
    }

    static {
        t2o.a(976224262);
    }

    public y91(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, Animation animation, Animation animation2) {
        this.c = z2;
        this.e = z3;
        this.d = z;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.f31918a = animation;
        this.b = animation2;
    }
}
