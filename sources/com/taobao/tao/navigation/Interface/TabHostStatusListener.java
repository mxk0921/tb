package com.taobao.tao.navigation.Interface;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface TabHostStatusListener {
    public static final int TAB_HOST_REBUILD = 1;
    public static final int TAB_REBUILD_REASON_VERSION_UNKNOWN = 0;
    public static final int TAB_REBUILD_REASON_VERSION_UPDATE_EDLP = 1;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface TabHostStatusChangedEventType {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface TabRebuildReason {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f12544a;
        public int b;
    }

    int listenEventType();

    void onTabHostStatusChanged(a aVar);
}
