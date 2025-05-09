package com.alipay.android.app.substitute.api;

import android.content.Context;
import android.os.Bundle;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IExternalSocialPlugin {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface IFriendListCallback {
        void onResult(Bundle[] bundleArr, Bundle bundle);
    }

    void getLatestFriendList(Context context, Bundle bundle, IFriendListCallback iFriendListCallback);
}
