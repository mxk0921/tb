package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.HashMap;
import java.util.List;
import tb.hnx;
import tb.wmx;
import tb.xjx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ro7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DinamicXEngine f27496a;
    public final HashMap<Integer, DXTemplateItem> b = new HashMap<>(128);

    static {
        t2o.a(352321616);
    }

    public ro7() {
        DinamicXEngine dinamicXEngine = new DinamicXEngine(new DXEngineConfig.b("newdetail").Q(2).F());
        this.f27496a = dinamicXEngine;
        dinamicXEngine.W0(xgj.EVENT_IDENTIFY.longValue(), new xgj());
        dinamicXEngine.e1(hnx.d, new hnx.b());
        dinamicXEngine.e1(xjx.h, new xjx.a());
        dinamicXEngine.e1(wmx.c, new wmx.b());
    }

    public DXResult<DXRootView> a(Context context, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("4cfaaed8", new Object[]{this, context, dXTemplateItem});
        }
        return this.f27496a.o(context, dXTemplateItem);
    }

    public void b(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de36e489", new Object[]{this, list});
        } else {
            this.f27496a.p(list);
        }
    }

    public DXTemplateItem c(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("12c999fb", new Object[]{this, dXTemplateItem});
        }
        return this.f27496a.u(dXTemplateItem);
    }

    public DXTemplateItem d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("25625846", new Object[]{this, new Integer(i)});
        }
        return this.b.get(Integer.valueOf(i));
    }

    public void e(int i, DXTemplateItem dXTemplateItem) {
        DXTemplateItem c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("222203fb", new Object[]{this, new Integer(i), dXTemplateItem});
        } else if (!this.b.containsKey(Integer.valueOf(i)) && (c = c(dXTemplateItem)) != null) {
            this.b.put(Integer.valueOf(i), c);
        }
    }

    public DXResult<DXRootView> f(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("9d3c6429", new Object[]{this, dXRootView, jSONObject});
        }
        return this.f27496a.j1(dXRootView, jSONObject);
    }
}
