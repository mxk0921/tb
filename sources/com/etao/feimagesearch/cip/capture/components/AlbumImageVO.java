package com.etao.feimagesearch.cip.capture.components;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlbumImageVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Bitmap bitmap;
    public Uri imgUri;
    public String orientation;
    public String id = "";
    public String imgFilePath = "";
    public String imgName = "";
    public String imgSize = "";
    public String imgWidth = "-1";
    public String imgHeight = "-1";
    public String lastUpdateTime = "-1";
    public boolean needShow = false;

    static {
        t2o.a(481296905);
    }

    public int getOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        if (TextUtils.isEmpty(this.orientation)) {
            return 0;
        }
        try {
            return Integer.parseInt(this.orientation);
        } catch (Exception unused) {
            return 0;
        }
    }
}
