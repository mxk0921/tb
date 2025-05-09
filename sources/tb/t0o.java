package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class t0o implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WXSDKInstance f28391a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ u0o d;

    public t0o(u0o u0oVar, WXSDKInstance wXSDKInstance, String str, Map map) {
        this.d = u0oVar;
        this.f28391a = wXSDKInstance;
        this.b = str;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            u0o.l(this.d, this.f28391a, this.b, this.c);
        }
    }
}
