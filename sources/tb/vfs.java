package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] f = {"weitao_switch", "tnode", "ShortVideo", hpb.UGC_ORANGE_GROUP};
    public static final vfs g = new vfs();
    public final HashMap<String, List<b>> c = new HashMap<>();
    public final Map<String, String> d = new HashMap();
    public final Set<String> e = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f29988a = o.J().getSharedPreferences("tnode_orange_sp", 0);
    public final obk b = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.vfs$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC1077a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f29990a;

            public RunnableC1077a(String str) {
                this.f29990a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    vfs.d(vfs.this, this.f29990a);
                }
            }
        }

        public a() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                vfs.a(vfs.this, str, map);
                if (akt.q1()) {
                    vfs.b(vfs.this, str, map);
                } else {
                    vfs.c(vfs.this, str, map);
                }
            } catch (Exception e) {
                tfs.e("TNodeOrange", e.getMessage());
            }
            nwv.z0(new RunnableC1077a(str), true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void a(String str, String str2, String str3);
    }

    public vfs() {
        q(f);
    }

    public static /* synthetic */ void a(vfs vfsVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a255311", new Object[]{vfsVar, str, map});
        } else {
            vfsVar.o(str, map);
        }
    }

    public static /* synthetic */ void b(vfs vfsVar, String str, Map map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426b9352", new Object[]{vfsVar, str, map});
        } else {
            vfsVar.m(str, map);
        }
    }

    public static /* synthetic */ void c(vfs vfsVar, String str, Map map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab1d393", new Object[]{vfsVar, str, map});
        } else {
            vfsVar.n(str, map);
        }
    }

    public static /* synthetic */ void d(vfs vfsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e701391", new Object[]{vfsVar, str});
        } else {
            vfsVar.j(str);
        }
    }

    public static vfs g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vfs) ipChange.ipc$dispatch("556aec43", new Object[0]);
        }
        return g;
    }

    public synchronized String e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        try {
            String c = m9h.c(str, str2);
            if (c != null) {
                return c;
            }
            String f2 = f(str, str2);
            String string = this.f29988a.getString(f2, str3);
            String config = OrangeConfig.getInstance().getConfig(str, str2, str3);
            if (TextUtils.equals(string, config)) {
                return config;
            }
            if (TextUtils.equals(config, str3)) {
                return string;
            }
            this.f29988a.edit().putString(f2, config).apply();
            return config;
        } catch (Exception e) {
            tfs.e("TNodeOrange", e.getMessage());
            return str3;
        }
    }

    public final String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdcfb7cf", new Object[]{this, str, str2});
        }
        return str + "." + str2;
    }

    public Map<String, String> h() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2e27d84d", new Object[]{this});
        }
        synchronized (this.d) {
            hashMap = new HashMap(this.d);
        }
        return hashMap;
    }

    public final boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7225d583", new Object[]{this, str})).booleanValue();
        }
        for (String str2 : f) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public final void j(String str) {
        List<b> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29740e1a", new Object[]{this, str});
            return;
        }
        HashMap<String, List<b>> hashMap = this.c;
        if (hashMap != null) {
            for (Map.Entry<String, List<b>> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith(str) && (value = entry.getValue()) != null && !value.isEmpty()) {
                    String[] k = k(key);
                    String config = OrangeConfig.getInstance().getConfig(k[0], k[1], null);
                    for (b bVar : value) {
                        bVar.a(k[0], k[1], config);
                    }
                }
            }
        }
    }

    public void l(String str, String str2, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92953a1c", new Object[]{this, str, str2, bVar});
            return;
        }
        List<b> list = this.c.get(f(str, str2));
        if (list != null) {
            list.remove(bVar);
        }
    }

    public final void m(String str, Map<String, String> map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ca24de", new Object[]{this, str, map});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
        String string = this.f29988a.getString(str, null);
        String str2 = map.get("configVersion");
        if (!(configs == null || TextUtils.equals(string, str2))) {
            Map<String, ?> all = this.f29988a.getAll();
            SharedPreferences.Editor edit = this.f29988a.edit();
            if (i(str)) {
                LinkedList linkedList = new LinkedList();
                String concat = str.concat(".");
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    if (key.startsWith(concat)) {
                        linkedList.add(key);
                    }
                }
                for (int i = 0; i < linkedList.size(); i++) {
                    edit.remove((String) linkedList.get(i));
                }
                linkedList.clear();
                for (Map.Entry<String, String> entry2 : configs.entrySet()) {
                    edit.putString(f(str, entry2.getKey()), entry2.getValue());
                }
            }
            edit.putString(str, str2);
            edit.apply();
        }
    }

    public final void n(String str, Map<String, String> map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cd38b7", new Object[]{this, str, map});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
        String string = this.f29988a.getString(str, null);
        String str2 = map.get("configVersion");
        if (!(configs == null || TextUtils.equals(string, str2))) {
            SharedPreferences.Editor edit = this.f29988a.edit();
            if (i(str)) {
                for (Map.Entry<String, String> entry : configs.entrySet()) {
                    edit.putString(f(str, entry.getKey()), entry.getValue());
                }
            }
            edit.putString(str, str2);
            edit.apply();
        }
    }

    public final void o(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba325a65", new Object[]{this, str, map});
            return;
        }
        synchronized (this.d) {
            ((HashMap) this.d).put(str, map.get("configVersion"));
        }
    }

    public void p(String str, String str2, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7754d243", new Object[]{this, str, str2, bVar});
            return;
        }
        String f2 = f(str, str2);
        List<b> list = this.c.get(f2);
        if (list == null) {
            list = new ArrayList<>();
            this.c.put(f2, list);
        }
        if (!list.contains(bVar)) {
            list.add(bVar);
        }
    }

    public void q(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed711448", new Object[]{this, strArr});
            return;
        }
        synchronized (this.e) {
            try {
                ArrayList arrayList = new ArrayList();
                if (strArr != null && strArr.length > 0) {
                    for (String str : strArr) {
                        if (!this.e.contains(str)) {
                            this.e.add(str);
                            arrayList.add(str);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    OrangeConfig.getInstance().registerListener((String[]) arrayList.toArray(new String[arrayList.size()]), this.b, true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static {
        t2o.a(503317431);
    }

    public final String[] k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("43a7c453", new Object[]{this, str});
        }
        String[] strArr = new String[2];
        int indexOf = str.indexOf(".");
        if (indexOf > 0) {
            strArr[0] = str.substring(0, indexOf);
            strArr[1] = str.substring(indexOf + 1);
        } else {
            strArr[0] = "tnode";
            strArr[1] = str;
        }
        return strArr;
    }
}
