package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<AnimatorSet> f32661a;
    public AnimatorSet b;
    public boolean c;
    public boolean d;
    public int e = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/css/DXAnimationHolder$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                zb5.a(zb5.this);
            }
        }
    }

    static {
        t2o.a(444597492);
    }

    public zb5(List<AnimatorSet> list) {
        this.f32661a = list;
    }

    public static /* synthetic */ void a(zb5 zb5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f95ffce", new Object[]{zb5Var});
        } else {
            zb5Var.b();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0ed94e", new Object[]{this});
        } else if (!this.d && this.e < this.f32661a.size() - 1) {
            List<AnimatorSet> list = this.f32661a;
            int i = this.e + 1;
            this.e = i;
            AnimatorSet animatorSet = list.get(i);
            this.b = animatorSet;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!this.c) {
            this.c = true;
            for (AnimatorSet animatorSet : this.f32661a) {
                animatorSet.addListener(new a());
            }
            b();
        }
    }

    public void d() {
        AnimatorSet animatorSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.d = true;
        if (this.c && (animatorSet = this.b) != null) {
            animatorSet.end();
        }
    }
}
