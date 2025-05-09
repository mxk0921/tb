package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.TextComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextComponent f20607a;

        public a(TextComponent textComponent) {
            this.f20607a = textComponent;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f20607a.ensureTextLayoutHelper(false);
            this.f20607a.setFontSize(floatValue);
            this.f20607a.layoutText();
            this.f20607a.updateTextLayout();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ n c;
        public final /* synthetic */ qy0 d;
        public final /* synthetic */ f e;
        public final /* synthetic */ d f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, t3g t3gVar, n nVar, qy0 qy0Var, f fVar, d dVar) {
            super(i, t3gVar);
            this.c = nVar;
            this.d = qy0Var;
            this.e = fVar;
            this.f = dVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/TNodeAnimation$2");
        }

        @Override // tb.hfs.e
        public void a(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd8a4c55", new Object[]{this, animator});
                return;
            }
            List b = hfs.b(this.c.K(), hfs.a(this.c, this.d.i, this.e, akt.h()), false, 0, this.d.h);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(this.d.h);
            animatorSet.setStartDelay(0L);
            animatorSet.playTogether(b);
            d dVar = this.f;
            if (dVar != null) {
                dVar.a(animatorSet, 0);
            }
            animatorSet.start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f20608a;
        public final c b;
        public t3g c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(int i, t3g t3gVar) {
                super(i, t3gVar);
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/TNodeAnimation$ExecuteStatusMonitor$1");
            }

            @Override // tb.hfs.e
            public void a(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bd8a4c55", new Object[]{this, animator});
                } else {
                    d.this.b();
                }
            }
        }

        static {
            t2o.a(503316630);
        }

        public d(c cVar) {
            this.b = cVar;
        }

        public void a(AnimatorSet animatorSet, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58eb6a23", new Object[]{this, animatorSet, new Integer(i)});
            } else if (animatorSet != null && !animatorSet.getChildAnimations().isEmpty()) {
                this.f20608a++;
                animatorSet.addListener(new a(i, this.c));
            }
        }

        public void b() {
            c cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be8bae45", new Object[]{this});
                return;
            }
            int i = this.f20608a - 1;
            this.f20608a = i;
            if (i == 0 && (cVar = this.b) != null) {
                cVar.a();
            }
        }

        public void c(t3g t3gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed8f5838", new Object[]{this, t3gVar});
            } else {
                this.c = t3gVar;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f20610a = Integer.MIN_VALUE;
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = Integer.MIN_VALUE;
        public int e;
        public int f;
        public jfw g;

        static {
            t2o.a(503316633);
        }

        public static f a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("bec7b9ff", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            f fVar = new f();
            fVar.f20610a = i;
            fVar.b = i2;
            fVar.c = i3;
            fVar.d = i4;
            return fVar;
        }

        public static f b(int i, int i2, jfw jfwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("e6b32f8a", new Object[]{new Integer(i), new Integer(i2), jfwVar});
            }
            f fVar = new f();
            fVar.g = jfwVar;
            fVar.e = i;
            fVar.f = i2;
            return fVar;
        }
    }

    static {
        t2o.a(503316626);
    }

    public static List<Animator> A(Component component, List<wwd> list, boolean z, int i, long j) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c6aa0c99", new Object[]{component, list, new Boolean(z), new Integer(i), new Long(j)});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            Iterator<wwd> it = list.iterator();
            while (it.hasNext()) {
                wwd next = it.next();
                if (next == null || next.a() == null) {
                    it.remove();
                } else {
                    Animator a2 = next.a();
                    if (a2 instanceof ValueAnimator) {
                        ValueAnimator valueAnimator = (ValueAnimator) a2;
                        valueAnimator.setRepeatCount(i);
                        if (z) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        valueAnimator.setRepeatMode(i2);
                    }
                    a2.setDuration(j);
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List a(n nVar, wy0 wy0Var, f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("da39d722", new Object[]{nVar, wy0Var, fVar, new Boolean(z)});
        }
        return h(nVar, wy0Var, fVar, z);
    }

    public static /* synthetic */ List b(Component component, List list, boolean z, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("18195376", new Object[]{component, list, new Boolean(z), new Integer(i), new Long(j)});
        }
        return A(component, list, z, i, j);
    }

    public static AnimatorSet c(o oVar, int i, List<qy0> list, boolean z, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("a4917938", new Object[]{oVar, new Integer(i), list, new Boolean(z), dVar});
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(e(oVar, i, list.get(i2), dVar));
        }
        if (z) {
            animatorSet.playSequentially(arrayList);
        } else {
            animatorSet.playTogether(arrayList);
        }
        if (dVar != null) {
            dVar.a(animatorSet, 0);
        }
        return animatorSet;
    }

    public static AnimatorSet d(o oVar, int i, qy0 qy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("c68c3473", new Object[]{oVar, new Integer(i), qy0Var});
        }
        return e(oVar, i, qy0Var, null);
    }

    public static AnimatorSet e(o oVar, int i, qy0 qy0Var, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("2cb77fcd", new Object[]{oVar, new Integer(i), qy0Var, dVar});
        }
        return g(oVar, i, qy0Var, null, dVar);
    }

    public static AnimatorSet f(o oVar, int i, qy0 qy0Var, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("8181e37d", new Object[]{oVar, new Integer(i), qy0Var, fVar});
        }
        return g(oVar, i, qy0Var, fVar, null);
    }

    public static AnimatorSet g(o oVar, int i, qy0 qy0Var, f fVar, d dVar) {
        boolean z;
        t3g t3gVar;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("dec19474", new Object[]{oVar, new Integer(i), qy0Var, fVar, dVar});
        }
        int i4 = i;
        AnimatorSet animatorSet = new AnimatorSet();
        List<t3g> list = qy0Var.f;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            animatorSet.setDuration(qy0Var.f26995a);
            animatorSet.setInterpolator(l(qy0Var));
        }
        animatorSet.setStartDelay(qy0Var.b);
        int i5 = qy0Var.c;
        if (i5 != 0) {
            i4 = i5;
        }
        n a0 = oVar.a0(i4);
        if (a0 == null) {
            return animatorSet;
        }
        if (qy0Var.e == null) {
            qy0Var.e = new xy0();
        }
        t3g t3gVar2 = null;
        if (z) {
            int a2 = qy0Var.a();
            if (a2 > 0) {
                t3gVar2 = t3g.a(a0);
            }
            ArrayList arrayList = new ArrayList();
            for (t3g t3gVar3 : qy0Var.f) {
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(t3gVar3.c.b)) {
                    arrayList2.add(j(a0, t3gVar3.c.b));
                }
                wy0 wy0Var = t3gVar3.d;
                if (wy0Var != null) {
                    arrayList2.addAll(h(a0, wy0Var, fVar, true));
                }
                if (!arrayList2.isEmpty()) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    AnimatorSet.Builder play = animatorSet2.play(((wwd) arrayList2.get(i3)).a());
                    for (int i6 = 1; i6 < arrayList2.size(); i6++) {
                        play.with(((wwd) arrayList2.get(i6)).a());
                    }
                    animatorSet2.setStartDelay(t3gVar3.f28465a);
                    animatorSet2.setDuration(t3gVar3.b);
                    arrayList.add(animatorSet2);
                }
                i3 = 0;
            }
            animatorSet.playTogether(arrayList);
            t3gVar = t3gVar2;
            i2 = a2;
        } else {
            if (!(qy0Var.g == null && TextUtils.isEmpty(qy0Var.e.b) && fVar == null)) {
                ArrayList arrayList3 = new ArrayList();
                if (!TextUtils.isEmpty(qy0Var.e.b)) {
                    arrayList3.add(j(a0, qy0Var.e.b));
                }
                arrayList3.addAll(h(a0, qy0Var.g, fVar, akt.h()));
                animatorSet.playTogether(A(a0.K(), arrayList3, qy0Var.e.d, qy0Var.a(), qy0Var.f26995a));
            }
            t3gVar = null;
            i2 = 0;
        }
        if (qy0Var.i != null) {
            animatorSet.addListener(new b(i2, t3gVar, a0, qy0Var, fVar, dVar));
        } else if (dVar != null) {
            dVar.c(t3gVar);
            dVar.a(animatorSet, i2);
        }
        return animatorSet;
    }

    public static List<wwd> h(n nVar, wy0 wy0Var, f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("97059fef", new Object[]{nVar, wy0Var, fVar, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        View w0 = nVar.w0();
        if (w0 == null) {
            return arrayList;
        }
        if (wy0Var != null) {
            r(arrayList, nVar, w0, wy0Var, fVar, z);
            m(arrayList, nVar, w0, wy0Var, fVar, z);
            z(arrayList, nVar, w0, wy0Var, fVar, z);
            p(arrayList, nVar, w0, wy0Var, fVar, z);
            q(arrayList, nVar, w0, wy0Var, fVar, z);
            n(arrayList, nVar, w0, wy0Var, fVar, z);
            s(arrayList, nVar, w0, wy0Var, fVar, z);
            o(arrayList, nVar, w0, wy0Var, fVar, z);
            zdu zduVar = wy0Var.i;
            if (zduVar != null) {
                u(arrayList, nVar, w0, zduVar, fVar, z);
                v(arrayList, nVar, w0, wy0Var.i, fVar, z);
                w(arrayList, nVar, w0, wy0Var.i, fVar, z);
                x(arrayList, nVar, w0, wy0Var.i, fVar, z);
                y(arrayList, nVar, w0, wy0Var.i, fVar, z);
            }
        }
        if (fVar != null) {
            t(arrayList, nVar, w0, fVar);
        }
        return arrayList;
    }

    public static Animator i(TextComponent textComponent, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("771f0721", new Object[]{textComponent, new Float(f2), new Float(f3)});
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        ofFloat.addUpdateListener(new a(textComponent));
        return ofFloat;
    }

    public static wwd j(n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wwd) ipChange.ipc$dispatch("8c0c034f", new Object[]{nVar, str});
        }
        if ("flip-from-left".equals(str)) {
            return cgs.o(nVar, -180.0f, 0.0f, false);
        }
        if ("flip-from-right".equals(str)) {
            return cgs.o(nVar, 180.0f, 0.0f, false);
        }
        if ("flip-from-top".equals(str)) {
            return bgs.o(nVar, -180.0f, 0.0f, false);
        }
        if ("flip-from-bottom".equals(str)) {
            return bgs.o(nVar, 180.0f, 0.0f, false);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r5.equals("ease-in") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.animation.Interpolator k(java.lang.String r5) {
        /*
            java.lang.String r0 = "linear"
            r1 = 0
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = tb.hfs.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r0 = "35bf4f23"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            java.lang.Object r5 = r3.ipc$dispatch(r0, r2)
            android.view.animation.Interpolator r5 = (android.view.animation.Interpolator) r5
            return r5
        L_0x0018:
            if (r5 != 0) goto L_0x001b
            r5 = r0
        L_0x001b:
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -1965120668: goto L_0x004f;
                case -1102672091: goto L_0x0046;
                case -789192465: goto L_0x003b;
                case -361990811: goto L_0x0030;
                case 3105774: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r1 = -1
            goto L_0x0058
        L_0x0025:
            java.lang.String r0 = "ease"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x002e
            goto L_0x0023
        L_0x002e:
            r1 = 4
            goto L_0x0058
        L_0x0030:
            java.lang.String r0 = "ease-in-out"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0039
            goto L_0x0023
        L_0x0039:
            r1 = 3
            goto L_0x0058
        L_0x003b:
            java.lang.String r0 = "ease-out"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0044
            goto L_0x0023
        L_0x0044:
            r1 = 2
            goto L_0x0058
        L_0x0046:
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x004d
            goto L_0x0023
        L_0x004d:
            r1 = 1
            goto L_0x0058
        L_0x004f:
            java.lang.String r0 = "ease-in"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0058
            goto L_0x0023
        L_0x0058:
            switch(r1) {
                case 0: goto L_0x0073;
                case 1: goto L_0x006d;
                case 2: goto L_0x0067;
                case 3: goto L_0x0061;
                case 4: goto L_0x0067;
                default: goto L_0x005b;
            }
        L_0x005b:
            android.view.animation.LinearInterpolator r5 = new android.view.animation.LinearInterpolator
            r5.<init>()
            return r5
        L_0x0061:
            android.view.animation.AccelerateDecelerateInterpolator r5 = new android.view.animation.AccelerateDecelerateInterpolator
            r5.<init>()
            return r5
        L_0x0067:
            android.view.animation.DecelerateInterpolator r5 = new android.view.animation.DecelerateInterpolator
            r5.<init>()
            return r5
        L_0x006d:
            android.view.animation.LinearInterpolator r5 = new android.view.animation.LinearInterpolator
            r5.<init>()
            return r5
        L_0x0073:
            android.view.animation.AccelerateInterpolator r5 = new android.view.animation.AccelerateInterpolator
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hfs.k(java.lang.String):android.view.animation.Interpolator");
    }

    public static Interpolator l(qy0 qy0Var) {
        String str;
        xy0 xy0Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("fc5fd7a3", new Object[]{qy0Var});
        }
        if (qy0Var == null || (xy0Var = qy0Var.e) == null || TextUtils.isEmpty(xy0Var.f31675a)) {
            str = "linear";
        } else {
            str = qy0Var.e.f31675a;
        }
        return k(str);
    }

    public static void m(List<wwd> list, n nVar, View view, wy0 wy0Var, f fVar, boolean z) {
        ifs ifsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288f15c5", new Object[]{list, nVar, view, wy0Var, fVar, new Boolean(z)});
            return;
        }
        int i = wy0Var.f;
        if (i != 1) {
            if (fVar != null) {
                ifsVar = ifs.o(nVar, i, fVar.g.E, false);
            } else {
                ifsVar = ifs.o(nVar, ifs.n(view), wy0Var.f, z);
            }
            if (ifsVar != null) {
                list.add(ifsVar);
            }
        }
    }

    public static void n(List<wwd> list, n nVar, View view, wy0 wy0Var, f fVar, boolean z) {
        jgs jgsVar;
        kgs kgsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f7ec6b", new Object[]{list, nVar, view, wy0Var, fVar, new Boolean(z)});
            return;
        }
        PointF pointF = wy0Var.c;
        if (pointF != null) {
            if (fVar != null) {
                jgsVar = jgs.o(nVar, pointF.x, 0.0f, false);
            } else {
                jgsVar = jgs.o(nVar, view.getTranslationX(), view.getTranslationX() + pointF.x, z);
            }
            if (jgsVar != null) {
                list.add(jgsVar);
            }
            if (fVar != null) {
                kgsVar = kgs.o(nVar, pointF.y, 0.0f, false);
            } else {
                kgsVar = kgs.o(nVar, view.getTranslationY(), view.getTranslationY() + pointF.y, z);
            }
            if (kgsVar != null) {
                list.add(kgsVar);
            }
        }
    }

    public static void o(List<wwd> list, n nVar, View view, wy0 wy0Var, f fVar, boolean z) {
        mfs mfsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89bf711", new Object[]{list, nVar, view, wy0Var, fVar, new Boolean(z)});
            return;
        }
        int i = wy0Var.g;
        if (i != -1) {
            if (fVar != null) {
                mfsVar = mfs.p(nVar, i, fVar.g.J, false);
            } else {
                mfsVar = mfs.p(nVar, (int) mfs.o(view), wy0Var.g, z);
            }
            if (mfsVar != null) {
                list.add(mfsVar);
            }
        }
    }

    public static void p(List<wwd> list, n nVar, View view, wy0 wy0Var, f fVar, boolean z) {
        pfs pfsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("351b0fec", new Object[]{list, nVar, view, wy0Var, fVar, new Boolean(z)});
            return;
        }
        int i = wy0Var.b;
        if (i != -1) {
            if (fVar != null) {
                pfsVar = pfs.n(nVar, i, fVar.f, false);
            } else {
                pfsVar = pfs.n(nVar, view.getHeight(), wy0Var.b, z);
            }
            if (pfsVar != null) {
                list.add(pfsVar);
            }
        }
    }

    public static void q(List<wwd> list, n nVar, View view, wy0 wy0Var, f fVar, boolean z) {
        gfs gfsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d16764", new Object[]{list, nVar, view, wy0Var, fVar, new Boolean(z)});
            return;
        }
        float f2 = wy0Var.e;
        if (f2 != -1.0f) {
            if (fVar != null) {
                gfsVar = gfs.o(nVar, f2, fVar.g.T, false);
            } else {
                gfsVar = gfs.o(nVar, view.getAlpha(), wy0Var.e, z);
            }
            if (gfsVar != null) {
                list.add(gfsVar);
            }
        }
    }

    public static void r(List<wwd> list, n nVar, View view, wy0 wy0Var, f fVar, boolean z) {
        wfs wfsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14b181e", new Object[]{list, nVar, view, wy0Var, fVar, new Boolean(z)});
            return;
        }
        int i = wy0Var.h;
        if (i != -1) {
            if (fVar != null) {
                wfsVar = wfs.n(nVar, i, fVar.g.g, false);
            } else {
                float paddingLeft = view.getPaddingLeft();
                if (nVar.K() instanceof com.taobao.tao.flexbox.layoutmanager.component.e) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (viewGroup.getChildCount() > 0) {
                        paddingLeft = viewGroup.getChildAt(0).getPaddingLeft();
                    }
                }
                wfsVar = wfs.n(nVar, (int) paddingLeft, wy0Var.h, z);
            }
            if (wfsVar != null) {
                list.add(wfsVar);
            }
        }
    }

    public static void s(List<wwd> list, n nVar, View view, wy0 wy0Var, f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b0178d", new Object[]{list, nVar, view, wy0Var, fVar, new Boolean(z)});
            return;
        }
        xfs o = xfs.o(wy0Var.d);
        o.j(nVar, 1.0f, 2.0f);
        list.add(o);
    }

    public static void t(List<wwd> list, n nVar, View view, f fVar) {
        jfs n;
        zfs n2;
        hgs n3;
        sfs n4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d2580", new Object[]{list, nVar, view, fVar});
            return;
        }
        if (!(fVar.f20610a == Integer.MIN_VALUE || (n4 = sfs.n(nVar, view.getLeft(), fVar.f20610a, false)) == null)) {
            list.add(n4);
        }
        if (!(fVar.b == Integer.MIN_VALUE || (n3 = hgs.n(nVar, view.getTop(), fVar.b, false)) == null)) {
            list.add(n3);
        }
        if (!(fVar.c == Integer.MIN_VALUE || (n2 = zfs.n(nVar, view.getWidth(), nVar.S().f27261a, view.getRight(), fVar.c, false)) == null)) {
            list.add(n2);
        }
        if (fVar.d != Integer.MIN_VALUE && (n = jfs.n(nVar, view.getHeight(), nVar.S().b, view.getBottom(), fVar.d, false)) != null) {
            list.add(n);
        }
    }

    public static void u(List<wwd> list, n nVar, View view, zdu zduVar, f fVar, boolean z) {
        ags agsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7867eb", new Object[]{list, nVar, view, zduVar, fVar, new Boolean(z)});
            return;
        }
        float f2 = zduVar.c;
        if (f2 != -2.14748365E9f) {
            if (fVar != null) {
                agsVar = ags.o(nVar, f2, 0.0f, false);
            } else {
                agsVar = ags.o(nVar, view.getRotation(), zduVar.c, z);
            }
            if (agsVar != null) {
                list.add(agsVar);
            }
        }
    }

    public static void v(List<wwd> list, n nVar, View view, zdu zduVar, f fVar, boolean z) {
        bgs bgsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d57585", new Object[]{list, nVar, view, zduVar, fVar, new Boolean(z)});
            return;
        }
        float f2 = zduVar.f32699a;
        if (f2 != -2.14748365E9f) {
            if (fVar != null) {
                bgsVar = bgs.o(nVar, f2, 0.0f, false);
            } else {
                bgsVar = bgs.o(nVar, view.getRotationX(), zduVar.f32699a, z);
            }
            if (bgsVar != null) {
                list.add(bgsVar);
            }
        }
    }

    public static void w(List<wwd> list, n nVar, View view, zdu zduVar, f fVar, boolean z) {
        cgs cgsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ffe64", new Object[]{list, nVar, view, zduVar, fVar, new Boolean(z)});
            return;
        }
        float f2 = zduVar.b;
        if (f2 != -2.14748365E9f) {
            if (fVar != null) {
                cgsVar = cgs.o(nVar, f2, 0.0f, false);
            } else {
                cgsVar = cgs.o(nVar, view.getRotationY(), zduVar.b, z);
            }
            if (cgsVar != null) {
                list.add(cgsVar);
            }
        }
    }

    public static void x(List<wwd> list, n nVar, View view, zdu zduVar, f fVar, boolean z) {
        egs egsVar;
        dgs dgsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a389bd78", new Object[]{list, nVar, view, zduVar, fVar, new Boolean(z)});
            return;
        }
        PointF pointF = zduVar.d;
        if (pointF != null) {
            float f2 = pointF.x;
            if (f2 >= 0.0f) {
                if (fVar != null) {
                    dgsVar = dgs.o(nVar, f2, 1.0f, false);
                } else {
                    dgsVar = dgs.o(nVar, view.getScaleX(), pointF.x, z);
                }
                if (dgsVar != null) {
                    list.add(dgsVar);
                }
            }
            float f3 = pointF.y;
            if (f3 >= 0.0f) {
                if (fVar != null) {
                    egsVar = egs.o(nVar, f3, 1.0f, false);
                } else {
                    egsVar = egs.o(nVar, view.getScaleY(), pointF.y, z);
                }
                if (egsVar != null) {
                    list.add(egsVar);
                }
            }
        }
    }

    public static void y(List<wwd> list, n nVar, View view, zdu zduVar, f fVar, boolean z) {
        kgs kgsVar;
        jgs jgsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28afc1f4", new Object[]{list, nVar, view, zduVar, fVar, new Boolean(z)});
            return;
        }
        PointF pointF = zduVar.e;
        if (pointF != null) {
            float f2 = pointF.x;
            if (f2 != -2.14748365E9f) {
                if (fVar != null) {
                    jgsVar = jgs.o(nVar, f2, 0.0f, false);
                } else {
                    jgsVar = jgs.o(nVar, view.getTranslationX(), pointF.x, z);
                }
                if (jgsVar != null) {
                    list.add(jgsVar);
                }
            }
            float f3 = pointF.y;
            if (f3 != -2.14748365E9f) {
                if (fVar != null) {
                    kgsVar = kgs.o(nVar, f3, 0.0f, false);
                } else {
                    kgsVar = kgs.o(nVar, view.getTranslationY(), pointF.y, z);
                }
                if (kgsVar != null) {
                    list.add(kgsVar);
                }
            }
        }
    }

    public static void z(List<wwd> list, n nVar, View view, wy0 wy0Var, f fVar, boolean z) {
        mgs mgsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d7de89", new Object[]{list, nVar, view, wy0Var, fVar, new Boolean(z)});
            return;
        }
        int i = wy0Var.f31007a;
        if (i != -1) {
            if (fVar != null) {
                mgsVar = mgs.n(nVar, i, fVar.e, false);
            } else {
                mgsVar = mgs.n(nVar, view.getWidth(), wy0Var.f31007a, z);
            }
            if (mgsVar != null) {
                list.add(mgsVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class e implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f20609a;
        public final t3g b;

        static {
            t2o.a(503316632);
        }

        public e(int i, t3g t3gVar) {
            this.f20609a = i;
            this.b = t3gVar;
        }

        public abstract void a(Animator animator);

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
            } else if (this.b != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                t3g t3gVar = this.b;
                arrayList.addAll(hfs.a(t3gVar.e, t3gVar.d, null, akt.h()));
                animatorSet.playTogether(hfs.b(this.b.e.K(), arrayList, false, 0, 0L));
                animatorSet.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            int i = this.f20609a;
            if (i > 0) {
                this.f20609a = i - 1;
                if (akt.p2("resetKeyFrameAnimation", false)) {
                    b();
                }
                animator.start();
                return;
            }
            a(animator);
        }
    }
}
