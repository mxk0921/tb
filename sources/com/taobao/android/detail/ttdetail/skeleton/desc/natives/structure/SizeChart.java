package com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure;

import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SizeChart implements Serializable {
    public List<SizeChartDo> data;
    public String picTitle;
    public int recLine;
    public boolean shadow;
    public String sketchMap;
    public String tip;
    public String title;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class SizeChartDo implements Serializable {
        public int maxLength;
        public List<String> rowData;
        public String tip;
        public String title;

        static {
            t2o.a(912262495);
        }
    }

    static {
        t2o.a(912262494);
    }
}
