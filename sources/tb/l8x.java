package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.weex.WeexMessageHandler;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l8x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap<String, WeakReference<WeexMessageHandler>> f23186a = new LinkedHashMap<>();

    static {
        t2o.a(442499354);
    }

    public static WeexMessageHandler a(String str) {
        WeakReference<WeexMessageHandler> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexMessageHandler) ipChange.ipc$dispatch("7a8f3c2d", new Object[]{str});
        }
        LinkedHashMap<String, WeakReference<WeexMessageHandler>> linkedHashMap = f23186a;
        if (linkedHashMap.isEmpty() || TextUtils.isEmpty(str) || (weakReference = linkedHashMap.get(str)) == null) {
            return null;
        }
        return weakReference.get();
    }

    public static void b(String str, WeexMessageHandler weexMessageHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea01be8", new Object[]{str, weexMessageHandler});
        } else if (!TextUtils.isEmpty(str) && weexMessageHandler != null) {
            f23186a.put(str, new WeakReference<>(weexMessageHandler));
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d188aed", new Object[]{str});
            return;
        }
        LinkedHashMap<String, WeakReference<WeexMessageHandler>> linkedHashMap = f23186a;
        if (!linkedHashMap.isEmpty() && !TextUtils.isEmpty(str)) {
            linkedHashMap.remove(str);
        }
    }
}
