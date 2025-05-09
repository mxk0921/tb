package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PathInterpolatorCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static Interpolator createPathInterpolator(Path path) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("6f85843e", new Object[]{path}) : new PathInterpolator(path);
        }

        public static Interpolator createPathInterpolator(float f, float f2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("478d004", new Object[]{new Float(f), new Float(f2)}) : new PathInterpolator(f, f2);
        }

        public static Interpolator createPathInterpolator(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("9dbe8844", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)}) : new PathInterpolator(f, f2, f3, f4);
        }
    }

    private PathInterpolatorCompat() {
    }

    public static Interpolator create(Path path) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("8961476a", new Object[]{path}) : Api21Impl.createPathInterpolator(path);
    }

    public static Interpolator create(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("4717e958", new Object[]{new Float(f), new Float(f2)}) : Api21Impl.createPathInterpolator(f, f2);
    }

    public static Interpolator create(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("b4fc9c98", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)}) : Api21Impl.createPathInterpolator(f, f2, f3, f4);
    }
}
