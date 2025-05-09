package com.taobao.calendar.sdk.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.Constants;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class NotificationLogSupport extends BroadcastReceiver {
    public static String INTENT_NOTIFY = "com.taobao.calendar.sdk.alarm.headline.NOTIFY";

    static {
        t2o.a(414187544);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Parcelable parcelableExtra;
        if (!(context == null || intent == null)) {
            try {
                String action = intent.getAction();
                if (action != null && INTENT_NOTIFY.equals(action) && (parcelableExtra = intent.getParcelableExtra("tao_calendar_realIntent")) != null && (parcelableExtra instanceof Intent)) {
                    Intent intent2 = (Intent) parcelableExtra;
                    intent2.setAction("com.taobao.headline.calendar.NOTIFY");
                    String stringExtra = intent2.getStringExtra(BaseOuterComponent.b.SOURCE_COMPONENT_ID);
                    String stringExtra2 = intent2.getStringExtra(Constants.MYBROWSERURL);
                    String stringExtra3 = intent2.getStringExtra("eventId");
                    TBS.Adv.ctrlClicked("Page_Calendar", CT.Button, "click_notify", "sourceId=" + stringExtra, "eventId=" + stringExtra3, "url=" + stringExtra2);
                    context.startActivity(intent2);
                }
            } catch (Exception unused) {
            }
        }
    }
}
