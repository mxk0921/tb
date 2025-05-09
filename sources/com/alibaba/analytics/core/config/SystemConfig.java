package com.alibaba.analytics.core.config;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.TableName;
import tb.rf8;
import tb.t2o;

/* compiled from: Taobao */
@TableName("utap_system")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SystemConfig extends rf8 {
    @Column("key")
    public String key;
    @Column("value")
    public String value;

    static {
        t2o.a(962592823);
    }
}
