package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.message.notification.system.base.BasicLocalPush;
import com.taobao.message.notification.system.base.ILocalPush;
import com.taobao.message.notification.util.ChannelUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mi0 extends ei0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static PowerManager.WakeLock e = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                mi0.l(mi0.this);
            }
        }
    }

    static {
        t2o.a(588251163);
    }

    public mi0(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
    }

    public static /* synthetic */ Object ipc$super(mi0 mi0Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1865040893:
                super.onShow();
                return null;
            case -1432119014:
                return new Integer(mi0Var.genPushRequestId());
            case -1304581520:
                return mi0Var.getNotificationChannel();
            case -893005340:
                return new Integer(mi0Var.getImportance());
            case -423164667:
                return mi0Var.getCategory();
            case -269488515:
                return super.getPushContent();
            case -14167635:
                return mi0Var.getMessageId();
            case 1161759794:
                return new Boolean(super.onBeforeNotify());
            case 1176236886:
                return new Integer(mi0Var.getMergeType());
            case 1204303463:
                return new Boolean(mi0Var.i());
            case 1800760461:
                return new Boolean(super.isForegroundSupport());
            case 2030845250:
                return mi0Var.getLargeIconURL();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/local/push/AgooSystemNotification");
        }
    }

    public static /* synthetic */ void l(mi0 mi0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d466ce0b", new Object[]{mi0Var});
        } else {
            mi0Var.k();
        }
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public ILocalPush.Content getPushContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILocalPush.Content) ipChange.ipc$dispatch("efefee7d", new Object[]{this});
        }
        if (this.b == null) {
            return super.getPushContent();
        }
        MsgNotficationDTO msgNotficationDTO = this.b;
        return new ILocalPush.Content(msgNotficationDTO.title, msgNotficationDTO.text, msgNotficationDTO.ticker);
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public boolean isForegroundSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b556c8d", new Object[]{this})).booleanValue();
        }
        if (isCloseLocalPush() && i()) {
            return false;
        }
        MsgNotficationDTO msgNotficationDTO = this.b;
        if (msgNotficationDTO == null) {
            return super.isForegroundSupport();
        }
        return !"imba".equals(ChannelUtil.convertChannelType(msgNotficationDTO.bizType));
    }

    public final void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a1f678", new Object[]{this, new Long(j)});
        } else if (e == null) {
            PowerManager.WakeLock newWakeLock = ii0.g().f().newWakeLock(805306394, BasicLocalPush.TAG);
            e = newWakeLock;
            newWakeLock.acquire(j);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281d3f7d", new Object[]{this});
            return;
        }
        PowerManager.WakeLock wakeLock = e;
        if (wakeLock != null && wakeLock.isHeld()) {
            e.release();
            e = null;
        }
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public boolean onBeforeNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("453f0c32", new Object[]{this})).booleanValue();
        }
        return super.onBeforeNotify();
    }

    @Override // tb.ei0, com.taobao.message.notification.system.base.BasicLocalPush
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.onShow();
        if (this.b.popup == 1) {
            j(5000L);
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 10000L);
        }
    }

    @Override // tb.ei0, com.taobao.message.notification.system.base.IOldAgooNotification
    public void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
            return;
        }
        MsgNotficationDTO msgNotficationDTO = this.b;
        if (msgNotficationDTO != null) {
            msgNotficationDTO.text = str;
        }
    }

    @Override // tb.ei0, com.taobao.message.notification.system.base.IOldAgooNotification
    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        MsgNotficationDTO msgNotficationDTO = this.b;
        if (msgNotficationDTO != null) {
            msgNotficationDTO.title = str;
        }
    }

    @Override // tb.ei0, com.taobao.message.notification.system.base.IOldAgooNotification
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.c.putString(TaobaoConstants.MESSAGE_URL, str);
        }
    }
}
