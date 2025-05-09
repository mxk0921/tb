package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.mtop.intf.MtopPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class gkz implements MtopPrefetch.IPrefetchCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(490733579);
        t2o.a(589299954);
    }

    @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
    public void onPrefetch(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e86b4c", new Object[]{this, str, hashMap});
        } else {
            fve.e("yuhuai", str);
        }
    }
}
