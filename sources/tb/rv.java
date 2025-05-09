package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class rv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final sv f27625a;

    static {
        t2o.a(478150920);
    }

    public rv(sv svVar) {
        ckf.g(svVar, "instanceWrapper");
        this.f27625a = svVar;
    }

    public abstract boolean a(String str, String str2, String str3, JSONObject jSONObject);

    public final sv b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sv) ipChange.ipc$dispatch("f7d7f1d8", new Object[]{this});
        }
        return this.f27625a;
    }

    public final sv c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sv) ipChange.ipc$dispatch("c6bd0a97", new Object[]{this});
        }
        return this.f27625a;
    }
}
