package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.sku.utils.SkuLogUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v0r implements lfb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "switch_mark_type";

    static {
        t2o.a(442499148);
        t2o.a(442499194);
    }

    @Override // tb.lfb
    public void a(v2q v2qVar, pr0 pr0Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e5704a", new Object[]{this, v2qVar, pr0Var});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("SwitchMarkTypeHandler.handleEvent");
        }
        if (yv6.b(v2qVar.b())) {
            SharedPreferences.Editor edit = v2qVar.b().getApplicationContext().getSharedPreferences(AliXSkuCore.MARK_SHARED_PREFERENCES_NAME, 0).edit();
            int C = pr0Var.c().C();
            int i = 1002;
            if (C == 0) {
                str = "弹框";
            } else if (C != 1002) {
                str = "关闭";
                i = 0;
            } else {
                i = 1001;
                str = "水印";
            }
            edit.putInt("type", i);
            edit.apply();
            pr0Var.c().D0(i);
            m0u.b(v2qVar.b(), str, 0);
        }
    }
}
