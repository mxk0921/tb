package tb;

import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import com.taobao.homepage.pop.view.container.application.ApplicationHierarchyPopContainer;
import com.taobao.homepage.pop.view.container.main.MainHierarchyPopContainer;
import com.taobao.homepage.pop.view.container.sub.SubHierarchyPopContainer;
import com.taobao.homepage.pop.view.container.window.WindowHierarchyPopContainer;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ybm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pfw f31966a;
    public final Map<Integer, WeakReference<BasePopContainer>> b = new ConcurrentHashMap(4);

    public ybm(pfw pfwVar) {
        this.f31966a = pfwVar;
    }

    public final BasePopContainer a(int i, Context context, e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopContainer) ipChange.ipc$dispatch("139bdf0c", new Object[]{this, new Integer(i), context, e3bVar});
        }
        if (i == 0) {
            return new WindowHierarchyPopContainer(context, this.f31966a, i, e3bVar);
        }
        if (i == 1) {
            return new MainHierarchyPopContainer(context, this.f31966a, i, e3bVar);
        }
        if (i != 3) {
            return new SubHierarchyPopContainer(context, this.f31966a, i, e3bVar);
        }
        return new ApplicationHierarchyPopContainer(context, this.f31966a, i, e3bVar);
    }

    public BasePopContainer b(Context context, int i, e3b e3bVar) {
        BasePopContainer basePopContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopContainer) ipChange.ipc$dispatch("580e6622", new Object[]{this, context, new Integer(i), e3bVar});
        }
        WeakReference weakReference = (WeakReference) ((ConcurrentHashMap) this.b).remove(Integer.valueOf(i));
        if (weakReference == null) {
            basePopContainer = null;
        } else {
            basePopContainer = (BasePopContainer) weakReference.get();
        }
        if (basePopContainer != null) {
            basePopContainer.destroy();
            if (basePopContainer.getParent() instanceof ViewGroup) {
                ((ViewGroup) basePopContainer.getParent()).removeView(basePopContainer);
            }
        }
        BasePopContainer a2 = a(i, context, e3bVar);
        ((ConcurrentHashMap) this.b).put(Integer.valueOf(i), new WeakReference(a2));
        vfm.f("PopContainerFactory ", "create container success, hierarchy=" + i);
        return a2;
    }

    public BasePopContainer c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopContainer) ipChange.ipc$dispatch("59beb6ad", new Object[]{this, new Integer(i)});
        }
        WeakReference weakReference = (WeakReference) ((ConcurrentHashMap) this.b).get(Integer.valueOf(i));
        if (weakReference == null) {
            return null;
        }
        return (BasePopContainer) weakReference.get();
    }

    public Map<Integer, WeakReference<BasePopContainer>> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e4faa884", new Object[]{this});
        }
        return this.b;
    }
}
