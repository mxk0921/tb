package tb;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dr2 {
    public static final int MIDR_ARCH_INDEX = 2;
    public static final int MIDR_IMPL_INDEX = 0;
    public static final int MIDR_LENGTH = 5;
    public static final int MIDR_PART_INDEX = 3;
    public static final int MIDR_REVISION_INDEX = 4;
    public static final int MIDR_VARIANT_INDEX = 1;
    @JSONField(name = "clusters")
    public a[] clusters;
    @JSONField(name = "coreCount")
    public int coreCount;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        @JSONField(name = "coreMask")
        public int coreMask;
        @JSONField(name = "frequencies")
        public int[] frequencies;
        @JSONField(name = "midr")
        public short[] midr;

        static {
            t2o.a(395313332);
        }
    }

    static {
        t2o.a(395313331);
    }
}
