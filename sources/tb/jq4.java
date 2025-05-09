package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jq4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, WeakReference<Context>> f22155a = new ConcurrentHashMap();

    static {
        t2o.a(758120503);
    }

    public static void a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f016b7", new Object[]{str, context});
        } else {
            ((ConcurrentHashMap) f22155a).put(str, new WeakReference(context));
        }
    }
}
