package com.taobao.android.dinamicx_v4.animation.impl;

import android.util.Pair;
import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx_v4.animation.util.DXAnimationProperty;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bd6;
import tb.dc5;
import tb.iub;
import tb.t2o;
import tb.yb5;
import tb.zc5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXSpringAnimation extends zc5<Float> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<SpringAnimationGroup> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class SpringAnimationGroup implements DynamicAnimation.OnAnimationEndListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<DXAnimationProperty<Float>> f7542a;
        public final WeakReference<View> b;
        public final a c;
        public List<SpringAnimation> d = new ArrayList();

        static {
            t2o.a(444597748);
        }

        public SpringAnimationGroup(View view, float f, float f2, float f3, List<DXAnimationProperty<Float>> list, iub.b<Float> bVar, a aVar) {
            float f4;
            this.f7542a = list;
            this.b = new WeakReference<>(view);
            this.c = aVar;
            for (DXAnimationProperty<Float> dXAnimationProperty : list) {
                if (bVar != null) {
                    f4 = bVar.b(dXAnimationProperty.d(), view, Float.valueOf(f3)).floatValue();
                } else {
                    f4 = f3;
                }
                SpringAnimation springAnimation = new SpringAnimation(view, dXAnimationProperty.c);
                SpringForce springForce = new SpringForce();
                springForce.setDampingRatio(f);
                springForce.setStiffness(f2);
                springForce.setFinalPosition(f4);
                springAnimation.setSpring(springForce);
                springAnimation.addEndListener(this);
                this.d.add(springAnimation);
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            List<SpringAnimation> list = this.d;
            if (list != null && !list.isEmpty()) {
                for (SpringAnimation springAnimation : this.d) {
                    springAnimation.cancel();
                }
            }
            this.d = null;
        }

        public View b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("2c2b0e50", new Object[]{this});
            }
            return this.b.get();
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            List<SpringAnimation> list = this.d;
            if (list != null && !((ArrayList) list).isEmpty()) {
                a aVar = this.c;
                if (aVar != null) {
                    ((b) aVar).c(this);
                }
                Iterator it = ((ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    ((SpringAnimation) it.next()).start();
                }
            }
        }

        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
        public void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68e1ee3c", new Object[]{this, dynamicAnimation, new Boolean(z), new Float(f), new Float(f2)});
                return;
            }
            List<SpringAnimation> list = this.d;
            if (list != null && (dynamicAnimation instanceof SpringAnimation)) {
                if (!z) {
                    ((ArrayList) list).remove(dynamicAnimation);
                }
                if (((ArrayList) this.d).isEmpty() && (aVar = this.c) != null) {
                    ((b) aVar).b(this, z);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597749);
            t2o.a(444597747);
        }

        public b() {
        }

        public yb5<Float> a(SpringAnimationGroup springAnimationGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yb5) ipChange.ipc$dispatch("a6f47af5", new Object[]{this, springAnimationGroup});
            }
            View b = springAnimationGroup.b();
            if (b == null || springAnimationGroup.f7542a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (DXAnimationProperty<Float> dXAnimationProperty : springAnimationGroup.f7542a) {
                arrayList.add(new Pair(dXAnimationProperty.d(), Float.valueOf(dXAnimationProperty.c.getValue(b))));
            }
            return new yb5<>(b, arrayList);
        }

        public void b(SpringAnimationGroup springAnimationGroup, boolean z) {
            yb5<Float> a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b228e87", new Object[]{this, springAnimationGroup, new Boolean(z)});
            } else if (DXSpringAnimation.j(DXSpringAnimation.this) != null && (a2 = a(springAnimationGroup)) != null) {
                DXSpringAnimation.k(DXSpringAnimation.this).c(a2, z);
            }
        }

        public void c(SpringAnimationGroup springAnimationGroup) {
            yb5<Float> a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da9efff4", new Object[]{this, springAnimationGroup});
            } else if (DXSpringAnimation.h(DXSpringAnimation.this) != null && (a2 = a(springAnimationGroup)) != null) {
                DXSpringAnimation.i(DXSpringAnimation.this).a(a2);
            }
        }
    }

    static {
        t2o.a(444597746);
    }

    public DXSpringAnimation(bd6 bd6Var) {
        super(bd6Var);
    }

    public static /* synthetic */ iub.a h(DXSpringAnimation dXSpringAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iub.a) ipChange.ipc$dispatch("9ab9af79", new Object[]{dXSpringAnimation});
        }
        return dXSpringAnimation.c;
    }

    public static /* synthetic */ iub.a i(DXSpringAnimation dXSpringAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iub.a) ipChange.ipc$dispatch("734aa198", new Object[]{dXSpringAnimation});
        }
        return dXSpringAnimation.c;
    }

    public static /* synthetic */ Object ipc$super(DXSpringAnimation dXSpringAnimation, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/impl/DXSpringAnimation");
    }

    public static /* synthetic */ iub.a j(DXSpringAnimation dXSpringAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iub.a) ipChange.ipc$dispatch("4bdb93b7", new Object[]{dXSpringAnimation});
        }
        return dXSpringAnimation.c;
    }

    public static /* synthetic */ iub.a k(DXSpringAnimation dXSpringAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iub.a) ipChange.ipc$dispatch("246c85d6", new Object[]{dXSpringAnimation});
        }
        return dXSpringAnimation.c;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        List<SpringAnimationGroup> list = this.f;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.f).iterator();
            while (it.hasNext()) {
                ((SpringAnimationGroup) it.next()).a();
            }
        }
        this.f = null;
    }

    @Override // tb.iub
    public void start() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        l();
        List<dc5> g = g();
        if (!(g == null || g.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (dc5 dc5Var : g) {
                Float f = f();
                View b2 = dc5Var.b();
                List<String> a2 = dc5Var.a();
                if (!(b2 == null || a2 == null || a2.isEmpty() || f == null)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : dc5Var.a()) {
                        DXAnimationProperty c = DXAnimationProperty.c(str, Float.class);
                        if (c != null) {
                            arrayList2.add(c);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        bd6 bd6Var = (bd6) e();
                        float f2 = bd6Var.f16331a;
                        float f3 = bd6Var.b;
                        float floatValue = f.floatValue();
                        iub.b<T> bVar2 = this.d;
                        if (this.c == null) {
                            bVar = null;
                        } else {
                            bVar = new b();
                        }
                        arrayList.add(new SpringAnimationGroup(b2, f2, f3, floatValue, arrayList2, bVar2, bVar));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((SpringAnimationGroup) it.next()).c();
                }
                this.f = arrayList;
            }
        }
    }
}
