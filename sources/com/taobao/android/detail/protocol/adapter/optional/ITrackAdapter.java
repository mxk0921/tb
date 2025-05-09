package com.taobao.android.detail.protocol.adapter.optional;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface ITrackAdapter extends Serializable {
    void ctrlClickedOnPage(Context context, String str, String str2, Pair<String, String>... pairArr);

    void pageEnter(Activity activity, String str, String str2, String str3);

    void pageLeave(Activity activity, String str, String str2);
}
