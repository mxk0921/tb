package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import java.util.HashMap;
import tb.npp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class fop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements gbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.gbe
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
                return;
            }
            npp.a aVar = npp.Companion;
            aVar.b("weex onException : " + ((Object) str) + " , " + ((Object) str2));
        }

        @Override // tb.gbe
        public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            } else {
                npp.Companion.b("weex onRenderSuccess");
            }
        }

        @Override // tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            }
        }
    }

    static {
        t2o.a(766509686);
    }

    public static /* synthetic */ WXSDKInstance b(Context context, String str, gbe gbeVar, String str2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("e0801107", new Object[]{context, str, gbeVar, str2, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            gbeVar = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return a(context, str, gbeVar, str2);
    }

    public static final WXSDKInstance a(Context context, String str, gbe gbeVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("9998077", new Object[]{context, str, gbeVar, str2});
        }
        ckf.g(context, "context");
        WXSDKInstance wXSDKInstance = new WXSDKInstance(context);
        wXSDKInstance.setUseSandBox(true);
        wXSDKInstance.a1(str);
        HashMap hashMap = new HashMap();
        hashMap.put("bundleUrl", str);
        wXSDKInstance.registerRenderListener(new a());
        wXSDKInstance.X0("shopEmbed_" + ((Object) str2) + '_' + ((Object) str), str, hashMap, "", WXRenderStrategy.APPEND_ASYNC);
        npp.Companion.b(ckf.p("start render weex instance : ", str));
        return wXSDKInstance;
    }
}
