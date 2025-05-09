package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f20803a = "type_drag_layout";
    public static final String b = "type_sliding_layout";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f20804a;

        public a(Activity activity) {
            this.f20804a = activity;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                hpj.d(this.f20804a, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void onBack(String str);

        void onFinish(String str, float f);

        void onMove(String str);
    }

    public static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5906ab46", new Object[]{activity})).intValue();
        }
        if (activity != null) {
            return activity.getWindow().getNavigationBarColor();
        }
        return 1;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff772edd", new Object[]{str})).booleanValue();
        }
        return f20803a.equals(str);
    }

    public static Animator c(Activity activity, long j, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("59bf4c6f", new Object[]{activity, new Long(j), new Float(f), new Float(f2)});
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration(j);
        duration.addUpdateListener(new a(activity));
        return duration;
    }

    public static void d(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e2a867", new Object[]{activity, new Integer(i)});
        } else {
            e(activity, i, 0, 0, 0, -1);
        }
    }

    public static void e(Activity activity, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4e50d8", new Object[]{activity, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else {
            g(activity, Color.argb(i, i2, i3, i4), i5);
        }
    }

    public static void f(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4ec884", new Object[]{activity, new Integer(i)});
        } else if (a(activity) != i) {
            activity.getWindow().setNavigationBarColor(i);
        }
    }

    public static void g(Activity activity, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("622c5a6c", new Object[]{activity, new Integer(i), new Integer(i2)});
        } else {
            f(activity, ColorUtils.compositeColors(i, i2));
        }
    }

    static {
        t2o.a(503317414);
    }
}
