package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y9i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static y9i b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<WeakReference<Object>>> f31922a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final y9i f31923a = new y9i();

        static {
            t2o.a(782237939);
        }
    }

    static {
        t2o.a(782237938);
    }

    public static y9i b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y9i) ipChange.ipc$dispatch("5d85653a", new Object[0]);
        }
        if (b == null) {
            b = a.f31923a;
        }
        return b;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9433f3", new Object[]{this, str, obj});
        } else if (!((ConcurrentHashMap) this.f31922a).containsKey(str)) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (obj != null) {
                copyOnWriteArrayList.add(new WeakReference(obj));
            }
            ((ConcurrentHashMap) this.f31922a).put(str, copyOnWriteArrayList);
        } else if (obj != null) {
            for (WeakReference weakReference : (List) ((ConcurrentHashMap) this.f31922a).get(str)) {
                if (weakReference.get() == obj) {
                    return;
                }
            }
            ((List) ((ConcurrentHashMap) this.f31922a).get(str)).add(new WeakReference(obj));
        }
    }

    public List<WeakReference<Object>> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f25eb84a", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (List) ((ConcurrentHashMap) this.f31922a).get(str);
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57b96342", new Object[]{this, str})).booleanValue();
        }
        return ((ConcurrentHashMap) this.f31922a).containsKey(str);
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b785fa", new Object[]{this, str});
        } else {
            ((ConcurrentHashMap) this.f31922a).remove(str);
        }
    }
}
