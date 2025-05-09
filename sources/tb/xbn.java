package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xbn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AnimatorManager";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, ConcurrentMap<String, Animator>> f31271a = new ConcurrentHashMap<>(3);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261223);
        }

        public a() {
        }

        public final Animator a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Animator) ipChange.ipc$dispatch("112ce37b", new Object[]{this, str, str2});
            }
            ckf.h(str, pl4.KEY_PAGE_ID);
            ckf.h(str2, "key");
            ConcurrentMap concurrentMap = (ConcurrentMap) xbn.a().get(str);
            if (concurrentMap != null) {
                return (Animator) concurrentMap.get(str2);
            }
            return null;
        }

        @JvmStatic
        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b62d640c", new Object[]{this, str});
                return;
            }
            ckf.h(str, pl4.KEY_PAGE_ID);
            xbn.a().put(str, new ConcurrentHashMap(3));
        }

        @JvmStatic
        public final void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f731456c", new Object[]{this, str});
                return;
            }
            ckf.h(str, pl4.KEY_PAGE_ID);
            ConcurrentMap concurrentMap = (ConcurrentMap) xbn.a().get(str);
            if (concurrentMap != null) {
                for (Map.Entry entry : concurrentMap.entrySet()) {
                    Animator animator = (Animator) entry.getValue();
                    if (animator != null) {
                        animator.cancel();
                        animator.removeAllListeners();
                        if (animator instanceof ValueAnimator) {
                            ((ValueAnimator) animator).removeAllUpdateListeners();
                        }
                    }
                }
            }
            ConcurrentMap concurrentMap2 = (ConcurrentMap) xbn.a().get(str);
            if (concurrentMap2 != null) {
                concurrentMap2.clear();
            }
            xbn.a().remove(str);
        }

        public final void d(String str, String str2, Animator animator) {
            Animator animator2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc9114a1", new Object[]{this, str, str2, animator});
                return;
            }
            ckf.h(str, pl4.KEY_PAGE_ID);
            ckf.h(str2, "key");
            ckf.h(animator, "animator");
            ConcurrentMap concurrentMap = (ConcurrentMap) xbn.a().get(str);
            if (!(concurrentMap == null || (animator2 = (Animator) concurrentMap.get(str2)) == null)) {
                animator2.cancel();
                animator2.removeAllListeners();
                if (animator2 instanceof ValueAnimator) {
                    ((ValueAnimator) animator2).removeAllUpdateListeners();
                }
            }
            ConcurrentMap concurrentMap2 = (ConcurrentMap) xbn.a().get(str);
            if (concurrentMap2 != null) {
                Animator animator3 = (Animator) concurrentMap2.put(str2, animator);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912261222);
    }

    public static final /* synthetic */ ConcurrentHashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("6bb7d506", new Object[0]);
        }
        return f31271a;
    }

    @JvmStatic
    public static final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62d640c", new Object[]{str});
        } else {
            Companion.b(str);
        }
    }

    @JvmStatic
    public static final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731456c", new Object[]{str});
        } else {
            Companion.c(str);
        }
    }
}
