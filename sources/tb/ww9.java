package tb;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentLifecycleCallbacksDispatcher;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ww9 implements uw9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Field f30964a;
    public final Field b;
    public final Field c;

    static {
        new AtomicBoolean(false);
    }

    public ww9() {
        try {
            Field declaredField = FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.class.getDeclaredField("callback");
            declaredField.setAccessible(true);
            this.f30964a = declaredField;
            Field declaredField2 = FragmentManager.class.getDeclaredField("mLifecycleCallbacksDispatcher");
            declaredField2.setAccessible(true);
            this.b = declaredField2;
            Field declaredField3 = FragmentLifecycleCallbacksDispatcher.class.getDeclaredField("lifecycleCallbacks");
            declaredField3.setAccessible(true);
            this.c = declaredField3;
        } catch (ClassNotFoundException | NoSuchFieldException e) {
            whh.b("ActivityLifeCycleCallbacksX", "activity lifecycle callbacks prepare failed:", e);
        }
    }

    @Override // tb.uw9
    public List<FragmentManager.FragmentLifecycleCallbacks> a(FragmentManager fragmentManager) {
        try {
            List<Object> list = (List) this.c.get(this.b.get(fragmentManager));
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                arrayList.add((FragmentManager.FragmentLifecycleCallbacks) this.f30964a.get(obj));
            }
            for (Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.isAdded()) {
                    arrayList.addAll(a(fragment.getChildFragmentManager()));
                }
            }
            return arrayList;
        } catch (IllegalAccessException e) {
            whh.b("ActivityLifeCycleCallbacksX", "obtainFragmentLifecycleCallbacks error occurred:", e);
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
            for (Object obj : (List) this.c.get(this.b.get(fragmentManager))) {
                FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks = (FragmentManager.FragmentLifecycleCallbacks) this.f30964a.get(obj);
                if (fragmentLifecycleCallbacks != null && !list.contains(fragmentLifecycleCallbacks) && "onFragmentResumed".equals(str)) {
                    fragmentLifecycleCallbacks.onFragmentResumed(fragmentManager, fragment);
                }
            }
        } catch (IllegalAccessException e) {
            whh.b("ActivityLifeCycleCallbacksX", "invokeFragmentLifeCyclesInternal error occurred:", e);
        }
    }
}
