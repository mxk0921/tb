package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.b;
import com.taobao.android.weex_framework.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dww implements jqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f18124a;

    static {
        t2o.a(980418684);
        t2o.a(989856388);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f18124a = null;
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d58378", new Object[]{this, aVar});
        } else {
            this.f18124a = aVar;
        }
    }

    @Override // tb.jqw
    public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
        }
        if (i == 3013 && objArr != null) {
            try {
                if (this.f18124a != null) {
                    JSONObject jSONObject = new JSONObject();
                    if (objArr.length >= 3) {
                        JSONObject parseObject = JSON.parseObject(objArr[2].toString());
                        for (String str : parseObject.keySet()) {
                            jSONObject.put(str, parseObject.get(str));
                        }
                    }
                    String obj = objArr[1].toString();
                    if ("PerformanceMetric.onLowMemory".equals(obj)) {
                        return null;
                    }
                    WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) ((tvh) this.f18124a).j();
                    if (objArr[1] == null) {
                        obj = "";
                    }
                    weexInstanceImpl.legacyDispatchWindVaneEvent(obj, b.e().b(jSONObject));
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
