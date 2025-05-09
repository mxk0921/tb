package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hz5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HPAGECHANGEEXPOSE = -5738105571919564880L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f20980a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Object[] c;

        public a(DXRuntimeContext dXRuntimeContext, int i, Object[] objArr) {
            this.f20980a = dXRuntimeContext;
            this.b = i;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BaseSectionModel<?> e = j18.e(this.f20980a);
            if (e == null) {
                fve.e("DXHPageChangeExposeEventHandler", "sectionModel is null");
                return;
            }
            JSONObject a2 = hz5.a(hz5.this, this.b, this.c);
            if (a2 == null) {
                fve.e("DXHPageChangeExposeEventHandler", "pageSection is null");
                return;
            }
            vve.p(e.createBaseSectionModel(a2), null);
            hz5.b(hz5.this, e, a2);
        }
    }

    static {
        t2o.a(486539355);
    }

    public static /* synthetic */ JSONObject a(hz5 hz5Var, int i, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2e2eb9da", new Object[]{hz5Var, new Integer(i), objArr});
        }
        return hz5Var.f(i, objArr);
    }

    public static /* synthetic */ void b(hz5 hz5Var, BaseSectionModel baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f19d09b", new Object[]{hz5Var, baseSectionModel, jSONObject});
        } else {
            hz5Var.g(baseSectionModel, jSONObject);
        }
    }

    public static /* synthetic */ Object ipc$super(hz5 hz5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXHPageChangeExposeEventHandler");
    }

    public final void c(DXRuntimeContext dXRuntimeContext, int i, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2e13e2", new Object[]{this, dXRuntimeContext, new Integer(i), objArr});
        } else {
            get.a().i(new a(dXRuntimeContext, i, objArr));
        }
    }

    public final String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfef20c8", new Object[]{this, new Integer(i)});
        }
        try {
            return String.valueOf(i);
        } catch (Exception e) {
            fve.e("DXHPageChangeExposeEventHandler", "index parse error: " + e);
            return null;
        }
    }

    public final int e(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c88397a", new Object[]{this, dXEvent, dXRuntimeContext})).intValue();
        }
        if (dXEvent instanceof DXPageChangeEvent) {
            return ((DXPageChangeEvent) dXEvent).pageIndex;
        }
        if (dXRuntimeContext.W() instanceof DXSliderLayout) {
            return ((DXSliderLayout) dXRuntimeContext.W()).getPageIndex();
        }
        return -1;
    }

    public final JSONObject f(int i, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b4ea3995", new Object[]{this, new Integer(i), objArr});
        }
        return ((JSONObject) objArr[0]).getJSONObject(d(i));
    }

    public final void g(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d44863", new Object[]{this, baseSectionModel, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            fve.e("DXHPageChangeExposeEventHandler", "independentExpose, itemList is empty");
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            Object value = entry.getValue();
            if (!(value instanceof JSONObject)) {
                fve.e("DXHPageChangeExposeEventHandler", "当前入参异常");
                if (value == null) {
                    obj = "";
                } else {
                    obj = value.toString();
                }
                tve.b("pageChangeExposeFailure", "", "1.0", "Page_Home", null, null, null, obj);
            } else {
                vve.p(baseSectionModel.createBaseSectionModel((JSONObject) entry.getValue()), null);
            }
        }
    }

    public final void h(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfaf8345", new Object[]{this, dXEvent, objArr, dXRuntimeContext, new Integer(i)});
        } else if (objArr.length > 1 && (objArr[1] instanceof String)) {
            new sz5().handleEvent(dXEvent, new Object[]{String.valueOf(objArr[1]), d(i)}, dXRuntimeContext);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || !(objArr[0] instanceof JSONObject)) {
            fve.e("DXHPageChangeExposeEventHandler", "args == null");
        } else {
            int e = e(dXEvent, dXRuntimeContext);
            if (e == -1) {
                fve.e("DXHPageChangeExposeEventHandler", "pageIndex is -1");
                return;
            }
            c(dXRuntimeContext, e, objArr);
            h(dXEvent, objArr, dXRuntimeContext, e);
        }
    }
}
