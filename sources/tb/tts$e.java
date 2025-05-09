package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.e0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tts$e implements e0.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(730857497);
        t2o.a(481296410);
    }

    public tts$e() {
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("841ff7b4", new Object[]{this, str});
        }
        return oen.n(str);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4afea14", new Object[]{this, str});
        }
        return oen.r(str);
    }
}
