package com.taobao.schedule;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.l2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ScheduleTaskStrategy implements Serializable {
    @JSONField(name = "abKey")
    public String abKey;
    @JSONField(name = "biz")
    public String biz;
    @JSONField(name = "matchPages")
    public List<String> matchPages;
    @JSONField(name = "matchTriggers")
    public List<String> matchTriggers;
    @JSONField(name = "matchViews")
    public List<String> matchViews;
    @JSONField(name = "once")
    public boolean once = true;
    @JSONField(name = "priority")
    public int priority = 50;
    @JSONField(name = l2o.COL_TASK)
    public String taskId;
}
