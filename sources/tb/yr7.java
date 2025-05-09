package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.template.standard.WidgetStandardData;
import com.taobao.desktop.widget.template.standard.a;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yr7 extends bu1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a d;

    static {
        t2o.a(437256326);
    }

    public yr7(Context context, String str) {
        super(context, str, 1);
    }

    public static /* synthetic */ Object ipc$super(yr7 yr7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/template/standard/DittoWidgetStandardManager");
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
                this.d.q(list, (WidgetStandardData) JSON.parseObject(String.valueOf(str2), WidgetStandardData.class));
            }
        } catch (Exception e) {
            hgh.c(yr7.class, "notifyDataUpdate error" + e.getMessage());
            cdx.b("widget_catch_error", "DittoWidgetStandardManager.notifyDataUpdate", e.getMessage(), null);
        }
    }
}
