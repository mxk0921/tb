package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hut implements o0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXRootView f20909a;
    public final ux9 b;

    static {
        t2o.a(779092533);
        t2o.a(779092543);
    }

    public hut(DXRootView dXRootView, ux9 ux9Var) {
        this.f20909a = dXRootView;
        this.b = ux9Var;
    }

    @Override // tb.o0e
    public void a(LiveTimemovingModel liveTimemovingModel, int i, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a74565", new Object[]{this, liveTimemovingModel, new Integer(i), dXRuntimeContext});
        }
    }

    @Override // tb.o0e
    public void b(String str, DXRuntimeContext dXRuntimeContext) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148b9f10", new Object[]{this, str, dXRuntimeContext});
            return;
        }
        DXRootView dXRootView = this.f20909a;
        if (dXRootView != null && (data = dXRootView.getData()) != null) {
            axa.f().h(this.f20909a, (JSONObject) data.clone(), this.b);
        }
    }

    @Override // tb.o0e
    public void c(String str, Map<String, String> map, DXRuntimeContext dXRuntimeContext) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe7c641", new Object[]{this, str, map, dXRuntimeContext});
            return;
        }
        DXRootView dXRootView = this.f20909a;
        if (dXRootView != null && (data = dXRootView.getData()) != null) {
            JSONObject jSONObject = data.getJSONObject("personalityData");
            if (jSONObject != null) {
                jSONObject.putAll(map);
            }
            axa.f().h(this.f20909a, (JSONObject) data.clone(), this.b);
        }
    }

    public void d(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf71d15", new Object[]{this, dXRootView});
        } else {
            this.f20909a = dXRootView;
        }
    }
}
