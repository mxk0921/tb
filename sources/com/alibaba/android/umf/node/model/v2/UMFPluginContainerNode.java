package com.alibaba.android.umf.node.model.v2;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.ku0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFPluginContainerNode implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN)
    public UMFPluginNode plugin;

    static {
        t2o.a(79692007);
    }

    public void onFinishParse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb246688", new Object[]{this});
            return;
        }
        UMFPluginNode uMFPluginNode = this.plugin;
        if (uMFPluginNode != null) {
            uMFPluginNode.onFinishParse();
        }
    }
}
