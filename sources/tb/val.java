package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class val {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public static final val i = new val();
    public final String[] c;

    /* renamed from: a  reason: collision with root package name */
    public final String f29891a = "OrangeUtil";
    public final String b = "weitao_switch";
    public final HashMap<String, List<c>> f = new HashMap<>();
    public final Map<String, String> g = new HashMap();
    public final Set<String> h = new HashSet();
    public final SharedPreferences d = spu.Companion.d().getSharedPreferences("turbo_orange_sp", 0);
    public final obk e = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: tb.val$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class RunnableC1076a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;

            public RunnableC1076a(String str) {
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                val valVar = val.this;
                String str = this.b;
                ckf.f(str, "group");
                val.c(valVar, str);
            }
        }

        public a() {
        }

        @Override // tb.obk
        public final void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                val valVar = val.this;
                ckf.f(str, "group");
                ckf.f(map, "args");
                val.e(valVar, str, map);
                val.d(val.this, str, map);
            } catch (Exception e) {
                tpu.a.b(tpu.Companion, val.b(val.this), e.getMessage(), null, 4, null);
            }
            zrt.Companion.c(new RunnableC1076a(str), true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601427);
        }

        public b() {
        }

        public final val a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (val) ipChange.ipc$dispatch("69dd4b91", new Object[]{this});
            }
            return val.a();
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void a(String str, String str2, String str3);
    }

    static {
        t2o.a(919601424);
    }

    public val() {
        String[] strArr = {"weitao_switch"};
        this.c = strArr;
        m(strArr);
    }

    public static final /* synthetic */ val a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (val) ipChange.ipc$dispatch("9257b2c", new Object[0]);
        }
        return i;
    }

    public static final /* synthetic */ String b(val valVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59faaea8", new Object[]{valVar});
        }
        return valVar.f29891a;
    }

    public static final /* synthetic */ void c(val valVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfd6a49", new Object[]{valVar, str});
        } else {
            valVar.i(str);
        }
    }

    public static final /* synthetic */ void d(val valVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e40fc09", new Object[]{valVar, str, map});
        } else {
            valVar.k(str, map);
        }
    }

    public static final /* synthetic */ void e(val valVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2076a1a2", new Object[]{valVar, str, map});
        } else {
            valVar.l(str, map);
        }
    }

    public final synchronized String f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "group");
        ckf.g(str2, "key");
        try {
            String g = g(str, str2);
            SharedPreferences sharedPreferences = this.d;
            ckf.d(sharedPreferences);
            String string = sharedPreferences.getString(g, str3);
            String config = OrangeConfig.getInstance().getConfig(str, str2, str3);
            if (TextUtils.equals(string, config)) {
                return config;
            }
            if (TextUtils.equals(config, str3)) {
                return string;
            }
            SharedPreferences sharedPreferences2 = this.d;
            ckf.d(sharedPreferences2);
            sharedPreferences2.edit().putString(g, config).apply();
            return config;
        } catch (Exception e) {
            tpu.a.b(tpu.Companion, this.f29891a, e.getMessage(), null, 4, null);
            return str3;
        }
    }

    public final String g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdcfb7cf", new Object[]{this, str, str2});
        }
        return str + '.' + str2;
    }

    public final boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7225d583", new Object[]{this, str})).booleanValue();
        }
        for (String str2 : this.c) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29740e1a", new Object[]{this, str});
            return;
        }
        HashMap<String, List<c>> hashMap = this.f;
        if (hashMap != null) {
            for (Map.Entry<String, List<c>> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                List<c> value = entry.getValue();
                if (tsq.I(key, str, false, 2, null) && value != null && !value.isEmpty()) {
                    String[] j = j(key);
                    OrangeConfig instance = OrangeConfig.getInstance();
                    String str2 = j[0];
                    ckf.d(str2);
                    String str3 = j[1];
                    ckf.d(str3);
                    String config = instance.getConfig(str2, str3, null);
                    for (c cVar : value) {
                        cVar.a(j[0], j[1], config);
                    }
                }
            }
        }
    }

    public final void l(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba325a65", new Object[]{this, str, map});
            return;
        }
        synchronized (this.g) {
            String str2 = (String) ((HashMap) this.g).put(str, map.get("configVersion"));
        }
    }

    public final void m(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed711448", new Object[]{this, strArr});
            return;
        }
        synchronized (this.h) {
            try {
                ArrayList arrayList = new ArrayList();
                if (strArr != null && strArr.length > 0) {
                    for (String str : strArr) {
                        if (!this.h.contains(str)) {
                            this.h.add(str);
                            arrayList.add(str);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    OrangeConfig instance = OrangeConfig.getInstance();
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array != null) {
                        obk obkVar = this.e;
                        ckf.d(obkVar);
                        instance.registerListener((String[]) array, obkVar, true);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String[] j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("43a7c453", new Object[]{this, str});
        }
        String[] strArr = new String[2];
        int Y = wsq.Y(str, ".", 0, false, 6, null);
        if (Y <= 0) {
            strArr[0] = this.b;
            strArr[1] = str;
        } else if (str != null) {
            String substring = str.substring(0, Y);
            ckf.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            strArr[0] = substring;
            String substring2 = str.substring(Y + 1);
            ckf.f(substring2, "(this as java.lang.String).substring(startIndex)");
            strArr[1] = substring2;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        return strArr;
    }

    public final void k(String str, Map<String, String> map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ca24de", new Object[]{this, str, map});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
        SharedPreferences sharedPreferences = this.d;
        ckf.d(sharedPreferences);
        String string = sharedPreferences.getString(str, null);
        String str2 = map.get("configVersion");
        if (!(configs == null || TextUtils.equals(string, str2))) {
            SharedPreferences sharedPreferences2 = this.d;
            ckf.d(sharedPreferences2);
            Map<String, ?> all = sharedPreferences2.getAll();
            SharedPreferences sharedPreferences3 = this.d;
            ckf.d(sharedPreferences3);
            SharedPreferences.Editor edit = sharedPreferences3.edit();
            if (h(str)) {
                LinkedList linkedList = new LinkedList();
                String str3 = str + '.';
                ckf.f(all, "spData");
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    ckf.f(key, "spKey");
                    if (tsq.I(key, str3, false, 2, null)) {
                        linkedList.add(key);
                    }
                }
                int size = linkedList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    edit.remove((String) linkedList.get(i2));
                }
                linkedList.clear();
                for (Map.Entry<String, String> entry2 : configs.entrySet()) {
                    String key2 = entry2.getKey();
                    ckf.f(key2, "key");
                    edit.putString(g(str, key2), entry2.getValue());
                }
            }
            edit.putString(str, str2);
            edit.apply();
        }
    }
}
