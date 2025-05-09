package tb;

import android.app.NotificationChannel;
import android.graphics.Bitmap;
import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.system.base.BasicLocalPush;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class dw extends BasicLocalPush {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFICATION_CHANNEL_OTHER_ID = "taobao_agoo_channel_other_id";

    static {
        t2o.a(588251156);
    }

    public static /* synthetic */ Object ipc$super(dw dwVar, String str, Object... objArr) {
        if (str.hashCode() == -1304581520) {
            return super.getNotificationChannel();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/local/push/AbsMsgNotification");
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public Bitmap getLargeIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6c36bd03", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public NotificationChannel getNotificationChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return u8k.a(ipChange.ipc$dispatch("b23daa70", new Object[]{this}));
        }
        NotificationChannel notificationChannel = EnvUtil.isAppBackGround(BasicLocalPush.TAG) ? ii0.g().e().getNotificationChannel("taobao_agoo_channel_id") : ii0.g().e().getNotificationChannel("taobao_agoo_channel_other_id");
        return notificationChannel == null ? super.getNotificationChannel() : notificationChannel;
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public Uri getNotificationSound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("cdea2eec", new Object[]{this});
        }
        return Uri.parse("android.resource://" + EnvUtil.getApplication().getPackageName() + "/" + R.raw.sound_push);
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public int getSmallIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72d9ae4", new Object[]{this})).intValue();
        }
        return R.drawable.tao_mag_icon_white;
    }
}
