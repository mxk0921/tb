package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx_v4.animation.util.DXAnimationProperty;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.iub;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class pk6<T> extends zc5<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AnimatorSet f;
    public Set<WeakReference<ViewPropertyAnimator>> g;
    public boolean h = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<View> f26142a;

        static {
            t2o.a(444597751);
        }

        public a(View view) {
            this.f26142a = new WeakReference<>(view);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/impl/DXTweenAnimation$CommonAnimatorListener");
        }

        public yb5<T> a(WeakReference<View> weakReference, Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yb5) ipChange.ipc$dispatch("2b5be666", new Object[]{this, weakReference, animator});
            }
            View view = weakReference.get();
            if (view == null || !(animator instanceof ValueAnimator) || pk6.k(pk6.this) == null) {
                return null;
            }
            return pk6.this.q(view, (ValueAnimator) animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            yb5<T> a2 = a(this.f26142a, animator);
            if (a2 != null) {
                pk6.j(pk6.this).c(a2, pk6.i(pk6.this));
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            yb5<T> a2 = a(this.f26142a, animator);
            if (a2 != null) {
                pk6.h(pk6.this).a(a2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends pk6<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597752);
        }

        public b(rk6<Float> rk6Var) {
            super(rk6Var);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/impl/DXTweenAnimation$DXFloatTweenAnimation");
        }

        @Override // tb.pk6
        public Property<View, Float> t(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Property) ipChange.ipc$dispatch("4c5ed2d", new Object[]{this, str});
            }
            DXAnimationProperty c = DXAnimationProperty.c(str, Float.class);
            if (c == null) {
                return null;
            }
            return (Property<View, T>) c.b;
        }

        /* renamed from: v */
        public PropertyValuesHolder u(String str, Float f, Float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PropertyValuesHolder) ipChange.ipc$dispatch("dee4e97d", new Object[]{this, str, f, f2});
            }
            Property<View, Float> t = t(str);
            if (t != null) {
                return PropertyValuesHolder.ofFloat(t, f.floatValue(), f2.floatValue());
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public abstract class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<View> f26143a;
        public final List<String> b;

        static {
            t2o.a(444597753);
        }

        public c(View view, List<String> list) {
            this.f26143a = new WeakReference<>(view);
            this.b = list;
        }

        public abstract void a(View view);

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View view = this.f26143a.get();
            if (pk6.l(pk6.this) != null && view != null) {
                a(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends pk6<T>.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597754);
        }

        public d(View view, List<String> list) {
            super(view, list);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/impl/DXTweenAnimation$ViewPropertyAnimatorEndAction");
        }

        @Override // tb.pk6.c
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6625a856", new Object[]{this, view});
            } else {
                pk6.n(pk6.this).c(pk6.this.r(view, this.b), false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends pk6<T>.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597755);
        }

        public e(View view, List<String> list) {
            super(view, list);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/impl/DXTweenAnimation$ViewPropertyAnimatorStartAction");
        }

        @Override // tb.pk6.c
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6625a856", new Object[]{this, view});
            } else {
                pk6.m(pk6.this).a(pk6.this.r(view, this.b));
            }
        }
    }

    static {
        t2o.a(444597750);
    }

    public pk6(rk6<T> rk6Var) {
        super(rk6Var);
    }

    public static /* synthetic */ iub.a h(pk6 pk6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iub.a) ipChange.ipc$dispatch("d72914bf", new Object[]{pk6Var});
        }
        return pk6Var.c;
    }

    public static /* synthetic */ boolean i(pk6 pk6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32d72408", new Object[]{pk6Var})).booleanValue();
        }
        return pk6Var.h;
    }

    public static /* synthetic */ Object ipc$super(pk6 pk6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/impl/DXTweenAnimation");
    }

    public static /* synthetic */ iub.a j(pk6 pk6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iub.a) ipChange.ipc$dispatch("483ab0c1", new Object[]{pk6Var});
        }
        return pk6Var.c;
    }

    public static /* synthetic */ iub.a k(pk6 pk6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iub.a) ipChange.ipc$dispatch("80c37ec2", new Object[]{pk6Var});
        }
        return pk6Var.c;
    }

    public static /* synthetic */ iub.a l(pk6 pk6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iub.a) ipChange.ipc$dispatch("b94c4cc3", new Object[]{pk6Var});
        }
        return pk6Var.c;
    }

    public static /* synthetic */ iub.a m(pk6 pk6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iub.a) ipChange.ipc$dispatch("f1d51ac4", new Object[]{pk6Var});
        }
        return pk6Var.c;
    }

    public static /* synthetic */ iub.a n(pk6 pk6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iub.a) ipChange.ipc$dispatch("2a5de8c5", new Object[]{pk6Var});
        }
        return pk6Var.c;
    }

    public ViewPropertyAnimator o(View view, String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimator) ipChange.ipc$dispatch("bb912001", new Object[]{this, view, str, t});
        }
        return null;
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5140fd06", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
    }

    public yb5<T> q(View view, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yb5) ipChange.ipc$dispatch("7f08d7c3", new Object[]{this, view, valueAnimator});
        }
        PropertyValuesHolder[] values = valueAnimator.getValues();
        if (values == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (PropertyValuesHolder propertyValuesHolder : values) {
            Property<View, T> t = t(propertyValuesHolder.getPropertyName());
            if (t != null) {
                arrayList.add(new Pair(propertyValuesHolder.getPropertyName(), t.get(view)));
            }
        }
        return new yb5<>(view, arrayList);
    }

    public yb5<T> r(View view, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yb5) ipChange.ipc$dispatch("4f659baa", new Object[]{this, view, collection});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : collection) {
            Property<View, T> t = t(str);
            if (t != null) {
                arrayList.add(new Pair(str, t.get(view)));
            }
        }
        return new yb5<>(view, arrayList);
    }

    public T s(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9d6f8e4b", new Object[]{this, view, str});
        }
        Property<View, T> t = t(str);
        if (t == null) {
            return null;
        }
        return t.get(view);
    }

    @Override // tb.iub
    public void start() {
        T f;
        List<String> a2;
        T t;
        T s;
        PropertyValuesHolder u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        this.h = true;
        p();
        this.h = false;
        List<dc5> g = g();
        if (!(g == null || (f = f()) == null)) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            for (dc5 dc5Var : g) {
                View b2 = dc5Var.b();
                if (!(b2 == null || (a2 = dc5Var.a()) == null || a2.isEmpty())) {
                    ArrayList arrayList2 = new ArrayList();
                    ViewPropertyAnimator viewPropertyAnimator = null;
                    int i = 0;
                    while (i < a2.size()) {
                        String str = a2.get(i);
                        iub.b<T> bVar = this.d;
                        if (bVar != null) {
                            t = bVar.b(str, b2, f);
                        } else {
                            t = f;
                        }
                        ViewPropertyAnimator o = o(b2, str, t);
                        if (!(o != null || (s = s(b2, str)) == null || (u = u(str, s, t)) == null)) {
                            arrayList2.add(u);
                        }
                        i++;
                        viewPropertyAnimator = o;
                    }
                    if (viewPropertyAnimator != null) {
                        hashSet.add(viewPropertyAnimator);
                        rk6 rk6Var = (rk6) e();
                        viewPropertyAnimator.setDuration(rk6Var.f27435a).setStartDelay(rk6Var.b).setInterpolator(rk6Var.e).withStartAction(new e(b2, a2)).withEndAction(new d(b2, a2));
                    }
                    if (!arrayList2.isEmpty()) {
                        ObjectAnimator objectAnimator = new ObjectAnimator();
                        rk6 rk6Var2 = (rk6) e();
                        objectAnimator.setTarget(b2);
                        objectAnimator.setValues((PropertyValuesHolder[]) arrayList2.toArray(new PropertyValuesHolder[0]));
                        int i2 = rk6Var2.c;
                        int i3 = -1;
                        if (i2 != -1) {
                            i3 = Math.max(0, i2 - 1);
                        }
                        objectAnimator.setRepeatCount(i3);
                        objectAnimator.setRepeatMode(rk6Var2.d);
                        if (this.c != null) {
                            objectAnimator.addListener(new a(b2));
                        }
                        arrayList.add(objectAnimator);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f = new AnimatorSet();
                rk6 rk6Var3 = (rk6) e();
                this.f.setDuration(rk6Var3.f27435a);
                this.f.setStartDelay(rk6Var3.b);
                this.f.setInterpolator(rk6Var3.e);
                this.f.playTogether(arrayList);
                this.f.start();
            }
            if (!hashSet.isEmpty()) {
                this.g = new HashSet();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ViewPropertyAnimator viewPropertyAnimator2 = (ViewPropertyAnimator) it.next();
                    ((HashSet) this.g).add(new WeakReference(viewPropertyAnimator2));
                    viewPropertyAnimator2.start();
                }
            }
        }
    }

    public abstract Property<View, T> t(String str);

    public abstract PropertyValuesHolder u(String str, T t, T t2);
}
