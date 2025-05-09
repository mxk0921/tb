package com.alibaba.security.wukong.model;

import android.text.TextUtils;
import com.alibaba.security.wukong.model.meta.AlgoResult;
import com.alibaba.security.wukong.model.meta.Data;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AlgoResultSample extends CCRCRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AlgoResult algoResult;

    public AlgoResultSample(String str, String str2, String str3) {
        super(str);
        this.algoResult = new AlgoResult(str2, str3);
    }

    public static /* synthetic */ Object ipc$super(AlgoResultSample algoResultSample, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/AlgoResultSample");
    }

    public AlgoResult getAlgoResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlgoResult) ipChange.ipc$dispatch("3655e250", new Object[]{this});
        }
        return this.algoResult;
    }

    public String getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.algoResult.getCode();
    }

    public Map<String, Object> getInferResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d3b12c11", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(this.algoResult.getCode(), this.algoResult.getValue());
        return hashMap;
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public String getMetaType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3168d9c4", new Object[]{this});
        }
        return "algoResult";
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public Data getRawData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("b1c4156c", new Object[]{this});
        }
        return this.algoResult;
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public long getTs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31735e70", new Object[]{this})).longValue();
        }
        return this.algoResult.getTs();
    }

    public Object getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        return this.algoResult.getValue();
    }

    public boolean isInferDirect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa49f858", new Object[]{this})).booleanValue();
        }
        return this.algoResult.isInferDirect();
    }

    public boolean isTriggerHeart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1215843", new Object[]{this})).booleanValue();
        }
        return this.algoResult.isTriggerHeart();
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (!super.isValid() || TextUtils.isEmpty(getCode()) || getValue() == null) {
            return false;
        }
        return true;
    }

    public void setAlgoResult(AlgoResult algoResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb20ff9a", new Object[]{this, algoResult});
        } else {
            this.algoResult = algoResult;
        }
    }

    public void setCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f1cac0", new Object[]{this, str});
        } else {
            this.algoResult.setCode(str);
        }
    }

    public void setValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae52f80", new Object[]{this, str});
        } else {
            this.algoResult.setValue(str);
        }
    }

    public AlgoResultSample(String str, AlgoResult algoResult) {
        super(str);
        this.algoResult = algoResult;
        getExtras().putAll(algoResult.getExtras());
    }
}
