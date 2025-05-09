package com.taobao.tao.flexbox.layoutmanager.usertracker;

import com.alibaba.fastjson.JSONObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IPerformCollect {

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface Scene {
        public static final String END = "end";
        public static final String RENDER_END = "render_end";
        public static final String START = "start";
    }

    void doCollect(String str);

    JSONObject getData();

    void onEnd();

    void onStart();
}
