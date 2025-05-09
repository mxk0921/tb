package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zoloz.hummer.common.BaseWebService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class nzw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static nzw b;

    /* renamed from: a  reason: collision with root package name */
    public BaseWebService f25057a;

    static {
        t2o.a(245366853);
    }

    public static nzw c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzw) ipChange.ipc$dispatch("7e7e000b", new Object[0]);
        }
        if (b == null) {
            synchronized (nzw.class) {
                try {
                    if (b == null) {
                        b = new nzw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4ec39e", new Object[]{this, str});
            return;
        }
        BaseWebService baseWebService = this.f25057a;
        if (baseWebService != null) {
            baseWebService.exitPage(str);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c47c1f", new Object[]{this});
            return;
        }
        BaseWebService baseWebService = this.f25057a;
        if (baseWebService != null) {
            baseWebService.exitSession();
        }
    }

    public void d(BaseWebService baseWebService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd8ec0a", new Object[]{this, baseWebService});
        } else {
            this.f25057a = baseWebService;
        }
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecfd77d2", new Object[]{this, str})).booleanValue();
        }
        BaseWebService baseWebService = this.f25057a;
        if (baseWebService == null || !baseWebService.isPageAlreadyExisted(str)) {
            return false;
        }
        return true;
    }

    public void f(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5474167", new Object[]{this, hashMap});
            return;
        }
        BaseWebService baseWebService = this.f25057a;
        if (baseWebService != null) {
            baseWebService.openPage(hashMap);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            b = null;
        }
    }
}
