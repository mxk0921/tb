package com.taobao.login4android.membercenter.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.NetworkUtil;
import com.ali.user.mobile.webview.LoginAgreementHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.ui.AliUserBindMobileDialog;
import com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment;
import com.taobao.taobao.R;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LogoutPanelActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE = "actionType";
    public static final String PAGE_NAME = "page_login_logout";
    public static final String TAG = "login.logoutpanel";
    public Activity activity;
    public FragmentManager mFragmentManager;
    public String mProtocolTitle;
    public String mProtocolUrl;
    public String type = null;

    static {
        t2o.a(70254927);
    }

    public static /* synthetic */ void access$000(LogoutPanelActivity logoutPanelActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7edce5", new Object[]{logoutPanelActivity});
        } else {
            logoutPanelActivity.disagreeCallbck();
        }
    }

    private void disagreeCallbck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606345f5", new Object[]{this});
            return;
        }
        LoginFilterCallback loginFilterCallback = LoginAgreementHelper.sCallback;
        if (loginFilterCallback != null) {
            loginFilterCallback.onFail(-1, null);
        }
    }

    public static /* synthetic */ Object ipc$super(LogoutPanelActivity logoutPanelActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 143326307) {
            super.onBackPressed();
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/login4android/membercenter/account/LogoutPanelActivity");
        }
    }

    private void openFragmentByConfig(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a946817", new Object[]{this, intent});
            return;
        }
        if (intent != null) {
            try {
                this.type = intent.getStringExtra("actionType");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (TextUtils.equals("logout_panel", this.type)) {
            showLogoutPanel();
        } else if (TextUtils.equals("agreement", this.type)) {
            if (!(ServiceFactory.getService(NumberAuthService.class) == null || ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap() == null)) {
                this.mProtocolTitle = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolName");
                this.mProtocolUrl = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolURL");
            }
            showAgreement();
        }
    }

    private void showAgreement() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853e9994", new Object[]{this});
            return;
        }
        uiShown(UTConstant.PageName.UT_PAGE_LOGIN_BAR, "checkAgreement_dialog");
        final TaobaoRegProtocolDialogFragment rrotocolFragment = getRrotocolFragment();
        rrotocolFragment.setNeedAdaptElder(false);
        rrotocolFragment.setPageNameSpm(getPageName());
        rrotocolFragment.needAutoReg(false);
        rrotocolFragment.setNagetive(new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.LogoutPanelActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                LogoutPanelActivity.this.addControl(UTConstant.PageName.UT_PAGE_LOGIN_BAR, "Agreement_Button_Cancel");
                rrotocolFragment.dismissAllowingStateLoss();
                LogoutPanelActivity.access$000(LogoutPanelActivity.this);
                LogoutPanelActivity.this.activity.finish();
            }
        });
        rrotocolFragment.setPositive(new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.LogoutPanelActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                LogoutPanelActivity.this.addControl(UTConstant.PageName.UT_PAGE_LOGIN_BAR, "Agreement_Button_Agree");
                rrotocolFragment.dismissAllowingStateLoss();
                LoginFilterCallback loginFilterCallback = LoginAgreementHelper.sCallback;
                if (loginFilterCallback != null) {
                    loginFilterCallback.onSuccess();
                }
                LogoutPanelActivity.this.activity.finish();
            }
        });
        rrotocolFragment.setOneKeyProtocol(this.mProtocolTitle);
        rrotocolFragment.setOneKeyProtocolUrl(this.mProtocolUrl);
        rrotocolFragment.show(getSupportFragmentManager(), getPageName());
    }

    private void showLogoutPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91f7564", new Object[]{this});
            return;
        }
        uiShown("BindMobile");
        AliUserBindMobileDialog aliUserBindMobileDialog = new AliUserBindMobileDialog();
        aliUserBindMobileDialog.setLogoUrl("https://img.alicdn.com/imgextra/i2/O1CN01IA8rhl1oiDDZDtNVt_!!6000000005258-2-tps-885-435.png");
        aliUserBindMobileDialog.setPageNameSpm(getPageName());
        aliUserBindMobileDialog.setTitle(getResources().getString(R.string.aliuser_logout_title));
        aliUserBindMobileDialog.setContent(getResources().getString(R.string.aliuser_logout_message));
        aliUserBindMobileDialog.setPostiveBtnText(getResources().getString(R.string.aliuser_to_other_account));
        aliUserBindMobileDialog.setPositive(new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.LogoutPanelActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                Activity activity = LogoutPanelActivity.this.activity;
                if (activity != null && !activity.isFinishing()) {
                    UserTrackAdapter.sendUT(LogoutPanelActivity.PAGE_NAME, "Page_AccountManager_Switch");
                    AccountListComponent.openMultiAccountPage(LogoutPanelActivity.this.activity);
                    LogoutPanelActivity.this.finish();
                }
            }
        });
        aliUserBindMobileDialog.setCancelListener(new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.LogoutPanelActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    LogoutPanelActivity.this.finish();
                }
            }
        });
        aliUserBindMobileDialog.setNegativeBtnText(getString(R.string.aliuser_direct_logout));
        aliUserBindMobileDialog.setNagetive(new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.LogoutPanelActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                Activity activity = LogoutPanelActivity.this.activity;
                if (activity != null && !activity.isFinishing()) {
                    UserTrackAdapter.sendUT(LogoutPanelActivity.PAGE_NAME, "Page_AccountManager_Logout");
                    Login.logout(LogoutPanelActivity.this.activity);
                    LogoutPanelActivity.this.finish();
                }
            }
        });
        aliUserBindMobileDialog.show(this.mFragmentManager, getPageName());
    }

    public void addControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a730d", new Object[]{this, str});
        } else {
            UserTrackAdapter.control(getPageName(), str);
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

    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return PAGE_NAME;
    }

    public TaobaoRegProtocolDialogFragment getRrotocolFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoRegProtocolDialogFragment) ipChange.ipc$dispatch("3dde219b", new Object[]{this});
        }
        return new TaobaoRegProtocolDialogFragment();
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
        } else {
            openFragmentByConfig(getIntent());
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public boolean needToolbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a370e010", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if ("agreement".equals(this.type)) {
            addControl("Agreement_Button_Back");
            disagreeCallbck();
            finish();
        } else {
            super.onBackPressed();
        }
    }

    public void uiShown(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa789ae", new Object[]{this, str});
        } else {
            UserTrackAdapter.UIShown(getPageName(), str);
        }
    }

    public void addControl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144fd397", new Object[]{this, str, str2});
        } else {
            UserTrackAdapter.control(str, str2);
        }
    }

    public void uiShown(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cae3f8", new Object[]{this, str, str2});
        } else {
            UserTrackAdapter.UIShown(str, str2);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.activityIsTranslucent = true;
        this.mFragmentManager = getSupportFragmentManager();
        super.onCreate(bundle);
        setContentView(R.layout.aliuser_activity_frame_content);
        this.mViewGroup.setBackgroundColor(0);
        if (TextUtils.isEmpty(Login.getLoginToken())) {
            NetworkUtil.preFecth("logoutPanel");
        }
        this.activity = this;
    }
}
