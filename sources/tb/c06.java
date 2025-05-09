package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.utils.HomeOptimizeUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c06 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HTAP = 34696035233L;
    public static final String TAG = "hTap";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements HomeOptimizeUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXEvent f16750a;
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ DXRuntimeContext c;

        public a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.f16750a = dXEvent;
            this.b = objArr;
            this.c = dXRuntimeContext;
        }

        @Override // com.taobao.homepage.utils.HomeOptimizeUtils.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39174778", new Object[]{this});
            } else {
                c06.a(c06.this, this.f16750a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(729809020);
    }

    public static /* synthetic */ void a(c06 c06Var, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f08c19f", new Object[]{c06Var, dXEvent, objArr, dXRuntimeContext});
        } else {
            c06Var.b(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public static /* synthetic */ Object ipc$super(c06 c06Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/eventhandler/DXHTapEvent");
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

    public final void b(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4835b2a5", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length < 1) {
            fve.e(TAG, "args == null || args.length < 1");
        } else {
            Object obj = objArr[0];
            DXRootView L = dXRuntimeContext.L();
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                x9u.L(jSONObject);
                Context f = s38.f(L);
                s38.c(dXRuntimeContext, jSONObject);
                fve.e(TAG, "准备处理点击跳转事件");
                String string = jSONObject.getString("targetUrl");
                if (string == null) {
                    string = "";
                }
                s2b.c().j(string);
                boolean a2 = oyh.a(f, jSONObject);
                if (a2) {
                    p2b.n(true);
                }
                s2b.c().k(a2);
                fct.a(jSONObject);
                s2b.c().b().b(jSONObject);
                sbq.b(jSONObject);
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 1) {
            dXRuntimeContext.i();
            Object obj = objArr[0];
            dXRuntimeContext.L();
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    nms.i(jSONObject.getString("itemBizCode"), jSONObject.getString("targetUrl"));
                } catch (Throwable unused) {
                }
            }
        }
    }
}
