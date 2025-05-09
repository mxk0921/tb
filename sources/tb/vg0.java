package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static vg0 b;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f29996a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            vp9.a("linkx", "AfcOrange === registerListener === nameSpace为：" + str + " === 获取到的configs: " + configs);
            vg0.this.f29996a = configs;
            cmp.b(AfcCustomSdk.h().f10563a).e("flow_customs_in_local", configs);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(vg0 vg0Var) {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else {
                cmp.b(AfcCustomSdk.h().f10563a).d("applink_xbs_config", OrangeConfig.getInstance().getCustomConfig(str, ""));
            }
        }
    }

    static {
        t2o.a(467664913);
    }

    public vg0() {
        e();
    }

    public static vg0 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vg0) ipChange.ipc$dispatch("d69ee04", new Object[0]);
        }
        if (b == null) {
            b = new vg0();
        }
        return b;
    }

    public <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ce9e8917", new Object[]{this, str, cls});
        }
        Map<String, String> map = this.f29996a;
        if (map == null || map.size() == 0) {
            this.f29996a = cmp.b(AfcCustomSdk.h().f10563a).c("flow_customs_in_local");
        }
        Map<String, String> map2 = this.f29996a;
        T t = map2 != null ? (T) JSON.parseObject(map2.get(str), cls) : null;
        vp9.a("linkx", "AfcOrange === configs2Bean === mFlowInConfig: " + this.f29996a + "  mT == " + t);
        return t;
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{this, str, str2});
        }
        Map<String, String> map = this.f29996a;
        if (map == null || map.size() == 0) {
            this.f29996a = cmp.b(AfcCustomSdk.h().f10563a).c("flow_customs_in_local");
        }
        Map<String, String> map2 = this.f29996a;
        if (map2 == null || map2.size() == 0) {
            return str2;
        }
        String str3 = this.f29996a.get(str);
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        return str3;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db4be90", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"applink_xbs_config"}, new b(this), false);
        }
    }

    public final void e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f58d10e5", new Object[]{this});
            return;
        }
        vp9.a("linkx", "AfcOrange === initOrange === groupName: flow_customs_in");
        if (!TextUtils.isEmpty(pg0.i().l)) {
            str = pg0.i().l;
        } else {
            str = "flow_customs_in";
        }
        OrangeConfig.getInstance().registerListener(new String[]{str}, new a(), false);
        d();
    }
}
