package com.taobao.tao.welcome;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TabHost;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.b;
import com.taobao.tao.tbmaincontroller.TBMainController;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.TBMainFragmentLifecycle;
import com.taobao.tao.welcome.HostController;
import com.taobao.taobao.R;
import com.taobao.uikit.immersive.ITBImmersive;
import com.ut.mini.UTAnalytics;
import java.util.Iterator;
import tb.hnv;
import tb.qqg;
import tb.r3g;
import tb.ror;
import tb.sor;
import tb.srk;
import tb.t2o;
import tb.tqg;
import tb.uor;
import tb.vqg;
import tb.w35;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BController extends HostController implements ror, TabHost.OnTabChangeListener, ITBImmersive, r3g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE = "Welcome";
    private static final String TAG = "BController";
    private TBMainController mTBMainController;
    private FragmentManager.FragmentLifecycleCallbacks mFragmentLifecycleCallbacks = null;
    private Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements HostController.n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(BController bController) {
        }

        public Intent a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("3dc3fa92", new Object[]{this, intent});
            }
            return intent.putExtra("hot_startup_h5", true);
        }
    }

    static {
        t2o.a(734003204);
        t2o.a(775946327);
        t2o.a(775946319);
    }

    public BController(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        HostController.putStringExtra(appCompatActivity, "instanceType", "main");
        this.activityMonitor.b(appCompatActivity);
    }

    private void commitPageEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9090405b", new Object[]{this});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(getHost());
        }
    }

    private void handleTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbc0c88", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (!isPurelyOutLink(intent)) {
            setTheme(R.style.Theme_Welcome_Main);
            updateUri(intent);
            TBMainHost.b().d(this);
        }
    }

    public static /* synthetic */ Object ipc$super(BController bController, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 888638097:
                return new Boolean(super.onPreCreate((Bundle) objArr[0]));
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/welcome/BController");
        }
    }

    private void setupOnCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ad2095", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        handleInstanceState(bundle);
        commitPageEvent();
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null) {
            tBMainController.onCreate(bundle);
        }
    }

    private void updateUri(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8c38a7", new Object[]{this, intent});
            return;
        }
        Uri data = intent.getData();
        if (data == null || data.isOpaque()) {
            intent.setData(Uri.parse("http://m.taobao.com/index.htm"));
            return;
        }
        String stringExtra = intent.getStringExtra(BootstrapMode.EXTRA_KEY_INTENT_DATA_AFC_URL);
        if (!TextUtils.isEmpty(stringExtra)) {
            Intent intent2 = new Intent(intent);
            intent.removeExtra(BootstrapMode.EXTRA_KEY_INTENT_DATA_AFC_URL);
            intent2.setData(Uri.parse(stringExtra));
            tqg.b(new vqg(getHost(), intent2));
        }
    }

    @Override // com.taobao.tao.welcome.HostController, tb.dvd
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null) {
            return tBMainController.checkLogin();
        }
        return false;
    }

    @Override // com.taobao.tao.welcome.HostController
    public void checkPrerequisite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c84b565", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.welcome.HostController, tb.dvd
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
            return;
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null) {
            tBMainController.doLogin();
        }
    }

    @Override // tb.ror
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null) {
            return tBMainController.getCurrentFragment();
        }
        return null;
    }

    @Override // tb.ror
    public TBFragmentTabHost getFragmentTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[]{this});
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null) {
            return tBMainController.getFragmentTabHost();
        }
        return null;
    }

    @Override // tb.ror
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return Welcome.class.getName();
    }

    @Override // tb.ror
    public String getSimpleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f06186", new Object[]{this});
        }
        return Welcome.class.getSimpleName();
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean isImmersive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null) {
            return tBMainController.isImmersiveStatus();
        }
        return false;
    }

    @Override // com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null) {
            return tBMainController.isImmersiveStatus();
        }
        return false;
    }

    @Override // tb.ror
    public boolean isLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ed9676", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.welcome.HostController
    public void navigate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c554e978", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.mTBMainController == null) {
            TLog.loge(MODULE, TAG, "BaseActivity onActivityResult failed, mTBMainController is null");
            return;
        }
        TLog.loge(MODULE, TAG, "BaseActivity onActivityResult");
        this.mTBMainController.onActivityResult(i, i2, intent);
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onConfirmed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9365271c", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else if (!handleIntent(getIntent(), null)) {
            super.onCreate(bundle);
            w35.a("w-b-setupOnCreate");
            setupOnCreate(bundle);
            w35.c();
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null) {
            tBMainController.onDestroy();
            getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.mFragmentLifecycleCallbacks);
            getHost().getApplication().unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null || !tBMainController.onKeyDown(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onNewIntent(Intent intent) {
        TBMainController tBMainController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        if (!handleIntent(intent, new a(this)) && (tBMainController = this.mTBMainController) != null) {
            tBMainController.onNewIntent(intent);
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null) {
            tBMainController.onPause();
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean onPreCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34f78a91", new Object[]{this, bundle})).booleanValue();
        }
        if (getHost().isTaskRoot() || !LauncherRuntime.i(getIntent())) {
            handleTheme();
            return super.onPreCreate(bundle);
        }
        finish();
        return true;
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onRejected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebe6dff", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        } else {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null) {
            tBMainController.onResume();
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa8af", new Object[]{this, str});
            return;
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null) {
            tBMainController.onTabChanged(str);
        }
    }

    @Override // tb.r3g
    public void registerOnKeyDownListener(srk srkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc596f3", new Object[]{this, srkVar});
            return;
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null) {
            tBMainController.registerOnKeyDownListener(srkVar);
        }
    }

    @Override // tb.ror
    public void restoreTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5767576", new Object[]{this});
            return;
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null) {
            tBMainController.restoreTabHost();
        }
    }

    private void handleInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e60f2ab9", new Object[]{this, bundle});
        } else if (!isPurelyOutLink(getIntent())) {
            if (this.mFragmentLifecycleCallbacks == null) {
                this.mFragmentLifecycleCallbacks = new TBMainFragmentLifecycle() { // from class: com.taobao.tao.welcome.BController.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        if (str.hashCode() == -1791925260) {
                            super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                            return null;
                        }
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/welcome/BController$1");
                    }

                    @Override // com.taobao.tao.tbmainfragment.TBMainFragmentLifecycle, androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
                            return;
                        }
                        super.onFragmentResumed(fragmentManager, fragment);
                        HostController.putStringExtra(BController.this.getHost(), "finishReason", "fragmentResumed");
                        BController bController = BController.this;
                        bController.activityMonitor.a(bController.getHost());
                    }
                };
            }
            if (this.mActivityLifecycleCallbacks == null) {
                this.mActivityLifecycleCallbacks = new sor();
            }
            FragmentActivity fragmentActivity = (FragmentActivity) getHost();
            fragmentActivity.getApplication().registerActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
            getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.mFragmentLifecycleCallbacks, true);
            this.mTBMainController = uor.b(fragmentActivity, bundle);
            if (bundle != null) {
                Iterator<b> it = com.taobao.tao.navigation.a.t().iterator();
                while (it.hasNext()) {
                    com.android.tools.ir.runtime.a.a(it.next().f(), null);
                }
            }
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        } else {
            bundle.putBoolean(HostController.KEY_CONTROLLER_IMPL_B, true);
        }
    }

    private boolean isPurelyOutLink(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b50894e1", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null || !qqg.b(intent.getData())) {
            return false;
        }
        Uri data = intent.getData();
        if (data.isOpaque()) {
            return false;
        }
        String queryParameter = data.getQueryParameter("h5Url");
        if (!TextUtils.isEmpty(queryParameter)) {
            return !qqg.a(Uri.parse(queryParameter));
        }
        return true;
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean handleIntent(Intent intent, HostController.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3396c47", new Object[]{this, intent, nVar})).booleanValue();
        }
        if (intent == null || !qqg.b(intent.getData())) {
            return false;
        }
        TLog.loge(MODULE, "linkx", "Welcome === onCreate === start linkIn");
        if (nVar != null) {
            ((a) nVar).a(intent);
        }
        qqg.c(getHost(), intent);
        return true;
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean isFragmentSupported(String str, ISupportFragment iSupportFragment) {
        int currentTab;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e13d72ea", new Object[]{this, str, iSupportFragment})).booleanValue();
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return true;
        }
        try {
            TBFragmentTabHost fragmentTabHost = tBMainController.getFragmentTabHost();
            if (fragmentTabHost != null && (currentTab = fragmentTabHost.getCurrentTab()) != 0) {
                TLog.loge(MODULE, TAG, "current tab is not support fragment model" + currentTab);
                return false;
            } else if (hnv.b(str)) {
                return true;
            } else {
                TLog.loge(MODULE, TAG, "url's spm is not from homepage: " + str);
                return false;
            }
        } catch (Throwable th) {
            TLog.loge(MODULE, TAG, "isFragmentSupported error: " + th);
            return false;
        }
    }
}
