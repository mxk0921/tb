package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sve implements w1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f28297a;
    public final JSONObject b = new JSONObject();

    static {
        t2o.a(486539749);
        t2o.a(488636518);
    }

    public sve(String str) {
        this.f28297a = str;
    }

    @Override // tb.w1e
    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ce084eb9", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.w1e
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return this.f28297a;
    }
}
