package com.ali.user.mobile.login.presenter;

import android.text.TextUtils;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.login.model.LoginFlowRequest;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.login.ui.LoginModeState;
import com.ali.user.mobile.login.ui.RecommendLoginView;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.register.ui.oversea.AliEmailFragment;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.NetworkUtil;
import com.ali.user.mobile.utils.ResourceUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import java.util.HashMap;
import java.util.Map;
import tb.o78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RecommendLoginPresenter extends BaseLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = "login.".concat(RecommendLoginPresenter.class.getSimpleName());

    static {
        t2o.a(70254719);
    }

    public RecommendLoginPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
    }

    public static /* synthetic */ void access$000(RecommendLoginPresenter recommendLoginPresenter, RpcResponse rpcResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e00d9d3", new Object[]{recommendLoginPresenter, rpcResponse, str});
        } else {
            recommendLoginPresenter.onGetLoginFlowError(rpcResponse, str);
        }
    }

    public static /* synthetic */ Object ipc$super(RecommendLoginPresenter recommendLoginPresenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/presenter/RecommendLoginPresenter");
    }

    private void onGetLoginFlowError(RpcResponse rpcResponse, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4487b328", new Object[]{this, rpcResponse, str});
            return;
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView != null && baseLoginView.isActive()) {
            this.mViewer.dismissLoading();
            if (rpcResponse == null || rpcResponse.code == 3004 || (this.mViewer instanceof AliEmailFragment)) {
                if (rpcResponse != null) {
                    str2 = rpcResponse.message;
                } else {
                    str2 = "";
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = ResourceUtil.getNetworkError();
                }
                this.mViewer.toast(str2, 0);
                return;
            }
            onFlowLimitLocked(str);
        }
    }

    public boolean checkAvailable(LoginFlowReturnData loginFlowReturnData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ff475eb", new Object[]{this, loginFlowReturnData, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || loginFlowReturnData == null) {
            return false;
        }
        if (!TextUtils.equals(str, LoginModeState.SIM_LOGIN.name())) {
            return true;
        }
        String maskMobile = NetworkUtil.getMaskMobile();
        if (!TextUtils.isEmpty(maskMobile)) {
            if (TextUtils.isEmpty(loginFlowReturnData.countryCode)) {
                return true;
            }
            if (o78.CHINA_MAINLAND.equals(loginFlowReturnData.countryCode) && UserLoginActivity.isCompareSuccess(loginFlowReturnData.loginId, maskMobile)) {
                return true;
            }
        }
        return false;
    }

    public void getLoginFlow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef7d588", new Object[]{this});
            return;
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView != null && baseLoginView.isActive()) {
            this.mViewer.showLoading();
            getLoginFlowRequest(this.mLoginParam, new RpcRequestCallback() { // from class: com.ali.user.mobile.login.presenter.RecommendLoginPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                        return;
                    }
                    RecommendLoginPresenter.this.mViewer.dismissLoading();
                    if (rpcResponse != null && TextUtils.equals(rpcResponse.actionType, ApiConstants.ResultActionType.FORCE_TOAST)) {
                        RecommendLoginPresenter.this.mViewer.toast(rpcResponse.message, 1);
                    } else if (rpcResponse != null && "mobileNeedCheck".equals(rpcResponse.codeGroup) && ApiConstants.ResultActionType.TOAST.equals(rpcResponse.actionType)) {
                        RecommendLoginPresenter recommendLoginPresenter = RecommendLoginPresenter.this;
                        ((RecommendLoginView) recommendLoginPresenter.mViewer).onNeedAlert(recommendLoginPresenter.mLoginParam, rpcResponse);
                    } else if (rpcResponse == null || !"guideH5".equals(rpcResponse.codeGroup)) {
                        RecommendLoginPresenter recommendLoginPresenter2 = RecommendLoginPresenter.this;
                        LoginParam loginParam = recommendLoginPresenter2.mLoginParam;
                        if (loginParam == null) {
                            str = "";
                        } else {
                            str = loginParam.loginId;
                        }
                        RecommendLoginPresenter.access$000(recommendLoginPresenter2, rpcResponse, str);
                    } else {
                        RecommendLoginPresenter recommendLoginPresenter3 = RecommendLoginPresenter.this;
                        ((RecommendLoginView) recommendLoginPresenter3.mViewer).onGuideH5(recommendLoginPresenter3.mLoginParam, rpcResponse);
                    }
                }

                /* JADX WARN: Can't wrap try/catch for region: R(12:17|(2:23|(1:28)(10:27|29|(3:33|(3:35|(2:37|82)(1:83)|38)|81)|(3:79|40|(1:42))|(1:48)|50|77|51|53|(2:55|88)(2:56|(2:58|89)(2:59|(2:61|90)(2:62|(2:64|91)(2:65|(2:67|92)(2:68|(2:70|93)(2:71|(2:73|94)(2:74|95)))))))))(1:21)|22|29|(4:31|33|(0)|81)|(0)|(2:46|48)|50|77|51|53|(0)(0)) */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onSuccess(com.ali.user.mobile.rpc.RpcResponse r12) {
                    /*
                        Method dump skipped, instructions count: 455
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.presenter.RecommendLoginPresenter.AnonymousClass1.onSuccess(com.ali.user.mobile.rpc.RpcResponse):void");
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void getLoginFlowRequest(LoginParam loginParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18cd55de", new Object[]{this, loginParam, rpcRequestCallback});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.GET_LOGIN_FLOW;
        rpcRequest.VERSION = "1.0";
        LoginFlowRequest loginFlowRequest = new LoginFlowRequest();
        AppLaunchDataPresenter.buildLoginFlowRequest(loginParam, loginFlowRequest);
        loginFlowRequest.pageType = loginParam.pageType;
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(loginFlowRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(UserLoginServiceImpl.getScanFaceWSecurityData()));
        Map hashMap = new HashMap();
        Map map = loginParam.ext;
        if (map != null) {
            hashMap = map;
        }
        hashMap.put("sdkTraceId", loginParam.sdkTraceId);
        if (ServiceFactory.getService(NumberAuthService.class) != null && LoginSwitch.getSwitch("getloginflow_take_maskmobile", "true")) {
            String str = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("number");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("maskMobile", str);
            }
        }
        if (LoginSwitch.getSwitch("isRecommendNotOpenFace", "true")) {
            hashMap.put("isRecommendNotOpenFace", "true");
        }
        rpcRequest.addParam("ext", JSON.toJSONString(hashMap));
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, LoginFlowResponseData.class, rpcRequestCallback);
    }

    public void onFlowLimitLocked(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117ae149", new Object[]{this, str});
        } else {
            ((RecommendLoginView) this.mViewer).onFlowLimitLocked(str);
        }
    }
}
