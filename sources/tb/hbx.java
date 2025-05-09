package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.template.combine.WidgetCombineData;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hbx extends o84 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(437256304);
    }

    public hbx(Context context) {
        this.f25208a = context;
    }

    public static /* synthetic */ Object ipc$super(hbx hbxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/template/combine/WidgetCombineManager");
    }

    public void p(List<Integer> list, WidgetCombineData widgetCombineData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e03ffe", new Object[]{this, list, widgetCombineData});
        } else if (widgetCombineData != null) {
            try {
                q(widgetCombineData, list, widgetCombineData.getNextRefreshTime());
            } catch (Exception e) {
                Class<?> cls = getClass();
                hgh.c(cls, "notifyDataUpdate error" + e.getMessage());
                cdx.b("widget_catch_error", "WidgetCombineReceiver.notifyDataUpdate", e.getMessage(), null);
            }
        }
    }

    public final void q(WidgetCombineData widgetCombineData, List<Integer> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f292706", new Object[]{this, widgetCombineData, list, new Long(j)});
            return;
        }
        Class<?> cls = getClass();
        hgh.c(cls, "updateAppWidget：appWidgetId: " + list + ",data: " + widgetCombineData);
    }
}
