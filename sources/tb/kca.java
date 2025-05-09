package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopParamType;
import mtopsdk.mtop.intf.MtopSetting;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile HashMap<String, a3w> f22561a;
    public final CopyOnWriteArrayList<s1c> b;
    public final AtomicInteger c;
    public a3w d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final kca f22562a = new kca();

        static {
            t2o.a(456130663);
        }

        public static /* synthetic */ kca a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kca) ipChange.ipc$dispatch("f0d41522", new Object[0]);
            }
            return f22562a;
        }
    }

    static {
        t2o.a(456130661);
    }

    public static kca e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kca) ipChange.ipc$dispatch("a4606188", new Object[0]);
        }
        return b.a();
    }

    public void a(s1c s1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf3efbd3", new Object[]{this, s1cVar});
            return;
        }
        this.b.add(s1cVar);
        TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevision.addEditionSwitcherListener");
    }

    public final void b(HashMap<String, a3w> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbe21680", new Object[]{this, hashMap});
        } else if (o78.y()) {
            n(hashMap, o78.b());
        } else if (hashMap.containsKey("standard_version")) {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "ST");
        } else if (hashMap.containsKey("new_user_minimalist_version")) {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "NW");
        } else if (hashMap.containsKey("elder_version")) {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "ED");
        } else if (hashMap.containsKey("goodprice_version")) {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "GP");
        } else {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "UN");
        }
    }

    public final boolean c(t78 t78Var) {
        List<a3w> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d19473dd", new Object[]{this, t78Var})).booleanValue();
        }
        if (t78Var == null || !t78Var.d() || (list = t78Var.b) == null || ((ArrayList) list).isEmpty()) {
            return false;
        }
        return true;
    }

    public final a3w d(List<a3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("7bb220f", new Object[]{this, list});
        }
        a3w a3wVar = null;
        for (a3w a3wVar2 : list) {
            if ("homePage".equals(a3wVar2.b)) {
                a3wVar = a3wVar2;
            }
        }
        return a3wVar;
    }

    public a3w f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("61a488c4", new Object[]{this, str});
        }
        o();
        return this.f22561a.get(str);
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b66afd6", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f22561a.containsKey(str)) {
            return true;
        }
        o();
        return this.f22561a.containsKey(str);
    }

    public final boolean h(a3w a3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4384df05", new Object[]{this, a3wVar})).booleanValue();
        }
        a3w a3wVar2 = this.d;
        if (a3wVar2 == null) {
            TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisionmCurrentVersion == null");
            return true;
        }
        String str = a3wVar2.c;
        if (a3wVar == null || a3wVar.c.equals(str)) {
            return false;
        }
        return true;
    }

    public final void i(a3w a3wVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7171a7", new Object[]{this, a3wVar});
            return;
        }
        if (a3wVar == null) {
            str = "empty";
        } else {
            str = a3wVar.g().toJSONString();
        }
        TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevision.notifySubscriber; updateVersionInfo: " + str);
        if (this.b.isEmpty()) {
            TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevision.notifySubscriber;  listeners null");
            return;
        }
        Iterator<s1c> it = this.b.iterator();
        while (it.hasNext()) {
            s1c next = it.next();
            if (next != null) {
                next.onSuccess(a3wVar);
            }
        }
    }

    public void j(t78 t78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137b065b", new Object[]{this, t78Var});
        } else if (!c(t78Var)) {
            TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisiononResponse 参数非法");
        } else {
            List<a3w> list = t78Var.b;
            a3w d = d(list);
            if (h(d)) {
                TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisiononResponse 当前versionCode 变化了");
                i(d);
                s(d);
            }
            this.d = d;
            q(list);
            TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisiononResponse updateVersion，值是：" + this.d);
        }
    }

    public a3w k() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("6e662709", new Object[]{this});
        }
        if (this.d == null) {
            this.d = l();
        }
        StringBuilder sb = new StringBuilder("com.taobao.android.editionswitcher.core.GlobalRevisionqueryCurrentVersionInfo，值是：");
        a3w a3wVar = this.d;
        if (a3wVar == null) {
            str = "";
        } else {
            str = a3wVar.c;
        }
        sb.append(str);
        TLog.loge("edition_switch", sb.toString());
        return this.d;
    }

    public final a3w l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3w) ipChange.ipc$dispatch("2331df35", new Object[]{this});
        }
        return (a3w) JSON.parseObject(tza.b().getString("currentVersionInfo", null), a3w.class);
    }

    public void m(s1c s1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d6fdf6", new Object[]{this, s1cVar});
            return;
        }
        this.b.remove(s1cVar);
        TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevision.removeEditionSwitcherListener");
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13877b81", new Object[]{this});
        } else if (this.c.get() < 1) {
            this.c.incrementAndGet();
            r();
        }
    }

    public final void p(a3w a3wVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11cdb525", new Object[]{this, a3wVar});
        } else if (a3wVar != null && a3wVar.j("homePage") && (jSONObject = a3wVar.e) != null) {
            TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevision.updateElderInfo; 兼容银发版逻辑; versionInfo:" + jSONObject.toString());
            ta8.j(Globals.getApplication(), jSONObject);
        }
    }

    public void q(List<a3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b07ddc7", new Object[]{this, list});
        } else if (list != null && list.size() != 0) {
            try {
                this.f22561a.clear();
                JSONArray jSONArray = new JSONArray();
                for (a3w a3wVar : list) {
                    jSONArray.add(a3wVar.g());
                    this.f22561a.put(a3wVar.c, a3wVar);
                    TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevision.updateVersion; versionInfo:" + a3wVar.g());
                    p(a3wVar);
                }
                b(this.f22561a);
                tza.f("GlobalRevision_edition_switcher", jSONArray.toJSONString());
                if (this.c.get() < 1) {
                    this.c.incrementAndGet();
                }
            } catch (Exception e) {
                TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisionupdateVersion", e);
            }
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c3d7add", new Object[]{this});
            return;
        }
        String c = tza.c("GlobalRevision_edition_switcher");
        TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisionupdateVersionFromDisk; disk info:" + c);
        if (!TextUtils.isEmpty(c)) {
            try {
                JSONArray parseArray = JSON.parseArray(c);
                if (parseArray != null && !parseArray.isEmpty()) {
                    int size = parseArray.size();
                    this.f22561a.clear();
                    for (int i = 0; i < size; i++) {
                        a3w k = a3w.h().k(parseArray.getJSONObject(i));
                        if (!TextUtils.isEmpty(k.c)) {
                            this.f22561a.put(k.c, k);
                        }
                    }
                    b(this.f22561a);
                }
            } catch (Exception e) {
                TLog.loge("edition_switch", "com.taobao.android.editionswitcher.core.GlobalRevisionupdateVersionFromDisk. exception:", e);
            }
        }
    }

    public final void s(a3w a3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("495c4cbd", new Object[]{this, a3wVar});
            return;
        }
        SharedPreferences.Editor edit = tza.b().edit();
        edit.putString("currentVersionInfo", JSON.toJSONString(a3wVar));
        edit.apply();
    }

    public kca() {
        this.f22561a = new HashMap<>();
        this.b = new CopyOnWriteArrayList<>();
        this.c = new AtomicInteger();
    }

    public static void n(HashMap<String, a3w> hashMap, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff14d82c", new Object[]{hashMap, jSONObject});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (jSONObject == null) {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "UN");
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            String str = (String) entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(str) && hashMap.containsKey(key)) {
                sb.append(str);
                sb.append("_");
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", sb.toString());
            return;
        }
        MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-app-edition", "UN");
    }
}
