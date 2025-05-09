package com.taobao.message.notification.base;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IEnvProvider {
    boolean checkBrand(String str);

    boolean isAppBackGround(String str);

    boolean isProcessRight(Context context);

    boolean isWindowManagerAvaliable(Context context);
}
