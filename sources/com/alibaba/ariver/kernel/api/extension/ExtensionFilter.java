package com.alibaba.ariver.kernel.api.extension;

import com.alibaba.ariver.kernel.api.extension.Extension;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ExtensionFilter<T extends Extension> {
    List<T> filter(List<T> list);
}
