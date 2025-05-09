package com.taobao.android.fluid.framework.data.datamodel.pop;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PopPositionData implements Serializable {
    private static final long serialVersionUID = 6582228519250197871L;
    public PositionData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class PositionData implements Serializable {
        private static final long serialVersionUID = 4582228519250197453L;
        public JSONObject animations;
        public Long duration;
        public int h;
        public int w;
        public int x;
        public int y;

        static {
            t2o.a(468714218);
        }
    }

    static {
        t2o.a(468714217);
    }
}
