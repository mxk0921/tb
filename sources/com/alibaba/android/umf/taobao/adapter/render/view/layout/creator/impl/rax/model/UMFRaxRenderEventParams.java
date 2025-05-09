package com.alibaba.android.umf.taobao.adapter.render.view.layout.creator.impl.rax.model;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFRaxRenderEventParams {
    @JSONField(name = "componentKey")
    public String componentKey;
    @JSONField(name = "event")
    public String event;
    @JSONField(name = "eventPayload")
    public List<Event> eventPayload;

    static {
        t2o.a(81789274);
    }
}
