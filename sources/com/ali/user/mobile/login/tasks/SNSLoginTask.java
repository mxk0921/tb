package com.ali.user.mobile.login.tasks;

import android.app.Activity;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.taobao.R;
import java.util.Properties;
import org.json.JSONObject;
import tb.o0v;
import tb.t2o;
import tb.umo;
import tb.wmo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SNSLoginTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Activity activity;
    public JSONObject params;
    public SNSPlatform platform;

    static {
        t2o.a(69206179);
    }

    public SNSLoginTask(SNSPlatform sNSPlatform, Activity activity, JSONObject jSONObject) {
        this.platform = sNSPlatform;
        this.activity = activity;
        this.params = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(SNSLoginTask sNSLoginTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/tasks/SNSLoginTask");
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void buildLoginParam(final CommonDataCallback commonDataCallback) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else if (commonDataCallback != null) {
            if (this.platform == null) {
                commonDataCallback.onFail(3002, ResourceUtil.getInvalidParam());
            } else if (umo.a().b(this.platform) != null) {
                Properties properties = LoginComponent.getProperties();
                JSONObject jSONObject = this.params;
                if (jSONObject != null) {
                    try {
                        string = jSONObject.getString(UTConstant.PageName.UT_KEY_PAGE_NAME);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    UserTrackAdapter.sendUT(string, "snsAuthCode_commit", "", o0v.a(this.platform.getPlatform()), properties);
                    umo.a().b(this.platform).b(this.activity, new wmo() { // from class: com.ali.user.mobile.login.tasks.SNSLoginTask.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.wmo
                        public void onCancel(Activity activity, String str, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("77c620a6", new Object[]{this, activity, str, str2});
                            } else {
                                commonDataCallback.onFail(3007, activity.getResources().getString(R.string.aliuser_sns_platform_auth_cancel));
                            }
                        }

                        @Override // tb.wmo
                        public void onError(Activity activity, String str, int i, String str2, String str3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7321aa0b", new Object[]{this, activity, str, new Integer(i), str2, str3});
                            } else {
                                commonDataCallback.onFail(i, str2);
                            }
                        }

                        @Override // tb.wmo
                        public void onSucceed(Activity activity, SNSSignInAccount sNSSignInAccount) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8032b9ea", new Object[]{this, activity, sNSSignInAccount});
                                return;
                            }
                            SNSLoginTask sNSLoginTask = SNSLoginTask.this;
                            if (sNSLoginTask.loginParam == null) {
                                sNSLoginTask.loginParam = new LoginBaseParam();
                            }
                            LoginBaseParam loginBaseParam = SNSLoginTask.this.loginParam;
                            loginBaseParam.snsTrustLoginToken = sNSSignInAccount.token;
                            loginBaseParam.snsType = sNSSignInAccount.snsType;
                            commonDataCallback.onSuccess(null);
                        }
                    }, this.params);
                }
                string = null;
                UserTrackAdapter.sendUT(string, "snsAuthCode_commit", "", o0v.a(this.platform.getPlatform()), properties);
                umo.a().b(this.platform).b(this.activity, new wmo() { // from class: com.ali.user.mobile.login.tasks.SNSLoginTask.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.wmo
                    public void onCancel(Activity activity, String str, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("77c620a6", new Object[]{this, activity, str, str2});
                        } else {
                            commonDataCallback.onFail(3007, activity.getResources().getString(R.string.aliuser_sns_platform_auth_cancel));
                        }
                    }

                    @Override // tb.wmo
                    public void onError(Activity activity, String str, int i, String str2, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7321aa0b", new Object[]{this, activity, str, new Integer(i), str2, str3});
                        } else {
                            commonDataCallback.onFail(i, str2);
                        }
                    }

                    @Override // tb.wmo
                    public void onSucceed(Activity activity, SNSSignInAccount sNSSignInAccount) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8032b9ea", new Object[]{this, activity, sNSSignInAccount});
                            return;
                        }
                        SNSLoginTask sNSLoginTask = SNSLoginTask.this;
                        if (sNSLoginTask.loginParam == null) {
                            sNSLoginTask.loginParam = new LoginBaseParam();
                        }
                        LoginBaseParam loginBaseParam = SNSLoginTask.this.loginParam;
                        loginBaseParam.snsTrustLoginToken = sNSSignInAccount.token;
                        loginBaseParam.snsType = sNSSignInAccount.snsType;
                        commonDataCallback.onSuccess(null);
                    }
                }, this.params);
            } else {
                commonDataCallback.onFail(703, this.activity.getResources().getString(R.string.aliuser_sns_platform_auth_fail));
            }
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return null;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this});
        }
        return null;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb9247", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            UserLoginServiceImpl.getInstance().snslogin(loginBaseParam, rpcRequestCallback);
        }
    }
}
