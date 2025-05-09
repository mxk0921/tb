package com.taobao.android.editionswitcher;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PositionInfoExt implements Serializable {
    public String hTaoContentImg;
    public String oldDialogContentImg;
    public String oldDialogSubTitle;
    public String oldDialogTitle;

    static {
        t2o.a(456130588);
    }

    public PositionInfoExt() {
    }

    public PositionInfoExt(String str, String str2, String str3, String str4) {
        this.hTaoContentImg = str;
        this.oldDialogTitle = str2;
        this.oldDialogSubTitle = str3;
        this.oldDialogContentImg = str4;
    }
}
