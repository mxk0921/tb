package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.data.WidgetContentData;
import java.util.HashMap;
import java.util.List;
import tb.gcx;
import tb.gmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fcx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements gmj.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yde f19196a;

        public a(fcx fcxVar, yde ydeVar) {
            this.f19196a = ydeVar;
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            hgh.d("[renderDsl] onRenderFailed code:" + str + ",msg:" + str2);
            yde ydeVar = this.f19196a;
            if (ydeVar != null) {
                ((gcx.a) ydeVar).a(str, str2);
            }
        }

        public void b(String str, List<String> list, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48b76930", new Object[]{this, str, list, new Integer(i), new Long(j)});
            } else {
                hgh.d("[renderDsl] onRenderStart");
            }
        }

        public void c(View view, Bitmap bitmap, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d4ec11b", new Object[]{this, view, bitmap, str});
                return;
            }
            hgh.d("[renderDsl] onRenderSuccess");
            yde ydeVar = this.f19196a;
            if (ydeVar != null) {
                ((gcx.a) ydeVar).b(bitmap, str);
            }
        }
    }

    static {
        t2o.a(437256283);
    }

    public fcx(Context context, WidgetContentData widgetContentData, yde ydeVar) {
        a(context, widgetContentData, ydeVar);
    }

    public void a(Context context, WidgetContentData widgetContentData, yde ydeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c1a2e", new Object[]{this, context, widgetContentData, ydeVar});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put(me8.WIDGET_SWITCH_ENABLE_NEW_CORNER_RADIUS, String.valueOf(b9l.r(context)));
        hashMap.put(me8.WIDGET_SWITCH_ENABLE_CORNER_RADIUS, String.valueOf(b9l.s(context)));
        new gmj(context, widgetContentData.getDslContent(), widgetContentData.getDataContent(), hashMap, new a(this, ydeVar)).x();
    }
}
