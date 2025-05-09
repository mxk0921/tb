package com.taobao.android.live.plugin.proxy.kmp;

import android.content.Context;
import com.taobao.android.live.plugin.proxy.IProxy;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ICommentSendProxy extends IProxy {
    public static final String KEY = "CommentSendProxy";

    void sendCommentAction(Context context, ux9 ux9Var, String str);
}
