package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.g1q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k1q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SkinStorage";
    public static volatile k1q e;
    public Map<String, Map<String, String>> b;
    public SkinConfig c;
    public final Map<String, SkinConfig> d = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f22348a = w69.f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends TypeReference<Map<String, Map<String, String>>> {
        public a(k1q k1qVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends TypeReference<Map<String, Map<String, String>>> {
        public b(k1q k1qVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Comparator<SkinConfig> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(k1q k1qVar) {
        }

        /* renamed from: a */
        public int compare(SkinConfig skinConfig, SkinConfig skinConfig2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8e7b205f", new Object[]{this, skinConfig, skinConfig2})).intValue();
            }
            if (skinConfig == null && skinConfig2 == null) {
                return 0;
            }
            if (skinConfig == null) {
                return 1;
            }
            if (skinConfig2 == null) {
                return -1;
            }
            return Long.compare(skinConfig2.updateTime, skinConfig.updateTime);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22349a;

        public d(k1q k1qVar, String str) {
            this.f22349a = str;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            if (file == null || !file.getName().startsWith(this.f22349a)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                g1q.h().p("{}", new hy6());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SkinConfig f22351a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends hy6 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: tb.k1q$f$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class RunnableC0961a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public RunnableC0961a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    f fVar = f.this;
                    k1q.this.C(fVar.f22351a);
                    TLog.loge("festival", "", "endUpdate");
                }
            }

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/festival/core/SkinStorager$6$1");
            }

            @Override // tb.hy6, tb.xkb
            public void onSuccess(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                    return;
                }
                TLog.loge("festival", "", "cleared");
                Coordinator.execute(new RunnableC0961a());
            }
        }

        public f(SkinConfig skinConfig) {
            this.f22351a = skinConfig;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                g1q.h().p("{}", new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g extends AsyncTask<Void, Void, Map<String, Map<String, String>>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final h f22354a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends TypeReference<Map<String, SkinConfig>> {
            public a(g gVar) {
            }
        }

        static {
            t2o.a(464519207);
        }

        public g(h hVar) {
            this.f22354a = hVar;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/festival/core/SkinStorager$InitTask");
        }

        /* renamed from: a */
        public Map<String, Map<String, String>> doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("31595d6c", new Object[]{this, voidArr});
            }
            String g = b1q.g(b1q.SP_KEY_CACHED_SKIN_MAP);
            if (TextUtils.isEmpty(g)) {
                return null;
            }
            k1q.a(k1q.this).putAll((Map) JSON.parseObject(g, new a(this), new Feature[0]));
            String g2 = b1q.g(b1q.SP_KEY_CURRENT_SKIN_CODE);
            if (!TextUtils.isEmpty(g2) && !k1q.a(k1q.this).isEmpty()) {
                SkinConfig skinConfig = (SkinConfig) k1q.a(k1q.this).get(g2);
                k1q.b(k1q.this, skinConfig);
                if (skinConfig != null && skinConfig.isValidConfig()) {
                    k1q k1qVar = k1q.this;
                    k1q.d(k1qVar, k1q.e(k1qVar, skinConfig));
                    if (!TextUtils.isEmpty(skinConfig.skinZipUrl)) {
                        new i1q().d(skinConfig.skinCode, skinConfig.skinZipUrl, null);
                    }
                    return k1q.c(k1q.this);
                }
            }
            return null;
        }

        /* renamed from: b */
        public void onPostExecute(Map<String, Map<String, String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c677108", new Object[]{this, map});
                return;
            }
            h hVar = this.f22354a;
            if (hVar != null) {
                if (map != null) {
                    ((g1q.a) hVar).b();
                } else {
                    ((g1q.a) hVar).a();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface h {
    }

    static {
        t2o.a(464519198);
    }

    public static /* synthetic */ Map a(k1q k1qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("73f6019f", new Object[]{k1qVar});
        }
        return k1qVar.d;
    }

    public static /* synthetic */ SkinConfig b(k1q k1qVar, SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinConfig) ipChange.ipc$dispatch("c7d2f2f1", new Object[]{k1qVar, skinConfig});
        }
        k1qVar.c = skinConfig;
        return skinConfig;
    }

    public static /* synthetic */ Map c(k1q k1qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("acd1fa5d", new Object[]{k1qVar});
        }
        return k1qVar.b;
    }

    public static /* synthetic */ Map d(k1q k1qVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a6f74fd4", new Object[]{k1qVar, map});
        }
        k1qVar.b = map;
        return map;
    }

    public static /* synthetic */ Map e(k1q k1qVar, SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83d1b6e2", new Object[]{k1qVar, skinConfig});
        }
        return k1qVar.w(skinConfig);
    }

    public static k1q q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k1q) ipChange.ipc$dispatch("51890483", new Object[0]);
        }
        if (e == null) {
            synchronized (k1q.class) {
                e = new k1q();
            }
        }
        return e;
    }

    public void A() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b390276d", new Object[]{this});
            return;
        }
        try {
            SkinConfig o = o();
            if (o != null) {
                MtopResponse b2 = f1q.b(o);
                if (b2.isApiSuccess() && b2.getBytedata() != null) {
                    JSONObject parseObject = JSON.parseObject(new String(b2.getBytedata()));
                    if (parseObject != null && !parseObject.isEmpty() && (jSONObject = parseObject.getJSONObject("data")) != null && !jSONObject.isEmpty()) {
                        if (!jSONObject.getBoolean("valid").booleanValue()) {
                            n1q.d(new e());
                            return;
                        }
                        Integer integer = jSONObject.getInteger("version");
                        if (integer.intValue() > o.version) {
                            o.version = integer.intValue();
                            o.skinUrl = jSONObject.getString("skinDownloadUrl");
                            o.skinZipUrl = jSONObject.getString("zipDownloadUrl");
                            TLog.loge("festival", "", "startUpdate");
                            n1q.d(new f(o));
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLog.loge("festival", "", "apiFail" + b2.getResponseLog());
            }
        } catch (Throwable unused) {
        }
    }

    public void C(SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d452afc", new Object[]{this, skinConfig});
        } else if (skinConfig != null && !skinConfig.equals(this.c)) {
            j(skinConfig);
            Map<String, Map<String, String>> x = x(skinConfig);
            this.c = skinConfig;
            List<String> a2 = n1q.a(x);
            if (a2.isEmpty()) {
                g1q.h().o();
            } else {
                new i1q().c(a2, new foo(skinConfig, x));
            }
        }
    }

    public h1q<Void> f(SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h1q) ipChange.ipc$dispatch("3751030f", new Object[]{this, skinConfig});
        }
        h1q<Void> h1qVar = new h1q<>();
        if (!u()) {
            h1qVar.b(false);
            h1qVar.b = "NoDownloadedSkin";
            return h1qVar;
        }
        SkinConfig s = s(skinConfig.skinCode);
        this.c = s;
        if (s != null) {
            b1q.k(b1q.SP_KEY_CURRENT_SKIN_CODE, s.skinCode);
            this.c.updateTime = System.currentTimeMillis();
            b1q.k(b1q.SP_KEY_CACHED_SKIN_MAP, JSON.toJSONString(this.d));
            Map<String, Map<String, String>> w = w(this.c);
            this.b = w;
            if (w != null) {
                h1qVar.b(true);
            } else {
                h1qVar.b(false);
                h1qVar.b = "NoSkinConfigFile";
                j(this.c);
            }
        } else {
            h1qVar.b(false);
            h1qVar.b = "NoDownloadedSkin";
        }
        return h1qVar;
    }

    public boolean g(SkinConfig skinConfig) {
        SkinConfig skinConfig2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe03ab2", new Object[]{this, skinConfig})).booleanValue();
        }
        if (((ConcurrentHashMap) this.d).isEmpty() || (skinConfig2 = (SkinConfig) ((ConcurrentHashMap) this.d).get(skinConfig.skinCode)) == null) {
            return false;
        }
        if (skinConfig2.equals(skinConfig)) {
            return true;
        }
        j(skinConfig2);
        return false;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("defaf1b9", new Object[]{this})).booleanValue();
        }
        Map<String, Map<String, String>> map = this.b;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return true;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0228428", new Object[]{this});
            return;
        }
        int d2 = w69.d(5);
        if (((ConcurrentHashMap) this.d).size() >= d2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(((ConcurrentHashMap) this.d).values());
            Collections.sort(arrayList, new c(this));
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() >= d2; size--) {
                SkinConfig skinConfig = (SkinConfig) arrayList.get(size);
                if (this.c != skinConfig) {
                    if (skinConfig != null) {
                        j(skinConfig);
                        ((ConcurrentHashMap) this.d).remove(skinConfig.skinCode);
                    }
                    arrayList.remove(size);
                }
            }
        }
    }

    public void j(SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704a783d", new Object[]{this, skinConfig});
        } else if (skinConfig != null && skinConfig.isValidConfig()) {
            try {
                b1q.c(skinConfig.skinUrl);
                b1q.c(skinConfig.skinCode);
                if (!TextUtils.isEmpty(skinConfig.skinZipUrl)) {
                    b1q.d(skinConfig.skinCode);
                }
            } catch (Throwable th) {
                TLog.loge(TAG, "clearCacheSync", th.getMessage());
            }
            if (!((ConcurrentHashMap) this.d).isEmpty()) {
                ((ConcurrentHashMap) this.d).remove(skinConfig.skinCode);
                b1q.k(b1q.SP_KEY_CACHED_SKIN_MAP, JSON.toJSONString(this.d));
            }
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2edfa10", new Object[]{this});
            return;
        }
        SkinConfig skinConfig = this.c;
        if (skinConfig != null) {
            j(skinConfig);
            skinConfig.skinCode = null;
            skinConfig.skinUrl = null;
            b1q.k(b1q.SP_KEY_CURRENT_SKIN_CODE, "");
        }
    }

    public String l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ea153ee", new Object[]{this, str, str2});
        }
        SkinConfig skinConfig = this.c;
        if (skinConfig != null && !TextUtils.isEmpty(skinConfig.skinCode) && !TextUtils.isEmpty(this.c.skinZipUrl)) {
            String h2 = b1q.h(this.c.skinCode);
            File file = new File(h2 + str);
            if (file.exists()) {
                File[] listFiles = file.listFiles(new d(this, str2));
                if (listFiles.length > 0) {
                    return listFiles[0].getAbsolutePath();
                }
            }
        }
        return null;
    }

    public String m(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8a2f584", new Object[]{this, str, str2, str3});
        }
        SkinConfig skinConfig = this.c;
        if (skinConfig != null && !TextUtils.isEmpty(skinConfig.skinCode) && !TextUtils.isEmpty(this.c.skinZipUrl)) {
            String str4 = b1q.h(this.c.skinCode) + str + File.separator + str2 + str3;
            if (new File(str4).exists()) {
                return uuo.q(str4);
            }
        }
        return null;
    }

    public String n(String str, String str2) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6204afec", new Object[]{this, str, str2});
        }
        Map<String, Map<String, String>> map2 = this.b;
        if (map2 == null || map2.isEmpty() || (map = this.b.get(str)) == null || map.isEmpty()) {
            return null;
        }
        return map.get(str2);
    }

    public SkinConfig o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinConfig) ipChange.ipc$dispatch("91c86d4d", new Object[]{this});
        }
        return this.c;
    }

    public Map<String, Map<String, String>> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c2f91526", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, String> r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fc22d04a", new Object[]{this, str});
        }
        Map<String, Map<String, String>> map = this.b;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.b.get(str);
    }

    public SkinConfig s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinConfig) ipChange.ipc$dispatch("5e38c96a", new Object[]{this, str});
        }
        return (SkinConfig) ((ConcurrentHashMap) this.d).get(str);
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("296f7877", new Object[]{this});
        }
        return this.f22348a;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d669004", new Object[]{this})).booleanValue();
        }
        return true ^ ((ConcurrentHashMap) this.d).isEmpty();
    }

    public void v(h hVar) {
        Map<String, Map<String, String>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f7b087", new Object[]{this, hVar});
            return;
        }
        SkinConfig skinConfig = this.c;
        if (skinConfig == null || !skinConfig.isValidConfig() || (map = this.b) == null || map.isEmpty()) {
            new g(hVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else if (hVar != null) {
            ((g1q.a) hVar).c();
        }
    }

    public final Map<String, Map<String, String>> w(SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5fa4e9bd", new Object[]{this, skinConfig});
        }
        Map<String, Map<String, String>> map = null;
        if (!skinConfig.isValidConfig()) {
            return null;
        }
        try {
            byte[] j = b1q.j(skinConfig.skinCode);
            if (j != null && j.length > 0) {
                map = (Map) JSON.parseObject(new String(j), new a(this), new Feature[0]);
            }
            if (this.f22348a.contains(skinConfig.skinCode)) {
                for (Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
                    Map<String, String> value = entry.getValue();
                    for (String str : value.keySet()) {
                        if (value.containsKey(str)) {
                            if (value.containsKey(str + "_downgrade")) {
                                value.put(str, value.get(str + "_downgrade"));
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            TLog.loge(TAG, "loadCachedConfigSync", e2);
        }
        return map;
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd07599a", new Object[]{this});
            return;
        }
        this.c = null;
        this.b = null;
        b1q.k(b1q.SP_KEY_CURRENT_SKIN_CODE, "");
        FestivalMgr.i().I(false);
        com.taobao.tao.navigation.a.N();
    }

    public void z(Map<String, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beda80f1", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    public Map<String, Map<String, String>> x(SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e2683720", new Object[]{this, skinConfig});
        }
        try {
            byte[] a2 = f1q.a(skinConfig.skinUrl);
            if (a2 == null || a2.length <= 0) {
                return null;
            }
            b1q.c(skinConfig.skinCode);
            b1q.m(skinConfig.skinCode, a2);
            skinConfig.updateTime = System.currentTimeMillis();
            b1q.k(b1q.SP_KEY_CURRENT_SKIN_CODE, skinConfig.skinCode);
            ((ConcurrentHashMap) this.d).put(skinConfig.skinCode, skinConfig);
            b1q.k(b1q.SP_KEY_CACHED_SKIN_MAP, JSON.toJSONString(this.d));
            return (Map) JSON.parseObject(new String(a2), new b(this), new Feature[0]);
        } catch (IOException e2) {
            TLog.loge(TAG, "reloadSkin error", e2);
            return null;
        }
    }

    public h1q<Void> B(SkinConfig skinConfig, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h1q) ipChange.ipc$dispatch("5dee6feb", new Object[]{this, skinConfig, bArr});
        }
        try {
            b1q.m(skinConfig.skinCode, bArr);
            skinConfig.updateTime = System.currentTimeMillis();
            ((ConcurrentHashMap) this.d).put(skinConfig.skinCode, skinConfig);
            b1q.k(b1q.SP_KEY_CACHED_SKIN_MAP, JSON.toJSONString(this.d));
            h1q<Void> h1qVar = new h1q<>();
            h1qVar.b(true);
            return h1qVar;
        } catch (Throwable unused) {
            h1q<Void> h1qVar2 = new h1q<>();
            h1qVar2.b(false);
            h1qVar2.b = "updateFile file error.";
            h1qVar2.c = "IO_ERROR";
            return h1qVar2;
        }
    }
}
