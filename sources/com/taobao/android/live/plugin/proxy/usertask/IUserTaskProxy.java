package com.taobao.android.live.plugin.proxy.usertask;

import com.taobao.android.live.plugin.proxy.IProxy;
import tb.u7e;
import tb.vae;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IUserTaskProxy extends IProxy {
    public static final String KEY = "IUserTaskProxy";

    u7e createUserController(String str, String str2);

    vae createWVPluginClass();
}
