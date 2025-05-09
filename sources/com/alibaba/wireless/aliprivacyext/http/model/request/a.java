package com.alibaba.wireless.aliprivacyext.http.model.request;

import com.alibaba.wireless.aliprivacyext.recommendation.c;
import java.io.Serializable;
import tb.mwx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class a implements Serializable {
    public String clientInfo;

    public a() {
        if (c.K() != null) {
            this.clientInfo = mwx.e(new com.alibaba.wireless.aliprivacyext.track.model.a(c.K()));
        }
    }
}
