package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.utils.HomeOptimizeUtils;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b06 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HTABCLICK = 9099102174121718126L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements HomeOptimizeUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXEvent f16110a;
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ DXRuntimeContext c;

        public a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.f16110a = dXEvent;
            this.b = objArr;
            this.c = dXRuntimeContext;
        }

        @Override // com.taobao.homepage.utils.HomeOptimizeUtils.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39174778", new Object[]{this});
            } else {
                b06.a(b06.this, this.f16110a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(729809018);
    }

    public static /* synthetic */ void a(b06 b06Var, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3d6fcb", new Object[]{b06Var, dXEvent, objArr, dXRuntimeContext});
        } else {
            b06Var.b(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public static /* synthetic */ Object ipc$super(b06 b06Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/eventhandler/DXHTabClickEventHandler");
    }

    public final void b(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4835b2a5", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                r5a.d(dXRuntimeContext.i(), jSONObject);
                IHomeViewService iHomeViewService = (IHomeViewService) c4b.i().h(IHomeViewService.class);
                if (iHomeViewService != null) {
                    iHomeViewService.selectTab(jSONObject);
                }
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else {
            HomeOptimizeUtils.a(dXRuntimeContext.h(), new a(dXEvent, objArr, dXRuntimeContext));
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}
