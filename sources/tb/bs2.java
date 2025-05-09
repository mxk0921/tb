package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bs2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, JSONObject> f16594a;
    public Map<String, DMComponent> b;
    public List<o58> c;

    static {
        t2o.a(83886134);
    }

    public Map<String, DMComponent> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a18368d1", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, JSONObject> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da3a9f87", new Object[]{this});
        }
        return this.f16594a;
    }

    public List<o58> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aa890d72", new Object[]{this});
        }
        return this.c;
    }

    public void d(Map<String, DMComponent> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642889dd", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    public void e(Map<String, JSONObject> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a507e61", new Object[]{this, map});
        } else {
            this.f16594a = map;
        }
    }

    public void f(List<o58> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537bb432", new Object[]{this, list});
        } else {
            this.c = list;
        }
    }
}
