package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.banner.InnerNotificationAdapter;
import com.taobao.message.notification.banner.InnerPushNotification;
import com.taobao.message.notification.banner.InnerPushVO;
import com.taobao.message.notification.banner.support.ChatInnerNotificationAdapter;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zh0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(588251139);
    }

    public static InnerPushNotification a(Intent intent, Context context) {
        InnerNotificationAdapter innerNotificationAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InnerPushNotification) ipChange.ipc$dispatch("c456606d", new Object[]{intent, context});
        }
        if (intent == null) {
            TLog.logi("AgooInnerNotificationFactory", "showPersonalMsg intent==null");
            return null;
        }
        MsgNotficationDTO a2 = bt4.a(intent);
        Bundle d = bt4.d(intent);
        InnerPushVO innerPushVO = new InnerPushVO();
        innerPushVO.mParam = d;
        innerPushVO.iconUrl = a2.personalImgUrl;
        innerPushVO.title = a2.title;
        innerPushVO.content = a2.text;
        innerPushVO.img = a2.extraImgUrl;
        innerPushVO.time = System.currentTimeMillis();
        int i = a2.bizType;
        if (i > -1) {
            innerNotificationAdapter = (i <= 10000 || i >= 20000) ? null : new ChatInnerNotificationAdapter(context, innerPushVO);
        } else {
            innerNotificationAdapter = new MarketingInnerNotificationAdapter(context, innerPushVO);
        }
        if (innerNotificationAdapter == null) {
            return null;
        }
        return InnerPushNotification.obtain(innerNotificationAdapter);
    }
}
