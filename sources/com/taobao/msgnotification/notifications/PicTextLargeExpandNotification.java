package com.taobao.msgnotification.notifications;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.message.notification.util.DensityUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.msgnotification.notifications.template.PicText;
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
public class PicTextLargeExpandNotification extends fi0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PicTextNotification";
    private NotificationCompat.BigPictureStyle bigPictureStyle;
    private AtomicInteger finishCount = new AtomicInteger(0);
    public int notifyId;
    private PicText picText;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements yoe.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.yoe.i
        public void a(Bitmap bitmap, NotificationCompat.Builder builder, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fbd3ec1", new Object[]{this, bitmap, builder, str});
                return;
            }
            PicTextLargeExpandNotification.access$000(PicTextLargeExpandNotification.this).bigLargeIcon(bitmap);
            builder.setLargeIcon(bitmap);
            PicTextLargeExpandNotification.access$100(PicTextLargeExpandNotification.this);
        }

        @Override // tb.yoe.i
        public void b(NotificationCompat.Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379754f6", new Object[]{this, builder});
                return;
            }
            PicTextLargeExpandNotification.access$000(PicTextLargeExpandNotification.this).bigLargeIcon((Bitmap) null);
            PicTextLargeExpandNotification.access$100(PicTextLargeExpandNotification.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements yoe.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.yoe.i
        public void a(Bitmap bitmap, NotificationCompat.Builder builder, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fbd3ec1", new Object[]{this, bitmap, builder, str});
                return;
            }
            PicTextLargeExpandNotification.access$000(PicTextLargeExpandNotification.this).bigPicture(bitmap);
            PicTextLargeExpandNotification.access$100(PicTextLargeExpandNotification.this);
        }

        @Override // tb.yoe.i
        public void b(NotificationCompat.Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379754f6", new Object[]{this, builder});
                return;
            }
            PicTextLargeExpandNotification.access$000(PicTextLargeExpandNotification.this).bigPicture((Bitmap) null);
            PicTextLargeExpandNotification.access$100(PicTextLargeExpandNotification.this);
        }
    }

    static {
        t2o.a(588251175);
    }

    public PicTextLargeExpandNotification(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
    }

    public static /* synthetic */ NotificationCompat.BigPictureStyle access$000(PicTextLargeExpandNotification picTextLargeExpandNotification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationCompat.BigPictureStyle) ipChange.ipc$dispatch("fdb7870d", new Object[]{picTextLargeExpandNotification});
        }
        return picTextLargeExpandNotification.bigPictureStyle;
    }

    public static /* synthetic */ void access$100(PicTextLargeExpandNotification picTextLargeExpandNotification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f6a5c3", new Object[]{picTextLargeExpandNotification});
        } else {
            picTextLargeExpandNotification.checkNotify();
        }
    }

    public static /* synthetic */ Object ipc$super(PicTextLargeExpandNotification picTextLargeExpandNotification, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/notifications/PicTextLargeExpandNotification");
    }

    public NotificationCompat.Builder buildDefaultNotifyBuilder(NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationCompat.Builder) ipChange.ipc$dispatch("a8ac69d0", new Object[]{this, builder});
        }
        if (builder != null) {
            builder.setContentTitle(this.picText.getTitle()).setContentText(this.picText.getSubTitle()).setWhen(System.currentTimeMillis()).setDefaults(-1).setPriority(0).setAutoCancel(true);
            builder.setSmallIcon(R.drawable.tao_mag_icon_white);
        }
        return builder;
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
            y7t.a(TAG, " show error,msgData==null");
            return;
        }
        try {
            int nextInt = fi0.notificationRandom.nextInt();
            this.picText = (PicText) JSON.parseObject(this.mMsgData.sceneTemplateData.toString(), PicText.class);
            NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
            this.bigPictureStyle = bigPictureStyle;
            bigPictureStyle.setBigContentTitle(this.picText.getTitle()).setSummaryText(this.picText.getSubTitle());
            NotificationCompat.Builder buildDefaultNotifyBuilder = buildDefaultNotifyBuilder(this.mBuilder);
            this.mBuilder = buildDefaultNotifyBuilder;
            buildDefaultNotifyBuilder.setStyle(this.bigPictureStyle);
            setVibrateSound(this.mBuilder, this.mParam);
            Intent intent = this.mParam;
            if (intent != null) {
                nextInt = intent.getIntExtra("notifyContentIntentRequestCode", nextInt);
            }
            ji0.a(this.mBuilder, fi0.mContext, this.mExtras, nextInt, this.mParam);
            String packageName = fi0.mContext.getPackageName();
            this.notifyId = nextInt;
            Intent intent2 = this.mParam;
            if (intent2 != null) {
                this.notifyId = intent2.getIntExtra("notifyId", nextInt);
            }
            String str = this.picText.bigIcon;
            if (str == null) {
                y7t.a(TAG, " show error,picText maybe null");
                return;
            }
            Context context = fi0.mContext;
            yoe.b(context, str, DensityUtil.dip2px(context, 53.0f), DensityUtil.dip2px(fi0.mContext, 53.0f), this.mBuilder, packageName, new a());
            String str2 = this.picText.widePic;
            Context context2 = fi0.mContext;
            yoe.b(context2, str2, DensityUtil.dip2px(context2, 351.0f), DensityUtil.dip2px(fi0.mContext, 256.0f), this.mBuilder, packageName, new b());
        } catch (Throwable th) {
            y7t.a(TAG, "throw error,e=" + th.toString());
            TLog.loge(TAG, Log.getStackTraceString(th));
        }
    }

    private void checkNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f6678", new Object[]{this});
            return;
        }
        try {
            this.finishCount.addAndGet(1);
            if (this.finishCount.get() == 2) {
                Notification build = this.mBuilder.build();
                hh4.a a2 = hh4.a();
                if (BrandUtil.getInstance().shouldNotify() && (a2 == null || !"0".equals(a2.b()))) {
                    ii0.g().i(getMessageId(), this.notifyId, build);
                    reportNotify();
                }
                TLog.loge(TAG, "should not notify");
                reportNotify();
            }
        } catch (Exception e) {
            y7t.a(TAG, e.toString());
        }
    }
}
