package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kc5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_APPEAREXPOSE = -1980042490983877383L;

    /* renamed from: a  reason: collision with root package name */
    public IMainLifecycleService f22557a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseSectionModel f22558a;
        public final /* synthetic */ JSONObject b;

        public a(BaseSectionModel baseSectionModel, JSONObject jSONObject) {
            this.f22558a = baseSectionModel;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vve.p(this.f22558a, this.b);
            }
        }
    }

    static {
        t2o.a(486539343);
    }

    public static /* synthetic */ Object ipc$super(kc5 kc5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXAppearExposeEventHandler");
    }

    public final boolean a(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("752687df", new Object[]{this, iMainLifecycleService})).booleanValue();
        }
        if (iMainLifecycleService != null) {
            return iMainLifecycleService.isSelect();
        }
        fve.e("DXAppearExposeEventHandler", "isSelect sceneService == null");
        return true;
    }

    public final BaseSectionModel<?> b(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("7d01db2e", new Object[]{this, dXRuntimeContext, jSONObject});
        }
        BaseSectionModel<?> e = j18.e(dXRuntimeContext);
        if (e == null) {
            fve.e("DXAppearExposeEventHandler", "sectionModel == null");
            return null;
        }
        BaseSectionModel<?> createBaseSectionModel = e.createBaseSectionModel(jSONObject);
        vve.f(e, createBaseSectionModel);
        return createBaseSectionModel;
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 1) {
            Object obj = objArr[0];
            if (obj instanceof JSONObject) {
                cfc c = j18.c(dXRuntimeContext);
                if (c == null) {
                    fve.e("DXAppearExposeEventHandler", "infoFlowContext is null");
                    return;
                }
                if (this.f22557a == null) {
                    this.f22557a = (IMainLifecycleService) c.a(IMainLifecycleService.class);
                }
                JSONObject jSONObject = new JSONObject();
                if (objArr.length == 2) {
                    jSONObject.put("skipCheck", (Object) Boolean.valueOf(!TypeUtils.castToBoolean(objArr[1]).booleanValue()));
                }
                if (a(this.f22557a)) {
                    get.a().i(new a(b(dXRuntimeContext, (JSONObject) obj), jSONObject));
                }
            }
        }
    }
}
