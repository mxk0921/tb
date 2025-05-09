package tb;

import android.net.Uri;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ui3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<Uri, wz1> f29392a = new HashMap<>();
    public static final HashMap<IBinder, js1> b = new HashMap<>();

    static {
        t2o.a(393216041);
    }

    public static synchronized js1 a(IBinder iBinder) {
        synchronized (ui3.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (js1) ipChange.ipc$dispatch("4c14af5d", new Object[]{iBinder});
            }
            HashMap<IBinder, js1> hashMap = b;
            js1 js1Var = hashMap.get(iBinder);
            if (js1Var == null) {
                js1Var = new ky6(iBinder);
                hashMap.put(iBinder, js1Var);
            }
            return js1Var;
        }
    }

    public static synchronized wz1 b(Uri uri) {
        synchronized (ui3.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wz1) ipChange.ipc$dispatch("e8a15d81", new Object[]{uri});
            }
            HashMap<Uri, wz1> hashMap = f29392a;
            wz1 wz1Var = hashMap.get(uri);
            if (wz1Var == null) {
                wz1Var = new kwi(uri);
                hashMap.put(uri, wz1Var);
            }
            return wz1Var;
        }
    }
}
