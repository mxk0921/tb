package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e2q implements tqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18231a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    static {
        t2o.a(442499209);
        t2o.a(442499208);
    }

    public e2q(String str, String str2, String str3, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f18231a = str5;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return "mtop.trade.addBag";
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return "3.1";
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cartFrom", this.f18231a);
        hashMap.put("itemId", this.b);
        hashMap.put(q2q.KEY_SKU_ID, this.c);
        hashMap.put("quantity", this.d);
        hashMap.put("exParams", this.e);
        return JSON.toJSONString(hashMap);
    }

    @Override // tb.tqd
    public MtopRequest getMtopRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("8175faa3", new Object[]{this});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(c());
        mtopRequest.setApiName(a());
        mtopRequest.setVersion(b());
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
        return mtopRequest;
    }

    @Override // tb.tqd
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return "UNIT_TRADE";
    }
}
