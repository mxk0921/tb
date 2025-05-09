package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.messiah.model.TbHRLogModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wgt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<TbHRLogModel>> f30685a = new HashMap(32);
    public final Map<String, List<TbHRLogModel>> b = new HashMap(32);

    static {
        t2o.a(447741969);
    }

    public List<TbHRLogModel> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e84fb14a", new Object[]{this, str});
        }
        return (List) ((HashMap) this.f30685a).get(str);
    }

    public List<TbHRLogModel> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ebea3cf4", new Object[]{this, str});
        }
        return (List) ((HashMap) this.b).get(str);
    }

    public void c(e9u e9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407cecdf", new Object[]{this, e9uVar});
            return;
        }
        String b = e9uVar.b();
        String a2 = e9uVar.a();
        if ("log".equals(b)) {
            ((HashMap) this.f30685a).remove(a2);
        } else if ("monitor".equals(b)) {
            ((HashMap) this.b).remove(a2);
        } else if ("all".equals(b)) {
            ((HashMap) this.b).remove(a2);
            ((HashMap) this.f30685a).remove(a2);
        }
    }

    public void d(e9u e9uVar, List<TbHRLogModel> list, List<TbHRLogModel> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11d0f71", new Object[]{this, e9uVar, list, list2});
            return;
        }
        String b = e9uVar.b();
        String a2 = e9uVar.a();
        if ("log".equals(b)) {
            ((HashMap) this.f30685a).put(a2, list);
        } else if ("monitor".equals(b)) {
            ((HashMap) this.b).put(a2, list2);
        } else if ("all".equals(b)) {
            ((HashMap) this.f30685a).put(a2, list);
            ((HashMap) this.b).put(a2, list2);
        }
    }
}
