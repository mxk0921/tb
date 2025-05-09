package com.uc.webview.internal.setup;

import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    public static void a(int i) {
        boolean z;
        Log.w("CoreSwitcher", "clearSwitchedCore ");
        i.c(EnvInfo.getContext());
        if (4 == i) {
            z = true;
        } else {
            z = false;
        }
        GlobalSettings.set(99, z);
    }
}
