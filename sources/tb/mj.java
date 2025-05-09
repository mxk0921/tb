package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.android.aura.nodemodel.AURAPluginNodeModel;
import com.alibaba.android.aura.nodemodel.branch.AURANodeBranchModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class mj implements nbb {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f24071a;
    public dj b;
    public boolean c = false;
    public String d = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends eh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/AURAInstance$1");
        }

        @Override // tb.eh
        public void b(JSONObject jSONObject, List<JSONObject> list, List<String> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db08fb88", new Object[]{this, jSONObject, list, list2});
                return;
            }
            ck.g().e("配置合并成功", ck.b.b().l("AURAInstance").f("合并模块", list2).a());
            mj.e(mj.this, list2);
            mj.f(mj.this, ((AURAPluginContainerNodeModel) JSON.toJavaObject(jSONObject, AURAPluginContainerNodeModel.class)).plugin);
        }

        @Override // tb.eh
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9818ec9", new Object[]{this, new Integer(i), str});
                return;
            }
            mj.d(mj.this, false);
            rbb g = ck.g();
            g.f("onCombineFailed#" + str, ck.b.b().l("AURAInstance").c("code", i).a());
        }
    }

    static {
        t2o.a(79691801);
        t2o.a(79691822);
    }

    @Deprecated
    public mj() throws IllegalAccessException {
        throw new IllegalAccessException("do not call this construct");
    }

    public static /* synthetic */ void d(mj mjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b6a38d", new Object[]{mjVar, new Boolean(z)});
        } else {
            mjVar.s(z);
        }
    }

    public static /* synthetic */ void e(mj mjVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4262b7", new Object[]{mjVar, list});
        } else {
            mjVar.g(list);
        }
    }

    public static /* synthetic */ void f(mj mjVar, AURAPluginNodeModel aURAPluginNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("982288b6", new Object[]{mjVar, aURAPluginNodeModel});
        } else {
            mjVar.r(aURAPluginNodeModel);
        }
    }

    public static mj h(lo loVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj) ipChange.ipc$dispatch("59d937ca", new Object[]{loVar});
        }
        if (loVar != null) {
            th.b(loVar.f());
            ai.f(loVar.f());
            if (th.c()) {
                ck.g().f("create", ck.b.b().l("AURAInstance").i("AURA/core").g("bizCode", loVar.d()).g("event", "CREATE").a());
            }
            return new mj(loVar);
        }
        throw new IllegalStateException("userContext不能为空");
    }

    @Override // tb.nbb
    public void destroy() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        lo loVar = this.f24071a;
        if (loVar == null) {
            str = "";
        } else {
            str = loVar.d();
        }
        if (th.c()) {
            ck.g().e("destroy", ck.b.b().l("AURAInstance").i("AURA/core").g("event", "DESTROY").g("bizCode", str).a());
        }
        dj djVar = this.b;
        if (djVar != null) {
            djVar.g();
            this.b = null;
        }
        lo loVar2 = this.f24071a;
        if (loVar2 != null) {
            loVar2.b();
            this.f24071a = null;
        }
    }

    public final void g(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1c4cb1", new Object[]{this, list});
            return;
        }
        for (String str : list) {
            IAURAPluginCenter b = jj.b(str);
            if (b != null) {
                o(b);
            }
        }
    }

    @Override // tb.nbb
    public lo getUserContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("fc4bf91a", new Object[]{this});
        }
        return this.f24071a;
    }

    public final void i(lo loVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("612ce070", new Object[]{this, loVar});
            return;
        }
        this.f24071a = loVar;
        loVar.l(this);
        this.b = dj.f(loVar);
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31bade62", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final AURAPluginNodeModel k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPluginNodeModel) ipChange.ipc$dispatch("e8d762e", new Object[]{this, str});
        }
        try {
            AURAPluginContainerNodeModel aURAPluginContainerNodeModel = (AURAPluginContainerNodeModel) JSON.parseObject(cxu.b(this.f24071a.f(), str), AURAPluginContainerNodeModel.class);
            if (aURAPluginContainerNodeModel != null) {
                return aURAPluginContainerNodeModel.plugin;
            }
            ck.g().f("loadConfig#配置转换为对象失败!", ck.b.b().l("AURAInstance").a());
            return null;
        } catch (Exception e) {
            rbb g = ck.g();
            g.b("AURAInstance", "loadConfig-parseError", z9u.ARG_TAOKE_ERROR + e.getMessage());
            return null;
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb1f59", new Object[]{this, str});
        } else {
            new dh(this.b.l()).g(this.f24071a.f(), str, new a());
        }
    }

    public void m(Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4e1e0", new Object[]{this, collection});
        } else if (this.b != null) {
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : collection) {
                long currentTimeMillis2 = System.currentTimeMillis();
                hl.a("************************************************************ ");
                hl.a("*****开始预加载 flowCode = " + str);
                this.b.o(str);
                hl.a("*****预加载 flowCode = " + str + "结束。共耗时 ：" + (System.currentTimeMillis() - currentTimeMillis2));
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            rbb g = ck.g();
            g.e("预加载workflow 耗时 = " + (currentTimeMillis3 - currentTimeMillis), ck.b.b().i("AURA/performance").a());
        }
    }

    /* renamed from: n */
    public <DATA> mj b(IAURAInputField<DATA> iAURAInputField) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj) ipChange.ipc$dispatch("d392cb7f", new Object[]{this, iAURAInputField});
        }
        if (iAURAInputField == null) {
            ck.g().b(mj.class.getSimpleName(), "registerExtInput", "inputField is null");
            return this;
        } else if (this.b == null) {
            ck.g().b("AURAInstance", "registerExtInput", "mFlowDispatcherManager is null, did you has destroyed already?");
            return this;
        } else {
            if (th.c()) {
                ck.g().e("registerExtInput", ck.b.b().l("AURAInstance").i("AURA/core").g("serviceInputFieldName", iAURAInputField.getFieldName()).g("event", "REGISTER_EXT_INPUT").a());
            }
            this.b.p(iAURAInputField);
            return this;
        }
    }

    public mj o(IAURAPluginCenter... iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj) ipChange.ipc$dispatch("a2f6abd7", new Object[]{this, iAURAPluginCenterArr});
        }
        if (this.b == null) {
            ck.g().f("registerPluginCenter#mFlowDispatcherManager is null, did you has destroyed already?", ck.b.b().l("AURAInstance").a());
            return this;
        }
        if (th.c()) {
            ck.g().e("registerPluginCenter", ck.b.b().l("AURAInstance").i("AURA/core").g("event", "REGISTER_PLUGIN_CENTER").c("pluginCenterCount", iAURAPluginCenterArr.length).a());
        }
        this.b.q(iAURAPluginCenterArr);
        return this;
    }

    public final void p(AURAPluginNodeModel aURAPluginNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d17295b", new Object[]{this, aURAPluginNodeModel});
            return;
        }
        dj djVar = this.b;
        if (djVar != null) {
            djVar.n(hk.e(aURAPluginNodeModel));
            this.b.r(new mvq(aURAPluginNodeModel.subscribeRelationModel));
        }
    }

    public final void q(AURAPluginNodeModel aURAPluginNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("482447ff", new Object[]{this, aURAPluginNodeModel});
            return;
        }
        this.f24071a.j(aURAPluginNodeModel.bizCode);
        this.f24071a.k(aURAPluginNodeModel.name);
    }

    public final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d70dad07", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public mj t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj) ipChange.ipc$dispatch("24230ae7", new Object[]{this, str});
        }
        this.d = str;
        Boolean bool = (Boolean) this.f24071a.h("enableExtendModules", Boolean.class, Boolean.FALSE);
        if (bool == null || !bool.booleanValue()) {
            r(k(str));
        } else {
            l(str);
        }
        if (th.c()) {
            ck.g().e("withConfig#", ck.b.b().l("AURAInstance").g("configAssetFileName", str).f("enableExtendModules", bool).a());
        }
        return this;
    }

    @Deprecated
    public nbb u(AURAPluginContainerNodeModel aURAPluginContainerNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nbb) ipChange.ipc$dispatch("37d5346c", new Object[]{this, aURAPluginContainerNodeModel});
        }
        r(aURAPluginContainerNodeModel.plugin);
        return this;
    }

    @Override // tb.nbb
    public boolean a(AURANodeBranchModel aURANodeBranchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ce7b5a7", new Object[]{this, aURANodeBranchModel})).booleanValue();
        }
        if (aURANodeBranchModel == null) {
            return true;
        }
        if (TextUtils.isEmpty(aURANodeBranchModel.code)) {
            return Boolean.parseBoolean(aURANodeBranchModel.defaultValue);
        }
        if (!j()) {
            ck.g().b("AURAInstance", "branchValueForCode", "AURAInstance尚未初始化完成");
            return Boolean.parseBoolean(aURANodeBranchModel.defaultValue);
        }
        dj djVar = this.b;
        if (djVar != null) {
            return djVar.d(aURANodeBranchModel);
        }
        ck.g().b("AURAInstance", "branchValue", "mFlowDispatcherManager is null, did you has destroyed already?");
        return Boolean.parseBoolean(aURANodeBranchModel.defaultValue);
    }

    @Override // tb.nbb
    public <DATA extends Serializable> void c(String str, DATA data, pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e498d84c", new Object[]{this, str, data, ptVar});
        } else if (j()) {
            dj djVar = this.b;
            if (djVar == null) {
                ck.g().e("mFlowDispatcherManager is null, did you has destroyed already?", ck.b.b().l("AURAInstance").i("AURA/core").a());
            } else {
                djVar.h(str, data, ptVar);
            }
        } else if (ptVar != null) {
            mi miVar = new mi(0, "AURACoreDomain", "-1000", "配置初始化错误");
            HashMap hashMap = new HashMap();
            String str2 = this.d;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("configPath", str2);
            miVar.i(hashMap);
            ptVar.b(miVar);
        }
    }

    public final void r(AURAPluginNodeModel aURAPluginNodeModel) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472845d", new Object[]{this, aURAPluginNodeModel});
            return;
        }
        if (aURAPluginNodeModel == null) {
            z = false;
        }
        s(z);
        if (j()) {
            q(aURAPluginNodeModel);
            p(aURAPluginNodeModel);
        }
        if (th.c()) {
            ck.b g = ck.b.b().l("AURAInstance").i("AURA/core").g("event", "LOAD_CONFIG").g(OConstant.DIMEN_CONFIG_NAME, this.d);
            g.e("configContent", tj.b(aURAPluginNodeModel));
            ck.g().e("setupWithConfig", g.a());
        }
    }

    public mj(lo loVar) {
        i(loVar);
    }
}
