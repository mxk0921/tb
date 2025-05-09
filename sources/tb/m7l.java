package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.face.factory.SharedPreferencesFactory;
import com.taobao.android.boutique.fastsp.face.factory.SysSharedPreferencesFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m7l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, SharedPreferences> f23822a = new ConcurrentHashMap();
    public static volatile SharedPreferencesFactory b;

    static {
        t2o.a(409993226);
    }

    public static SharedPreferences a(Context context, String str, int i) {
        SharedPreferencesFactory sharedPreferencesFactory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("11676488", new Object[]{context, str, new Integer(i)});
        }
        if (b == null) {
            synchronized (m7l.class) {
                try {
                    if (b == null) {
                        Object b2 = new wlp().b(context);
                        if (b2 instanceof SharedPreferencesFactory) {
                            sharedPreferencesFactory = (SharedPreferencesFactory) b2;
                        } else {
                            sharedPreferencesFactory = new SysSharedPreferencesFactory();
                        }
                        b = sharedPreferencesFactory;
                    }
                } finally {
                }
            }
        }
        Map<String, SharedPreferences> map = f23822a;
        SharedPreferences sharedPreferences = (SharedPreferences) ((ConcurrentHashMap) map).get(str);
        if (sharedPreferences == null) {
            synchronized (map) {
                try {
                    sharedPreferences = (SharedPreferences) ((ConcurrentHashMap) map).get(str);
                    if (sharedPreferences == null) {
                        SharedPreferences create = b.create(context, str, i);
                        ((ConcurrentHashMap) map).put(str, create);
                        sharedPreferences = create;
                    }
                } finally {
                }
            }
        }
        return sharedPreferences;
    }
}
