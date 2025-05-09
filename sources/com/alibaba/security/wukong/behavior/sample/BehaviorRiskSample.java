package com.alibaba.security.wukong.behavior.sample;

import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.model.meta.Behavior;
import com.alibaba.security.wukong.model.meta.Data;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BehaviorRiskSample extends CCRCRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Behavior behavior;

    public BehaviorRiskSample(String str, Map<String, Object> map) {
        super(str);
        this.behavior = new Behavior(map);
    }

    public static /* synthetic */ Object ipc$super(BehaviorRiskSample behaviorRiskSample, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/behavior/sample/BehaviorRiskSample");
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public String getMetaType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3168d9c4", new Object[]{this});
        }
        return "behavior";
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public Data getRawData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("b1c4156c", new Object[]{this});
        }
        return this.behavior;
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public long getTs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31735e70", new Object[]{this})).longValue();
        }
        return this.behavior.getTs();
    }

    public BehaviorRiskSample(String str, String str2) {
        super(str);
        this.behavior = new Behavior((Map) JsonUtils.parseObject(str2, (Class<Object>) Map.class));
    }

    public BehaviorRiskSample(String str, Map<String, Object> map, String str2) {
        super(str, map);
        this.behavior = new Behavior((Map) JsonUtils.parseObject(str2, (Class<Object>) Map.class));
        getExtras().putAll(map);
    }

    public BehaviorRiskSample(String str, Map<String, Object> map, Map<String, Object> map2) {
        super(str, map);
        this.behavior = new Behavior(map2);
        getExtras().putAll(map);
    }
}
