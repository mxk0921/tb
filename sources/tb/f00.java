package tb;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.perf.uikit.LiveLottieAnimationView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class f00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f18910a;
    public final xea b;
    public final LiveLottieAnimationView c;
    public View d;
    public Animator e;
    public final gg1 f;
    public int g;

    static {
        t2o.a(295699128);
    }

    public f00(Context context, xea xeaVar, LiveLottieAnimationView liveLottieAnimationView, gg1 gg1Var) {
        this.f18910a = context;
        this.b = xeaVar;
        this.c = liveLottieAnimationView;
        this.f = gg1Var;
    }

    public String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75c8b248", new Object[]{this, new Integer(i)});
        }
        if (i <= 5000) {
            return String.valueOf(i);
        }
        if (i < 10000) {
            return (i / 1000) + "000+";
        } else if (i >= 100000) {
            return "10万+";
        } else {
            return (i / 10000) + "万+";
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Animator animator = this.e;
        if (animator != null) {
            animator.cancel();
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        View view = this.d;
        if (view == null || view.getParent() == null || this.d.getVisibility() != 0) {
            return false;
        }
        return true;
    }
}
