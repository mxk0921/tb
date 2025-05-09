package com.alibaba.android.split.access;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class AbstractAccessSplitDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(676331561);
    }

    public abstract String[] getAccessClasses();
}
