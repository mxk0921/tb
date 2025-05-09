package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.nh;

/* compiled from: Taobao */
@AURAExtensionImpl(code = kh.EXTENSION_CODE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class kh extends rs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTENSION_CODE = "aura.impl.render.component.creator.dx";

    static {
        t2o.a(81789000);
    }

    public static /* synthetic */ Object ipc$super(kh khVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1702399350:
                khVar.g((AURARenderComponent) objArr[0], (View) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case -1504501726:
                khVar.onDestroy();
                return null;
            case -1224720012:
                return khVar.l((AURARenderComponent) objArr[0]);
            case -1162528052:
                khVar.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
                return null;
            case -25033014:
                khVar.onCreate((lo) objArr[0], (yi) objArr[1]);
                return null;
            case 431347773:
                return khVar.f((ViewGroup) objArr[0], (AURARenderComponentContainer) objArr[1]);
            case 1396434808:
                return khVar.a();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/common/render/dx/AURADXComponentExtension");
        }
    }

    public final String N0(AURARenderComponent aURARenderComponent) {
        AURARenderComponentContainer aURARenderComponentContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc7cfde5", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null) {
            return null;
        }
        return aURARenderComponentContainer.name + "#" + aURARenderComponentContainer.version;
    }

    public final String O0(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d3ec30a", new Object[]{this, aURARenderComponent});
        }
        try {
            return aURARenderComponent.data.container.name + "#" + aURARenderComponent.data.container.version;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void P0(AURARenderComponent aURARenderComponent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ae6633", new Object[]{this, aURARenderComponent, new Long(j)});
        } else if (aURARenderComponent != null && aURARenderComponent.key != null) {
            try {
                Map map = (Map) x().get("AURAFirstScreenRender", Map.class);
                if (map == null) {
                    map = new HashMap();
                }
                map.put(aURARenderComponent.key.split("_")[0] + "@" + N0(aURARenderComponent), j + "");
                x().update("AURAFirstScreenRender", map);
            } catch (Throwable th) {
                rj.d("SAVE_FIRST_SCREEN_RENDER_INFO_EXCEPTION", th.getMessage());
            }
        }
    }

    public final nh.c Q0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nh.c) ipChange.ipc$dispatch("9ac07a27", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        nh.c cVar = new nh.c();
        cVar.b = i2;
        cVar.f24727a = i;
        List<qs> f = r().f(qs.class);
        if (bh.a(f)) {
            return cVar;
        }
        for (qs qsVar : f) {
            nh.c x = qsVar.x(i, i2);
            if (x != null) {
                cVar = x;
            }
        }
        return cVar;
    }

    @Override // tb.rs
    public void J0(s sVar, nh nhVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a75bf9b9", new Object[]{this, sVar, nhVar});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AURATraceUtil.a(3, nhVar.i().key);
        if (AliBuyPresenterImpl.DEFAULT_AURA_BUY_MAIN_FLOW.equals(x().getFlowCode())) {
            hl.b("[" + nhVar.i().key + "] 开始渲染", null);
        }
        DXRootView m = nhVar.m();
        int l = nhVar.l();
        int k = nhVar.k();
        nh.c Q0 = Q0(l, k);
        if (Q0 != null) {
            l = Q0.f24727a;
            k = Q0.b;
        }
        DXResult<DXRootView> v = sVar.v(this.b, nhVar.j(), m, l, k, new qh(this.c, nhVar.i(), r(), B()));
        AURARenderComponentData aURARenderComponentData = nhVar.i().data;
        AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData == null ? null : aURARenderComponentData.container;
        DinamicXEngine k2 = sVar.k();
        if (k2 == null) {
            M0("-1002", "渲染失败,engine为空", aURARenderComponentContainer);
            return;
        }
        if (v == null || v.d()) {
            StringBuilder sb = new StringBuilder("渲染失败|");
            if (v == null) {
                obj = "";
            } else {
                obj = v.a();
            }
            sb.append(obj);
            M0("-1002", sb.toString(), aURARenderComponentContainer);
        } else {
            k2.t0(m);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        AURATraceUtil.b(3);
        long j = currentTimeMillis2 - currentTimeMillis;
        P0(nhVar.i(), j);
        if (AliBuyPresenterImpl.DEFAULT_AURA_BUY_MAIN_FLOW.equals(x().getFlowCode()) && th.c()) {
            String O0 = O0(nhVar.i());
            hl.b("[" + nhVar.i().key + "#" + O0 + "] 渲染完成，耗时 " + j, null);
        }
    }
}
