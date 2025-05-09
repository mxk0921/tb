package com.taobao.android.layoutmanager.container;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.BaseContainerFragment;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.flexbox.layoutmanager.animation.shareelement.CornerRadiusTransition;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import com.taobao.tao.flexbox.layoutmanager.module.NavigationBarModule;
import com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeCircularProgress;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.acq;
import tb.akt;
import tb.bod;
import tb.c3a;
import tb.d3a;
import tb.d7r;
import tb.dwu;
import tb.gl4;
import tb.ir2;
import tb.kxv;
import tb.lgs;
import tb.nwv;
import tb.nxb;
import tb.od0;
import tb.p0v;
import tb.s6o;
import tb.t2o;
import tb.tfs;
import tb.ufs;
import tb.xbu;
import tb.ye;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CommonContainerActivity extends BaseActivity implements gl4, NavigationBarModule.c, bod {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<String> g = Arrays.asList("android:fragments", "android:support:fragments", "androidx:fragments", "android:support:next_request_index");

    /* renamed from: a  reason: collision with root package name */
    public BaseContainerFragment f8173a;
    public TNodeCircularProgress b;
    public Uri c;
    public boolean d;
    public ViewGroup e;
    public ye<?> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements BaseContainerFragment.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.layoutmanager.container.BaseContainerFragment.b
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                CommonContainerActivity.l3(CommonContainerActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements gl4.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.gl4.b
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e14207b8", new Object[]{this, new Integer(i)});
            } else {
                CommonContainerActivity.this.getSystemBarDecorator().setStatusBarColor(i, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements gl4.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.gl4.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("939fc08f", new Object[]{this, new Integer(i)});
            } else {
                CommonContainerActivity.this.getPublicMenu().setActionViewIconColor(i);
            }
        }
    }

    static {
        t2o.a(502267986);
        t2o.a(503316939);
        t2o.a(503317307);
        t2o.a(503316975);
    }

    public static /* synthetic */ Object ipc$super(CommonContainerActivity commonContainerActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1526884382:
                super.onActivityReenter(((Number) objArr[0]).intValue(), (Intent) objArr[1]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -663187577:
                return new Boolean(super.onSupportNavigateUp());
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1874373038:
                return super.findViewById(((Number) objArr[0]).intValue());
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/CommonContainerActivity");
        }
    }

    public static /* synthetic */ void l3(CommonContainerActivity commonContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be19f7cf", new Object[]{commonContainerActivity});
        } else {
            super.finish();
        }
    }

    @Override // tb.gl4
    public gl4.a D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gl4.a) ipChange.ipc$dispatch("17a05465", new Object[]{this});
        }
        return new c();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.NavigationBarModule.c
    public void T0(int[] iArr) {
        int[] iArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5698cd9d", new Object[]{this, iArr});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i : NavigationBarModule.c.defaultMenus) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (iArr[i2] == i) {
                        break;
                    }
                    i2++;
                } else if (i == 0) {
                    arrayList.add(Integer.valueOf(R.id.uik_menu_wangxin));
                } else if (i == 1) {
                    arrayList.add(Integer.valueOf(R.id.uik_menu_home));
                } else if (i == 2) {
                    arrayList.add(Integer.valueOf(R.id.uik_menu_service));
                } else if (i == 3) {
                    arrayList.add(Integer.valueOf(R.id.uik_menu_feedback));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TBPublicMenu.removePublicMenu(((Integer) it.next()).intValue());
        }
    }

    @Override // tb.gl4
    public gl4.b Z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gl4.b) ipChange.ipc$dispatch("c864c8c5", new Object[]{this});
        }
        return new b();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // tb.gl4
    public int b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("272db4a8", new Object[]{this})).intValue();
        }
        return getPublicMenu().getCustomOverflow().getWidth();
    }

    @Override // tb.bod
    public ye<?> findSecPageWrapper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ye) ipChange.ipc$dispatch("5175a518", new Object[]{this});
        }
        return this.f;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}));
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return (T) super.findViewById(i);
        }
        return (T) viewGroup.findViewById(i);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null && findSecPageWrapper.a()) {
            return;
        }
        if (!this.d) {
            this.d = true;
            o n3 = n3();
            if (n3 != null) {
                n3.z0();
            }
            finish();
            return;
        }
        BaseContainerFragment baseContainerFragment = this.f8173a;
        if (baseContainerFragment != null) {
            baseContainerFragment.C2(new a());
        } else {
            super.finish();
        }
    }

    @Override // tb.w4e
    public Map getFirstPageProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8efdfe9a", new Object[]{this});
        }
        ye<?> yeVar = this.f;
        if (yeVar != null) {
            return ((d3a) yeVar).getFirstPageProperty();
        }
        return null;
    }

    public void hideProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713c696", new Object[]{this});
        } else {
            this.b.setVisibility(8);
        }
    }

    public final void m3(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff0d9c4", new Object[]{this, bundle});
        } else if (bundle != null) {
            for (String str : g) {
                bundle.remove(str);
            }
            Object obj = bundle.get("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (obj instanceof Bundle) {
                Bundle bundle2 = (Bundle) obj;
                List<String> list = g;
                bundle2.remove(list.get(0));
                bundle2.remove(list.get(1));
                bundle2.remove(list.get(2));
            }
        }
    }

    public o n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("d9d8faa9", new Object[]{this});
        }
        TNodeView o3 = o3();
        if (o3 != null) {
            return o3.getEngine();
        }
        return null;
    }

    public final TNodeView o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("e1b19e09", new Object[]{this});
        }
        BaseContainerFragment baseContainerFragment = this.f8173a;
        if (baseContainerFragment != null) {
            return baseContainerFragment.c;
        }
        return null;
    }

    @Override // android.app.Activity
    public void onActivityReenter(int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4fd97e2", new Object[]{this, new Integer(i), intent});
            return;
        }
        super.onActivityReenter(i, intent);
        o n3 = n3();
        if (n3 != null) {
            n3.A0(i, intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (n3() != null) {
            n3().B0(i, i2, intent);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ye<?> yeVar = this.f;
        if (yeVar != null) {
            yeVar.m();
        }
        p0v.b(this);
    }

    @Override // tb.bod
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.f8173a.J2();
        } else {
            this.f8173a.E2();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        TNodeView o3;
        ye<?> yeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (this.f != null) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        }
        BaseContainerFragment baseContainerFragment = this.f8173a;
        if (!(baseContainerFragment == null || !baseContainerFragment.B2() || (yeVar = this.f) == null)) {
            yeVar.l();
        }
        if (isFinishing() && (o3 = o3()) != null) {
            o3.onDestroy();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        ye<?> yeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        p0v.c(this, true);
        if (this.f != null) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
        }
        BaseContainerFragment baseContainerFragment = this.f8173a;
        if (baseContainerFragment != null && baseContainerFragment.B2() && (yeVar = this.f) != null) {
            yeVar.n();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        boolean onSupportNavigateUp = super.onSupportNavigateUp();
        o n3 = n3();
        if (n3 != null) {
            n3.C0();
        }
        return onSupportNavigateUp;
    }

    public void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e863f41a", new Object[]{this});
        } else {
            hideProgress();
        }
    }

    public final void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2a164f", new Object[]{this});
        } else if (nwv.h(this) && akt.P1() && nwv.N(this)) {
            postponeEnterTransition();
        }
    }

    public final void s3() {
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac0cdd5", new Object[]{this});
        } else if (this.c != null && getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");
            if ("true".equalsIgnoreCase(this.c.getQueryParameter(gl4.CONFIG_NAVBAR_HIDE))) {
                getSupportActionBar().hide();
            }
            if ("true".equalsIgnoreCase(this.c.getQueryParameter(gl4.CONFIG_NAVBAR_TRANSPARENT))) {
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
            }
            if ("true".equalsIgnoreCase(this.c.getQueryParameter(gl4.CONFIG_HIDE_NAV))) {
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
            }
            String queryParameter = this.c.getQueryParameter(gl4.CONFIG_STATUSBAR_COLOR);
            String queryParameter2 = this.c.getQueryParameter(gl4.CONFIG_FULLTRANSPARENT);
            if (TextUtils.isEmpty(queryParameter) && !"true".equals(queryParameter2) && (supportActionBar = getSupportActionBar()) != null) {
                supportActionBar.setBackgroundDrawable(new ColorDrawable(-1));
            }
        }
    }

    @Override // tb.w4e
    public void setFirstPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76692fd9", new Object[]{this, str});
            return;
        }
        ye<?> yeVar = this.f;
        if (yeVar != null) {
            ((d3a) yeVar).setFirstPageName(str);
        }
    }

    @Override // tb.w4e
    public void setFirstPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48f12cc", new Object[]{this, map});
            return;
        }
        ye<?> yeVar = this.f;
        if (yeVar != null) {
            ((d3a) yeVar).setFirstPageProperty(map);
        }
    }

    @Override // tb.w4e
    public void setSecondPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7e79e1", new Object[]{this, str});
            return;
        }
        ye<?> yeVar = this.f;
        if (yeVar != null) {
            ((d3a) yeVar).setSecondPageName(str);
        }
    }

    @Override // tb.w4e
    public void setSecondPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2309c4", new Object[]{this, map});
            return;
        }
        ye<?> yeVar = this.f;
        if (yeVar != null) {
            ((d3a) yeVar).setSecondPageProperty(map);
        }
    }

    @Override // tb.bod
    public void slideSecondPage(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f686d561", new Object[]{this, obj, str});
        } else {
            c3a.b(this, obj, str);
        }
    }

    public final void u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940e810a", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        this.f8173a = new BaseContainerFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(BaseContainerFragment.KEY_INTENT_URI, data);
        this.f8173a.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, this.f8173a).commitAllowingStateLoss();
        v3(data.toString());
    }

    public final void v3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db196753", new Object[]{this, str});
        } else if (str != null && str.contains("TNodeDemo")) {
            getWindow().setSoftInputMode(32);
        }
    }

    public final void x3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b7fce0", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && TextUtils.equals(Uri.parse(str).getQueryParameter(gl4.CONFIG_PAGE_TRACK), "false")) {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        }
    }

    public void F2(lgs.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1535162a", new Object[]{this, bVar});
            return;
        }
        Uri uri = bVar.b;
        this.c = uri;
        if (uri != null) {
            s3();
            t3();
            if (this.c.getBooleanQueryParameter(gl4.CONFIG_SEC_PAGE_ENABLE, false)) {
                d3a d3aVar = new d3a(this);
                this.f = d3aVar;
                d3aVar.w(this, -1);
                if (!"true".equalsIgnoreCase(this.c.getQueryParameter(gl4.CONFIG_NAVBAR_HIDE))) {
                    this.e.setPadding(0, dwu.a(this), 0, 0);
                }
            }
            String queryParameter = this.c.getQueryParameter(gl4.CONFIG_PAN_GESTURE);
            if (ufs.f() && TextUtils.equals(queryParameter, gl4.GESTURE_PULLRIGHTEXIT)) {
                new SlidingLayout(this).bindActivity(this);
            }
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        o.o0(this);
        Intent intent = getIntent();
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            super.onCreate(bundle);
            tfs.f("tnode uri is empty");
            finish();
            return;
        }
        String queryParameter = data.getQueryParameter("tnode");
        if (akt.J0()) {
            x3(queryParameter);
        }
        w3();
        if (akt.p2("tnode.usePadAdapt", true)) {
            d7r.a(this);
        }
        if (akt.U() && bundle != null) {
            m3(bundle);
        }
        super.onCreate(bundle);
        if (TextUtils.isEmpty(queryParameter)) {
            tfs.f("tnode query is empty, url: " + data.toString());
            finish();
            return;
        }
        nxb h = od0.D().h();
        if (h != null && h.c(this)) {
            h.disableForceDark(getWindow().getDecorView());
        }
        View inflate = getLayoutInflater().inflate(R.layout.layoutmanager_common_container_activity, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(inflate);
        this.e = (ViewGroup) findViewById(16908290);
        this.b = (TNodeCircularProgress) findViewById(R.id.activity_progress);
        if (s6o.C()) {
            s6o.D(getWindow().getDecorView());
        }
        u3();
        r3();
    }

    public void q3(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e22a14", new Object[]{this, nVar});
            return;
        }
        hideProgress();
        if (this.f != null && !"true".equalsIgnoreCase(this.c.getQueryParameter(gl4.CONFIG_NAVBAR_HIDE))) {
            this.e.setPadding(0, dwu.a(this), 0, 0);
        }
    }

    public final void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73e62f1", new Object[]{this});
        } else if (nwv.h(this) && akt.P1() && nwv.N(this)) {
            getWindow().requestFeature(12);
            n nVar = null;
            getWindow().setEnterTransition(null);
            getWindow().setExitTransition(null);
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(R.transition.tnode_shared_element_transition);
            if (n3() != null) {
                nVar = n3().d0();
            }
            float U = s6o.U(nVar, this, nwv.r(getIntent().getStringExtra(gl4.CONFIG_START_CORNER_RADIUS), 0));
            float U2 = s6o.U(nVar, this, nwv.r(getIntent().getStringExtra(gl4.CONFIG_END_CORNER_RADIUS), 0));
            if ((U > 0.0f || U2 > 0.0f) && (inflateTransition instanceof TransitionSet)) {
                ((TransitionSet) inflateTransition).addTransition(new CornerRadiusTransition(U, U2));
            }
            inflateTransition.setDuration(200L);
            inflateTransition.setInterpolator(new FastOutSlowInInterpolator());
            getWindow().setSharedElementEnterTransition(inflateTransition);
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
        o n3 = n3();
        n nVar = null;
        if (n3 == null || (d0 = n3.d0()) == null) {
            z = false;
        } else {
            n e = q.e(d0, (int) motionEvent.getRawX(), (int) motionEvent.getRawY(), false);
            d3a a2 = c3a.a(this);
            if (!(a2 == null || e == null)) {
                a2.y(e.H(xbu.KEY_TRACK_TARGET), null);
            }
            nVar = e;
            z = true;
        }
        if (nVar == null) {
            z2 = false;
        }
        return new Pair<>(Boolean.valueOf(z2), new Pair(Boolean.valueOf(z), nVar));
    }

    public final void t3() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f25099", new Object[]{this});
            return;
        }
        Uri uri = this.c;
        if (uri != null) {
            String queryParameter = uri.getQueryParameter(gl4.CONFIG_STATUSBAR_COLOR);
            boolean z = TextUtils.isEmpty(queryParameter) && !"true".equals(this.c.getQueryParameter(gl4.CONFIG_FULLTRANSPARENT));
            boolean booleanQueryParameter = this.c.getBooleanQueryParameter(gl4.CONFIG_IMMERSIVE, false);
            if (!TextUtils.isEmpty(queryParameter)) {
                if (queryParameter.length() >= 2) {
                    char charAt = queryParameter.charAt(0);
                    char charAt2 = queryParameter.charAt(1);
                    if (charAt >= '0' && charAt <= 'f' && charAt2 >= '0' && charAt2 <= 'f') {
                        queryParameter = "#".concat(queryParameter);
                    }
                }
                kxv.a(this, ir2.k(queryParameter));
            }
            if (booleanQueryParameter) {
                dwu.c(this);
            }
            if (z) {
                if (!booleanQueryParameter) {
                    i = -1;
                }
                s6o.b(this, i);
            }
        }
    }
}
