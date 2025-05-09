package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.module.StorageModule;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ggs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VERSION = "1.0";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Object> f19977a = new HashMap();
    public static final LruCache<String, Object> b = new LruCache<>(5);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends AsyncTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19978a;
        public final /* synthetic */ IStorage.a b;

        public a(String str, IStorage.a aVar) {
            this.f19978a = str;
            this.b = aVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/util/TNodeStorage$1");
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr});
            }
            return ggs.a(this.f19978a);
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, obj});
                return;
            }
            IStorage.a aVar = this.b;
            if (aVar != null) {
                ((StorageModule.a) aVar).a(obj);
            }
        }
    }

    static {
        t2o.a(503317435);
    }

    public static Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d3b02d75", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj = ((HashMap) f19977a).get(str);
        if (obj != null) {
            return obj;
        }
        LruCache<String, Object> lruCache = b;
        Object obj2 = lruCache.get(str);
        if (obj2 != null) {
            return obj2;
        }
        Object a2 = od0.D().z().a(str);
        if (a2 != null) {
            lruCache.put(str, a2);
        }
        return a2;
    }

    public static void b(String str, IStorage.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5ef707", new Object[]{str, aVar});
        } else {
            new a(str, aVar).execute(null);
        }
    }

    public static Object c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("be928d6f", new Object[]{str});
        }
        igs.a("getInitDataCache");
        long currentTimeMillis = System.currentTimeMillis();
        b.remove(str);
        Object a2 = od0.D().z().a(str);
        tfs.e("cacheABTest", "cache data key " + str + " cost time " + (System.currentTimeMillis() - currentTimeMillis));
        igs.c();
        return a2;
    }

    public static Object d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e73feb3e", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ((HashMap) f19977a).get(str);
    }

    public static boolean e(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beefb6e4", new Object[]{str, obj})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (obj != null) {
            b.put(str, obj);
        } else {
            b.remove(str);
        }
        od0.D().z().b(str, obj);
        return true;
    }

    public static void f(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38140b09", new Object[]{str, obj});
        } else if (!TextUtils.isEmpty(str)) {
            ((HashMap) f19977a).put(str, obj);
        }
    }

    public static boolean g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a397857d", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        b.remove(str2);
        return od0.D().z().h(str, str2);
    }
}
