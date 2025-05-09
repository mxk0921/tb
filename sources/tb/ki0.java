package tb;

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
import com.taobao.message.notification.system.base.BasicLocalPush;
import com.taobao.message.notification.system.base.ILocalPush;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.yoe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ki0 extends ei0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements yoe.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RemoteViews f22682a;

        public a(ki0 ki0Var, RemoteViews remoteViews) {
            this.f22682a = remoteViews;
        }

        @Override // tb.yoe.i
        public void a(Bitmap bitmap, NotificationCompat.Builder builder, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fbd3ec1", new Object[]{this, bitmap, builder, str});
                return;
            }
            RemoteViews remoteViews = this.f22682a;
            int i = R.id.localPushRightImg;
            remoteViews.setViewVisibility(i, 0);
            this.f22682a.setImageViewBitmap(i, bitmap);
        }

        @Override // tb.yoe.i
        public void b(NotificationCompat.Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379754f6", new Object[]{this, builder});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements ILocalPush.RemoteViewsHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RemoteViews f22683a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements s8d<FailPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ILocalPush.RemoteViewListener f22684a;

            public a(ILocalPush.RemoteViewListener remoteViewListener) {
                this.f22684a = remoteViewListener;
            }

            /* renamed from: a */
            public boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                TLog.loge(BasicLocalPush.TAG, "头像加载失败:" + failPhenixEvent.getResultCode());
                b.this.f22683a.setImageViewResource(R.id.notificationImage, R.drawable.tao_mag_icon);
                this.f22684a.on(b.this.f22683a);
                return false;
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.ki0$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class C0971b implements s8d<SuccPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ILocalPush.RemoteViewListener f22685a;

            public C0971b(ILocalPush.RemoteViewListener remoteViewListener) {
                this.f22685a = remoteViewListener;
            }

            /* renamed from: a */
            public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                Bitmap bitmap;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                if (!(succPhenixEvent.getDrawable() == null || succPhenixEvent.isIntermediate() || (bitmap = succPhenixEvent.getDrawable().getBitmap()) == null)) {
                    RemoteViews remoteViews = b.this.f22683a;
                    int i = R.id.notificationImage;
                    remoteViews.setViewVisibility(i, 0);
                    b.this.f22683a.setImageViewBitmap(i, bitmap);
                }
                this.f22685a.on(b.this.f22683a);
                return true;
            }
        }

        public b(RemoteViews remoteViews) {
            this.f22683a = remoteViews;
        }

        @Override // com.taobao.message.notification.system.base.ILocalPush.RemoteViewsHolder
        public void fetch(ILocalPush.RemoteViewListener remoteViewListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0bc53e0", new Object[]{this, remoteViewListener});
            } else if (!ki0.this.b.isMultiContent) {
                s0m.B().T(ki0.this.b.personalImgUrl).succListener(new C0971b(remoteViewListener)).failListener(new a(remoteViewListener)).fetch();
            }
        }
    }

    static {
        t2o.a(588251158);
    }

    public ki0(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
    }

    public static /* synthetic */ Object ipc$super(ki0 ki0Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1669199577:
                ki0Var.setTitle((String) objArr[0]);
                return null;
            case -1432119014:
                return new Integer(ki0Var.genPushRequestId());
            case -1304581520:
                return ki0Var.getNotificationChannel();
            case -893005340:
                return new Integer(ki0Var.getImportance());
            case -505501570:
                ki0Var.setUrl((String) objArr[0]);
                return null;
            case -423164667:
                return ki0Var.getCategory();
            case -14167635:
                return ki0Var.getMessageId();
            case 1161759794:
                return new Boolean(super.onBeforeNotify());
            case 1176236886:
                return new Integer(ki0Var.getMergeType());
            case 1204303463:
                return new Boolean(ki0Var.i());
            case 1386857736:
                ki0Var.setContent((String) objArr[0]);
                return null;
            case 1800760461:
                return new Boolean(super.isForegroundSupport());
            case 2030845250:
                return ki0Var.getLargeIconURL();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/local/push/AgooPersonalNotification");
        }
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public ILocalPush.RemoteViewsHolder getCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILocalPush.RemoteViewsHolder) ipChange.ipc$dispatch("f880f0ff", new Object[]{this});
        }
        if (this.b.view_type != 1) {
            return null;
        }
        RemoteViews j = j(this.b, this.f18590a.getPackageName());
        if (j != null) {
            k(this.b, j);
        }
        return new b(j);
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public ILocalPush.Content getPushContent() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILocalPush.Content) ipChange.ipc$dispatch("efefee7d", new Object[]{this});
        }
        MsgNotficationDTO msgNotficationDTO = this.b;
        if (msgNotficationDTO == null) {
            str = "";
        } else {
            str = msgNotficationDTO.ticker;
        }
        return new ILocalPush.Content("", "", str);
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public boolean isForegroundSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b556c8d", new Object[]{this})).booleanValue();
        }
        if (!isCloseLocalPush() || !i()) {
            return super.isForegroundSupport();
        }
        return false;
    }

    public final void k(MsgNotficationDTO msgNotficationDTO, RemoteViews remoteViews) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd6c260", new Object[]{this, msgNotficationDTO, remoteViews});
        } else if (msgNotficationDTO != null && !TextUtils.isEmpty(msgNotficationDTO.localPushRightImg)) {
            yoe.c(msgNotficationDTO.localPushRightImg, new a(this, remoteViews));
        }
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public boolean onBeforeNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("453f0c32", new Object[]{this})).booleanValue();
        }
        super.onBeforeNotify();
        if (this.b == null) {
            return false;
        }
        return true;
    }

    public static RemoteViews j(MsgNotficationDTO msgNotficationDTO, String str) {
        RemoteViews remoteViews;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteViews) ipChange.ipc$dispatch("6095bc70", new Object[]{msgNotficationDTO, str});
        }
        if (msgNotficationDTO.isMultiContent) {
            remoteViews = new RemoteViews(str, R.layout.personal_msg_multi);
            String[] split = msgNotficationDTO.text.split("\\n");
            if (split != null && split.length > 1) {
                remoteViews.setViewVisibility(R.id.multi_content, 0);
                remoteViews.setTextViewText(R.id.multiText1, split[0]);
                if (split.length >= 2) {
                    remoteViews.setTextViewText(R.id.multiText2, split[1]);
                }
                if (split.length >= 3) {
                    remoteViews.setTextViewText(R.id.multiText3, split[2]);
                }
            }
        } else {
            remoteViews = null;
        }
        if (remoteViews == null) {
            remoteViews = new RemoteViews(str, R.layout.personal_msg_default);
        }
        new StringBuilder("contentView end...getPackageName()=").append(str);
        String bgColor = BrandUtil.getInstance().getBgColor();
        if (TextUtils.isEmpty(bgColor) || msgNotficationDTO.isMultiContent) {
            if (!msgNotficationDTO.isMultiContent) {
                remoteViews.setViewVisibility(R.id.notificationBlackBackground, 8);
                remoteViews.setViewVisibility(R.id.notificationWhiteBackground, 8);
            }
        } else if (pg1.ATOM_EXT_white.equals(bgColor)) {
            remoteViews.setViewVisibility(R.id.notificationWhiteBackground, 0);
        } else if (pg1.ATOM_EXT_black.equals(bgColor)) {
            remoteViews.setViewVisibility(R.id.notificationBlackBackground, 0);
        } else {
            remoteViews.setViewVisibility(R.id.notificationBlackBackground, 8);
            remoteViews.setViewVisibility(R.id.notificationWhiteBackground, 8);
        }
        int i = R.id.notificationTitle;
        remoteViews.setTextViewText(i, msgNotficationDTO.title);
        if (!TextUtils.isEmpty(BrandUtil.getInstance().getTitleColor())) {
            remoteViews.setTextColor(i, Color.parseColor(BrandUtil.getInstance().getTitleColor()));
        }
        int i2 = R.id.notificationText;
        remoteViews.setTextViewText(i2, msgNotficationDTO.text);
        if (!TextUtils.isEmpty(BrandUtil.getInstance().getContentColor())) {
            remoteViews.setTextColor(i2, Color.parseColor(BrandUtil.getInstance().getContentColor()));
        }
        String b2 = y22.b();
        if (!TextUtils.isEmpty(b2)) {
            int i3 = R.id.custom_time;
            remoteViews.setTextViewText(i3, b2.split("-")[3]);
            if (!TextUtils.isEmpty(BrandUtil.getInstance().getTitleColor())) {
                remoteViews.setTextColor(i3, Color.parseColor(BrandUtil.getInstance().getTitleColor()));
            }
        }
        return remoteViews;
    }
}
