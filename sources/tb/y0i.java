package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y0i extends f6j<MainRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "mtop.taobao.detail.data.get";
    public static final String API_NAME_BUNDLE_ADJUST = "mtop.taobao.detail.bundle.data.get";
    public static final String API_NAME_SPRING_DEGRADE = "mtop.taobao.detail.staticdata.get";

    static {
        t2o.a(912262174);
    }

    public y0i(MainRequestParams mainRequestParams) {
        super(mainRequestParams);
    }

    public static /* synthetic */ Object ipc$super(y0i y0iVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 803074244) {
            return super.h();
        }
        if (hashCode == 1379936911) {
            super.a();
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/request/client/MainRequestClient");
    }

    @Override // tb.f6j
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52402a8f", new Object[]{this});
            return;
        }
        this.b.setBizId(9998);
        this.b.handler(u5o.c());
        this.b.supportStreamJson(true);
        this.b.forbidStreamExceptionCallback(vbl.N());
        super.a();
    }

    @Override // tb.f6j
    public String d() {
        E e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        if (u()) {
            return API_NAME_BUNDLE_ADJUST;
        }
        List<String> Q0 = vbl.Q0();
        if (Q0 == null || Q0.isEmpty() || (e = this.f19050a) == 0 || ((MainRequestParams) e).getExParams() == null) {
            return API_NAME;
        }
        String str = ((MainRequestParams) this.f19050a).getExParams().get("from");
        if (TextUtils.isEmpty(str) || !Q0.contains(str) || !vbl.w0()) {
            return API_NAME;
        }
        return API_NAME_SPRING_DEGRADE;
    }

    @Override // tb.f6j
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return "1.0";
    }

    @Override // tb.f6j
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ebec4e7", new Object[]{this});
        }
        return "dataEngine";
    }

    @Override // tb.f6j
    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("79ac0f15", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (vbl.A0() && bw6.a(mr7.d())) {
            hashMap.put("x-nw-retry", "true");
        }
        s(hashMap);
        return hashMap;
    }

    @Override // tb.f6j
    public MethodEnum h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MethodEnum) ipChange.ipc$dispatch("2fddf0c4", new Object[]{this});
        }
        if (v()) {
            return MethodEnum.POST;
        }
        return super.h();
    }

    @Override // tb.f6j
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("daa8ec1e", new Object[]{this});
        }
        ((MainRequestParams) this.f19050a).removeUselessExParams();
        Map<String, String> buildParams = ((MainRequestParams) this.f19050a).buildParams();
        String str = buildParams.get("itemNumId");
        buildParams.remove("itemNumId");
        buildParams.put("id", str);
        if (TextUtils.isEmpty(str)) {
            t();
        }
        return JSON.toJSONString(buildParams);
    }

    public final void s(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b90de60f", new Object[]{this, map});
            return;
        }
        E e = this.f19050a;
        if (e != 0 && ((MainRequestParams) e).getExParams() != null) {
            String str = ((MainRequestParams) this.f19050a).getExParams().get("from");
            String str2 = ((MainRequestParams) this.f19050a).getExParams().get("openFrom");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            map.put("ttd-from", str);
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            map.put("ttd-open-from", str2);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6f2aac", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        E e = this.f19050a;
        if (!(e == 0 || ((MainRequestParams) e).getExParams() == null || ((MainRequestParams) this.f19050a).getExParams().isEmpty())) {
            hashMap.putAll(((MainRequestParams) this.f19050a).getExParams());
        }
        bw7.b(hashMap, -300017, "请求参数id为空");
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fda610d9", new Object[]{this})).booleanValue();
        }
        E e = this.f19050a;
        if (e == 0 || !((MainRequestParams) e).isUseBundleAdjust()) {
            return false;
        }
        return true;
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("931fafb0", new Object[]{this})).booleanValue();
        }
        E e = this.f19050a;
        if (e == 0 || !((MainRequestParams) e).isUseMtopPost()) {
            return false;
        }
        return true;
    }
}
