package com.taobao.tbpoplayer.nativerender.dsl.style;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.weex.common.Constants;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TextStyleModel extends StyleModel {
    @JSONField(name = "color")
    public String color;
    @JSONField(name = "fontSize")
    public String fontSize;
    @JSONField(name = "fontWeight")
    public String fontWeight;
    @JSONField(name = "lineHeight")
    public String lineHeight;
    @JSONField(name = "lineSpace")
    public String lineSpace;
    @JSONField(name = "maxLines")
    public String maxLines;
    @JSONField(name = Constants.Name.TEXT_ALIGN)
    public String textAlign;

    static {
        t2o.a(790626465);
    }
}
