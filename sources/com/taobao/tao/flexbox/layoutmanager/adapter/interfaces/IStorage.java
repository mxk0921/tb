package com.taobao.tao.flexbox.layoutmanager.adapter.interfaces;

import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IStorage {
    public static final String TYPE_CONFIG = "config";
    public static final String TYPE_DSL = "dsl";
    public static final String TYPE_FILE = "file";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface Type {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    Object a(String str);

    void b(String str, Object obj);

    void c(String str, byte[] bArr);

    void d(String str, String str2, Object obj);

    Object e(String str, String str2);

    boolean f(long j);

    File g(String str);

    boolean h(String str, String str2);
}
