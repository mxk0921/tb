package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rvw implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27644a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ WXSDKInstance d;

    public rvw(WXSDKInstance wXSDKInstance, int i, String[] strArr, int[] iArr) {
        this.d = wXSDKInstance;
        this.f27644a = i;
        this.b = strArr;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (WXSDKInstance.g(this.d) != null) {
            WXSDKInstance.g(this.d).onRequestPermissionsResult(this.f27644a, this.b, this.c);
        }
    }
}
