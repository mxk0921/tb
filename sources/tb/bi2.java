package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.RequestTypeEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bi2 implements fjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16397a;

    static {
        t2o.a(729809808);
        t2o.a(729808960);
    }

    public bi2(String str) {
        this.f16397a = str;
    }

    @Override // tb.fjb
    public String build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5d594b", new Object[]{this});
        }
        bqa.d("bootImage", "BootImageParamBuild build ");
        if (RequestTypeEnum.COLD_START.requestName.equals(this.f16397a)) {
            return null;
        }
        bsd f = usg.d().f();
        if (f == null) {
            bqa.d("bootImage", "BootImageParamBuild stabilityService is null ");
            return null;
        }
        boolean a2 = f.a();
        if (!a2) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bootImageOccupied", (Object) Boolean.valueOf(a2));
        f.b();
        return jSONObject.toJSONString();
    }

    @Override // tb.fjb
    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return "bootImage";
    }
}
