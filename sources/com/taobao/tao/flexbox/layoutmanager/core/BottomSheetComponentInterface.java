package com.taobao.tao.flexbox.layoutmanager.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface BottomSheetComponentInterface {

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface State {
        public static final String HALF = "half";
        public static final String HIDDEN = "hidden";
        public static final String INIT = "init";
        public static final String LARGE = "large";
        public static final String SMALL = "small";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(String str);
    }

    void addBottomSheetStateChangedListener(a aVar);

    boolean isInIdle();

    void removeBottomSheetStateChangedListener(a aVar);
}
