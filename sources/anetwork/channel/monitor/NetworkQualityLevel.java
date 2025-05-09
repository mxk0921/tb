package anetwork.channel.monitor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface NetworkQualityLevel {
    public static final int EXCELLENT = 3;
    public static final int NORMAL = 2;
    public static final int POOR = 1;
    public static final int UNDETECTED = 0;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface Definition {
    }
}
