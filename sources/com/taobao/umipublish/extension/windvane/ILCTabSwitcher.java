package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import com.taobao.android.litecreator.service.ServiceImpl;

/* compiled from: Taobao */
@ServiceImpl("com.taobao.android.litecreator.service.impl.LCTabSwitcher")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ILCTabSwitcher {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnSwitchResult {
        void onFail();

        void onSuccess();
    }

    void switchTargetTab(Context context, String str, OnSwitchResult onSwitchResult);
}
