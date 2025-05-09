package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cgt implements wec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809290);
        t2o.a(486539294);
    }

    @Override // tb.wec
    public boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beece4de", new Object[]{this, str, str2, str3})).booleanValue();
        }
        return ABGlobal.b(Globals.getApplication(), str, str2, str3);
    }
}
