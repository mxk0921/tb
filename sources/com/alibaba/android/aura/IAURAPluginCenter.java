package com.alibaba.android.aura;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import tb.gn;
import tb.lbb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IAURAPluginCenter extends Serializable {
    Map<String, Class<? extends lbb>> extensionImplMap();

    Map<String, AbstractMap.SimpleEntry<String, Class<? extends lbb>>> extensionMap();

    Map<Class, List<Class<? extends IAURAInputField>>> inputFieldsTargetClass();

    Map<String, Class<? extends gn>> serviceMap();
}
