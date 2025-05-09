package com.alibaba.android.split.scene;

import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FeatureNode implements Serializable {
    public List<String> activities;
    public List<String> dependsOn;
    public String scene;
    public String tabName = "default";

    static {
        t2o.a(682622983);
    }
}
