package com.ali.user.mobile.login.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.newui.NewOneKeyFragment;
import com.ali.user.mobile.login.presenter.BaseLoginPresenter;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.UserLoginPresenter;
import com.ali.user.mobile.model.AutoLoginCallback;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.ui.widget.AliUserDialog;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.CircleImageView;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.DeviceUtils;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.LoadImageTask;
import com.ali.user.mobile.utils.MD5Util;
import com.ali.user.mobile.utils.NetworkUtil;
import com.ali.user.mobile.utils.SharedPreferencesUtil;
import com.ali.user.mobile.utils.SiteUtil;
import com.ali.user.mobile.webview.WebViewActivity;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.activity.auth.QrScan;
import com.taobao.login4android.biz.autologin.AutoLoginParam;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.LoginController;
import com.taobao.login4android.ui.LoginCouponHelper;
import com.taobao.login4android.uti.PrivacyUtil;
import com.taobao.login4android.utils.Coordinator;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.rmo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseLoginFragment extends CommonLoginRegFragment implements View.OnClickListener, BaseLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ui.BaseLoginFragment";
    public boolean alipayInstalled;
    public boolean fingerLoginEnable;
    public long historyHid;
    public AliUserDialog mAliUserDialog;
    public BioPresenter mBioPresenter;
    public FaceLoginPresenter mFaceLoginPresenter;
    public TextView mLine;
    public LinearLayout mLineLL;
    public BaseLoginPresenter mPresenter;
    public AliUserDialog mPrivacyQuitDialog;
    public String mSource;
    public UserLoginActivity mUserLoginActivity;
    public boolean onekeyHistoryEnable;
    public boolean whatsAppBusiness;
    public boolean fromOneKey = false;
    public boolean isHistoryMode = false;
    public boolean resetToolbar = true;
    public boolean interact = false;
    public boolean whatsApp = false;
    public boolean added = false;
    public final NumberAuthService.PrefetchResultObserver baseObserver = new NumberAuthService.PrefetchResultObserver() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.ali.user.mobile.service.NumberAuthService.PrefetchResultObserver
        public void onResult(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14d0b3c2", new Object[]{this, map});
                return;
            }
            UserTrackAdapter.sendUT(BaseLoginFragment.this.getPageName(), "onObserverResult");
            try {
                BaseLoginFragment baseLoginFragment = BaseLoginFragment.this;
                if (baseLoginFragment.fromOneKey) {
                    UserTrackAdapter.sendUT(baseLoginFragment.getPageName(), "fromOneKey");
                    return;
                }
                NumberAuthService numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class);
                if (!(numberAuthService == null || map == null || map.size() == 0)) {
                    numberAuthService.removePrefetchResultObserver(this);
                    String pageName = BaseLoginFragment.this.getPageName();
                    UserTrackAdapter.sendUT(pageName, "after removeObserver,interact=" + BaseLoginFragment.this.interact);
                    BaseLoginFragment baseLoginFragment2 = BaseLoginFragment.this;
                    if (baseLoginFragment2.isHistoryMode) {
                        BaseLoginFragment.access$000(baseLoginFragment2, map);
                    } else {
                        baseLoginFragment2.directToOneKeyFragment(map);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    };

    static {
        t2o.a(70254757);
        t2o.a(70254782);
    }

    public static /* synthetic */ void access$000(BaseLoginFragment baseLoginFragment, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e9c89a", new Object[]{baseLoginFragment, map});
        } else {
            baseLoginFragment.directToHistoryOneKey(map);
        }
    }

    public static /* synthetic */ void access$100(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599f8f96", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$1000(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febf0e04", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$1100(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5caf505", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$1200(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd6dc06", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$1300(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e2c307", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ BaseActivity access$1400(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseActivity) ipChange.ipc$dispatch("ada76d02", new Object[]{baseLoginFragment});
        }
        return baseLoginFragment.mAttachedActivity;
    }

    public static /* synthetic */ void access$1500(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1fa9109", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$200(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ab7697", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$300(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7b75d98", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$400(BaseLoginFragment baseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec34499", new Object[]{baseLoginFragment, str});
        } else {
            baseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ BaseActivity access$500(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseActivity) ipChange.ipc$dispatch("98a94730", new Object[]{baseLoginFragment});
        }
        return baseLoginFragment.mAttachedActivity;
    }

    public static /* synthetic */ void access$600(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75da2b11", new Object[]{baseLoginFragment});
        } else {
            baseLoginFragment.dismissProgress();
        }
    }

    public static /* synthetic */ void access$700(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2e8052", new Object[]{baseLoginFragment});
        } else {
            baseLoginFragment.dismissProgress();
        }
    }

    public static /* synthetic */ void access$800(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c882d593", new Object[]{baseLoginFragment});
        } else {
            baseLoginFragment.dismissProgress();
        }
    }

    public static /* synthetic */ BaseActivity access$900(BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseActivity) ipChange.ipc$dispatch("1ab066ac", new Object[]{baseLoginFragment});
        }
        return baseLoginFragment.mAttachedActivity;
    }

    private void directToHistoryOneKey(Map<String, String> map) {
        BaseActivity baseActivity;
        UserLoginActivity userLoginActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42163f95", new Object[]{this, map});
        } else if (isActive() && (baseActivity = this.mAttachedActivity) != null && (baseActivity instanceof UserLoginActivity) && !this.interact && (userLoginActivity = this.mUserLoginActivity) != null && isHistoryOnekeyEnable(userLoginActivity.mHistoryAccount)) {
            UserTrackAdapter.sendUT(getPageName(), "gotoOnekey");
            Intent intent = new Intent();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                intent.putExtra(entry.getKey(), entry.getValue());
            }
            ((UserLoginActivity) this.mAttachedActivity).gotoOneKeyHistoryLoginFragment(intent);
        }
    }

    public static Map<String, String> getTraces() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bb935040", new Object[0]);
        }
        return new HashMap();
    }

    public static /* synthetic */ Object ipc$super(BaseLoginFragment baseLoginFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1824869764:
                super.onPrepareOptionsMenu((Menu) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case -1010147231:
                super.dismissAlertDialog();
                return null;
            case -880302057:
                super.doRealAction(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 143326311:
                return new Boolean(super.onBackPressed());
            case 382958558:
                super.onCreateOptionsMenu((Menu) objArr[0], (MenuInflater) objArr[1]);
                return null;
            case 385910615:
                super.alert((String) objArr[0], (String) objArr[1], (String) objArr[2], (DialogInterface.OnClickListener) objArr[3], (String) objArr[4], (DialogInterface.OnClickListener) objArr[5]);
                return null;
            case 1126824075:
                super.toast((String) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/ui/BaseLoginFragment");
        }
    }

    public void addCheckAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129c9b7f", new Object[]{this, new Integer(i)});
        } else {
            commonAddCheck(i, LoginStatus.degradeHegui, this.mProtocolCB, this.mProtocolCBXianyu);
        }
    }

    public void addMoreMenus(BottomMenuFragment bottomMenuFragment, List<com.ali.user.mobile.ui.widget.MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d59413", new Object[]{this, bottomMenuFragment, list});
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
        } else {
            super.alert(str, str2, str3, onClickListener, str4, onClickListener2);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public void alertList(String[] strArr, final DialogInterface.OnClickListener onClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c07305", new Object[]{this, strArr, onClickListener, new Boolean(z)});
        } else if (strArr != null && strArr.length != 0) {
            BottomMenuFragment bottomMenuFragment = new BottomMenuFragment();
            ArrayList arrayList = new ArrayList();
            for (final int i = 0; i < strArr.length; i++) {
                com.ali.user.mobile.ui.widget.MenuItem menuItem = new com.ali.user.mobile.ui.widget.MenuItem();
                menuItem.setText(strArr[i]);
                menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/ui/BaseLoginFragment$5");
                    }

                    @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                    public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                        } else if (BaseLoginFragment.this.isActive()) {
                            onClickListener.onClick(null, i);
                        }
                    }
                });
                arrayList.add(menuItem);
            }
            bottomMenuFragment.setMenuItems(arrayList);
            bottomMenuFragment.show(getFragmentManager(), getPageName());
        }
    }

    public void appendIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118d209a", new Object[]{this, intent});
        }
    }

    public boolean checkSMSLoginEnable(HistoryAccount historyAccount) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec3c138a", new Object[]{this, historyAccount})).booleanValue();
        }
        if (historyAccount == null || historyAccount.alipayHid != 0) {
            return false;
        }
        BaseActivity baseActivity = this.mAttachedActivity;
        if (baseActivity instanceof UserLoginActivity) {
            z = ((UserLoginActivity) baseActivity).isMobileAvailable;
        } else {
            z = true;
        }
        if (!DataProviderFactory.getDataProvider().historySecurityMobileCanLogin()) {
            return !TextUtils.isEmpty(historyAccount.loginPhone);
        }
        if (TextUtils.isEmpty(historyAccount.mobile) || !z) {
            z2 = false;
        }
        return z2;
    }

    public void directToOneKeyFragment(Map<String, String> map) {
        BaseActivity baseActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1bc611", new Object[]{this, map});
            return;
        }
        String pageName = getPageName();
        UserTrackAdapter.sendUT(pageName, "interactFirst=" + this.interact);
        if (isActive() && (baseActivity = this.mAttachedActivity) != null && (baseActivity instanceof UserLoginActivity) && !this.interact) {
            UserTrackAdapter.sendUT(getPageName(), "gotoOnekey");
            Intent intent = new Intent();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                intent.putExtra(entry.getKey(), entry.getValue());
            }
            ((UserLoginActivity) this.mAttachedActivity).gotoOneKeyLoginFragment(intent);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public void dismissAlertDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ca6061", new Object[]{this});
        } else {
            super.dismissAlertDialog();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else if (getActivity() != null && !getActivity().isFinishing()) {
            dismissProgress();
        }
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public void doRealAction(int i, boolean z) {
        HistoryAccount historyAccount;
        HistoryAccount historyAccount2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb87a817", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (i == LoginClickAction.ACTION_SEND_SMS) {
            onSendSMSAction(z);
        } else if (i == LoginClickAction.ACTION_LOGIN) {
            onLoginAction();
        } else if (i == LoginClickAction.ACTION_FACE) {
            onFaceLogin(true);
        } else if (i == LoginClickAction.ACTION_FIND_PWD) {
            UserTrackAdapter.sendControlUT(getPageName(), "Button-ForgetPwd");
            onForgetPasswordAction();
        } else if (i == LoginClickAction.ACTION_FINGER) {
            onFingerLogin();
        } else if (i == LoginClickAction.ACTION_GOOGLE_LOGIN) {
            goGoogle();
        } else if (i == LoginClickAction.ACTION_FACEBOOK_LOGIN) {
            goFacebook();
        } else if (i == LoginClickAction.ACTION_LINE_LOGIN) {
            goLine();
        } else if (i == LoginClickAction.ACTION_ONEKEY_HISTORY) {
            UserLoginActivity userLoginActivity = this.mUserLoginActivity;
            if (userLoginActivity != null && (historyAccount2 = userLoginActivity.mHistoryAccount) != null) {
                simVerify(historyAccount2);
            }
        } else if (i == LoginClickAction.ACTION_AUTO_LOGIN) {
            UserLoginActivity userLoginActivity2 = this.mUserLoginActivity;
            if (userLoginActivity2 != null && (historyAccount = userLoginActivity2.mHistoryAccount) != null) {
                autologin(historyAccount.userId, historyAccount.autologinToken);
            }
        } else {
            super.doRealAction(i, z);
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

    public String getAccountName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("680b717", new Object[]{this});
        }
        return "";
    }

    public List<View> getAdapterDeviceViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2c4c6ba1", new Object[]{this});
        }
        return null;
    }

    public BottomMenuFragment getBottomMenuFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomMenuFragment) ipChange.ipc$dispatch("61acff3c", new Object[]{this});
        }
        return new BottomMenuFragment();
    }

    public String getFindAccountText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e44708e", new Object[]{this});
        }
        return getString(R.string.aliuser_find_account);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public HistoryAccount getHistoryAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryAccount) ipChange.ipc$dispatch("81832384", new Object[]{this});
        }
        UserLoginActivity userLoginActivity = this.mUserLoginActivity;
        if (userLoginActivity != null) {
            return userLoginActivity.mHistoryAccount;
        }
        return null;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public int getLoginSite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[]{this})).intValue();
        }
        return DataProviderFactory.getDataProvider().getSite();
    }

    public Map<String, String> getOnekeyEnableMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("752fe066", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("showOnekeyHistory", String.valueOf(this.onekeyHistoryEnable));
        return hashMap;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public abstract String getPageName();

    public CommonUICallback getUICallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonUICallback) ipChange.ipc$dispatch("c4196dd", new Object[]{this});
        }
        return new CommonUICallback() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.login.CommonUICallback
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                }
            }
        };
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public void goFacebook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f179155", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UTConstant.PageName.UT_KEY_PAGE_NAME, getPageName());
        hashMap.put("alipayInstalled", String.valueOf(this.alipayInstalled));
        SNSPlatform sNSPlatform = SNSPlatform.PLATFORM_FACEBOOK;
        rmo.b(sNSPlatform, null, null);
        rmo.m(sNSPlatform, this.mAttachedActivity, hashMap);
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public void goGoogle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e20548", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UTConstant.PageName.UT_KEY_PAGE_NAME, getPageName());
        hashMap.put("alipayInstalled", String.valueOf(this.alipayInstalled));
        SNSPlatform sNSPlatform = SNSPlatform.PLATFORM_GOOGLE;
        rmo.b(sNSPlatform, DataProviderFactory.getDataProvider().getClientId(sNSPlatform.getPlatform()), null);
        rmo.m(sNSPlatform, this.mAttachedActivity, hashMap);
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public void goLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda2383", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UTConstant.PageName.UT_KEY_PAGE_NAME, getPageName());
        hashMap.put("alipayInstalled", String.valueOf(this.alipayInstalled));
        SNSPlatform sNSPlatform = SNSPlatform.PLATFORM_LINE;
        rmo.b(sNSPlatform, DataProviderFactory.getDataProvider().getClientId(sNSPlatform.getPlatform()), null);
        rmo.m(sNSPlatform, this.mAttachedActivity, hashMap);
    }

    public boolean isFingerEnable(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e555d45", new Object[]{this, historyAccount})).booleanValue();
        }
        if (historyAccount == null || TextUtils.isEmpty(historyAccount.biometricId) || ServiceFactory.getService(FingerprintService.class) == null || !((FingerprintService) ServiceFactory.getService(FingerprintService.class)).isFingerprintAvailable() || TextUtils.isEmpty(this.mUserLoginActivity.mBiometricToken)) {
            return false;
        }
        return true;
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public boolean isFromOversea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54e6172", new Object[]{this})).booleanValue();
        }
        UserLoginActivity userLoginActivity = this.mUserLoginActivity;
        if (userLoginActivity == null || !userLoginActivity.displayOversea()) {
            return false;
        }
        return true;
    }

    public boolean isHistoryMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40491ad8", new Object[]{this})).booleanValue();
        }
        return this.isHistoryMode;
    }

    public boolean isInOneKeyABTestRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3cd611a", new Object[]{this})).booleanValue();
        }
        return CommonUtil.isInABTestRegion("resumeToOnekey" + getPageName(), -1);
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public boolean needAutoReg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24fe9ffa", new Object[]{this})).booleanValue();
        }
        return true ^ this.isHistoryMode;
    }

    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            this.interact = true;
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        DeviceUtils.adapterLoginUIOnDevice(getAdapterDeviceViews());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        menu.clear();
        menuInflater.inflate(R.menu.aliuser_menu, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        NumberAuthService numberAuthService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mUserLoginActivity = null;
        super.onDestroy();
        if (this.baseObserver != null && (numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class)) != null) {
            numberAuthService.removePrefetchResultObserver(this.baseObserver);
        }
    }

    public void onFaceLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5090d360", new Object[]{this, new Boolean(z)});
        } else if (ServiceFactory.getService(FaceService.class) != null) {
            LoginParam loginParam = new LoginParam();
            UserLoginActivity userLoginActivity = this.mUserLoginActivity;
            HistoryAccount historyAccount = userLoginActivity.mHistoryAccount;
            loginParam.hid = historyAccount.userId;
            loginParam.deviceTokenKey = historyAccount.tokenKey;
            if (userLoginActivity != null) {
                loginParam.alipayInstalled = userLoginActivity.mAlipayInstall;
            }
            loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SCAN_FACE_LOGIN, getPageName());
            loginParam.loginSourceType = LoginType.LocalLoginType.SCAN_FACE_LOGIN;
            loginParam.utPageName = getPageName();
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.SCAN_FACE_LOGIN, hashMap);
            FaceLoginPresenter faceLoginPresenter = this.mFaceLoginPresenter;
            if (faceLoginPresenter == null) {
                return;
            }
            if (z) {
                faceLoginPresenter.activeFaceLogin(loginParam);
            } else {
                faceLoginPresenter.fetchScanToken(loginParam);
            }
        }
    }

    public void onFingerLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e64a28", new Object[]{this});
        } else if (ServiceFactory.getService(FingerprintService.class) != null) {
            try {
                BioPresenter bioPresenter = this.mBioPresenter;
                if (bioPresenter != null) {
                    bioPresenter.buildLoginParam();
                    this.mBioPresenter.mLoginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.BIO_LOGIN, getPageName());
                    LoginParam loginParam = this.mBioPresenter.mLoginParam;
                    loginParam.utPageName = LoginType.LocalLoginType.BIO_LOGIN;
                    loginParam.utPageName = getPageName();
                    HashMap hashMap = new HashMap();
                    hashMap.put("sdkTraceId", this.mBioPresenter.mLoginParam.sdkTraceId + "");
                    UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.BIO_LOGIN, hashMap);
                    if (getHistoryAccount() != null) {
                        this.mBioPresenter.mLoginParam.biometricId = getHistoryAccount().biometricId;
                        this.mBioPresenter.mLoginParam.hid = this.historyHid;
                    }
                    BioPresenter bioPresenter2 = this.mBioPresenter;
                    bioPresenter2.login(this.mAttachedActivity, bioPresenter2.mLoginParam, getUICallback());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void onForgetPasswordAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf966a84", new Object[]{this});
        }
    }

    public void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae3301", new Object[]{this, list, hashMap, list2});
        }
    }

    public void onLoginAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809ca427", new Object[]{this});
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.aliuser_menu_item_help) {
            openHelp();
        } else if (itemId == R.id.aliuser_menu_item_more) {
            addControl("Button-More");
            showBottomMenu();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933ab27c", new Object[]{this, menu});
            return;
        }
        int i = R.id.aliuser_menu_item_help;
        if (menu.findItem(i) != null) {
            int i2 = R.id.aliuser_menu_item_more;
            if (menu.findItem(i2) != null) {
                if (this.isHistoryMode) {
                    menu.findItem(i).setVisible(false);
                    menu.findItem(i2).setVisible(true);
                } else {
                    menu.findItem(i2).setVisible(false);
                    menu.findItem(i).setVisible(true);
                }
            }
        }
        super.onPrepareOptionsMenu(menu);
    }

    public void onPwdError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5f51", new Object[]{this});
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        UserTrackAdapter.updatePageName(getActivity(), getPageName(), getTraces());
        doInResume();
    }

    public void onSendSMSAction(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f9fd85", new Object[]{this, new Boolean(z)});
        }
    }

    public void openFindAccountPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e90cb40", new Object[]{this});
        } else if (isActivityAvaiable()) {
            addControl("findnick");
            Intent intent = new Intent(this.mAttachedActivity, WebViewActivity.class);
            intent.putExtra(WebConstant.WEBURL, LoginConstant.FIND_ACCOUNT_URL);
            startActivity(intent);
        }
    }

    public void openHelp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652b6bb2", new Object[]{this});
        } else if (isActivityAvaiable()) {
            addControl("help");
            String helpUrl = LoginConstant.getHelpUrl();
            if (isFromOversea()) {
                helpUrl = LoginConstant.getHelpUrlOversea();
            }
            Intent intent = new Intent(this.mAttachedActivity, WebViewActivity.class);
            intent.putExtra(WebConstant.WEBURL, helpUrl);
            startActivity(intent);
        }
    }

    public void pwdErrorToSMS() {
        UserLoginActivity userLoginActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab6e9da", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        CheckBox checkBox = this.mProtocolCB;
        if (checkBox != null) {
            intent.putExtra("check", checkBox.isChecked());
        }
        intent.putExtra("autoSendSms", true);
        if (isActive() && (userLoginActivity = this.mUserLoginActivity) != null) {
            userLoginActivity.gotoMobileLoginFragment(intent);
        }
    }

    public void resetActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf4faf5", new Object[]{this});
            return;
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().show();
        }
        getActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.aliuser_default_bg));
        if (getActivity() instanceof UserLoginActivity) {
            ((UserLoginActivity) getActivity()).setBackground(false);
        }
    }

    public void setLoginAccountInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53941165", new Object[]{this, str});
        }
    }

    public void setOnClickListener(View... viewArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e43b81f", new Object[]{this, viewArr});
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public void setupLineLogin(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9181a413", new Object[]{this, view});
        } else if (rmo.j()) {
            this.mLine = (TextView) view.findViewById(R.id.aliuser_recommend_line);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.aliuser_sns_line_ll);
            this.mLineLL = linearLayout;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            TextView textView = this.mLine;
            if (textView != null) {
                textView.setVisibility(0);
                this.mLine.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.24
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else {
                            BaseLoginFragment.this.addCheckAction(LoginClickAction.ACTION_LINE_LOGIN);
                        }
                    }
                });
            }
        }
    }

    public void showBottomAlipay(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3120f0b9", new Object[]{this, view});
            return;
        }
        View findViewById = view.findViewById(R.id.aliuser_sns_alipay_ll);
        TextView textView = (TextView) view.findViewById(R.id.ali_user_login_alipay_login_tv);
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.23
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else {
                        BaseLoginFragment.this.addCheckAction(LoginClickAction.ACTION_ALIPAY);
                    }
                }
            });
            AlipayAuth.showAlipay(this, textView, findViewById, true);
        }
    }

    public void showBottomMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cac9e0e", new Object[]{this});
        } else if (isActive() && isVisible()) {
            BottomMenuFragment bottomMenuFragment = getBottomMenuFragment();
            ArrayList arrayList = new ArrayList();
            com.ali.user.mobile.ui.widget.MenuItem menuItem = new com.ali.user.mobile.ui.widget.MenuItem();
            menuItem.setText(getString(R.string.aliuser_other_account_login));
            menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass8 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/ui/BaseLoginFragment$8");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                    } else if (BaseLoginFragment.this.isActive()) {
                        BaseLoginFragment.access$300(BaseLoginFragment.this, "Button-ChooseOtherAccountLogin");
                        BaseLoginFragment.this.switchAccount();
                    }
                }
            });
            if (this.isHistoryMode) {
                arrayList.add(menuItem);
            }
            com.ali.user.mobile.ui.widget.MenuItem menuItem2 = new com.ali.user.mobile.ui.widget.MenuItem();
            menuItem2.setText(getString(R.string.aliuser_reg));
            menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/ui/BaseLoginFragment$9");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                    } else if (BaseLoginFragment.this.isActive()) {
                        BaseLoginFragment.access$400(BaseLoginFragment.this, "Button-Reg");
                        RegistParam registParam = new RegistParam();
                        registParam.registSite = BaseLoginFragment.this.getLoginSite();
                        registParam.regFrom = DataProviderFactory.getDataProvider().getRegFrom();
                        BaseLoginFragment baseLoginFragment = BaseLoginFragment.this;
                        registParam.source = baseLoginFragment.mSource;
                        try {
                            if (baseLoginFragment.mUserLoginActivity.fireAppLaunchRes != null) {
                                HashMap hashMap = new HashMap();
                                registParam.externParams = hashMap;
                                hashMap.put(LoginConstant.APPLAUNCH_INFO, JSON.toJSONString(BaseLoginFragment.this.mUserLoginActivity.fireAppLaunchRes));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openRegisterPage(BaseLoginFragment.access$500(BaseLoginFragment.this), registParam);
                    }
                }
            });
            if (AliUserLogin.getAppreanceExtentions() == null || AliUserLogin.getAppreanceExtentions().needRegister()) {
                arrayList.add(menuItem2);
            }
            com.ali.user.mobile.ui.widget.MenuItem menuItem3 = new com.ali.user.mobile.ui.widget.MenuItem();
            menuItem3.setText(getString(R.string.aliuser_menu_help));
            menuItem3.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem3) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass10 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/ui/BaseLoginFragment$10");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem4});
                    } else if (BaseLoginFragment.this.isActive()) {
                        BaseLoginFragment.this.openHelp();
                    }
                }
            });
            arrayList.add(menuItem3);
            addMoreMenus(bottomMenuFragment, arrayList);
            bottomMenuFragment.setMenuItems(arrayList);
            bottomMenuFragment.show(getFragmentManager(), getPageName());
        }
    }

    public void showBottomMenuForFirstPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e264b44", new Object[]{this});
            return;
        }
        BottomMenuFragment bottomMenuFragment = getBottomMenuFragment();
        ArrayList arrayList = new ArrayList();
        com.ali.user.mobile.ui.widget.MenuItem menuItem = new com.ali.user.mobile.ui.widget.MenuItem();
        menuItem.setText(getString(R.string.aliuser_menu_help));
        menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass20 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/ui/BaseLoginFragment$20");
            }

            @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
            public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                } else if (BaseLoginFragment.this.isActive()) {
                    BaseLoginFragment.this.openHelp();
                }
            }
        });
        com.ali.user.mobile.ui.widget.MenuItem menuItem2 = new com.ali.user.mobile.ui.widget.MenuItem();
        menuItem2.setText(getFindAccountText());
        menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass21 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/ui/BaseLoginFragment$21");
            }

            @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
            public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                    return;
                }
                BaseLoginFragment.access$1500(BaseLoginFragment.this, "findnick");
                if (BaseLoginFragment.this.isActive()) {
                    BaseLoginFragment.this.openFindAccountPage();
                }
            }
        });
        arrayList.add(menuItem);
        arrayList.add(menuItem2);
        addMoreMenus(bottomMenuFragment, arrayList);
        bottomMenuFragment.setMenuItems(arrayList);
        bottomMenuFragment.setMenuTitle(getString(R.string.aliuser_login_more_func));
        bottomMenuFragment.show(getFragmentManager(), getPageName());
    }

    public void showBottomOther(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01bb783", new Object[]{this, view});
        } else if (view != null) {
            View findViewById = view.findViewById(R.id.aliuser_other_divider);
            View findViewById2 = view.findViewById(R.id.aliuser_other_tv);
            if (findViewById != null && findViewById2 != null) {
                findViewById.setVisibility(0);
                ViewProxy.setOnClickListener(findViewById2, new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.22
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else {
                            BaseLoginFragment.this.switchAccount();
                        }
                    }
                });
            }
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        } else {
            showProgress("");
        }
    }

    public void showPushLogoutAlertIfHas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f66ac9", new Object[]{this});
        } else if (getContext() != null) {
            if (System.currentTimeMillis() - ((Long) SharedPreferencesUtil.getData(getContext().getApplicationContext(), "pushLogoutTime", 0L)).longValue() < 60000) {
                String str = (String) SharedPreferencesUtil.getData(getContext().getApplicationContext(), "pushLogoutContent", "");
                if (!TextUtils.isEmpty(str)) {
                    alert("", str, getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else {
                                BaseLoginFragment.this.dismissAlertDialog();
                            }
                        }
                    }, null, null);
                }
            }
            Coordinator.execute(new Runnable() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        SharedPreferencesUtil.saveData(BaseLoginFragment.this.getContext().getApplicationContext(), "pushLogoutContent", "");
                    }
                }
            });
        }
    }

    public void showQrLogin(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5caf080", new Object[]{this, view});
        } else if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.aliuser_qrlogin_tv);
            View findViewById = view.findViewById(R.id.aliuser_qrlogin_divider);
            if (textView != null) {
                setOnClickListener(textView);
                QrScan.showQrScan(this.mUserLoginActivity, textView, findViewById);
            }
        }
    }

    public void switchToPwdLogin(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5e6b3f", new Object[]{this, loginParam});
            return;
        }
        Intent intent = new Intent();
        CheckBox checkBox = this.mProtocolCB;
        if (checkBox != null) {
            intent.putExtra("check", checkBox.isChecked());
        }
        if (loginParam != null) {
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
        }
        this.mUserLoginActivity.gotoPwdLoginFragment(intent);
    }

    public void switchToSmsLogin(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27dad5a3", new Object[]{this, loginParam});
            return;
        }
        Intent intent = new Intent();
        CheckBox checkBox = this.mProtocolCB;
        if (checkBox != null) {
            intent.putExtra("check", checkBox.isChecked());
        }
        if (loginParam != null) {
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
        }
        this.mUserLoginActivity.gotoMobileLoginFragment(intent);
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void toast(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else {
            super.toast(str, i);
        }
    }

    public void updateAvatar(String str) {
        CircleImageView circleImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eeb3893", new Object[]{this, str});
            return;
        }
        try {
            View view = this.mFragmentView;
            if (view != null && (circleImageView = (CircleImageView) view.findViewById(R.id.aliuser_login_avatar)) != null && !TextUtils.isEmpty(str)) {
                Bitmap bitmapFromMemoryCache = ImageUtil.getBitmapFromMemoryCache(MD5Util.getMD5(str));
                if (bitmapFromMemoryCache != null) {
                    circleImageView.setImageBitmap(bitmapFromMemoryCache);
                } else {
                    new LoadImageTask(DataProviderFactory.getApplicationContext(), (ImageView) circleImageView, "HeadImages", 160).execute(str);
                    circleImageView.setImageResource(R.drawable.aliuser_placeholder);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void autologin(final long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c15b4d", new Object[]{this, new Long(j), str});
            return;
        }
        AutoLoginParam autoLoginParam = new AutoLoginParam();
        autoLoginParam.token = str;
        autoLoginParam.userId = String.valueOf(j);
        autoLoginParam.site = SiteUtil.getDefaultLoginSite();
        autoLoginParam.apiRefer = ApiReferer.generateApiReferer();
        autoLoginParam.needBroadcast = true;
        showProgress("");
        UserTrackAdapter.sendUT(getPageName(), UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.AUTO_LOGIN, null);
        LoginController.getInstance().doAutoLoginWithCallback(autoLoginParam, new AutoLoginCallback() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.AutoLoginCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    return;
                }
                BaseLoginFragment.access$600(BaseLoginFragment.this);
                UserTrackAdapter.sendUT(BaseLoginFragment.this.getPageName(), UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.AUTO_LOGIN, null);
            }

            @Override // com.ali.user.mobile.model.AutoLoginCallback
            public void onBizFail(int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("772d31f4", new Object[]{this, new Integer(i), str2});
                    return;
                }
                BaseLoginFragment.access$700(BaseLoginFragment.this);
                Bundle bundle = new Bundle();
                LoginParam loginParam = new LoginParam();
                loginParam.hid = j;
                bundle.putString(LoginConstant.LOGINPARAM, JSON.toJSONString(loginParam));
                bundle.putBoolean(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
                bundle.putBoolean(LoginConstant.FORCE_NOT_FAST, true);
                LoginController.getInstance().userLogin(true, true, bundle);
                UserTrackAdapter.sendUT(BaseLoginFragment.this.getPageName(), UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "", LoginType.LocalLoginType.AUTO_LOGIN, null);
            }

            @Override // com.ali.user.mobile.model.AutoLoginCallback
            public void onNetworkError() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("933d2000", new Object[]{this});
                    return;
                }
                BaseLoginFragment.access$800(BaseLoginFragment.this);
                BaseLoginFragment baseLoginFragment = BaseLoginFragment.this;
                baseLoginFragment.toast(BaseLoginFragment.access$900(baseLoginFragment).getString(R.string.aliuser_network_error), 0);
                UserTrackAdapter.sendUT(BaseLoginFragment.this.getPageName(), UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "", LoginType.LocalLoginType.AUTO_LOGIN, null);
            }
        });
    }

    public void doInResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ead564", new Object[]{this});
            return;
        }
        UserTrackAdapter.sendUT(getPageName(), "doInResume");
        if (!isInOneKeyABTestRegion()) {
            UserTrackAdapter.sendUT(getPageName(), "miss_orange");
        } else if (this.interact) {
            UserTrackAdapter.sendUT(getPageName(), "has_interact");
        } else if (this.fromOneKey) {
            UserTrackAdapter.sendUT(getPageName(), "fromOneKey");
        } else if (this.mUserLoginActivity != null) {
            if (!TextUtils.isEmpty(NetworkUtil.getMaskMobile())) {
                UserTrackAdapter.sendUT(getPageName(), "has_maskMobile");
                return;
            }
            if (this.isHistoryMode) {
                HistoryAccount historyAccount = this.mUserLoginActivity.mHistoryAccount;
                if (historyAccount != null) {
                    if (TextUtils.isEmpty(UserLoginActivity.getMobileFromHistory(historyAccount))) {
                        UserTrackAdapter.sendUT(getPageName(), "has_no_mobile");
                        return;
                    } else if (!checkSMSLoginEnable(this.mUserLoginActivity.mHistoryAccount)) {
                        UserTrackAdapter.sendUT(getPageName(), "check_mobile_failed");
                        return;
                    }
                } else {
                    return;
                }
            }
            NumberAuthService numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class);
            if (numberAuthService != null) {
                numberAuthService.preFecth(getPageName());
                if (!this.added) {
                    UserTrackAdapter.sendUT(getPageName(), "addObserver");
                    numberAuthService.addPrefetchResultObserver(this.baseObserver);
                    this.added = true;
                    return;
                }
                UserTrackAdapter.sendUT(getPageName(), "hasObserver");
            }
        }
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.mUserLoginActivity = (UserLoginActivity) getActivity();
        super.initViews(view);
        LoginCouponHelper.handleCoupon(view, this.mUserLoginActivity, false);
        AlipayAuth.supportAlipay(getActivity(), new CommonCallback() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                } else {
                    BaseLoginFragment.this.alipayInstalled = false;
                }
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                } else {
                    BaseLoginFragment.this.alipayInstalled = true;
                }
            }
        });
        try {
            if (this.resetToolbar) {
                resetActionBar();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            DeviceUtils.adapterLoginUIOnDevice(getAdapterDeviceViews());
        } catch (Throwable th2) {
            LoginTLogAdapter.e(TAG, "init view error", th2);
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
        this.mPrivacyQuitDialog = AliUserDialog.Builder(getActivity()).setTitle(getString(R.string.aliuser_privacy_back_title)).setOnNegativeClickListener(getString(R.string.aliuser_privacy_exit_taobao), new AliUserDialog.NegativeClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.AliUserDialog.NegativeClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                AliUserDialog aliUserDialog = BaseLoginFragment.this.mPrivacyQuitDialog;
                if (aliUserDialog != null) {
                    aliUserDialog.dismiss();
                }
                BaseLoginFragment.access$200(BaseLoginFragment.this, "exitTaobao");
                if (BaseLoginFragment.this.getActivity() != null) {
                    BaseLoginFragment.this.getActivity().moveTaskToBack(true);
                }
            }
        }).setOnPositiveClickListener(getString(R.string.aliuser_privacy_back_last), new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                AliUserDialog aliUserDialog = BaseLoginFragment.this.mPrivacyQuitDialog;
                if (aliUserDialog != null) {
                    aliUserDialog.dismiss();
                }
                BaseLoginFragment.access$100(BaseLoginFragment.this, "backLogin");
            }
        }).build().shown();
        return true;
    }

    public void simVerify(final HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbb3ddb", new Object[]{this, historyAccount});
            return;
        }
        LoginParam loginParam = new LoginParam();
        loginParam.loginId = historyAccount.userInputName;
        loginParam.hid = historyAccount.userId;
        loginParam.isFromAccount = true;
        loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN, getPageName());
        loginParam.loginSourceType = LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
        loginParam.utPageName = getPageName();
        TrackingModel trackingModel = new TrackingModel();
        String pageName = getPageName();
        trackingModel.pageName = pageName;
        trackingModel.loginType = LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
        trackingModel.traceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN, pageName);
        showProgress("");
        LoginApi.mobileVerifyLogin(loginParam, trackingModel, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onCancel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                } else {
                    BaseLoginFragment.this.dismissLoading();
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onFail(LoginException<LoginReturnData> loginException) {
                int i;
                int i2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    return;
                }
                BaseLoginFragment.this.dismissLoading();
                RpcResponse<LoginReturnData> orinResponse = loginException.getOrinResponse();
                if (CommonUtil.isInABTestRegion("handleSimError", 10000) && (loginException.getCode() == 3013 || loginException.getCode() == 14076 || (i2 = orinResponse.code) == 3013 || i2 == 14076)) {
                    BaseLoginFragment baseLoginFragment = BaseLoginFragment.this;
                    HistoryAccount historyAccount2 = historyAccount;
                    baseLoginFragment.sendSms(historyAccount2.userId, historyAccount2.mobile);
                } else if (!CommonUtil.isInABTestRegion("handleSimError", 10000) || orinResponse.returnValue == null || !(loginException.getCode() == 14044 || loginException.getCode() == 14163 || (i = orinResponse.code) == 14044 || i == 14163)) {
                    BaseLoginFragment baseLoginFragment2 = BaseLoginFragment.this;
                    baseLoginFragment2.toast(baseLoginFragment2.getString(R.string.aliuser_onekey_login_fail_tip2), 1);
                } else {
                    BaseLoginFragment.this.sendSms(historyAccount.userId, orinResponse.returnValue.mobile);
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else {
                    BaseLoginFragment.this.dismissLoading();
                }
            }
        });
    }

    public void switchAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e695860", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, true);
        CheckBox checkBox = this.mProtocolCB;
        if (checkBox != null) {
            intent.putExtra("check", checkBox.isChecked());
        }
        appendIntent(intent);
        UserLoginActivity userLoginActivity = this.mUserLoginActivity;
        if (userLoginActivity != null) {
            if (userLoginActivity.mHistoryAccount != null) {
                boolean historyMatchMask = userLoginActivity.historyMatchMask();
                if (!TextUtils.isEmpty(NetworkUtil.getMaskMobile()) && !(this instanceof NewOneKeyFragment) && !historyMatchMask && CommonUtil.isInABTestRegion("rollback_history_to_first_onekey", 10000)) {
                    Intent intent2 = new Intent();
                    for (Map.Entry<String, String> entry : ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().entrySet()) {
                        intent2.putExtra(entry.getKey(), entry.getValue());
                    }
                    ((UserLoginActivity) this.mAttachedActivity).gotoOneKeyLoginFragment(intent2);
                    return;
                }
            }
            if ("sms".equals(this.mUserLoginActivity.otherLoginType)) {
                intent.putExtra(LoginConstant.CURRENT_LOGIN_MODE_STATE, LoginModeState.SMS_LOGIN.name());
            } else if ("pwd".equals(this.mUserLoginActivity.otherLoginType)) {
                intent.putExtra(LoginConstant.CURRENT_LOGIN_MODE_STATE, LoginModeState.PASSWORD.name());
            }
            this.mUserLoginActivity.switchToRecommendLogin(intent);
        }
    }

    public boolean isHistoryOnekeyEnable(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2ec12f5", new Object[]{this, historyAccount})).booleanValue();
        }
        if (checkSMSLoginEnable(historyAccount) && historyAccount != null) {
            String mobileFromHistory = UserLoginActivity.getMobileFromHistory(historyAccount);
            String maskMobile = NetworkUtil.getMaskMobile();
            boolean isCompareSuccess = UserLoginActivity.isCompareSuccess(mobileFromHistory, maskMobile);
            if (!TextUtils.isEmpty(maskMobile) && !(this instanceof NewOneKeyFragment) && isCompareSuccess && CommonUtil.isInABTestRegion("rollback_history_to_onekey", 10000)) {
                UserTrackAdapter.sendUT(getPageName(), "canOnekeyHistory");
                return true;
            }
        }
        return false;
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        LoginTLogAdapter.e(TAG, "onCreate: " + getPageName());
        this.needHandleBack = true;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                this.fromOneKey = arguments.getBoolean(LoginConstant.FROM_ONE_KEY, false);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendSms(long r11, java.lang.String r13) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.ali.user.mobile.login.ui.BaseLoginFragment.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001d
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r11)
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r1] = r10
            r11[r0] = r3
            r12 = 2
            r11[r12] = r13
            java.lang.String r12 = "3f3edfd6"
            r2.ipc$dispatch(r12, r11)
            return
        L_0x001d:
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 == 0) goto L_0x0024
            return
        L_0x0024:
            com.ali.user.mobile.model.LoginParam r2 = new com.ali.user.mobile.model.LoginParam
            r2.<init>()
            com.ali.user.mobile.login.presenter.UserMobileLoginPresenter r9 = new com.ali.user.mobile.login.presenter.UserMobileLoginPresenter
            r9.<init>(r10, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 != 0) goto L_0x004a
            java.lang.String r2 = "-"
            boolean r3 = r13.contains(r2)
            if (r3 == 0) goto L_0x004a
            java.lang.String[] r2 = r13.split(r2)
            int r3 = r2.length
            if (r3 <= r0) goto L_0x004a
            r13 = r2[r1]
            r0 = r2[r0]
            r8 = r13
            r4 = r0
            goto L_0x004e
        L_0x004a:
            java.lang.String r0 = "86"
            r4 = r13
            r8 = r0
        L_0x004e:
            r6 = 0
            java.lang.String r7 = "CN"
            r5 = 0
            r3 = r9
            r3.buildSMSLoginParam(r4, r5, r6, r7, r8)
            com.ali.user.mobile.model.LoginParam r13 = r9.getLoginParam()
            java.lang.String r0 = r10.getPageName()
            r13.utPageName = r0
            com.ali.user.mobile.model.LoginParam r13 = r9.getLoginParam()
            java.lang.String r0 = "smsLogin"
            r13.loginSourceType = r0
            com.ali.user.mobile.model.LoginParam r13 = r9.getLoginParam()
            java.lang.String r2 = r10.getPageName()
            java.lang.String r2 = com.ali.user.mobile.log.ApiReferer.generateTraceId(r0, r2)
            r13.sdkTraceId = r2
            com.ali.user.mobile.model.LoginParam r13 = r9.getLoginParam()
            r13.resendAlert = r1
            com.ali.user.mobile.model.LoginParam r13 = r9.getLoginParam()
            r13.hid = r11
            com.ali.user.mobile.login.ui.UserLoginActivity r11 = r10.mUserLoginActivity
            if (r11 == 0) goto L_0x0091
            com.ali.user.mobile.model.LoginParam r11 = r9.getLoginParam()
            com.ali.user.mobile.login.ui.UserLoginActivity r12 = r10.mUserLoginActivity
            boolean r12 = r12.mAlipayInstall
            r11.alipayInstalled = r12
        L_0x0091:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            com.ali.user.mobile.model.LoginParam r13 = r9.getLoginParam()
            java.lang.String r13 = r13.sdkTraceId
            r12.append(r13)
            java.lang.String r13 = ""
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r1 = "sdkTraceId"
            r11.put(r1, r12)
            java.lang.String r12 = r10.getPageName()
            java.lang.String r1 = "smsAction"
            com.ali.user.mobile.log.UserTrackAdapter.control(r12, r1, r13, r0, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "action=smsAction;biz=smsLogin;page="
            r11.<init>(r12)
            java.lang.String r12 = r10.getPageName()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "Page_Member_Login"
            java.lang.String r13 = "loginMonitorPoint"
            com.ali.user.mobile.log.AppMonitorAdapter.commitSuccess(r12, r13, r11)
            com.ali.user.mobile.base.ui.BaseActivity r11 = r10.mAttachedActivity
            com.ali.user.mobile.model.LoginParam r12 = r9.getLoginParam()
            com.ali.user.mobile.login.ui.BaseLoginFragment$14 r13 = new com.ali.user.mobile.login.ui.BaseLoginFragment$14
            r13.<init>()
            r9.sendSMS(r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.ui.BaseLoginFragment.sendSms(long, java.lang.String):void");
    }

    public void showFindPasswordAlert(final LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse, final UserLoginPresenter userLoginPresenter, final EditText editText, final ImageView imageView) {
        String str;
        String str2;
        AliUserDialog.PositiveClickListener positiveClickListener;
        String str3;
        UserLoginActivity userLoginActivity;
        final boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1260baab", new Object[]{this, loginParam, rpcResponse, userLoginPresenter, editText, imageView});
            return;
        }
        String string = getResources().getString(R.string.aliuser_common_ok);
        String str4 = "";
        if (rpcResponse != null && !TextUtils.isEmpty(rpcResponse.codeGroup) && loginParam != null && TextUtils.equals(ApiConstants.CodeGroup.PWD_CAN_SMS_ERROR, rpcResponse.codeGroup)) {
            LoginReturnData loginReturnData = rpcResponse.returnValue;
            if (loginReturnData == null || loginReturnData.extMap == null) {
                str2 = str4;
                str = str2;
            } else {
                str2 = loginReturnData.extMap.get("dialogTitle");
                str = rpcResponse.returnValue.extMap.get("dialogContent");
            }
            str3 = getResources().getString(R.string.aliuser_login_sms_login2);
            string = getResources().getString(R.string.aliuser_cancel);
            positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    AliUserDialog aliUserDialog = BaseLoginFragment.this.mAliUserDialog;
                    if (aliUserDialog != null) {
                        aliUserDialog.dismiss();
                    }
                    BaseLoginFragment.access$1000(BaseLoginFragment.this, "Button-Nick-Sms-Login");
                    BaseLoginFragment.this.pwdErrorToSMS();
                }
            };
        } else if (rpcResponse == null || TextUtils.isEmpty(rpcResponse.codeGroup) || loginParam == null || !TextUtils.equals(ApiConstants.CodeGroup.PWD_CAN_FACE_ERROR, rpcResponse.codeGroup) || ServiceFactory.getService(FaceService.class) == null) {
            if (rpcResponse != null && !TextUtils.isEmpty(rpcResponse.codeGroup) && loginParam != null && (userLoginActivity = this.mUserLoginActivity) != null && userLoginActivity.mAlipayInstall && TextUtils.equals(ApiConstants.CodeGroup.PWD_CAN_ALIPAY, rpcResponse.codeGroup) && CommonUtil.isInABTestRegion(LoginSwitch.PWD_ERROR_TO_ALIPAY, 10000)) {
                LoginReturnData loginReturnData2 = rpcResponse.returnValue;
                if (loginReturnData2 == null || loginReturnData2.extMap == null) {
                    str2 = str4;
                    str = str2;
                } else {
                    str2 = loginReturnData2.extMap.get("dialogTitle");
                    str = rpcResponse.returnValue.extMap.get("dialogContent");
                }
                String string2 = getResources().getString(R.string.ali_user_alipay_quick_login);
                string = getResources().getString(R.string.aliuser_re_enter);
                positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.17
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (BaseLoginFragment.this.isActive()) {
                            AliUserDialog aliUserDialog = BaseLoginFragment.this.mAliUserDialog;
                            if (aliUserDialog != null) {
                                aliUserDialog.dismiss();
                            }
                            BaseLoginFragment.access$1200(BaseLoginFragment.this, "Button-Nick-Alipay-Login");
                            BaseLoginFragment.this.goAlipay();
                        }
                    }
                };
                str3 = string2;
            } else if (rpcResponse == null || TextUtils.isEmpty(rpcResponse.codeGroup) || loginParam == null || (!TextUtils.equals(ApiConstants.CodeGroup.PWD_ERROR, rpcResponse.codeGroup) && !TextUtils.equals("noRecord", rpcResponse.codeGroup))) {
                positiveClickListener = null;
                str2 = str4;
                str = str2;
                str3 = str;
            } else {
                str3 = getResources().getString(R.string.aliuser_alert_findpwd);
                positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.18
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (BaseLoginFragment.this.isActive()) {
                            BaseLoginFragment.access$1300(BaseLoginFragment.this, "Button-Alert-ResetPwd");
                            UserLoginPresenter userLoginPresenter2 = userLoginPresenter;
                            BaseActivity access$1400 = BaseLoginFragment.access$1400(BaseLoginFragment.this);
                            LoginParam loginParam2 = loginParam;
                            userLoginPresenter2.fetchUrlAndToWebView(access$1400, loginParam2.loginId, LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, loginParam2.source);
                            AliUserDialog aliUserDialog = BaseLoginFragment.this.mAliUserDialog;
                            if (aliUserDialog != null) {
                                aliUserDialog.dismiss();
                            }
                        }
                    }
                };
                str2 = str4;
                str = str2;
            }
            z = false;
        } else {
            LoginReturnData loginReturnData3 = rpcResponse.returnValue;
            if (loginReturnData3 == null || loginReturnData3.extMap == null) {
                str2 = str4;
                str = str2;
            } else {
                str2 = loginReturnData3.extMap.get("dialogTitle");
                str = rpcResponse.returnValue.extMap.get("dialogContent");
            }
            str3 = getResources().getString(R.string.aliuser_scan_login_text);
            string = getResources().getString(R.string.aliuser_cancel);
            positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (BaseLoginFragment.this.isActive()) {
                        AliUserDialog aliUserDialog = BaseLoginFragment.this.mAliUserDialog;
                        if (aliUserDialog != null) {
                            aliUserDialog.dismiss();
                        }
                        BaseLoginFragment.access$1100(BaseLoginFragment.this, "Button-Nick-Face-Login");
                        BaseLoginFragment.this.onFaceLogin(true);
                    }
                }
            };
        }
        if (TextUtils.isEmpty(str)) {
            str = rpcResponse == null ? str4 : rpcResponse.message;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = str;
        } else {
            str4 = str;
        }
        AliUserDialog.Builder onNegativeClickListener = AliUserDialog.Builder(getActivity()).setTitle(str2).setMessage(str4).setOnNegativeClickListener(string, new AliUserDialog.NegativeClickListener() { // from class: com.ali.user.mobile.login.ui.BaseLoginFragment.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.AliUserDialog.NegativeClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                AliUserDialog aliUserDialog = BaseLoginFragment.this.mAliUserDialog;
                if (aliUserDialog != null) {
                    aliUserDialog.dismiss();
                }
                if (z && BaseLoginFragment.this.isActive()) {
                    BaseLoginFragment.this.onPwdError();
                    if (BaseLoginFragment.this.isActive() && editText != null && imageView != null && LoginSwitch.getSwitch("show_password_hint", "true")) {
                        editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                        imageView.setImageResource(R.drawable.aliuser_ic_visibility);
                        imageView.setContentDescription(BaseLoginFragment.this.getString(R.string.aliuser_assist_password_show));
                        imageView.setTag(Boolean.TRUE);
                        UserTrackAdapter.sendControlUT(BaseLoginFragment.this.getPageName(), "Button-ShowPwd");
                    }
                }
            }
        });
        if (!TextUtils.isEmpty(str3)) {
            onNegativeClickListener.setOnPositiveClickListener(str3, positiveClickListener);
        }
        this.mAliUserDialog = onNegativeClickListener.build().shown();
        HashMap hashMap = new HashMap();
        if (rpcResponse != null) {
            hashMap.put("code", String.valueOf(rpcResponse.code));
        }
        if (rpcResponse != null && !TextUtils.isEmpty(rpcResponse.codeGroup)) {
            hashMap.put("codeGroup", rpcResponse.codeGroup);
        }
        UserTrackAdapter.sendUserTrack(getPageName(), "ShowPwdError", hashMap);
    }
}
