package com.taobao.android.litecreator.sdk.editor.data;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MaterialNode implements Serializable {
    public static final String NODE_TYPE_FILTER = "video_editor.filter@";
    public static final String NODE_TYPE_MARVEL = "marvelTemplate";
    public static final String NODE_TYPE_MUSIC = "video_editor.music@";
    public String nodePath;
    public String nodeType;

    static {
        t2o.a(511705430);
    }

    public MaterialNode() {
    }

    public MaterialNode(String str, String str2) {
        this.nodeType = str;
        this.nodePath = str2;
    }
}
