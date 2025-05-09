package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.data.WidgetContentData;
import com.taobao.desktop.widget.monitor.MonitorType;
import java.util.Arrays;
import java.util.List;
import tb.bcx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class bu1 implements sde {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16631a;
    public final int b;
    public final Context c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements zde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16632a;
        public final /* synthetic */ List b;

        public a(bu1 bu1Var, String str, List list) {
            this.f16632a = str;
            this.b = list;
        }

        @Override // tb.zde
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832df14", new Object[]{this});
                return;
            }
            hgh.d("[onRender] Start typeId: " + this.f16632a + " widgetIds: " + Arrays.toString(this.b.toArray()));
            bcx.e().a(MonitorType.WIDGET_RENDER_STATE, new bcx.a().x(this.f16632a).t("widget_render_start"));
        }

        @Override // tb.zde
        public void b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7443e42", new Object[]{this, new Long(j)});
                return;
            }
            hgh.d("[onRender] DslSucces typeId: " + this.f16632a + " widgetIds: " + Arrays.toString(this.b.toArray()) + " dslRenderTime: " + j);
            bcx.e().a(MonitorType.WIDGET_RENDER_STATE, new bcx.a().x(this.f16632a).t("widget_render_dsl_success").u(j));
        }

        @Override // tb.zde
        public void c(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("872852d5", new Object[]{this, new Long(j)});
                return;
            }
            hgh.d("[onRender] Finish typeId: " + this.f16632a + " widgetIds: " + Arrays.toString(this.b.toArray()) + " renderTime: " + j);
            bcx.e().a(MonitorType.WIDGET_RENDER_STATE, new bcx.a().x(this.f16632a).t("widget_render_finish").u(j));
        }

        @Override // tb.zde
        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("826e5e03", new Object[]{this, str});
                return;
            }
            hgh.d("[onRender] Failed typeId: " + this.f16632a + " widgetIds: " + Arrays.toString(this.b.toArray()) + " errorMsg: " + str);
            bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().x(this.f16632a).s(str).w("widget_render_error"));
        }
    }

    static {
        t2o.a(437256247);
        t2o.a(437256225);
    }

    public bu1(Context context, String str, int i) {
        this.c = context;
        this.f16631a = str;
        this.b = i;
    }

    @Override // tb.sde
    public void a(String str, List<Integer> list, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4bb0808", new Object[]{this, str, list, str2});
        }
    }

    @Override // tb.sde
    public void b(String str, List<Integer> list, WidgetContentData widgetContentData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0805fde", new Object[]{this, str, list, widgetContentData});
        } else if (widgetContentData == null) {
            hgh.d("[onRender] notifyDataUpdate data == null");
        } else {
            String id = widgetContentData.getId();
            try {
                if (this.f16631a.equals(str)) {
                    c(list, str, id, widgetContentData);
                }
            } catch (Exception e) {
                hgh.d("[onRender] notifyDataUpdate error " + e);
                bcx e2 = bcx.e();
                bcx.a x = new bcx.a().x(id);
                e2.a(MonitorType.WIDGET_RENDER_STATE, x.s("notifyDataUpdate_" + e.getMessage()));
            }
        }
    }

    public final void c(List<Integer> list, String str, String str2, WidgetContentData widgetContentData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78314f16", new Object[]{this, list, str, str2, widgetContentData});
        } else {
            new gcx(this.c, list, str, widgetContentData, this.b, new a(this, str2, list));
        }
    }
}
