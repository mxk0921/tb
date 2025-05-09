package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class r3v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593195);
    }

    public void onTrigger(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41af8aa", new Object[]{this, str});
        }
    }
}
