package tb;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SubItemModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.hfc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c16 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HOPENURL = 3191997408029463605L;

    /* renamed from: a  reason: collision with root package name */
    public long f16767a = 0;
    public List<String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements hfc.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f16768a;
        public final Fragment b;
        public boolean c;

        static {
            t2o.a(486539363);
            t2o.a(486539309);
        }

        public a(Bundle bundle, Bundle bundle2, int i, Fragment fragment) {
            this.f16768a = bundle2;
            this.b = fragment;
        }

        @Override // tb.hfc.b
        public Fragment a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("bc1dab59", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.hfc.b
        public Bundle b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("d234f1f3", new Object[]{this});
            }
            return null;
        }

        @Override // tb.hfc.b
        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1b50d93f", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34fb4e37", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }

        @Override // tb.hfc.b
        public Bundle getExtras() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this});
            }
            return this.f16768a;
        }

        @Override // tb.hfc.b
        public int getRequestCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4ae49d60", new Object[]{this})).intValue();
            }
            return 0;
        }
    }

    static {
        t2o.a(486539362);
    }

    public static /* synthetic */ Object ipc$super(c16 c16Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXInfoflowHOpenUrlEventHandler");
    }

    public final Context a(View view) {
        Context b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ca099919", new Object[]{this, view});
        }
        Context context = view.getContext();
        if (!(context instanceof bew) || (b = ((bew) context).b()) == null) {
            return context;
        }
        return b;
    }

    public final Fragment b(cfc cfcVar) {
        IHostService iHostService;
        u5d j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("d3ff323", new Object[]{this, cfcVar});
        }
        if (cfcVar == null || (iHostService = (IHostService) cfcVar.a(IHostService.class)) == null || (j = iHostService.getInvokeCallback().j()) == null) {
            return null;
        }
        return j.a();
    }

    public final Context c(cfc cfcVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b50b9d0c", new Object[]{this, cfcVar, view});
        }
        IHostService iHostService = (IHostService) cfcVar.a(IHostService.class);
        if (iHostService == null) {
            return a(view);
        }
        u5d j = iHostService.getInvokeCallback().j();
        if (j == null) {
            return a(view);
        }
        Context f = j.f();
        if (f == null) {
            return a(view);
        }
        return f;
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61acc07a", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.b == null) {
            this.b = new ArrayList();
            String h = f4b.h("homepageNavSimpleProcessorUrls", "");
            if (TextUtils.isEmpty(h)) {
                return false;
            }
            String[] split = h.split(",");
            if (split.length > 0) {
                this.b.addAll(Arrays.asList(split));
            }
        }
        for (String str2 : this.b) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final void f(cfc cfcVar, BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfca1cb", new Object[]{this, cfcVar, baseSectionModel, baseSubItemModel, bundle, str});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) cfcVar.a(IDxItemClickService.class);
        if (iDxItemClickService != null) {
            iDxItemClickService.onNav(baseSectionModel, baseSubItemModel, bundle, str);
        }
    }

    public final void g(cfc cfcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27cbaf71", new Object[]{this, cfcVar, new Boolean(z)});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) cfcVar.a(IDxItemClickService.class);
        if (iDxItemClickService != null) {
            iDxItemClickService.onNavFinished(z);
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
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (SystemClock.uptimeMillis() - this.f16767a >= 800) {
            this.f16767a = SystemClock.uptimeMillis();
            if (objArr != null && objArr.length >= 1) {
                Object obj = objArr[0];
                if (!(obj instanceof String)) {
                    bqa.d("DXHOpenUrlEventHandler", " 传进来的值不是String类型");
                    return;
                }
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    bqa.d("DXHOpenUrlEventHandler", "targetUrl is empty");
                    return;
                }
                BaseSectionModel<?> e = j18.e(dXRuntimeContext);
                if (e == null) {
                    bqa.d("DXHOpenUrlEventHandler", "section is null");
                    return;
                }
                String a2 = hov.a(str, e.getSectionBizCode());
                cfc c = j18.c(dXRuntimeContext);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("targetUrl", (Object) a2);
                e(c, e, new SubItemModel(jSONObject), a2, dXRuntimeContext.D());
            }
        }
    }

    public void e(cfc cfcVar, BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, String str, View view) {
        Bundle bundle;
        String str2;
        String str3 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e6ef32f", new Object[]{this, cfcVar, baseSectionModel, baseSubItemModel, str3, view});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) cfcVar.a(IDxItemClickService.class);
        if (iDxItemClickService != null) {
            str3 = iDxItemClickService.assembleBizParamsToTargetUrl(baseSectionModel, baseSubItemModel, str3);
        }
        String k = bve.k(true);
        fve.e("DXHOpenUrlEventHandler", "homeNavFastSwitchListStr:" + k);
        String l = bve.l(true);
        fve.e("DXHOpenUrlEventHandler", "homeNavTppSwitchListStr:" + l);
        boolean c = bve.c(k, l);
        Bundle bundle2 = new Bundle();
        Pair<String, String> h = r4b.h();
        peu peuVar = null;
        if (!c || r4b.C(h)) {
            peuVar = r4b.q(baseSubItemModel, str3, false);
            if (peuVar == null) {
                peuVar = peu.b(-1);
            }
            bundle = bundle2;
            r4b.z(cfcVar, baseSubItemModel, bundle2, view, peuVar, str3);
            str2 = "forceShare";
        } else {
            str2 = "skipTrans";
            bundle = bundle2;
        }
        bundle.putString("extraFrameAnimType", str2);
        f(cfcVar, baseSectionModel, baseSubItemModel, bundle, str3);
        if (!c && peuVar == null) {
            w3h.a(baseSectionModel, baseSubItemModel, bundle, view);
        }
        a aVar = new a(null, bundle, 0, b(cfcVar));
        Context c2 = c(cfcVar, view);
        if (d(str3)) {
            aVar.d(true);
        }
        if (peuVar != null ? !jve.g(c2, aVar, str3, view, peuVar) : !jve.h(c2, aVar, str3, view, false)) {
            g(cfcVar, false);
            return;
        }
        fve.e("DXHOpenUrlEventHandler", "默认转场动画");
        g(cfcVar, true);
    }
}
