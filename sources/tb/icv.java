package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class icv implements t5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final cbv b;

    /* renamed from: a  reason: collision with root package name */
    public final kcv f21248a = new kcv();
    public final Map<String, String> c = new ConcurrentHashMap();

    static {
        t2o.a(157286851);
        t2o.a(157286824);
        t2o.a(157286825);
    }

    public icv(cbv cbvVar) {
        this.b = cbvVar;
    }

    @Override // tb.t5e
    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb77c2b6", new Object[]{this, str, str2, jSONObject});
        } else {
            d(str, str2, i(jSONObject));
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c04ce1", new Object[]{this, str});
        } else {
            this.f21248a.a(str);
        }
    }

    public void c(String str) {
        List<fcv> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1216e4", new Object[]{this, str});
        } else if (!e(str, null)) {
            hav.d("UltronTradeHybridStorageManager.deleteStorageByPreRequest", str + " switcher is off");
        } else {
            cbv cbvVar = this.b;
            if (cbvVar == null) {
                UnifyLog.e("UltronTradeHybridStorageManager.deleteStorageByPreRequest", "mConfig is null");
                return;
            }
            hcv c = cbvVar.c(str);
            if (c == null || (list = c.c) == null) {
                UnifyLog.e("UltronTradeHybridStorageManager.deleteStorageByPreRequest", "sceneModel or sceneModel.preRequestModels is null");
                return;
            }
            for (fcv fcvVar : list) {
                if (fcvVar != null && fcvVar.d == null && TextUtils.equals(fcvVar.c.c, "destroy")) {
                    String str2 = str + "_" + fcvVar.f19194a;
                    b((String) ((ConcurrentHashMap) this.c).get(str2));
                    ((ConcurrentHashMap) this.c).remove(str2);
                }
            }
        }
    }

    public final void d(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122b7611", new Object[]{this, str, str2, jSONObject});
            return;
        }
        str.hashCode();
        if (str.equals(UltronTradeHybridStage.ON_CONTAINER_DESTROY)) {
            c(str2);
        } else if (!str.equals(UltronTradeHybridStage.ON_MEMORY_WARNING)) {
            hav.g("UltronTradeHybridStorageManager", "onStage", "unknown stage");
        } else {
            c(str2);
        }
    }

    public boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a25e695", new Object[]{this, str, str2})).booleanValue();
        }
        return UltronTradeHybridSwitcherHelper.j(str);
    }

    public JSONObject f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1e515a36", new Object[]{this, str});
        }
        return this.f21248a.c(str);
    }

    public void g(String str, JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d773cde", new Object[]{this, str, jSONObject, new Long(j)});
        } else {
            this.f21248a.d(str, jSONObject, j);
        }
    }

    public void h(String str, fcv fcvVar, String str2, JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e8dffa", new Object[]{this, str, fcvVar, str2, jSONObject, new Long(j)});
            return;
        }
        Map<String, String> map = this.c;
        ((ConcurrentHashMap) map).put(str + "_" + fcvVar.f19194a, str2);
        g(str2, jSONObject, j);
    }

    public JSONObject i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("367da879", new Object[]{this, jSONObject});
        }
        return lbv.o(jSONObject);
    }
}
