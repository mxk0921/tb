package anet.channel.analysis;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.fulltrace.IFullTraceAnalysis;
import anet.channel.fulltrace.SceneInfo;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.scene.SceneIdentifier;
import java.util.HashMap;
import tb.k4o;
import tb.ktj;
import tb.l0r;
import tb.pod;
import tb.t2o;
import tb.zzc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DefaultFullTraceAnalysis implements IFullTraceAnalysis {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String REQ_TYPE = "network";
    private static final String TAG = "awcn.DefaultFullTraceAnalysis";
    private boolean isAnalysisValid;
    private boolean isDiagnosisValid;

    static {
        t2o.a(607125559);
        t2o.a(607125658);
    }

    public DefaultFullTraceAnalysis() {
        try {
            SceneIdentifier.setContext(GlobalAppRuntimeInfo.getContext());
            this.isAnalysisValid = true;
            l0r.g(SceneIdentifier.getDeviceLevel());
        } catch (Exception unused) {
            this.isAnalysisValid = false;
            ALog.e(TAG, "not support FullTraceAnalysis", null, new Object[0]);
        }
        try {
            ktj.c(GlobalAppRuntimeInfo.getContext());
            zzc a2 = ktj.a();
            if (a2 != null) {
                a2.initialize(GlobalAppRuntimeInfo.getContext());
            }
            this.isDiagnosisValid = true;
        } catch (Exception unused2) {
            this.isDiagnosisValid = false;
            ALog.e(TAG, "not support NetworkDiagnosis", null, new Object[0]);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public String createRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57145ee6", new Object[]{this});
        }
        if (this.isAnalysisValid) {
            return FullTraceAnalysis.getInstance().createRequest("network");
        }
        return null;
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public SceneInfo getSceneInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SceneInfo) ipChange.ipc$dispatch("b76919f8", new Object[]{this});
        }
        if (!this.isAnalysisValid) {
            return null;
        }
        SceneInfo sceneInfo = new SceneInfo();
        sceneInfo.isUrlLaunch = SceneIdentifier.isUrlLaunch();
        sceneInfo.appLaunchTime = SceneIdentifier.getAppLaunchTime();
        sceneInfo.lastLaunchTime = SceneIdentifier.getLastLaunchTime();
        sceneInfo.deviceLevel = SceneIdentifier.getDeviceLevel();
        sceneInfo.startType = SceneIdentifier.getStartType();
        sceneInfo.speedBucket = SceneIdentifier.getBucketInfo();
        sceneInfo.abTestBucket = ABTestCenter.getUTABTestBucketId("networksdk");
        return sceneInfo;
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public void log(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c228169", new Object[]{this, str, str2, str3});
        } else if (this.isAnalysisValid) {
            FullTraceAnalysis.getInstance().log(str, "network", str2, str3);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public void commitRequest(String str, RequestStatistic requestStatistic) {
        zzc a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5943df", new Object[]{this, str, requestStatistic});
            return;
        }
        if (this.isAnalysisValid) {
            if (requestStatistic != null && !TextUtils.isEmpty(str)) {
                k4o k4oVar = new k4o();
                k4oVar.b = requestStatistic.host;
                k4oVar.d = requestStatistic.bizId;
                k4oVar.f22397a = requestStatistic.url;
                k4oVar.c = requestStatistic.retryTimes;
                k4oVar.e = requestStatistic.netType;
                k4oVar.f = requestStatistic.protocolType;
                k4oVar.g = requestStatistic.ret;
                k4oVar.I = false;
                k4oVar.K = requestStatistic.isReqMain;
                k4oVar.J = requestStatistic.isReqSync;
                if (requestStatistic.statusCode == -304) {
                    k4oVar.L = String.valueOf(requestStatistic.tnetErrorCode);
                } else {
                    k4oVar.L = String.valueOf(requestStatistic.statusCode);
                }
                k4oVar.N = requestStatistic.pTraceId;
                k4oVar.j = requestStatistic.netReqStart;
                k4oVar.k = requestStatistic.reqServiceTransmissionEnd;
                k4oVar.l = requestStatistic.reqStart;
                k4oVar.m = requestStatistic.sendStart;
                k4oVar.n = requestStatistic.rspEnd;
                k4oVar.o = requestStatistic.rspCbDispatch;
                k4oVar.p = requestStatistic.rspCbStart;
                k4oVar.q = requestStatistic.rspCbEnd;
                k4oVar.w = requestStatistic.reqHeadDeflateSize + requestStatistic.reqBodyDeflateSize;
                k4oVar.v = requestStatistic.reqHeadInflateSize + requestStatistic.reqBodyInflateSize;
                k4oVar.x = requestStatistic.rspHeadDeflateSize + requestStatistic.rspBodyDeflateSize;
                k4oVar.y = requestStatistic.rspHeadInflateSize + requestStatistic.rspBodyInflateSize;
                k4oVar.z = requestStatistic.serverRT;
                k4oVar.C = requestStatistic.sendDataTime;
                k4oVar.D = requestStatistic.firstDataTime;
                k4oVar.E = requestStatistic.recDataTime;
                k4oVar.R = requestStatistic.useMultiPath;
                k4oVar.Q = requestStatistic.multiNetworkStatus;
                k4oVar.S = requestStatistic.pageReferer;
                FullTraceAnalysis.getInstance().commitRequest(str, "network", k4oVar);
            } else {
                return;
            }
        }
        if (this.isDiagnosisValid && (a2 = ktj.a()) != null) {
            pod a3 = a2.a();
            HashMap hashMap = new HashMap();
            hashMap.put("host", requestStatistic.host);
            hashMap.put("url", requestStatistic.url);
            hashMap.put("serverRT", Long.valueOf(requestStatistic.serverRT));
            hashMap.put("protocol", requestStatistic.protocolType);
            hashMap.put(pod.IP, requestStatistic.ip);
            hashMap.put(pod.EAGLE_EYE_ID, requestStatistic.eagleEyeId);
            hashMap.put("code", Integer.valueOf(requestStatistic.statusCode));
            a3.a(hashMap);
        }
    }
}
