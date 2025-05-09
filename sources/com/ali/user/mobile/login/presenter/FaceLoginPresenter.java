package com.ali.user.mobile.login.presenter;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.login.ui.FaceLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.verify.impl.VerifyServiceImpl;
import com.ali.user.mobile.verify.model.GetVerifyUrlResponse;
import com.ali.user.mobile.verify.model.GetVerifyUrlReturnData;
import com.ali.user.mobile.verify.model.VerifyParam;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FaceLoginPresenter extends BaseLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(70254712);
    }

    public FaceLoginPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
    }

    public static /* synthetic */ Object ipc$super(FaceLoginPresenter faceLoginPresenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/presenter/FaceLoginPresenter");
    }

    public void activeFaceLogin(final LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a221c0a", new Object[]{this, loginParam});
        } else if (loginParam != null) {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, GetVerifyUrlResponse>() { // from class: com.ali.user.mobile.login.presenter.FaceLoginPresenter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private long userId;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/presenter/FaceLoginPresenter$2");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                public GetVerifyUrlResponse doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (GetVerifyUrlResponse) ipChange2.ipc$dispatch("d9d8ec28", new Object[]{this, objArr});
                    }
                    VerifyParam verifyParam = new VerifyParam();
                    verifyParam.fromSite = FaceLoginPresenter.this.mViewer.getLoginSite();
                    verifyParam.actionType = "h5_non_login_open_verify";
                    LoginParam loginParam2 = loginParam;
                    if (loginParam2 != null) {
                        verifyParam.deviceTokenKey = loginParam2.deviceTokenKey;
                        verifyParam.userId = loginParam.hid + "";
                        this.userId = loginParam.hid;
                    }
                    try {
                        return VerifyServiceImpl.getInstance().getNonLoginVerfiyUrl(verifyParam);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }

                public void onPostExecute(GetVerifyUrlResponse getVerifyUrlResponse) {
                    T t;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c4d1030f", new Object[]{this, getVerifyUrlResponse});
                    } else if (getVerifyUrlResponse != null) {
                        if (getVerifyUrlResponse.code == 3000 && (t = getVerifyUrlResponse.returnValue) != 0 && !TextUtils.isEmpty(((GetVerifyUrlReturnData) t).url)) {
                            UrlParam urlParam = new UrlParam();
                            urlParam.url = ((GetVerifyUrlReturnData) getVerifyUrlResponse.returnValue).url;
                            urlParam.ivScene = "h5_non_login_open_verify";
                            urlParam.userid = this.userId + "";
                            ((FaceService) ServiceFactory.getService(FaceService.class)).activeFaceLogin(((GetVerifyUrlReturnData) getVerifyUrlResponse.returnValue).url, null);
                        } else if (getVerifyUrlResponse.code == 13050) {
                            FaceLoginPresenter.this.fetchScanToken(loginParam);
                        }
                    }
                }
            }, new Object[0]);
        }
    }

    public void fetchScanToken(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272ca246", new Object[]{this, loginParam});
        } else {
            LoginApi.faceLogin(loginParam, buildTrackingModel(), this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.FaceLoginPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                        return;
                    }
                    BaseLoginView baseLoginView = FaceLoginPresenter.this.mViewer;
                    if (baseLoginView != null && baseLoginView.isActive() && loginException != null) {
                        int code = loginException.getCode();
                        if (code == 3008) {
                            ((FaceLoginView) FaceLoginPresenter.this.mViewer).toLastLoginFragment();
                        } else if (code != 3009) {
                            BaseLoginView baseLoginView2 = FaceLoginPresenter.this.mViewer;
                            if (loginException.getOrinResponse() == null || TextUtils.isEmpty(loginException.getOrinResponse().message)) {
                                str = FaceLoginPresenter.this.mViewer.getBaseActivity().getString(R.string.aliuser_network_error);
                            } else {
                                str = loginException.getOrinResponse().message;
                            }
                            baseLoginView2.toast(str, 0);
                        } else {
                            BaseLoginView baseLoginView3 = FaceLoginPresenter.this.mViewer;
                            baseLoginView3.toast(baseLoginView3.getBaseActivity().getString(R.string.aliuser_scan_login_fail), 0);
                        }
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return LoginType.LocalLoginType.SCAN_FACE_LOGIN;
    }
}
