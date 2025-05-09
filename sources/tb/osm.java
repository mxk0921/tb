package tb;

import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.preload.protocol.IPreloadService;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class osm extends lx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IContainerDataService<?> f25619a;
    public IContainerDataService.a b;
    public final IContainerService<?> c;
    public IContainerService.a d;
    public String e;
    public final IHostService f;
    public final IDxItemClickService g;
    public IDxItemClickService.b h;
    public JSONObject i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IDxItemClickService.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.b
        public Map<String, String> a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d9af0cc2", new Object[]{this, baseSectionModel, baseSubItemModel});
            }
            String targetUrl = baseSubItemModel.getTargetUrl();
            if (TextUtils.isEmpty(targetUrl) || !osm.a(osm.this, targetUrl)) {
                fve.e("PreloadScheduleBridge", "链接为空或者是不符合预期的链接");
                return null;
            }
            JSONObject b = osm.b(osm.this);
            if (b == null) {
                fve.e("PreloadScheduleBridge", "preloadConfig == null");
                return null;
            }
            boolean c = zmm.c(targetUrl);
            HashMap hashMap = new HashMap();
            hashMap.put("isTriggerPreLoad", String.valueOf(c));
            String string = b.getString("bucketId");
            if (!TextUtils.isEmpty(string)) {
                hashMap.put("abTestId", string);
            }
            return hashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            String requestType = iUiRefreshActionModel.getRequestType();
            fve.e("PreloadScheduleBridge", "requestType： " + requestType);
            boolean equals = TextUtils.equals(iUiRefreshActionModel.getUiOperationType(), "scrollToTop");
            if (TextUtils.equals(requestType, "coldStart") && TextUtils.equals(osm.d(osm.this), "coldStart") && equals) {
                LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(new Intent("homepageSecondRefreshEnd"));
                osm.f(osm.this).b("secondRefreshEnd");
                fve.e("PreloadScheduleBridge", "发送通知");
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void j(w1e w1eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
                return;
            }
            if (!(w1eVar == null || w1eVar.a() == null)) {
                osm.e(osm.this, w1eVar.a().getString("requestType"));
            }
            if (iContainerDataModel == null) {
                fve.e("PreloadScheduleBridge", "iContainerDataModel == null");
            } else if (TextUtils.isEmpty(osm.d(osm.this)) || !"coldStart,pullRefresh,userLogin,editionSwitch,hotStart".contains(osm.d(osm.this))) {
                fve.e("PreloadScheduleBridge", "不是需要处理的请求类型，mRequestType：" + osm.d(osm.this));
            } else {
                osm osmVar = osm.this;
                osm.h(osmVar, osm.i(osmVar, iContainerDataModel));
                if (osm.g(osm.this) == null) {
                    osm.j(osm.this);
                    fve.e("PreloadScheduleBridge", "ext == null");
                    return;
                }
                JSONObject b = osm.b(osm.this);
                if (b == null) {
                    osm.k(osm.this);
                    fve.e("PreloadScheduleBridge", "preloadConfig == null");
                    return;
                }
                String string = b.getString("value");
                if (TextUtils.isEmpty(string)) {
                    osm.l(osm.this);
                    fve.e("PreloadScheduleBridge", "rules == null");
                    return;
                }
                osm.m(osm.this, string);
                osm osmVar2 = osm.this;
                osm.c(osmVar2, osm.g(osmVar2));
            }
        }
    }

    static {
        t2o.a(491782438);
    }

    public osm(cfc cfcVar) {
        this.f25619a = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.c = (IContainerService) cfcVar.a(IContainerService.class);
        this.f = (IHostService) cfcVar.a(IHostService.class);
        this.g = (IDxItemClickService) cfcVar.a(IDxItemClickService.class);
        this.mUserTrackScore = new vte(cfcVar);
        this.mPreloadService = new vsm(this.mUserTrackScore);
        r();
        t();
        s();
    }

    public static /* synthetic */ boolean a(osm osmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb07008a", new Object[]{osmVar, str})).booleanValue();
        }
        return osmVar.q(str);
    }

    public static /* synthetic */ JSONObject b(osm osmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5f2845bb", new Object[]{osmVar});
        }
        return osmVar.getPreloadConfig();
    }

    public static /* synthetic */ void c(osm osmVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b76d0223", new Object[]{osmVar, jSONObject});
        } else {
            osmVar.updatePreLoadModel(jSONObject);
        }
    }

    public static /* synthetic */ String d(osm osmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5b5866", new Object[]{osmVar});
        }
        return osmVar.e;
    }

    public static /* synthetic */ String e(osm osmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b05545e", new Object[]{osmVar, str});
        }
        osmVar.e = str;
        return str;
    }

    public static /* synthetic */ IPreloadService f(osm osmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPreloadService) ipChange.ipc$dispatch("5f7d1b77", new Object[]{osmVar});
        }
        return osmVar.mPreloadService;
    }

    public static /* synthetic */ JSONObject g(osm osmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("484fc58", new Object[]{osmVar});
        }
        return osmVar.i;
    }

    public static /* synthetic */ JSONObject h(osm osmVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3657aa5a", new Object[]{osmVar, jSONObject});
        }
        osmVar.i = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ JSONObject i(osm osmVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8ff9f1e4", new Object[]{osmVar, iContainerDataModel});
        }
        return osmVar.getExt(iContainerDataModel);
    }

    public static /* synthetic */ Object ipc$super(osm osmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/nextpageoptimizeservice/schdule/PreloadScheduleBridge");
    }

    public static /* synthetic */ void j(osm osmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e822f6", new Object[]{osmVar});
        } else {
            osmVar.destroyAllTask();
        }
    }

    public static /* synthetic */ void k(osm osmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4f9bd5", new Object[]{osmVar});
        } else {
            osmVar.destroyAllTask();
        }
    }

    public static /* synthetic */ void l(osm osmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b714b4", new Object[]{osmVar});
        } else {
            osmVar.destroyAllTask();
        }
    }

    public static /* synthetic */ void m(osm osmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5510989d", new Object[]{osmVar, str});
        } else {
            osmVar.updateUserTrackScoreRules(str);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        u();
        w();
        this.mUserTrackScore.h();
        unRegisterPreLoadTask();
        v();
    }

    public final JSONObject getExt(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("80696729", new Object[]{this, iContainerDataModel});
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base != null) {
            return base.getExt();
        }
        fve.e("PreloadScheduleBridge", "base == null");
        return null;
    }

    public final JSONObject getPreloadConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c3cec1c", new Object[]{this});
        }
        IHostService iHostService = this.f;
        if (iHostService == null) {
            fve.e("PreloadScheduleBridge", "mHostService == null");
            return null;
        }
        v9c f = iHostService.getInvokeCallback().f();
        if (f == null) {
            fve.e("PreloadScheduleBridge", "callBack == null");
            return null;
        }
        JSONObject e = f.e();
        if (e != null) {
            return e.getJSONObject("preloadConfig");
        }
        bqa.d("PreloadScheduleBridge", "clientABTest == null");
        return null;
    }

    public final IContainerDataService.a n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("a5b738e0", new Object[]{this});
        }
        return new c();
    }

    public final IDxItemClickService.b o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDxItemClickService.b) ipChange.ipc$dispatch("4e57ba0c", new Object[]{this});
        }
        return new a();
    }

    public final IContainerService.a p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerService.a) ipChange.ipc$dispatch("c4ddacd6", new Object[]{this});
        }
        return new b();
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d81fc91d", new Object[]{this});
        } else if (this.f25619a != null) {
            IContainerDataService.a n = n();
            this.b = n;
            this.f25619a.addDataProcessListener(n);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a1fbd2", new Object[]{this});
        } else if (this.g != null) {
            IDxItemClickService.b o = o();
            this.h = o;
            this.g.addTargetUrlParamsCreator(o);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
        } else if (this.c != null) {
            IContainerService.a p = p();
            this.d = p;
            this.c.addUiRefreshListener(p);
        }
    }

    public void u() {
        IContainerDataService<?> iContainerDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435b1f44", new Object[]{this});
            return;
        }
        IContainerDataService.a aVar = this.b;
        if (aVar != null && (iContainerDataService = this.f25619a) != null) {
            iContainerDataService.removeDataProcessListener(aVar);
        }
    }

    public final void v() {
        IDxItemClickService.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b0a04b", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.g;
        if (iDxItemClickService != null && (bVar = this.h) != null) {
            iDxItemClickService.removeTargetUrlParamsCreator(bVar);
        }
    }

    public final void w() {
        IContainerService<?> iContainerService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        IContainerService.a aVar = this.d;
        if (aVar != null && (iContainerService = this.c) != null) {
            iContainerService.removeUiRefreshListener(aVar);
        }
    }

    public final boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2abefce", new Object[]{this, str})).booleanValue();
        }
        JSONObject jSONObject = this.i;
        if (jSONObject == null) {
            fve.e("PreloadScheduleBridge", "mExt == null");
            return false;
        }
        String string = jSONObject.getString("taskList");
        if (TextUtils.isEmpty(string)) {
            fve.e("PreloadScheduleBridge", "taskListStr == null");
            return false;
        }
        try {
            JSONArray parseArray = JSON.parseArray(string);
            if (parseArray != null && !parseArray.isEmpty()) {
                return parseArray.contains(oov.a(str, "spm", "scm", yj4.PARAM_UT_PARAMS, "itemIds"));
            }
            fve.e("PreloadScheduleBridge", "taskList == null");
            return false;
        } catch (Exception e) {
            fve.e("PreloadScheduleBridge", "isInTaskUrlList occur Exception: " + e);
            return false;
        }
    }
}
