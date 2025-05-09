package com.taobao.umipublish.extension.windvane.abilities.bean;

import com.taobao.android.litecreator.base.data.meta.MediaStatInfoV2;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MediaBean implements Serializable {
    public String fileId;
    public Integer height;
    public String mediaType;
    public String path;
    public MediaStatInfoV2 statInfo = new MediaStatInfoV2();
    public String url;
    public Integer width;

    static {
        t2o.a(944767198);
    }
}
