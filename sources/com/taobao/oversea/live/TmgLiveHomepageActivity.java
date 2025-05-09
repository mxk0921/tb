package com.taobao.oversea.live;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.oversea.live.TmgLiveHomepageActivity;
import com.taobao.oversea.live.fragment.EmptyFragment;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import tb.acq;
import tb.b02;
import tb.enr;
import tb.ix9;
import tb.q17;
import tb.ucq;
import tb.vca;
import tb.vcq;
import tb.xcq;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TmgLiveHomepageActivity extends CustomBaseActivity implements EmptyFragment.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Fragment f11437a;
    public EmptyFragment b;
    public String c = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements b02.b<Fragment> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
                return;
            }
            EmptyFragment emptyFragment = TmgLiveHomepageActivity.this.b;
            if (emptyFragment != null) {
                emptyFragment.u2(false);
            }
        }

        /* renamed from: c */
        public void b(Fragment fragment, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ca65d0a", new Object[]{this, fragment, bundle});
                return;
            }
            bundle.putString(vca.PARAM_SJSD, TmgLiveHomepageActivity.m3(TmgLiveHomepageActivity.this));
            TmgLiveHomepageActivity tmgLiveHomepageActivity = TmgLiveHomepageActivity.this;
            tmgLiveHomepageActivity.f11437a = fragment;
            tmgLiveHomepageActivity.f11437a = Fragment.instantiate(tmgLiveHomepageActivity, "com.taobao.oversea.live.homepage.ContainerFragment", bundle);
            TmgLiveHomepageActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.live_fragment_container, TmgLiveHomepageActivity.this.f11437a).commitAllowingStateLoss();
        }
    }

    static {
        AsyncTask.execute(new Runnable() { // from class: tb.wyt
            @Override // java.lang.Runnable
            public final void run() {
                TmgLiveHomepageActivity.h();
            }
        });
    }

    public static /* synthetic */ void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("264f58be", new Object[0]);
            return;
        }
        new StringBuilder("init player start: ").append(SystemClock.uptimeMillis());
        TaobaoMediaPlayer.loadLibrariesOnce(null);
        new StringBuilder("init player end: ").append(SystemClock.uptimeMillis());
    }

    public static /* synthetic */ Object ipc$super(TmgLiveHomepageActivity tmgLiveHomepageActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/live/TmgLiveHomepageActivity");
        }
    }

    public static /* synthetic */ String m3(TmgLiveHomepageActivity tmgLiveHomepageActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ce8a291", new Object[]{tmgLiveHomepageActivity});
        }
        return tmgLiveHomepageActivity.c;
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

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void o3() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d0303", new Object[]{this});
        } else if (getIntent() != null && (data = getIntent().getData()) != null) {
            this.c = data.getQueryParameter(vca.PARAM_SJSD);
            vca.f29920a = data.getQueryParameter(vca.PARAM_POST_SPM);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(null);
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        q3();
        setContentView(R.layout.activity_tmg_live_home_page);
        o3();
        p3();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        new SystemBarDecorator(this).enableImmersiveStatusBar();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        t3();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        enr.g(this).n();
    }

    @Override // com.taobao.oversea.live.fragment.EmptyFragment.c
    public void onRetry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2145010", new Object[]{this});
        } else {
            s3();
        }
    }

    public final void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(vca.PARAM_SJSD, this.c);
        this.b = new EmptyFragment();
        if (!n3()) {
            this.b.s2(this);
            getSupportFragmentManager().beginTransaction().replace(R.id.live_fragment_container, this.b).commitAllowingStateLoss();
            s3();
            return;
        }
        this.f11437a = Fragment.instantiate(getBaseContext(), "com.taobao.oversea.live.homepage.ContainerFragment", bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.live_fragment_container, this.f11437a).commitAllowingStateLoss();
    }

    public final void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
        }
    }

    public final void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0de0d1", new Object[]{this});
        } else {
            vcq.a(this).c(xcq.c().i(new q17(this)).p(true).j(ix9.h(this, "com.taobao.oversea.live.homepage.ContainerFragment").f(new a()).a()).n());
        }
    }

    public final void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f349e310", new Object[]{this});
        } else {
            enr.g(this).d();
        }
    }

    public final boolean n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4acbb8f4", new Object[]{this})).booleanValue();
        }
        ucq h = com.taobao.appbundle.a.Companion.a().h();
        return h == null || BundleInfoManager.instance().getDynamicFeatures().isEmpty() || (BundleInfoManager.instance().getDynamicFeatureInfo("tmgbusiness4androidremote") != null && h.f().contains("tmgbusiness4androidremote"));
    }
}
