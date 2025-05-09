package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.manager.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vnn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Set<WeakReference<d>>> f30129a = new HashMap();

    static {
        t2o.a(729809935);
    }

    public static void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8c757", new Object[]{str, dVar});
            return;
        }
        Map<String, Set<WeakReference<d>>> map = f30129a;
        Set set = (Set) ((HashMap) map).get(str);
        if (set == null) {
            set = new CopyOnWriteArraySet();
            ((HashMap) map).put(str, set);
        }
        set.add(new WeakReference(dVar));
        bqa.d("RecommendInstanceRecorder", "购后新增实例 containerId : " + str + ", mRecommendManagerImpl : " + dVar + "， 当前实例个数：" + set.size());
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c287998", new Object[]{str})).booleanValue();
        }
        Set set = (Set) ((HashMap) f30129a).get(str);
        if (set == null || set.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void c(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b0a5fa", new Object[]{str, dVar});
            return;
        }
        Set<WeakReference> set = (Set) ((HashMap) f30129a).get(str);
        if (!(set == null || set.isEmpty())) {
            for (WeakReference weakReference : set) {
                d dVar2 = (d) weakReference.get();
                if (dVar2 == null || dVar2.equals(dVar)) {
                    set.remove(weakReference);
                }
            }
            bqa.d("RecommendInstanceRecorder", "购后移除实例 containerId : " + str + ", mRecommendManagerImpl : " + dVar + "， 当前实例个数：" + set.size());
            if (set.isEmpty()) {
                ((HashMap) f30129a).remove(str);
            }
        }
    }
}
