package com.alibaba.ariver.engine.api.resources;

import com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ResourceLoadPoint extends Extension {
    @ThreadType(ExecutorType.SYNC)
    Resource load(ResourceLoadContext resourceLoadContext);

    @ThreadType(ExecutorType.SYNC)
    Resource loadGlobalResource(String str);
}
