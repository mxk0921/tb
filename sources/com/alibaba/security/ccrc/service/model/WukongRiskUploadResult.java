package com.alibaba.security.ccrc.service.model;

import com.alibaba.security.client.smart.core.wukong.report.model.RiskPoint;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WukongRiskUploadResult extends AbsWukongRiskResult {
    public boolean isSuccess;
    public List<RiskPoint> riskPoints;
    public WukongUploadType uploadType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum WukongUploadType {
        WukongRiskUploadTypeAsync(1),
        WukongRiskUploadTypeSync(2),
        WukongRiskUploadTypeLocal(3);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        WukongUploadType(int i) {
        }

        public static /* synthetic */ Object ipc$super(WukongUploadType wukongUploadType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/model/WukongRiskUploadResult$WukongUploadType");
        }

        public static WukongUploadType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WukongUploadType) ipChange.ipc$dispatch("88643228", new Object[]{str});
            }
            return (WukongUploadType) Enum.valueOf(WukongUploadType.class, str);
        }
    }
}
