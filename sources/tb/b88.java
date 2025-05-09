package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b88 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705337);
    }

    public static <T extends u1c> T a(Class<T> cls) {
        try {
            T newInstance = cls.newInstance();
            if (!(newInstance instanceof hu1)) {
                return null;
            }
            ((hu1) newInstance).o();
            return newInstance;
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            return null;
        }
    }
}
