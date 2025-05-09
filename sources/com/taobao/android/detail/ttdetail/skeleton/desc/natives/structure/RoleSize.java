package com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure;

import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RoleSize implements Serializable {
    public String arTitle;
    public List<SizeDo> data;
    public int roleId;
    public int sizeType;
    public String tip;
    public String title;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class SizeDo implements Serializable {
        public String key;
        public int max;
        public int maxLength;
        public int min;
        public String tip;
        public String title;
        public String value;

        static {
            t2o.a(912262491);
        }

        public SizeDo() {
        }

        public SizeDo(SizeDo sizeDo) {
            if (sizeDo != null) {
                this.maxLength = sizeDo.maxLength;
                this.title = sizeDo.title;
                this.key = sizeDo.key;
                this.max = sizeDo.max;
                this.min = sizeDo.min;
                this.value = sizeDo.value;
                this.tip = sizeDo.tip;
            }
        }
    }

    static {
        t2o.a(912262490);
    }
}
