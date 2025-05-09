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
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.qol;
import tb.zcr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rol implements qol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final anl f27501a;
    public final anl b;
    public final List<Pair<View, String>> c;
    public View d;
    public final boolean e;
    public final boolean f;
    public final zcr.a g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends Transition.EpicenterCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f27502a;

        public a(Rect rect) {
            this.f27502a = rect;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/containerlifecycle/PageTransitionImpl$10");
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("d9c53a38", new Object[]{this, transition});
            }
            return this.f27502a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ anl f27503a;
        public final /* synthetic */ qol.a b;

        public b(anl anlVar, qol.a aVar) {
            this.f27503a = anlVar;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!this.f27503a.isRootPage(true)) {
                this.f27503a.getPageContainer().getContainerView().removeView(this.f27503a.getDecorView());
            }
            qol.a aVar = this.b;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements qol.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f27504a;
        public final /* synthetic */ boolean b;

        public c(Runnable runnable, boolean z) {
            this.f27504a = runnable;
            this.b = z;
        }

        @Override // tb.qol.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8df164ae", new Object[]{this});
            } else {
                nwv.z0(this.f27504a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f27505a;
        public final /* synthetic */ Rect b;

        public d(View view, Rect rect) {
            this.f27505a = view;
            this.b = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View view = this.f27505a;
            if (view != null) {
                rol.c(view, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Transition.TransitionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f27506a;
        public final /* synthetic */ anl b;
        public final /* synthetic */ ArrayList c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ View e;
        public final /* synthetic */ qol.a f;

        public e(boolean z, anl anlVar, ArrayList arrayList, ArrayList arrayList2, View view, qol.a aVar) {
            this.f27506a = z;
            this.b = anlVar;
            this.c = arrayList;
            this.d = arrayList2;
            this.e = view;
            this.f = aVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f3bc7d", new Object[]{this, transition});
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            anl anlVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f39e64", new Object[]{this, transition});
                return;
            }
            if (rol.d(rol.this)) {
                if (this.f27506a) {
                    rol.e(this.d, 0);
                }
                if (this.b != null && akt.p2("enableFixSharedViewVisibility", true)) {
                    List<Pair<View, String>> currentSharedViews = this.b.getCurrentSharedViews();
                    ArrayList arrayList = new ArrayList();
                    if (currentSharedViews != null && currentSharedViews.size() > 0) {
                        for (Pair<View, String> pair : currentSharedViews) {
                            arrayList.add(pair.first);
                        }
                    }
                    rol.e(rol.f(arrayList, this.e), 0);
                }
            }
            if (!rol.d(rol.this) && (anlVar = this.b) != null && anlVar.getTransitionInfo().f()) {
                rol.e(rol.f(this.c, this.e), 4);
            }
            qol.a aVar = this.f;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3df73669", new Object[]{this, transition});
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d325edea", new Object[]{this, transition});
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ffba07d", new Object[]{this, transition});
            } else if (this.f27506a && !rol.d(rol.this) && !akt.L2(this.b)) {
                rol.e(this.c, 4);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f27507a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ ArrayList c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ ArrayList e;

        public f(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f27507a = i;
            this.b = arrayList;
            this.c = arrayList2;
            this.d = arrayList3;
            this.e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (int i = 0; i < this.f27507a; i++) {
                ViewCompat.setTransitionName((View) this.b.get(i), (String) this.c.get(i));
                ViewCompat.setTransitionName((View) this.d.get(i), (String) this.e.get(i));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class g implements Transition.TransitionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f27508a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public g(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f27508a = obj;
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
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f39e64", new Object[]{this, transition});
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3df73669", new Object[]{this, transition});
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d325edea", new Object[]{this, transition});
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ffba07d", new Object[]{this, transition});
                return;
            }
            Object obj = this.f27508a;
            if (obj != null) {
                rol.g(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                rol.g(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                rol.g(obj3, this.f, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f27509a;

        public h(ArrayList arrayList) {
            this.f27509a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = this.f27509a.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class i implements Transition.TransitionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f27510a;
        public final /* synthetic */ ArrayList b;

        public i(View view, ArrayList arrayList) {
            this.f27510a = view;
            this.b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f3bc7d", new Object[]{this, transition});
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f39e64", new Object[]{this, transition});
                return;
            }
            transition.removeListener(this);
            this.f27510a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3df73669", new Object[]{this, transition});
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d325edea", new Object[]{this, transition});
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ffba07d", new Object[]{this, transition});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class j extends Transition.EpicenterCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f27511a;

        public j(Rect rect) {
            this.f27511a = rect;
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/containerlifecycle/PageTransitionImpl$9");
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("d9c53a38", new Object[]{this, transition});
            }
            Rect rect = this.f27511a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f27511a;
        }
    }

    static {
        t2o.a(502268048);
        t2o.a(503316954);
    }

    public rol(anl anlVar, anl anlVar2, List<Pair<View, String>> list, boolean z) {
        boolean z2;
        this.f27501a = anlVar;
        this.b = anlVar2;
        this.c = list;
        this.e = z;
        if (!z && anlVar != null) {
            anlVar.setCurrentSharedViews(list);
        }
        if (!z || !anlVar2.getPageContainer().u() || !anlVar2.getPageContainer().y().isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f = z2;
        if (z2) {
            this.g = anlVar2.getPageContainer().A();
        }
    }

    public static void A(Object obj, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23195d85", new Object[]{obj, rect});
        } else if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new j(rect));
        }
    }

    public static void B(Object obj, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9339be", new Object[]{obj, view});
        } else if (view != null) {
            Rect rect = new Rect();
            o(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    public static void C(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e517f26", new Object[]{view, arrayList, arrayList2, arrayList3, map});
            return;
        }
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            String transitionName = ViewCompat.getTransitionName(view2);
            arrayList4.add(transitionName);
            if (transitionName != null) {
                ViewCompat.setTransitionName(view2, null);
                String str = map.get(transitionName);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (TextUtils.equals(str, arrayList3.get(i3))) {
                        ViewCompat.setTransitionName(arrayList2.get(i3), transitionName);
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        axk.a(view, new f(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public static void D(Object obj, View view, ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c34eea8", new Object[]{obj, view, arrayList});
            return;
        }
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            i(targets, arrayList.get(i2));
        }
        targets.add(view);
        arrayList.add(view);
        h(transitionSet, arrayList);
    }

    public static void E(List<View> list, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d36392", new Object[]{list, new Integer(i2)});
        } else if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                list.get(size).setVisibility(i2);
            }
        }
    }

    public static void H(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b615eb81", new Object[]{obj, arrayList, arrayList2});
            return;
        }
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            x(transitionSet, arrayList, arrayList2);
        }
    }

    public static /* synthetic */ void c(View view, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86c8703e", new Object[]{view, rect});
        } else {
            o(view, rect);
        }
    }

    public static /* synthetic */ boolean d(rol rolVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9d63aee", new Object[]{rolVar})).booleanValue();
        }
        return rolVar.e;
    }

    public static /* synthetic */ void e(List list, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1cf9759", new Object[]{list, new Integer(i2)});
        } else {
            E(list, i2);
        }
    }

    public static /* synthetic */ List f(List list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ce0d62a0", new Object[]{list, view});
        }
        return n(list, view);
    }

    public static /* synthetic */ void g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e8fd17", new Object[]{obj, arrayList, arrayList2});
        } else {
            x(obj, arrayList, arrayList2);
        }
    }

    public static void h(Object obj, ArrayList<View> arrayList) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f4926", new Object[]{obj, arrayList});
            return;
        }
        Transition transition = (Transition) obj;
        if (transition != null) {
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i2 < transitionCount) {
                    h(transitionSet.getTransitionAt(i2), arrayList);
                    i2++;
                }
            } else if (!p(transition) && q(transition.getTargets())) {
                int size = arrayList.size();
                while (i2 < size) {
                    transition.addTarget(arrayList.get(i2));
                    i2++;
                }
            }
        }
    }

    public static void i(List<View> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86430b44", new Object[]{list, view});
            return;
        }
        int size = list.size();
        if (!m(list, view, size)) {
            list.add(view);
            for (int i2 = size; i2 < list.size(); i2++) {
                View view2 = list.get(i2);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (!m(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void j(ArrayList<View> arrayList, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bced03d6", new Object[]{arrayList, view});
        } else if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    j(arrayList, viewGroup.getChildAt(i2));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    public static ArrayList<View> k(Object obj, View view, ArrayList<View> arrayList, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3b6733d7", new Object[]{obj, view, arrayList, view2});
        }
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        j(arrayList2, view);
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view2);
        h(obj, arrayList2);
        return arrayList2;
    }

    public static boolean l(Transition transition, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c2dced0", new Object[]{transition, str})).booleanValue();
        }
        if (transition != null) {
            if (!(transition instanceof TransitionSet)) {
                return TextUtils.equals(transition.getClass().getSimpleName(), str);
            }
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i2 = 0; i2 < transitionCount; i2++) {
                if (l(transitionSet.getTransitionAt(i2), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(List<View> list, View view, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc76e20d", new Object[]{list, view, new Integer(i2)})).booleanValue();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    public static List<View> n(List<View> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e6bb0e72", new Object[]{list, view});
        }
        ArrayList arrayList = new ArrayList();
        for (View view2 : list) {
            if (view2 != view && nwv.o(view2.getTag(R.id.layout_manager_transition_card_view), false)) {
                arrayList.add(view2);
            }
        }
        return arrayList;
    }

    public static void o(View view, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5efed4c4", new Object[]{view, rect});
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        rect.set(i2, iArr[1], view.getWidth() + i2, iArr[1] + view.getHeight());
    }

    public static boolean p(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b681e4b2", new Object[]{transition})).booleanValue();
        }
        if (!q(transition.getTargetIds()) || !q(transition.getTargetNames()) || !q(transition.getTargetTypes())) {
            return true;
        }
        return false;
    }

    public static boolean q(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f055315", new Object[]{list})).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static Transition s(Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("f9288e1d", new Object[]{obj, obj2, obj3});
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

    public static void u(anl anlVar, anl anlVar2, List<Pair<View, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("791b87eb", new Object[]{anlVar, anlVar2, list});
        } else if (anlVar2 instanceof zos) {
            tfs.f("PageTransition prePageLeaveAndNewPageEnter with no shareview");
            anlVar2.getPageContainer().getContainerView().addView(((zos) anlVar2).getDecorView());
        } else if (anlVar2 instanceof yml) {
            if (list == null || list.isEmpty()) {
                tfs.f("PageTransition prePageLeaveAndNewPageEnter with no shareview");
                anlVar2.getPageContainer().getContainerView().addView(((yml) anlVar2).getDecorView());
                if (anlVar == null && !anlVar2.getPageContainer().u()) {
                    anlVar2.getActivity().postponeEnterTransition();
                    return;
                }
                return;
            }
            tfs.f("PageTransition prePageLeaveAndNewPageEnter with shareview");
            rol rolVar = new rol(anlVar, anlVar2, list, false);
            yml ymlVar = (yml) anlVar2;
            ymlVar.setPageTransition(rolVar);
            anlVar2.getPageContainer().getContainerView().addView(ymlVar.getDecorView());
            anlVar2.postponedEnterTransition();
        } else if (anlVar2 != null && "FullPage".equals(anlVar2.getClass().getSimpleName())) {
            if (list == null || list.isEmpty()) {
                tfs.f("PageTransition prePageLeaveAndNewPageEnter with no shareview");
                anlVar2.getPageContainer().getContainerView().addView(anlVar2.getDecorView());
                if (anlVar == null && !anlVar2.getPageContainer().u()) {
                    anlVar2.getActivity().postponeEnterTransition();
                    return;
                }
                return;
            }
            tfs.f("PageTransition prePageLeaveAndNewPageEnter with shareview");
            anlVar2.setPageTransition(new rol(anlVar, anlVar2, list, false));
            anlVar2.getPageContainer().getContainerView().addView(anlVar2.getDecorView());
            anlVar2.postponedEnterTransition();
        }
    }

    public static ArrayList<String> v(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("5d70aa64", new Object[]{arrayList});
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            arrayList2.add(ViewCompat.getTransitionName(view));
            ViewCompat.setTransitionName(view, null);
        }
        return arrayList2;
    }

    public static void w(anl anlVar, ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcefdbb1", new Object[]{anlVar, arrayList});
        } else if (anlVar != null && anlVar.getExitTransition() != null) {
            anlVar.getDecorView().setVisibility(0);
            y(anlVar.getExitTransition(), anlVar.getDecorView(), arrayList);
            axk.a(anlVar.getPageContainer().getContainerView(), new h(arrayList));
        }
    }

    public static void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb996d1", new Object[]{obj, arrayList, arrayList2});
            return;
        }
        Transition transition = (Transition) obj;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i3 < transitionCount) {
                x(transitionSet.getTransitionAt(i3), arrayList, arrayList2);
                i3++;
            }
        } else if (!p(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i2 = 0;
            } else {
                i2 = arrayList2.size();
            }
            while (i3 < i2) {
                transition.addTarget(arrayList2.get(i3));
                i3++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    public static void y(Object obj, View view, ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d22d69", new Object[]{obj, view, arrayList});
        } else {
            ((Transition) obj).addListener(new i(view, arrayList));
        }
    }

    public static void z(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ffed64", new Object[]{obj, obj2, arrayList, obj3, arrayList2, obj4, arrayList3});
        } else {
            ((Transition) obj).addListener(new g(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
        }
    }

    public void F(qol.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe75939", new Object[]{this, aVar});
        } else if (this.b.startExitTransition(aVar)) {
        } else {
            if (this.b.getPageContainer().u() || !this.b.getPageContainer().y().isEmpty()) {
                a(null, aVar);
            } else if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0162 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(android.view.View r24, tb.qol.a r25) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rol.G(android.view.View, tb.qol$a):void");
    }

    @Override // tb.qol
    public void a(View view, qol.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db56f2d1", new Object[]{this, view, aVar});
            return;
        }
        tfs.f("PageTransition startTransition");
        G(view, aVar);
    }

    @Override // tb.qol
    public List<View> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6c5e756f", new Object[]{this});
        }
        if (this.c == null) {
            return bjp.a().b();
        }
        ArrayList arrayList = new ArrayList(this.c.size());
        for (Pair<View, String> pair : this.c) {
            arrayList.add(pair.first);
        }
        return arrayList;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5d4edd2", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public static void t(anl anlVar, anl anlVar2, boolean z, qol.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba66b292", new Object[]{anlVar, anlVar2, new Boolean(z), aVar});
            return;
        }
        tfs.f("PageTransition popPage " + anlVar2);
        if (anlVar2 != null) {
            b bVar = new b(anlVar2, aVar);
            boolean p2 = akt.p2("syncRemovePopView", false);
            if (z) {
                new rol(anlVar, anlVar2, null, true).F(new c(bVar, p2));
            } else {
                nwv.z0(bVar, p2);
            }
        }
    }
}
