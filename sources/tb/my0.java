package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class my0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<yio> f24380a;
    public final List<AnimatorSet> b;
    public AnimatorSet c;
    public boolean d;
    public boolean e;
    public int f = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/util/AnimationHolder$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                my0.a(my0.this);
            }
        }
    }

    static {
        t2o.a(986710105);
    }

    public my0(List<AnimatorSet> list, ArrayList<yio> arrayList) {
        this.b = list;
        this.f24380a = arrayList;
    }

    public static /* synthetic */ void a(my0 my0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9489d92b", new Object[]{my0Var});
        } else {
            my0Var.b();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0ed94e", new Object[]{this});
        } else if (!this.e && this.f < this.b.size() - 1) {
            List<AnimatorSet> list = this.b;
            int i = this.f + 1;
            this.f = i;
            AnimatorSet animatorSet = list.get(i);
            this.c = animatorSet;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!this.d) {
            this.d = true;
            for (AnimatorSet animatorSet : this.b) {
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
        this.e = true;
        ArrayList<yio> arrayList = this.f24380a;
        if (arrayList != null) {
            Iterator<yio> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
        if (this.d && (animatorSet = this.c) != null) {
            animatorSet.end();
        }
    }
}
