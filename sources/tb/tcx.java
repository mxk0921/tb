package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.template.dynamic.a;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tcx extends bu1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a d;

    static {
        t2o.a(437256314);
    }

    public tcx(Context context, String str) {
        super(context, str, 0);
    }

    public static /* synthetic */ Object ipc$super(tcx tcxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/template/dynamic/WidgetStandardMiniManager");
    }

    @Override // tb.bu1, tb.sde
    public void a(String str, List<Integer> list, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4bb0808", new Object[]{this, str, list, str2});
            return;
        }
        try {
            if (this.f16631a.equals(str)) {
                if (this.d == null) {
                    this.d = new a(this.c);
                }
                this.d.a(str, list, str2);
            }
        } catch (Exception e) {
            hgh.c(tcx.class, "WidgetStandardMiniManager notifyDataUpdate error" + e.getMessage());
            cdx.b("widget_catch_error", "WidgetStandardMiniManager.notifyDataUpdate", e.getMessage(), null);
        }
    }
}
