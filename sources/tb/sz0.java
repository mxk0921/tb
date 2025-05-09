package tb;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class sz0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Animation f28366a;
    public Animation b;
    public Animation c;
    public Animation d;
    public Animation e;
    public Animation f;
    public final Context g;
    public FragmentAnimator h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends Animation {
        public a(sz0 sz0Var) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends Animation {
        public b(sz0 sz0Var) {
        }
    }

    static {
        t2o.a(775946357);
    }

    public sz0(Context context, FragmentAnimator fragmentAnimator) {
        this.g = context;
        this.h = fragmentAnimator;
    }

    public Animation a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("6c924d7e", new Object[]{this, fragment});
        }
        if ((fragment.getTag() == null || !fragment.getTag().startsWith("android:switcher:") || !fragment.getUserVisibleHint()) && (fragment.getParentFragment() == null || !fragment.getParentFragment().isRemoving() || fragment.isHidden())) {
            return null;
        }
        b bVar = new b(this);
        bVar.setDuration(c().getDuration());
        return bVar;
    }

    public Animation b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("b33a2efc", new Object[]{this});
        }
        Animation animation = this.c;
        if (animation != null) {
            return animation;
        }
        return h();
    }

    public Animation c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("6cffe2ca", new Object[]{this});
        }
        Animation animation = this.d;
        if (animation != null) {
            return animation;
        }
        return i();
    }

    public Animation d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("db011f0", new Object[]{this});
        }
        if (this.f28366a == null) {
            this.f28366a = AnimationUtils.loadAnimation(this.g, R.anim.no_anim);
        }
        return this.f28366a;
    }

    public Animation e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("6a3136ba", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new a(this);
        }
        return this.b;
    }

    public Animation f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("c2c73201", new Object[]{this});
        }
        Animation animation = this.e;
        if (animation != null) {
            return animation;
        }
        return j();
    }

    public Animation g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("3bf3eb25", new Object[]{this});
        }
        Animation animation = this.f;
        if (animation != null) {
            return animation;
        }
        return k();
    }

    public final Animation h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("b5bd0f36", new Object[]{this});
        }
        if (this.h.getEnter() == 0) {
            this.c = d();
        } else {
            this.c = AnimationUtils.loadAnimation(this.g, this.h.getEnter());
        }
        return this.c;
    }

    public final Animation i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("a6e31350", new Object[]{this});
        }
        if (this.h.getExit() == 0) {
            this.d = d();
        } else {
            this.d = AnimationUtils.loadAnimation(this.g, this.h.getExit());
        }
        return this.d;
    }

    public final Animation j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("fef2af87", new Object[]{this});
        }
        if (this.h.getPopEnter() == 0) {
            this.e = d();
        } else {
            this.e = AnimationUtils.loadAnimation(this.g, this.h.getPopEnter());
        }
        return this.e;
    }

    public final Animation k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("a93fa4df", new Object[]{this});
        }
        if (this.h.getPopExit() == 0) {
            this.f = d();
        } else {
            this.f = AnimationUtils.loadAnimation(this.g, this.h.getPopExit());
        }
        return this.f;
    }

    public void l(FragmentAnimator fragmentAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e91d92", new Object[]{this, fragmentAnimator});
            return;
        }
        this.h = fragmentAnimator;
        h();
        i();
        j();
        k();
    }
}
