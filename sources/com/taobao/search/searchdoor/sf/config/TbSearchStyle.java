package com.taobao.search.searchdoor.sf.config;

import com.alibaba.fastjson.annotation.JSONField;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TbSearchStyle {
    @JSONField(name = "card")
    public TbSearchStyleCard card;
    @JSONField(name = "common")
    public TbSearchStyleCommon common;
    public boolean isTb2024;

    static {
        t2o.a(815793093);
    }
}
