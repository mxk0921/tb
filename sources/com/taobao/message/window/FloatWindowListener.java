package com.taobao.message.window;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface FloatWindowListener {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface FloatStatus {
        public static final int CANCEL = 4;
        public static final int CREATE = 2;
        public static final int DESTROY = 3;
        public static final int INVISIBLE = 1;
        public static final int VISIBLE = 0;
    }

    void onClick();

    void onLifecycleChanged(int i);
}
