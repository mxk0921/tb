package com.alibaba.analytics.core.config.timestamp;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.TableName;
import tb.rf8;
import tb.t2o;

/* compiled from: Taobao */
@TableName("timestamp_config")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TimeStampEntity extends rf8 {
    @Column("namespace")
    public String namespace;
    @Column("timestamp")
    public String timestamp;

    static {
        t2o.a(962592857);
    }

    public TimeStampEntity() {
    }

    public TimeStampEntity(String str, String str2) {
        this.namespace = str;
        this.timestamp = str2;
    }
}
