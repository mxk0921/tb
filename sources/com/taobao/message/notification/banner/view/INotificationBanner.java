package com.taobao.message.notification.banner.view;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface INotificationBanner {
    void dismiss();

    int getDuration();

    void initBanner(View view, View.OnClickListener onClickListener, PopupWindow.OnDismissListener onDismissListener);

    void initBanner(String str, String str2, View.OnClickListener onClickListener);

    boolean isShowing();

    void setDuration(int i);

    void show();
}
