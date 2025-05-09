package tb;

import android.graphics.Rect;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.pol;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class sol implements pol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final teu f28175a;
    public final teu b;
    public final List<Pair<View, String>> c;
    public View d;
    public final boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.sol$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class C1056a implements pol.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f28176a;

            public C1056a(Runnable runnable) {
                this.f28176a = runnable;
            }

            @Override // tb.pol.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8df164ae", new Object[]{this});
                } else {
                    zrt.Companion.c(this.f28176a, false);
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ teu f28177a;
            public final /* synthetic */ pol.a b;

            public b(teu teuVar, pol.a aVar) {
                this.f28177a = teuVar;
                this.b = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                this.f28177a.a().removeView(this.f28177a.d());
                pol.a aVar = this.b;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ArrayList f28178a;

            public c(ArrayList arrayList) {
                this.f28178a = arrayList;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArrayList arrayList = this.f28178a;
                ckf.d(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    View view = (View) it.next();
                    ckf.f(view, "view");
                    view.setVisibility(4);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class e implements Transition.TransitionListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Object f28180a;
            public final /* synthetic */ ArrayList b;
            public final /* synthetic */ Object c;
            public final /* synthetic */ ArrayList d;
            public final /* synthetic */ Object e;
            public final /* synthetic */ ArrayList f;

            public e(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
                this.f28180a = obj;
                this.b = arrayList;
                this.c = obj2;
                this.d = arrayList2;
                this.e = obj3;
                this.f = arrayList3;
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f3bc7d", new Object[]{this, transition});
                } else {
                    ckf.g(transition, "transition");
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5f39e64", new Object[]{this, transition});
                } else {
                    ckf.g(transition, "transition");
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3df73669", new Object[]{this, transition});
                } else {
                    ckf.g(transition, "transition");
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d325edea", new Object[]{this, transition});
                } else {
                    ckf.g(transition, "transition");
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4ffba07d", new Object[]{this, transition});
                    return;
                }
                ckf.g(transition, "transition");
                Object obj = this.f28180a;
                if (obj != null) {
                    a.f(sol.Companion, obj, this.b, null);
                }
                Object obj2 = this.c;
                if (obj2 != null) {
                    a.f(sol.Companion, obj2, this.d, null);
                }
                Object obj3 = this.e;
                if (obj3 != null) {
                    a.f(sol.Companion, obj3, this.f, null);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class f extends Transition.EpicenterCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Rect f28181a;

            public f(Rect rect) {
                this.f28181a = rect;
            }

            public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/transition/PageTransitionImpl$Companion$setEpicenter$1");
            }

            @Override // android.transition.Transition.EpicenterCallback
            public Rect onGetEpicenter(Transition transition) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Rect) ipChange.ipc$dispatch("d9c53a38", new Object[]{this, transition});
                }
                ckf.g(transition, "transition");
                Rect rect = this.f28181a;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return this.f28181a;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class g extends Transition.EpicenterCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Rect f28182a;

            public g(Rect rect) {
                this.f28182a = rect;
            }

            public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/transition/PageTransitionImpl$Companion$setEpicenter$2");
            }

            @Override // android.transition.Transition.EpicenterCallback
            public Rect onGetEpicenter(Transition transition) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Rect) ipChange.ipc$dispatch("d9c53a38", new Object[]{this, transition});
                }
                ckf.g(transition, "transition");
                return this.f28182a;
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class h implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f28183a;
            public final /* synthetic */ ArrayList b;
            public final /* synthetic */ ArrayList c;
            public final /* synthetic */ ArrayList d;
            public final /* synthetic */ ArrayList e;

            public h(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
                this.f28183a = i;
                this.b = arrayList;
                this.c = arrayList2;
                this.d = arrayList3;
                this.e = arrayList4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int i = this.f28183a;
                for (int i2 = 0; i2 < i; i2++) {
                    ViewCompat.setTransitionName((View) this.b.get(i2), (String) this.c.get(i2));
                    ViewCompat.setTransitionName((View) this.d.get(i2), (String) this.e.get(i2));
                }
            }
        }

        static {
            t2o.a(919601382);
        }

        public a() {
        }

        public static final /* synthetic */ ArrayList a(a aVar, Object obj, View view, ArrayList arrayList, View view2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("23a4eaca", new Object[]{aVar, obj, view, arrayList, view2});
            }
            return aVar.q(obj, view, arrayList, view2);
        }

        public static final /* synthetic */ void b(a aVar, View view, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fd19831", new Object[]{aVar, view, rect});
            } else {
                aVar.t(view, rect);
            }
        }

        public static final /* synthetic */ Transition c(a aVar, Object obj, Object obj2, Object obj3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Transition) ipChange.ipc$dispatch("b591854a", new Object[]{aVar, obj, obj2, obj3});
            }
            return aVar.w(obj, obj2, obj3);
        }

        public static final /* synthetic */ ArrayList d(a aVar, ArrayList arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("f7344b97", new Object[]{aVar, arrayList});
            }
            return aVar.z(arrayList);
        }

        public static final /* synthetic */ void e(a aVar, teu teuVar, ArrayList arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fe91d8b", new Object[]{aVar, teuVar, arrayList});
            } else {
                aVar.A(teuVar, arrayList);
            }
        }

        public static final /* synthetic */ void f(a aVar, Object obj, ArrayList arrayList, ArrayList arrayList2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("380f217e", new Object[]{aVar, obj, arrayList, arrayList2});
            } else {
                aVar.B(obj, arrayList, arrayList2);
            }
        }

        public static final /* synthetic */ void g(a aVar, Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd31f557", new Object[]{aVar, obj, obj2, arrayList, obj3, arrayList2, obj4, arrayList3});
            } else {
                aVar.D(obj, obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
            }
        }

        public static final /* synthetic */ void h(a aVar, Object obj, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f76c24b8", new Object[]{aVar, obj, rect});
            } else {
                aVar.E(obj, rect);
            }
        }

        public static final /* synthetic */ void i(a aVar, Object obj, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40f79271", new Object[]{aVar, obj, view});
            } else {
                aVar.F(obj, view);
            }
        }

        public static final /* synthetic */ void j(a aVar, View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ed75799", new Object[]{aVar, view, arrayList, arrayList2, arrayList3, map});
            } else {
                aVar.G(view, arrayList, arrayList2, arrayList3, map);
            }
        }

        public static final /* synthetic */ void k(a aVar, Object obj, View view, ArrayList arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8a8ee55", new Object[]{aVar, obj, view, arrayList});
            } else {
                aVar.H(obj, view, arrayList);
            }
        }

        public static final /* synthetic */ void l(a aVar, List list, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83102445", new Object[]{aVar, list, new Integer(i)});
            } else {
                aVar.I(list, i);
            }
        }

        public static final /* synthetic */ void m(a aVar, Object obj, ArrayList arrayList, ArrayList arrayList2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4f7a2e", new Object[]{aVar, obj, arrayList, arrayList2});
            } else {
                aVar.J(obj, arrayList, arrayList2);
            }
        }

        public final void A(teu teuVar, ArrayList<View> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e271698", new Object[]{this, teuVar, arrayList});
            } else if (teuVar != null && teuVar.g() != null) {
                teuVar.d().setVisibility(0);
                Transition g2 = teuVar.g();
                ckf.d(g2);
                C(g2, teuVar.d(), arrayList);
                zwk.Companion.a(teuVar.a(), new c(arrayList));
            }
        }

        public final void C(Transition transition, View view, ArrayList<View> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66ddcb95", new Object[]{this, transition, view, arrayList});
            } else if (transition != null) {
                transition.addListener(new d(view, arrayList));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.transition.Transition");
            }
        }

        public final void D(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21ffed64", new Object[]{this, obj, obj2, arrayList, obj3, arrayList2, obj4, arrayList3});
            } else if (obj != null) {
                ((Transition) obj).addListener(new e(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.transition.Transition");
            }
        }

        public final void E(Object obj, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23195d85", new Object[]{this, obj, rect});
            } else if (obj != null) {
                ((Transition) obj).setEpicenterCallback(new f(rect));
            }
        }

        public final void F(Object obj, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9339be", new Object[]{this, obj, view});
            } else if (view == null) {
            } else {
                if (obj != null) {
                    Rect rect = new Rect();
                    t(view, rect);
                    ((Transition) obj).setEpicenterCallback(new g(rect));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.transition.Transition");
            }
        }

        public final void I(List<? extends View> list, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83d36392", new Object[]{this, list, new Integer(i)});
            } else if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((View) list.get(size)).setVisibility(i);
                    } else {
                        return;
                    }
                }
            }
        }

        public final void J(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b615eb81", new Object[]{this, obj, arrayList, arrayList2});
                return;
            }
            TransitionSet transitionSet = (TransitionSet) obj;
            if (transitionSet != null) {
                transitionSet.getTargets().clear();
                transitionSet.getTargets().addAll(arrayList2);
                B(transitionSet, arrayList, arrayList2);
            }
        }

        public final void o(List<View> list, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86430b44", new Object[]{this, list, view});
                return;
            }
            int size = list.size();
            if (!s(list, view, size)) {
                list.add(view);
                int size2 = list.size();
                for (int i = size; i < size2; i++) {
                    View view2 = list.get(i);
                    if (view2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view2;
                        int childCount = viewGroup.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = viewGroup.getChildAt(i2);
                            ckf.f(childAt, "child");
                            if (!s(list, childAt, size)) {
                                list.add(childAt);
                            }
                        }
                    }
                }
            }
        }

        public final void p(ArrayList<View> arrayList, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bced03d6", new Object[]{this, arrayList, view});
            } else if (view.getVisibility() == 0) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                        arrayList.add(view);
                        return;
                    }
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        ckf.f(childAt, "child");
                        p(arrayList, childAt);
                    }
                    return;
                }
                arrayList.add(view);
            }
        }

        public final ArrayList<View> q(Object obj, View view, ArrayList<View> arrayList, View view2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("3b6733d7", new Object[]{this, obj, view, arrayList, view2});
            }
            if (obj == null) {
                return null;
            }
            ArrayList<View> arrayList2 = new ArrayList<>();
            p(arrayList2, view);
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view2);
            n(obj, arrayList2);
            return arrayList2;
        }

        public final boolean r(Transition transition, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1c2dced0", new Object[]{this, transition, str})).booleanValue();
            }
            if (transition != null) {
                if (!(transition instanceof TransitionSet)) {
                    return TextUtils.equals(transition.getClass().getSimpleName(), str);
                }
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                for (int i = 0; i < transitionCount; i++) {
                    if (r(transitionSet.getTransitionAt(i), str)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean s(List<? extends View> list, View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bc76e20d", new Object[]{this, list, view, new Integer(i)})).booleanValue();
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (((View) list.get(i2)) == view) {
                    return true;
                }
            }
            return false;
        }

        public final void t(View view, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5efed4c4", new Object[]{this, view, rect});
                return;
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        }

        public final boolean u(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b681e4b2", new Object[]{this, transition})).booleanValue();
            }
            if (!v(transition.getTargetIds()) || !v(transition.getTargetNames()) || !v(transition.getTargetTypes())) {
                return true;
            }
            return false;
        }

        public final boolean v(List<?> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4f055315", new Object[]{this, list})).booleanValue();
            }
            if (list == null || list.isEmpty()) {
                return true;
            }
            return false;
        }

        public final Transition w(Object obj, Object obj2, Object obj3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Transition) ipChange.ipc$dispatch("f9288e1d", new Object[]{this, obj, obj2, obj3});
            }
            TransitionSet transitionSet = new TransitionSet();
            if (obj != null) {
                transitionSet.addTransition((Transition) obj);
            }
            if (obj2 != null) {
                transitionSet.addTransition((Transition) obj2);
            }
            if (obj3 != null) {
                transitionSet.addTransition((Transition) obj3);
            }
            return transitionSet;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class d implements Transition.TransitionListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f28179a;
            public final /* synthetic */ ArrayList b;

            public d(View view, ArrayList arrayList) {
                this.f28179a = view;
                this.b = arrayList;
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f3bc7d", new Object[]{this, transition});
                } else {
                    ckf.g(transition, "transition");
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3df73669", new Object[]{this, transition});
                } else {
                    ckf.g(transition, "transition");
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d325edea", new Object[]{this, transition});
                } else {
                    ckf.g(transition, "transition");
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4ffba07d", new Object[]{this, transition});
                } else {
                    ckf.g(transition, "transition");
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5f39e64", new Object[]{this, transition});
                    return;
                }
                ckf.g(transition, "transition");
                transition.removeListener(this);
                this.f28179a.setVisibility(8);
                ArrayList arrayList = this.b;
                ckf.d(arrayList);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = this.b.get(i);
                    ckf.f(obj, "exitingViews[i]");
                    ((View) obj).setVisibility(0);
                }
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final void y(teu teuVar, teu teuVar2, List<Pair<View, String>> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0321e5d", new Object[]{this, teuVar, teuVar2, list});
                return;
            }
            ckf.g(teuVar, "pre");
            ckf.g(teuVar2, "page");
            if (list == null || list.isEmpty()) {
                teuVar2.a().addView(teuVar2.d());
                return;
            }
            teuVar2.p(new sol(teuVar, teuVar2, list, false));
            teuVar2.a().addView(teuVar2.d());
            teuVar2.l();
        }

        public final void B(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
            List<View> targets;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fb996d1", new Object[]{this, obj, arrayList, arrayList2});
            } else if (obj != null) {
                Transition transition = (Transition) obj;
                if (transition instanceof TransitionSet) {
                    TransitionSet transitionSet = (TransitionSet) transition;
                    int transitionCount = transitionSet.getTransitionCount();
                    while (i < transitionCount) {
                        Transition transitionAt = transitionSet.getTransitionAt(i);
                        ckf.f(transitionAt, "child");
                        B(transitionAt, arrayList, arrayList2);
                        i++;
                    }
                } else if (!u(transition) && (targets = transition.getTargets()) != null) {
                    int size = targets.size();
                    ckf.d(arrayList);
                    if (size == arrayList.size() && targets.containsAll(arrayList)) {
                        int size2 = arrayList2 != null ? arrayList2.size() : 0;
                        while (i < size2) {
                            ckf.d(arrayList2);
                            transition.addTarget(arrayList2.get(i));
                            i++;
                        }
                        int size3 = arrayList.size();
                        while (true) {
                            size3--;
                            if (size3 >= 0) {
                                transition.removeTarget(arrayList.get(size3));
                            } else {
                                return;
                            }
                        }
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.transition.Transition");
            }
        }

        public final void H(Object obj, View view, ArrayList<View> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c34eea8", new Object[]{this, obj, view, arrayList});
            } else if (obj != null) {
                TransitionSet transitionSet = (TransitionSet) obj;
                List<View> targets = transitionSet.getTargets();
                targets.clear();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view2 = arrayList.get(i);
                    ckf.f(view2, "sharedViews[i]");
                    o(targets, view2);
                }
                targets.add(view);
                arrayList.add(view);
                n(transitionSet, arrayList);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.transition.TransitionSet");
            }
        }

        public final void n(Object obj, ArrayList<View> arrayList) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2f4926", new Object[]{this, obj, arrayList});
            } else if (obj != null) {
                Transition transition = (Transition) obj;
                if (transition instanceof TransitionSet) {
                    TransitionSet transitionSet = (TransitionSet) transition;
                    int transitionCount = transitionSet.getTransitionCount();
                    while (i < transitionCount) {
                        Transition transitionAt = transitionSet.getTransitionAt(i);
                        ckf.f(transitionAt, "child");
                        n(transitionAt, arrayList);
                        i++;
                    }
                } else if (!u(transition) && v(transition.getTargets())) {
                    int size = arrayList.size();
                    while (i < size) {
                        transition.addTarget(arrayList.get(i));
                        i++;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.transition.Transition");
            }
        }

        public final void x(teu teuVar, teu teuVar2, boolean z, pol.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a54aab0b", new Object[]{this, teuVar, teuVar2, new Boolean(z), aVar});
                return;
            }
            ckf.g(teuVar, "top");
            ckf.g(teuVar2, "exit");
            b bVar = new b(teuVar2, aVar);
            if (z) {
                new sol(teuVar, teuVar2, null, true).c(new C1056a(bVar));
            } else {
                zrt.Companion.c(bVar, false);
            }
        }

        public final ArrayList<String> z(ArrayList<View> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("5d70aa64", new Object[]{this, arrayList});
            }
            ArrayList<String> arrayList2 = new ArrayList<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = arrayList.get(i);
                ckf.f(view, "sharedElementsIn[i]");
                View view2 = view;
                arrayList2.add(ViewCompat.getTransitionName(view2));
                ViewCompat.setTransitionName(view2, null);
            }
            return arrayList2;
        }

        public final void G(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e517f26", new Object[]{this, view, arrayList, arrayList2, arrayList3, map});
                return;
            }
            int size = arrayList2.size();
            ArrayList arrayList4 = new ArrayList();
            for (int i = 0; i < size; i++) {
                View view2 = arrayList.get(i);
                ckf.f(view2, "sharedElementsOut[i]");
                View view3 = view2;
                String transitionName = ViewCompat.getTransitionName(view3);
                arrayList4.add(transitionName);
                if (transitionName != null) {
                    ViewCompat.setTransitionName(view3, null);
                    String str = map.get(transitionName);
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (TextUtils.equals(str, arrayList3.get(i2))) {
                            ViewCompat.setTransitionName(arrayList2.get(i2), transitionName);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            zwk.Companion.a(view, new h(size, arrayList2, arrayList3, arrayList, arrayList4));
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f28184a;
        public final /* synthetic */ Rect b;

        public b(View view, Rect rect) {
            this.f28184a = view;
            this.b = rect;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View view = this.f28184a;
            if (view != null) {
                a.b(sol.Companion, view, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements Transition.TransitionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ ArrayList c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ pol.a e;

        public c(boolean z, ArrayList arrayList, ArrayList arrayList2, pol.a aVar) {
            this.b = z;
            this.c = arrayList;
            this.d = arrayList2;
            this.e = aVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f3bc7d", new Object[]{this, transition});
            } else {
                ckf.g(transition, "transition");
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3df73669", new Object[]{this, transition});
            } else {
                ckf.g(transition, "transition");
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d325edea", new Object[]{this, transition});
            } else {
                ckf.g(transition, "transition");
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ffba07d", new Object[]{this, transition});
                return;
            }
            ckf.g(transition, "transition");
            if (this.b && !sol.this.b()) {
                a.l(sol.Companion, this.c, 4);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f39e64", new Object[]{this, transition});
                return;
            }
            ckf.g(transition, "transition");
            if (sol.this.b() && this.b) {
                a.l(sol.Companion, this.d, 0);
            }
            pol.a aVar = this.e;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    static {
        t2o.a(919601381);
        t2o.a(919601379);
    }

    public sol(teu teuVar, teu teuVar2, List<Pair<View, String>> list, boolean z) {
        ckf.g(teuVar, "exitOrReenterPage");
        ckf.g(teuVar2, "enterOrReturnPage");
        this.e = z;
        this.f28175a = teuVar;
        this.b = teuVar2;
        this.c = list;
        if (!z) {
            teuVar.m(list);
        }
    }

    @Override // tb.pol
    public void a(View view, pol.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a48f3a", new Object[]{this, view, aVar});
        } else {
            d(view, aVar);
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5d4edd2", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void c(pol.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135419d2", new Object[]{this, aVar});
        } else {
            a(null, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0246 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r24, tb.pol.a r25) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sol.d(android.view.View, tb.pol$a):void");
    }
}
