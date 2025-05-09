package com.taobao.mytaobao.ultron.fatigue;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DeliverFatigueManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f11351a = new HashSet();
    public final Set<a> b = new HashSet();
    public boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f11352a;
        public int b;

        static {
            t2o.a(745538141);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return TextUtils.equals(this.f11352a, ((a) obj).f11352a);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return String.valueOf(this.f11352a).hashCode();
        }
    }

    static {
        t2o.a(745538139);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f565cf11", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ((HashSet) this.f11351a).add(str);
            Iterator it = ((HashSet) this.b).iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(((a) it.next()).f11352a, str)) {
                    it.remove();
                }
            }
            g();
        }
    }

    public Set<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a2456f99", new Object[]{this});
        }
        HashSet hashSet = new HashSet(this.f11351a);
        ((HashSet) this.f11351a).clear();
        g();
        return hashSet;
    }

    public Set<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("645d88c3", new Object[]{this});
        }
        return this.f11351a;
    }

    public void d(String str, int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be722ac1", new Object[]{this, str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            Iterator it = ((HashSet) this.b).iterator();
            a aVar = null;
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (TextUtils.equals(str, aVar2.f11352a)) {
                    int i2 = aVar2.b + 1;
                    aVar2.b = i2;
                    if (i2 >= i) {
                        aVar = aVar2;
                    }
                    z = true;
                }
            }
            if (!z && !((HashSet) this.f11351a).contains(str)) {
                a aVar3 = new a();
                aVar3.b = 1;
                aVar3.f11352a = str;
                if (i > 1) {
                    ((HashSet) this.b).add(aVar3);
                } else {
                    aVar = aVar3;
                }
            }
            if (aVar != null && !((HashSet) this.f11351a).contains(aVar.f11352a)) {
                ((HashSet) this.f11351a).add(aVar.f11352a);
                ((HashSet) this.b).remove(aVar);
            }
            g();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9702279", new Object[]{this});
            return;
        }
        Set<String> b = b();
        if (b != null && b.size() > 0) {
            MtopTaobaoMclarenFatigueRequest mtopTaobaoMclarenFatigueRequest = new MtopTaobaoMclarenFatigueRequest();
            mtopTaobaoMclarenFatigueRequest.setOrderFatigue(JSON.toJSONString(b));
            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopTaobaoMclarenFatigueRequest, TaoHelper.getTTID());
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.ultron.fatigue.DeliverFatigueManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }
            });
            build.startRequest();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e281e87a", new Object[]{this});
        } else {
            PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit().putString("processFatigue", JSON.toJSONString(this.b)).putString("arriveFatigue", JSON.toJSONString(this.f11351a)).apply();
        }
    }

    public void h(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1976c0b", new Object[]{this, list});
            return;
        }
        e();
        Set<a> set = this.b;
        if (set != null && ((HashSet) set).size() > 0 && list != null && list.size() > 0) {
            Iterator it = ((HashSet) this.b).iterator();
            while (it.hasNext()) {
                if (!list.contains(((a) it.next()).f11352a)) {
                    it.remove();
                }
            }
        }
        g();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        if (!this.c) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
            String string = defaultSharedPreferences.getString("arriveFatigue", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONArray parseArray = JSON.parseArray(string);
                    if (parseArray != null && parseArray.size() > 0) {
                        for (int i = 0; i < parseArray.size(); i++) {
                            ((HashSet) this.f11351a).add(parseArray.getString(i));
                        }
                    }
                } catch (Exception e) {
                    TLog.loge("DeliverFatigueManager", Log.getStackTraceString(e));
                }
            }
            String string2 = defaultSharedPreferences.getString("processFatigue", "");
            if (!TextUtils.isEmpty(string2)) {
                try {
                    JSONArray parseArray2 = JSON.parseArray(string2);
                    if (parseArray2 != null && parseArray2.size() > 0) {
                        for (int i2 = 0; i2 < parseArray2.size(); i2++) {
                            ((HashSet) this.b).add(parseArray2.getObject(i2, a.class));
                        }
                    }
                } catch (Exception e2) {
                    TLog.loge("DeliverFatigueManager", Log.getStackTraceString(e2));
                }
            }
        }
        this.c = true;
    }
}
