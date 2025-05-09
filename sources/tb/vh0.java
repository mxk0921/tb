package tb;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vh0 extends wh0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AgCustomNotification";
    public final int b;

    static {
        t2o.a(588251138);
    }

    public vh0(int i, Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
        this.b = i;
    }

    public static /* synthetic */ Object ipc$super(vh0 vh0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/AgCustomNotification");
    }

    @Override // tb.wh0
    public NotificationCompat.Builder c(MsgNotficationDTO msgNotficationDTO, NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationCompat.Builder) ipChange.ipc$dispatch("64ce97fd", new Object[]{this, msgNotficationDTO, builder});
        }
        if (builder != null) {
            builder.setContentTitle(msgNotficationDTO.title).setContentText(msgNotficationDTO.text).setTicker(msgNotficationDTO.ticker).setWhen(System.currentTimeMillis()).setAutoCancel(true);
            builder.setSmallIcon(R.drawable.tao_mag_icon_white, 0);
        }
        return builder;
    }

    @Override // tb.wh0
    public void d(NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b8a6bb", new Object[]{this, builder});
            return;
        }
        Notification build = builder.build();
        RemoteViews remoteViews = build.contentView;
        if (remoteViews != null) {
            remoteViews.setViewVisibility(R.id.normalSmallImageIcon, 8);
        }
        if (BrandUtil.getInstance().shouldNotify()) {
            m9k.a(TAG, "onGetImageFailed");
            ii0.g().i(getMessageId(), this.f30688a, build);
        }
        reportNotify();
    }

    @Override // tb.wh0
    public void e(Bitmap bitmap, NotificationCompat.Builder builder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579ebd06", new Object[]{this, bitmap, builder, str});
            return;
        }
        builder.setLargeIcon(bitmap);
        Notification g = g(this.mMsgData, builder, str);
        if (g != null) {
            g.contentView.setImageViewBitmap(R.id.normalBigImageIcon, bitmap);
            g.bigContentView.setImageViewBitmap(R.id.notificationImage, bitmap);
            if (BrandUtil.getInstance().shouldNotify()) {
                m9k.a("AgBigPictureNotification", "onGetImageSucceed");
                ii0.g().i(getMessageId(), this.f30688a, g);
            }
            reportNotify();
        }
    }

    @Override // tb.wh0
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f73ee56", new Object[]{this})).intValue();
        }
        if (this.b != 2) {
            return 100;
        }
        return 200;
    }

    public final Notification g(MsgNotficationDTO msgNotficationDTO, NotificationCompat.Builder builder, String str) {
        RemoteViews remoteViews;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification) ipChange.ipc$dispatch("e4f326e1", new Object[]{this, msgNotficationDTO, builder, str});
        }
        int i = this.b;
        if (i == 1) {
            remoteViews = new RemoteViews(str, R.layout.personal_msg_custom);
            int i2 = R.id.title;
            remoteViews.setTextViewText(i2, msgNotficationDTO.title);
            if (!TextUtils.isEmpty(BrandUtil.getInstance().getTitleColor())) {
                remoteViews.setTextColor(i2, Color.parseColor(BrandUtil.getInstance().getTitleColor()));
            }
            int i3 = R.id.content;
            remoteViews.setTextViewText(i3, msgNotficationDTO.text);
            if (!TextUtils.isEmpty(BrandUtil.getInstance().getContentColor())) {
                remoteViews.setTextColor(i3, Color.parseColor(BrandUtil.getInstance().getContentColor()));
            }
        } else if (i != 2) {
            remoteViews = new RemoteViews(str, R.layout.personal_msg_custom);
            int i4 = R.id.title;
            remoteViews.setTextViewText(i4, msgNotficationDTO.title);
            if (!TextUtils.isEmpty(BrandUtil.getInstance().getTitleColor())) {
                remoteViews.setTextColor(i4, Color.parseColor(BrandUtil.getInstance().getTitleColor()));
            }
            int i5 = R.id.content;
            remoteViews.setTextViewText(i5, msgNotficationDTO.text);
            if (!TextUtils.isEmpty(BrandUtil.getInstance().getContentColor())) {
                remoteViews.setTextColor(i5, Color.parseColor(BrandUtil.getInstance().getContentColor()));
            }
        } else {
            remoteViews = new RemoteViews(str, R.layout.personal_msg_custom_pic);
        }
        RemoteViews remoteViews2 = new RemoteViews(str, R.layout.personal_msg_normal);
        int i6 = R.id.normalTitle;
        remoteViews2.setTextViewText(i6, msgNotficationDTO.title);
        if (!TextUtils.isEmpty(BrandUtil.getInstance().getTitleColor())) {
            remoteViews2.setTextColor(i6, Color.parseColor(BrandUtil.getInstance().getTitleColor()));
        }
        int i7 = R.id.normalContent;
        remoteViews2.setTextViewText(i7, msgNotficationDTO.text);
        if (!TextUtils.isEmpty(BrandUtil.getInstance().getContentColor())) {
            remoteViews2.setTextColor(i7, Color.parseColor(BrandUtil.getInstance().getContentColor()));
        }
        int h = h();
        if (h != R.drawable.notify_small_icon) {
            remoteViews2.setImageViewResource(R.id.normalSmallImageIcon, h);
            remoteViews2.setImageViewResource(R.id.normalBigImageIcon, h);
        }
        String b = y22.b();
        if (!TextUtils.isEmpty(b)) {
            int i8 = R.id.normalTime;
            remoteViews2.setTextViewText(i8, b.split("-")[3]);
            if (!TextUtils.isEmpty(BrandUtil.getInstance().getTitleColor())) {
                remoteViews2.setTextColor(i8, Color.parseColor(BrandUtil.getInstance().getTitleColor()));
            }
        }
        Notification build = builder.build();
        build.contentView = remoteViews2;
        build.bigContentView = remoteViews;
        return build;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("677ee0b8", new Object[]{this})).intValue();
        }
        if (fi0.mContext.getPackageName() != null) {
            return Globals.getApplication().getApplicationInfo().icon;
        }
        return R.drawable.notify_small_icon;
    }
}
