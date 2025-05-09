package com.taobao.login4android.ab;

import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AbtestExpDo implements Serializable {
    public static final String MURMUR32 = "Murmur32";
    public String algorithm;
    public List<AbtestBucket> buckets;
    public AbtestBucket emptyBucket;
    public boolean needRandomFactor = true;
    public String testKey = "";

    static {
        t2o.a(517996568);
    }
}
