package com.alibaba.android.umf;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import tb.gz;
import tb.v3e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IUMFPluginCenter extends Serializable {
    Map<String, Class<? extends v3e>> extensionImplMap();

    Map<String, AbstractMap.SimpleEntry<String, Class<? extends v3e>>> extensionMap();

    Map<String, Class<? extends gz>> serviceMap();
}
