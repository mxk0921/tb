package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.api.IABTestInfo;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import tb.scc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xya implements scc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, w9b> f31694a;
    public IABTestInfo b;

    static {
        t2o.a(456130664);
        t2o.a(456130609);
    }

    public xya() {
        HashMap hashMap = new HashMap();
        this.f31694a = hashMap;
        String c = tza.c("homepage_ab_test_info");
        TLog.loge("edition_switch", "HomeABTestServiceImpl", "HomeABTestServiceImpl abTestInfo: " + c);
        JSONObject parseObject = JSON.parseObject(c);
        String str = "";
        String string = parseObject == null ? str : parseObject.getString(e1k.NEW_BAR_VERSION);
        this.b = new l0(!TextUtils.isEmpty(string) ? string : str);
        hashMap.put(e1k.NEW_BAR_VERSION, new d2b(this.b.getNewBarVersion()));
    }

    @Override // tb.scc
    public void a(scc.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f7de36", new Object[]{this, aVar, str});
            return;
        }
        int indexOf = str.indexOf("_");
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            w9b w9bVar = (w9b) ((HashMap) this.f31694a).get(substring);
            if (w9bVar != null) {
                w9bVar.a(aVar, substring2);
            }
        }
    }

    @Override // tb.scc
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669622ff", new Object[]{this, str})).booleanValue();
        }
        int indexOf = str.indexOf("_");
        if (indexOf == -1) {
            return false;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        w9b w9bVar = (w9b) ((HashMap) this.f31694a).get(substring);
        if (w9bVar == null || !w9bVar.b(substring2)) {
            return false;
        }
        return true;
    }

    @Override // tb.scc
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b876245f", new Object[]{this, jSONObject});
            return;
        }
        TLog.loge("edition_switch", "HomeABTestServiceImpl", "updateEdlpABInfo abTestInfo: " + jSONObject);
        IABTestInfo f = f(jSONObject);
        if (d(this.b, f)) {
            TLog.loge("edition_switch", "HomeABTestServiceImpl", "updateEdlpABInfo abTestInfo 一致不更新 ");
            return;
        }
        this.b = f;
        g(jSONObject);
        e(f);
    }

    public final boolean d(IABTestInfo iABTestInfo, IABTestInfo iABTestInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8fc7ef4", new Object[]{this, iABTestInfo, iABTestInfo2})).booleanValue();
        }
        if (iABTestInfo == null && iABTestInfo2 == null) {
            return true;
        }
        if (iABTestInfo == null || iABTestInfo2 == null) {
            return false;
        }
        return TextUtils.equals(iABTestInfo.getNewBarVersion(), iABTestInfo2.getNewBarVersion());
    }

    public final void e(IABTestInfo iABTestInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954d4d5e", new Object[]{this, iABTestInfo});
            return;
        }
        if (iABTestInfo == null) {
            str = "";
        } else {
            str = iABTestInfo.getNewBarVersion();
        }
        w9b w9bVar = (w9b) ((HashMap) this.f31694a).get(e1k.NEW_BAR_VERSION);
        if (w9bVar != null) {
            w9bVar.c(str);
        }
    }

    public final IABTestInfo f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IABTestInfo) ipChange.ipc$dispatch("321dd3de", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            TLog.loge("edition_switch", "HomeABTestServiceImpl", "data == null");
            return null;
        }
        String string = jSONObject.getString(e1k.NEW_BAR_VERSION);
        if (TextUtils.isEmpty(string)) {
            TLog.loge("edition_switch", "HomeABTestServiceImpl", "newBarVersion == null");
            return null;
        }
        if (kbq.e(Globals.getApplication())) {
            TLog.loge("edition_switch", "HomeABTestServiceImpl", "当前在海外，不允许切成新人");
            string = "";
        }
        return new l0(string);
    }

    public final void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("302a378c", new Object[]{this, jSONObject});
            return;
        }
        String jSONString = JSON.toJSONString(jSONObject);
        tza.f("homepage_ab_test_info", jSONString);
        TLog.loge("edition_switch", "HomeABTestServiceImpl", "HomeABTestServiceImpl recordCurrentABTestInfo: " + jSONString);
    }
}
