package com.alibaba.poplayer.config.model.trigger;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.poplayer.config.model.base.IModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UriModel implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "filter")
    public String filter;
    @JSONField(name = "uris")
    public List<String> uris;

    static {
        t2o.a(625999903);
        t2o.a(625999896);
    }

    @Override // com.alibaba.poplayer.config.model.base.IModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        List<String> list = this.uris;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
