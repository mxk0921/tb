package com.taobao.android.ultron.datamodel.imp;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.opq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class StreamNextRpcRequester$3 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ opq this$0;

    public StreamNextRpcRequester$3(opq opqVar) {
        this.this$0 = opqVar;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else if (mtopResponse != null) {
            UnifyLog.k(opq.g(this.this$0), "StreamNextRpcRequester", "uploadDataForTest onError", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), UnifyLog.EventType.ERROR, new String[0]);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (mtopResponse != null) {
            UnifyLog.k(opq.g(this.this$0), "StreamNextRpcRequester", "uploadDataForTest onSuccess", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), UnifyLog.EventType.NET_RESPONSE, new String[0]);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else if (mtopResponse != null) {
            UnifyLog.k(opq.g(this.this$0), "StreamNextRpcRequester", "uploadDataForTest onSystemError", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), UnifyLog.EventType.ERROR, new String[0]);
        }
    }
}
