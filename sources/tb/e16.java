package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IGlobalSceneUtPassService;
import com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SubItemModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e16 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TRACKCLICK = -1826592666711771899L;

    /* renamed from: a  reason: collision with root package name */
    public long f18202a = 0;

    static {
        t2o.a(486539364);
    }

    public static /* synthetic */ Object ipc$super(e16 e16Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXInfoflowTrackClickEventHandler");
    }

    public final void b(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7e42b4", new Object[]{this, baseSectionModel, jSONObject});
            return;
        }
        JSONObject args = baseSectionModel.getArgs();
        if (args != null && TextUtils.equals("1", args.getString(jtv.S_ARGS_IS_CLIENT_CACHE)) && (jSONObject2 = jSONObject.getJSONObject("args")) != null) {
            jSONObject2.put(jtv.S_ARGS_IS_CLIENT_CACHE, "1");
        }
    }

    public final void c(JSONObject jSONObject, String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821d567", new Object[]{this, jSONObject, str, dXRuntimeContext});
            return;
        }
        String[] split = str.split("\\.");
        if (split.length <= 0) {
            bqa.d(ij6.TAG, "长度小于等于0");
            return;
        }
        JSONObject e = lve.e(split, str, jSONObject);
        if (e == null) {
            bqa.d(ij6.TAG, "clickUtParam == null");
            return;
        }
        e.put("page", "Page_Home");
        e.put("eventId", "2101");
        BaseSectionModel<?> e2 = j18.e(dXRuntimeContext);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("clickParam", (Object) e);
        SubItemModel subItemModel = new SubItemModel(jSONObject2);
        DXRootView L = dXRuntimeContext.L();
        cfc c = j18.c(dXRuntimeContext);
        if (e2 != null && c != null && L != null) {
            b(e2, e);
            f(c, e2, subItemModel, L);
            g(c);
            h(c, e2, subItemModel, L);
        }
    }

    public final void d(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc1c1b6", new Object[]{this, cfcVar});
            return;
        }
        ISmartBackRefreshService iSmartBackRefreshService = (ISmartBackRefreshService) cfcVar.a(ISmartBackRefreshService.class);
        if (iSmartBackRefreshService != null) {
            iSmartBackRefreshService.setDirectClickInInfoFlow(true);
        }
    }

    public final /* synthetic */ void e(JSONObject jSONObject, String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c44d463", new Object[]{this, jSONObject, str, dXRuntimeContext});
        } else {
            c(jSONObject, str, dXRuntimeContext);
        }
    }

    public final void f(cfc cfcVar, BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448d6d73", new Object[]{this, cfcVar, baseSectionModel, baseSubItemModel, view});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) cfcVar.a(IDxItemClickService.class);
        if (iDxItemClickService != null) {
            iDxItemClickService.click(baseSectionModel, baseSubItemModel, view);
        }
    }

    public void g(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a9eee8", new Object[]{this, cfcVar});
        } else {
            d(cfcVar);
        }
    }

    public final void h(cfc cfcVar, BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e910eabb", new Object[]{this, cfcVar, baseSectionModel, baseSubItemModel, view});
            return;
        }
        IGlobalSceneUtPassService iGlobalSceneUtPassService = (IGlobalSceneUtPassService) cfcVar.a(IGlobalSceneUtPassService.class);
        if (iGlobalSceneUtPassService != null) {
            iGlobalSceneUtPassService.onClick(baseSubItemModel);
        }
        vve.l(cfcVar, view, baseSectionModel, baseSubItemModel, null);
        hue.b(baseSectionModel, baseSubItemModel);
        due.b(baseSubItemModel.getClickParam());
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (SystemClock.uptimeMillis() - this.f18202a >= 800) {
            this.f18202a = SystemClock.uptimeMillis();
            if (objArr != null && objArr.length >= 2) {
                Object obj = objArr[0];
                Object obj2 = objArr[1];
                if (!(obj2 instanceof String) || !(obj instanceof JSONObject)) {
                    bqa.d(ij6.TAG, "arg1不是string类型或者arg0不是JSONObject");
                    return;
                }
                final JSONObject jSONObject = (JSONObject) obj;
                final String str = (String) obj2;
                get.a().i(new Runnable() { // from class: tb.d16
                    @Override // java.lang.Runnable
                    public final void run() {
                        e16.this.e(jSONObject, str, dXRuntimeContext);
                    }
                });
            }
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
