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
import com.taobao.msgnotification.notifications.template.AssembleBanner;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.concurrent.atomic.AtomicInteger;
import tb.fi0;
import tb.hh4;
import tb.ii0;
import tb.ji0;
import tb.t2o;
import tb.y7t;
import tb.yoe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BannerAssembleNotification extends fi0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BannerAssembleNotification";
    private AtomicInteger finishCount = new AtomicInteger(0);
    private Notification mNotification;
    private int mNotifyId;

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
            } else {
                BannerAssembleNotification.access$000(BannerAssembleNotification.this);
            }
        }

        @Override // tb.yoe.j
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
            } else {
                BannerAssembleNotification.access$000(BannerAssembleNotification.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements yoe.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.yoe.j
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b82c5a6a", new Object[]{this});
            } else {
                BannerAssembleNotification.access$000(BannerAssembleNotification.this);
            }
        }

        @Override // tb.yoe.j
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
            } else {
                BannerAssembleNotification.access$000(BannerAssembleNotification.this);
            }
        }
    }

    static {
        t2o.a(588251168);
    }

    public BannerAssembleNotification(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
    }

    public static /* synthetic */ void access$000(BannerAssembleNotification bannerAssembleNotification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71970a4", new Object[]{bannerAssembleNotification});
        } else {
            bannerAssembleNotification.checkNotify();
        }
    }

    private void buildNotification(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59953483", new Object[]{this, new Integer(i)});
            return;
        }
        String packageName = fi0.mContext.getPackageName();
        AssembleBanner assembleBanner = (AssembleBanner) JSON.parseObject(this.mMsgData.sceneTemplateData.toString(), AssembleBanner.class);
        this.mNotifyId = i;
        Intent intent = this.mParam;
        if (intent != null) {
            this.mNotifyId = intent.getIntExtra("notifyId", i);
        }
        RemoteViews remoteViews = new RemoteViews(packageName, R.layout.personal_assemble_banner);
        remoteViews.setTextViewText(R.id.notificationTitle, assembleBanner.getTitle());
        remoteViews.setTextViewText(R.id.notificationText, assembleBanner.subTitle);
        Notification build = this.mBuilder.build();
        this.mNotification = build;
        build.contentView = remoteViews;
        build.bigContentView = remoteViews;
        String str = assembleBanner.pic;
        Context context = fi0.mContext;
        int i2 = R.id.notificationImage;
        int i3 = R.drawable.tao_mag_icon;
        yoe.d(context, str, i2, i3, DensityUtil.dip2px(context, 53.0f), DensityUtil.dip2px(fi0.mContext, 53.0f), this.mNotification, new a());
        String str2 = assembleBanner.bgPic;
        Context context2 = fi0.mContext;
        yoe.d(context2, str2, R.id.notificationBackground, i3, DensityUtil.dip2px(context2, 351.0f), DensityUtil.dip2px(fi0.mContext, 64.0f), this.mNotification, new b());
    }

    public static /* synthetic */ Object ipc$super(BannerAssembleNotification bannerAssembleNotification, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/notifications/BannerAssembleNotification");
    }

    private void checkNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f6678", new Object[]{this});
            return;
        }
        this.finishCount.addAndGet(1);
        if (this.finishCount.get() == 2) {
            hh4.a a2 = hh4.a();
            if (!BrandUtil.getInstance().shouldNotify() || (a2 != null && "0".equals(a2.b()))) {
                TLog.loge(TAG, "should not notify");
            } else {
                ii0.g().i(getMessageId(), this.mNotifyId, this.mNotification);
            }
            reportNotify();
        }
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
