package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.ssrcore.callback.SsrCallbackListener;
import mtopsdk.ssrcore.callback.SsrFinishEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ifq implements wrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.wrd
    public String d(efq efqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4352d871", new Object[]{this, efqVar});
        }
        i7j i7jVar = efqVar.d;
        egq egqVar = efqVar.f;
        mfq.h(i7jVar);
        String str = efqVar.b;
        SsrFinishEvent ssrFinishEvent = new SsrFinishEvent(egqVar);
        ssrFinishEvent.seqNo = str;
        ssrFinishEvent.statistics = i7jVar;
        i7jVar.P = HeaderHandlerUtil.getSingleHeaderFieldByKey(egqVar.d, HttpHeaderConstant.SERVER_TRACE_ID);
        i7jVar.Q = HeaderHandlerUtil.getSingleHeaderFieldByKey(egqVar.d, "eagleeye-traceid");
        if (TextUtils.isEmpty(egqVar.b)) {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(egqVar.d, "x-sec-reason");
            if (!TextUtils.isEmpty(singleHeaderFieldByKey)) {
                i7jVar.v = singleHeaderFieldByKey;
            }
        } else {
            i7jVar.v = egqVar.b;
        }
        i7jVar.u = egqVar.f18565a;
        i7jVar.j();
        MtopListener mtopListener = efqVar.k;
        if (!(mtopListener instanceof SsrCallbackListener)) {
            return "CONTINUE";
        }
        ((SsrCallbackListener) mtopListener).onFinish(ssrFinishEvent);
        return "CONTINUE";
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "ssr.SsrExecuteCallbackAfterFilter";
    }
}
