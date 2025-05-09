package tb;

import android.app.Application;
import android.text.TextUtils;
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
public class g16 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TRACKEXPOSE = 2989037286431506580L;

    /* renamed from: a  reason: collision with root package name */
    public IMainLifecycleService f19674a;

    static {
        t2o.a(486539365);
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2680c113", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            fve.m("DXTrackExposeEventHandler", "commitEvent trackParams == null || trackParams.isEmpty()");
        } else if (!jSONObject.containsKey("page") || !jSONObject.containsKey("eventId")) {
            fve.m("DXTrackExposeEventHandler", "commitEvent 缺少埋点必要参数");
        } else {
            String b = lve.b(jSONObject, jSONObject2, "page");
            String b2 = lve.b(jSONObject, jSONObject2, "eventId");
            String b3 = lve.b(jSONObject, jSONObject2, "arg1");
            String b4 = lve.b(jSONObject, jSONObject2, "arg2");
            String b5 = lve.b(jSONObject, jSONObject2, "arg3");
            JSONObject a2 = lve.a(jSONObject, jSONObject2, "args");
            vve.i(b3, a2);
            vve.c(a2);
            if (a2 != null) {
                a2.put("client_ts", (Object) Long.valueOf(System.currentTimeMillis()));
            }
            uve.a(b, Integer.parseInt(b2), b3, b4, b5, vve.x(b, a2));
            if (a2 == null) {
                str = "";
            } else {
                str = a2.getString("ifs");
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("args");
            if (jSONObject3 == null || !TextUtils.equals(jSONObject3.getString("brandAd"), "1")) {
                Application a3 = eue.a();
                if (!TextUtils.isEmpty(str) && a3 != null) {
                    due.a(a3, str, null, null, null);
                    uve.a("Page_Extend", 19999, "info_flow_commit_ifs", "microservice", b, "2");
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(g16 g16Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXInfoflowTrackExposeEventHandler");
    }

    public final void c(JSONObject jSONObject, String str, JSONObject jSONObject2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb42a1d", new Object[]{this, jSONObject, str, jSONObject2, dXRuntimeContext});
            return;
        }
        String[] split = str.split("\\.");
        if (split == null || split.length == 0) {
            bqa.d("DXTrackExposeEventHandler", "parts is empty");
            return;
        }
        JSONObject e = lve.e(split, str, jSONObject);
        if (e == null) {
            bqa.d("DXTrackExposeEventHandler", "exposureUtParam == null");
        } else if (e.getBooleanValue("isTracked")) {
            bqa.d("DXTrackExposeEventHandler", "这份数据曝光过了");
        } else {
            e.put("page", (Object) "Page_Home");
            e.put("eventId", (Object) "2201");
            BaseSectionModel<?> e2 = j18.e(dXRuntimeContext);
            if (e2 != null) {
                vve.u(e, e2.getArgs());
            }
            JSONObject jSONObject3 = e.getJSONObject("args");
            if (jSONObject3 != null) {
                jtv.b(jSONObject3);
            }
            if ((jSONObject2 != null && jSONObject2.getBooleanValue("skipCheck")) || !e.getBooleanValue("isTracked")) {
                e.put("isTracked", (Object) Boolean.TRUE);
                b(e, jSONObject2);
            }
        }
    }

    public final boolean d(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("752687df", new Object[]{this, iMainLifecycleService})).booleanValue();
        }
        if (iMainLifecycleService != null) {
            return iMainLifecycleService.isSelect();
        }
        fve.e("DXTrackExposeEventHandler", "isSelect sceneService == null");
        return true;
    }

    public final /* synthetic */ void e(JSONObject jSONObject, String str, JSONObject jSONObject2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16cbbe31", new Object[]{this, jSONObject, str, jSONObject2, dXRuntimeContext});
        } else {
            c(jSONObject, str, jSONObject2, dXRuntimeContext);
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

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 2) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (!(obj2 instanceof String) || !(obj instanceof JSONObject)) {
                bqa.d("DXTrackExposeEventHandler", "arg1不是string类型或者arg0不是JSONObject");
                return;
            }
            cfc c = j18.c(dXRuntimeContext);
            if (c == null) {
                fve.e("DXTrackExposeEventHandler", "infoFlowContext is null");
                return;
            }
            if (this.f19674a == null) {
                this.f19674a = (IMainLifecycleService) c.a(IMainLifecycleService.class);
            }
            if (this.f19674a != null) {
                final JSONObject jSONObject = new JSONObject();
                if (objArr.length == 3) {
                    jSONObject.put("skipCheck", (Object) Boolean.valueOf(!TypeUtils.castToBoolean(objArr[1]).booleanValue()));
                }
                if (d(this.f19674a)) {
                    final JSONObject jSONObject2 = (JSONObject) obj;
                    final String str = (String) obj2;
                    get.a().i(new Runnable() { // from class: tb.f16
                        @Override // java.lang.Runnable
                        public final void run() {
                            g16.this.e(jSONObject2, str, jSONObject, dXRuntimeContext);
                        }
                    });
                }
            }
        }
    }
}
