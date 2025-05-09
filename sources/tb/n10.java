package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.TypeDX;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class n10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xea f24437a;

    static {
        t2o.a(295699369);
    }

    public n10(xea xeaVar) {
        this.f24437a = xeaVar;
    }

    public void a(TypeDX typeDX, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884337d", new Object[]{this, typeDX, jSONObject, new Integer(i)});
        }
    }

    public abstract TypeDX b(int i);

    public abstract String c();
}
