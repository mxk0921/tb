package com.uc.webview.internal.interfaces;

import com.uc.webview.base.IExtender;
import com.uc.webview.internal.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ICore2Sdk extends IExtender {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface ExtenderID {
        public static final int GET_UTDID = 51208322;
        public static final int GET_UUID = 6051140;
        public static final int LOAD_SP_DATA = 4;
        public static final int ON_CORE_AUTH_RESULT = 2;
        public static final int ON_PROCESS_LIB_CRASHED = 1;
        public static final int SAVE_SP_DATA = 5;
        public static final int SCHEDULE_TASK = 3;
        public static final int WEBVIEW_CORE_ON_INTERCEPT_TOUCH_EVENT = -206059113;
        public static final int WEBVIEW_CORE_ON_OVER_SCROLLED = 645920145;
        public static final int WEBVIEW_CORE_ON_TOUCH_EVENT = 1066264116;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Instance {
        public static ICore2Sdk get() {
            return a.a();
        }
    }

    void onActivityStatus(int i);

    void onInitStatus(int i, boolean z);

    void onPageView(int i, String str);

    void postTask(String str, Runnable runnable);
}
