package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.jsbridge.impl.bridge.model.JsActionModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.do4;
import tb.hhc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, hhc.a> f26953a = new ConcurrentHashMap();
    public final do4.a c = new a();

    static {
        t2o.a(490733586);
    }

    public static /* synthetic */ Map a(qvf qvfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("95f579f2", new Object[]{qvfVar});
        }
        return qvfVar.f26953a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.b)) {
            do4.d(this.b);
        }
        ((ConcurrentHashMap) this.f26953a).clear();
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
            return;
        }
        this.b = str;
        do4.a();
        do4.c(this.b, this.c);
    }

    public void d(hhc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b681bcf", new Object[]{this, aVar});
            return;
        }
        String a2 = aVar.a();
        if (((ConcurrentHashMap) this.f26953a).containsKey(a2)) {
            fve.e("JsNativeFeatureDispatcher", "registerJsNativeFeature 发生异常，重复注册，featureName： " + a2);
        }
        ((ConcurrentHashMap) this.f26953a).put(a2, aVar);
    }

    public void e(hhc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eff9e576", new Object[]{this, aVar});
        } else {
            ((ConcurrentHashMap) this.f26953a).remove(aVar.a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements do4.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.do4.a
        public boolean a(JsActionModel jsActionModel, hhc.a.AbstractC0939a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e5c76f87", new Object[]{this, jsActionModel, aVar})).booleanValue();
            }
            String action = jsActionModel.getAction();
            hhc.a aVar2 = (hhc.a) qvf.a(qvf.this).get(action);
            if (aVar2 == null) {
                fve.e("JsNativeFeatureDispatcher", "IWvResponder.onResponse nativeFeature is null. nativeFeatureName : " + action);
                ((mvf) aVar).c("客户端能力未注册，联系客户端同学确认，NativeFeature：" + action);
                return false;
            }
            aVar2.b(jsActionModel.getMethod(), jsActionModel.getParam(), aVar);
            return true;
        }
    }
}
