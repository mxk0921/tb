package com.taobao.tao.remotebusiness.listener;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopStatistics;
import tb.m4j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopFinishListenerImpl extends m4j implements MtopCallback.MtopFinishListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopFinishListenerImpl";

    static {
        t2o.a(589299765);
        t2o.a(589299881);
    }

    public MtopFinishListenerImpl(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        super(mtopBusiness, mtopListener);
    }

    public static /* synthetic */ Object ipc$super(MtopFinishListenerImpl mtopFinishListenerImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/remotebusiness/listener/MtopFinishListenerImpl");
    }

    private void commitFullTrace(MtopFinishEvent mtopFinishEvent, String str) {
        MtopStatistics mtopStat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d73000", new Object[]{this, mtopFinishEvent, str});
        } else if (mtopFinishEvent != null) {
            try {
                MtopResponse mtopResponse = mtopFinishEvent.getMtopResponse();
                if (mtopResponse != null && (mtopStat = mtopResponse.getMtopStat()) != null) {
                    mtopStat.cancelRequest = true;
                    FullTraceHelper.recordRspCbStart(mtopStat);
                    FullTraceHelper.recordRspCbEnd(mtopStat);
                    mtopStat.commitFullTrace();
                }
            } catch (Throwable th) {
                TBSdkLog.e(TAG, str, "commitFullTrace error.", th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFinished(mtopsdk.mtop.common.MtopFinishEvent r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.remotebusiness.listener.MtopFinishListenerImpl.onFinished(mtopsdk.mtop.common.MtopFinishEvent, java.lang.Object):void");
    }
}
