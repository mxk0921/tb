package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.containerlifecycle.GestureLayout;
import com.taobao.monitor.procedure.IPage;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.flexbox.layoutmanager.animation.shareelement.CornerRadiusTransition;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.lgs;
import tb.qol;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yml extends anl implements bod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f32194a;
    public final sll b;
    public final GestureLayout c;
    public final LinearLayout d;
    public final TNodeView e;
    public View f;
    public boolean g;
    public lgs.b h;
    public final IPage i;
    public final Activity j;
    public String k;
    public String l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements TNodeView.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinearLayout f32195a;
        public final /* synthetic */ boolean b;

        public a(LinearLayout linearLayout, boolean z) {
            this.f32195a = linearLayout;
            this.b = z;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.k
        public void F2(lgs.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1535162a", new Object[]{this, bVar});
                return;
            }
            yml.a(yml.this, bVar);
            yml.b(yml.this, this.f32195a, bVar.b, this.b);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
        public void onLayoutCompleted(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e800489", new Object[]{this, nVar});
            } else if (nVar != null && yml.c(yml.this) != null && yml.e(yml.this) != null) {
                yml ymlVar = yml.this;
                yml.g(ymlVar, yml.c(ymlVar), yml.e(yml.this));
                yml ymlVar2 = yml.this;
                yml.d(ymlVar2, yml.f(ymlVar2, null));
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
        public void onLayoutError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("834776a6", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f32196a;
        public final /* synthetic */ View b;

        public b(boolean[] zArr, View view) {
            this.f32196a = zArr;
            this.b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            boolean[] zArr = this.f32196a;
            if (!zArr[0]) {
                zArr[0] = true;
                tfs.f("PageImpl startPostponedEnterTransition complete");
                yml.this.setTransitionCompleted();
                View view = this.b;
                if (view instanceof TNodeImageView) {
                    ((TNodeImageView) view).startPostponedSetImageDrawable();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements qol.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f32197a;

        public c(yml ymlVar, Runnable runnable) {
            this.f32197a = runnable;
        }

        @Override // tb.qol.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8df164ae", new Object[]{this});
            } else {
                this.f32197a.run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Transition.TransitionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f32198a;

        public d(yml ymlVar, Runnable runnable) {
            this.f32198a = runnable;
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
            } else {
                this.f32198a.run();
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
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f32199a;

        public e(Runnable runnable) {
            this.f32199a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f32199a.run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                yml.this.finish(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(yml ymlVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                new TBPublicMenu((Activity) view.getContext()).show();
            }
        }
    }

    static {
        t2o.a(502268037);
        t2o.a(503316975);
    }

    public yml(Context context, sll sllVar, String str, boolean z, Bundle bundle) {
        if (!str.contains("tnodeTime")) {
            str = str + "&tnodeTime=" + System.nanoTime();
        }
        String str2 = str + "&tnodeFragment=true";
        this.f32194a = context;
        this.b = sllVar;
        this.url = str2;
        this.j = new Activity();
        GestureLayout gestureLayout = new GestureLayout(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TNodeView create = TNodeView.create(context, this, null, str2, null, null, new a(linearLayout, z));
        linearLayout.addView(create, new FrameLayout.LayoutParams(-1, -1));
        this.d = linearLayout;
        this.e = create;
        this.c = gestureLayout;
        this.i = uml.c().a(linearLayout, true);
        lgs.b bVar = this.h;
        if (bVar != null) {
            reu m = reu.m(context, bVar.d, bVar.b, bundle, z);
            processTransition(m, z);
            processContainer(gestureLayout, m);
            this.transition = m;
        }
        gestureLayout.setContentView(linearLayout);
    }

    public static /* synthetic */ lgs.b a(yml ymlVar, lgs.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgs.b) ipChange.ipc$dispatch("d59911ec", new Object[]{ymlVar, bVar});
        }
        ymlVar.h = bVar;
        return bVar;
    }

    public static /* synthetic */ void b(yml ymlVar, ViewGroup viewGroup, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f21dceb", new Object[]{ymlVar, viewGroup, uri, new Boolean(z)});
        } else {
            ymlVar.n(viewGroup, uri, z);
        }
    }

    public static /* synthetic */ String c(yml ymlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67af77a0", new Object[]{ymlVar});
        }
        return ymlVar.k;
    }

    public static /* synthetic */ String d(yml ymlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18bb6ed4", new Object[]{ymlVar, str});
        }
        ymlVar.k = str;
        return str;
    }

    public static /* synthetic */ String e(yml ymlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48313f7f", new Object[]{ymlVar});
        }
        return ymlVar.l;
    }

    public static /* synthetic */ String f(yml ymlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4649cf3", new Object[]{ymlVar, str});
        }
        ymlVar.l = str;
        return str;
    }

    public static /* synthetic */ void g(yml ymlVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af79fd96", new Object[]{ymlVar, str, str2});
        } else {
            ymlVar.q(str, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(yml ymlVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/containerlifecycle/PageImpl");
        }
    }

    @Override // tb.bod
    public ye<?> findSecPageWrapper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ye) ipChange.ipc$dispatch("5175a518", new Object[]{this});
        }
        return this.c.mSecPageWrapper;
    }

    @Override // tb.anl
    public void finish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d82167a", new Object[]{this, new Boolean(z)});
        } else {
            getPageContainer().x(this, z);
        }
    }

    @Override // tb.anl
    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return (Activity) this.f32194a;
    }

    @Override // tb.w4e
    public Map getFirstPageProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8efdfe9a", new Object[]{this});
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            return ((d3a) findSecPageWrapper).getFirstPageProperty();
        }
        return null;
    }

    @Override // tb.anl
    public sll getPageContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sll) ipChange.ipc$dispatch("16ff9556", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.anl
    public o getTNodeEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("d9d8faa9", new Object[]{this});
        }
        TNodeView tNodeView = this.e;
        if (tNodeView != null) {
            return tNodeView.getEngine();
        }
        return null;
    }

    @Override // tb.anl
    public Object getUTObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dbe25f7", new Object[]{this});
        }
        return this.j;
    }

    public final View h(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("954e9d38", new Object[]{this, view, new Boolean(z)});
        }
        if (getSharedElementEnterTransition() == null || !TextUtils.equals(getSharedElementEnterTransition().getClass().getSimpleName(), "MaterialContainerTransform")) {
            return view;
        }
        if (view != null) {
            this.c.setTransitionName(view.getTransitionName());
            view.setTransitionName(null);
            this.c.setTag(R.id.layout_manager_transition_shared_view, view);
        } else {
            this.c.setTransitionName(getTransitionInfo().j());
        }
        if (z) {
            getSharedElementEnterTransition().addTarget(this.c);
        }
        return this.c;
    }

    @Override // tb.anl
    public void hideActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6efde2", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            view.findViewById(R.id.fake_actionbar).setVisibility(8);
        }
    }

    public final View i(Context context, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("40d78987", new Object[]{this, context, new Boolean(z), new Integer(i)});
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.layoutmanager_fake_actionbar, (ViewGroup) null, false);
        inflate.setId(R.id.layout_manager_fake_action_bar);
        View findViewById = inflate.findViewById(R.id.fake_statusbar);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, s6o.z(context));
        }
        layoutParams.height = s6o.z(context);
        findViewById.setLayoutParams(layoutParams);
        View findViewById2 = inflate.findViewById(R.id.fake_actionbar);
        if (z) {
            findViewById2.setVisibility(8);
        }
        if (i != 1) {
            findViewById.setBackgroundColor(i);
        }
        ViewProxy.setOnClickListener(inflate.findViewById(R.id.back), new f());
        ViewProxy.setOnClickListener(inflate.findViewById(R.id.more), new g(this));
        return inflate;
    }

    @Override // tb.anl
    public boolean isFinishing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd16a70", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    /* renamed from: j */
    public ViewGroup getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5180f326", new Object[]{this});
        }
        return this.d;
    }

    /* renamed from: k */
    public ViewGroup getDecorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5298363a", new Object[]{this});
        }
        return this.c;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1c72dfd", new Object[]{this})).booleanValue();
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            return findSecPageWrapper.g();
        }
        return false;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd0e185", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.e;
        if (tNodeView != null) {
            tNodeView.onPause();
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e089e93c", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.e;
        if (tNodeView != null) {
            tNodeView.onResume();
        }
    }

    @Override // tb.hpj.b
    public void onBack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fc8977", new Object[]{this, str});
        }
    }

    @Override // tb.anl
    public void onBackButtonClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767cf6b7", new Object[]{this});
        }
    }

    @Override // tb.anl
    public boolean onBackPressed(boolean z) {
        TNodeView tNodeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d542d5", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (ye.b(null, this)) {
            return true;
        }
        if (!z || (tNodeView = this.e) == null || !tNodeView.getRenderIntercept().i(this.e)) {
            o tNodeEngine = getTNodeEngine();
            if (tNodeEngine == null || !tNodeEngine.C0()) {
                return false;
            }
            return true;
        }
        o tNodeEngine2 = getTNodeEngine();
        if (tNodeEngine2 != null) {
            tNodeEngine2.C0();
        }
        return true;
    }

    @Override // tb.anl
    public void onBeforeStartTransition(qol qolVar, boolean z) {
        n i;
        float f2;
        n nVar;
        reu reuVar;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42bd77ae", new Object[]{this, qolVar, new Boolean(z)});
        } else if (((rol) qolVar).r()) {
            if (!z && (reuVar = this.transition) != null && reuVar.f()) {
                if (getTNodeEngine() != null) {
                    view = getTNodeEngine().e0().h();
                } else {
                    view = null;
                }
                if (view != null) {
                    String transitionName = view.getTransitionName();
                    this.c.setTransitionName(transitionName + "card");
                    view.setTransitionName(null);
                    this.c.setTag(R.id.layout_manager_transition_shared_view, view);
                    return;
                }
                this.c.setTransitionName(getTransitionInfo().j() + "card");
            }
        } else if (z && akt.y() && getTNodeEngine() != null && (i = getTNodeEngine().e0().i()) != null) {
            float f3 = i.K().getViewParams().J;
            List<View> b2 = qolVar.b();
            if (b2 == null || b2.size() <= 0 || (nVar = (n) b2.get(0).getTag(R.id.layout_manager_tnode)) == null) {
                f2 = -1.0f;
            } else {
                f2 = nVar.K().getViewParams().J;
            }
            Transition sharedElementEnterTransition = getSharedElementEnterTransition();
            boolean l = rol.l(sharedElementEnterTransition, "CornerRadiusTransition");
            boolean l2 = rol.l(sharedElementEnterTransition, "MaterialContainerTransform");
            if (f2 != f3 && f2 >= 0.0f && f3 >= 0.0f && (sharedElementEnterTransition instanceof TransitionSet) && !l && !l2) {
                ((TransitionSet) sharedElementEnterTransition).addTransition(new CornerRadiusTransition(f2, f3));
            }
        }
    }

    @Override // tb.anl
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        tfs.e("PageImpl", "onCreate");
        this.i.e().a(f21.f(this.url), this.url, null);
    }

    @Override // tb.anl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        tfs.e("PageImpl", "onDestroy");
        this.i.e().onPageDestroy();
        TNodeView tNodeView = this.e;
        if (tNodeView != null) {
            tNodeView.onDestroy();
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            findSecPageWrapper.m();
        }
        c2v.getInstance().pageDestroyed(this.j);
        p0v.b(getUTObject());
    }

    @Override // tb.hpj.b
    public void onFinish(String str, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968e7fbd", new Object[]{this, str, new Float(f2)});
        }
    }

    @Override // tb.hpj.b
    public void onMove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2feb54e1", new Object[]{this, str});
        }
    }

    @Override // tb.bod
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            o();
        } else {
            m();
        }
    }

    @Override // tb.anl
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        tfs.e("PageImpl", "onPause");
        if (l()) {
            findSecPageWrapper().l();
        } else {
            m();
        }
        tfs.e("PageImpl", "pageDisAppear");
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getUTObject());
        this.i.e().onPageDisappear();
    }

    @Override // tb.anl
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        tfs.e("PageImpl", "onStart");
        if (!l()) {
            s();
        }
    }

    @Override // tb.anl
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        tfs.e("PageImpl", "onStop");
        if (!l()) {
            t();
        }
    }

    @Override // tb.anl
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
        }
    }

    public void p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b42f67a", new Object[]{this, str, str2});
            return;
        }
        o tNodeEngine = getTNodeEngine();
        if (tNodeEngine == null || tNodeEngine.d0() == null) {
            this.k = str;
            this.l = str2;
            return;
        }
        q(str, str2);
    }

    @Override // tb.anl
    public void postponedEnterTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef076e6", new Object[]{this});
        } else {
            this.c.setVisibility(4);
        }
    }

    public final void processTransition(reu reuVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811548f8", new Object[]{this, reuVar, new Boolean(z)});
        } else if (z) {
            r(reuVar);
        } else {
            startNormalTransition(reuVar);
        }
    }

    public final void q(String str, String str2) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e17157", new Object[]{this, str, str2});
            return;
        }
        if (str2 != null) {
            Uri parse = Uri.parse(str2);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            hashMap = new HashMap();
            for (String str3 : queryParameterNames) {
                hashMap.put(str3, parse.getQueryParameter(str3));
            }
        } else {
            hashMap = null;
        }
        getTNodeEngine().o1(0, getTNodeEngine().d0(), str, null, hashMap, null);
    }

    public final void requestPopLayer() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9daa36", new Object[]{this});
            return;
        }
        Intent intent = new Intent(PopLayer.ACTION_FRAGMENT_SWITCH);
        lgs.b bVar = this.h;
        if (bVar == null || TextUtils.isEmpty(bVar.i)) {
            str = "TNodePage";
        } else {
            str = this.h.i;
        }
        intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_NAME, str);
        intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_PARAM, this.url);
        LocalBroadcastManager.getInstance(this.f32194a).sendBroadcast(intent);
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3df1", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.e;
        if (tNodeView != null) {
            tNodeView.onStart();
        }
    }

    @Override // tb.w4e
    public void setFirstPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76692fd9", new Object[]{this, str});
            return;
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            ((d3a) findSecPageWrapper).setFirstPageName(str);
        }
    }

    @Override // tb.w4e
    public void setFirstPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48f12cc", new Object[]{this, map});
            return;
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            ((d3a) findSecPageWrapper).setFirstPageProperty(map);
        }
    }

    @Override // tb.anl
    public void setIsFinishing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b09d5aa", new Object[]{this});
        } else {
            this.g = true;
        }
    }

    @Override // tb.anl
    public void setNavigationBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e885d6", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.w4e
    public void setSecondPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7e79e1", new Object[]{this, str});
            return;
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            ((d3a) findSecPageWrapper).setSecondPageName(str);
        }
    }

    @Override // tb.w4e
    public void setSecondPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2309c4", new Object[]{this, map});
            return;
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            ((d3a) findSecPageWrapper).setSecondPageProperty(map);
        }
    }

    @Override // tb.anl
    public void setStatusBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14207b8", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.f;
        if (view != null) {
            view.findViewById(R.id.fake_statusbar).setBackgroundColor(i);
        }
    }

    @Override // tb.anl
    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        View view = this.f;
        if (view != null) {
            ((TextView) view.findViewById(R.id.title)).setText(str);
        }
    }

    @Override // tb.anl
    public void showActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422f6807", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            view.findViewById(R.id.fake_actionbar).setVisibility(0);
        }
    }

    @Override // tb.bod
    public void slideSecondPage(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f686d561", new Object[]{this, obj, str});
        } else {
            c3a.c(this, obj, str);
        }
    }

    @Override // tb.anl
    public void startPostponedEnterTransition(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8977076a", new Object[]{this, view});
            return;
        }
        tfs.f("PageImpl startPostponedEnterTransition enterTransitionExecuted:" + this.enterTransitionExecuted + " sharedView:" + view);
        if (!this.enterTransitionExecuted) {
            if (getTNodeEngine() != null) {
                getTNodeEngine().f12249a = true;
            }
            setExecutingEnterTransition();
            this.enterTransitionExecuted = true;
            qol pageTransition = getPageTransition();
            b bVar = new b(new boolean[]{false}, view);
            if (pageTransition != null) {
                pageTransition.a(h(view, false), new c(this, bVar));
            } else if (!getPageContainer().u() && getPageContainer().y().size() == 1 && getPageContainer().y().get(0) == this) {
                h(view, true);
                Transition enterTransition = getEnterTransition();
                if (enterTransition == null) {
                    enterTransition = getSharedElementEnterTransition();
                }
                if (enterTransition != null) {
                    enterTransition.addListener(new d(this, bVar));
                    if (akt.p2("fixTransitionCallback", true)) {
                        nwv.A0(new e(bVar), 400L);
                    }
                } else {
                    bVar.run();
                }
                getActivity().startPostponedEnterTransition();
            } else {
                bVar.run();
            }
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e101191", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.e;
        if (tNodeView != null) {
            tNodeView.onStop();
        }
    }

    public final void u(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe01d66d", new Object[]{this, view});
        } else if (view != null) {
            view.setBackgroundColor(-16777217);
        }
    }

    @Override // tb.anl
    public void onResume() {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        tfs.e("PageImpl", "onResume");
        this.i.e().onPageAppear();
        tfs.e("PageImpl", a1v.PAGE_APPEAR);
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(getUTObject());
        p0v.c(getUTObject(), true);
        if (l()) {
            findSecPageWrapper().n();
            return;
        }
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        Object uTObject = getUTObject();
        lgs.b bVar = this.h;
        if (bVar != null) {
            uri = bVar.d;
        } else {
            uri = Uri.parse(this.url);
        }
        defaultTracker.updatePageUrl(uTObject, uri);
        o();
        requestPopLayer();
    }

    public final void processContainer(GestureLayout gestureLayout, reu reuVar) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8367c679", new Object[]{this, gestureLayout, reuVar});
            return;
        }
        boolean i2 = reuVar.i();
        boolean g2 = reuVar.g();
        if (reuVar.h(this.f32194a)) {
            gestureLayout.setGestureSupportType(this, reuVar.k(reu.TRANSITION_TYPE_SECONDPAGE) ? 12 : 4);
        } else if (i2) {
            if (reuVar.k(reu.TRANSITION_TYPE_SECONDPAGE)) {
                i = 9;
            }
            gestureLayout.setGestureSupportType(this, i);
        } else if (g2) {
            gestureLayout.setGestureSupportType(this, 2);
        }
    }

    public final void r(reu reuVar) {
        String[] strArr;
        String[] strArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12ee762c", new Object[]{this, reuVar});
            return;
        }
        for (String str : reuVar.f27323a) {
            Transition d2 = reu.d(this.f32194a, str, reuVar, false);
            if (d2 != null) {
                if (TextUtils.equals(str, "share") || TextUtils.equals(str, reu.TRANSITION_TYPE_CORNER_RADIUS)) {
                    setSharedElementEnterTransition(d2);
                } else {
                    setEnterTransition(d2);
                }
            }
        }
        for (String str2 : reuVar.b) {
            Transition d3 = reu.d(this.f32194a, str2, reuVar, true);
            if (d3 != null) {
                if (TextUtils.equals(str2, "share") || TextUtils.equals(str2, reu.TRANSITION_TYPE_CORNER_RADIUS)) {
                    setSharedElementReturnTransition(d3);
                } else {
                    setExitTransition(d3);
                }
            }
        }
    }

    @Override // tb.bod
    public Pair<Boolean, Pair<Boolean, n>> supportSecondPage(MotionEvent motionEvent) {
        boolean z;
        n d0;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e6be4178", new Object[]{this, motionEvent});
        }
        o tNodeEngine = getTNodeEngine();
        n nVar = null;
        if (tNodeEngine == null || (d0 = tNodeEngine.d0()) == null) {
            z = false;
        } else {
            n e2 = q.e(d0, (int) motionEvent.getRawX(), (int) motionEvent.getRawY(), false);
            d3a a2 = c3a.a(this);
            if (!(a2 == null || e2 == null)) {
                a2.y(e2.H(xbu.KEY_TRACK_TARGET), null);
            }
            nVar = e2;
            z = true;
        }
        if (nVar == null) {
            z2 = false;
        }
        return new Pair<>(Boolean.valueOf(z2), new Pair(Boolean.valueOf(z), nVar));
    }

    public final void n(ViewGroup viewGroup, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f90cb", new Object[]{this, viewGroup, uri, new Boolean(z)});
            return;
        }
        boolean o = nwv.o(uri.getQueryParameter(gl4.CONFIG_IMMERSIVE), false);
        boolean o2 = nwv.o(uri.getQueryParameter(gl4.CONFIG_FULLTRANSPARENT), false);
        if (!o) {
            String queryParameter = uri.getQueryParameter(gl4.CONFIG_NAVBAR_HIDE);
            String queryParameter2 = uri.getQueryParameter(gl4.CONFIG_STATUSBAR_COLOR);
            int i = o ? 0 : o2 ? 1 : -1;
            if (!TextUtils.isEmpty(queryParameter2)) {
                if (queryParameter2.length() >= 2) {
                    char charAt = queryParameter2.charAt(0);
                    char charAt2 = queryParameter2.charAt(1);
                    if (charAt >= '0' && charAt <= 'f' && charAt2 >= '0' && charAt2 <= 'f') {
                        queryParameter2 = "#".concat(queryParameter2);
                    }
                }
                i = ir2.k(queryParameter2);
            }
            View i2 = i(this.f32194a, nwv.o(queryParameter, false), i);
            viewGroup.addView(i2, 0);
            this.f = i2;
        }
        if (!o2) {
            u(viewGroup);
        }
    }
}
