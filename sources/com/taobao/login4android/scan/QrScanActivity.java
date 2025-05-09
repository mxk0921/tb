package com.taobao.login4android.scan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.LoginConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class QrScanActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FRAGMENT_LABEL = "aliuser_qrcode_confirm";
    private Fragment mFragment;
    public FragmentManager mFragmentManager;
    public String mScene;

    static {
        t2o.a(70254981);
    }

    private void initParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0fdfb64", new Object[]{this});
        } else if (getIntent() != null) {
            try {
                this.mScene = getIntent().getStringExtra(LoginConstant.SCAN_SCENE);
                UserTrackAdapter.skipPage(this);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(QrScanActivity qrScanActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -3136315:
                super.initViews();
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/scan/QrScanActivity");
        }
    }

    private void openConfirm(Intent intent, LoginApprearanceExtensions loginApprearanceExtensions) {
        Fragment qrScanFragment = new QrScanFragment();
        if (!(loginApprearanceExtensions == null || loginApprearanceExtensions.getFullyCustomiedScanFragment() == null)) {
            try {
                qrScanFragment = (Fragment) loginApprearanceExtensions.getFullyCustomiedScanFragment().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        openFragment(intent, qrScanFragment);
    }

    private void openFragment(Intent intent, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0de3f6", new Object[]{this, intent, fragment});
            return;
        }
        Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(FRAGMENT_LABEL);
        if (findFragmentByTag != null) {
            this.mFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        if (intent != null) {
            fragment.setArguments(intent.getExtras());
        }
        this.mFragment = fragment;
        this.mFragmentManager.beginTransaction().add(R.id.loginContainer, fragment, FRAGMENT_LABEL).commitAllowingStateLoss();
    }

    private void openFragmentById(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d112f0", new Object[]{this, intent});
        } else {
            openConfirm(intent, AliUserLogin.mAppreanceExtentions);
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

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.user_scan_activity;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        super.initViews();
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.aliuser_scan_login_title);
        }
        openFragmentById(getIntent());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        Fragment fragment = this.mFragment;
        if (fragment != null && fragment.isVisible()) {
            Fragment fragment2 = this.mFragment;
            if (fragment2 instanceof QrScanFragment) {
                ((QrScanFragment) fragment2).handleBack();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.mFragmentManager = getSupportFragmentManager();
        initParam();
        super.onCreate(bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        initParam();
        openFragmentById(intent);
    }
}
