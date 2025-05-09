package com.taobao.wireless.link.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.ActivityJumpUtil;
import com.taobao.wireless.link.model.MessageData;
import tb.esg;
import tb.irg;
import tb.jsg;
import tb.q9k;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NotificationBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1030750296);
    }

    public static /* synthetic */ Object ipc$super(NotificationBroadcastReceiver notificationBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/notification/NotificationBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        irg.a("link_tag", "NotificationBroadcastReceiver === onReceive " + intent);
        if (jsg.n(3000L)) {
            irg.a("link_tag", "NotificationBroadcastReceiver === onReceive 时间间隔小于3s，不处理");
        } else if (intent != null) {
            jsg.b(context);
            try {
                String action = intent.getAction();
                String stringExtra = intent.getStringExtra(ActivityJumpUtil.LANDING_URL);
                MessageData e = q9k.e(context);
                if (TextUtils.equals(action, "com.taobao.taobao.notification_left")) {
                    q9k.i(context, stringExtra, esg.ARG1_NOTIFICATION_A_CLICK, "tbopen://m.taobao.com/tbopen/index.html?source=auto&action=ali.open.nav&module=h5&bc_fl_src=noti_hc&h5Url=" + stringExtra, "noti_hc", e.message_id);
                } else if (TextUtils.equals(action, "com.taobao.taobao.notification_right")) {
                    q9k.i(context, stringExtra, esg.ARG1_NOTIFICATION_B_CLICK, "tbopen://m.taobao.com/tbopen/index.html?source=auto&action=ali.open.nav&module=h5&bc_fl_src=noti_hd&h5Url=" + stringExtra, "noti_hd", e.message_id);
                } else if (TextUtils.equals(action, "com.taobao.taobao.notification_set")) {
                    q9k.i(context, stringExtra, esg.ARG1_NOTIFICATION_DELETE_CLICK, "tbopen://m.taobao.com/tbopen/index.html?source=auto&action=ali.open.nav&module=h5&bc_fl_src=noti_set&h5Url=" + stringExtra, "noti_set", e.message_id);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
