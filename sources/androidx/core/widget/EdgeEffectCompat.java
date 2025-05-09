package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EdgeEffectCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final EdgeEffect mEdgeEffect;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static void onPull(EdgeEffect edgeEffect, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbb12f9d", new Object[]{edgeEffect, new Float(f), new Float(f2)});
            } else {
                edgeEffect.onPull(f, f2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api31Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api31Impl() {
        }

        public static EdgeEffect create(Context context, AttributeSet attributeSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EdgeEffect) ipChange.ipc$dispatch("38524f01", new Object[]{context, attributeSet});
            }
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float getDistance(EdgeEffect edgeEffect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("abef8546", new Object[]{edgeEffect})).floatValue();
            }
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float onPullDistance(EdgeEffect edgeEffect, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1450da18", new Object[]{edgeEffect, new Float(f), new Float(f2)})).floatValue();
            }
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public EdgeEffectCompat(Context context) {
        this.mEdgeEffect = new EdgeEffect(context);
    }

    public static EdgeEffect create(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EdgeEffect) ipChange.ipc$dispatch("38524f01", new Object[]{context, attributeSet});
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.create(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float getDistance(EdgeEffect edgeEffect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abef8546", new Object[]{edgeEffect})).floatValue();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public static float onPullDistance(EdgeEffect edgeEffect, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1450da18", new Object[]{edgeEffect, new Float(f), new Float(f2)})).floatValue();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.onPullDistance(edgeEffect, f, f2);
        }
        onPull(edgeEffect, f, f2);
        return f;
    }

    @Deprecated
    public boolean draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cc013fe", new Object[]{this, canvas})).booleanValue();
        }
        return this.mEdgeEffect.draw(canvas);
    }

    @Deprecated
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            this.mEdgeEffect.finish();
        }
    }

    @Deprecated
    public boolean isFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        return this.mEdgeEffect.isFinished();
    }

    @Deprecated
    public boolean onPull(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("620c25d9", new Object[]{this, new Float(f)})).booleanValue();
        }
        this.mEdgeEffect.onPull(f);
        return true;
    }

    @Deprecated
    public boolean onRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2933d9b3", new Object[]{this})).booleanValue();
        }
        this.mEdgeEffect.onRelease();
        return this.mEdgeEffect.isFinished();
    }

    @Deprecated
    public void setSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6e006a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mEdgeEffect.setSize(i, i2);
        }
    }

    @Deprecated
    public boolean onAbsorb(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e910b2f4", new Object[]{this, new Integer(i)})).booleanValue();
        }
        this.mEdgeEffect.onAbsorb(i);
        return true;
    }

    @Deprecated
    public boolean onPull(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df78fc8f", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        onPull(this.mEdgeEffect, f, f2);
        return true;
    }

    public static void onPull(EdgeEffect edgeEffect, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb12f9d", new Object[]{edgeEffect, new Float(f), new Float(f2)});
        } else {
            Api21Impl.onPull(edgeEffect, f, f2);
        }
    }
}
