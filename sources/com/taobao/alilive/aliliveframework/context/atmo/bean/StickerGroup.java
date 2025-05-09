package com.taobao.alilive.aliliveframework.context.atmo.bean;

import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class StickerGroup implements Serializable {
    public AtmosphereResListResponseData.Rule rule;
    public String stickerType;
    public List<StickerConfig> stickers;
    public String title;
    public String type;

    static {
        t2o.a(806355010);
    }
}
