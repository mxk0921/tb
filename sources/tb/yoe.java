package tb;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.base.Versions;
import com.taobao.message.notification.util.DensityUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.ImageStrategyDecider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class yoe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ImageTools";

    /* renamed from: a  reason: collision with root package name */
    public static final ImageStrategyConfig f32231a = ImageStrategyConfig.v(RemoteMessageConst.NOTIFICATION, 7201).a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f32232a;
        public final /* synthetic */ NotificationCompat.Builder b;

        public a(i iVar, NotificationCompat.Builder builder) {
            this.f32232a = iVar;
            this.b = builder;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            this.f32232a.b(this.b);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f32233a;
        public final /* synthetic */ NotificationCompat.Builder b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public b(i iVar, NotificationCompat.Builder builder, String str, String str2) {
            this.f32233a = iVar;
            this.b = builder;
            this.c = str;
            this.d = str2;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (!(succPhenixEvent.getDrawable() == null || succPhenixEvent.getDrawable().getBitmap() == null)) {
                try {
                    Bitmap bitmap = succPhenixEvent.getDrawable().getBitmap();
                    if (bitmap != null) {
                        this.f32233a.a(bitmap, this.b, this.c);
                        if (Versions.isDebug()) {
                            StringBuilder sb = new StringBuilder("getBitmapByUrl decideUrl= ");
                            sb.append(this.d);
                            sb.append(" | bitmap size= ");
                            sb.append(bitmap.getByteCount() / 1024);
                            sb.append(" kb");
                        }
                    } else {
                        this.f32233a.b(this.b);
                    }
                } catch (Throwable th) {
                    y7t.a(yoe.TAG, "getBitmapByUrl error,e=" + th.toString());
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f32234a;
        public final /* synthetic */ NotificationCompat.Builder b;

        public c(i iVar, NotificationCompat.Builder builder) {
            this.f32234a = iVar;
            this.b = builder;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            this.f32234a.b(this.b);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f32235a;
        public final /* synthetic */ NotificationCompat.Builder b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public d(i iVar, NotificationCompat.Builder builder, String str, String str2) {
            this.f32235a = iVar;
            this.b = builder;
            this.c = str;
            this.d = str2;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (!(succPhenixEvent.getDrawable() == null || succPhenixEvent.getDrawable().getBitmap() == null)) {
                try {
                    Bitmap bitmap = succPhenixEvent.getDrawable().getBitmap();
                    if (bitmap != null) {
                        this.f32235a.a(bitmap, this.b, this.c);
                        if (Versions.isDebug()) {
                            StringBuilder sb = new StringBuilder("getBitmapByUrl decideUrl= ");
                            sb.append(this.d);
                            sb.append(" | bitmap size= ");
                            sb.append(bitmap.getByteCount() / 1024);
                            sb.append(" kb");
                        }
                    } else {
                        this.f32235a.b(this.b);
                    }
                } catch (Throwable th) {
                    y7t.a(yoe.TAG, "getBitmapByUrl error,e=" + th.toString());
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class e implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f32236a;

        public e(i iVar) {
            this.f32236a = iVar;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            this.f32236a.b(null);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class f implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f32237a;

        public f(i iVar) {
            this.f32237a = iVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                this.f32237a.a(succPhenixEvent.getDrawable().getBitmap(), null, null);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class g implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Notification f32238a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ j d;

        public g(Notification notification, int i, int i2, j jVar) {
            this.f32238a = notification;
            this.b = i;
            this.c = i2;
            this.d = jVar;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            try {
                RemoteViews remoteViews = this.f32238a.contentView;
                remoteViews.setImageViewResource(this.b, this.c);
                this.f32238a.contentView = remoteViews;
                j jVar = this.d;
                if (jVar != null) {
                    jVar.onFailed();
                }
            } catch (Exception e) {
                y7t.a(yoe.TAG, "updateNotifyIconByUrl error,e=" + e.toString());
                TLog.loge(yoe.TAG, Log.getStackTraceString(e));
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface i {
        void a(Bitmap bitmap, NotificationCompat.Builder builder, String str);

        void b(NotificationCompat.Builder builder);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface j {
        void a();

        void onFailed();
    }

    public static void a(Context context, MsgNotficationDTO msgNotficationDTO, int i2, NotificationCompat.Builder builder, String str, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de3b7bda", new Object[]{context, msgNotficationDTO, new Integer(i2), builder, str, iVar});
        } else if (iVar == null) {
            y7t.a(TAG, "getBitmapByUrl listener is null");
        } else if (TextUtils.isEmpty(msgNotficationDTO.personalImgUrl) || i2 <= 0) {
            iVar.b(builder);
        } else {
            float f2 = i2;
            String decideUrl = ImageStrategyDecider.decideUrl(msgNotficationDTO.personalImgUrl, Integer.valueOf(DensityUtil.dip2px(context, f2)), Integer.valueOf(DensityUtil.dip2px(context, f2)), f32231a);
            s0m.B().N0(context).T(decideUrl).succListener(new b(iVar, builder, str, decideUrl)).failListener(new a(iVar, builder)).fetch();
        }
    }

    public static void b(Context context, String str, int i2, int i3, NotificationCompat.Builder builder, String str2, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4e7320", new Object[]{context, str, new Integer(i2), new Integer(i3), builder, str2, iVar});
        } else if (iVar == null) {
            y7t.a(TAG, "getBitmapByUrl listener is null");
        } else if (TextUtils.isEmpty(str) || i2 <= 0 || i3 <= 0) {
            iVar.b(builder);
        } else {
            String decideUrl = ImageStrategyDecider.decideUrl(str, Integer.valueOf(i2), Integer.valueOf(i3), f32231a);
            s0m.B().N0(context).T(decideUrl).succListener(new d(iVar, builder, str2, decideUrl)).failListener(new c(iVar, builder)).fetch();
        }
    }

    public static void c(String str, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a457e76f", new Object[]{str, iVar});
        } else {
            s0m.B().T(str).succListener(new f(iVar)).failListener(new e(iVar)).fetch();
        }
    }

    public static void d(Context context, String str, int i2, int i3, int i4, int i5, Notification notification, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295318e6", new Object[]{context, str, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), notification, jVar});
        } else if (TextUtils.isEmpty(str)) {
            RemoteViews remoteViews = notification.contentView;
            remoteViews.setImageViewResource(i2, i3);
            notification.contentView = remoteViews;
            if (jVar != null) {
                jVar.onFailed();
            }
        } else {
            s0m.B().N0(context).T(ImageStrategyDecider.decideUrl(str, Integer.valueOf(i4), Integer.valueOf(i5), f32231a)).succListener(new h(notification, i2, i3, jVar)).failListener(new g(notification, i2, i3, jVar)).fetch();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class h implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Notification f32239a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ j d;

        public h(Notification notification, int i, int i2, j jVar) {
            this.f32239a = notification;
            this.b = i;
            this.c = i2;
            this.d = jVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            RemoteViews remoteViews;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (!(succPhenixEvent.getDrawable() == null || succPhenixEvent.getDrawable().getBitmap() == null)) {
                try {
                    Bitmap bitmap = succPhenixEvent.getDrawable().getBitmap();
                    if (bitmap != null) {
                        remoteViews = this.f32239a.contentView;
                        remoteViews.setImageViewBitmap(this.b, bitmap);
                        Notification notification = this.f32239a;
                        RemoteViews remoteViews2 = notification.bigContentView;
                        if (remoteViews2 != null) {
                            notification.largeIcon = null;
                        }
                        remoteViews2.setImageViewBitmap(this.b, bitmap);
                        remoteViews.setViewVisibility(this.b, 0);
                    } else {
                        remoteViews = this.f32239a.contentView;
                        remoteViews.setImageViewResource(this.b, this.c);
                    }
                    this.f32239a.contentView = remoteViews;
                    j jVar = this.d;
                    if (jVar != null) {
                        jVar.a();
                    }
                } catch (Throwable th) {
                    y7t.a(yoe.TAG, "updateNotifyIconByUrl error,e=" + th.toString());
                    TLog.loge(yoe.TAG, Log.getStackTraceString(th));
                }
            }
            return true;
        }
    }

    static {
        t2o.a(588251186);
    }
}
