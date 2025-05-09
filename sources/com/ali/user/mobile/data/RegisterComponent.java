package com.ali.user.mobile.data;

import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.info.AlipayInfo;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.register.model.BaseRegistRequest;
import com.ali.user.mobile.register.model.MtopRegisterInitcontextResponseData;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.login.model.MemberRequestBase;
import com.ali.user.mobile.rpc.login.model.WSecurityData;
import com.ali.user.mobile.rpc.login.model.WUAData;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.ResourceUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RegisterComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static RegisterComponent mRegisterComponent;
    private final String TAG = "login.RegisterComponent";

    static {
        t2o.a(69206100);
    }

    private RegisterComponent() {
    }

    private void buildBaseParams(MemberRequestBase memberRequestBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11363bad", new Object[]{this, memberRequestBase});
            return;
        }
        memberRequestBase.appName = DataProviderFactory.getDataProvider().getAppkey();
        memberRequestBase.sdkVersion = AppInfo.getInstance().getSdkVersion();
        memberRequestBase.ttid = DataProviderFactory.getDataProvider().getTTID();
        memberRequestBase.utdid = AppInfo.getInstance().getUtdid();
        memberRequestBase.site = DataProviderFactory.getDataProvider().getSite();
        memberRequestBase.locale = ResourceUtil.getLocaleStr();
    }

    public static RegisterComponent getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegisterComponent) ipChange.ipc$dispatch("f23ed056", new Object[0]);
        }
        if (mRegisterComponent == null) {
            synchronized (RegisterComponent.class) {
                try {
                    if (mRegisterComponent == null) {
                        mRegisterComponent = new RegisterComponent();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mRegisterComponent;
    }

    public MtopRegisterInitcontextResponseData countryCodeRes(BaseRegistRequest baseRegistRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRegisterInitcontextResponseData) ipChange.ipc$dispatch("891c397b", new Object[]{this, baseRegistRequest});
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.REGISTER_INIT;
        rpcRequest.VERSION = "1.0";
        MemberRequestBase memberRequestBase = new MemberRequestBase();
        int i = baseRegistRequest.registSite;
        memberRequestBase.site = i;
        rpcRequest.requestSite = i;
        buildBaseParams(memberRequestBase);
        rpcRequest.addParam("info", JSON.toJSONString(memberRequestBase));
        WSecurityData wSecurityData = new WSecurityData();
        WUAData wua = SecurityGuardManagerWraper.getWUA();
        if (wua != null) {
            wSecurityData.wua = wua.wua;
        }
        wSecurityData.apdId = AlipayInfo.getInstance().getApdid();
        wSecurityData.umidToken = AppInfo.getInstance().getUmidToken();
        rpcRequest.addParam(ApiConstants.ApiField.RISK_INFO, JSON.toJSONString(wSecurityData));
        if (memberRequestBase.ext == null) {
            memberRequestBase.ext = new HashMap();
            if (!TextUtils.isEmpty(baseRegistRequest.regFrom)) {
                memberRequestBase.ext.put("regFrom", baseRegistRequest.regFrom);
            }
        }
        if (DataProviderFactory.getDataProvider().getRegisterExternalData("getCountry") != null) {
            memberRequestBase.ext.putAll(DataProviderFactory.getDataProvider().getRegisterExternalData("getCountry"));
        }
        rpcRequest.addParam("extra", JSON.toJSONString(memberRequestBase.ext));
        return (MtopRegisterInitcontextResponseData) ((RpcService) ServiceFactory.getService(RpcService.class)).post(rpcRequest, MtopRegisterInitcontextResponseData.class);
    }
}
