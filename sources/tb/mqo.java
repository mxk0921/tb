package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.ResourceResponseCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class mqo implements ResourceResponseCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982515727);
        t2o.a(996147221);
    }

    public abstract void a(ResourceResponse resourceResponse);

    public void b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ead09a", new Object[]{this, th});
        } else {
            dwh.i(th);
        }
    }

    @Override // com.taobao.zcache.ResourceResponseCallback
    public void finish(ResourceResponse resourceResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4c3406", new Object[]{this, resourceResponse});
            return;
        }
        try {
            a(resourceResponse);
        } catch (Throwable th) {
            b(th);
        }
    }
}
