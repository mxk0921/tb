package com.ali.user.mobile.sns;

import android.app.Activity;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.SNSService;
import com.ali.user.mobile.utils.UTConstans;
import com.ali.user.mobile.webview.LoginPostHandler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.ui.AliUserBindMobileDialog;
import com.taobao.login4android.utils.ToastUtil;
import java.util.HashMap;
import java.util.Map;
import tb.mop;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SNSServiceImpl implements SNSService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "loginsdk.sns";

    static {
        t2o.a(70254866);
        t2o.a(68157612);
    }

    public static void commonSuccess(Activity activity, final LoginReturnData loginReturnData, final Map<String, String> map) {
        Map<String, String> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ab75a", new Object[]{activity, loginReturnData, map});
        } else if (activity == null || !(activity instanceof FragmentActivity) || loginReturnData == null || (map2 = loginReturnData.extMap) == null || TextUtils.isEmpty(map2.get("loginPostUrl"))) {
            doSuccess(loginReturnData, map);
        } else {
            final String str = loginReturnData.extMap.get("dialogTitle");
            String str2 = loginReturnData.extMap.get("dialogContent");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                UserTrackAdapter.sendUT("", "after_login_handle_commit", loginReturnData.loginType, str, null);
                LoginPostHandler.openPostPage(activity, loginReturnData.extMap.get("loginPostUrl"), "true".equals(loginReturnData.extMap.get(mop.KEY_IS_TRANSPARENT)), new LoginFilterCallback() { // from class: com.ali.user.mobile.sns.SNSServiceImpl.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.filter.LoginFilterCallback
                    public void onFail(int i, Map<String, String> map3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d66999c6", new Object[]{this, new Integer(i), map3});
                            return;
                        }
                        SNSServiceImpl.doSuccess(LoginReturnData.this, map3);
                        UserTrackAdapter.sendUT("", "after_login_handle_success", LoginReturnData.this.loginType, str, null);
                    }

                    @Override // com.ali.user.mobile.filter.LoginFilterCallback
                    public void onSuccess() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            return;
                        }
                        SNSServiceImpl.doSuccess(LoginReturnData.this, map);
                        UserTrackAdapter.sendUT("", "after_login_handle_success", LoginReturnData.this.loginType, str, null);
                    }
                });
                return;
            }
            doPostSuccess((FragmentActivity) activity, loginReturnData, map);
        }
    }

    public static void doPostSuccess(final FragmentActivity fragmentActivity, final LoginReturnData loginReturnData, final Map<String, String> map) {
        Map<String, String> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e450051", new Object[]{fragmentActivity, loginReturnData, map});
        } else if (loginReturnData != null && (map2 = loginReturnData.extMap) != null) {
            final String str = map2.get("dialogTitle");
            String str2 = loginReturnData.extMap.get("dialogContent");
            final String str3 = loginReturnData.extMap.get("loginPostUrl");
            final AliUserBindMobileDialog aliUserBindMobileDialog = new AliUserBindMobileDialog();
            aliUserBindMobileDialog.setPositive(new View.OnClickListener() { // from class: com.ali.user.mobile.sns.SNSServiceImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AliUserBindMobileDialog aliUserBindMobileDialog2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (FragmentActivity.this.isFinishing() || (aliUserBindMobileDialog2 = aliUserBindMobileDialog) == null) {
                        SNSServiceImpl.doSuccess(loginReturnData, map);
                    } else {
                        aliUserBindMobileDialog2.dismissAllowingStateLoss();
                        UserTrackAdapter.sendUT("", "after_login_handle_commit", loginReturnData.loginType, str, null);
                        LoginPostHandler.openPostPage(FragmentActivity.this, str3, "true".equals(loginReturnData.extMap.get(mop.KEY_IS_TRANSPARENT)), new LoginFilterCallback() { // from class: com.ali.user.mobile.sns.SNSServiceImpl.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.mobile.filter.LoginFilterCallback
                            public void onFail(int i, Map<String, String> map3) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("d66999c6", new Object[]{this, new Integer(i), map3});
                                    return;
                                }
                                SNSServiceImpl.doSuccess(loginReturnData, map3);
                                AnonymousClass3 r4 = AnonymousClass3.this;
                                UserTrackAdapter.sendUT("", "after_login_handle_success", loginReturnData.loginType, str, null);
                            }

                            @Override // com.ali.user.mobile.filter.LoginFilterCallback
                            public void onSuccess() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("d0e393ab", new Object[]{this});
                                    return;
                                }
                                AnonymousClass3 r0 = AnonymousClass3.this;
                                SNSServiceImpl.doSuccess(loginReturnData, map);
                                AnonymousClass3 r02 = AnonymousClass3.this;
                                UserTrackAdapter.sendUT("", "after_login_handle_success", loginReturnData.loginType, str, null);
                            }
                        });
                    }
                }
            });
            aliUserBindMobileDialog.setNagetive(new View.OnClickListener() { // from class: com.ali.user.mobile.sns.SNSServiceImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AliUserBindMobileDialog aliUserBindMobileDialog2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (!FragmentActivity.this.isFinishing() && (aliUserBindMobileDialog2 = aliUserBindMobileDialog) != null) {
                        aliUserBindMobileDialog2.dismissAllowingStateLoss();
                    }
                    SNSServiceImpl.doSuccess(loginReturnData, map);
                }
            });
            if (!TextUtils.isEmpty(str)) {
                aliUserBindMobileDialog.setTitle(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                aliUserBindMobileDialog.setContent(Html.fromHtml(str2));
            }
            aliUserBindMobileDialog.show(fragmentActivity.getSupportFragmentManager(), UTConstans.PageName.UT_PAGE_RECOMMEND_LOGIN);
        }
    }

    public static void doSuccess(LoginReturnData loginReturnData, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807823a8", new Object[]{loginReturnData, map});
        } else {
            LoginDataHelper.processLoginReturnData(true, loginReturnData, map);
        }
    }

    @Override // com.ali.user.mobile.service.SNSService
    public void dismissLoading(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48df216b", new Object[]{this, activity});
        } else if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).dismissProgressDialog();
        }
    }

    @Override // com.ali.user.mobile.service.SNSService
    public void onError(Activity activity, RpcResponse<LoginReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371a676b", new Object[]{this, activity, rpcResponse});
        }
    }

    @Override // com.ali.user.mobile.service.SNSService
    public void onH5(Activity activity, RpcResponse<LoginReturnData> rpcResponse, UrlParam urlParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36ffb34b", new Object[]{this, activity, rpcResponse, urlParam});
            return;
        }
        String str = rpcResponse.returnValue.h5Url;
        if (activity != null && !TextUtils.isEmpty(str)) {
            LoginParam loginParam = new LoginParam();
            if (urlParam != null) {
                loginParam.nativeLoginType = urlParam.loginType;
                LoginBaseParam loginBaseParam = urlParam.loginParam;
                if (loginBaseParam != null) {
                    loginParam.sdkTraceId = loginBaseParam.sdkTraceId;
                    loginParam.utPageName = loginBaseParam.utPageName;
                }
            }
            loginParam.tokenType = TokenType.SNS;
            LoginReturnData loginReturnData = rpcResponse.returnValue;
            loginParam.token = loginReturnData.token;
            loginParam.scene = loginReturnData.scene;
            loginParam.ext = loginReturnData.extMap;
            loginParam.sendLoginFailWhenWebviewCancel = true;
            NavigatorManager.getInstance().navToWebViewPage(activity, str, loginParam, rpcResponse.returnValue);
        }
    }

    @Override // com.ali.user.mobile.service.SNSService
    public void onLoginSuccess(Activity activity, SNSSignInAccount sNSSignInAccount, RpcResponse<LoginReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804f1f0d", new Object[]{this, activity, sNSSignInAccount, rpcResponse});
            return;
        }
        HashMap hashMap = new HashMap();
        if (sNSSignInAccount != null) {
            hashMap.put(LoginConstants.LOGIN_TYPE, sNSSignInAccount.snsType);
        }
        commonSuccess(activity, rpcResponse.returnValue, hashMap);
    }

    @Override // com.ali.user.mobile.service.SNSService
    public void showLoading(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72771358", new Object[]{this, activity});
        } else if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).showProgress("");
        }
    }

    @Override // com.ali.user.mobile.service.SNSService
    public void toast(final Activity activity, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efdc99ca", new Object[]{this, activity, str});
        } else if (activity != null && !activity.isFinishing()) {
            activity.runOnUiThread(new Runnable() { // from class: com.ali.user.mobile.sns.SNSServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ToastUtil.showToast(activity, str, 0);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
