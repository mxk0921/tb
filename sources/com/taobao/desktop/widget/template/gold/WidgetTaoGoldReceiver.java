package com.taobao.desktop.widget.template.gold;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cdx;
import tb.dcx;
import tb.hgh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WidgetTaoGoldReceiver extends AppWidgetProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(437256320);
    }

    public static /* synthetic */ Object ipc$super(WidgetTaoGoldReceiver widgetTaoGoldReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/template/gold/WidgetTaoGoldReceiver");
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            dcx.I(context).L(getClass().getName(), intent);
            cdx.b("widget_miui_gold_receiver", intent.getAction(), "", null);
        } catch (Throwable th) {
            hgh.d("WidgetTaoGoldReceiver.onReceive error: " + th.getMessage());
        }
    }
}
