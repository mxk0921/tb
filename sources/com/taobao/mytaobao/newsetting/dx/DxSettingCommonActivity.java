package com.taobao.mytaobao.newsetting.dx;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.m;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.monitor.procedure.IPage;
import com.taobao.mytaobao.aura.AuraFragment;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.acq;
import tb.ckf;
import tb.jpu;
import tb.mba;
import tb.pg1;
import tb.snl;
import tb.t2o;
import tb.tiv;
import tb.tz8;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/DxSettingCommonActivity;", "Lcom/taobao/tao/BaseActivity;", "<init>", "()V", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DxSettingCommonActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AuraFragment f11250a;
    public final Map<String, String> b = kotlin.collections.a.k(jpu.a("mtbSetting", "Page_MYTBSettingVC"), jpu.a("mtbGeneralSetting", "Page_TBGeneralSettingVC"), jpu.a("videoAutoPlay", "Page_TBMyAutoPlayVC"), jpu.a("aboutMytaobao", "Page_MYTBSettingVC_aboutTB"));
    public final Map<String, String> c = kotlin.collections.a.k(jpu.a("mtbSetting", "a2141.20998086.1.1"), jpu.a("mtbGeneralSetting", "a2141.20998086.3.1"), jpu.a("videoAutoPlay", "a2141.20998086.3.1"), jpu.a("aboutMytaobao", "a2141.20998086.4.1"));
    public String d;
    public String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11251a;

        public a(String str) {
            this.f11251a = str;
        }

        @Override // com.taobao.falco.m.a
        public final void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
            } else if (mVar != null) {
                mVar.N(this.f11251a);
            }
        }
    }

    static {
        t2o.a(745537840);
    }

    public DxSettingCommonActivity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(DxSettingCommonActivity dxSettingCommonActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/newsetting/dx/DxSettingCommonActivity");
        }
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

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("481d8f1e", new Object[]{this, str});
            return;
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null) {
            tz8Var.j(new a(str));
        }
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean isTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab05a0da", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void l3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d5f7de", new Object[]{this, str});
        } else if (ckf.b(str, "mtbSetting")) {
            Window window = getWindow();
            ckf.c(window, pg1.ATOM_EXT_window);
            window.setNavigationBarColor((int) 4294178552L);
        }
    }

    public final void m3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9333022", new Object[]{this, str});
            return;
        }
        IPage f = snl.f28161a.f(this);
        ckf.c(f, "PageManagerProxy.PROXY.getActivityPage(this)");
        f.d().a(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, str);
        b(str);
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.c(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().pageDisAppear(this);
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean toolbarNeedNewStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("405dd14d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        SystemBarDecorator systemBarDecorator = new SystemBarDecorator(this);
        systemBarDecorator.enableImmersiveStatusBar(true);
        systemBarDecorator.setStatusBarColor((int) tiv.INT_MASK, false);
        Window window = getWindow();
        ckf.c(window, pg1.ATOM_EXT_window);
        window.setNavigationBarColor((int) 4294178552L);
        setContentView(R.layout.mytaobao_setting_simple_for_dx);
        Intent intent = getIntent();
        ckf.c(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        Uri data = intent.getData();
        String queryParameter = data != null ? data.getQueryParameter(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE) : null;
        if (queryParameter == null) {
            finish();
            return;
        }
        m3(queryParameter);
        l3(queryParameter);
        String queryParameter2 = data.getQueryParameter("pageTitleTag");
        String r = (queryParameter2 == null || queryParameter2.length() == 0) ? null : Localization.r(queryParameter2);
        if (r == null || r.length() == 0) {
            r = Localization.q(R.string.app_taobao);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle(r);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setBackgroundDrawable(getResources().getDrawable(R.color.white));
        }
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(AuraFragment.class.getSimpleName());
        if (!(findFragmentByTag instanceof AuraFragment)) {
            findFragmentByTag = null;
        }
        AuraFragment auraFragment = (AuraFragment) findFragmentByTag;
        this.f11250a = auraFragment;
        if (auraFragment == null) {
            AuraFragment auraFragment2 = new AuraFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, queryParameter);
            bundle2.putString("dxEngineBiz", mba.BIZ_NAME);
            auraFragment2.setArguments(bundle2);
            this.f11250a = auraFragment2;
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            int i = R.id.frameLayout;
            AuraFragment auraFragment3 = this.f11250a;
            if (auraFragment3 != null) {
                beginTransaction.add(i, auraFragment3, AuraFragment.class.getSimpleName()).commit();
            } else {
                ckf.s();
                throw null;
            }
        }
        this.d = (String) ((LinkedHashMap) this.b).get(queryParameter);
        this.e = (String) ((LinkedHashMap) this.c).get(queryParameter);
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (this.d != null && this.e != null) {
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.c(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().pageAppear(this, this.d);
            UTAnalytics instance2 = UTAnalytics.getInstance();
            ckf.c(instance2, "UTAnalytics.getInstance()");
            instance2.getDefaultTracker().updatePageName(this, this.d);
            UTAnalytics instance3 = UTAnalytics.getInstance();
            ckf.c(instance3, "UTAnalytics.getInstance()");
            instance3.getDefaultTracker().updatePageProperties(this, kotlin.collections.a.k(jpu.a("spm-cnt", this.e)));
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(kotlin.collections.a.k(jpu.a("spm-url", this.e)));
        }
    }
}
