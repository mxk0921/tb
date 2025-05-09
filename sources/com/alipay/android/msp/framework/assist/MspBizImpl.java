package com.alipay.android.msp.framework.assist;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.network.APNetSwitchUtil;
import com.alipay.android.msp.plugin.engine.IBizEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.NetParamLogUtil;
import com.alipay.android.msp.utils.SdkFlavor;
import com.alipay.mobile.common.logging.LoggerFactoryBinder;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.monitor.track.spm.SpmMonitorBinder;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspBizImpl implements IBizEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.plugin.engine.IBizEngine
    public void bindSPMLog(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("259200b0", new Object[]{this, context});
        } else if (context != null) {
            LoggerFactoryBinder.bind(context.getApplicationContext());
            SpmMonitorBinder.bind(context.getApplicationContext());
        } else {
            LogUtil.record(8, "bindSPMLog", "context null");
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IBizEngine
    public Object findUniService(String str, String str2) {
        if (str2.equals("service")) {
            return null;
        }
        try {
            return Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IBizEngine
    public void onException(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17742d4", new Object[]{this, str, th});
        } else {
            SdkFlavor.onException(str, th);
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IBizEngine
    public void printLog(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db09b5b", new Object[]{this, str, new Integer(i)});
        } else {
            SdkFlavor.printLog(str, i);
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IBizEngine
    public void renderH5View(Activity activity, ViewGroup viewGroup, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5303f7fe", new Object[]{this, activity, viewGroup, str, str2, str3});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x0070;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson.JSONObject a(final android.content.Context r16, boolean r17, java.lang.String r18, java.lang.String r19, java.util.Map<java.lang.String, java.lang.String> r20) {
        /*
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = 2
            r6 = 1
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.framework.assist.MspBizImpl.$ipChange
            boolean r7 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x002e
            java.lang.Boolean r7 = new java.lang.Boolean
            r7.<init>(r2)
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r8 = 0
            r2[r8] = r1
            r2[r6] = r7
            r2[r5] = r3
            r1 = 3
            r2[r1] = r4
            r1 = 4
            r2[r1] = r20
            java.lang.String r1 = "e432ac1d"
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            return r0
        L_0x002e:
            com.alipay.mobile.verifyidentity.rpc.IRpcServiceImpl r7 = new com.alipay.mobile.verifyidentity.rpc.IRpcServiceImpl
            r7.<init>()
            boolean r0 = com.alipay.android.msp.pay.GlobalConstant.DEBUG
            java.lang.String r8 = "MspSdkEngine:executeRpc"
            r9 = 0
            if (r0 == 0) goto L_0x00a3
            android.content.ContentResolver r10 = r16.getContentResolver()     // Catch: all -> 0x006c
            java.lang.String r0 = "content://com.alipay.android.app.settings.data.ServerProvider/current_server"
            android.net.Uri r11 = android.net.Uri.parse(r0)     // Catch: all -> 0x006c
            r14 = 0
            r15 = 0
            r12 = 0
            r13 = 0
            android.database.Cursor r0 = r10.query(r11, r12, r13, r14, r15)     // Catch: all -> 0x006c
            if (r0 == 0) goto L_0x0076
            int r10 = r0.getCount()     // Catch: all -> 0x006c
            if (r10 <= 0) goto L_0x0076
            boolean r10 = r0.moveToFirst()     // Catch: all -> 0x006c
            if (r10 == 0) goto L_0x006f
            java.lang.String r10 = "url"
            int r10 = r0.getColumnIndex(r10)     // Catch: all -> 0x006c
            java.lang.String r10 = r0.getString(r10)     // Catch: all -> 0x006c
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: all -> 0x006c
            if (r11 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006c:
            r0 = move-exception
            r10 = r9
            goto L_0x0078
        L_0x006f:
            r10 = r9
        L_0x0070:
            r0.close()     // Catch: all -> 0x0074
            goto L_0x007b
        L_0x0074:
            r0 = move-exception
            goto L_0x0078
        L_0x0076:
            r10 = r9
            goto L_0x007b
        L_0x0078:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0)
        L_0x007b:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x009b
            com.alipay.android.msp.framework.assist.MspBizImpl$1 r0 = new com.alipay.android.msp.framework.assist.MspBizImpl$1
            r0.<init>()
            com.alipay.android.msp.framework.taskscheduler.TaskHelper.runOnUIThread(r0)
            java.lang.String r0 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "url="
            java.lang.String r0 = r1.concat(r0)
            com.alipay.android.msp.utils.LogUtil.record(r6, r8, r0)
            r7.setGW(r10)
            goto L_0x00a3
        L_0x009b:
            com.alipay.android.msp.framework.assist.MspBizImpl$2 r0 = new com.alipay.android.msp.framework.assist.MspBizImpl$2
            r0.<init>()
            com.alipay.android.msp.framework.taskscheduler.TaskHelper.runOnUIThread(r0)
        L_0x00a3:
            java.lang.Class<com.alipay.vi.mobile.framework.service.SimpleRpcService> r0 = com.alipay.vi.mobile.framework.service.SimpleRpcService.class
            java.lang.Object r0 = r7.getRpcProxy(r0)
            com.alipay.vi.mobile.framework.service.SimpleRpcService r0 = (com.alipay.vi.mobile.framework.service.SimpleRpcService) r0
            if (r20 != 0) goto L_0x00b3
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            goto L_0x00b5
        L_0x00b3:
            r1 = r20
        L_0x00b5:
            if (r2 == 0) goto L_0x00c4
            byte[] r2 = android.util.Base64.decode(r4, r5)
            byte[] r0 = r0.executeRPC(r3, r2, r1)
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            goto L_0x00c8
        L_0x00c4:
            java.lang.String r0 = r0.executeRPC(r3, r4, r1)
        L_0x00c8:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "resp : "
            java.lang.String r1 = r2.concat(r1)
            r2 = 8
            com.alipay.android.msp.utils.LogUtil.record(r2, r8, r1)
            if (r0 == 0) goto L_0x00df
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r0)
            return r0
        L_0x00df:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.assist.MspBizImpl.a(android.content.Context, boolean, java.lang.String, java.lang.String, java.util.Map):com.alibaba.fastjson.JSONObject");
    }

    @Override // com.alipay.android.msp.plugin.engine.IBizEngine
    public JSONObject executeRpc(boolean z, String str, String str2, int i, Map<String, String> map) {
        JSONObject jSONObject;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4f73cd3", new Object[]{this, new Boolean(z), str, str2, new Integer(i), map});
        }
        LogUtil.record(2, "MspBizImpl", "executeRpc", "bizId: " + i + " " + str + " " + z);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str5 = "-";
        try {
            Context context = GlobalHelper.getInstance().getContext();
            if (context == null) {
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(MspContextManager.getInstance().getLatestBizId());
                context = mspContextByBizId == null ? null : mspContextByBizId.getContext();
            }
            if (context != null) {
                MicroModuleContext.getInstance().attachContext(context);
            } else {
                DrmKey.sRpcExCount++;
            }
            if (APNetSwitchUtil.shouldIUseStandaloneRpcLib(context)) {
                str5 = "unifyRpc";
                jSONObject = MspBizImplNewRpc.sendRpcUsingStandaloneRpcLibMaybeThrow(context, z, str, str2, map);
            } else {
                str5 = "viRpc";
                jSONObject = a(context, z, str, str2, map);
            }
        } catch (RpcException e) {
            int code = e.getCode();
            LogUtil.printExceptionStackTrace("MspBizImpl", "executeRpc RpcException code:".concat(String.valueOf(code)), e);
            if (code > 1000) {
                str4 = e.getMsg();
            } else {
                str4 = e.getMessage();
            }
            MspContext mspContextByBizId2 = MspContextManager.getInstance().getMspContextByBizId(i);
            if (mspContextByBizId2 != null) {
                mspContextByBizId2.getStatisticInfo().addError(ErrorType.NETWORK, "rpc_" + code + "_" + str, LogUtil.shortRpcLog(e.getMsg()));
            }
            jSONObject = new JSONObject();
            jSONObject.put("error", (Object) String.valueOf(code));
            jSONObject.put("errorMessage", (Object) str4);
        } catch (com.alipay.vi.mobile.common.rpc.RpcException e2) {
            int code2 = e2.getCode();
            LogUtil.printExceptionStackTrace("MspBizImpl", "executeRpc vi RpcException code:".concat(String.valueOf(code2)), e2);
            if (code2 > 1000) {
                str3 = e2.getMsg();
            } else {
                str3 = e2.getMessage();
            }
            MspContext mspContextByBizId3 = MspContextManager.getInstance().getMspContextByBizId(i);
            if (mspContextByBizId3 != null) {
                mspContextByBizId3.getStatisticInfo().addError(ErrorType.NETWORK, "virpc_" + code2 + "_" + str, LogUtil.shortRpcLog(e2.getMsg()));
            }
            jSONObject = new JSONObject();
            jSONObject.put("error", (Object) String.valueOf(code2));
            jSONObject.put("errorMessage", (Object) str3);
        } catch (Throwable th) {
            MspContext mspContextByBizId4 = MspContextManager.getInstance().getMspContextByBizId(i);
            if (mspContextByBizId4 != null) {
                mspContextByBizId4.getStatisticInfo().addError(ErrorType.DEFAULT, "executeRpcError_".concat(String.valueOf(str)), th);
            }
            LogUtil.printExceptionStackTrace("MspBizImpl", "executeRpc Throwable", th);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", (Object) "10001");
            jSONObject2.put("errorMessage", (Object) th.getMessage());
            jSONObject = jSONObject2;
        }
        NetParamLogUtil.rpcLogPrint(z, str5, elapsedRealtime, str, str2, map, jSONObject, null);
        MspContext mspContextByBizId5 = MspContextManager.getInstance().getMspContextByBizId(i);
        if (mspContextByBizId5 != null) {
            mspContextByBizId5.getStatisticInfo().addError("np", "executeRpc_".concat(String.valueOf(str)), str5);
        }
        return jSONObject;
    }
}
