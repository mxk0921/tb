package com.taobao.wireless.link.widget.live;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dcx;
import tb.hgh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WidgetLiveReceiver extends AppWidgetProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(437256370);
    }

    public static /* synthetic */ Object ipc$super(WidgetLiveReceiver widgetLiveReceiver, String str, Object... objArr) {
        if (str.hashCode() == 1006950490) {
            super.onReceive((Context) objArr[0], (Intent) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/widget/live/WidgetLiveReceiver");
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            super.onReceive(context, intent);
            dcx.I(context).L(getClass().getName(), intent);
        } catch (Throwable th) {
            Class<?> cls = getClass();
            hgh.c(cls, "onReceive error: " + th.getMessage());
        }
    }
}
