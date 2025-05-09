package tb;

import com.alibaba.android.aura.nodemodel.subscriberelation.AURASubscribeRelationModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mvq implements w4u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE_FORWARD = "forward2Service";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, AURASubscribeRelationModel> f24340a;
    public final Map<String, a> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(79691826);
        t2o.a(79691828);
    }

    public mvq(Map<String, AURASubscribeRelationModel> map) {
        if (map == null) {
            this.f24340a = new HashMap();
        } else {
            this.f24340a = map;
        }
        this.b = new ConcurrentHashMap();
        a(ACTION_TYPE_FORWARD);
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd78e51", new Object[]{this, str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AURASubscribeRelationModel aURASubscribeRelationModel : this.f24340a.values()) {
            if (str.equals(aURASubscribeRelationModel.actionType)) {
                arrayList.add(aURASubscribeRelationModel.dest);
            }
        }
    }

    public void b(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad26531", new Object[]{this, str, str2, aVar});
            return;
        }
        synchronized (this) {
            ((ConcurrentHashMap) this.b).put(str + "#" + str2, aVar);
        }
    }

    public void c(a aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c65833e", new Object[]{this, aVar});
            return;
        }
        synchronized (this) {
            try {
                Iterator it = ((ConcurrentHashMap) this.b).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (entry.getValue() == aVar) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                if (str != null) {
                    ((ConcurrentHashMap) this.b).remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
