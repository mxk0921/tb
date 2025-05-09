package com.alibaba.security.wukong.model;

import android.text.TextUtils;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.meta.Data;
import com.alibaba.security.wukong.model.protocol.RiskSample;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class CCRCRiskSample extends RiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CCRCRiskSample(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(CCRCRiskSample cCRCRiskSample, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/CCRCRiskSample");
    }

    public void detect(CcrcService ccrcService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d63077", new Object[]{this, ccrcService, new Boolean(z)});
        } else {
            ccrcService.detect(this, z);
        }
    }

    public long getDetectStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b795631", new Object[]{this})).longValue();
        }
        Long l = (Long) getExtras().get(RiskSample.START_DETECT_TIME);
        if (l == null) {
            l = Long.valueOf(getTs());
        }
        return l.longValue();
    }

    public String getMetaId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76fc2fc3", new Object[]{this});
        }
        return this.sampleID;
    }

    public abstract String getMetaType();

    public abstract Data getRawData();

    @Override // com.alibaba.security.wukong.model.protocol.RiskSample
    public String getSampleID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25281e", new Object[]{this});
        }
        Object obj = getExtras().get(RiskSample.REAL_SAMPLE_ID);
        if (obj instanceof String) {
            return (String) obj;
        }
        return this.sampleID;
    }

    public String getSampleType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9467033f", new Object[]{this});
        }
        Object obj = getExtras().get(RiskSample.REAL_SAMPLE_TYPE);
        if (obj instanceof String) {
            return (String) obj;
        }
        return getMetaType();
    }

    public abstract long getTs();

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.sampleID);
    }

    public CCRCRiskSample(String str, Map<String, Object> map) {
        super(str, map);
    }

    public void detect(CcrcService ccrcService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f982c1fd", new Object[]{this, ccrcService});
        } else {
            ccrcService.detect(this, true);
        }
    }
}
