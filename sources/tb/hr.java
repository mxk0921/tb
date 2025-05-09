package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACTION = "action";
    public static final String TAG_ON_RECEIVE = "onReceive";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, HashSet<a>> f20832a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final u8 f20833a;
        public final boolean b;

        static {
            t2o.a(336592949);
        }

        public a(u8 u8Var, k8 k8Var, boolean z) {
            this.f20833a = u8Var;
            this.b = z;
        }
    }

    static {
        t2o.a(336592948);
    }

    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3c29e5", new Object[]{this, str, aVar});
        } else if (str != null && aVar != null) {
            HashSet hashSet = (HashSet) ((HashMap) this.f20832a).get(str);
            if (hashSet == null) {
                hashSet = new HashSet();
                ((HashMap) this.f20832a).put(str, hashSet);
            }
            hashSet.add(aVar);
        }
    }

    public void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da77840", new Object[]{this, str, jSONObject});
        } else if (str != null && ((HashMap) this.f20832a).containsKey(str)) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = (HashSet) ((HashMap) this.f20832a).get(str);
            if (hashSet != null && !hashSet.isEmpty()) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar.b) {
                        arrayList.add(aVar);
                    }
                    aVar.f20833a.callback("onReceive", new f8(jSONObject));
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashSet.remove((a) it2.next());
            }
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3869c", new Object[]{this, str});
        } else if (str != null) {
            ((HashMap) this.f20832a).remove(str);
        }
    }
}
