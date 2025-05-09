package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tb6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_SCROLLEXPOSE = -4629410644348754929L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseSectionModel f28611a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;

        public a(BaseSectionModel baseSectionModel, JSONObject jSONObject, float f, float f2) {
            this.f28611a = baseSectionModel;
            this.b = jSONObject;
            this.c = f;
            this.d = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                tb6.a(tb6.this, this.f28611a, this.b, this.c, this.d);
            }
        }
    }

    static {
        t2o.a(486539372);
    }

    public static /* synthetic */ void a(tb6 tb6Var, BaseSectionModel baseSectionModel, JSONObject jSONObject, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89291e80", new Object[]{tb6Var, baseSectionModel, jSONObject, new Float(f), new Float(f2)});
        } else {
            tb6Var.b(baseSectionModel, jSONObject, f, f2);
        }
    }

    public static /* synthetic */ Object ipc$super(tb6 tb6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXScrollExposeEventHandler");
    }

    public final void b(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69808ffd", new Object[]{this, baseSectionModel, jSONObject, new Float(f), new Float(f2)});
        } else if (f2 > 0.0f) {
            int ceil = (int) Math.ceil(f / f2);
            for (int i = 0; i < ceil; i++) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(i));
                if (jSONObject2 != null) {
                    BaseSectionModel createBaseSectionModel = baseSectionModel.createBaseSectionModel(jSONObject2);
                    vve.f(baseSectionModel, createBaseSectionModel);
                    vve.p(createBaseSectionModel, null);
                    if (eue.b()) {
                        fve.b("DXScrollExposeEventHandler", "expose position = " + i);
                    }
                }
            }
        }
    }

    public final float c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("192a467e", new Object[]{this, str})).floatValue();
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            fve.e("DXScrollExposeEventHandler", "getItemWidth failed: " + e);
            return 0.0f;
        }
    }

    public final float d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7426b383", new Object[]{this, str})).floatValue();
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            fve.e("DXScrollExposeEventHandler", "getItemWidth failed: " + e);
            return 0.0f;
        }
    }

    public final float e(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext, float f) {
        float f2;
        int measuredWidth;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b0869c8", new Object[]{this, dXEvent, dXRuntimeContext, new Float(f)})).floatValue();
        }
        if (dXEvent instanceof DXScrollEvent) {
            DXScrollEvent dXScrollEvent = (DXScrollEvent) dXEvent;
            measuredWidth = dXScrollEvent.getScrollerSize().f29533a + dXScrollEvent.getOffsetX();
        } else if (dXEvent instanceof DXViewEvent) {
            measuredWidth = dXRuntimeContext.W().getMeasuredWidth();
        } else {
            f2 = 0.0f;
            return f2 - f;
        }
        f2 = measuredWidth;
        return f2 - f;
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (f(objArr, dXRuntimeContext)) {
            BaseSectionModel<?> e = j18.e(dXRuntimeContext);
            if (e == null) {
                fve.e("DXScrollExposeEventHandler", "cardSection is null");
                return;
            }
            JSONObject jSONObject = (JSONObject) objArr[0];
            float c = c((String) objArr[1]);
            float d = d((String) objArr[2]);
            Context h = dXRuntimeContext.h();
            DinamicXEngine r = dXRuntimeContext.r();
            get.a().i(new a(e, jSONObject, e(dXEvent, dXRuntimeContext, pb6.d(r, h, d)), pb6.d(r, h, c)));
        }
    }

    public final boolean f(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5409bc9f", new Object[]{this, objArr, dXRuntimeContext})).booleanValue();
        }
        if (objArr == null) {
            fve.e("DXScrollExposeEventHandler", "args == null");
            return false;
        } else if (objArr.length < 3) {
            fve.e("DXScrollExposeEventHandler", "args.length < 3");
            return false;
        } else if (!(objArr[0] instanceof JSONObject) || !(objArr[1] instanceof String) || !(objArr[2] instanceof String)) {
            fve.e("DXScrollExposeEventHandler", "参数不符合格式");
            return false;
        } else if (dXRuntimeContext != null) {
            return dXRuntimeContext.h() != null;
        } else {
            fve.e("DXScrollExposeEventHandler", "runtimeContext == null");
            return false;
        }
    }
}
