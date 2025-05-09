package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Integer> f30956a = new HashMap<>(64);
    public final HashMap<Integer, f94> b = new HashMap<>(64);
    public int c;
    public final cfc d;
    public final DinamicXEngine e;

    static {
        t2o.a(486539495);
    }

    public wve(cfc cfcVar, DinamicXEngine dinamicXEngine) {
        this.d = cfcVar;
        this.e = dinamicXEngine;
    }

    public f94 a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f94) ipChange.ipc$dispatch("68f0ca54", new Object[]{this, new Integer(i)});
        }
        return this.b.get(Integer.valueOf(i));
    }

    public final String b(String str, String str2, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5144d12e", new Object[]{this, str, str2, baseSectionModel});
        }
        int e = k38.e(baseSectionModel);
        if (e == -1) {
            return str + "_" + str2;
        }
        return str + "_" + str2 + "_" + e;
    }

    public int c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("358be767", new Object[]{this, jSONObject})).intValue();
        }
        return e(null, jSONObject);
    }

    public int d(BaseSectionModel baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5985b91f", new Object[]{this, baseSectionModel, jSONObject})).intValue();
        }
        return e(baseSectionModel, jSONObject);
    }

    public final int e(BaseSectionModel baseSectionModel, JSONObject jSONObject) {
        Integer num;
        Integer num2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1717f006", new Object[]{this, baseSectionModel, jSONObject})).intValue();
        }
        if (jSONObject == null) {
            return -1;
        }
        f94 a2 = uit.a(jSONObject);
        String d = a2.d();
        String f = a2.f();
        if (TextUtils.isEmpty(d) || TextUtils.isEmpty(f)) {
            num = -1;
            f(a2);
        } else {
            String b = b(d, f, baseSectionModel);
            if (a2.h()) {
                this.f30956a.remove(b);
                a2.j(false);
            }
            num = this.f30956a.get(b);
            if (num == null) {
                if (a2.i()) {
                    DXTemplateItem u = this.e.u(a2.c());
                    if (u == null) {
                        num2 = -1;
                    } else {
                        if (!TextUtils.equals(u.f7343a, d) || !TextUtils.equals(String.valueOf(u.b), f)) {
                            String str = u.f7343a;
                            b = b(str, u.b + "", baseSectionModel);
                        }
                        num2 = this.f30956a.get(b);
                        if (num2 == null) {
                            int i = this.c;
                            this.c = 1 + i;
                            num2 = Integer.valueOf(i);
                            this.f30956a.put(b, num2);
                            this.b.put(num2, a2);
                        }
                    }
                } else {
                    DinamicTemplate f2 = DTemplateManager.t(j18.HOMEPAGE_DX_MODULE).f(a2.b());
                    if (f2 == null) {
                        num2 = -1;
                        fve.e("InfoFlowViewTypeGenerator", "exactTemplate is null");
                    } else {
                        if (!TextUtils.equals(f2.name, d) || !TextUtils.equals(f2.version, f)) {
                            String str2 = f2.name;
                            b = b(str2, f2.version + "", baseSectionModel);
                        }
                        num2 = this.f30956a.get(b);
                        if (num2 == null) {
                            int i2 = this.c;
                            this.c = 1 + i2;
                            num2 = Integer.valueOf(i2);
                            this.f30956a.put(b, num2);
                            this.b.put(num2, a2);
                        }
                    }
                }
                num = num2;
            } else {
                this.b.put(num, a2);
            }
        }
        return num.intValue();
    }

    public final void f(f94 f94Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0122c4b", new Object[]{this, f94Var});
        } else if (f94Var != null) {
            String containerId = this.d.getContainerType().getContainerId();
            String d = f94Var.d();
            String f = f94Var.f();
            String e = f94Var.e();
            ive.a(new zue(containerId, "dx3Render", 3002, "dx3 renderTemplate error", "name=" + d + ", version=" + f + ", url=" + e));
        }
    }
}
