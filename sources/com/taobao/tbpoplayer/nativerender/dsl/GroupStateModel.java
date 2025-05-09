package com.taobao.tbpoplayer.nativerender.dsl;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GroupStateModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "stateIds")
    public List<String> stateIds;

    static {
        t2o.a(790626447);
        t2o.a(790626449);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        List<String> list = this.stateIds;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
