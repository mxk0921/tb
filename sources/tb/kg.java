package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.ns;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.asyncMR")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class kg extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_EXT_PARAMS_ASYNC_MODULE = "asyncModule";
    public static final String EVENT_TYPE = "asyncMR";
    public AURAGlobalData e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements ns.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final nbb f22641a;
        public final AURARenderComponent b;
        public final AsyncModule c;
        public final AURAGlobalData d;

        static {
            t2o.a(81788965);
            t2o.a(81788987);
        }

        public a(nbb nbbVar, AURARenderComponent aURARenderComponent, AsyncModule asyncModule, AURAGlobalData aURAGlobalData) {
            this.f22641a = nbbVar;
            this.b = aURARenderComponent;
            this.c = asyncModule;
            this.d = aURAGlobalData;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(boolean r7) {
            /*
                r6 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = tb.kg.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x001a
                java.lang.Boolean r1 = new java.lang.Boolean
                r1.<init>(r7)
                r7 = 2
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r2 = 0
                r7[r2] = r6
                r2 = 1
                r7[r2] = r1
                java.lang.String r1 = "ea36c5b0"
                r0.ipc$dispatch(r1, r7)
                return
            L_0x001a:
                if (r7 == 0) goto L_0x0029
                com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule r7 = r6.c
                com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule$RModel r7 = r7.r
                if (r7 == 0) goto L_0x0036
                com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule$ResponseCallbackModel r7 = r7.successCallback
                if (r7 == 0) goto L_0x0036
                java.util.List<com.alibaba.fastjson.JSONObject> r7 = r7.events
                goto L_0x0037
            L_0x0029:
                com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule r7 = r6.c
                com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule$RModel r7 = r7.r
                if (r7 == 0) goto L_0x0036
                com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule$ResponseCallbackModel r7 = r7.failedCallback
                if (r7 == 0) goto L_0x0036
                java.util.List<com.alibaba.fastjson.JSONObject> r7 = r7.events
                goto L_0x0037
            L_0x0036:
                r7 = 0
            L_0x0037:
                if (r7 != 0) goto L_0x003a
                return
            L_0x003a:
                java.util.Iterator r7 = r7.iterator()
            L_0x003e:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto L_0x0089
                java.lang.Object r0 = r7.next()
                com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
                if (r0 != 0) goto L_0x004d
                goto L_0x003e
            L_0x004d:
                java.lang.String r1 = "type"
                java.lang.String r1 = r0.getString(r1)
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 == 0) goto L_0x005b
                goto L_0x003e
            L_0x005b:
                tb.qi r2 = new tb.qi
                r2.<init>()
                com.alibaba.android.aura.datamodel.render.AURARenderComponent r3 = r6.b
                r2.t(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = ""
                r3.<init>(r4)
                long r4 = java.lang.System.currentTimeMillis()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.p(r3)
                java.lang.String r3 = "fields"
                com.alibaba.fastjson.JSONObject r0 = r0.getJSONObject(r3)
                r2.n(r0)
                tb.nbb r0 = r6.f22641a
                tb.pi.b(r0, r1, r2)
                goto L_0x003e
            L_0x0089:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.kg.a.a(boolean):void");
        }

        public final boolean b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("354d0493", new Object[]{this, jSONObject, str})).booleanValue();
            }
            if (TextUtils.isEmpty(str) || !str.matches("^\\$\\{.+\\}$")) {
                return false;
            }
            try {
                return e19.g(str, jSONObject);
            } catch (Exception e) {
                ck.g().b("AURAAsyncModuleEvent", "filterByVIf", e.toString());
                return true;
            }
        }

        public final AURARenderComponent c(String str) {
            List list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURARenderComponent) ipChange.ipc$dispatch("4843d84a", new Object[]{this, str});
            }
            if (this.d != null && !TextUtils.isEmpty(str) && (list = (List) this.d.get("render_view_item_models", List.class)) != null && !list.isEmpty()) {
                for (Object obj : list) {
                    if (obj instanceof AURARenderComponent) {
                        AURARenderComponent aURARenderComponent = (AURARenderComponent) obj;
                        if (TextUtils.equals(aURARenderComponent.key, str)) {
                            return aURARenderComponent;
                        }
                    }
                }
            }
            return null;
        }

        public final rxu d(JSONObject jSONObject, List<AsyncModule.KVMapping> list, AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rxu) ipChange.ipc$dispatch("37f783eb", new Object[]{this, jSONObject, list, aURARenderComponent});
            }
            JSONObject jSONObject2 = new JSONObject();
            if (list != null && !list.isEmpty()) {
                jSONObject2.put("kvmap", JSON.toJSON(list));
            }
            jSONObject2.put("data", (Object) jSONObject);
            return an.a("kvmap", aURARenderComponent, jSONObject2);
        }

        public final rxu e(boolean z, AsyncModule.RModel rModel, AURARenderComponent aURARenderComponent) {
            AsyncModule.ResponseCallbackModel responseCallbackModel;
            JSONObject jSONObject;
            AsyncModule.ResponseCallbackModel responseCallbackModel2;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rxu) ipChange.ipc$dispatch("30d5153c", new Object[]{this, new Boolean(z), rModel, aURARenderComponent});
            }
            JSONObject jSONObject3 = new JSONObject();
            if (z) {
                if (!(rModel == null || (responseCallbackModel2 = rModel.successCallback) == null || (jSONObject2 = responseCallbackModel2.payload) == null)) {
                    jSONObject3.putAll(jSONObject2);
                }
            } else if (!(rModel == null || (responseCallbackModel = rModel.failedCallback) == null || (jSONObject = responseCallbackModel.payload) == null)) {
                jSONObject3.putAll(jSONObject);
            }
            return an.a(RuleType.PROPS_WRITE_BACK, aURARenderComponent, jSONObject3);
        }

        public void f(String str, String str2) {
            AURARenderComponent c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(e(false, this.c.r, this.b));
            List<AsyncModule.RelateComponent> list = this.c.relateComponents;
            if (list != null && !list.isEmpty()) {
                for (AsyncModule.RelateComponent relateComponent : this.c.relateComponents) {
                    if (!(relateComponent == null || (c = c(relateComponent.target)) == null)) {
                        arrayList.add(e(false, relateComponent.r, c));
                    }
                }
            }
            this.f22641a.c("aura.workflow.adjustRules", new UMFRuleIO(arrayList), null);
            a(false);
        }

        public void g(JSONObject jSONObject) {
            AURARenderComponent c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else if (b(jSONObject, this.c.condition)) {
                f("AURANextRPCServiceDomain", "filter by vif");
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(d(jSONObject, this.c.kvMappings, this.b));
                arrayList.add(e(true, this.c.r, this.b));
                List<AsyncModule.RelateComponent> list = this.c.relateComponents;
                if (list != null && !list.isEmpty()) {
                    for (AsyncModule.RelateComponent relateComponent : this.c.relateComponents) {
                        if (!(relateComponent == null || (c = c(relateComponent.target)) == null)) {
                            if (b(jSONObject, relateComponent.condition)) {
                                arrayList.add(e(false, relateComponent.r, c));
                            } else {
                                arrayList.add(d(jSONObject, relateComponent.kvMappings, c));
                                arrayList.add(e(true, relateComponent.r, c));
                            }
                        }
                    }
                }
                this.f22641a.c("aura.workflow.adjustRules", new UMFRuleIO(arrayList), null);
                a(true);
            }
        }
    }

    static {
        t2o.a(81788964);
    }

    public static /* synthetic */ Object ipc$super(kg kgVar, String str, Object... objArr) {
        if (str.hashCode() == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/asyncModule/event/AURAAsyncModuleEvent");
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        nbb c = J0().c();
        if (c == null) {
            ck.g().b("AURAAsyncModuleEvent", "innerHandleEvent", "auraInstance is null");
            return;
        }
        qi eventModel = aURAEventIO.getEventModel();
        AURARenderComponent j = eventModel.j();
        if (j == null) {
            ck.g().b("AURAAsyncModuleEvent", "innerHandleEvent", "component is null");
            return;
        }
        AsyncModule asyncModule = (AsyncModule) eventModel.g(EVENT_EXT_PARAMS_ASYNC_MODULE);
        if (asyncModule == null) {
            ck.g().b("AURAAsyncModuleEvent", "innerHandleEvent", "asyncModule is null");
        } else {
            new lk(c, j, asyncModule, new a(c, j, asyncModule, this.e)).b();
        }
    }

    @Override // tb.ws, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.e = aURAGlobalData;
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return EVENT_TYPE;
    }
}
