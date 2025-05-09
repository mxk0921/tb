package com.taobao.login4android.membercenter.account;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.widget.AliUserDialog;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.LanguageUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.uti.PrivacyUtil;
import com.taobao.taobao.R;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MultiLogoutListFragment extends NewMultiAccountFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AliUserDialog mPrivacyQuitDialog;

    static {
        t2o.a(70254934);
    }

    public static /* synthetic */ void access$000(MultiLogoutListFragment multiLogoutListFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2000867", new Object[]{multiLogoutListFragment, str});
        } else {
            multiLogoutListFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$100(MultiLogoutListFragment multiLogoutListFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a281d046", new Object[]{multiLogoutListFragment, str});
        } else {
            multiLogoutListFragment.addControl(str);
        }
    }

    public static /* synthetic */ Object ipc$super(MultiLogoutListFragment multiLogoutListFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326311:
                return new Boolean(super.onBackPressed());
            case 1330549917:
                super.onAttach((Activity) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/membercenter/account/MultiLogoutListFragment");
        }
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment
    public boolean checkBeforeDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("104e6796", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment
    public boolean doDeleteThing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b7d41e8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        sendControl("Button_Delete_Click");
        doDelete(i);
        return true;
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment, com.ali.user.mobile.base.BaseLogonFragment
    public void doWhenReceivedCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a964207", new Object[]{this});
        } else {
            dismissProgress();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void finishLoginActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98cd1cc", new Object[]{this});
        } else if (getActivity() instanceof UserLoginActivity) {
            ((UserLoginActivity) getActivity()).onBackPressed();
        }
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return "page_login_multi";
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment
    public String getSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
        }
        return "switchLogin";
    }

    public void gotoLoginActivity(SessionModel sessionModel, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c02cc9a", new Object[]{this, sessionModel, new Boolean(z), new Integer(i), new Integer(i2)});
        } else if (((NewMultiAccountFragment) this).mAttachedActivity instanceof UserLoginActivity) {
            Intent intent = new Intent();
            intent.putExtra(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
            if (sessionModel != null) {
                intent.putExtra(LoginConstant.TARGET_HID, sessionModel.userId);
            }
            if (i2 != 0) {
                intent.putExtra(LoginConstant.LAUNCH_PASS_SIM, true);
            }
            ((UserLoginActivity) ((NewMultiAccountFragment) this).mAttachedActivity).switchToTargetAccountLogin(intent);
        }
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        getActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.aliuser_gray_bg));
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        this.loginMode = true;
        super.initViews(view);
        this.mTitleTV.setText(R.string.aliuser_multi_choose_account);
        View findViewById = view.findViewById(R.id.aliuser_top_padding_view);
        if (LanguageUtil.isChineseLanguage()) {
            findViewById.setVisibility(8);
            findViewById.setVisibility(8);
            return;
        }
        findViewById.setVisibility(0);
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment
    public boolean isCurrentLoginUser(SessionModel sessionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5655d0e", new Object[]{this, sessionModel})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment
    public void loginBeforeRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b05585", new Object[]{this});
        }
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment, com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e949d", new Object[]{this, activity});
            return;
        }
        super.onAttach(activity);
        ((NewMultiAccountFragment) this).mAttachedActivity = activity;
        if (activity instanceof UserLoginActivity) {
            ((UserLoginActivity) activity).supportTaobaoOrAlipay = true;
            ((UserLoginActivity) activity).setBackground(false);
        }
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment, com.ali.user.mobile.base.BaseLogonFragment, com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.isFromAccount = false;
        this.needHandleBack = true;
        super.onCreate(bundle);
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment
    public void registerSwitchUserLoginStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d70c7bc3", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment
    public void unregisterSwitchLoginReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60be44f", new Object[]{this});
        }
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment
    public void doAddThing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6696ff", new Object[]{this});
            return;
        }
        sendControl("Button_Add_Click");
        if (((NewMultiAccountFragment) this).mAttachedActivity instanceof UserLoginActivity) {
            Intent intent = new Intent();
            intent.putExtra(LoginConstant.TARGET_HID, "*");
            intent.putExtra(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
            if (!(!CommonUtil.isInABTestRegion("logout_multi_to_sim", 10000) || ServiceFactory.getService(NumberAuthService.class) == null || ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap() == null)) {
                for (Map.Entry<String, String> entry : ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().entrySet()) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
            ((UserLoginActivity) ((NewMultiAccountFragment) this).mAttachedActivity).switchToTargetAccountLogin(intent);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        if (!PrivacyUtil.isPrivacyEnable()) {
            return super.onBackPressed();
        }
        addControl("privacy_close");
        this.mPrivacyQuitDialog = AliUserDialog.Builder(getActivity()).setTitle(getString(R.string.aliuser_privacy_back_title)).setOnNegativeClickListener(getString(R.string.aliuser_privacy_exit_taobao), new AliUserDialog.NegativeClickListener() { // from class: com.taobao.login4android.membercenter.account.MultiLogoutListFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.AliUserDialog.NegativeClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                AliUserDialog aliUserDialog = MultiLogoutListFragment.this.mPrivacyQuitDialog;
                if (aliUserDialog != null) {
                    aliUserDialog.dismiss();
                }
                MultiLogoutListFragment.access$100(MultiLogoutListFragment.this, "exitTaobao");
                MultiLogoutListFragment.this.getActivity().moveTaskToBack(true);
            }
        }).setOnPositiveClickListener(getString(R.string.aliuser_privacy_back_last), new AliUserDialog.PositiveClickListener() { // from class: com.taobao.login4android.membercenter.account.MultiLogoutListFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                AliUserDialog aliUserDialog = MultiLogoutListFragment.this.mPrivacyQuitDialog;
                if (aliUserDialog != null) {
                    aliUserDialog.dismiss();
                }
                MultiLogoutListFragment.access$000(MultiLogoutListFragment.this, "backLogin");
            }
        }).build().shown();
        return true;
    }

    public boolean cacheOneKeyAndCompareSuccess(SessionModel sessionModel) {
        Map<String, String> authInfoMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d85d3ec3", new Object[]{this, sessionModel})).booleanValue();
        }
        try {
            authInfoMap = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (authInfoMap.size() == 0) {
            return false;
        }
        String str = authInfoMap.get("number");
        if (!TextUtils.isEmpty(str) && str.length() > 7) {
            String substring = str.substring(str.lastIndexOf("*") + 1);
            if (!TextUtils.isEmpty(sessionModel.loginPhone) && sessionModel.loginPhone.endsWith(substring)) {
                return true;
            }
            if (!TextUtils.isEmpty(sessionModel.mobile)) {
                if (sessionModel.mobile.endsWith(substring)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment
    public void doChangeThing(int i) {
        final SessionModel sessionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18bcda9", new Object[]{this, new Integer(i)});
            return;
        }
        sendControl("Button_Change_Click");
        if (isActivityAvaiable() && (sessionModel = this.mListAccounts.get(i)) != null) {
            sendControl("Button_Change", sessionModel.userId);
            if (!TextUtils.isEmpty(sessionModel.autoLoginToken) && !TextUtils.isEmpty(sessionModel.userId)) {
                showProgress(getResources().getString(R.string.con_ali_multi_account_login));
                autologinTarget(sessionModel);
            } else if (cacheOneKeyAndCompareSuccess(sessionModel)) {
                LoginParam loginParam = new LoginParam();
                loginParam.loginId = sessionModel.showLoginId;
                if (!TextUtils.isEmpty(sessionModel.userId)) {
                    try {
                        loginParam.hid = Long.parseLong(sessionModel.userId);
                        loginParam.isFromAccount = true;
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN, getPageName());
                loginParam.loginSourceType = LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
                loginParam.utPageName = getPageName();
                TrackingModel trackingModel = new TrackingModel();
                String pageName = getPageName();
                trackingModel.pageName = pageName;
                trackingModel.loginType = LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
                trackingModel.traceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN, pageName);
                showProgress("");
                LoginApi.mobileVerifyLogin(loginParam, trackingModel, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.taobao.login4android.membercenter.account.MultiLogoutListFragment.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.LoginTasksCallback
                    public void onCancel() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                        } else {
                            MultiLogoutListFragment.this.dismissLoading();
                        }
                    }

                    @Override // com.ali.user.mobile.callback.LoginTasksCallback
                    public void onFail(LoginException<LoginReturnData> loginException) {
                        int i2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                            return;
                        }
                        MultiLogoutListFragment.this.dismissLoading();
                        MultiLogoutListFragment multiLogoutListFragment = MultiLogoutListFragment.this;
                        SessionModel sessionModel2 = sessionModel;
                        if (loginException != null) {
                            i2 = loginException.getCode();
                        } else {
                            i2 = 0;
                        }
                        multiLogoutListFragment.gotoLoginActivity(sessionModel2, false, 2, i2);
                    }

                    @Override // com.ali.user.mobile.callback.LoginTasksCallback
                    public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        } else {
                            MultiLogoutListFragment.this.dismissLoading();
                        }
                    }
                });
            } else {
                gotoLoginActivity(sessionModel, false, 2);
            }
        }
    }

    @Override // com.taobao.login4android.membercenter.account.NewMultiAccountFragment
    public void gotoLoginActivity(SessionModel sessionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96109789", new Object[]{this, sessionModel, new Boolean(z), new Integer(i)});
        } else {
            gotoLoginActivity(sessionModel, z, i, 0);
        }
    }
}
