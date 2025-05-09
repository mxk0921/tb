package com.ali.user.mobile.impl;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.dataprovider.IntOrangeResult;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.callback.RpcRequestCallbackWithCode;
import com.ali.user.mobile.exception.ErrorCode;
import com.ali.user.mobile.exception.RpcException;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.filter.FilterManager;
import com.ali.user.mobile.utils.ResourceUtil;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.rpc.RpcException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.ErrorConstant;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MTOPWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static MTOPWrapper INSTANCE = null;
    private static final int MTOP_BIZ_CODE = 94;
    private static final String TAG = "login.MTOPWrapperImpl";

    static {
        t2o.a(68157512);
    }

    private MTOPWrapper() {
    }

    public static /* synthetic */ void access$000(MTOPWrapper mTOPWrapper, RpcRequest rpcRequest, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed67345a", new Object[]{mTOPWrapper, rpcRequest, mtopResponse});
        } else {
            mTOPWrapper.mtopRequestSuccessTrack(rpcRequest, mtopResponse);
        }
    }

    public static /* synthetic */ void access$100(MTOPWrapper mTOPWrapper, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38ce948", new Object[]{mTOPWrapper, mtopResponse});
        } else {
            mTOPWrapper.rpcFailRecord(mtopResponse);
        }
    }

    public static /* synthetic */ void access$200(MTOPWrapper mTOPWrapper, RpcRequest rpcRequest, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60605fdc", new Object[]{mTOPWrapper, rpcRequest, mtopResponse});
        } else {
            mTOPWrapper.mtopRequestFailTrack(rpcRequest, mtopResponse);
        }
    }

    private MtopRequest buildMtopRequest(RpcRequest rpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("9c0eff9e", new Object[]{this, rpcRequest});
        }
        if (rpcRequest == null) {
            return null;
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(rpcRequest.API_NAME);
            mtopRequest.setVersion(rpcRequest.VERSION);
            mtopRequest.setNeedEcode(rpcRequest.NEED_ECODE);
            mtopRequest.setNeedSession(rpcRequest.NEED_SESSION);
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < rpcRequest.paramNames.size(); i++) {
                if (!(rpcRequest.paramNames.get(i) == null || rpcRequest.paramValues.get(i) == null)) {
                    jSONObject.put(rpcRequest.paramNames.get(i), rpcRequest.paramValues.get(i).toString());
                }
            }
            if (Debuggable.isDebug()) {
                StringBuilder sb = new StringBuilder();
                sb.append("buildMtopRequest: api=");
                sb.append(rpcRequest.API_NAME);
                sb.append(",data=");
                sb.append(jSONObject.toString());
            }
            mtopRequest.setData(jSONObject.toString());
            return mtopRequest;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private <T extends RpcResponse<?>> T getBizData(MtopResponse mtopResponse, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((RpcResponse) ipChange.ipc$dispatch("a09fe807", new Object[]{this, mtopResponse, cls}));
        }
        try {
            JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
            if (dataJsonObject != null) {
                return (T) ((RpcResponse) JSON.parseObject(dataJsonObject.toString(), cls));
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static synchronized MTOPWrapper getInstance() {
        synchronized (MTOPWrapper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MTOPWrapper) ipChange.ipc$dispatch("a31e074f", new Object[0]);
            }
            if (INSTANCE == null) {
                synchronized (MTOPWrapper.class) {
                    if (INSTANCE == null) {
                        INSTANCE = new MTOPWrapper();
                    }
                }
            }
            return INSTANCE;
        }
    }

    private void mtopRequestCommitTrack(RpcRequest rpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deaf4747", new Object[]{this, rpcRequest});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("monitor", "T");
        UserTrackAdapter.sendExtendUT("mtopRpc_commit", "", rpcRequest.API_NAME, properties);
    }

    private void mtopRequestFailTrack(RpcRequest rpcRequest, MtopResponse mtopResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81fa2c5", new Object[]{this, rpcRequest, mtopResponse});
        } else if (rpcRequest != null) {
            Properties properties = new Properties();
            properties.setProperty("monitor", "T");
            if (mtopResponse == null || TextUtils.isEmpty(mtopResponse.getRetCode()) || mtopResponse.getRetCode().startsWith("FAIL_SYS") || mtopResponse.getRetCode().startsWith("ANDROID_SYS")) {
                if (mtopResponse == null) {
                    str = "-100";
                } else {
                    str = mtopResponse.getRetCode();
                }
                UserTrackAdapter.sendExtendUT("mtopRpc_failure", str, rpcRequest.API_NAME, properties);
                return;
            }
            UserTrackAdapter.sendExtendUT("mtopRpc_success", mtopResponse.getRetCode(), rpcRequest.API_NAME, properties);
        }
    }

    private void mtopRequestSuccessTrack(RpcRequest rpcRequest, MtopResponse mtopResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4068e6ee", new Object[]{this, rpcRequest, mtopResponse});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("monitor", "T");
        if (mtopResponse == null) {
            str = "-100";
        } else {
            str = mtopResponse.getRetCode();
        }
        UserTrackAdapter.sendExtendUT("mtopRpc_success", str, rpcRequest.API_NAME, properties);
    }

    public <T extends RpcResponse<?>> T post(RpcRequest rpcRequest, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ((RpcResponse) ipChange.ipc$dispatch("1cfb3a20", new Object[]{this, rpcRequest, cls})) : (T) post(rpcRequest, cls, null);
    }

    public <T extends RpcResponse<?>> T processMtopResponse(MtopResponse mtopResponse, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((RpcResponse) ipChange.ipc$dispatch("27a9a656", new Object[]{this, mtopResponse, cls}));
        }
        if (mtopResponse != null && mtopResponse.isApiSuccess()) {
            return (T) getBizData(mtopResponse, cls);
        }
        if (mtopResponse == null) {
            return null;
        }
        if (ErrorConstant.ERRCODE_JSONDATA_PARSE_ERROR.equals(mtopResponse.getRetCode())) {
            throw new RpcException(404, mtopResponse.getRetMsg(), mtopResponse.getRetCode());
        } else if (mtopResponse.isNetworkError()) {
            throw new RpcException(Integer.valueOf((int) ErrorCode.CLIENT_NETWORK_ERROR), ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
        } else if (mtopResponse.isApiLockedResult()) {
            throw new RpcException(400, mtopResponse.getRetMsg(), mtopResponse.getRetCode());
        } else if (mtopResponse.is41XResult()) {
            throw new RpcException(401, mtopResponse.getRetMsg(), mtopResponse.getRetCode());
        } else if (mtopResponse.isExpiredRequest()) {
            throw new RpcException(402, ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
        } else if (mtopResponse.isIllegelSign()) {
            throw new RpcException(403, ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
        } else if (mtopResponse.isSystemError()) {
            if (!TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                throw new RpcException(406, mtopResponse.getRetMsg(), mtopResponse.getRetCode());
            }
            throw new RpcException(406, ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
        } else if (mtopResponse.isMtopSdkError()) {
            throw new RpcException(406, ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
        } else if (!mtopResponse.isSessionInvalid()) {
            return (T) getBizData(mtopResponse, cls);
        } else {
            throw new RpcException(407, ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
        }
    }

    public <T extends RpcResponse<?>> void remoteBusiness(RpcRequest rpcRequest, Class<T> cls, String str, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3022a029", new Object[]{this, rpcRequest, cls, str, rpcRequestCallback});
        } else if (rpcRequest != null && rpcRequestCallback != null) {
            remoteBusiness(rpcRequest, cls, str, rpcRequestCallback, null);
        }
    }

    private void rpcFailRecord(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a2fc60", new Object[]{this, mtopResponse});
            return;
        }
        try {
            Properties properties = new Properties();
            properties.setProperty("api", mtopResponse.getApi() + "");
            properties.setProperty("errorCode", mtopResponse.getRetCode() + "");
            properties.setProperty("errorMsg", mtopResponse.getRetMsg() + "");
            try {
                properties.setProperty("traceid", mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2).get(0) + "");
            } catch (Exception unused) {
            }
            UserTrackAdapter.sendUT("rpcResult", properties);
        } catch (Throwable unused2) {
        }
    }

    public <T extends RpcResponse<?>> T post(RpcRequest rpcRequest, Class<T> cls, String str) {
        MtopResponse mtopResponse;
        Exception e;
        MtopResponse mtopResponse2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((RpcResponse) ipChange.ipc$dispatch("e3f95c2a", new Object[]{this, rpcRequest, cls, str}));
        }
        try {
            mtopRequestCommitTrack(rpcRequest);
            MtopBuilder retryTime = Mtop.instance(DataProviderFactory.getApplicationContext()).build(buildMtopRequest(rpcRequest), DataProviderFactory.getDataProvider().getTTID()).reqMethod(MethodEnum.POST).setBizId(94).setConnectionTimeoutMilliSecond(RpcException.ErrorCode.PUBLIC_KEY_NOT_FOUND).setSocketTimeoutMilliSecond(RpcException.ErrorCode.PUBLIC_KEY_NOT_FOUND).retryTime(1);
            if (!TextUtils.isEmpty(str)) {
                retryTime.setReqUserId(str);
            }
            IntOrangeResult mtopTimeOutMilliSecond = DataProviderFactory.getOrangeConfig().getMtopTimeOutMilliSecond();
            if (mtopTimeOutMilliSecond.orangeExist) {
                retryTime.setConnectionTimeoutMilliSecond(mtopTimeOutMilliSecond.value).setSocketTimeoutMilliSecond(mtopTimeOutMilliSecond.value);
            }
            Map<String, String> additionalHeaders = DataProviderFactory.getDataProvider().getAdditionalHeaders();
            if (additionalHeaders == null) {
                additionalHeaders = new HashMap<>();
            }
            if (LoginSwitch.getSwitch("baxia_switch", "true")) {
                additionalHeaders.put("login_sdk_version", AppInfo.getInstance().getSdkVersion().replace("android_", ""));
            }
            retryTime.headers(additionalHeaders);
            String str2 = rpcRequest.onlineDomain;
            if (str2 == null) {
                str2 = DataProviderFactory.getDataProvider().getOnlineDomain();
            }
            String str3 = rpcRequest.preDomain;
            if (str3 == null) {
                str3 = DataProviderFactory.getDataProvider().getPreDomain();
            }
            String str4 = rpcRequest.dailyDomain;
            if (str4 == null) {
                str4 = DataProviderFactory.getDataProvider().getDailyDomain();
            }
            retryTime.setCustomDomain(str2, str3, str4);
            long currentTimeMillis = System.currentTimeMillis();
            mtopResponse = retryTime.syncRequest();
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                LoginTLogAdapter.e("login_optimize", "receive MtopResponse" + mtopResponse + ",time=" + (currentTimeMillis2 - currentTimeMillis));
                if (mtopResponse == null || !mtopResponse.isApiSuccess()) {
                    mtopRequestFailTrack(rpcRequest, mtopResponse);
                } else {
                    mtopRequestSuccessTrack(rpcRequest, mtopResponse);
                }
            } catch (Exception e2) {
                e = e2;
                mtopResponse2 = mtopResponse;
                LoginTLogAdapter.e(TAG, "MtopResponse error", e);
                e.printStackTrace();
                mtopRequestFailTrack(rpcRequest, mtopResponse2);
                mtopResponse = mtopResponse2;
                if (mtopResponse != null) {
                }
                LoginTLogAdapter.e(TAG, "MtopResponse response=null");
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            mtopResponse2 = null;
        }
        if (mtopResponse != null || cls == null) {
            LoginTLogAdapter.e(TAG, "MtopResponse response=null");
            return null;
        }
        if (!mtopResponse.isApiSuccess()) {
            rpcFailRecord(mtopResponse);
        }
        return (T) processMtopResponse(mtopResponse, cls);
    }

    public <T extends RpcResponse<?>> void remoteBusiness(RpcRequest rpcRequest, Class<T> cls, RpcRequestCallbackWithCode rpcRequestCallbackWithCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5302fa0", new Object[]{this, rpcRequest, cls, rpcRequestCallbackWithCode});
        } else if (rpcRequest != null && rpcRequestCallbackWithCode != null) {
            remoteBusiness(rpcRequest, cls, null, null, rpcRequestCallbackWithCode);
        }
    }

    private <T extends RpcResponse<?>> void remoteBusiness(final RpcRequest rpcRequest, final Class<T> cls, String str, final RpcRequestCallback rpcRequestCallback, final RpcRequestCallbackWithCode rpcRequestCallbackWithCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da4f7f4", new Object[]{this, rpcRequest, cls, str, rpcRequestCallback, rpcRequestCallbackWithCode});
            return;
        }
        try {
            mtopRequestCommitTrack(rpcRequest);
            MtopBusiness build = MtopBusiness.build(buildMtopRequest(rpcRequest), DataProviderFactory.getDataProvider().getTTID());
            Map<String, String> additionalHeaders = DataProviderFactory.getDataProvider().getAdditionalHeaders();
            if (additionalHeaders == null) {
                additionalHeaders = new HashMap<>();
            }
            if (LoginSwitch.getSwitch("baxia_switch", "true")) {
                additionalHeaders.put("login_sdk_version", AppInfo.getInstance().getSdkVersion().replace("android_", ""));
            }
            build.headers(additionalHeaders);
            if (!TextUtils.isEmpty(str)) {
                build.setReqUserId(str);
            }
            build.reqMethod(MethodEnum.POST);
            String str2 = rpcRequest.onlineDomain;
            if (str2 == null) {
                str2 = DataProviderFactory.getDataProvider().getOnlineDomain();
            }
            String str3 = rpcRequest.preDomain;
            if (str3 == null) {
                str3 = DataProviderFactory.getDataProvider().getPreDomain();
            }
            String str4 = rpcRequest.dailyDomain;
            if (str4 == null) {
                str4 = DataProviderFactory.getDataProvider().getDailyDomain();
            }
            build.setCustomDomain(str2, str3, str4);
            IntOrangeResult mtopTimeOutMilliSecond = DataProviderFactory.getOrangeConfig().getMtopTimeOutMilliSecond();
            if (mtopTimeOutMilliSecond.orangeExist) {
                build.setConnectionTimeoutMilliSecond(mtopTimeOutMilliSecond.value);
                build.setSocketTimeoutMilliSecond(mtopTimeOutMilliSecond.value);
            } else {
                build.setConnectionTimeoutMilliSecond(rpcRequest.connectionTimeoutMilliSecond);
                build.setSocketTimeoutMilliSecond(rpcRequest.socketTimeoutMilliSecond);
            }
            build.showLoginUI(rpcRequest.SHOW_LOGIN_UI);
            final long currentTimeMillis = System.currentTimeMillis();
            build.addListener((MtopListener) new IRemoteBaseListener() { // from class: com.ali.user.mobile.impl.MTOPWrapper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    String str5;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    LoginTLogAdapter.e(MTOPWrapper.TAG, "onError() called with: requestType = [" + i + "], response = [" + mtopResponse + "], requestContext = [" + obj + "]");
                    if (mtopResponse != null) {
                        str5 = mtopResponse.getRetCode();
                    } else {
                        str5 = "-1";
                    }
                    try {
                        RpcResponse processMtopResponse = MTOPWrapper.this.processMtopResponse(mtopResponse, cls);
                        FilterManager.getInstance().afterRpc(rpcRequest.getAfterFilters(), processMtopResponse);
                        RpcRequestCallback rpcRequestCallback2 = rpcRequestCallback;
                        if (rpcRequestCallback2 != null) {
                            rpcRequestCallback2.onError(processMtopResponse);
                        } else {
                            RpcRequestCallbackWithCode rpcRequestCallbackWithCode2 = rpcRequestCallbackWithCode;
                            if (rpcRequestCallbackWithCode2 != null) {
                                rpcRequestCallbackWithCode2.onError(str5, processMtopResponse);
                            }
                        }
                        MTOPWrapper.access$100(MTOPWrapper.this, mtopResponse);
                        MTOPWrapper.access$200(MTOPWrapper.this, rpcRequest, mtopResponse);
                    } catch (com.ali.user.mobile.exception.RpcException e) {
                        RpcResponse rpcResponse = new RpcResponse();
                        rpcResponse.code = e.getCode();
                        if (TextUtils.equals(e.getMsg(), ResourceUtil.getStringById("aliuser_server_error_msg"))) {
                            rpcResponse.message = e.getMsg();
                        } else {
                            rpcResponse.message = ResourceUtil.getNetworkError();
                        }
                        FilterManager.getInstance().afterRpc(rpcRequest.getAfterFilters(), rpcResponse);
                        RpcRequestCallback rpcRequestCallback3 = rpcRequestCallback;
                        if (rpcRequestCallback3 != null) {
                            rpcRequestCallback3.onError(null);
                        } else {
                            RpcRequestCallbackWithCode rpcRequestCallbackWithCode3 = rpcRequestCallbackWithCode;
                            if (rpcRequestCallbackWithCode3 != null) {
                                rpcRequestCallbackWithCode3.onSystemError(str5, null);
                            }
                        }
                        MTOPWrapper.access$200(MTOPWrapper.this, rpcRequest, mtopResponse);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    LoginTLogAdapter.e("login_optimize", "receive MtopResponse success,time=" + (currentTimeMillis2 - currentTimeMillis) + ";" + mtopResponse);
                    RpcResponse processMtopResponse = MTOPWrapper.this.processMtopResponse(mtopResponse, cls);
                    FilterManager.getInstance().afterRpc(rpcRequest.getAfterFilters(), processMtopResponse);
                    RpcRequestCallback rpcRequestCallback2 = rpcRequestCallback;
                    if (rpcRequestCallback2 != null) {
                        rpcRequestCallback2.onSuccess(processMtopResponse);
                    } else {
                        RpcRequestCallbackWithCode rpcRequestCallbackWithCode2 = rpcRequestCallbackWithCode;
                        if (rpcRequestCallbackWithCode2 != null) {
                            rpcRequestCallbackWithCode2.onSuccess(processMtopResponse);
                        }
                    }
                    MTOPWrapper.access$000(MTOPWrapper.this, rpcRequest, mtopResponse);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    String str5;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    LoginTLogAdapter.e(MTOPWrapper.TAG, "onSystemError() called with: requestType = [" + i + "], response = [" + mtopResponse + "], requestContext = [" + obj + "]");
                    if (mtopResponse != null) {
                        str5 = mtopResponse.getRetCode();
                    } else {
                        str5 = "-1";
                    }
                    try {
                        RpcResponse processMtopResponse = MTOPWrapper.this.processMtopResponse(mtopResponse, cls);
                        FilterManager.getInstance().afterRpc(rpcRequest.getAfterFilters(), processMtopResponse);
                        RpcRequestCallback rpcRequestCallback2 = rpcRequestCallback;
                        if (rpcRequestCallback2 != null) {
                            rpcRequestCallback2.onError(processMtopResponse);
                        } else {
                            RpcRequestCallbackWithCode rpcRequestCallbackWithCode2 = rpcRequestCallbackWithCode;
                            if (rpcRequestCallbackWithCode2 != null) {
                                rpcRequestCallbackWithCode2.onSystemError(str5, processMtopResponse);
                            }
                        }
                        MTOPWrapper.access$100(MTOPWrapper.this, mtopResponse);
                        MTOPWrapper.access$200(MTOPWrapper.this, rpcRequest, mtopResponse);
                    } catch (com.ali.user.mobile.exception.RpcException e) {
                        RpcResponse rpcResponse = new RpcResponse();
                        rpcResponse.code = e.getCode();
                        if (!TextUtils.isEmpty(e.getMsg())) {
                            rpcResponse.message = e.getMsg();
                        } else {
                            rpcResponse.message = ResourceUtil.getNetworkError();
                        }
                        FilterManager.getInstance().afterRpc(rpcRequest.getAfterFilters(), rpcResponse);
                        RpcRequestCallback rpcRequestCallback3 = rpcRequestCallback;
                        if (rpcRequestCallback3 != null) {
                            rpcRequestCallback3.onError(rpcResponse);
                        } else {
                            RpcRequestCallbackWithCode rpcRequestCallbackWithCode3 = rpcRequestCallbackWithCode;
                            if (rpcRequestCallbackWithCode3 != null) {
                                rpcRequestCallbackWithCode3.onSystemError(str5, rpcResponse);
                            }
                        }
                        MTOPWrapper.access$200(MTOPWrapper.this, rpcRequest, mtopResponse);
                    }
                }
            });
            build.startRequest();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
