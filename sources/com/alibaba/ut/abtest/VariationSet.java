package com.alibaba.ut.abtest;

import android.os.Parcelable;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface VariationSet extends Parcelable {
    boolean contains(String str);

    @Deprecated
    long getExperimentBucketId();

    @Deprecated
    long getExperimentId();

    @Deprecated
    long getExperimentReleaseId();

    Variation getVariation(String str);

    Iterator<Variation> iterator();

    int size();
}
