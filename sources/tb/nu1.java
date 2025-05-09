package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nu1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MUSDKInstance f24950a;
    public final String b;
    public final int c;

    static {
        t2o.a(982516084);
    }

    public nu1(MUSDKInstance mUSDKInstance, String str, int i) {
        this.f24950a = mUSDKInstance;
        this.b = str;
        this.c = i;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5821e08b", new Object[]{this});
        } else {
            b(null);
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a87d7c5", new Object[]{this, jSONObject});
        } else {
            this.f24950a.fireEventOnNode(this.c, this.b, jSONObject);
        }
    }
}
