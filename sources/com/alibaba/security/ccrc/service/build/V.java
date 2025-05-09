package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class V {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long mAlgoInitTime;

    public abstract boolean loggable();

    public void reportAlgoDetectEnd(CCRCRiskSample cCRCRiskSample, String str, String str2, String str3, Object obj, long j, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6354243", new Object[]{this, cCRCRiskSample, str, str2, str3, obj, new Long(j), str4});
        } else {
            reportAlgoDetectEnd(cCRCRiskSample, str, str2, str3, obj, j, true, null, str4, null);
        }
    }

    public abstract String type();

    public void reportAlgoDetectEnd(CCRCRiskSample cCRCRiskSample, String str, String str2, String str3, Object obj, long j, boolean z, String str4, String str5, String str6) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865d7cd9", new Object[]{this, cCRCRiskSample, str, str2, str3, obj, new Long(j), new Boolean(z), str4, str5, str6});
        } else if (loggable()) {
            TrackLog.Builder phase = TrackLog.newBuilder().setpId(str).setMetaId(cCRCRiskSample.getMetaId()).setSampleId(cCRCRiskSample.getSampleID()).setCcrcCode(str2).setPhase("detect");
            TrackLog.Builder operation = phase.setOperation("algo_" + str3 + "_end");
            if (!z) {
                i = -1;
            }
            TrackManager.track(operation.setStatus(i).addParam("data", obj).addParam("algoType", type()).addParam("costTime", Long.valueOf(j)).addParam("errorMsg", str4).addParam("algoVersion", str5).addParam("_data", str6).build());
        }
    }

    public void reportAlgoInitEnd(String str, String str2, String str3, String str4, boolean z, String str5) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61c58f0b", new Object[]{this, str, str2, str3, str4, new Boolean(z), str5});
            return;
        }
        TrackLog.Builder phase = TrackLog.newBuilder().setpId(str).setCcrcCode(str2).setPhase("init");
        TrackLog.Builder operation = phase.setOperation("algo_" + str3 + "_init_end");
        if (!z) {
            i = -1;
        }
        TrackManager.track(operation.setStatus(i).addParam("msg", str4).addParam("costTime", Long.valueOf(System.currentTimeMillis() - this.mAlgoInitTime)).addParam("algoType", type()).addParam("algoVersion", str5).build());
    }
}
