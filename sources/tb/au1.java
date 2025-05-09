package tb;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.ClickArea;
import com.taobao.desktop.widget.monitor.MonitorType;
import java.util.ArrayList;
import java.util.List;
import tb.bcx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class au1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16006a = getClass().getName();
    public final Context b;

    static {
        t2o.a(437256246);
    }

    public au1(Context context) {
        this.b = context;
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c2beac2", new Object[]{this, str})).intValue();
        }
        return this.b.getResources().getIdentifier(str, "layout", this.b.getPackageName());
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88715b7d", new Object[]{this, str})).intValue();
        }
        return this.b.getResources().getIdentifier(str, "id", this.b.getPackageName());
    }

    public final void c(RemoteViews remoteViews, int i, List<Integer> list, String str) {
        PendingIntent pendingIntent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf33f69", new Object[]{this, remoteViews, new Integer(i), list, str});
            return;
        }
        try {
            for (Integer num : list) {
                AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(this.b).getAppWidgetInfo(num.intValue());
                if (appWidgetInfo != null) {
                    Intent intent = new Intent();
                    intent.setAction("com.taobao.widget_action_click");
                    intent.setComponent(appWidgetInfo.provider);
                    intent.putIntegerArrayListExtra("appWidgetIds", (ArrayList) list);
                    intent.putExtra("widgetId", num);
                    intent.putExtra("action", str);
                    if (Build.VERSION.SDK_INT >= 31) {
                        pendingIntent = ya.e(this.b, i, intent, 167772160);
                    } else {
                        pendingIntent = ya.e(this.b, i, intent, 134217728);
                    }
                    remoteViews.setOnClickPendingIntent(i, pendingIntent);
                } else {
                    return;
                }
            }
        } catch (Throwable th) {
            ggh.d("setClickAction error = " + th.getMessage());
        }
    }

    public void f(RemoteViews remoteViews, int i, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73691a", new Object[]{this, remoteViews, new Integer(i), bitmap});
        } else if (bitmap != null) {
            remoteViews.setImageViewBitmap(i, bitmap);
            l(remoteViews, i);
        } else {
            h(remoteViews, i);
        }
    }

    public void g(RemoteViews remoteViews, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe7e064", new Object[]{this, remoteViews, new Integer(i)});
        } else {
            remoteViews.setViewVisibility(i, 8);
        }
    }

    public void h(RemoteViews remoteViews, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66e1e84", new Object[]{this, remoteViews, new Integer(i)});
        } else {
            remoteViews.setViewVisibility(i, 4);
        }
    }

    public void i(RemoteViews remoteViews, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3495e0", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (!TextUtils.isEmpty(str)) {
            l(remoteViews, i);
            remoteViews.setTextViewText(i, str);
        } else {
            g(remoteViews, i);
        }
    }

    public void j(RemoteViews remoteViews, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b9e25", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                remoteViews.setTextColor(i, Color.parseColor(str));
            } catch (Exception e) {
                ggh.d("setViewTextColor parseColor error: " + e);
            }
        }
    }

    public void k(RemoteViews remoteViews, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f8021f", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (!TextUtils.isEmpty(str)) {
            remoteViews.setTextViewTextSize(i, 1, Float.parseFloat(str));
        }
    }

    public void l(RemoteViews remoteViews, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a2901f", new Object[]{this, remoteViews, new Integer(i)});
        } else {
            remoteViews.setViewVisibility(i, 0);
        }
    }

    public void d(RemoteViews remoteViews, List<ClickArea> list, List<Integer> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2efb9aee", new Object[]{this, remoteViews, list, list2});
            return;
        }
        try {
            for (ClickArea clickArea : list) {
                int positionStartY = clickArea.getPositionStartY();
                int positionEndX = clickArea.getPositionEndX();
                int positionEndY = clickArea.getPositionEndY();
                for (int positionStartX = clickArea.getPositionStartX(); positionStartX < positionEndX; positionStartX++) {
                    for (int i = positionStartY; i < positionEndY; i++) {
                        int b = b("click_area_" + positionStartX + "_" + i);
                        if (!TextUtils.isEmpty(clickArea.getAction())) {
                            c(remoteViews, b, list2, clickArea.getAction());
                        } else {
                            e(remoteViews, b, m(clickArea.getDeepUrl(), list2), clickArea.getAreaId());
                        }
                    }
                }
            }
        } catch (Throwable th) {
            ggh.d("setClickArea error = " + th);
            bcx e = bcx.e();
            bcx.a aVar = new bcx.a();
            e.a(MonitorType.WIDGET_RENDER_STATE, aVar.s("setClickArea" + th.getMessage()));
        }
    }

    public void e(RemoteViews remoteViews, int i, String str, String str2) {
        PendingIntent pendingIntent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ce4766", new Object[]{this, remoteViews, new Integer(i), str, str2});
        } else if (TextUtils.isEmpty(str)) {
            String str3 = this.f16006a;
            Log.e(str3, "url is null in " + str2);
        } else {
            Intent intent = new Intent();
            intent.setData(Uri.parse(str));
            intent.setFlags(805339136);
            if (Build.VERSION.SDK_INT >= 31) {
                pendingIntent = ya.c(this.b, 0, intent, 201326592);
            } else {
                pendingIntent = ya.c(this.b, 0, intent, 134217728);
            }
            remoteViews.setOnClickPendingIntent(i, pendingIntent);
        }
    }

    public String m(String str, List<Integer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdfd6a3f", new Object[]{this, str, list});
        }
        return "https".equals(Uri.parse(str).getScheme()) ? edx.a("tbopen://m.taobao.com/tbopen/index.html?action=ali.open.nav&module=h5&bootImage=0&bc_fl_src=growth_dhh_2200803434487_android-widget-1069565676-editableWidget-biz_null-mfP_0_null_widgetCenter_null", "h5Url", edx.a(str, "widgetId", String.valueOf(list.get(0)))) : str;
    }
}
