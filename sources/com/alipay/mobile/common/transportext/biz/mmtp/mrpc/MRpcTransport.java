package com.alipay.mobile.common.transportext.biz.mmtp.mrpc;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcConnection;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcStream;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcRequest;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcResponse;
import com.alipay.mobile.common.transportext.biz.util.AmnetLimitingHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MRpcTransport {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MRpcStream f4203a;

    public final int a(MRpcRequest mRpcRequest, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2657bcda", new Object[]{this, mRpcRequest, new Integer(i)})).intValue();
        }
        Map<String, String> headers = mRpcRequest.getHeaders();
        if (headers == null || headers.isEmpty() || !TextUtils.equals(headers.get(HeaderConstant.HEADER_KEY_OPERATION_TYPE), "alipay.mobilechat.sendMsg")) {
            return i;
        }
        LogCatUtil.info("MRpcTransport", "setStreamTimeout,sendMsg timeout: 180000");
        return 180000;
    }

    public final void c(MRpcRequest mRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a734681d", new Object[]{this, mRpcRequest});
            return;
        }
        try {
            String str = mRpcRequest.getHeaders().get(HeaderConstant.HEADER_KEY_PARAM_TRACEID);
            if (!TextUtils.isEmpty(str)) {
                String str2 = str + "_" + mRpcRequest.reqSeqId;
                mRpcRequest.addHeader(HeaderConstant.HEADER_KEY_PARAM_TRACEID, str2);
                TransportContext value = TransportContextThreadLocalUtils.getValue();
                if (value != null) {
                    value.rpcUUID = str2;
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("MRpcTransport", "setTraceId exception", th);
        }
    }

    public MRpcResponse execute(MRpcRequest mRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcResponse) ipChange.ipc$dispatch("b9f463cc", new Object[]{this, mRpcRequest});
        }
        if (AmnetLimitingHelper.isServerLimiting()) {
            return AmnetLimitingHelper.getLimitingMRpcResponse();
        }
        sendRequest(mRpcRequest);
        return getResponse();
    }

    public MRpcConnection getMRpcConneciton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcConnection) ipChange.ipc$dispatch("8aa5cb9b", new Object[]{this});
        }
        return MRpcConnection.getInstance();
    }

    public MRpcResponse getResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcResponse) ipChange.ipc$dispatch("f375e5da", new Object[]{this});
        }
        return this.f4203a.getResponse();
    }

    public String getTargetHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4121f38a", new Object[]{this});
        }
        MRpcConnection mRpcConneciton = getMRpcConneciton();
        String currentTargetHost = mRpcConneciton.getCurrentTargetHost();
        if (TextUtils.isEmpty(currentTargetHost)) {
            return "";
        }
        return currentTargetHost + ":" + mRpcConneciton.getCurrentTargetPort();
    }

    public void sendRequest(MRpcRequest mRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28d5222", new Object[]{this, mRpcRequest});
            return;
        }
        MRpcStream newMRpcStream = getMRpcConneciton().newMRpcStream();
        this.f4203a = newMRpcStream;
        newMRpcStream.setLocalAmnet(mRpcRequest.localAmnet);
        mRpcRequest.addHeader(HeaderConstant.HEADER_KEY_RPCID, String.valueOf(this.f4203a.getStreamId()));
        mRpcRequest.reqSeqId = this.f4203a.getStreamId();
        c(mRpcRequest);
        b(mRpcRequest);
        this.f4203a.sendRequest(mRpcRequest);
        LogCatUtil.debug("MRpcTransport", " rpcid = " + this.f4203a.getStreamId() + " API=" + mRpcRequest.getHeaders().get(HeaderConstant.HEADER_KEY_OPERATION_TYPE));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcRequest r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 2
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.common.transportext.biz.mmtp.mrpc.MRpcTransport.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "a665e99c"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            r1[r4] = r6
            r1[r0] = r7
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0015:
            int r2 = r7.readTimeout
            com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcConnection r3 = com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcConnection.getInstance()
            int r3 = r3.getConnectionState()
            java.lang.String r4 = ")="
            java.lang.String r5 = "MRpcTransport"
            if (r3 == 0) goto L_0x0060
            if (r3 == r0) goto L_0x0060
            if (r3 == r1) goto L_0x0042
            r0 = 3
            if (r3 == r0) goto L_0x0042
            r0 = 5
            if (r3 == r0) goto L_0x0060
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setStreamTimeout.STATE_ESTABLISHED:"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.alipay.mobile.common.transport.utils.LogCatUtil.info(r5, r0)
            goto L_0x008a
        L_0x0042:
            int r0 = r7.sslTimeout
            int r2 = r2 + r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setStreamTimeout. STATE_HANDSHAKING. (+="
            r0.<init>(r1)
            int r1 = r7.sslTimeout
            r0.append(r1)
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.alipay.mobile.common.transport.utils.LogCatUtil.info(r5, r0)
            goto L_0x008a
        L_0x0060:
            int r0 = r7.connTimeout
            int r1 = r7.sslTimeout
            int r0 = r0 + r1
            int r2 = r2 + r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setStreamTimeout. STATE_SHUTTING. (+="
            r0.<init>(r1)
            int r1 = r7.connTimeout
            r0.append(r1)
            java.lang.String r1 = "+"
            r0.append(r1)
            int r1 = r7.sslTimeout
            r0.append(r1)
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.alipay.mobile.common.transport.utils.LogCatUtil.info(r5, r0)
        L_0x008a:
            boolean r0 = r7.important
            if (r0 == 0) goto L_0x00a2
            int r2 = r2 + 5000
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setStreamTimeout. important is true. (+=5000)="
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.alipay.mobile.common.transport.utils.LogCatUtil.info(r5, r0)
        L_0x00a2:
            int r0 = r6.a(r7, r2)
            com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcStream r1 = r6.f4203a
            r1.setTimeout(r0)
            r7.taskTimeout = r0
            r1 = 15000(0x3a98, float:2.102E-41)
            if (r0 >= r1) goto L_0x00b3
            r7.taskTimeout = r1
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.mmtp.mrpc.MRpcTransport.b(com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcRequest):void");
    }
}
