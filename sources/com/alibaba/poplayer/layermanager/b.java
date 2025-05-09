package com.alibaba.poplayer.layermanager;

import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.layermanager.config.ConfigItem;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class b extends PopRequest.a {
    public final int d;

    static {
        t2o.a(625999948);
    }

    public b(PopRequest.a aVar, ConfigItem configItem) {
        if (aVar != null) {
            this.b = aVar.b;
            this.c = aVar.c;
            this.f2528a = aVar.f2528a;
        } else {
            this.b = configItem.enqueue;
            this.c = configItem.forcePopRespectingPriority;
            this.f2528a = configItem.priority;
        }
        this.d = configItem.level;
    }
}
