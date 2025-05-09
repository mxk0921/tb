package com.taobao.tao.flexbox.layoutmanager.animation.shareelement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.anl;
import tb.nwv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareElementAnimationController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long SHARED_ANIMATION_DURATION = 200;
    public static final List<WeakReference<View>> h = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final o f12007a;
    public TabBarControllerShareElementHandler b;
    public List<n> c;
    public List<n> d;
    public List<String> e;
    public boolean f;
    public final SharedElementCallback g = new SharedElementCallback() { // from class: com.taobao.tao.flexbox.layoutmanager.animation.shareelement.ShareElementAnimationController.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            if (str.hashCode() == -467145223) {
                return super.onCaptureSharedElementSnapshot((View) objArr[0], (Matrix) objArr[1], (RectF) objArr[2]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/shareelement/ShareElementAnimationController$1");
        }

        @Override // androidx.core.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Parcelable) ipChange.ipc$dispatch("e427edf9", new Object[]{this, view, matrix, rectF});
            }
            view.setAlpha(nwv.r(view.getTag(R.id.layout_manager_share_element_original_alpha), 1));
            return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }

        @Override // androidx.core.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1003d994", new Object[]{this, list, map});
                return;
            }
            if (ShareElementAnimationController.a(ShareElementAnimationController.this) != null) {
                for (String str : ShareElementAnimationController.a(ShareElementAnimationController.this)) {
                    if (!map.containsKey(str)) {
                        z = true;
                    }
                }
            }
            if (z) {
                list.clear();
                map.clear();
                List<String> a2 = ShareElementAnimationController.a(ShareElementAnimationController.this);
                if (a2 != null) {
                    for (String str2 : a2) {
                        for (n nVar : ShareElementAnimationController.c(ShareElementAnimationController.this)) {
                            View k = ShareElementAnimationController.k(nVar);
                            if (!(str2 == null || k == null || !str2.equals(k.getTransitionName()))) {
                                map.put(str2, k);
                            }
                        }
                    }
                }
            }
            ShareElementAnimationController.b(ShareElementAnimationController.this, null);
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class MySharedElementCallback extends SharedElementCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(503316682);
        }

        private MySharedElementCallback() {
        }

        public static /* synthetic */ Object ipc$super(MySharedElementCallback mySharedElementCallback, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/shareelement/ShareElementAnimationController$MySharedElementCallback");
        }

        public final boolean a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f71b5ad6", new Object[]{this, view})).booleanValue();
            }
            if (view != null) {
                return view.getLocalVisibleRect(new Rect());
            }
            return false;
        }

        @Override // androidx.core.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1003d994", new Object[]{this, list, map});
            } else if (map != null) {
                Iterator<Map.Entry<String, View>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, View> next = it.next();
                    if (!a(next.getValue())) {
                        list.remove(next.getKey());
                        it.remove();
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class TabBarControllerShareElementHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TabBarControllerComponent f12009a;
        public HashMap<Integer, List<n>> b;

        static {
            t2o.a(503316683);
        }

        public TabBarControllerShareElementHandler(TabBarControllerComponent tabBarControllerComponent) {
            this.f12009a = tabBarControllerComponent;
        }

        public static /* synthetic */ TabBarControllerComponent a(TabBarControllerShareElementHandler tabBarControllerShareElementHandler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TabBarControllerComponent) ipChange.ipc$dispatch("fa46e18c", new Object[]{tabBarControllerShareElementHandler});
            }
            return tabBarControllerShareElementHandler.f12009a;
        }

        public static /* synthetic */ HashMap b(TabBarControllerShareElementHandler tabBarControllerShareElementHandler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("23d82ed3", new Object[]{tabBarControllerShareElementHandler});
            }
            return tabBarControllerShareElementHandler.b;
        }

        public void c(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43154175", new Object[]{this, nVar});
                return;
            }
            int W = this.f12009a.W(nVar);
            if (W != -1) {
                Context N = nVar.N();
                if (!ShareElementAnimationController.e(ShareElementAnimationController.this)) {
                    ShareElementAnimationController.f(ShareElementAnimationController.this, true);
                    ActivityCompat.setEnterSharedElementCallback((Activity) N, new SharedElementCallback() { // from class: com.taobao.tao.flexbox.layoutmanager.animation.shareelement.ShareElementAnimationController.TabBarControllerShareElementHandler.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/shareelement/ShareElementAnimationController$TabBarControllerShareElementHandler$1");
                        }

                        @Override // androidx.core.app.SharedElementCallback
                        public void onMapSharedElements(List<String> list, Map<String, View> map) {
                            boolean z = true;
                            boolean z2 = false;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("1003d994", new Object[]{this, list, map});
                                return;
                            }
                            int currentItem = TabBarControllerShareElementHandler.a(TabBarControllerShareElementHandler.this).getView().getCurrentItem();
                            List<n> list2 = (List) TabBarControllerShareElementHandler.b(TabBarControllerShareElementHandler.this).get(Integer.valueOf(currentItem));
                            if (TabBarControllerShareElementHandler.a(TabBarControllerShareElementHandler.this).V() == currentItem) {
                                if (list2 != null) {
                                    for (n nVar2 : list2) {
                                        View k = ShareElementAnimationController.k(nVar2);
                                        if (k != null && !map.containsKey(k.getTransitionName())) {
                                            z2 = true;
                                        }
                                    }
                                    z = z2;
                                } else {
                                    z = false;
                                }
                            }
                            if (z) {
                                list.clear();
                                map.clear();
                                if (list2 != null) {
                                    for (n nVar3 : list2) {
                                        View k2 = ShareElementAnimationController.k(nVar3);
                                        if (k2 != null) {
                                            list.add(k2.getTransitionName());
                                            map.put(k2.getTransitionName(), k2);
                                        }
                                    }
                                }
                            }
                        }
                    });
                }
                if (this.b == null) {
                    this.b = new HashMap<>();
                }
                List<n> list = this.b.get(Integer.valueOf(W));
                if (list == null) {
                    list = new ArrayList<>();
                    this.b.put(Integer.valueOf(W), list);
                }
                list.add(nVar);
                d();
            }
        }

        public void d() {
            List<n> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("116f224c", new Object[]{this});
            } else if (this.b != null) {
                ArrayList arrayList = new ArrayList();
                int currentItem = this.f12009a.getView().getCurrentItem();
                for (int i = 0; i < ((ArrayList) this.f12009a.getNode().d).size(); i++) {
                    if (!(i == currentItem || (list = this.b.get(Integer.valueOf(i))) == null)) {
                        arrayList.addAll(list);
                    }
                }
                ShareElementAnimationController.this.t(arrayList);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f12011a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ n c;

        public a(Object obj, Context context, n nVar) {
            this.f12011a = obj;
            this.b = context;
            this.c = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!((anl) this.f12011a).getPageContainer().u() && ((anl) this.f12011a).getPageContainer().y().size() == 1) {
                ShareElementAnimationController.d(ShareElementAnimationController.this, (Activity) this.b, this.c);
            }
            ((anl) this.c.P().W()).startPostponedEnterTransition(ShareElementAnimationController.this.h());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f12012a;
        public final /* synthetic */ n b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ShareElementAnimationController.p(false);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.animation.shareelement.ShareElementAnimationController$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0682b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0682b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ShareElementAnimationController.p(true);
                }
            }
        }

        public b(Context context, n nVar) {
            this.f12012a = context;
            this.b = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ShareElementAnimationController.d(ShareElementAnimationController.this, (Activity) this.f12012a, this.b);
            nwv.A0(new a(), 400L);
            nwv.A0(new RunnableC0682b(), 1500L);
        }
    }

    static {
        t2o.a(503316676);
    }

    public ShareElementAnimationController(o oVar) {
        this.f12007a = oVar;
    }

    public static /* synthetic */ List a(ShareElementAnimationController shareElementAnimationController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("95c50fc2", new Object[]{shareElementAnimationController});
        }
        return shareElementAnimationController.e;
    }

    public static /* synthetic */ List b(ShareElementAnimationController shareElementAnimationController, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b5c06cb3", new Object[]{shareElementAnimationController, list});
        }
        shareElementAnimationController.e = list;
        return list;
    }

    public static /* synthetic */ List c(ShareElementAnimationController shareElementAnimationController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4f41a583", new Object[]{shareElementAnimationController});
        }
        return shareElementAnimationController.d;
    }

    public static /* synthetic */ void d(ShareElementAnimationController shareElementAnimationController, Activity activity, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418efc3d", new Object[]{shareElementAnimationController, activity, nVar});
        } else {
            shareElementAnimationController.q(activity, nVar);
        }
    }

    public static /* synthetic */ boolean e(ShareElementAnimationController shareElementAnimationController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ffddd65", new Object[]{shareElementAnimationController})).booleanValue();
        }
        return shareElementAnimationController.f;
    }

    public static /* synthetic */ boolean f(ShareElementAnimationController shareElementAnimationController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad32f119", new Object[]{shareElementAnimationController, new Boolean(z)})).booleanValue();
        }
        shareElementAnimationController.f = z;
        return z;
    }

    public static View k(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("33fc109d", new Object[]{nVar});
        }
        if (nVar == null || nVar.K() == null) {
            return null;
        }
        return nVar.K().getTransitionView();
    }

    public static void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38feb85d", new Object[]{new Boolean(z)});
            return;
        }
        Iterator it = ((ArrayList) h).iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) it.next()).get();
            if (view != null) {
                float r = nwv.r(view.getTag(R.id.layout_manager_share_element_original_alpha), 1);
                if (r > 0.0f && view.getAlpha() == 0.0f) {
                    view.setAlpha(r);
                }
            }
        }
        if (z) {
            ((ArrayList) h).clear();
        }
    }

    public static void s(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462e1f50", new Object[]{view});
            return;
        }
        if (view.getAlpha() > 0.0f) {
            view.setTag(R.id.layout_manager_share_element_original_alpha, Float.valueOf(view.getAlpha()));
        }
        ((ArrayList) h).add(new WeakReference(view));
    }

    public void g(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71ac7b5", new Object[]{this, nVar});
            return;
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(nVar);
        Context N = nVar.N();
        if (N instanceof Activity) {
            Object W = nVar.P().W();
            boolean z = W instanceof anl;
            if (z && akt.x1()) {
                nwv.y0(new a(W, N, nVar));
            } else if (!z || ((anl) W).getPageContainer().y().size() == 1) {
                nwv.y0(new b(N, nVar));
            }
        }
    }

    public View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("673d2385", new Object[]{this});
        }
        n i = i();
        if (i != null) {
            return k(i);
        }
        return null;
    }

    public n i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("e5c19806", new Object[]{this});
        }
        List<n> list = this.d;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return null;
        }
        return (n) ((ArrayList) this.d).get(0);
    }

    public List<n> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e5973c2e", new Object[]{this});
        }
        return this.d;
    }

    public void l() {
        List<n> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef00ad3", new Object[]{this});
        } else if ((this.f12007a.M() instanceof Activity) && (list = this.c) != null) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    if (k(nVar) != null) {
                        arrayList2.add(nVar.K().getTransitionView().getTransitionName());
                    }
                }
                Intent intent = new Intent();
                intent.putStringArrayListExtra("shareElements", arrayList2);
                ((Activity) this.f12007a.M()).setResult(-1, intent);
            }
        }
    }

    public void m(int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4fd97e2", new Object[]{this, new Integer(i), intent});
        } else {
            this.e = intent.getStringArrayListExtra("shareElements");
        }
    }

    public void n(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc09c44", new Object[]{this, tabBarControllerComponent});
            return;
        }
        if (this.b == null) {
            this.b = new TabBarControllerShareElementHandler(tabBarControllerComponent);
        }
        this.b.d();
    }

    public void o(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21942d8", new Object[]{this, nVar});
            return;
        }
        List<n> list = this.d;
        if (list != null) {
            ((ArrayList) list).remove(nVar);
        }
    }

    public final void q(Activity activity, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a593aea1", new Object[]{this, activity, nVar});
            return;
        }
        n y = nVar.y("TabBarController", 1);
        if (y != null) {
            if (this.b == null) {
                this.b = new TabBarControllerShareElementHandler((TabBarControllerComponent) y.K());
            }
            this.b.c(nVar);
        } else if (!this.f) {
            this.f = true;
            ActivityCompat.setEnterSharedElementCallback(activity, new MySharedElementCallback());
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24606e03", new Object[]{this});
        } else {
            ActivityCompat.setExitSharedElementCallback((Activity) this.f12007a.M(), this.g);
        }
    }

    public void t(List<n> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8047973d", new Object[]{this, list});
        } else if (list != null) {
            ArrayList arrayList = new ArrayList(this.d);
            this.c = arrayList;
            arrayList.removeAll(list);
        }
    }
}
