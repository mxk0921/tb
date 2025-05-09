package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class o6z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final o6z INSTANCE = new o6z();

    static {
        t2o.a(598737218);
    }

    public final m6z a(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m6z) ipChange.ipc$dispatch("8be8b4f3", new Object[]{this, new Byte(b)});
        }
        if (hrz.d(b, hrz.b((byte) 0))) {
            return frz.INSTANCE;
        }
        if (hrz.d(b, hrz.b((byte) 1))) {
            return erz.INSTANCE;
        }
        if (hrz.d(b, hrz.b((byte) 2))) {
            return grz.INSTANCE;
        }
        return null;
    }
}
