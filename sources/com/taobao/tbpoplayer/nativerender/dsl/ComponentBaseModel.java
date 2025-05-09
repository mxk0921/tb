package com.taobao.tbpoplayer.nativerender.dsl;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ComponentBaseModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "alt")
    public String alt;
    @JSONField(name = "animation")
    public List<AnimationModel> animation;
    @JSONField(name = "id")
    public String id;
    @JSONField(name = "type")
    public String type;
    @JSONField(name = "vCondition")
    public ConditionModel vCondition;

    static {
        t2o.a(790626439);
        t2o.a(790626449);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
