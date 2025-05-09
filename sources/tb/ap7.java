package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ap7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ap7 INSTANCE = new ap7();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, WeakReference<zo7>> f15914a = new ConcurrentHashMap<>();

    static {
        t2o.a(106954758);
    }

    @JvmStatic
    public static final zo7 a(Context context, String str) {
        zo7 zo7Var;
        zo7 zo7Var2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zo7) ipChange.ipc$dispatch("9d83f1eb", new Object[]{context, str});
        }
        ckf.g(context, "context");
        ckf.g(str, "businessId");
        ConcurrentHashMap<String, WeakReference<zo7>> concurrentHashMap = f15914a;
        WeakReference<zo7> weakReference = concurrentHashMap.get(str);
        if (weakReference != null && (zo7Var2 = weakReference.get()) != null) {
            return zo7Var2;
        }
        zo7 zo7Var3 = new zo7(context, str);
        WeakReference<zo7> putIfAbsent = concurrentHashMap.putIfAbsent(str, new WeakReference<>(zo7Var3));
        if (putIfAbsent == null || (zo7Var = putIfAbsent.get()) == null) {
            return zo7Var3;
        }
        return zo7Var;
    }
}
