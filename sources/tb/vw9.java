package tb;

import androidx.core.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManagerImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vw9 implements uw9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Field f30294a;

    public vw9() {
        try {
            Field declaredField = FragmentManagerImpl.class.getDeclaredField("mLifecycleCallbacks");
            declaredField.setAccessible(true);
            this.f30294a = declaredField;
        } catch (Throwable th) {
            whh.b("ActivityLifeCycleCallbacksSupport", "ActivityLifeCycleCallbacksSupport error occurred:", th);
        }
    }

    @Override // tb.uw9
    public List<FragmentManager.FragmentLifecycleCallbacks> a(FragmentManager fragmentManager) {
        try {
            List<Pair> list = (List) this.f30294a.get(fragmentManager);
            ArrayList arrayList = new ArrayList(list.size());
            for (Pair pair : list) {
                arrayList.add(pair.first);
            }
            for (Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.isAdded()) {
                    arrayList.addAll(a(fragment.getChildFragmentManager()));
                }
            }
            return arrayList;
        } catch (IllegalAccessException e) {
            whh.b("ActivityLifeCycleCallbacksSupport", "obtainFragmentLifecycleCallbacks error occurred:", e);
            return Collections.emptyList();
        }
    }

    @Override // tb.uw9
    public void b(FragmentManager fragmentManager, String str, List<FragmentManager.FragmentLifecycleCallbacks> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cdf6e", new Object[]{this, fragmentManager, str, list});
            return;
        }
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.isAdded()) {
                c(fragmentManager, str, fragment, list);
                b(fragment.getChildFragmentManager(), str, list);
            }
        }
    }

    public final void c(FragmentManager fragmentManager, String str, Fragment fragment, List<FragmentManager.FragmentLifecycleCallbacks> list) {
        try {
            for (Pair pair : (List) this.f30294a.get(fragmentManager)) {
                FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks = (FragmentManager.FragmentLifecycleCallbacks) pair.first;
                if (fragmentLifecycleCallbacks != null && !list.contains(fragmentLifecycleCallbacks) && "onFragmentResumed".equals(str)) {
                    fragmentLifecycleCallbacks.onFragmentResumed(fragmentManager, fragment);
                }
            }
        } catch (IllegalAccessException e) {
            whh.b("ActivityLifeCycleCallbacksSupport", "invokeFragmentLifeCyclesInternal error occurred:", e);
        }
    }
}
