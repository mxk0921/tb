package com.taobao.android.fluid.framework.data.datamodel;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AlbumData implements Serializable {
    public final String albumPosition;
    public final String needMove;
    public final String type;

    static {
        t2o.a(468714184);
    }

    public AlbumData(String str, String str2, String str3) {
        this.type = str;
        this.needMove = str2;
        this.albumPosition = str3;
    }
}
