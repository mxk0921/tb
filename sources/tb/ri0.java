package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.information.ai.api.IInformationFlowAiApi;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IAiService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.awe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ri0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile IInformationFlowAiApi f27393a;
    public IContainerDataService<?> b;
    public IContainerDataService.a c;
    public IContainerDataService.e d;
    public IAiService.a e;
    public final cfc f;
    public final awe.d g = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements awe.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.awe.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            fve.e("AiProviderAdapter", "LoadFailure: " + str);
        }

        @Override // tb.awe.d
        public void b(IInformationFlowAiApi iInformationFlowAiApi) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63969fbb", new Object[]{this, iInformationFlowAiApi});
            } else if (ri0.a(ri0.this) != null && ri0.b(ri0.this) == null && iInformationFlowAiApi != null) {
                ri0.c(ri0.this, iInformationFlowAiApi);
                ri0.b(ri0.this).create(ri0.d(ri0.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void j(w1e w1eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
            } else if (w1eVar != null && w1eVar.a() != null && TextUtils.equals(w1eVar.a().getString("requestType"), "coldStart")) {
            } else {
                if (ri0.b(ri0.this) != null) {
                    ri0.b(ri0.this).onDataProcessStart();
                } else {
                    ri0.e(ri0.this);
                }
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
            } else if (w1eVar != null && w1eVar.a() != null && TextUtils.equals(w1eVar.a().getString("requestType"), "coldStart")) {
            } else {
                if (ri0.b(ri0.this) != null) {
                    ri0.b(ri0.this).onDataProcess(iContainerDataModel);
                } else {
                    ri0.e(ri0.this);
                }
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
            } else if ((w1eVar == null || w1eVar.a() == null || !TextUtils.equals(w1eVar.a().getString("requestType"), "coldStart")) && ri0.b(ri0.this) != null) {
                ri0.b(ri0.this).onDataProcessFinish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IContainerDataService.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
        public Map<String, String> a(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("54f7099b", new Object[]{this, w1eVar, str});
            }
            if (!(w1eVar == null || w1eVar.a() == null)) {
                w1eVar.a().put("requestType", (Object) str);
            }
            if (TextUtils.equals(str, "coldStart")) {
                return null;
            }
            HashMap hashMap = new HashMap(8);
            if (ri0.b(ri0.this) != null) {
                ri0.b(ri0.this).onRequestParamProcess(hashMap);
            } else {
                ri0.e(ri0.this);
            }
            ri0.f(ri0.this, hashMap);
            return hashMap;
        }
    }

    static {
        t2o.a(491782280);
    }

    public ri0(cfc cfcVar) {
        this.f = cfcVar;
        n(cfcVar);
    }

    public static /* synthetic */ IContainerDataService a(ri0 ri0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService) ipChange.ipc$dispatch("8c6c23fa", new Object[]{ri0Var});
        }
        return ri0Var.b;
    }

    public static /* synthetic */ IInformationFlowAiApi b(ri0 ri0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInformationFlowAiApi) ipChange.ipc$dispatch("48843b1f", new Object[]{ri0Var});
        }
        return ri0Var.f27393a;
    }

    public static /* synthetic */ IInformationFlowAiApi c(ri0 ri0Var, IInformationFlowAiApi iInformationFlowAiApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInformationFlowAiApi) ipChange.ipc$dispatch("fb7d6db1", new Object[]{ri0Var, iInformationFlowAiApi});
        }
        ri0Var.f27393a = iInformationFlowAiApi;
        return iInformationFlowAiApi;
    }

    public static /* synthetic */ cfc d(ri0 ri0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("9f9b72da", new Object[]{ri0Var});
        }
        return ri0Var.f;
    }

    public static /* synthetic */ void e(ri0 ri0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2961c66b", new Object[]{ri0Var});
        } else {
            ri0Var.i();
        }
    }

    public static /* synthetic */ void f(ri0 ri0Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1925dd9", new Object[]{ri0Var, map});
        } else {
            ri0Var.g(map);
        }
    }

    public final void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3569e65", new Object[]{this, map});
            return;
        }
        IAiService.a aVar = this.e;
        if (aVar == null) {
            fve.e("AiProviderAdapter", "applyConfigToReqParams mAiConfig is null");
            return;
        }
        IAiService.IApiInfo a2 = aVar.a();
        if (a2 != null) {
            fve.e("AiProviderAdapter", "使用自定义的 Api:" + a2.getApi() + ", version:" + a2.getVersion());
            map.put("apiName", a2.getApi());
            map.put("apiVersion", a2.getVersion());
        }
        String b2 = this.e.b();
        if (!TextUtils.isEmpty(b2)) {
            fve.e("AiProviderAdapter", "使用自定义的 moduleVersion:" + b2);
            map.put("guessModelVersion", b2);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40bf17fe", new Object[]{this, str});
        } else if (this.f27393a != null) {
            this.f27393a.clearAiCache(str);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dcd161b", new Object[]{this});
        } else {
            bwe.f().e(this.g);
        }
    }

    public final IContainerDataService.a j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("443b5741", new Object[]{this});
        }
        return new b();
    }

    public final IContainerDataService.e k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.e) ipChange.ipc$dispatch("9c9cb41", new Object[]{this});
        }
        return new c();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (this.f27393a != null) {
            this.f27393a.onDestroy();
            this.f27393a = null;
        }
        p();
    }

    public List<BaseSectionModel<?>> m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b6d6d37", new Object[]{this, str});
        }
        if (this.f27393a == null) {
            return null;
        }
        return this.f27393a.getAiCacheCards(str);
    }

    public final void n(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8ed4d1", new Object[]{this, cfcVar});
            return;
        }
        IContainerDataService<?> iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.b = iContainerDataService;
        if (iContainerDataService != null) {
            IContainerDataService.a j = j();
            this.c = j;
            this.b.addDataProcessListener(j);
            IContainerDataService.e k = k();
            this.d = k;
            this.b.addRequestBizParamsCreator(k);
        }
    }

    public void o(IAiService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c8ff50b", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9548eb6", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService != null) {
            IContainerDataService.a aVar = this.c;
            if (aVar != null) {
                iContainerDataService.removeDataProcessListener(aVar);
                this.c = null;
            }
            IContainerDataService.e eVar = this.d;
            if (eVar != null) {
                this.b.removeRequestBizParamsCreator(eVar);
                this.d = null;
            }
            this.b = null;
        }
    }
}
