package mtopsdk.mtop.common;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class DefaultMtopCallback implements MtopCallback.MtopProgressListener, MtopCallback.MtopFinishListener, MtopCallback.MtopHeaderListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.DefaultMtopCallback";

    static {
        t2o.a(589299876);
        t2o.a(589299883);
        t2o.a(589299881);
        t2o.a(589299882);
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopProgressListener
    public void onDataReceived(MtopProgressEvent mtopProgressEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea8f321", new Object[]{this, mtopProgressEvent, obj});
        } else if (mtopProgressEvent != null && TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            String str = mtopProgressEvent.seqNo;
            TBSdkLog.d(TAG, str, "[onDataReceived]" + mtopProgressEvent.toString());
        }
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
    public void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj});
        } else if (mtopFinishEvent != null && mtopFinishEvent.getMtopResponse() != null && TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            String str = mtopFinishEvent.seqNo;
            TBSdkLog.d(TAG, str, "[onFinished]" + mtopFinishEvent.getMtopResponse().toString());
        }
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopHeaderListener
    public void onHeader(MtopHeaderEvent mtopHeaderEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d28e9f", new Object[]{this, mtopHeaderEvent, obj});
        } else if (mtopHeaderEvent != null && TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            String str = mtopHeaderEvent.seqNo;
            TBSdkLog.d(TAG, str, "[onHeader]" + mtopHeaderEvent.toString());
        }
    }
}
