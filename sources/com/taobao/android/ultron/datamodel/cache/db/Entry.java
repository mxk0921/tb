package com.taobao.android.ultron.datamodel.cache.db;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class Entry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] ID_PROJECTION = {"_id"};
    @Column("_id")

    /* renamed from: a  reason: collision with root package name */
    public long f9843a = 0;

    /* compiled from: Taobao */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface Column {
        String defaultValue() default "";

        boolean fullText() default false;

        boolean indexed() default false;

        String value();
    }

    /* compiled from: Taobao */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface Table {
        String value();
    }

    static {
        t2o.a(83886139);
    }
}
