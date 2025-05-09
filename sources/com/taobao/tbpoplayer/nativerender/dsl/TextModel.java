package com.taobao.tbpoplayer.nativerender.dsl;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.tbpoplayer.nativerender.dsl.style.TextStyleModel;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TextModel extends ComponentBaseModel {
    @JSONField(name = "enableEmpty")
    public boolean enableEmpty;
    @JSONField(name = "style")
    public TextStyleModel style;
    @JSONField(name = "text")
    public String text;

    static {
        t2o.a(790626458);
    }
}
