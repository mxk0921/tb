package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.kg;
import tb.ns;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lk extends ns {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends pt<AURAParseIO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(81788985);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/asyncModule/request/AURANextRPCAsyncModuleRequest$InnerNextRPCRequestCallback");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            ns.a aVar = lk.this.c;
            if (aVar != null) {
                ((kg.a) aVar).f(miVar.b(), miVar.e());
            }
        }

        @Override // tb.pt
        public void c(yk<AURAParseIO> ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
            } else if (!(ykVar.b() instanceof AURAParseIO)) {
                b(new mi(0, "AURANextRPCServiceDomain", "-2000_REQUEST_EXCEPTION", "AsyncRequestCallback.onNext:response invalid"));
            } else {
                List<rl> data = ykVar.b().getData();
                if (data.isEmpty()) {
                    b(new mi(0, "AURANextRPCServiceDomain", "-2000_REQUEST_EXCEPTION", "AsyncRequestCallback.onNext:responseDataList is empty"));
                    return;
                }
                JSONObject b = data.get(0).b();
                if (b == null) {
                    b(new mi(0, "AURANextRPCServiceDomain", "-2000_REQUEST_EXCEPTION", "AsyncRequestCallback.onNext:responseData is null"));
                    return;
                }
                ns.a aVar = lk.this.c;
                if (aVar != null) {
                    ((kg.a) aVar).g(b);
                }
            }
        }
    }

    static {
        t2o.a(81788983);
    }

    public lk(nbb nbbVar, AURARenderComponent aURARenderComponent, AsyncModule asyncModule, ns.a aVar) {
        this.f24916a = nbbVar;
        this.b = asyncModule;
        this.c = aVar;
    }

    public static /* synthetic */ Object ipc$super(lk lkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/asyncModule/request/AURANextRPCAsyncModuleRequest");
    }

    public final AURANextRPCEndpoint a(AsyncModule.MTopConfigModel mTopConfigModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("ff22c912", new Object[]{this, mTopConfigModel});
        }
        if (mTopConfigModel == null || TextUtils.isEmpty(mTopConfigModel.apiMethod) || TextUtils.isEmpty(mTopConfigModel.apiVersion)) {
            return null;
        }
        AURANextRPCEndpoint.a aVar = new AURANextRPCEndpoint.a();
        aVar.z(mTopConfigModel.apiMethod);
        aVar.V(mTopConfigModel.apiVersion);
        if (mTopConfigModel.requestData != null) {
            HashMap hashMap = new HashMap();
            for (String str : mTopConfigModel.requestData.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, mTopConfigModel.requestData.getString(str));
                }
            }
            aVar.I(hashMap);
        }
        return aVar.B();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29197e0b", new Object[]{this});
            return;
        }
        AURANextRPCEndpoint a2 = a(this.b.mtopConfigModel);
        if (a2 == null) {
            ck.g().b("AURANextRPCAsyncModuleRequest", "innerHandleEvent", "bad endpoint");
        } else {
            this.f24916a.c("aura.workflow.request", new AURANextRPCIO("", a2), new b());
        }
    }
}
