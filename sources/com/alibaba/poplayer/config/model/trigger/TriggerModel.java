package com.alibaba.poplayer.config.model.trigger;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.poplayer.config.model.base.IModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TriggerModel implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "pages")
    public List<UriModel> pages;

    static {
        t2o.a(625999902);
        t2o.a(625999896);
    }

    @Override // com.alibaba.poplayer.config.model.base.IModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        List<UriModel> list = this.pages;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
