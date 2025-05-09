package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.a;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322079);
    }

    public static int a(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc7bef11", new Object[]{cxjVar})).intValue();
        }
        return b(null, cxjVar);
    }

    public static int b(x3w x3wVar, cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("761e0322", new Object[]{x3wVar, cxjVar})).intValue();
        }
        AtmosParams o = cxjVar.j().o();
        if (o != null && o.showAtmos && !TextUtils.isEmpty(o.atmosColor)) {
            try {
                return Color.parseColor(o.atmosColor);
            } catch (Exception e) {
                e.printStackTrace();
                a j = cxjVar.j();
                q0j.p(q0j.SCENE_ENTRANCE_ATMOS, q0j.ERROR_CODE_ATMOS_COLOR_PARSE_ERROR, "atmoscolor解析错误，入口itemid：" + j.t() + ", 入口nid" + j.u() + ", colorStr: " + o.atmosColor, j.T());
            }
        }
        if (x3wVar != null && !TextUtils.isEmpty(x3wVar.Q)) {
            try {
                return Color.parseColor(x3wVar.Q);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return -16777216;
    }
}
