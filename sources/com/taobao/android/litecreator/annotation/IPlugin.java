package com.taobao.android.litecreator.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public @interface IPlugin {
    String value();
}
