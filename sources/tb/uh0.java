package tb;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uh0 extends wh0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(588251137);
    }

    public uh0(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
    }

    public static /* synthetic */ Object ipc$super(uh0 uh0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/AgBigPictureNotification");
    }

    @Override // tb.wh0
    public NotificationCompat.Builder c(MsgNotficationDTO msgNotficationDTO, NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationCompat.Builder) ipChange.ipc$dispatch("64ce97fd", new Object[]{this, msgNotficationDTO, builder});
        }
        if (builder != null) {
            builder.setContentTitle(msgNotficationDTO.title).setContentText(msgNotficationDTO.text).setTicker(msgNotficationDTO.ticker).setWhen(System.currentTimeMillis()).setDefaults(-1).setAutoCancel(true);
            builder.setSmallIcon(R.drawable.tao_mag_icon_white);
        }
        return builder;
    }

    @Override // tb.wh0
    public void d(NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b8a6bb", new Object[]{this, builder});
        } else {
            reportNotify();
        }
    }

    @Override // tb.wh0
    public void e(Bitmap bitmap, NotificationCompat.Builder builder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579ebd06", new Object[]{this, bitmap, builder, str});
            return;
        }
        builder.setLargeIcon(bitmap);
        Notification g = g(this.mMsgData, builder, bitmap);
        if (bitmap != null) {
            if (BrandUtil.getInstance().shouldNotify()) {
                m9k.a(vh0.TAG, "onGetImageSucceed");
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
        return 200;
    }

    public final Notification g(MsgNotficationDTO msgNotficationDTO, NotificationCompat.Builder builder, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification) ipChange.ipc$dispatch("3affafdf", new Object[]{this, msgNotficationDTO, builder, bitmap});
        }
        NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
        bigPictureStyle.bigLargeIcon(bitmap).bigPicture(bitmap).setBigContentTitle(msgNotficationDTO.title).setSummaryText(msgNotficationDTO.text);
        builder.setStyle(bigPictureStyle);
        return builder.build();
    }
}
