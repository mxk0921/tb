package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class viq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f30036a;
    public final ReentrantLock b = new ReentrantLock();
    public final Map<String, Object> c = new HashMap(2);
    public final Map<String, List<bvk>> d = new ConcurrentHashMap();

    static {
        t2o.a(912262654);
    }

    public viq(Context context, ze7 ze7Var, String... strArr) {
        if (strArr == null || strArr.length < 1 || TextUtils.isEmpty(strArr[0])) {
            this.f30036a = "containerToken" + UUID.randomUUID().hashCode();
            return;
        }
        this.f30036a = strArr[0];
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("514efccb", new Object[]{this});
        }
        return this.f30036a;
    }

    public <T> T c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8f099586", new Object[]{this, str});
        }
        tgh.b("StateCenter", "getState: key is " + str);
        if (str == null) {
            return null;
        }
        this.b.lock();
        try {
            return (T) ((HashMap) this.c).get(str);
        } finally {
            this.b.unlock();
        }
    }

    public final void d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebaeb2f9", new Object[]{this, str, obj});
            return;
        }
        List<bvk> list = (List) ((ConcurrentHashMap) this.d).get(str);
        if (list != null) {
            tgh.b("StateCenter", "notifyStateChanged: listeners size: " + list.size());
            for (bvk bvkVar : list) {
                Object c = c(str);
                if (Objects.equals(obj, c)) {
                    tgh.b("StateCenter", "notifyStateChanged: has set same value internal");
                } else {
                    bvkVar.a(obj, c);
                    tgh.b("StateCenter", "notifyStateChanged: listener id: " + bvkVar);
                }
            }
        }
    }

    public void e(String str, bvk bvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("353e7a8f", new Object[]{this, str, bvkVar});
            return;
        }
        tgh.b("StateCenter", "registerStateChangedListener: key is " + str + ", listener is " + bvkVar);
        if (bvkVar != null) {
            List list = (List) ((ConcurrentHashMap) this.d).get(str);
            if (list == null) {
                list = new ArrayList();
                ((ConcurrentHashMap) this.d).put(str, list);
            }
            if (!list.contains(bvkVar)) {
                list.add(bvkVar);
                tgh.b("StateCenter", "registerStateChangedListener: new listener " + bvkVar);
                return;
            }
            tgh.b("StateCenter", "registerStateChangedListener: found same listener, id is " + bvkVar);
        }
    }

    /* JADX WARN: Finally extract failed */
    public void f(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c480d27c", new Object[]{this, str, obj});
            return;
        }
        tgh.b("StateCenter", "setState: key is " + str + ", value is " + obj);
        if (str != null) {
            this.b.lock();
            try {
                Object obj2 = ((HashMap) this.c).get(str);
                ((HashMap) this.c).put(str, obj);
                this.b.unlock();
                if (!Objects.equals(obj2, obj)) {
                    d(str, obj2);
                } else {
                    tgh.b("StateCenter", "setState: oldValue and newValue is same");
                }
            } catch (Throwable th) {
                this.b.unlock();
                throw th;
            }
        } else {
            tgh.b("StateCenter", "setState: key is null");
        }
    }

    public void g(String str, bvk bvkVar) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5a3756", new Object[]{this, str, bvkVar});
            return;
        }
        tgh.b("StateCenter", "unregisterStateChangedListener: key is " + str + " listener is " + bvkVar);
        if (bvkVar != null && str != null && (list = (List) ((ConcurrentHashMap) this.d).get(str)) != null && list.remove(bvkVar)) {
            tgh.b("StateCenter", "unregisterStateChangedListener: found listener " + bvkVar);
        }
    }
}
