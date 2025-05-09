package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.impl.config.a;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lwt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f23616a = new AtomicBoolean(false);

    public static void a(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c2bc02", new Object[]{context, hashMap});
            return;
        }
        AtomicBoolean atomicBoolean = f23616a;
        if (atomicBoolean.get()) {
            return;
        }
        if (context == null) {
            Log.e("TinctLauncher", "The content is null");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        a.p(applicationContext, hashMap);
        if (!a.J()) {
            Log.e("TinctLauncher", "The tinct is disable!");
            return;
        }
        bi3.g().j(applicationContext);
        atomicBoolean.set(true);
        bi3.g().e();
    }

    public static AtomicBoolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("91f554e1", new Object[0]);
        }
        return f23616a;
    }

    public static void c(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b3180b", new Object[]{context, str, new Integer(i)});
            return;
        }
        try {
            if (a.G(context, str, i)) {
                bi3.g().z(context);
            }
        } catch (Exception e) {
            Log.e("TinctLauncher", "preInit exception", e);
        }
    }
}
