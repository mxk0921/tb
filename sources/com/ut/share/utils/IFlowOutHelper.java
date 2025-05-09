package com.ut.share.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IFlowOutHelper {
    void startActivity(Context context, Intent intent);

    void startActivityForResult(Activity activity, Intent intent, int i);

    void startActivityForResult(Fragment fragment, Intent intent, int i);
}
