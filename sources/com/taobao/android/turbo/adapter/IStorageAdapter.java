package com.taobao.android.turbo.adapter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import tb.g1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface IStorageAdapter {
    public static final a Companion = a.$$INSTANCE;
    public static final String TYPE_CONFIG = "config";
    public static final String TYPE_FILE = "file";
    public static final String TYPE_LRU = "lru";
    public static final String TYPE_MEM = "mem";

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/taobao/android/turbo/adapter/IStorageAdapter$Type;", "", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface Type {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String TYPE_CONFIG = "config";
        public static final String TYPE_FILE = "file";
        public static final String TYPE_LRU = "lru";
        public static final String TYPE_MEM = "mem";

        static {
            t2o.a(919601173);
        }
    }

    Object a(String str);

    void b(String str, Object obj);

    void c(String str, g1a<Object, xhv> g1aVar);

    void d(String str, String str2, Object obj);

    Object e(String str, String str2);
}
