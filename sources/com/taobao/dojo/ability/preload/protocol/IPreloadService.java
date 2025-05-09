package com.taobao.dojo.ability.preload.protocol;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.xbd;
import tb.ybd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IPreloadService {
    public static final String SERVICE_NAME = "PreloadService";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface EventTypeConst {
    }

    void a(xbd xbdVar);

    void b(String str);

    ybd c();
}
