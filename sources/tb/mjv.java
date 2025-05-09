package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729808928);
    }

    public static boolean a(List<SectionModel> list, rjj rjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a2a4e4e", new Object[]{list, rjjVar})).booleanValue();
        }
        if (list == null || rjjVar == null) {
            return false;
        }
        int i = rjjVar.b;
        if ((i == -1 || i >= rjjVar.f27422a) && list.size() > rjjVar.f27422a) {
            return true;
        }
        return false;
    }
}
