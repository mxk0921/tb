package com.taobao.android.litecreator.modules.edit.image.thumbnaillist;

import android.graphics.Bitmap;
import java.io.Serializable;
import tb.t2o;
import tb.yst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ThumbnailItem implements Serializable {
    public Bitmap coverThumbnail;
    public yst imageLoader;
    public boolean isNeedCrop = false;
    public int mediaId;
    public int position;
    public String srcPath;
    public String typeTag;

    static {
        t2o.a(511705246);
    }

    public ThumbnailItem(String str) {
        this.typeTag = str;
    }

    public ThumbnailItem() {
    }
}
