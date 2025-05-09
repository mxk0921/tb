package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.utils.WXLogUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class svw implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f28306a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ String d;
    public final /* synthetic */ WXRenderStrategy e;
    public final /* synthetic */ WXSDKInstance f;

    public svw(WXSDKInstance wXSDKInstance, String str, String str2, Map map, String str3, WXRenderStrategy wXRenderStrategy) {
        this.f = wXSDKInstance;
        this.f28306a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = wXRenderStrategy;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (WXSDKInstance.g(this.f) != null) {
            WXLogUtils.e("weex1", "instance id:" + WXSDKInstance.a(this.f) + " pageName:" + this.f28306a + " renderInternal remote");
            WXSDKInstance.g(this.f).renderInternal(this.f28306a, this.b, this.c, this.d, this.e);
        }
    }
}
