package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rui extends k30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IContainerDataService<?> f27617a;
    public volatile boolean b;
    public sui c;
    public final IContainerDataService.c e;
    public final List<IJsBridgeService.a.AbstractC0565a> d = new CopyOnWriteArrayList();
    public long f = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else if (rui.d(rui.this, w1eVar)) {
                rui.e(rui.this, false);
                rui.h(rui.this, new sui(rui.f(rui.this, iContainerDataModel), true, null));
                rui ruiVar = rui.this;
                rui.i(ruiVar, rui.g(ruiVar));
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
            } else if (rui.d(rui.this, w1eVar)) {
                rui.e(rui.this, false);
                rui.h(rui.this, new sui(null, false, str2));
                rui ruiVar = rui.this;
                rui.i(ruiVar, rui.g(ruiVar));
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
            }
        }
    }

    static {
        t2o.a(491782670);
    }

    public rui(ajp ajpVar) {
        IContainerDataService<?> f = ajpVar.f();
        this.f27617a = f;
        if (f != null) {
            IContainerDataService.c j = j();
            this.e = j;
            f.addRequestListener(j);
        }
    }

    public static /* synthetic */ boolean d(rui ruiVar, w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5821b6f3", new Object[]{ruiVar, w1eVar})).booleanValue();
        }
        return ruiVar.n(w1eVar);
    }

    public static /* synthetic */ boolean e(rui ruiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d274aca", new Object[]{ruiVar, new Boolean(z)})).booleanValue();
        }
        ruiVar.b = z;
        return z;
    }

    public static /* synthetic */ JSONObject f(rui ruiVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a237fa4c", new Object[]{ruiVar, iContainerDataModel});
        }
        return ruiVar.l(iContainerDataModel);
    }

    public static /* synthetic */ sui g(rui ruiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sui) ipChange.ipc$dispatch("a47d656b", new Object[]{ruiVar});
        }
        return ruiVar.c;
    }

    public static /* synthetic */ sui h(rui ruiVar, sui suiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sui) ipChange.ipc$dispatch("dba2b53e", new Object[]{ruiVar, suiVar});
        }
        ruiVar.c = suiVar;
        return suiVar;
    }

    public static /* synthetic */ void i(rui ruiVar, sui suiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e79b60", new Object[]{ruiVar, suiVar});
        } else {
            ruiVar.o(suiVar);
        }
    }

    public static /* synthetic */ Object ipc$super(rui ruiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/sharedataservice/impl/jsnativefeature/feature/miniapp/MiniAppRequestFeature");
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
        }
        return "miniApp.request";
    }

    @Override // tb.k30
    public void c() {
        IContainerDataService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.f27617a;
        if (iContainerDataService != null && (cVar = this.e) != null) {
            iContainerDataService.removeRequestListener(cVar);
        }
    }

    public final IContainerDataService.c j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new a();
    }

    public final String k(sui suiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f024ca69", new Object[]{this, suiVar});
        }
        if (!suiVar.c()) {
            return "请求失败，message ： " + suiVar.a();
        } else if (ObjectUtils.c(suiVar.b())) {
            return "请求成功，但是服务端未返回delta数据";
        } else {
            return null;
        }
    }

    public final JSONObject l(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> delta;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("11765953", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null || (delta = iContainerDataModel.getDelta()) == null) {
            return null;
        }
        return JSON.parseObject(JSON.toJSONString(delta));
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return "MiniAppRequestFeature_miniAppPopRequest";
    }

    public final boolean n(w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63d11622", new Object[]{this, w1eVar})).booleanValue();
        }
        if (w1eVar == null) {
            return false;
        }
        return m().equals(w1eVar.b());
    }

    public final void o(sui suiVar) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("172de5e2", new Object[]{this, suiVar});
            return;
        }
        String k = k(suiVar);
        if (TextUtils.isEmpty(k)) {
            hashMap = new HashMap(2);
            hashMap.put("data", suiVar.b());
        } else {
            hashMap = null;
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            IJsBridgeService.a.AbstractC0565a aVar = (IJsBridgeService.a.AbstractC0565a) it.next();
            if (hashMap != null) {
                aVar.a(hashMap);
            } else {
                aVar.error(k);
            }
        }
        ((CopyOnWriteArrayList) this.d).clear();
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff1fc101", new Object[]{this})).booleanValue();
        }
        if (this.f <= 0 || System.currentTimeMillis() - this.f <= 20000) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void b(JSONObject jSONObject, IJsBridgeService.a.AbstractC0565a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f743e3", new Object[]{this, jSONObject, aVar});
        } else if (this.f27617a == null) {
            fve.e("MiniAppRequestFeature", "mContainerDataService is null");
            aVar.error("首页数据服务未初始化，mContainerDataService is null");
        } else {
            if (this.b) {
                if (!p()) {
                    ((CopyOnWriteArrayList) this.d).add(aVar);
                    fve.e("MiniAppRequestFeature", "请求尚未结束，等待结果");
                    return;
                }
                fve.e("MiniAppRequestFeature", "mtop无返回");
                Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
                while (it.hasNext()) {
                    ((IJsBridgeService.a.AbstractC0565a) it.next()).error("no mtop callback receive , request local timeout in20000");
                }
                this.b = false;
            }
            r(jSONObject, aVar);
        }
    }

    public final Map<String, Object> q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1265957c", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("miniAppBizParam");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        fve.e("MiniAppRequestFeature", "miniAppBizParam : " + string);
        HashMap hashMap = new HashMap(2);
        hashMap.put("miniAppBizParam", string);
        return hashMap;
    }

    public final void r(JSONObject jSONObject, IJsBridgeService.a.AbstractC0565a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dabd63df", new Object[]{this, jSONObject, aVar});
            return;
        }
        ((CopyOnWriteArrayList) this.d).add(aVar);
        JSONObject jSONObject2 = new JSONObject();
        Map<String, Object> q = q(jSONObject);
        if (q != null) {
            jSONObject2.put("bizParam", (Object) q);
        }
        jSONObject2.put("requestType", (Object) "miniAppPopRequest");
        this.f = System.currentTimeMillis();
        this.b = true;
        this.f27617a.triggerEvent("OnlyRequest", jSONObject2, new sve(m()));
    }
}
