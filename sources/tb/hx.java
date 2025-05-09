package tb;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.alibaba.android.split.core.internal.ApkLoader;
import com.alibaba.android.split.core.internal.ApkLoaderHolder;
import com.alibaba.android.split.core.internal.TBSplitCore;
import com.alibaba.android.split.manager.IPluginContext;
import com.alibaba.android.split.manager.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class hx<T extends IPluginContext> implements a<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, T> f20938a = new ConcurrentHashMap();
    public mkj b;
    public ClassLoader c;
    public jcq d;
    public ApkLoader e;

    static {
        t2o.a(677380187);
        t2o.a(676331638);
    }

    @Override // com.alibaba.android.split.manager.a
    public boolean a(ocq ocqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d5e8b72", new Object[]{this, ocqVar})).booleanValue();
        }
        return ((IPluginContext) ((ConcurrentHashMap) this.f20938a).get(ocqVar.b())).b();
    }

    @Override // com.alibaba.android.split.manager.a
    public boolean b(ocq ocqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7021d92", new Object[]{this, ocqVar})).booleanValue();
        }
        return ((ConcurrentHashMap) this.f20938a).containsKey(ocqVar.b());
    }

    @Override // com.alibaba.android.split.manager.a
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff176307", new Object[]{this, str});
        } else {
            ((ConcurrentHashMap) this.f20938a).remove(str);
        }
    }

    @Override // com.alibaba.android.split.manager.a
    public void d(jcq jcqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51caa557", new Object[]{this, jcqVar});
            return;
        }
        this.d = jcqVar;
        this.c = acq.p().o().getClassLoader();
        ApkLoader apkLoader = TBSplitCore.getApkLoader();
        this.e = apkLoader;
        ApkLoaderHolder.set(apkLoader);
    }

    @Override // com.alibaba.android.split.manager.a
    public void e(Context context, Collection<File> collection) throws Exception {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23a223e", new Object[]{this, context, collection});
        } else if (collection != null && collection.size() != 0) {
            if (Build.VERSION.SDK_INT > 23) {
                String[] strArr = new String[collection.size()];
                for (File file : collection) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        r8o.i().a(context.getAssets(), file.getAbsolutePath());
                    } else if (!r8o.i().g(context.getAssets(), file.getAbsolutePath())) {
                        r8o.i().a(context.getAssets(), file.getAbsolutePath());
                    }
                    strArr[i] = file.getAbsolutePath();
                    i++;
                }
                r8o.i().j(strArr);
                r8o.i().c(strArr, context);
            } else {
                for (File file2 : collection) {
                    r8o.i().d(context, file2.getAbsolutePath());
                }
            }
            q(collection);
        }
    }

    @Override // com.alibaba.android.split.manager.a
    public void f(String str, IPluginContext.Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b411d1", new Object[]{this, str, status});
        } else {
            ((IPluginContext) ((ConcurrentHashMap) this.f20938a).get(str)).a(status);
        }
    }

    @Override // com.alibaba.android.split.manager.a
    public T i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((IPluginContext) ipChange.ipc$dispatch("d371fd43", new Object[]{this, str}));
        }
        return (T) ((IPluginContext) ((ConcurrentHashMap) this.f20938a).get(str));
    }

    @Override // com.alibaba.android.split.manager.a
    public boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bb9fd70", new Object[]{this, str})).booleanValue();
        }
        if (((ConcurrentHashMap) this.f20938a).containsKey(str)) {
            return ((IPluginContext) ((ConcurrentHashMap) this.f20938a).get(str)).e();
        }
        return false;
    }

    public mkj p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkj) ipChange.ipc$dispatch("cb256cc1", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, Integer> q(Collection<File> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cee0eaab", new Object[]{this, collection});
        }
        HashMap hashMap = new HashMap();
        try {
            Iterator it = new ArrayList(acq.p().q()).iterator();
            while (it.hasNext()) {
                Resources resources = (Resources) ((WeakReference) it.next()).get();
                if (resources != null) {
                    for (File file : collection) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            hashMap.put(file.getAbsolutePath(), Integer.valueOf(r8o.i().a(resources.getAssets(), file.getAbsolutePath())));
                        } else if (!r8o.i().g(resources.getAssets(), file.getAbsolutePath())) {
                            hashMap.put(file.getAbsolutePath(), Integer.valueOf(r8o.i().a(resources.getAssets(), file.getAbsolutePath())));
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }
}
