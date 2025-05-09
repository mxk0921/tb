package com.taobao.msgnotification.notifications;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.message.notification.util.DensityUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.msgnotification.notifications.template.Banner;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.fi0;
import tb.hh4;
import tb.ii0;
import tb.ji0;
import tb.t2o;
import tb.y7t;
import tb.yoe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BannerPicNotification extends fi0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BannerPicNotification";
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
                TLog.loge(BannerPicNotification.TAG, "should not notify");
            } else {
                ii0.g().i(BannerPicNotification.this.getMessageId(), BannerPicNotification.access$000(BannerPicNotification.this), BannerPicNotification.access$100(BannerPicNotification.this));
            }
            BannerPicNotification.this.reportNotify();
        }

        @Override // tb.yoe.j
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
            } else {
                BannerPicNotification.this.reportNotify();
            }
        }
    }

    static {
        t2o.a(588251171);
    }

    public BannerPicNotification(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
    }

    public static /* synthetic */ int access$000(BannerPicNotification bannerPicNotification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c33a48d", new Object[]{bannerPicNotification})).intValue();
        }
        return bannerPicNotification.nNotifyId;
    }

    public static /* synthetic */ Notification access$100(BannerPicNotification bannerPicNotification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification) ipChange.ipc$dispatch("417776d1", new Object[]{bannerPicNotification});
        }
        return bannerPicNotification.mNotification;
    }

    private void buildNotification(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59953483", new Object[]{this, new Integer(i)});
            return;
        }
        String packageName = fi0.mContext.getPackageName();
        Banner banner = (Banner) JSON.parseObject(this.mMsgData.sceneTemplateData.toString(), Banner.class);
        RemoteViews remoteViews = new RemoteViews(packageName, R.layout.personal_banner);
        Notification build = this.mBuilder.build();
        this.mNotification = build;
        build.contentView = remoteViews;
        build.bigContentView = remoteViews;
        this.nNotifyId = i;
        Intent intent = this.mParam;
        if (intent != null) {
            this.nNotifyId = intent.getIntExtra("notifyId", i);
        }
        String str = banner.banner;
        Context context = fi0.mContext;
        yoe.d(context, str, R.id.notificationImage, R.drawable.tao_mag_icon, DensityUtil.dip2px(context, 351.0f), DensityUtil.dip2px(fi0.mContext, 64.0f), this.mNotification, new a());
    }

    public static /* synthetic */ Object ipc$super(BannerPicNotification bannerPicNotification, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/notifications/BannerPicNotification");
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
