package com.taobao.themis.taobao.container.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment;
import com.taobao.tao.tbmainfragment.TBMainBaseFragment;
import com.taobao.taobao.R;
import com.taobao.themis.container.app.page.IContainerViewFactory;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.jas;
import tb.jpu;
import tb.mop;
import tb.mqb;
import tb.p8s;
import tb.q9s;
import tb.qgr;
import tb.rds;
import tb.t2o;
import tb.tll;
import tb.v0e;
import tb.vbs;
import tb.x5d;
import tb.y0e;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/taobao/container/fragment/TMSTBHomeFragment;", "Lcom/taobao/tao/tbmainfragment/SupportSecondaryBaseFragment;", "Ltb/tll;", "<init>", "()V", "Companion", "a", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTBHomeFragment extends SupportSecondaryBaseFragment implements tll {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public View f13754a;
    public ITMSPage c;
    public x5d d;
    public jas e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(847249432);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(847249431);
        t2o.a(839909509);
    }

    public static /* synthetic */ Object ipc$super(TMSTBHomeFragment tMSTBHomeFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
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
            case 336409145:
                return new Boolean(super.isExitAnimNeeded());
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/container/fragment/TMSTBHomeFragment");
        }
    }

    @Override // tb.tll
    public Activity getCurrentActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
        }
        return getActivity();
    }

    @Override // tb.tll
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
        }
        return this;
    }

    @Override // tb.tll
    public x5d getPageContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x5d) ipChange.ipc$dispatch("9b384128", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.tll
    public y0e getTitleBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y0e) ipChange.ipc$dispatch("f0b2774c", new Object[]{this});
        }
        return tll.a.a(this);
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return TMSTBHomeFragment.class.getSimpleName();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        jas jasVar = this.e;
        if (jasVar != null) {
            jasVar.j(i, i2, intent);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public boolean onBackPressedSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6048655e", new Object[]{this})).booleanValue();
        }
        jas jasVar = this.e;
        if (jasVar != null && jasVar.y(4, null)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.g(layoutInflater, "inflater");
        TMSLogger.b("TMSTBHomeFragment", "onCreateView");
        return this.f13754a;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TMSLogger.b("TMSTBHomeFragment", "onDestroy");
        super.onDestroy();
        jas jasVar = this.e;
        if (jasVar != null) {
            jasVar.k();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TMSLogger.b("TMSTBHomeFragment", "onPause");
        super.onPause();
        jas jasVar = this.e;
        if (jasVar != null) {
            jasVar.z();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TMSLogger.b("TMSTBHomeFragment", "onResume");
        super.onResume();
        jas jasVar = this.e;
        if (jasVar != null) {
            jasVar.A();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        jas jasVar = this.e;
        if (jasVar != null) {
            jasVar.I(bundle);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        jas jasVar = this.e;
        if (jasVar != null) {
            jasVar.B();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        jas jasVar = this.e;
        if (jasVar != null) {
            jasVar.C();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else {
            super.onViewCreated(view, bundle);
        }
    }

    public final void p2(ITMSPage iTMSPage) {
        x5d x5dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11535bc3", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        this.c = iTMSPage;
        IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) p8s.b(IContainerViewFactory.class);
        View view = null;
        if (iContainerViewFactory == null) {
            x5dVar = null;
        } else {
            Context context = getContext();
            ckf.f(context, "context");
            x5dVar = iContainerViewFactory.createPageContainer(context, iTMSPage);
        }
        this.d = x5dVar;
        IpChange ipChange2 = rds.$ipChange;
        View view2 = this.f13754a;
        if (view2 != null) {
            View findViewById = ((RelativeLayout) view2).findViewById(R.id.tms_fragment_container);
            ckf.f(findViewById, "mRootView as RelativeLay…d.tms_fragment_container)");
            RelativeLayout relativeLayout = (RelativeLayout) findViewById;
            x5d x5dVar2 = this.d;
            if (x5dVar2 != null) {
                view = x5dVar2.getView();
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
            relativeLayout.addView(view);
            iTMSPage.B(this);
            iTMSPage.s();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment
    public boolean isExitAnimNeeded() {
        bbs i;
        v0e v0eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("140d3239", new Object[]{this})).booleanValue();
        }
        if (!q9s.c0()) {
            return super.isExitAnimNeeded();
        }
        jas jasVar = this.e;
        if (jasVar == null || (i = jasVar.i()) == null || (v0eVar = (v0e) i.getExtension(v0e.class)) == null || !v0eVar.a0()) {
            return super.isExitAnimNeeded();
        }
        TMSLogger.f("TMSTBHomeFragment", "isExitAnimNeeded: false");
        return false;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (q9s.b3("themis_common_config", "enableFixFragmentKeyDown", Boolean.TRUE)) {
            jas jasVar = this.e;
            if (jasVar != null && jasVar.y(i, keyEvent)) {
                return true;
            }
        } else {
            jas jasVar2 = this.e;
            if (jasVar2 != null && jasVar2.y(4, null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        qgr.a(getContext());
        long currentTimeMillis2 = System.currentTimeMillis();
        IpChange ipChange2 = rds.$ipChange;
        super.onCreate(bundle);
        this.f13754a = View.inflate(getContext(), R.layout.tms_activity_main, null);
        FragmentActivity activity = getActivity();
        ckf.f(activity, "activity");
        View view = this.f13754a;
        ckf.d(view);
        View findViewById = view.findViewById(R.id.tms_splash_container);
        ckf.f(findViewById, "mRootView!!.findViewById….id.tms_splash_container)");
        this.e = new jas(activity, this, (ViewGroup) findViewById);
        Bundle arguments = getArguments();
        Object obj = arguments == null ? null : arguments.get("originActivityIntent");
        Intent intent = obj instanceof Intent ? (Intent) obj : null;
        if (intent != null && (data = intent.getData()) != null) {
            String stringExtra = intent.getStringExtra("traceId");
            if (stringExtra != null) {
                String uri = data.toString();
                ckf.f(uri, "url.toString()");
                vbs.i(uri, stringExtra, false, 4, null);
            }
            jas jasVar = this.e;
            if (jasVar != null) {
                String uri2 = data.toString();
                ckf.f(uri2, "url.toString()");
                mqb.a.a(jasVar, uri2, null, 2, null);
            }
            jas jasVar2 = this.e;
            if (jasVar2 != null) {
                mqb.a.b(jasVar2, null, null, 3, null);
            }
            jas jasVar3 = this.e;
            if (jasVar3 != null) {
                jasVar3.o(kotlin.collections.a.j(jpu.a("containerOnCreate", String.valueOf(currentTimeMillis)), jpu.a(mop.KEY_CONTAINER_START, String.valueOf(currentTimeMillis2))));
            }
            Intent intent2 = new Intent(PopLayer.ACTION_FRAGMENT_SWITCH);
            intent2.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_NAME, "TMSTBHomeFragment");
            intent2.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_PARAM, data.toString());
            intent2.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_NEED_ACTIVITY_PARAM, false);
            LocalBroadcastManager.getInstance(((TBMainBaseFragment) this).mActivity).sendBroadcast(intent2);
        }
    }
}
