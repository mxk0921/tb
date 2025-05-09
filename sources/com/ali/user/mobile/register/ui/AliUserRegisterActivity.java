package com.ali.user.mobile.register.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ali.user.mobile.app.constant.FragmentConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.newui.NewOneKeyRegFragment;
import com.ali.user.mobile.login.newui.NewRegFragment;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.register.RegistConstants;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.utils.UTConstans;
import com.ali.user.mobile.webview.WebViewActivity;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.ui.oversea.OverseaRegisterFragment;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.Map;
import java.util.Properties;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AliUserRegisterActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Fragment mCurrentFragment;
    public AppLaunchInfoResponseData mFireAppLaunchRes;
    public FragmentManager mFragmentManager;
    public RegistParam mRegistParam;
    private String token = "";
    public boolean useNewPage;

    static {
        t2o.a(70254815);
    }

    private void addControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb72403", new Object[]{this});
        } else {
            UserTrackAdapter.sendControlUT(UTConstans.PageName.UT_PAGE_REG, UTConstans.Controls.UT_BTN_BACK);
        }
    }

    public static Intent getCallingIntent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("35920e9c", new Object[]{context});
        }
        return new Intent(context, AliUserRegisterActivity.class);
    }

    private Fragment getTwoStepRegFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("fea66ec5", new Object[]{this});
        }
        if (isFromOversea()) {
            return new OverseaRegisterFragment();
        }
        return new NewRegFragment();
    }

    public static void goRegHelp(Activity activity) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd55d646", new Object[]{activity});
            return;
        }
        if (DataProviderFactory.getDataProvider().isForigenLocation()) {
            str = LoginConstant.getHelpUrlOversea();
        } else {
            str = LoginConstant.getHelpUrl();
        }
        Intent intent = new Intent(activity, WebViewActivity.class);
        intent.putExtra(WebConstant.WEBURL, str);
        activity.startActivity(intent);
    }

    private void hideAllFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32c9176", new Object[]{this});
            return;
        }
        for (String str : FragmentConstant.getRegFragmentTagList()) {
            Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(str);
            if (findFragmentByTag != null) {
                this.mFragmentManager.beginTransaction().hide(findFragmentByTag).commitAllowingStateLoss();
            }
        }
    }

    private void initParam(Intent intent) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad69721", new Object[]{this, intent});
            return;
        }
        this.mFragmentManager = getSupportFragmentManager();
        if (intent != null) {
            String dataString = intent.getDataString();
            try {
                if (!TextUtils.isEmpty(dataString)) {
                    this.token = Uri.parse(dataString).getQueryParameter(BaseJsExecutor.NAME_VERIFY_TOKEN);
                }
                RegistParam registParam = (RegistParam) intent.getParcelableExtra(RegistConstants.REGISTPARAM);
                this.mRegistParam = registParam;
                if (registParam == null) {
                    Serializable serializableExtra = intent.getSerializableExtra(RegistConstants.REGISTPARAM);
                    if (serializableExtra != null) {
                        this.mRegistParam = (RegistParam) serializableExtra;
                    }
                    RegistParam registParam2 = this.mRegistParam;
                    if (registParam2 != null && (map = registParam2.externParams) != null) {
                        String str = map.get(LoginConstant.APPLAUNCH_INFO);
                        if (!TextUtils.isEmpty(str)) {
                            this.mFireAppLaunchRes = (AppLaunchInfoResponseData) JSON.parseObject(str, AppLaunchInfoResponseData.class);
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(AliUserRegisterActivity aliUserRegisterActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 42701466:
                return new Integer(super.getLayout());
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/register/ui/AliUserRegisterActivity");
        }
    }

    public void addFragment(Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd0f4da", new Object[]{this, fragment, str});
            return;
        }
        hideAllFragment();
        Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(str);
        if (findFragmentByTag != null) {
            this.mFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        this.mCurrentFragment = fragment;
        this.mFragmentManager.beginTransaction().add(R.id.aliuser_content_frame, fragment, str).commitAllowingStateLoss();
        this.mFragmentManager.beginTransaction().show(fragment).commitAllowingStateLoss();
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

    public void changeFragmentByConfig(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e55547d", new Object[]{this, intent});
            return;
        }
        try {
            Fragment mobileRegisterFragment = getMobileRegisterFragment(intent, AliUserLogin.getAppreanceExtentions());
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    if (!TextUtils.isEmpty(this.token)) {
                        extras.putString("token", this.token);
                    }
                    RegistParam registParam = this.mRegistParam;
                    if (registParam != null) {
                        extras.putSerializable(RegistConstants.REGISTPARAM, registParam);
                    }
                    mobileRegisterFragment.setArguments(extras);
                } catch (Throwable unused) {
                }
            }
            addFragment(mobileRegisterFragment, FragmentConstant.REG_FRAGMENT_TAG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void finishCurrentAndNotify() {
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76091cc1", new Object[]{this});
        } else if (getSupportFragmentManager() == null || getSupportFragmentManager().isDestroyed() || (fragment = this.mCurrentFragment) == null || !((BaseFragment) fragment).onBackPressed()) {
            try {
                addControl();
                BroadCastHelper.sendLocalBroadCast(new Intent(LoginResActions.REG_CANCEL));
                finish();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public int getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue();
        }
        if (TextUtils.isEmpty(UserLoginActivity.getRegBgImage(this.mFireAppLaunchRes))) {
            return super.getLayout();
        }
        this.needAdjustToolbar = true;
        return R.layout.aliuser_activity_immersive;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_activity_frame_content;
    }

    public Fragment getMobileRegisterFragment(Intent intent, LoginApprearanceExtensions loginApprearanceExtensions) throws InstantiationException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("73190c4c", new Object[]{this, intent, loginApprearanceExtensions});
        }
        if (intent != null && TextUtils.equals("two_step_mobile_reg", intent.getStringExtra(RegistConstants.REG_PAGE_TYPE))) {
            return getTwoStepRegFragment();
        }
        Properties properties = new Properties();
        RegistParam registParam = this.mRegistParam;
        if (registParam != null && !TextUtils.isEmpty(registParam.source)) {
            properties.put("source", this.mRegistParam.source);
        }
        properties.put("newUser", Boolean.valueOf(TextUtils.isEmpty(SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId())));
        UserTrackAdapter.sendUT("toRegisterPage", properties);
        if ((DataProviderFactory.getDataProvider().supportOneKeyRegister() || LoginStatus.enableOnekeyLoginV2) && !isFromOversea()) {
            String str = "";
            try {
                str = intent.getStringExtra("number");
                String stringExtra = intent.getStringExtra("scene");
                if (!TextUtils.isEmpty(stringExtra)) {
                    properties.setProperty("scene", stringExtra);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (!TextUtils.isEmpty(str)) {
                NewOneKeyRegFragment newOneKeyRegFragment = new NewOneKeyRegFragment();
                UserTrackAdapter.sendUT("toSimRegisterPage", properties);
                return newOneKeyRegFragment;
            }
        }
        Fragment twoStepRegFragment = getTwoStepRegFragment();
        UserTrackAdapter.sendUT("toSmsRegisterPage", properties);
        return twoStepRegFragment;
    }

    public void goHelp() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67edd450", new Object[]{this});
            return;
        }
        if (isFromOversea()) {
            str = LoginConstant.getHelpUrlOversea();
        } else {
            str = LoginConstant.getHelpUrl();
        }
        Intent intent = new Intent(this, WebViewActivity.class);
        intent.putExtra(WebConstant.WEBURL, str);
        startActivity(intent);
    }

    public void gotoSmsCodeFragment(Intent intent) {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747e3c37", new Object[]{this, intent});
            return;
        }
        NavigatorManager instance = NavigatorManager.getInstance();
        Context applicationContext = getApplicationContext();
        if (intent == null) {
            bundle = new Bundle();
        } else {
            bundle = intent.getExtras();
        }
        instance.navToRegSMSCodePage(applicationContext, bundle);
    }

    public void gotoTwoStepMobileRegFragment(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ef306f1", new Object[]{this, intent});
            return;
        }
        try {
            Fragment twoStepRegFragment = getTwoStepRegFragment();
            twoStepRegFragment.setArguments(intent.getExtras());
            addFragment(twoStepRegFragment, FragmentConstant.REG_FRAGMENT_TAG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        try {
            if (!(getSupportActionBar() == null || AliUserLogin.getAppreanceExtentions() == null || AliUserLogin.getAppreanceExtentions().isNeedToolbar())) {
                getSupportActionBar().hide();
            }
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.setStatusBarColor(0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        changeFragmentByConfig(getIntent());
    }

    public boolean isFromOversea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54e6172", new Object[]{this})).booleanValue();
        }
        return UserLoginActivity.displayOversea(this.mFireAppLaunchRes);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        this.mCurrentFragment.onActivityResult(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            finishCurrentAndNotify();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.isLoginObserver = true;
        this.useNewPage = true;
        LoginStatus.useNewPage = true;
        try {
            initParam(getIntent());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        UserTrackAdapter.skipPage(this);
        super.onCreate(bundle);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            this.mFragmentManager = null;
            super.onDestroy();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        try {
            initParam(intent);
            initViews();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        try {
            super.onPause();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void setDefaultTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c0ad11", new Object[]{this});
        }
    }
}
