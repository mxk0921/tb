package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class miz implements zpz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321606);
        t2o.a(352322031);
    }

    @Override // tb.zpz
    public void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91eb9ae1", new Object[]{this, str, str2, th});
        } else if (th == null) {
            txj.e(str, str2);
        } else {
            txj.f(str, str2, th);
        }
    }

    @Override // tb.zpz
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acf5affc", new Object[]{this});
        }
        return txj.TAG_FAST_ANIM;
    }
}
