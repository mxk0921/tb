package com.taobao.tbpoplayer.nativerender.dsl;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class HotSpotModel extends ComponentBaseModel {
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = "actions")
    public List<ActionsItemModel> actions;
    @JSONField(name = "style")
    public StyleModel style;

    static {
        t2o.a(790626448);
    }
}
