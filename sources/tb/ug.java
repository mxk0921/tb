package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.nodemodel.branch.AURABranchModel;
import com.alibaba.android.aura.nodemodel.branch.AURAConditionModel;
import com.alibaba.android.aura.nodemodel.branch.AURANodeBranchModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ug {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lo f29352a;
    public final jj b;
    public final hk c;
    public final Map<String, Boolean> d = new ConcurrentHashMap();
    public Map<String, abb> e;

    static {
        t2o.a(79691829);
    }

    public ug(lo loVar, jj jjVar, hk hkVar) {
        this.f29352a = loVar;
        this.b = jjVar;
        this.c = hkVar;
        f();
    }

    public final void b(AURABranchModel aURABranchModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb222f11", new Object[]{this, aURABranchModel, new Boolean(z)});
        } else if (aURABranchModel.cacheValue) {
            ((ConcurrentHashMap) this.d).put(aURABranchModel.code, Boolean.valueOf(z));
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((ConcurrentHashMap) this.d).clear();
        }
    }

    public final Boolean d(AURABranchModel aURABranchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b0835a2a", new Object[]{this, aURABranchModel});
        }
        return (Boolean) ((ConcurrentHashMap) this.d).get(aURABranchModel.code);
    }

    public final boolean e(List<AURAConditionModel> list) {
        boolean z = true;
        for (AURAConditionModel aURAConditionModel : list) {
            Class<? extends zab> c = this.b.c(aURAConditionModel.code);
            if (c != null) {
                try {
                    zab zabVar = (zab) c.newInstance();
                    zabVar.b(this.f29352a);
                    z = g(zabVar.a(aURAConditionModel.input), aURAConditionModel.operator);
                    if (!z) {
                        break;
                    }
                } catch (IllegalAccessException e) {
                    rbb g = ck.g();
                    g.b("AURABranchManager", "branchValueForCode", "创建实例失败(IllegalAccessException)：" + e.getMessage());
                } catch (InstantiationException e2) {
                    rbb g2 = ck.g();
                    g2.b("AURABranchManager", "branchValueForCode", "创建实例失败(InstantiationException)：" + e2.getMessage());
                }
            }
        }
        return z;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1358843", new Object[]{this});
            return;
        }
        this.e = new HashMap();
        vg vgVar = new vg();
        ((HashMap) this.e).put(vgVar.b(), vgVar);
    }

    public final boolean g(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c921cfd", new Object[]{this, new Boolean(z), str})).booleanValue();
        }
        abb abbVar = (abb) ((HashMap) this.e).get(str);
        if (abbVar == null) {
            return z;
        }
        return abbVar.a(z);
    }

    public boolean a(AURANodeBranchModel aURANodeBranchModel) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ce7b5a7", new Object[]{this, aURANodeBranchModel})).booleanValue();
        }
        if (aURANodeBranchModel == null) {
            return true;
        }
        String str = aURANodeBranchModel.code;
        boolean parseBoolean = Boolean.parseBoolean(aURANodeBranchModel.defaultValue);
        String str2 = aURANodeBranchModel.operator;
        if (TextUtils.isEmpty(str)) {
            ck.g().e("branchValue#branchCode is empty", ck.b.b().l("AURABranchManager").h("默认值", parseBoolean).a());
            return parseBoolean;
        }
        AURABranchModel b = this.c.b(str);
        if (b == null) {
            if (th.c()) {
                rbb g = ck.g();
                g.e("branchValue#在配置中找不到【" + str + "】", ck.b.b().l("AURABranchManager").h("默认值", parseBoolean).a());
            }
            return parseBoolean;
        }
        Boolean d = d(b);
        if (d == null) {
            List<AURAConditionModel> list = b.conditions;
            if (bh.a(list)) {
                rbb g2 = ck.g();
                g2.b("AURABranchManager", "branchValueForCode", "配置【" + str + "】中没有配置具体的Condition");
                return parseBoolean;
            }
            z = e(list);
            b(b, z);
        } else {
            z = d.booleanValue();
        }
        return g(z, str2);
    }
}
