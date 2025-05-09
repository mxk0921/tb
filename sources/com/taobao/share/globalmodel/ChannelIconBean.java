package com.taobao.share.globalmodel;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.l2o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ChannelIconBean implements Serializable {
    @JSONField(name = "action")
    public String action;
    @JSONField(name = "icon")
    public String icon;
    @JSONField(name = l2o.COL_MARK)
    public String mark;
    @JSONField(name = "priority")
    public int priority;
    @JSONField(name = "type")
    public String type;

    static {
        t2o.a(665845774);
    }
}
