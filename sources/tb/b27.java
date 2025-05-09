package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b27 implements afe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(996147249);
        t2o.a(996147206);
    }

    @Override // tb.afe
    public String load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("447a3289", new Object[]{this, str});
        }
        try {
            System.loadLibrary(str);
            return null;
        } catch (Throwable th) {
            return th.getMessage();
        }
    }
}
