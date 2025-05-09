package tb;

import android.text.TextUtils;
import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class kqm implements yib, reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299836);
        t2o.a(589299813);
        t2o.a(589299812);
    }

    @Override // tb.yib
    public String a(w4j w4jVar) {
        MtopBuilder mtopBuilder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8127648a", new Object[]{this, w4jVar});
        }
        try {
            if (e() || w4jVar.d.streamMode) {
                return "CONTINUE";
            }
            if (w4jVar.o.getMtopPrefetch() != null) {
                w4jVar.f30449a.addPrefetchBuilderToMap(w4jVar.o, w4jVar.b.getKey());
                return "CONTINUE";
            } else if (w4jVar.d.useCache || f(w4jVar.b.dataParams) || (mtopBuilder = w4jVar.f30449a.getPrefetchBuilderMap().get(w4jVar.b.getKey())) == null || mtopBuilder.getMtopPrefetch().isLocalMode()) {
                return "CONTINUE";
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                MtopPrefetch.CompareResult compare = mtopBuilder.getMtopPrefetch().getComparator().compare(w4jVar.o, mtopBuilder);
                HashMap<String, String> hashMap = null;
                if (compare == null || !compare.isSame()) {
                    MtopPrefetch mtopPrefetch = mtopBuilder.getMtopPrefetch();
                    if (compare != null) {
                        hashMap = compare.getData();
                    }
                    MtopPrefetch.onPrefetchAndCommit("TYPE_MISS", mtopPrefetch, w4jVar, hashMap);
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                        TBSdkLog.d("mtopsdk.PrefetchDuplexFilter", w4jVar.h + "not hit, miss not the same request");
                    }
                    return "CONTINUE";
                }
                mtopBuilder.getMtopPrefetch().lock.lock();
                if (mtopBuilder.getMtopPrefetch().response.get() || mtopBuilder.getMtopPrefetch().mergeContext != null) {
                    mtopBuilder.getMtopPrefetch().lock.unlock();
                    if (currentTimeMillis - mtopBuilder.getMtopPrefetch().prefetchResponseTime > mtopBuilder.getMtopPrefetch().getPrefetchExpireTime()) {
                        MtopPrefetch.onPrefetchAndCommit("TYPE_EXPIRE", mtopBuilder.getMtopPrefetch(), w4jVar, null);
                        w4jVar.f30449a.getPrefetchBuilderMap().remove(w4jVar.b.getKey());
                        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                            TBSdkLog.d("mtopsdk.PrefetchDuplexFilter", w4jVar.h + "not hit, time expired");
                        }
                        return "CONTINUE";
                    }
                    MtopStatistics mtopStatistics = w4jVar.g;
                    MtopResponse mtopResponse = mtopBuilder.getMtopContext().c;
                    mtopResponse.setMtopStat(mtopStatistics);
                    FullTraceHelper.recordRspCbDispatch(mtopStatistics);
                    mtopStatistics.isPrefetch = true;
                    MtopFinishEvent mtopFinishEvent = new MtopFinishEvent(mtopResponse);
                    mtopFinishEvent.seqNo = w4jVar.h;
                    mtopStatistics.serverTraceId = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.SERVER_TRACE_ID);
                    mtopStatistics.eagleEyeTraceId = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), "eagleeye-traceid");
                    mtopStatistics.retCode = mtopResponse.getRetCode();
                    mtopStatistics.statusCode = mtopResponse.getResponseCode();
                    mtopStatistics.mappingCode = mtopResponse.getMappingCode();
                    mtopStatistics.onEndAndCommit();
                    MtopListener mtopListener = w4jVar.e;
                    boolean z = w4jVar.o instanceof MtopBusiness;
                    if (!z) {
                        FullTraceHelper.recordRspCbStart(mtopStatistics);
                    }
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                        TBSdkLog.d("mtopsdk.PrefetchDuplexFilter", w4jVar.h + "hit cache");
                    }
                    if (mtopListener instanceof MtopCallback.MtopFinishListener) {
                        ((MtopCallback.MtopFinishListener) mtopListener).onFinished(mtopFinishEvent, w4jVar.d.reqContext);
                    }
                    if (!z) {
                        FullTraceHelper.recordRspCbEnd(w4jVar.g);
                        mtopStatistics.commitFullTrace();
                    }
                    mtopBuilder.getMtopPrefetch().prefetchHitTime = currentTimeMillis;
                    MtopPrefetch.onPrefetchAndCommit("TYPE_HIT", mtopBuilder.getMtopPrefetch(), w4jVar, null);
                    w4jVar.f30449a.getPrefetchBuilderMap().remove(w4jVar.b.getKey());
                    return FilterManager.STOP;
                }
                mtopBuilder.getMtopPrefetch().mergeContext = w4jVar;
                mtopBuilder.getMtopPrefetch().lock.unlock();
                return FilterManager.STOP;
            }
        } catch (Throwable th) {
            String str = w4jVar.h;
            TBSdkLog.e("mtopsdk.PrefetchDuplexFilter", str, "call prefetch filter before error,apiKey=" + w4jVar.b.getKey(), th);
        }
        return "CONTINUE";
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        try {
        } catch (Throwable th) {
            String str = w4jVar.h;
            TBSdkLog.e("mtopsdk.PrefetchDuplexFilter", str, "checking after error " + th);
        }
        if (e()) {
            return "CONTINUE";
        }
        MtopNetworkProp mtopNetworkProp = w4jVar.d;
        if (mtopNetworkProp.streamMode || mtopNetworkProp.useCache) {
            return "CONTINUE";
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (w4jVar.o.getMtopPrefetch() != null) {
            MtopPrefetch mtopPrefetch = w4jVar.o.getMtopPrefetch();
            if (mtopPrefetch.isLocalMode() || mtopPrefetch.response.get()) {
                return "CONTINUE";
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                TBSdkLog.d("mtopsdk.PrefetchDuplexFilter", w4jVar.h + "save prefetch request and get response " + w4jVar.b.getKey());
            }
            if (w4jVar.c != null) {
                mtopPrefetch.prefetchResponseTime = currentTimeMillis;
                w4jVar.f30449a.lastPrefetchResponseTime = currentTimeMillis;
                ReentrantLock reentrantLock = mtopPrefetch.lock;
                reentrantLock.lock();
                mtopPrefetch.response.compareAndSet(false, true);
                if (mtopPrefetch.mergeContext != null) {
                    mtopPrefetch.prefetchHitTime = currentTimeMillis;
                    MtopPrefetch.onPrefetchAndCommit("TYPE_MERGE", mtopPrefetch, w4jVar, null);
                    w4jVar.f30449a.getPrefetchBuilderMap().remove(w4jVar.b.getKey());
                    w4j w4jVar2 = mtopPrefetch.mergeContext;
                    w4jVar.e = w4jVar2.e;
                    w4jVar.o = w4jVar2.o;
                    w4jVar.g.isPrefetch = true;
                }
                reentrantLock.unlock();
            }
        }
        return "CONTINUE";
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a0f7fc", new Object[]{this})).booleanValue();
        }
        if (!RemoteConfig.getInstance().prefetch || !Mtop.mIsFullTrackValid) {
            return true;
        }
        if (ABTestCenter.isTBSpeedEdition("tsEnable") || ABTestCenter.isTBSpeedEdition(RemoteConfig.TB_SPEED_U_LAND)) {
            return false;
        }
        return true;
    }

    public final boolean f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15d3a38f", new Object[]{this, map})).booleanValue();
        }
        if (map == null || map.isEmpty() || !SwitchConfig.getInstance().isEnablePrefetchIgnore()) {
            return false;
        }
        return TextUtils.equals(map.get("ignorePrefetch"), "true");
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.PrefetchDuplexFilter";
    }
}
