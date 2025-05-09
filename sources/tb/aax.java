package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class aax {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements gbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f15637a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ JSONObject c;

        public a(b bVar, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f15637a = bVar;
            this.b = jSONObject;
            this.c = jSONObject2;
        }

        @Override // tb.gbe
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
                return;
            }
            b bVar = this.f15637a;
            if (bVar != null) {
                bVar.onException(wXSDKInstance, str, str2);
            }
            this.b.put("renderError", (Object) Long.valueOf(System.currentTimeMillis()));
            aax.a(this.c, this.b);
        }

        @Override // tb.gbe
        public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            b bVar = this.f15637a;
            if (bVar != null) {
                bVar.onRefreshSuccess(wXSDKInstance, i, i2);
            }
        }

        @Override // tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            b bVar = this.f15637a;
            if (bVar != null) {
                bVar.onRenderSuccess(wXSDKInstance, i, i2);
            }
            this.b.put("renderSuccess", (Object) Long.valueOf(System.currentTimeMillis()));
            aax.a(this.c, this.b);
        }

        @Override // tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                return;
            }
            b bVar = this.f15637a;
            if (bVar != null) {
                bVar.onViewCreated(wXSDKInstance, view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void onException(WXSDKInstance wXSDKInstance, String str, String str2);

        void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2);

        void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2);

        void onViewCreated(WXSDKInstance wXSDKInstance, View view);
    }

    public static /* synthetic */ void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9febb7", new Object[]{jSONObject, jSONObject2});
        } else {
            b(jSONObject, jSONObject2);
        }
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747de09", new Object[]{jSONObject, jSONObject2});
            return;
        }
        try {
            d("Triver", "WeexWidgetLaunch", jSONObject, jSONObject2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void d(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a50b04da", new Object[]{str, str2, jSONObject, jSONObject2});
        } else if (jSONObject != null && jSONObject.size() >= 1 && jSONObject2 != null) {
            DimensionSet create = DimensionSet.create();
            DimensionValueSet create2 = DimensionValueSet.create();
            for (String str3 : jSONObject.keySet()) {
                create.addDimension(new Dimension(str3));
                create2.setValue(str3, jSONObject.getString(str3));
            }
            MeasureSet create3 = MeasureSet.create();
            MeasureValueSet create4 = MeasureValueSet.create();
            for (String str4 : jSONObject2.keySet()) {
                create3.addMeasure(new Measure(str4));
                create4.setValue(str4, jSONObject2.getDoubleValue(str4));
            }
            AppMonitor.register(str, str2, create3, create, true);
            AppMonitor.Stat.commit(str, str2, create2, create4);
        }
    }

    public static void c(RenderContainer renderContainer, WXSDKInstance wXSDKInstance, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa122935", new Object[]{renderContainer, wXSDKInstance, str, bVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("renderStart", (Object) Long.valueOf(System.currentTimeMillis()));
        renderContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        wXSDKInstance.setRenderContainer(renderContainer);
        wXSDKInstance.setUseSandBox(true);
        wXSDKInstance.y1(true);
        wXSDKInstance.a1(str);
        HashMap hashMap = new HashMap();
        hashMap.put("bundleUrl", str);
        wXSDKInstance.X0("TRWidgetMiniAppEmbedView", str, hashMap, null, WXRenderStrategy.APPEND_ASYNC);
        wXSDKInstance.registerRenderListener(new a(bVar, jSONObject2, jSONObject));
    }
}
