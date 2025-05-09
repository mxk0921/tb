package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.tao.infoflow.multitab.viewprovider.IMultiTabStabilityListener;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ebj implements IMultiTabStabilityListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final fuq f18449a;

    static {
        t2o.a(729809480);
        t2o.a(729809474);
    }

    public ebj(fuq fuqVar) {
        this.f18449a = fuqVar;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.IMultiTabStabilityListener
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22d42ce", new Object[]{this, str, str2, str3});
            return;
        }
        int a2 = fbj.a(str2);
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.KEY_ERROR_DETAIL, str3);
        d9j.a(str, str2, this.f18449a.j(a2), hashMap);
    }
}
