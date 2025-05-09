package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.model.MessageData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w8k extends tmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final w8k f30514a = new w8k();

        static {
            t2o.a(1030750299);
        }

        public static /* synthetic */ w8k a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w8k) ipChange.ipc$dispatch("f5f54f0b", new Object[0]);
            }
            return f30514a;
        }
    }

    static {
        t2o.a(1030750297);
    }

    public static w8k c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w8k) ipChange.ipc$dispatch("ce3ac786", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(w8k w8kVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/notification/NotificationClient");
    }

    public w8k() {
    }

    @Override // tb.tmi
    public void b(Context context, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d563cb07", new Object[]{this, context, messageData});
        } else if (!q9k.g(context)) {
            irg.a("link_tag", "NotificationClient === execute == 机型和系统版本，不支持通知栏");
            esg.b(esg.ARG1_NOTIFICATION_NOT_IN_WHITELIST, "", "", null);
        } else {
            cno b2 = cno.b(context);
            if (TextUtils.equals(mr4.b().f24246a.noti_type, "other")) {
                mr4.b().j = (String) b2.a("isShowNotifi", "false");
                mr4.b().k = (String) b2.a("isShowNotifiSwitch", "false");
            } else {
                mr4.b().j = mr4.b().f24246a.noti_type;
                mr4.b().k = mr4.b().f24246a.noti_type;
                b2.d("isShowNotifi", mr4.b().j);
                b2.d("isShowNotifiSwitch", mr4.b().k);
            }
            if (!q9k.f(0)) {
                irg.a("link_tag", "MessageServiceReceiver === handleMessage == 通知开关关闭，绘制通知");
                q9k.b(context);
            } else if (q9k.f26596a != null) {
                q9k.j(context);
                q9k.l(context);
            } else {
                irg.a("link_tag", "MessageServiceReceiver === handleMessage == 通知开关打开，绘制通知");
                q9k.k(context);
            }
        }
    }
}
