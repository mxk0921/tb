package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.action.WukongActionCode;
import com.alibaba.security.ccrc.service.RiskShowCustomizedResult;
import com.alibaba.security.ccrc.service.interfaces.AbsWuKongDetectListener;
import com.alibaba.security.ccrc.service.model.AbsWukongActionRiskResult;
import com.alibaba.security.ccrc.service.model.WukongDetectFinishRiskResult;
import com.alibaba.security.ccrc.service.model.WukongRiskUploadResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.ua  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1194ua extends AbsWuKongDetectListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RunnableC1196va f2626a;

    public C1194ua(RunnableC1196va vaVar) {
        this.f2626a = vaVar;
    }

    public static /* synthetic */ Object ipc$super(C1194ua uaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/ua");
    }

    @Override // com.alibaba.security.ccrc.service.interfaces.AbsWuKongDetectListener, com.alibaba.security.ccrc.service.interfaces.OnWuKongDetectListener
    public void onActionTrigger(AbsWukongActionRiskResult absWukongActionRiskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e24978", new Object[]{this, absWukongActionRiskResult});
        } else if (absWukongActionRiskResult != null && WukongActionCode.RISK_BLOCKING_PAGE.equals(absWukongActionRiskResult.actionCode)) {
            RunnableC1196va vaVar = this.f2626a;
            if (!RunnableC1196va.$ipChange) {
                J j = (J) absWukongActionRiskResult;
                RunnableC1196va vaVar2 = this.f2626a;
                String str = absWukongActionRiskResult.sampleID;
                String str2 = absWukongActionRiskResult.metaId;
                boolean z = absWukongActionRiskResult.success;
                RunnableC1196va.a(vaVar2, new RiskShowCustomizedResult(str, str2, z, z, absWukongActionRiskResult.errorMsg));
                RunnableC1196va.b(this.f2626a);
                if (j.success) {
                    RunnableC1196va.a(this.f2626a, j.f2559a);
                }
            }
        }
    }

    @Override // com.alibaba.security.ccrc.service.interfaces.OnWuKongDetectListener
    public void onDetectFinish(WukongDetectFinishRiskResult wukongDetectFinishRiskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526441e", new Object[]{this, wukongDetectFinishRiskResult});
            return;
        }
        RunnableC1196va vaVar = this.f2626a;
        if (!RunnableC1196va.$ipChange) {
            RunnableC1196va.a(this.f2626a, new RiskShowCustomizedResult(wukongDetectFinishRiskResult.sampleID, wukongDetectFinishRiskResult.metaId, false, true, wukongDetectFinishRiskResult.errorMsg));
            RunnableC1196va.b(this.f2626a);
        }
    }

    @Override // com.alibaba.security.ccrc.service.interfaces.OnWuKongDetectListener
    public void onRiskUpload(WukongRiskUploadResult wukongRiskUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e83f12d", new Object[]{this, wukongRiskUploadResult});
        }
    }
}
