package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class q5z implements zpz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(918552607);
        t2o.a(352322031);
    }

    @Override // tb.zpz
    public void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91eb9ae1", new Object[]{this, str, str2, th});
            return;
        }
        ckf.g(str, "tag");
        ckf.g(str2, "msg");
        tpu.Companion.a(str, str2, th);
    }

    @Override // tb.zpz
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acf5affc", new Object[]{this});
        }
        return qz7.TAG_FAST_ANIM;
    }
}
