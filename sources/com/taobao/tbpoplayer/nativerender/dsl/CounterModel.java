package com.taobao.tbpoplayer.nativerender.dsl;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.tbpoplayer.nativerender.dsl.style.CounterStyleModel;
import java.util.List;
import tb.l2o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CounterModel extends ComponentBaseModel {
    @JSONField(name = "action")
    public ActionModel action;
    @JSONField(name = "actions")
    public List<ActionsItemModel> actions;
    @JSONField(name = "autoStart")
    public boolean autoStart = true;
    @JSONField(name = "endTime")
    public String endTime;
    @JSONField(name = "format")
    public String format;
    @JSONField(name = "marginalValue")
    public String marginalValue;
    @JSONField(name = "overMarginalFormat")
    public String overMarginalFormat;
    @JSONField(name = "overMarginalFormatType")
    public String overMarginalFormatType;
    @JSONField(name = l2o.COL_S_TIME)
    public String serverTime;
    @JSONField(name = "showMilliseconds")
    public boolean showMilliseconds;
    @JSONField(name = "style")
    public CounterStyleModel style;

    static {
        t2o.a(790626441);
    }
}
