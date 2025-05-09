package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class of7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE_NPS = "detailNps";
    public static final String CODE_TALK_GROUP = "detailTalkGroup";

    static {
        t2o.a(912262776);
    }

    public static Resource.c a(Resource.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resource.c) ipChange.ipc$dispatch("2a20d267", new Object[]{dVar});
        }
        if (dVar == null) {
            return null;
        }
        return dVar.b();
    }

    public static String b(Resource.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4663025c", new Object[]{dVar});
        }
        if (dVar == null) {
            return null;
        }
        return dVar.c();
    }

    public static Resource.d c(ze7 ze7Var, String str) {
        List<Resource.d> floatButtons;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resource.d) ipChange.ipc$dispatch("18dc6f82", new Object[]{ze7Var, str});
        }
        Resource resource = (Resource) ze7Var.e().f(Resource.class);
        if (!(resource == null || (floatButtons = resource.getFloatButtons()) == null || floatButtons.isEmpty())) {
            for (Resource.d dVar : floatButtons) {
                if (str.equals(dVar.d())) {
                    return dVar;
                }
            }
        }
        return null;
    }

    public static String d(Resource.d dVar) {
        Resource.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6fff000", new Object[]{dVar});
        }
        if (dVar == null || (a2 = a(dVar)) == null) {
            return null;
        }
        return a2.c();
    }

    public static String e(Resource.d dVar) {
        Resource.c a2;
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63996e1a", new Object[]{dVar});
        }
        if (dVar == null || (a2 = a(dVar)) == null || (b = a2.b()) == null) {
            return null;
        }
        return b.getString("url");
    }
}
