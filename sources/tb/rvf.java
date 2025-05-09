package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.model.JsActionModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.xve;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, IJsBridgeService.a> f27638a = new ConcurrentHashMap();
    public final xve.a c = new a();

    static {
        t2o.a(491782239);
    }

    public static /* synthetic */ Map a(rvf rvfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c392f066", new Object[]{rvfVar});
        }
        return rvfVar.f27638a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.b)) {
            xve.d(this.b);
        }
        ((ConcurrentHashMap) this.f27638a).clear();
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
            return;
        }
        this.b = str;
        xve.a();
        xve.c(this.b, this.c);
    }

    public void d(IJsBridgeService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93fcba6d", new Object[]{this, aVar});
            return;
        }
        String a2 = aVar.a();
        if (((ConcurrentHashMap) this.f27638a).containsKey(a2)) {
            String str = "registerJsNativeFeature 发生异常，重复注册，featureName： " + a2;
            fve.e("JsNativeFeatureDispatcher", str);
            if (eue.b()) {
                throw new InfoFlowRuntimeException(str);
            }
        }
        ((ConcurrentHashMap) this.f27638a).put(a2, aVar);
    }

    public void e(IJsBridgeService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ac5614", new Object[]{this, aVar});
        } else {
            ((ConcurrentHashMap) this.f27638a).remove(aVar.a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements xve.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.xve.a
        public boolean a(JsActionModel jsActionModel, IJsBridgeService.a.AbstractC0565a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9b21a535", new Object[]{this, jsActionModel, aVar})).booleanValue();
            }
            String action = jsActionModel.getAction();
            IJsBridgeService.a aVar2 = (IJsBridgeService.a) rvf.a(rvf.this).get(action);
            if (aVar2 == null) {
                fve.e("JsNativeFeatureDispatcher", "IWvResponder.onResponse nativeFeature is null. nativeFeatureName : " + action);
                aVar.error("客户端能力未注册，联系客户端同学确认，NativeFeature：" + action);
                return false;
            }
            aVar2.b(jsActionModel.getParam(), aVar);
            return true;
        }
    }
}
