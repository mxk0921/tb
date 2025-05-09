package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f18925a;

    static {
        t2o.a(729810353);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c140e4a", new Object[0])).booleanValue();
        }
        if (f18925a == null) {
            f18925a = Boolean.valueOf(qy8.b.b("homepage_switch", "slimSection", false));
        }
        return f18925a.booleanValue();
    }

    public static void b(imn imnVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0a0a42", new Object[]{imnVar, str});
            return;
        }
        AwesomeGetContainerData u = imnVar.u(str);
        if (u == null) {
            bqa.d("SearchBarEnableUtil", "data == null");
        } else if (u.getBaseData() == null) {
            bqa.d("SearchBarEnableUtil", "sectionModelList == null");
        } else {
            JSONObject d = e0p.d();
            if (d == null) {
                bqa.d("SearchBarEnableUtil", "searchBarSection == null");
                return;
            }
            boolean booleanValue = d.getBooleanValue("slimSection");
            f18925a = Boolean.valueOf(booleanValue);
            qy8.b.g("homepage_switch", "slimSection", booleanValue);
        }
    }
}
