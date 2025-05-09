package com.taobao.android.trade.cart.provider.msoa;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.rrh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RemoteListener implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String requestId;

    static {
        t2o.a(697303053);
        t2o.a(589299719);
    }

    public RemoteListener(String str) {
        this.requestId = str;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("requestType", Integer.valueOf(i));
        hashMap.put("response", mtopResponse);
        hashMap.put("context", obj);
        String str = "mtopResponse is null";
        String retCode = mtopResponse != null ? mtopResponse.getRetCode() : str;
        if (mtopResponse != null) {
            str = mtopResponse.getRetMsg();
        }
        rrh.e().i(this.requestId, retCode, str, hashMap);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("requestType", Integer.valueOf(i));
        hashMap.put("response", mtopResponse);
        hashMap.put("data", baseOutDo);
        hashMap.put("context", obj);
        rrh.e().l(this.requestId, hashMap);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("requestType", Integer.valueOf(i));
        hashMap.put("response", mtopResponse);
        hashMap.put("context", obj);
        String str = "mtopResponse is null";
        String retCode = mtopResponse != null ? mtopResponse.getRetCode() : str;
        if (mtopResponse != null) {
            str = mtopResponse.getRetMsg();
        }
        rrh.e().g(this.requestId, retCode, str, hashMap);
    }
}
