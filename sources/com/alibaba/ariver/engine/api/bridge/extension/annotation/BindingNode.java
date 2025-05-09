package com.alibaba.ariver.engine.api.bridge.extension.annotation;

import com.alibaba.ariver.kernel.api.node.Scope;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface BindingNode {
    Class<? extends Scope> value();
}
