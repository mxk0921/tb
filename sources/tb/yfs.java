package tb;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.filter.Utils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yfs implements bcd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, c> f32057a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f32058a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ JSONArray c;
        public final /* synthetic */ iuo d;

        public a(c cVar, JSONObject jSONObject, JSONArray jSONArray, iuo iuoVar) {
            this.f32058a = cVar;
            this.b = jSONObject;
            this.c = jSONArray;
            this.d = iuoVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f32058a.a(this.b, this.c, this.d);
            } catch (Exception e) {
                tfs.d("prefetch error:" + e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        boolean a(JSONObject jSONObject, JSONArray jSONArray, iuo iuoVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(502268024);
            t2o.a(502268023);
        }

        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        @Override // tb.yfs.c
        public boolean a(JSONObject jSONObject, JSONArray jSONArray, iuo iuoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b133dcbf", new Object[]{this, jSONObject, jSONArray, iuoVar})).booleanValue();
            }
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!(jSONArray == null || !jSONArray.contains(key) || iuoVar == null)) {
                        value = eq8.e(null, value, iuoVar);
                    }
                    jSONObject2.put(key, value);
                }
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("options");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
                jSONObject2.put("options", (Object) jSONObject3);
            }
            jSONObject3.put("prefetch", (Object) Boolean.TRUE);
            MtopModule.request(new d.j(null, jSONObject2, null));
            return true;
        }
    }

    public static boolean d(boolean z, String str, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa8cf044", new Object[]{new Boolean(z), str, str2, new Boolean(z2)})).booleanValue();
        }
        if (!z) {
            return false;
        }
        if (!TextUtils.isEmpty(str) && !nwv.b(Globals.getApplication().getPackageManager().getPackageInfo(Globals.getApplication().getPackageName(), 16384).versionName, str)) {
            return false;
        }
        if (!TextUtils.isEmpty(str2) && !nwv.b(Build.VERSION.RELEASE, str2)) {
            return false;
        }
        if (z2) {
            if (!od0.D().q().b()) {
                return false;
            }
        }
        return true;
    }

    @Override // tb.bcd
    public JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5ea6c980", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object a2 = ggs.a("tnode_prefetch_config_" + str);
        if (a2 instanceof JSONObject) {
            return (JSONObject) a2;
        }
        return null;
    }

    @Override // tb.bcd
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ed5a13", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString(IStorage.TYPE_DSL);
            ggs.e("tnode_prefetch_config_" + string, jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements iuo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Map<String, Class> c;
        public static final JSONObject d = ig8.d(Globals.getApplication());

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f32059a;
        public final Map b;

        static {
            t2o.a(502268022);
            t2o.a(503317116);
            HashMap hashMap = new HashMap();
            c = hashMap;
            zh9.c(hashMap);
        }

        public b(Map<String, String> map) {
            Uri parse;
            JSONObject jSONObject = new JSONObject();
            this.f32059a = jSONObject;
            this.b = map;
            if (map != null) {
                jSONObject.put("query", (Object) map);
                String str = map.get("tnode");
                if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null) {
                    HashMap hashMap = new HashMap();
                    int lastIndexOf = str.lastIndexOf("?");
                    if (lastIndexOf > 0) {
                        hashMap.put("dslUrl", str.substring(0, lastIndexOf));
                    }
                    Map<String, String> d2 = nov.d(parse);
                    if (d2 != null) {
                        hashMap.putAll(d2);
                    }
                    jSONObject.put("tnodeParams", (Object) hashMap);
                }
            }
        }

        @Override // tb.iuo
        public Object c(String str, String str2, List list) {
            Class cls;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("902f32e", new Object[]{this, str, str2, list});
            }
            List<String> H = nwv.H(str2.substring(2), '.');
            if (H == null || H.size() != 2 || (cls = (Class) ((HashMap) c).get(H.get(0))) == null) {
                return null;
            }
            return zh9.b(this, null, null, H.get(0), cls, H.get(1), list);
        }

        @Override // tb.iuo
        public Object d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("746ce3c7", new Object[]{this, str});
            }
            if (str.equals(".")) {
                return this.f32059a;
            }
            if ('.' == str.charAt(0)) {
                str = str.substring(1);
            }
            if (!str.startsWith("$.")) {
                return null;
            }
            String substring = str.substring(2);
            if (substring.startsWith("vm.")) {
                return Utils.objectForKeyPath(this.f32059a, substring.substring(3));
            }
            return Utils.objectForKeyPath(d, substring);
        }
    }

    static {
        t2o.a(502268020);
        t2o.a(503316596);
        HashMap hashMap = new HashMap();
        f32057a = hashMap;
        hashMap.put("mtop", new d(null));
    }

    @Override // tb.bcd
    public boolean b(String str, iuo iuoVar) {
        JSONObject a2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a4fdcc9", new Object[]{this, str, iuoVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (a2 = a(str)) == null || (jSONArray = a2.getJSONArray("list")) == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            c cVar = (c) ((HashMap) f32057a).get(jSONObject.getString("type"));
            if (cVar != null && d(nwv.o(eq8.e(null, jSONObject.get("enable"), iuoVar), true), nwv.I(jSONObject.get("minVersion"), ""), nwv.I(jSONObject.get("minOSVersion"), ""), nwv.o(jSONObject.get("login"), false))) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("calculateArgs");
                JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    long y = nwv.y(jSONObject.get("delay"), 0L);
                    if (y <= 0) {
                        try {
                            cVar.a(jSONObject2, jSONArray2, iuoVar);
                        } catch (Exception e) {
                            tfs.d("prefetch error:" + e.getMessage());
                        }
                    } else {
                        nwv.A0(new a(cVar, jSONObject2, jSONArray2, iuoVar), y);
                    }
                }
                z = true;
            }
        }
        return z;
    }
}
