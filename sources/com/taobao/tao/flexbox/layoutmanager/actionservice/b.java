package com.taobao.tao.flexbox.layoutmanager.actionservice;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService;
import com.taobao.tao.flexbox.layoutmanager.actionservice.a;
import com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule.ActionServiceMgrModule;
import com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule.MtopModule;
import com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule.TrackerModule;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import tb.h1p;
import tb.iqx;
import tb.t2o;
import tb.yaa;
import tb.zca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f11996a;
    public Map<String, d> b;
    public int c = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f11997a;
        public final /* synthetic */ c b;

        public a(b bVar, d dVar, c cVar) {
            this.f11997a = dVar;
            this.b = cVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.a.b
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
                return;
            }
            c cVar = this.b;
            ((ActionService.e) cVar).a("faile to download JS code from " + this.f11997a.f11999a);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.a.b
        public void onFinish(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99807463", new Object[]{this, str});
                return;
            }
            d dVar = this.f11997a;
            dVar.b = str;
            ((ActionService.e) this.b).b(dVar);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.actionservice.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0681b implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f11998a;

        public C0681b(e eVar) {
            this.f11998a = eVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.a.b
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
                return;
            }
            b.b(b.this, -1);
            ((ActionService) this.f11998a).x(false);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.a.b
        public void onFinish(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99807463", new Object[]{this, str});
                return;
            }
            try {
                b.a(b.this, str);
                b.b(b.this, 2);
                ((ActionService) this.f11998a).x(true);
            } catch (JSONException e) {
                Log.e("ModuleManager", "initModuleMappings in Download: " + e.getMessage());
                b.b(b.this, -1);
                ((ActionService) this.f11998a).x(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public String f11999a;
        public String b;
        public String c;
        public Class d;
        public boolean e;

        static {
            t2o.a(347078685);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
    }

    static {
        t2o.a(347078681);
    }

    public b() {
        String str;
        o("$navigator", null, "com.taobao.android.actionservice.NavModule");
        p("$", ActionServiceMgrModule.class);
        p("$tracker", TrackerModule.class);
        o("$login", null, "com.taobao.android.actionservice.LoginModule");
        p("$mtop", MtopModule.class);
        if (zca.a() != null) {
            str = zca.a().getPackageName();
        } else {
            str = "com.taobao.taobao";
        }
        if (str.equals("com.taobao.taobao")) {
            this.f11996a = "https://h5.m.taobao.com/app/actionservice/taobaoModuleMapping.js";
        } else if (str.equals("com.tmall.wireless")) {
            this.f11996a = "https://h5.m.taobao.com/app/actionservice/tmallModuleMapping.js";
        } else {
            this.f11996a = "https://h5.m.taobao.com/app/actionservice/moduleMapping.js";
        }
    }

    public static /* synthetic */ void a(b bVar, String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501ed9a8", new Object[]{bVar, str});
        } else {
            bVar.r(str);
        }
    }

    public static /* synthetic */ int b(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ea1b635", new Object[]{bVar, new Integer(i)})).intValue();
        }
        bVar.c = i;
        return i;
    }

    public static String n(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d80099c0", new Object[]{str, context});
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), str);
            StringBuilder sb = new StringBuilder(proxy_open.available() + 10);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(proxy_open));
            char[] cArr = new char[2048];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read <= 0) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            bufferedReader.close();
            try {
                proxy_open.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return sb.toString();
        } catch (IOException e3) {
            Log.e("ModuleManager", "loadFileContent: " + e3.getMessage());
            return "";
        }
    }

    public final boolean c(String str, String str2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9bbef52", new Object[]{this, str, str2})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (str2 == null) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (split.length < split2.length) {
            i = split.length;
        } else {
            i = split2.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (Integer.parseInt(split2[i2]) < Integer.parseInt(split[i2])) {
                return true;
            }
            if (Integer.parseInt(split2[i2]) > Integer.parseInt(split[i2])) {
                return false;
            }
        }
        if (split.length >= split2.length) {
            return true;
        }
        return false;
    }

    public final void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfea46aa", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                d dVar = new d();
                if (value instanceof String) {
                    String str = (String) value;
                    if (str.startsWith(h1p.HTTPS_PREFIX) || str.startsWith(h1p.HTTP_PREFIX) || str.startsWith("file://")) {
                        dVar.f11999a = str;
                    } else {
                        if (key.startsWith("android-")) {
                            key = key.substring(8);
                        }
                        String[] split = str.split(":");
                        String str2 = split[0];
                        dVar.c = split[1];
                    }
                } else if (value instanceof JSONArray) {
                    d(dVar, (JSONArray) value);
                }
                if (((d) ((HashMap) this.b).get(key)) == null) {
                    ((HashMap) this.b).put(key, dVar);
                }
            }
        }
    }

    public void f(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a12c4bf3", new Object[]{this, str, cVar});
            return;
        }
        d g = g(str);
        if (g.b != null) {
            ((ActionService.e) cVar).b(g);
        } else if (g.f11999a.startsWith("file://")) {
            String[] split = g.f11999a.split("/");
            String n = n(split[split.length - 1], zca.a());
            if (!TextUtils.isEmpty(n)) {
                g.b = n;
                ((ActionService.e) cVar).b(g);
                return;
            }
            ((ActionService.e) cVar).a("JS code not exist in " + g.f11999a);
        } else if (g.f11999a.startsWith("http")) {
            String streamByUrl = iqx.getStreamByUrl(g.f11999a);
            if (!TextUtils.isEmpty(streamByUrl)) {
                g.b = streamByUrl;
                ((ActionService.e) cVar).b(g);
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.actionservice.a.c().b(g.f11999a, new a(this, g, cVar));
        } else {
            ((ActionService.e) cVar).a("jsCode not found");
        }
    }

    public d g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("6e9f5aae", new Object[]{this, str});
        }
        return this.b.get(str);
    }

    public d h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("c575c365", new Object[]{this, str});
        }
        d dVar = this.b.get(str);
        if (dVar == null) {
            return ActionService.o().p().h(str);
        }
        return dVar;
    }

    public final String i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fec27799", new Object[]{this, jSONObject});
        }
        String string = jSONObject != null ? jSONObject.getString("android-version") : null;
        return TextUtils.isEmpty(string) ? jSONObject.getString("version") : string;
    }

    public void j(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d6599c", new Object[]{this, eVar});
            return;
        }
        int i = this.c;
        if (i != 2 && i != 1) {
            String streamByUrl = iqx.getStreamByUrl(this.f11996a);
            if (!TextUtils.isEmpty(streamByUrl)) {
                try {
                    r(streamByUrl);
                    this.c = 2;
                    ((ActionService) eVar).x(true);
                } catch (JSONException e2) {
                    Log.e("ModuleManager", "initModuleMappings in AWP: " + e2.getMessage());
                    this.c = -1;
                    ((ActionService) eVar).x(false);
                }
            } else {
                this.c = 1;
                com.taobao.tao.flexbox.layoutmanager.actionservice.a.c().b(this.f11996a, new C0681b(eVar));
            }
        }
    }

    public boolean k(String str) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b03ef594", new Object[]{this, str})).booleanValue();
        }
        Map<String, d> map = this.b;
        if (map == null || (dVar = map.get(str)) == null || (dVar.f11999a == null && dVar.b == null)) {
            return false;
        }
        return true;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99b54fe8", new Object[]{this})).booleanValue();
        }
        if (this.c == 2) {
            return true;
        }
        return false;
    }

    public boolean m(String str) {
        boolean z;
        d dVar;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee3db282", new Object[]{this, str})).booleanValue();
        }
        Map<String, d> map = this.b;
        if (map == null || (dVar = map.get(str)) == null || (dVar.c == null && dVar.d == null)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return z;
        }
        d dVar2 = ActionService.o().p().b.get(str);
        if (dVar2 == null || (dVar2.c == null && dVar2.d == null)) {
            z2 = false;
        }
        return z2;
    }

    public void o(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65691b4b", new Object[]{this, str, str2, str3});
            return;
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        d dVar = new d();
        dVar.c = str3;
        this.b.put(str, dVar);
    }

    public void p(String str, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fadfdf1a", new Object[]{this, str, cls});
            return;
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        d dVar = new d();
        dVar.d = cls;
        this.b.put(str, dVar);
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("220d6418", new Object[]{this});
        } else {
            this.f11996a = this.f11996a.replace("h5", "wapp");
        }
    }

    public final void r(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c35b93df", new Object[]{this, str});
            return;
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        String n = n("ActionService_ModuleMapping.js", zca.a());
        if (!TextUtils.isEmpty(n)) {
            e(JSON.parseObject(n));
        }
        e(JSON.parseObject(str));
    }

    public final void d(d dVar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d02bcf", new Object[]{this, dVar, jSONArray});
            return;
        }
        String b = yaa.f().b();
        JSONObject jSONObject = null;
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String i2 = i(jSONObject2);
            if (c(b, i2) && (jSONObject == null || c(i2, i(jSONObject)))) {
                jSONObject = jSONObject2;
            }
        }
        if (jSONObject != null) {
            dVar.f11999a = jSONObject.getString("url");
        }
    }
}
