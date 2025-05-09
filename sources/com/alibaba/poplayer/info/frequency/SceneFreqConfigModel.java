package com.alibaba.poplayer.info.frequency;

import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SceneFreqConfigModel implements Serializable {
    public String filter;
    public List<FreqConfig> freq;
    public List<String> uris;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class FreqConfig implements Serializable {
        public Integer interval;
        public Long lastRecordTime;
        public String layer;

        static {
            t2o.a(625999929);
        }
    }

    static {
        t2o.a(625999928);
    }
}
