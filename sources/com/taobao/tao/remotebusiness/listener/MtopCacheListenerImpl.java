package com.taobao.tao.remotebusiness.listener;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteCacheListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.handler.HandlerParam;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopConvert;
import mtopsdk.mtop.util.MtopStatistics;
import tb.m4j;
import tb.osa;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopCacheListenerImpl extends m4j implements MtopCallback.MtopCacheListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopCacheListenerImpl";

    static {
        t2o.a(589299764);
        t2o.a(589299880);
    }

    public MtopCacheListenerImpl(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        super(mtopBusiness, mtopListener);
    }

    public static /* synthetic */ Object ipc$super(MtopCacheListenerImpl mtopCacheListenerImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/remotebusiness/listener/MtopCacheListenerImpl");
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopCacheListener
    public void onCached(MtopCacheEvent mtopCacheEvent, Object obj) {
        BaseOutDo baseOutDo;
        MtopStatistics.RbStatisticData rbStatisticData;
        Class<?> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0c28d9", new Object[]{this, mtopCacheEvent, obj});
            return;
        }
        String seqNo = this.mtopBusiness.getSeqNo();
        TBSdkLog.LogEnable logEnable = TBSdkLog.LogEnable.InfoEnable;
        if (TBSdkLog.isLogEnable(logEnable)) {
            TBSdkLog.i(TAG, seqNo, "Mtop onCached event received. apiKey=" + this.mtopBusiness.request.getKey());
        }
        if (this.mtopBusiness.isTaskCanceled()) {
            if (TBSdkLog.isLogEnable(logEnable)) {
                TBSdkLog.i(TAG, seqNo, "The request of MtopBusiness is cancelled.");
            }
        } else if (this.listener == null) {
            TBSdkLog.e(TAG, seqNo, "The listener of MtopBusiness is null.");
        } else if (mtopCacheEvent == null) {
            TBSdkLog.e(TAG, seqNo, "MtopCacheEvent is null.");
        } else {
            MtopResponse mtopResponse = mtopCacheEvent.getMtopResponse();
            if (mtopResponse == null) {
                TBSdkLog.e(TAG, seqNo, "The MtopResponse of MtopCacheEvent is null.");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!mtopResponse.isApiSuccess() || (cls = this.mtopBusiness.clazz) == null) {
                baseOutDo = null;
            } else {
                baseOutDo = MtopConvert.mtopResponseToOutputDO(mtopResponse, cls);
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            this.mtopBusiness.onBgFinishTime = currentTimeMillis3;
            MtopStatistics mtopStat = mtopResponse.getMtopStat();
            if (mtopStat != null) {
                MtopStatistics.RbStatisticData rbStatData = mtopStat.getRbStatData();
                long j = currentTimeMillis3 - currentTimeMillis2;
                rbStatData.jsonParseTime = j;
                rbStatData.jsonTime = j;
                rbStatData.isCache = 1;
                MtopBusiness mtopBusiness = this.mtopBusiness;
                rbStatData.mtopReqTime = currentTimeMillis - mtopBusiness.sendStartTime;
                long j2 = mtopBusiness.onBgFinishTime - mtopBusiness.reqStartTime;
                rbStatData.rbReqTime = j2;
                rbStatData.totalTime = j2;
                rbStatisticData = rbStatData;
            } else {
                rbStatisticData = null;
            }
            HandlerParam a2 = osa.a(this.listener, mtopCacheEvent, this.mtopBusiness);
            a2.pojo = baseOutDo;
            a2.mtopResponse = mtopResponse;
            MtopBusiness mtopBusiness2 = this.mtopBusiness;
            mtopBusiness2.isCached = true;
            if (mtopBusiness2.mtopProp.handler != null) {
                if (TBSdkLog.isLogEnable(logEnable)) {
                    TBSdkLog.i(TAG, seqNo, "onReceive: ON_CACHED in self-defined handler.");
                }
                if (mtopStat != null) {
                    if (rbStatisticData != null && TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                        TBSdkLog.d(TAG, seqNo, rbStatisticData.toString());
                    }
                    mtopStat.commitStatData(true);
                }
                try {
                    if (a2.listener instanceof IRemoteCacheListener) {
                        TBSdkLog.i(TAG, seqNo, "listener onCached callback");
                        ((IRemoteCacheListener) a2.listener).onCached(mtopCacheEvent, a2.pojo, obj);
                        return;
                    }
                    TBSdkLog.i(TAG, seqNo, "listener onCached transfer to onSuccess callback");
                    ((IRemoteListener) a2.listener).onSuccess(a2.mtopBusiness.getRequestType(), a2.mtopResponse, a2.pojo, obj);
                } catch (Throwable th) {
                    TBSdkLog.e(TAG, seqNo, "listener onCached callback error in self-defined handler.", th);
                }
            } else {
                osa.b().obtainMessage(4, a2).sendToTarget();
            }
        }
    }
}
