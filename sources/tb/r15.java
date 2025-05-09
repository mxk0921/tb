package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.CustomApiRequestParams;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r15 extends f6j<CustomApiRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262173);
    }

    public r15(CustomApiRequestParams customApiRequestParams) {
        super(customApiRequestParams);
    }

    public static /* synthetic */ Object ipc$super(r15 r15Var, String str, Object... objArr) {
        if (str.hashCode() == 1379936911) {
            super.a();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/request/client/CustomRequestClient");
    }

    @Override // tb.f6j
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52402a8f", new Object[]{this});
            return;
        }
        this.b.handler(u5o.c());
        this.b.forbidStreamExceptionCallback(vbl.N());
        super.a();
    }

    @Override // tb.f6j
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("730ed18b", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(((CustomApiRequestParams) this.f19050a).getEnableUpCompress());
    }

    @Override // tb.f6j
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return ((CustomApiRequestParams) this.f19050a).getApiName();
    }

    @Override // tb.f6j
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return ((CustomApiRequestParams) this.f19050a).getApiVersion();
    }

    @Override // tb.f6j
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ebec4e7", new Object[]{this});
        }
        return ((CustomApiRequestParams) this.f19050a).getBizTopic();
    }

    @Override // tb.f6j
    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("79ac0f15", new Object[]{this});
        }
        return ((CustomApiRequestParams) this.f19050a).getHeaderMap();
    }

    @Override // tb.f6j
    public MethodEnum h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MethodEnum) ipChange.ipc$dispatch("2fddf0c4", new Object[]{this});
        }
        if ("get".equalsIgnoreCase(((CustomApiRequestParams) this.f19050a).getMethod())) {
            return MethodEnum.GET;
        }
        return MethodEnum.POST;
    }

    @Override // tb.f6j
    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3050dbb1", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(((CustomApiRequestParams) this.f19050a).getEcode());
    }

    @Override // tb.f6j
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a40a375", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(((CustomApiRequestParams) this.f19050a).getSession());
    }

    @Override // tb.f6j
    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        String unitStrategy = ((CustomApiRequestParams) this.f19050a).getUnitStrategy();
        if ("TRADE".equalsIgnoreCase(unitStrategy)) {
            return "UNIT_TRADE";
        }
        if ("GUIDE".equalsIgnoreCase(unitStrategy)) {
            return "UNIT_GUIDE";
        }
        return "";
    }

    @Override // tb.f6j
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84e1d191", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(((CustomApiRequestParams) this.f19050a).getWua());
    }
}
