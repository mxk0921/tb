package com.taobao.msgnotification.notifications;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.message.notification.util.DensityUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.msgnotification.notifications.template.PicPrice;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.fi0;
import tb.hh4;
import tb.ii0;
import tb.ji0;
import tb.pg1;
import tb.t2o;
import tb.y7t;
import tb.yoe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PicPriceNotification extends fi0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PicPriceNotification";
    private Notification mNotification;
    private int nNotifyId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements yoe.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.yoe.j
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b82c5a6a", new Object[]{this});
                return;
            }
            hh4.a a2 = hh4.a();
            if (!BrandUtil.getInstance().shouldNotify() || (a2 != null && "0".equals(a2.b()))) {
                TLog.loge(PicPriceNotification.TAG, "should not notify");
            } else {
                ii0.g().i(PicPriceNotification.this.getMessageId(), PicPriceNotification.access$000(PicPriceNotification.this), PicPriceNotification.access$100(PicPriceNotification.this));
            }
            PicPriceNotification.this.reportNotify();
        }

        @Override // tb.yoe.j
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
            } else {
                PicPriceNotification.this.reportNotify();
            }
        }
    }

    static {
        t2o.a(588251173);
    }

    public PicPriceNotification(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
    }

    public static /* synthetic */ int access$000(PicPriceNotification picPriceNotification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4935576", new Object[]{picPriceNotification})).intValue();
        }
        return picPriceNotification.nNotifyId;
    }

    public static /* synthetic */ Notification access$100(PicPriceNotification picPriceNotification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification) ipChange.ipc$dispatch("51aee66a", new Object[]{picPriceNotification});
        }
        return picPriceNotification.mNotification;
    }

    public static /* synthetic */ Object ipc$super(PicPriceNotification picPriceNotification, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/notifications/PicPriceNotification");
    }

    private void buildNotification(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59953483", new Object[]{this, new Integer(i)});
            return;
        }
        String packageName = fi0.mContext.getPackageName();
        PicPrice picPrice = (PicPrice) JSON.parseObject(this.mMsgData.sceneTemplateData.toString(), PicPrice.class);
        RemoteViews remoteViews = new RemoteViews(packageName, R.layout.personal_pic_price);
        hh4.a a2 = hh4.a();
        if (a2 == null || TextUtils.isEmpty(a2.a())) {
            remoteViews.setViewVisibility(R.id.notificationBlackBackground, 8);
            remoteViews.setViewVisibility(R.id.notificationWhiteBackground, 8);
        } else {
            String a3 = a2.a();
            if (pg1.ATOM_EXT_white.equals(a3)) {
                remoteViews.setViewVisibility(R.id.notificationWhiteBackground, 0);
            } else if (pg1.ATOM_EXT_black.equals(a3)) {
                remoteViews.setViewVisibility(R.id.notificationBlackBackground, 0);
            } else {
                remoteViews.setViewVisibility(R.id.notificationBlackBackground, 8);
                remoteViews.setViewVisibility(R.id.notificationWhiteBackground, 8);
            }
        }
        if (a2 != null && !TextUtils.isEmpty(a2.c())) {
            remoteViews.setTextColor(R.id.NotificationTextLeft, Color.parseColor(a2.c()));
            remoteViews.setTextColor(R.id.NotificationTextCenter, Color.parseColor(a2.c()));
            remoteViews.setTextColor(R.id.NotificationTextRight, Color.parseColor(a2.c()));
        }
        remoteViews.setTextViewText(R.id.NotificationTextCenter, picPrice.desc);
        remoteViews.setTextViewText(R.id.NotificationPrice, picPrice.price);
        Notification build = this.mBuilder.build();
        this.mNotification = build;
        build.contentView = remoteViews;
        build.bigContentView = remoteViews;
        this.nNotifyId = i;
        Intent intent = this.mParam;
        if (intent != null) {
            this.nNotifyId = intent.getIntExtra("notifyId", i);
        }
        String str = picPrice.pic;
        Context context = fi0.mContext;
        yoe.d(context, str, R.id.notificationImage, R.drawable.tao_mag_icon, DensityUtil.dip2px(context, 53.0f), DensityUtil.dip2px(fi0.mContext, 53.0f), this.mNotification, new a());
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void performNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98d0d91", new Object[]{this});
            return;
        }
        MsgNotficationDTO msgNotficationDTO = this.mMsgData;
        if (msgNotficationDTO == null || msgNotficationDTO.sceneTemplateData == null) {
            y7t.a(TAG, "show error,msgData not correct");
            return;
        }
        try {
            int nextInt = fi0.notificationRandom.nextInt();
            this.mBuilder.setTicker(this.mMsgData.ticker);
            this.mBuilder.setContentTitle("");
            this.mBuilder.setContentText("");
            this.mBuilder.setSmallIcon(R.drawable.tao_mag_icon_white);
            this.mBuilder.setWhen(System.currentTimeMillis());
            y7t.a(TAG, "onNotification clickIntent=message_readed");
            setVibrateSound(this.mBuilder, this.mParam);
            Intent intent = this.mParam;
            if (intent != null) {
                nextInt = intent.getIntExtra("notifyContentIntentRequestCode", nextInt);
            }
            ji0.a(this.mBuilder, fi0.mContext, this.mExtras, nextInt, this.mParam);
            this.mBuilder.setAutoCancel(true);
            buildNotification(nextInt);
        } catch (Throwable th) {
            y7t.a(TAG, "throw error,e=" + th.toString());
            TLog.loge(TAG, Log.getStackTraceString(th));
        }
    }
}
