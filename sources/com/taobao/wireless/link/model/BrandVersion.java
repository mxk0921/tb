package com.taobao.wireless.link.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BrandVersion implements Serializable {
    @JSONField(name = "brand")
    public String brand;
    @JSONField(name = "version")
    public String version;

    static {
        t2o.a(1030750289);
    }
}
