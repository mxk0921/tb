package com.taobao.android.dinamicx.template.db;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class DXDataBaseEntry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] ID_PROJECTION = {"_id"};
    @Column("_id")
    public long id = 0;

    /* compiled from: Taobao */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Column {
        String defaultValue() default "";

        boolean indexed() default false;

        boolean notNull() default false;

        boolean primaryKey() default false;

        String value();
    }

    /* compiled from: Taobao */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Table {
        String value();
    }

    static {
        t2o.a(444596977);
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.id = 0L;
        }
    }
}
