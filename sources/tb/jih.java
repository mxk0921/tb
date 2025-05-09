package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jih {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, b> f22007a = new HashMap();
    public final Map<String, WeakReference<DinamicXEngine>> b = new HashMap();
    public final Set<String> c = new CopyOnWriteArraySet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final jih f22008a = new jih();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends LruCache<Integer, MUSDKInstance> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -877389389) {
                super.entryRemoved(((Boolean) objArr[0]).booleanValue(), objArr[1], objArr[2], objArr[3]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/logic/LogicCacheInstanceManager$MUSInstanceLRUCache");
        }

        /* renamed from: a */
        public void entryRemoved(boolean z, Integer num, MUSDKInstance mUSDKInstance, MUSDKInstance mUSDKInstance2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4e91878", new Object[]{this, new Boolean(z), num, mUSDKInstance, mUSDKInstance2});
                return;
            }
            super.entryRemoved(z, num, mUSDKInstance, mUSDKInstance2);
            if (!mUSDKInstance.isDestroyed()) {
                mUSDKInstance.destroy();
            }
        }
    }

    public static jih e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jih) ipChange.ipc$dispatch("c1855b13", new Object[0]);
        }
        return a.f22008a;
    }

    public void a(String str, String str2, DinamicXEngine dinamicXEngine) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cde33fc", new Object[]{this, str, str2, dinamicXEngine});
            return;
        }
        i();
        String str3 = str + ",," + str2;
        WeakReference weakReference = (WeakReference) ((HashMap) this.b).get(str3);
        if (!(weakReference == null || weakReference.get() == null)) {
            c(str, str2);
        }
        if (DinamicXEngine.j0()) {
            StringBuilder sb = new StringBuilder("bizType:");
            sb.append(str);
            sb.append(" engineId:");
            sb.append(str2);
            sb.append(" engine == null:");
            if (dinamicXEngine != null) {
                z = false;
            }
            sb.append(z);
            la6.d(h36.TAG, "LogicCacheInstanceManager", sb.toString());
        }
        ((HashMap) this.b).put(str3, new WeakReference(dinamicXEngine));
        ((CopyOnWriteArraySet) this.c).add(str2);
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d79e015", new Object[]{this, str, str2});
            return;
        }
        h(str + ",," + str2);
        g(str2);
        c(str, str2);
    }

    public final void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8e8ff2", new Object[]{this, str, str2});
            return;
        }
        if (DinamicXEngine.j0()) {
            la6.d(h36.TAG, "LogicCacheInstanceManager", "destroyInternal bizType:" + str + " engineId:" + str2);
        }
        b bVar = (b) ((HashMap) this.f22007a).get(str);
        if (bVar != null) {
            ArrayList arrayList = new ArrayList();
            for (MUSDKInstance mUSDKInstance : bVar.snapshot().values()) {
                if (mUSDKInstance.getInstanceEnv("engineId").equals(str2)) {
                    mUSDKInstance.destroy();
                    arrayList.add(Integer.valueOf(mUSDKInstance.getInstanceId()));
                } else if (!((CopyOnWriteArraySet) this.c).contains(str2)) {
                    mUSDKInstance.destroy();
                    arrayList.add(Integer.valueOf(mUSDKInstance.getInstanceId()));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                num.intValue();
                bVar.remove(num);
            }
        }
    }

    public MUSDKInstance d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("73546022", new Object[]{this, str, new Integer(i)});
        }
        b bVar = (b) ((HashMap) this.f22007a).get(str);
        if (bVar != null) {
            return bVar.get(Integer.valueOf(i));
        }
        return null;
    }

    public void f(String str, int i, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b85fdb3", new Object[]{this, str, new Integer(i), mUSDKInstance});
            return;
        }
        b bVar = (b) ((HashMap) this.f22007a).get(str);
        if (bVar == null) {
            bVar = new b(15);
            ((HashMap) this.f22007a).put(str, bVar);
        }
        bVar.put(Integer.valueOf(i), mUSDKInstance);
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e51a94d2", new Object[]{this, str});
        } else {
            ((CopyOnWriteArraySet) this.c).remove(str);
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4735a7", new Object[]{this, str});
        } else {
            ((HashMap) this.b).remove(str);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("516a7b1c", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
            if (entry.getValue() == null || ((WeakReference) entry.getValue()).get() == null) {
                String[] split = ((String) entry.getKey()).split(",,");
                if (split.length == 2) {
                    c(split[0], split[1]);
                    g(split[1]);
                }
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h((String) it.next());
        }
    }
}
