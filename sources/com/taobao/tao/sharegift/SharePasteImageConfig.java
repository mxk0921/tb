package com.taobao.tao.sharegift;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SharePasteImageConfig implements Serializable {
    @JSONField(name = "bizID")
    public String bizID;
    @JSONField(name = "buttonText")
    public String buttonText;
    @JSONField(name = "sharepasteimage")
    public String sharepasteimage;
    @JSONField(name = "tipimage")
    public String tipimage;

    static {
        t2o.a(666894542);
    }
}
