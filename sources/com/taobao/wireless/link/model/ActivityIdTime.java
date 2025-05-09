package com.taobao.wireless.link.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ActivityIdTime implements Serializable {
    @JSONField(name = "activities")
    public List<ActivityOutTime> activities;

    static {
        t2o.a(1030750287);
    }
}
