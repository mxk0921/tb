package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.alibaba.android.umf.constants.UMFConstants$ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jj f30057a;
    public final Map<String, gn> b = new HashMap();
    public Map<String, lbb> c = new HashMap();
    public final Map<String, yi> d = new HashMap();
    public final lo e;
    public ug f;

    static {
        t2o.a(79691810);
    }

    public vk(lo loVar, jj jjVar) {
        this.e = loVar;
        this.f30057a = jjVar;
    }

    public final yi a(AURAExecuteNodeModel aURAExecuteNodeModel, wi wiVar, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yi) ipChange.ipc$dispatch("d5521b5d", new Object[]{this, aURAExecuteNodeModel, wiVar, hbbVar});
        }
        yi h = h(aURAExecuteNodeModel.code, wiVar);
        h.a();
        j(aURAExecuteNodeModel, wiVar, h, hbbVar);
        return h;
    }

    public final void b(String str, lbb lbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9df423b", new Object[]{this, str, lbbVar});
            return;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        this.c.put(str, lbbVar);
    }

    public final void c(AURAExecuteNodeModel aURAExecuteNodeModel, gn gnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c68ee6df", new Object[]{this, aURAExecuteNodeModel, gnVar});
        } else {
            ((HashMap) this.b).put(aURAExecuteNodeModel.code, gnVar);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        for (gn gnVar : ((HashMap) this.b).values()) {
            gnVar.onDestroy();
        }
        ((HashMap) this.b).clear();
        for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
            ((lbb) entry.getValue()).onDestroy();
        }
        ((HashMap) this.c).clear();
        for (yi yiVar : ((HashMap) this.d).values()) {
            yiVar.b();
        }
        ((HashMap) this.d).clear();
        this.f = null;
    }

    public final lbb e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lbb) ipChange.ipc$dispatch("4337af71", new Object[]{this, str});
        }
        return this.c.get(str);
    }

    public yi f(String str, wi wiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yi) ipChange.ipc$dispatch("cb9a2d0e", new Object[]{this, str, wiVar});
        }
        return h(str, wiVar);
    }

    public final Pair<lbb, Boolean> g(String str, hbb hbbVar) {
        lbb e = e(str);
        if (e != null) {
            return new Pair<>(e, Boolean.FALSE);
        }
        Class<? extends lbb> d = this.f30057a.d(str);
        if (d == null) {
            hbbVar.b(new mi(1, "AURACoreDomain", "-4000", "扩展点实现创建失败|PluginCenter中没有注册扩展点：" + str).g("extensionImplCode", str));
            return null;
        }
        try {
            lbb lbbVar = (lbb) d.newInstance();
            b(str, lbbVar);
            return new Pair<>(lbbVar, Boolean.TRUE);
        } catch (IllegalAccessException unused) {
            hbbVar.b(new mi(1, "AURACoreDomain", "-4000", "扩展点实现创建失败(非法访问)").g("extensionImplCode", str));
            return null;
        } catch (InstantiationException unused2) {
            hbbVar.b(new mi(1, "AURACoreDomain", "-4000", "扩展点实现创建失败(反射初始化失败)").g("extensionImplCode", str));
            return null;
        }
    }

    public final yi h(String str, wi wiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yi) ipChange.ipc$dispatch("33cbb24f", new Object[]{this, str, wiVar});
        }
        yi yiVar = (yi) ((HashMap) this.d).get(str);
        if (yiVar != null) {
            return yiVar;
        }
        yi yiVar2 = new yi(wiVar);
        ((HashMap) this.d).put(str, yiVar2);
        return yiVar2;
    }

    public final gn i(AURAExecuteNodeModel aURAExecuteNodeModel, wi wiVar, hbb hbbVar) {
        String str = aURAExecuteNodeModel.code;
        if (TextUtils.isEmpty(str)) {
            hbbVar.b(new mi(0, "AURACoreDomain", UMFConstants$ErrorCode.SERVICE_NOT_FOUND, "创建服务失败(serviceCode为空)"));
            return null;
        }
        gn gnVar = (gn) ((HashMap) this.b).get(str);
        if (gnVar == null) {
            Class<? extends gn> f = this.f30057a.f(str);
            if (f == null) {
                hbbVar.b(new mi(0, "AURACoreDomain", UMFConstants$ErrorCode.SERVICE_NOT_FOUND, "创建服务【" + str + "】失败(PluginCenter没有注册服务)").g("serviceCode", str));
                return null;
            }
            try {
                gn gnVar2 = (gn) f.newInstance();
                c(aURAExecuteNodeModel, gnVar2);
                gnVar2.onCreate(this.e, a(aURAExecuteNodeModel, wiVar, hbbVar));
                return gnVar2;
            } catch (IllegalAccessException unused) {
                hbbVar.b(new mi(0, "AURACoreDomain", UMFConstants$ErrorCode.SERVICE_NOT_FOUND, "创建服务失败(非法访问)").g("serviceClass", f.toString()));
                return null;
            } catch (InstantiationException unused2) {
                hbbVar.b(new mi(0, "AURACoreDomain", UMFConstants$ErrorCode.SERVICE_NOT_FOUND, "创建服务失败(反射初始化实例失败)").g("serviceClass", f.toString()));
                return null;
            }
        } else {
            a(aURAExecuteNodeModel, wiVar, hbbVar);
            return gnVar;
        }
    }

    public vk k(IAURAPluginCenter... iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vk) ipChange.ipc$dispatch("1e90639c", new Object[]{this, iAURAPluginCenterArr});
        }
        this.f30057a.h(iAURAPluginCenterArr);
        return this;
    }

    public void l(ug ugVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d566b", new Object[]{this, ugVar});
        } else {
            this.f = ugVar;
        }
    }

    public final void j(AURAExecuteNodeModel aURAExecuteNodeModel, wi wiVar, yi yiVar, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426eb841", new Object[]{this, aURAExecuteNodeModel, wiVar, yiVar, hbbVar});
            return;
        }
        Map<String, List<AURAExecuteNodeModel>> map = aURAExecuteNodeModel.extensions;
        if (!bh.b(map)) {
            for (Map.Entry<String, List<AURAExecuteNodeModel>> entry : map.entrySet()) {
                List<AURAExecuteNodeModel> value = entry.getValue();
                if (!bh.a(value)) {
                    for (AURAExecuteNodeModel aURAExecuteNodeModel2 : value) {
                        ug ugVar = this.f;
                        if (ugVar == null || ugVar.a(aURAExecuteNodeModel2.branch)) {
                            String str = aURAExecuteNodeModel2.code;
                            try {
                                if (!TrtcConstants.TRTC_PARAMS_EXTENSION.equals(aURAExecuteNodeModel2.type)) {
                                    hbbVar.b(new mi(1, "AURACoreDomain", "-4001", "扩展点实现类：" + str + "没有配置type: extension").g("extensionImplCode", str));
                                } else {
                                    Pair<lbb, Boolean> g = g(str, hbbVar);
                                    if (g != null) {
                                        lbb lbbVar = (lbb) g.first;
                                        yiVar.g(lbbVar);
                                        yi h = h(str, wiVar);
                                        if (!bh.b(aURAExecuteNodeModel2.extensions)) {
                                            j(aURAExecuteNodeModel2, wiVar, h, hbbVar);
                                        }
                                        if (((Boolean) g.second).booleanValue()) {
                                            lbbVar.onCreate(this.e, h);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                hbbVar.b(new mi(1, "AURACoreDomain", "-4001", "注册扩展点【" + str + "】失败").g("extensionImplCode", str).g("errorMessage", th.getMessage()));
                                th.d(th);
                            }
                        }
                    }
                }
            }
        }
    }
}
