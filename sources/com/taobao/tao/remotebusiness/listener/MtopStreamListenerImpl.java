package com.taobao.tao.remotebusiness.listener;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.handler.HandlerParam;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopConvert;
import mtopsdk.mtop.util.MtopStatistics;
import tb.m4j;
import tb.osa;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopStreamListenerImpl extends m4j implements MtopCallback.MtopStreamListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopStreamListenerImpl";

    static {
        t2o.a(589299768);
        t2o.a(589299884);
    }

    public MtopStreamListenerImpl(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        super(mtopBusiness, mtopListener);
    }

    private MtopResponse abnormalSituation(MtopFinishEvent mtopFinishEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("577f9bbc", new Object[]{this, mtopFinishEvent});
        }
        String seqNo = this.mtopBusiness.getSeqNo();
        if (this.mtopBusiness.isTaskCanceled()) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                TBSdkLog.e(TAG, seqNo, "The request of MtopBusiness is canceled.");
            }
            commitFullTrace(mtopFinishEvent, seqNo);
            return null;
        } else if (this.listener == null) {
            TBSdkLog.e(TAG, seqNo, "The listener of MtopBusiness is null.");
            return null;
        } else if (mtopFinishEvent != null) {
            return mtopFinishEvent.getMtopResponse();
        } else {
            TBSdkLog.e(TAG, seqNo, "MtopFinishEvent is null.");
            return null;
        }
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

    public static /* synthetic */ Object ipc$super(MtopStreamListenerImpl mtopStreamListenerImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/remotebusiness/listener/MtopStreamListenerImpl");
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopStreamListener
    public void onFinish(MtopFinishEvent mtopFinishEvent, Object obj) {
        long j;
        HandlerParam handlerParam;
        String str;
        TBSdkLog.LogEnable logEnable;
        MtopStatistics mtopStatistics;
        MtopStatistics.RbStatisticData rbStatisticData;
        String str2;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57cf75f", new Object[]{this, mtopFinishEvent, obj});
            return;
        }
        String seqNo = this.mtopBusiness.getSeqNo();
        TBSdkLog.LogEnable logEnable2 = TBSdkLog.LogEnable.InfoEnable;
        if (TBSdkLog.isLogEnable(logEnable2)) {
            TBSdkLog.i(TAG, seqNo, "Mtop onFinished event received.");
        }
        MtopResponse abnormalSituation = abnormalSituation(mtopFinishEvent);
        if (abnormalSituation == null) {
            TBSdkLog.e(TAG, seqNo, "The MtopResponse of MtopFinishEvent is null.");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HandlerParam a2 = osa.a(this.listener, mtopFinishEvent, this.mtopBusiness);
        a2.mtopResponse = abnormalSituation;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (!abnormalSituation.isApiSuccess() || this.mtopBusiness.clazz == null || abnormalSituation.getStreamModeData() != null) {
            j = currentTimeMillis2;
        } else {
            a2.pojo = MtopConvert.mtopResponseToOutputDO(abnormalSituation, this.mtopBusiness.clazz);
            j = System.currentTimeMillis();
        }
        this.mtopBusiness.onBgFinishTime = j;
        MtopStatistics mtopStat = abnormalSituation.getMtopStat();
        if (mtopStat != null) {
            rbStatisticData = mtopStat.getRbStatData();
            MtopBusiness mtopBusiness = this.mtopBusiness;
            str = seqNo;
            long j3 = mtopBusiness.sendStartTime;
            handlerParam = a2;
            long j4 = mtopBusiness.reqStartTime;
            logEnable = logEnable2;
            rbStatisticData.beforeReqTime = j3 - j4;
            rbStatisticData.mtopReqTime = currentTimeMillis - j3;
            long j5 = mtopBusiness.onBgFinishTime;
            rbStatisticData.afterReqTime = j5 - currentTimeMillis;
            rbStatisticData.parseTime = currentTimeMillis2 - currentTimeMillis;
            long j6 = j - currentTimeMillis2;
            rbStatisticData.jsonParseTime = j6;
            rbStatisticData.jsonTime = j6;
            long j7 = j5 - j4;
            rbStatisticData.rbReqTime = j7;
            rbStatisticData.totalTime = j7;
            mtopStatistics = mtopStat;
            rbStatisticData.mtopDispatchTime = mtopStat.currentTimeMillis() - mtopStatistics.startCallbackTime;
        } else {
            handlerParam = a2;
            str = seqNo;
            logEnable = logEnable2;
            mtopStatistics = mtopStat;
            rbStatisticData = null;
        }
        if (this.mtopBusiness.mtopProp.handler != null) {
            if (TBSdkLog.isLogEnable(logEnable)) {
                str2 = str;
                TBSdkLog.i(TAG, str2, "onReceive: ON_FINISHED in self-defined handler.");
            } else {
                str2 = str;
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            if (mtopStatistics != null) {
                FullTraceHelper.recordRspCbStart(mtopStatistics);
            }
            handlerParam.mtopBusiness.doStreamFinish(handlerParam.mtopResponse, handlerParam.pojo);
            if (mtopStatistics != null) {
                FullTraceHelper.recordRspCbEnd(mtopStatistics);
                mtopStatistics.commitFullTrace();
            }
            if (TBSdkLog.isLogEnable(logEnable)) {
                if (handlerParam.mtopResponse.getBytedata() != null) {
                    j2 = handlerParam.mtopResponse.getBytedata().length;
                } else {
                    j2 = 0;
                }
                StringBuilder sb = new StringBuilder(128);
                sb.append("onReceive: ON_FINISHED in self-defined handler.doFinishTime=");
                sb.append(System.currentTimeMillis() - currentTimeMillis3);
                sb.append(", dataSize=");
                sb.append(j2);
                sb.append("; ");
                if (rbStatisticData != null) {
                    sb.append(rbStatisticData.toString());
                }
                TBSdkLog.i(TAG, str2, sb.toString());
            }
            if (mtopStatistics != null) {
                mtopStatistics.commitStatData(true);
                return;
            }
            return;
        }
        if (mtopStatistics != null) {
            FullTraceHelper.recordRspCbDispatch(mtopStatistics);
        }
        osa.b().obtainMessage(11, handlerParam).sendToTarget();
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopStreamListener
    public void onReceiveData(MtopFinishEvent mtopFinishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ff6763", new Object[]{this, mtopFinishEvent, obj});
            return;
        }
        String seqNo = this.mtopBusiness.getSeqNo();
        TBSdkLog.LogEnable logEnable = TBSdkLog.LogEnable.InfoEnable;
        if (TBSdkLog.isLogEnable(logEnable)) {
            TBSdkLog.i(TAG, seqNo, "Mtop onReceiveData");
        }
        MtopResponse abnormalSituation = abnormalSituation(mtopFinishEvent);
        if (abnormalSituation == null) {
            TBSdkLog.e(TAG, seqNo, "The MtopResponse of MtopFinishEvent is null.");
            return;
        }
        MtopBusiness mtopBusiness = this.mtopBusiness;
        if (mtopBusiness.onStreamFirstResReadyTime <= 0) {
            mtopBusiness.onStreamFirstResReadyTime = System.currentTimeMillis();
        }
        HandlerParam a2 = osa.a(this.listener, mtopFinishEvent, this.mtopBusiness);
        a2.mtopResponse = abnormalSituation;
        if (this.mtopBusiness.clazz != null) {
            if (TextUtils.isEmpty(abnormalSituation.getRetCode())) {
                abnormalSituation.parseJsonByte();
            }
            if (abnormalSituation.isApiSuccess()) {
                a2.pojo = MtopConvert.mtopResponseToOutputDO(abnormalSituation, this.mtopBusiness.clazz);
            }
        }
        if (this.mtopBusiness.mtopProp.handler != null) {
            if (TBSdkLog.isLogEnable(logEnable)) {
                TBSdkLog.i(TAG, seqNo, "onReceive: ON_FINISHED in self-defined handler.");
            }
            a2.mtopBusiness.doStreamReceiveData(a2.mtopResponse, a2.pojo);
            return;
        }
        osa.b().obtainMessage(10, a2).sendToTarget();
    }
}
