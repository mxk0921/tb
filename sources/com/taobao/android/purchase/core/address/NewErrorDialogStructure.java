package com.taobao.android.purchase.core.address;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class NewErrorDialogStructure implements Serializable {
    public String image;
    public ButtonStructure left;
    public String msg;
    public ButtonStructure right;
    public String subTitle;
    public String title;
    public String titleBgColor;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class ButtonStructure implements Serializable {
        public String bgColor;
        public String text;

        static {
            t2o.a(714080270);
        }
    }

    static {
        t2o.a(714080269);
    }
}
