package com.alipay.mobile.verifyidentity.rpc.biz;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.common.VerifyType;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.TaskManager;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.DebugViewer;
import com.alipay.mobile.verifyidentity.log.TimeCostLog;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannel;
import com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannelCallback;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobileic.core.model.rpc.MICInitRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.alipay.mobileic.core.model.rpc.MICReportRequest;
import com.alipay.mobileic.core.model.rpc.MICReportResponse;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MICRpcServiceBiz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_ERROR_FORCE_TO_SUCCESS = "-1002";
    public static final String CHANNEL_ERROR_NET_ERROR = "-1001";
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public VerifyIdentityTask c;
    public final String macao_url = CommonConstant.MACAO_GW_URL_DEF_FLAG;
    public final String NEW_INTERNATIONAL_URL = CommonConstant.NEW_INTERNATIONAL_URL;

    /* renamed from: a  reason: collision with root package name */
    public final Object f4435a = new Object();
    public MICRpcResponse b = null;

    public static /* synthetic */ Object access$000(MICRpcServiceBiz mICRpcServiceBiz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cd6562ec", new Object[]{mICRpcServiceBiz});
        }
        return mICRpcServiceBiz.f4435a;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return "MICRpcServiceBiz";
    }

    public static /* synthetic */ MICRpcResponse access$202(MICRpcServiceBiz mICRpcServiceBiz, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("901d72aa", new Object[]{mICRpcServiceBiz, mICRpcResponse});
        }
        mICRpcServiceBiz.b = mICRpcResponse;
        return mICRpcResponse;
    }

    public static boolean getIsSendRpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("accddc08", new Object[0])).booleanValue();
        }
        return d.get();
    }

    public final VerifyIdentityTask a() {
        VerifyIdentityTask verifyIdentityTask;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityTask) ipChange.ipc$dispatch("e69dab5e", new Object[]{this});
        }
        if (!VIUtils.isMultiTaskModeEnabled() || (verifyIdentityTask = this.c) == null) {
            return TaskManager.getInstance().getCurrentTask();
        }
        return verifyIdentityTask;
    }

    public final void d(String str, String str2, Exception exc, RpcException rpcException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114a3c41", new Object[]{this, str, str2, exc, rpcException});
            return;
        }
        try {
            Integer valueOf = Integer.valueOf(String.valueOf(ReflectUtils.invokeMethod(exc, str, null, null)));
            valueOf.intValue();
            invokeSuperMethod(rpcException, str2, new Class[]{Integer.TYPE}, new Object[]{valueOf});
        } catch (Throwable unused) {
        }
    }

    public final void e(String str, String str2, Exception exc, RpcException rpcException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4c34e42", new Object[]{this, str, str2, exc, rpcException});
            return;
        }
        try {
            Object invokeMethod = ReflectUtils.invokeMethod(exc, str, null, null);
            if (invokeMethod != null) {
                invokeSuperMethod(rpcException, str2, new Class[]{String.class}, new Object[]{String.valueOf(invokeMethod)});
            }
        } catch (Throwable unused) {
        }
    }

    public final void f(String str, String str2, Exception exc, RpcException rpcException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783c6043", new Object[]{this, str, str2, exc, rpcException});
            return;
        }
        try {
            Boolean valueOf = Boolean.valueOf(String.valueOf(ReflectUtils.invokeMethod(exc, str, null, null)));
            valueOf.booleanValue();
            invokeSuperMethod(rpcException, str2, new Class[]{Boolean.TYPE}, new Object[]{valueOf});
        } catch (Throwable unused) {
        }
    }

    public Object invokeSuperMethod(Object obj, String str, Class[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = obj.getClass().getSuperclass().getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public MICProdmngResponse prodmng(MICProdmngRequest mICProdmngRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICProdmngResponse) ipChange.ipc$dispatch("e28817c6", new Object[]{this, mICProdmngRequest});
        }
        try {
            return new MICRpcServiceBizBase(null).prodmng(mICProdmngRequest);
        } catch (Exception e) {
            viRpcExceptionAdapter(e);
            throw e;
        }
    }

    public MICReportResponse report(MICReportRequest mICReportRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICReportResponse) ipChange.ipc$dispatch("3553a29f", new Object[]{this, mICReportRequest});
        }
        try {
            return new MICRpcServiceBizBase(null).report(mICReportRequest);
        } catch (Exception e) {
            viRpcExceptionAdapter(e);
            throw e;
        }
    }

    public void setTask(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60bf55fe", new Object[]{this, verifyIdentityTask});
        } else {
            this.c = verifyIdentityTask;
        }
    }

    public void writeRpcBackLog(MICRpcResponse mICRpcResponse, String str, String str2, long j, Map<String, String> map) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8402d5", new Object[]{this, mICRpcResponse, str, str2, new Long(j), map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (mICRpcResponse != null) {
            map.put("rpcSuccess", String.valueOf(mICRpcResponse.success));
            map.put("rpcCode", mICRpcResponse.sysErrCode);
            map.put(Constants.VI_ENGINE_FAST_MODULENAME, mICRpcResponse.nextStep);
            map.put(ModuleConstants.VI_TASK_VERIFYCODE, mICRpcResponse.verifyCode);
            map.put("verifySuccess", String.valueOf(mICRpcResponse.verifySuccess));
            map.put("useBird", mICRpcResponse.useBird);
            if (!TextUtils.isEmpty(mICRpcResponse.channelError)) {
                map.put("channelError", mICRpcResponse.channelError);
            }
        } else {
            map.put("rpcSuccess", "false");
        }
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-160323-2", Constants.VI_ENGINE_APPID, "hsrpcfh", str, str2, String.valueOf(SystemClock.elapsedRealtime() - j), map, 1);
        StringBuilder sb = new StringBuilder("本次RPC耗时[");
        if (mICRpcResponse != null) {
            str3 = mICRpcResponse.nextStep;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append("]：");
        TimeCostLog.log("MICRpcServiceBiz", sb.toString(), j);
    }

    public void writeRpcSendLog(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a92114", new Object[]{this, str, str2, map});
        } else {
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-160323-1", Constants.VI_ENGINE_APPID, "hsrpcqd", str, str2, null, map, 1);
        }
    }

    public final MICRpcResponse b(VIMessageChannel vIMessageChannel, MICRpcRequest mICRpcRequest) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("3334cded", new Object[]{this, vIMessageChannel, mICRpcRequest});
        }
        Bundle bundle = new Bundle();
        bundle.putString("action", "viRpcRequest");
        bundle.putString("data", JSON.toJSONString(mICRpcRequest));
        vIMessageChannel.onAction(bundle, new VIMessageChannelCallback() { // from class: com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannelCallback
            public void onResult(Bundle bundle2) {
                Object access$000;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4d1d691", new Object[]{this, bundle2});
                    return;
                }
                synchronized (MICRpcServiceBiz.access$000(MICRpcServiceBiz.this)) {
                    try {
                        String access$100 = MICRpcServiceBiz.access$100();
                        VerifyLogCat.i(access$100, "RpcProxy return the Result: " + bundle2);
                        String string = bundle2.getString("data");
                        String access$1002 = MICRpcServiceBiz.access$100();
                        VerifyLogCat.i(access$1002, "RpcProxy rpcResponse: " + string);
                        MICRpcServiceBiz.access$202(MICRpcServiceBiz.this, (MICRpcResponse) JSON.parseObject(string, MICRpcResponse.class));
                        access$000 = MICRpcServiceBiz.access$000(MICRpcServiceBiz.this);
                    } catch (Exception e) {
                        VerifyLogCat.w(MICRpcServiceBiz.access$100(), "Failed to parse the RpcProxy Result!", e);
                        access$000 = MICRpcServiceBiz.access$000(MICRpcServiceBiz.this);
                    }
                    access$000.notifyAll();
                }
            }
        });
        synchronized (this.f4435a) {
            try {
                VerifyLogCat.i("MICRpcServiceBiz", "Start to wait for the result from RpcProxy.");
                this.f4435a.wait();
            } catch (InterruptedException e) {
                VerifyLogCat.w("MICRpcServiceBiz", "waiting is interrupted: " + e);
            }
        }
        VerifyLogCat.i("MICRpcServiceBiz", "RpcProxy Result is here.");
        MICRpcResponse mICRpcResponse = this.b;
        if (mICRpcResponse != null) {
            String str = mICRpcResponse.channelError;
            if (!TextUtils.isEmpty(str)) {
                this.b = null;
                VerifyLogCat.i("MICRpcServiceBiz", "rpc代理模式出现 channelError: " + str);
                if ("-1002".equalsIgnoreCase(str)) {
                    VerifyLogCat.i("MICRpcServiceBiz", "通道返回要求立即按成功处理（如收银台sync结果先到）");
                    MICRpcResponse defSucMICRpcResponse = VIUtils.getDefSucMICRpcResponse(mICRpcRequest.verifyId, mICRpcRequest.token);
                    defSucMICRpcResponse.channelError = str;
                    return defSucMICRpcResponse;
                }
                try {
                    i = Integer.valueOf(str).intValue();
                } catch (Exception unused) {
                }
                throw new RpcException(Integer.valueOf(i), str);
            }
        }
        MICRpcResponse mICRpcResponse2 = this.b;
        this.b = null;
        return mICRpcResponse2;
    }

    public final void c(Exception exc, String str, String str2, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f223173", new Object[]{this, exc, str, str2, new Long(j), map});
            return;
        }
        try {
            viRpcExceptionAdapter(exc);
        } catch (RpcException e) {
            writeRpcBackLog(null, str, str2, j, map);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(CommonConstant.EXCEPTION_TYPE, "vi_rpc_error");
                hashMap.put(CommonConstant.EXCEPTION_INFO, String.valueOf(e.getCode()));
                VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, CommonConstant.EXCEPTION_CASE_ID, Constants.VI_ENGINE_APPID, CommonConstant.EXCEPTION_BIZ, null, null, null, hashMap);
            } catch (Throwable th) {
                VerifyLogCat.w("MICRpcServiceBiz", "logBehavior Exception", th);
            }
            d.set(false);
            throw e;
        }
    }

    public void viRpcExceptionAdapter(Exception exc) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3468fe4d", new Object[]{this, exc});
            return;
        }
        String name = exc.getClass().getName();
        if (!TextUtils.isEmpty(name) && name.contains("RpcException")) {
            VerifyLogCat.i("MICRpcServiceBiz", "出现RPC异常");
            try {
                i = Integer.valueOf(String.valueOf(ReflectUtils.invokeMethod(exc, "getCode", null, null))).intValue();
            } catch (Throwable unused) {
            }
            Object invokeMethod = ReflectUtils.invokeMethod(exc, "getOperationType", null, null);
            RpcException rpcException = new RpcException(Integer.valueOf(i), exc.getCause());
            rpcException.setOperationType(String.valueOf(invokeMethod));
            d("getAlert", "setAlert", exc, rpcException);
            d("getErrorSource", "setErrorSource", exc, rpcException);
            e("getMsg", "setMsg", exc, rpcException);
            e("getControl", "setControl", exc, rpcException);
            f("isControlOwn", "setControlOwn", exc, rpcException);
            f(HeaderConstant.HEADER_KEY_ISBGRPC, "setBgRpc", exc, rpcException);
            throw rpcException;
        }
    }

    public MICRpcResponse initVerifyTask(MICInitRequest mICInitRequest) {
        Exception e;
        String str;
        AtomicBoolean atomicBoolean;
        MICRpcResponse initVerifyTask;
        String str2;
        String str3;
        String str4 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("999d4abe", new Object[]{this, mICInitRequest});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("sceneId", mICInitRequest.sceneId);
        hashMap.put("bizId", mICInitRequest.bizId);
        hashMap.put("operationType", "alipay.mobile.ic.init.outer");
        try {
            atomicBoolean = d;
            atomicBoolean.set(true);
            String str5 = null;
            writeRpcSendLog(null, null, hashMap);
            VerifyIdentityTask a2 = a();
            if (a2 != null) {
                str5 = a2.gwUrl;
            }
            if (a2 != null) {
                String verifyId = a2.getVerifyId();
                if (a2.isIPay) {
                    str5 = CommonConstant.MACAO_GW_URL_DEF_FLAG;
                    if (VIUtils.isInExport() && verifyId != null && verifyId.endsWith("_sg_site")) {
                        str5 = CommonConstant.NEW_INTERNATIONAL_URL;
                    }
                }
            }
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
            DebugViewer.getInstance().sendRpc(valueOf, mICInitRequest);
            initVerifyTask = new MICRpcServiceBizBase(str5).initVerifyTask(mICInitRequest);
            DebugViewer.getInstance().gotRpcResult(valueOf, initVerifyTask);
            if (initVerifyTask != null) {
                str3 = initVerifyTask.token;
                try {
                    str2 = initVerifyTask.verifyId;
                } catch (Exception e2) {
                    e = e2;
                    str = str4;
                    str4 = str3;
                    c(e, str4, str, elapsedRealtime, hashMap);
                    throw e;
                }
            } else {
                str3 = str4;
                str2 = str3;
            }
        } catch (Exception e3) {
            e = e3;
            str = str4;
        }
        try {
            writeRpcBackLog(initVerifyTask, str3, str2, elapsedRealtime, hashMap);
            atomicBoolean.set(false);
            return initVerifyTask;
        } catch (Exception e4) {
            e = e4;
            str4 = str3;
            str = str2;
            c(e, str4, str, elapsedRealtime, hashMap);
            throw e;
        }
    }

    public MICRpcResponse dispatch(MICRpcRequest mICRpcRequest) {
        boolean z;
        boolean z2;
        String str;
        MICRpcResponse mICRpcResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("b4d8c751", new Object[]{this, mICRpcRequest});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("module", mICRpcRequest.module);
        hashMap.put("operationType", "alipay.mobile.ic.dispatch");
        hashMap.put("action", mICRpcRequest.action);
        String str2 = mICRpcRequest.data;
        if (str2 != null) {
            hashMap.put("data-length", String.valueOf(str2.length()));
        }
        String str3 = mICRpcRequest.token;
        String str4 = mICRpcRequest.verifyId;
        try {
            AtomicBoolean atomicBoolean = d;
            atomicBoolean.set(true);
            VerifyIdentityTask a2 = a();
            if (a2 != null) {
                mICRpcRequest.bizRequestData = a2.bizRequestData;
                if (!VerifyType.FAST_DIRECT.equals(a2.getVerifyType()) || !a2.needReportEnvInfo) {
                    VerifyLogCat.i("MICRpcServiceBiz", "no need to report envinfo again");
                } else {
                    mICRpcRequest.envData = EnvInfoUtil.getEnvInfo();
                    a2.needReportEnvInfo = false;
                }
                if (a2.isIPay) {
                    str = CommonConstant.MACAO_GW_URL_DEF_FLAG;
                    if (VIUtils.isInExport() && str4 != null && str4.endsWith("_sg_site")) {
                        str = CommonConstant.NEW_INTERNATIONAL_URL;
                    }
                } else {
                    str = a2.gwUrl;
                }
                z2 = a2.resetCookie;
                z = a2.isLoginRPC;
            } else {
                str = null;
                z2 = false;
                z = false;
            }
            writeRpcSendLog(mICRpcRequest.token, mICRpcRequest.verifyId, hashMap);
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
            DebugViewer.getInstance().sendRpc(valueOf, mICRpcRequest);
            if (a2 == null || a2.getVIMessageChannel() == null || a2.canNotUseRpcChannel || mICRpcRequest.canNotUseRpcChannel) {
                MICRpcServiceBizBase mICRpcServiceBizBase = new MICRpcServiceBizBase(str);
                mICRpcServiceBizBase.setResetCookie(z2);
                mICRpcServiceBizBase.setIsLoginRPC(z);
                mICRpcResponse = (str4 == null || !str4.endsWith("_mobileicfacelog_site")) ? mICRpcServiceBizBase.dispatch(mICRpcRequest) : mICRpcServiceBizBase.dispatchFaceLogin(mICRpcRequest);
            } else {
                mICRpcResponse = b(a2.getVIMessageChannel(), mICRpcRequest);
                if (mICRpcResponse != null && !TextUtils.isEmpty(mICRpcResponse.channelError)) {
                    hashMap.put("channelError", mICRpcResponse.channelError);
                }
            }
            DebugViewer.getInstance().gotRpcResult(valueOf, mICRpcResponse);
            writeRpcBackLog(mICRpcResponse, str3, str4, elapsedRealtime, hashMap);
            atomicBoolean.set(false);
            return mICRpcResponse;
        } catch (Exception e) {
            c(e, str3, str4, elapsedRealtime, hashMap);
            throw e;
        }
    }

    public MICRpcResponse trigger(MICRpcRequest mICRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("f5f528f", new Object[]{this, mICRpcRequest});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("module", mICRpcRequest.module);
        hashMap.put("operationType", "alipay.mobile.ic.trigger.pb.v2");
        hashMap.put("action", mICRpcRequest.action);
        String str = mICRpcRequest.data;
        if (str != null) {
            hashMap.put("data-length", String.valueOf(str.length()));
        }
        String str2 = mICRpcRequest.token;
        String str3 = mICRpcRequest.verifyId;
        try {
            AtomicBoolean atomicBoolean = d;
            atomicBoolean.set(true);
            mICRpcRequest.envData = EnvInfoUtil.getEnvData(null);
            writeRpcSendLog(mICRpcRequest.token, mICRpcRequest.verifyId, hashMap);
            MICRpcResponse trigger = new MICRpcServiceBizBase(null).trigger(mICRpcRequest);
            writeRpcBackLog(trigger, str2, str3, elapsedRealtime, hashMap);
            atomicBoolean.set(false);
            return trigger;
        } catch (Exception e) {
            c(e, str2, str3, elapsedRealtime, hashMap);
            throw e;
        }
    }
}
