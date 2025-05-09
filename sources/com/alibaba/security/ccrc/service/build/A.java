package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.interfaces.OnDetectRiskListener;
import com.alibaba.security.ccrc.service.CcrcDetectResult;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.A;
import com.alibaba.security.ccrc.service.build.C1204za;
import com.alibaba.security.ccrc.service.build.F;
import com.alibaba.security.ccrc.service.enums.WukongResultCode;
import com.alibaba.security.ccrc.service.interfaces.AbsWuKongDetectListener;
import com.alibaba.security.ccrc.service.model.AbsWukongActionRiskResult;
import com.alibaba.security.ccrc.service.model.AbsWukongRiskResult;
import com.alibaba.security.ccrc.service.model.WukongActivateRiskResult;
import com.alibaba.security.ccrc.service.model.WukongDetectFinishRiskResult;
import com.alibaba.security.ccrc.service.model.WukongRiskUploadResult;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class A implements AbstractC1189s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2539a = "LifeCallback";
    public final String b;
    public final String c;
    public final AbstractC1157eb d;
    public AbsWuKongDetectListener e;
    public OnDetectRiskListener f;

    public A(String str, String str2, AbstractC1157eb ebVar) {
        this.b = str2;
        this.c = str;
        this.d = ebVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6e70ac", new Object[]{this, config});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(config.getPid()).setCcrcCode(this.b).setPhase("release").setOperation("end").setStatus(0).build());
        }
    }

    private void c(final CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b243d6d", new Object[]{this, config});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.u3
                @Override // java.lang.Runnable
                public final void run() {
                    A.this.b(config);
                }
            });
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1189s
    public void a(CcrcService.Config config, CCRCRiskSample cCRCRiskSample, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5ba71a", new Object[]{this, config, cCRCRiskSample, new Boolean(z), str});
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1189s
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1189s
    public void a(String str, String str2, boolean z, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ffa1262", new Object[]{this, str, str2, new Boolean(z), str3, new Long(j)});
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1189s
    public void a(CcrcService.Config config, InferContext inferContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ae9e3b", new Object[]{this, config, inferContext});
        } else {
            C1204za.a.f2639a.a(inferContext);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1189s
    public void a(CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8a3eb", new Object[]{this, config});
        } else {
            Logging.d(f2539a, "activate start");
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1189s
    public void a(CcrcService.Config config, WukongActivateRiskResult wukongActivateRiskResult, Map<String, Object> map, long j, I i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857a9994", new Object[]{this, config, wukongActivateRiskResult, map, new Long(j), i});
            return;
        }
        a(config, wukongActivateRiskResult.resultCode, System.currentTimeMillis() - j, wukongActivateRiskResult.errorMsg, map);
        if (i != null) {
            i.a(wukongActivateRiskResult);
        }
    }

    private void b(final WukongDetectFinishRiskResult wukongDetectFinishRiskResult, final SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81efb55e", new Object[]{this, wukongDetectFinishRiskResult, sampleData});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.w3
                @Override // java.lang.Runnable
                public final void run() {
                    A.this.a(wukongDetectFinishRiskResult, sampleData);
                }
            });
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1189s
    public void a(CcrcService.Config config, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d622c8f5", new Object[]{this, config, str});
        } else if (config != null) {
            c(config);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1189s
    public void a(InferContext inferContext, AbsWukongActionRiskResult absWukongActionRiskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b9c4364", new Object[]{this, inferContext, absWukongActionRiskResult});
            return;
        }
        AbsWuKongDetectListener absWuKongDetectListener = this.e;
        if (absWuKongDetectListener != null) {
            absWuKongDetectListener.onActionTrigger(absWukongActionRiskResult);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1189s
    public void a(CcrcService.Config config, InferContext inferContext, String str, WukongResultCode wukongResultCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6118248", new Object[]{this, config, inferContext, str, wukongResultCode});
            return;
        }
        WukongDetectFinishRiskResult createFinishResult = WukongDetectFinishRiskResult.createFinishResult(this.b, inferContext.sampleData, config, str, wukongResultCode);
        AbsWuKongDetectListener absWuKongDetectListener = this.e;
        if (absWuKongDetectListener != null) {
            absWuKongDetectListener.onDetectFinish(createFinishResult);
        }
        b(createFinishResult, inferContext.sampleData);
        C1204za.a.f2639a.b(inferContext.eventId);
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1189s
    public void a(InferContext inferContext, AbsWukongRiskResult absWukongRiskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0e807a", new Object[]{this, inferContext, absWukongRiskResult});
            return;
        }
        if (this.f != null && (absWukongRiskResult instanceof C1188ra)) {
            C1188ra raVar = (C1188ra) absWukongRiskResult;
            SampleData sampleData = inferContext.sampleData;
            this.f.onDetectResult(new CcrcDetectResult(sampleData.sampleId, sampleData.metaId, raVar.f2618a, true, "", raVar.b, inferContext.getAlgoResults()));
        }
        AbsWuKongDetectListener absWuKongDetectListener = this.e;
        if (absWuKongDetectListener != null && (absWukongRiskResult instanceof WukongRiskUploadResult)) {
            absWuKongDetectListener.onRiskUpload((WukongRiskUploadResult) absWukongRiskResult);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1189s
    public void a(CcrcService.Config config, SampleData sampleData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9287be8", new Object[]{this, config, sampleData, str});
            return;
        }
        WukongDetectFinishRiskResult createFinishResult = WukongDetectFinishRiskResult.createFinishResult(this.b, sampleData, config, str, WukongResultCode.DETECT_PRE_FAIL);
        AbsWuKongDetectListener absWuKongDetectListener = this.e;
        if (absWuKongDetectListener != null) {
            absWuKongDetectListener.onDetectFinish(createFinishResult);
        }
        OnDetectRiskListener onDetectRiskListener = this.f;
        if (onDetectRiskListener != null) {
            onDetectRiskListener.onDetectResult(E.a(str, sampleData));
        }
        b(createFinishResult, sampleData);
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1189s
    public void a(CcrcService.Config config, CCRCRiskSample cCRCRiskSample, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb8f2ce", new Object[]{this, config, cCRCRiskSample, str});
            return;
        }
        WukongDetectFinishRiskResult createFinishResult = WukongDetectFinishRiskResult.createFinishResult(this.b, cCRCRiskSample, config, str, WukongResultCode.DETECT_PRE_FAIL);
        AbsWuKongDetectListener absWuKongDetectListener = this.e;
        if (absWuKongDetectListener != null) {
            absWuKongDetectListener.onDetectFinish(createFinishResult);
        }
        OnDetectRiskListener onDetectRiskListener = this.f;
        if (onDetectRiskListener != null) {
            onDetectRiskListener.onDetectResult(E.a(str, cCRCRiskSample));
        }
        a(createFinishResult, cCRCRiskSample.getRiskID(), cCRCRiskSample.getSampleType(), cCRCRiskSample.getMetaType(), cCRCRiskSample.getDetectStartTime());
    }

    private void a(final CcrcService.Config config, final WukongResultCode wukongResultCode, final long j, final String str, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d1d625", new Object[]{this, config, wukongResultCode, new Long(j), str, map});
        } else if (!TextUtils.equals(F.a.e, str)) {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.u5
                @Override // java.lang.Runnable
                public final void run() {
                    A.this.a(wukongResultCode, str, config, j, map);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WukongResultCode wukongResultCode, String str, CcrcService.Config config, long j, Map map) {
        int i = 3;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738f02b9", new Object[]{this, wukongResultCode, str, config, new Long(j), map});
            return;
        }
        if (!a(wukongResultCode)) {
            i2 = -1;
        }
        if (i2 != -1 || !TextUtils.equals(str, F.a.f2551a)) {
            i = i2;
        }
        TrackManager.track(TrackLog.newBuilder().setpId(config != null ? config.getPid() : null).setCcrcCode(this.b).setPhase("init").setOperation("end").setStatus(i).addParam("resultCode", Integer.valueOf(wukongResultCode.getCode())).addParam("errorMsg", str).addParam("costTime", Long.valueOf(j)).addParam("prepareID", this.c).addParam("supportLowDevice", Boolean.valueOf(sb.a(this.b).b())).addAllParam(map).build());
    }

    private boolean a(WukongResultCode wukongResultCode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b99dddaf", new Object[]{this, wukongResultCode})).booleanValue() : wukongResultCode == WukongResultCode.ACTIVATE_SUCCESS || wukongResultCode == WukongResultCode.ACTIVATED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WukongDetectFinishRiskResult wukongDetectFinishRiskResult, String str, long j, String str2, String str3) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1c3624", new Object[]{this, wukongDetectFinishRiskResult, str, new Long(j), str2, str3});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(wukongDetectFinishRiskResult.pid).setCcrcCode(this.b).setMetaId(wukongDetectFinishRiskResult.metaId).setSampleId(wukongDetectFinishRiskResult.sampleID).setPhase("detect").setOperation("end");
        WukongResultCode wukongResultCode = wukongDetectFinishRiskResult.wuKongResultCode;
        if (wukongResultCode == WukongResultCode.DETECT_ENGINE_EVALUATE_FAIL || wukongResultCode == WukongResultCode.DETECT_PRE_FAIL) {
            i = -1;
        }
        TrackManager.track(operation.setStatus(i).setRiskId(str).addParam("costTime", Long.valueOf(System.currentTimeMillis() - j)).addParam("errorMsg", wukongDetectFinishRiskResult.errorMsg).addParam("resultCode", Integer.valueOf(wukongDetectFinishRiskResult.wuKongResultCode.getCode())).addParam("sampleType", str2).addParam("metaType", str3).addParam("versionInfo", this.d.b()).addExt("supportLowDevice", Boolean.valueOf(sb.a(this.b).b())).build());
    }

    private void a(final WukongDetectFinishRiskResult wukongDetectFinishRiskResult, final String str, final String str2, final String str3, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc1807c", new Object[]{this, wukongDetectFinishRiskResult, str, str2, str3, new Long(j)});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.v3
                @Override // java.lang.Runnable
                public final void run() {
                    A.this.a(wukongDetectFinishRiskResult, str, j, str2, str3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WukongDetectFinishRiskResult wukongDetectFinishRiskResult, SampleData sampleData) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922cc19d", new Object[]{this, wukongDetectFinishRiskResult, sampleData});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(wukongDetectFinishRiskResult.pid).setCcrcCode(this.b).setMetaId(wukongDetectFinishRiskResult.metaId).setSampleId(wukongDetectFinishRiskResult.sampleID).setPhase("detect").setOperation("end");
        WukongResultCode wukongResultCode = wukongDetectFinishRiskResult.wuKongResultCode;
        if (wukongResultCode == WukongResultCode.DETECT_ENGINE_EVALUATE_FAIL || wukongResultCode == WukongResultCode.DETECT_PRE_FAIL) {
            i = -1;
        }
        TrackManager.track(operation.setStatus(i).setRiskId(sampleData.riskId).addParam("costTime", Long.valueOf(System.currentTimeMillis() - sampleData.startDetectTs)).addParam("errorMsg", wukongDetectFinishRiskResult.errorMsg).addParam("resultCode", Integer.valueOf(wukongDetectFinishRiskResult.wuKongResultCode.getCode())).addParam("sampleType", sampleData.sampleType).addParam("metaType", sampleData.metaType).addParam("versionInfo", this.d.b()).addExt("supportLowDevice", Boolean.valueOf(sb.a(this.b).b())).build());
    }

    public void a(AbsWuKongDetectListener absWuKongDetectListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6715de", new Object[]{this, absWuKongDetectListener});
        } else {
            this.e = absWuKongDetectListener;
        }
    }

    public void a(OnDetectRiskListener onDetectRiskListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80fa8f", new Object[]{this, onDetectRiskListener});
        } else {
            this.f = onDetectRiskListener;
        }
    }
}
