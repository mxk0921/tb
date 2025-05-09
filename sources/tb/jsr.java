package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jsr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VERSION = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a {
        static {
            t2o.a(774897830);
        }
    }

    static {
        t2o.a(774897829);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e353ddcf", new Object[]{this});
        }
    }

    public a b(t7w t7wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("dac88966", new Object[]{this, t7wVar});
        }
        return null;
    }
}
