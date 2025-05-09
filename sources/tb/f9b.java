package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zoloz.hummer.common.ClientConfig;
import com.ap.zoloz.hummer.common.TaskConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class f9b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19115a;
    public Context b;
    public ClientConfig g;
    public TaskConfig h;
    public final Map<String, Object> c = new HashMap();
    public final Map<String, Object> d = new HashMap();
    public final Map<Integer, Object> e = new HashMap();
    public final ArrayList<Integer> f = new ArrayList<>();
    public final List<Map<String, String>> i = new ArrayList();
    public final Map<String, Object> j = new HashMap();
    public final Map<String, Object> k = new HashMap();

    static {
        t2o.a(245366830);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea815dfc", new Object[]{this, str});
            return;
        }
        ((HashMap) this.e).remove(str);
        ((HashMap) this.d).remove(str);
        ((HashMap) this.c).remove(str);
        ((HashMap) this.e).remove(str);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6896bb61", new Object[]{this});
            return;
        }
        BioLog.i("HummerContext forceQuit");
        ((ArrayList) this.i).clear();
        ((HashMap) this.c).clear();
        ((HashMap) this.d).clear();
        ((HashMap) this.e).clear();
        this.h = null;
    }

    public int d() {
        ArrayList<TaskConfig> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3b960bc", new Object[]{this})).intValue();
        }
        ClientConfig clientConfig = this.g;
        if (!(clientConfig == null || (arrayList = clientConfig.tasks) == null || arrayList.size() == 0)) {
            for (int i = 0; i < this.g.tasks.size(); i++) {
                if ("cancel".equals(this.g.tasks.get(i).name)) {
                    return this.g.tasks.get(i).index;
                }
            }
        }
        return 0;
    }

    public TaskConfig e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskConfig) ipChange.ipc$dispatch("4d47cfad", new Object[]{this});
        }
        return this.h;
    }

    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e8f4d115", new Object[]{this});
        }
        TaskConfig taskConfig = this.h;
        if (taskConfig != null) {
            return taskConfig.inputParams;
        }
        return null;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a16903f2", new Object[]{this});
        }
        List<Map<String, String>> list = this.i;
        String str = "";
        if (list != null && ((ArrayList) list).size() > 0) {
            List<Map<String, String>> list2 = this.i;
            Map map = (Map) ((ArrayList) list2).get(((ArrayList) list2).size() - 1);
            for (String str2 : map.keySet()) {
                str = (String) map.get(str2);
            }
        }
        return str;
    }

    public JSONObject i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("df52f407", new Object[]{this, str});
        }
        TaskConfig taskConfig = this.h;
        if (taskConfig != null && taskConfig.navigateConfig.containsKey(str)) {
            return (JSONObject) ((Map) this.h.navigateConfig.get(str)).get("outputParams");
        }
        return null;
    }

    public TaskConfig j(int i) {
        ArrayList<TaskConfig> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskConfig) ipChange.ipc$dispatch("3b7b7f3b", new Object[]{this, new Integer(i)});
        }
        ClientConfig clientConfig = this.g;
        if (!(clientConfig == null || (arrayList = clientConfig.tasks) == null || arrayList.size() == 0)) {
            for (int i2 = 0; i2 < this.g.tasks.size(); i2++) {
                if (i == this.g.tasks.get(i2).index) {
                    return this.g.tasks.get(i2);
                }
            }
        }
        return null;
    }

    public List<Map<String, String>> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6a20233c", new Object[]{this});
        }
        return this.i;
    }

    public void m(List<Map<String, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd104291", new Object[]{this, list});
            return;
        }
        ((ArrayList) this.i).clear();
        ((ArrayList) this.i).addAll(list);
    }

    public HashMap<String, Object> n() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a9725f41", new Object[]{this});
        }
        TaskConfig taskConfig = this.h;
        if (taskConfig == null) {
            return null;
        }
        int i2 = taskConfig.index;
        HashMap<String, Object> hashMap = new HashMap<>();
        ArrayList arrayList = new ArrayList(this.f);
        Collections.sort(arrayList);
        if (!arrayList.contains(Integer.valueOf(i2))) {
            return null;
        }
        if (this.f.indexOf(Integer.valueOf(i2)) > 0) {
            i = ((Integer) arrayList.get(this.f.indexOf(Integer.valueOf(i2)) - 1)).intValue();
        }
        for (Map.Entry entry : ((HashMap) this.e).entrySet()) {
            if (((Integer) entry.getKey()).intValue() > i && ((Integer) entry.getKey()).intValue() <= i2) {
                hashMap.putAll((Map) entry.getValue());
            }
        }
        return hashMap;
    }

    public Object o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9d8246f9", new Object[]{this, str});
        }
        if (((HashMap) this.j).containsKey(str)) {
            return ((HashMap) this.j).get(str);
        }
        if (((HashMap) this.c).containsKey(str)) {
            return ((HashMap) this.c).get(str);
        }
        if (((HashMap) this.d).containsKey(str)) {
            return ((HashMap) this.d).get(str);
        }
        if (((HashMap) this.k).containsKey(str)) {
            return ((HashMap) this.k).get(str);
        }
        return null;
    }

    public void p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2221e23", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("subCode", str2);
        hashMap.put("currentTaskName", str);
        jqn.a().c("ztech_system_error", hashMap);
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        ((HashMap) this.j).clear();
        ((HashMap) this.k).clear();
        ((HashMap) this.c).clear();
        ((HashMap) this.d).clear();
        ((HashMap) this.e).clear();
        ((ArrayList) this.i).clear();
        this.b = null;
        this.h = null;
    }

    public void r(ClientConfig clientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05d49b0", new Object[]{this, clientConfig});
        } else {
            this.g = clientConfig;
        }
    }

    public void s(TaskConfig taskConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdef9c47", new Object[]{this, taskConfig});
        } else {
            this.h = taskConfig;
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e57e8e1b", new Object[]{this});
            return;
        }
        TaskConfig taskConfig = this.h;
        if (taskConfig != null) {
            this.f.add(Integer.valueOf(taskConfig.index));
            BioLog.d(this.f.toString());
        }
    }

    public void u(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf49772", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        ((ArrayList) this.i).add(hashMap);
    }

    public int h(String str) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e40f34ad", new Object[]{this, str})).intValue();
        }
        TaskConfig taskConfig = this.h;
        if (taskConfig == null || (map = taskConfig.navigateConfig) == null || !map.containsKey(str)) {
            return 0;
        }
        return ((Integer) ((Map) this.h.navigateConfig.get(str)).get("index")).intValue();
    }

    public boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7277d2c4", new Object[]{this, str})).booleanValue();
        }
        TaskConfig j = j(h(str));
        return j != null && "serverTask".equals(j.type) && !"realIdFinalize".equals(j.name) && !"cancel".equals(j.name);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r10.equals(com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData.ACTION_BOTH) == false) goto L_0x002b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r9, java.lang.String r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.f9b.a(java.lang.String, java.lang.String, java.lang.Object):void");
    }
}
