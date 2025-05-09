package com.taobao.tao.remotebusiness.listener;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteProcessListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopHeaderEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.common.MtopProgressEvent;
import tb.m4j;
import tb.osa;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopProgressListenerImpl extends m4j implements MtopCallback.MtopProgressListener, MtopCallback.MtopHeaderListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopProgressListenerImpl";

    static {
        t2o.a(589299767);
        t2o.a(589299883);
        t2o.a(589299882);
    }

    public MtopProgressListenerImpl(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        super(mtopBusiness, mtopListener);
    }

    public static /* synthetic */ Object ipc$super(MtopProgressListenerImpl mtopProgressListenerImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/remotebusiness/listener/MtopProgressListenerImpl");
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopProgressListener
    public void onDataReceived(MtopProgressEvent mtopProgressEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea8f321", new Object[]{this, mtopProgressEvent, obj});
            return;
        }
        String seqNo = this.mtopBusiness.getSeqNo();
        TBSdkLog.LogEnable logEnable = TBSdkLog.LogEnable.InfoEnable;
        if (TBSdkLog.isLogEnable(logEnable)) {
            TBSdkLog.i(TAG, seqNo, "Mtop onDataReceived event received.");
        }
        if (!this.mtopBusiness.isTaskCanceled()) {
            MtopListener mtopListener = this.listener;
            if (mtopListener instanceof IRemoteProcessListener) {
                MtopBusiness mtopBusiness = this.mtopBusiness;
                if (mtopBusiness.mtopProp.handler != null) {
                    if (TBSdkLog.isLogEnable(logEnable)) {
                        TBSdkLog.i(TAG, seqNo, "onReceive: ON_DATA_RECEIVED in self-defined handler.");
                    }
                    try {
                        ((IRemoteProcessListener) this.listener).onDataReceived(mtopProgressEvent, obj);
                    } catch (Throwable th) {
                        TBSdkLog.e(TAG, seqNo, "listener onDataReceived callback error in self-defined handler.", th);
                    }
                } else {
                    osa.b().obtainMessage(1, osa.a(mtopListener, mtopProgressEvent, mtopBusiness)).sendToTarget();
                }
            }
        } else if (TBSdkLog.isLogEnable(logEnable)) {
            TBSdkLog.i(TAG, seqNo, "The request of MtopBusiness is cancelled.");
        }
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopHeaderListener
    public void onHeader(MtopHeaderEvent mtopHeaderEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d28e9f", new Object[]{this, mtopHeaderEvent, obj});
            return;
        }
        String seqNo = this.mtopBusiness.getSeqNo();
        TBSdkLog.LogEnable logEnable = TBSdkLog.LogEnable.InfoEnable;
        if (TBSdkLog.isLogEnable(logEnable)) {
            TBSdkLog.i(TAG, seqNo, "Mtop onHeader event received.");
        }
        if (!this.mtopBusiness.isTaskCanceled()) {
            MtopListener mtopListener = this.listener;
            if (mtopListener instanceof IRemoteProcessListener) {
                MtopBusiness mtopBusiness = this.mtopBusiness;
                if (mtopBusiness.mtopProp.handler != null) {
                    if (TBSdkLog.isLogEnable(logEnable)) {
                        TBSdkLog.i(TAG, seqNo, "onReceive: ON_HEADER in self-defined handler.");
                    }
                    try {
                        ((IRemoteProcessListener) this.listener).onHeader(mtopHeaderEvent, obj);
                    } catch (Throwable th) {
                        TBSdkLog.e(TAG, seqNo, "listener onHeader callback error in self-defined handler.", th);
                    }
                } else {
                    osa.b().obtainMessage(2, osa.a(mtopListener, mtopHeaderEvent, mtopBusiness)).sendToTarget();
                }
            }
        } else if (TBSdkLog.isLogEnable(logEnable)) {
            TBSdkLog.i(TAG, seqNo, "The request of MtopBusiness is cancelled.");
        }
    }
}
