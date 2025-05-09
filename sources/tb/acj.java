package tb;

import com.alibaba.ability.MegaUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class acj {

    /* renamed from: a  reason: collision with root package name */
    public final String f15659a;
    public final String b;
    public final String c;
    public final Map<String, ? extends Object> d;

    static {
        t2o.a(525337283);
    }

    public acj() {
        this.f15659a = "";
        this.b = "";
    }

    public acj(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "ifs", null);
        if (x != null) {
            this.f15659a = x;
            String x2 = MegaUtils.x(map, "munionNamespace", null);
            if (x2 != null) {
                this.b = x2;
                this.c = MegaUtils.x(map, MspDBHelper.BizEntry.COLUMN_NAME_PID, null);
                this.d = MegaUtils.s(map, "extInfo");
                return;
            }
            throw new RuntimeException("munionNamespace 参数必传！");
        }
        throw new RuntimeException("ifs 参数必传！");
    }
}
