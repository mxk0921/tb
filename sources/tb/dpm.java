package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.ArtcException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dpm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313315);
    }

    public static void a(String str, boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df9298de", new Object[]{str, new Boolean(z)});
        } else if (!z) {
            throw new ArtcException(str);
        }
    }
}
