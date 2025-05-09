package tb;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vnp extends ia0 {
    static {
        t2o.a(815793318);
    }

    public vnp(String str, Map<String, String> map) {
        super("", "", str, "", "", map, null);
        b("area", "shop_query_rec_bts");
        b("rainbow", oen.j());
        if (l3p.INSTANCE.b()) {
            b("ovsFrom", "inshop");
            a("appId", "42735");
        } else {
            a("appId", "17943");
        }
        d("inshop-activate", 1);
    }
}
