package com.taobao.tao.flexbox.layoutmanager.jscore;

import android.content.Context;
import android.os.Handler;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface a {
    boolean applyModule(String str, String str2);

    void destroy();

    void dispatchJS(String str);

    void executeJS(String str, String str2);

    void initJSContext(Context context, TNodeJSCore tNodeJSCore, String str, TNodeJSCore.AC ac, String str2);

    boolean initJSCore(d dVar, Handler handler);
}
