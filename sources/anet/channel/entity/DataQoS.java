package anet.channel.entity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface DataQoS {
    public static final int HIGH = 2;
    public static final int HIGHEST = 1;
    public static final int LOW = 5;
    public static final int LOWEST = 6;
    public static final int MEDIUM = 3;
    public static final int NORMAL = 4;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface Definition {
    }
}
