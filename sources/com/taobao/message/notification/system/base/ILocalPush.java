package com.taobao.message.notification.system.base;

import android.app.NotificationChannel;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ad2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ILocalPush {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Content {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String DIS_PLAY_TITLE = "您有新消息";
        private final CharSequence mContent;
        private final CharSequence mTicker;
        private final CharSequence mTitle;

        static {
            t2o.a(610271313);
        }

        public Content(CharSequence charSequence, CharSequence charSequence2) {
            this(charSequence, charSequence2, null);
        }

        public void setData(NotificationCompat.Builder builder) {
            CharSequence charSequence;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d159d26", new Object[]{this, builder});
                return;
            }
            CharSequence charSequence2 = this.mTitle;
            CharSequence charSequence3 = DIS_PLAY_TITLE;
            if (charSequence2 == null) {
                charSequence2 = charSequence3;
            }
            if (this.mContent != null) {
                charSequence3 = this.mTicker;
                if (charSequence3 == null) {
                    charSequence3 = ((Object) charSequence2) + ": " + ((Object) this.mContent);
                }
                charSequence = this.mContent;
            } else {
                charSequence = charSequence3;
            }
            if (!TextUtils.isEmpty(this.mTicker)) {
                charSequence3 = this.mTicker;
            }
            builder.setTicker(charSequence3);
            builder.setContentTitle(charSequence2);
            builder.setContentText(charSequence);
        }

        public Content(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.mTitle = charSequence;
            this.mContent = charSequence2;
            this.mTicker = charSequence3;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface RemoteViewListener {
        void on(RemoteViews remoteViews);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface RemoteViewsHolder {
        void fetch(RemoteViewListener remoteViewListener);
    }

    String getCategory();

    RemoteViewsHolder getCustomView();

    int getImportance();

    Bitmap getLargeIcon();

    Pair<String, ad2> getLargeIconURL();

    NotificationChannel getNotificationChannel();

    Uri getNotificationSound();

    Content getPushContent();

    int getRequestId();

    int getSmallIcon();

    void performNotify();
}
