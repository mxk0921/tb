package com.taobao.android.turbo;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.bps;
import tb.ckf;
import tb.mnv;
import tb.mqu;
import tb.s4d;
import tb.sj4;
import tb.t2o;
import tb.tpu;
import tb.xod;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TurboEngineConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final String TAG = "TurboEngineConfig";

    /* renamed from: a  reason: collision with root package name */
    public final Context f9719a;
    public final xod b;
    public final s4d c;
    public final String d;
    public final Map<String, String> e;
    public final Map<String, Object> f;
    public final Object g;
    public final Activity h;
    public final String i;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/turbo/TurboEngineConfig$ConfigType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", NetworkAbility.API_GET_TYPE, "()Ljava/lang/String;", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ConfigType {
        ;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String type;

        ConfigType(String str) {
            this.type = str;
        }

        public static /* synthetic */ Object ipc$super(ConfigType configType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/TurboEngineConfig$ConfigType");
        }

        public static ConfigType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("b2dcf828", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(ConfigType.class, str);
            }
            return (ConfigType) valueOf;
        }

        public final String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.type;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f9720a;
        public xod b;
        public s4d c;
        public String d;
        public Map<String, String> e;
        public Map<String, ? extends Object> f;
        public Object g;
        public Activity h;
        public String i;

        static {
            t2o.a(919601156);
        }

        public final TurboEngineConfig a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TurboEngineConfig) ipChange.ipc$dispatch("4169cbd2", new Object[]{this});
            }
            if (this.f9720a == null) {
                throw new IllegalArgumentException("Context must be set");
            } else if (this.b == null) {
                throw new IllegalArgumentException("ServiceRegistry must be set");
            } else if (this.d == null) {
                throw new IllegalArgumentException("URL must be set");
            } else if (this.h != null) {
                Context context = this.f9720a;
                ckf.d(context);
                xod xodVar = this.b;
                ckf.d(xodVar);
                s4d s4dVar = this.c;
                String str = this.d;
                ckf.d(str);
                Map<String, String> map = this.e;
                ckf.d(map);
                Map<String, ? extends Object> map2 = this.f;
                Object obj = this.g;
                Activity activity = this.h;
                ckf.d(activity);
                return new TurboEngineConfig(context, xodVar, s4dVar, str, map, map2, obj, activity, this.i, null);
            } else {
                throw new IllegalArgumentException("UTActivity must be set");
            }
        }

        public final a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3d8fe28e", new Object[]{this, str});
            }
            ckf.g(str, "biz");
            this.i = str;
            return this;
        }

        public final a c(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a5cd0556", new Object[]{this, map});
            }
            ckf.g(map, "config");
            this.f = map;
            return this;
        }

        public final a d(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("655c951c", new Object[]{this, context});
            }
            ckf.g(context, "context");
            this.f9720a = context;
            return this;
        }

        public final a e(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aedd7383", new Object[]{this, obj});
            }
            ckf.g(obj, "host");
            this.g = obj;
            return this;
        }

        public final a f(s4d s4dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("df48949f", new Object[]{this, s4dVar});
            }
            ckf.g(s4dVar, "outerInstanceRegistry");
            this.c = s4dVar;
            return this;
        }

        public final a g(xod xodVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("39872c99", new Object[]{this, xodVar});
            }
            ckf.g(xodVar, "serviceRegistry");
            this.b = xodVar;
            return this;
        }

        public final a h(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5b34e707", new Object[]{this, activity});
            }
            ckf.g(activity, "utActivity");
            this.h = activity;
            return this;
        }

        public final a i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("843a21b2", new Object[]{this, str});
            }
            ckf.g(str, "url");
            this.d = str;
            this.e = mnv.Companion.e(Uri.parse(str));
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601157);
        }

        public b() {
        }

        @JvmStatic
        public final a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ddaa910e", new Object[]{this});
            }
            return new a();
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601155);
    }

    public TurboEngineConfig(Context context, xod xodVar, s4d s4dVar, String str, Map<String, String> map, Map<String, ? extends Object> map2, Object obj, Activity activity, String str2) {
        this.f9719a = context;
        this.b = xodVar;
        this.c = s4dVar;
        this.d = str;
        this.e = map;
        this.f = map2;
        this.g = obj;
        this.h = activity;
        this.i = str2;
    }

    @JvmStatic
    public static final a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ddaa910e", new Object[0]);
        }
        return Companion.a();
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea033d3c", new Object[]{this});
        }
        return this.i;
    }

    public final Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("160426b4", new Object[]{this});
        }
        return this.f;
    }

    public final Context d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f9719a;
    }

    public final JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("61da8827", new Object[]{this});
        }
        String str = this.e.get("extParams");
        if (str == null) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception e) {
            tpu.Companion.a(TAG, "getExtraParams error", e);
            return null;
        }
    }

    public final Object f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d73a922d", new Object[]{this});
        }
        return this.g;
    }

    public final s4d g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s4d) ipChange.ipc$dispatch("161de657", new Object[]{this});
        }
        return this.c;
    }

    public final Map<String, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("117b7d0e", new Object[]{this});
        }
        return this.e;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1429a872", new Object[]{this});
        }
        return this.e.get("scm");
    }

    public final xod j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xod) ipChange.ipc$dispatch("2010fc73", new Object[]{this});
        }
        return this.b;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ae70bf", new Object[]{this});
        }
        return this.e.get("spm");
    }

    public final JSONObject l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("47604086", new Object[]{this});
        }
        String str = this.e.get("tab");
        if (str == null) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("303a5d5f", new Object[]{this});
        }
        return this.e.get("tabid");
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.d;
    }

    public final String o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bc339db", new Object[]{this, str});
        }
        ckf.g(str, "key");
        return this.e.get(str);
    }

    public final Activity p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("e43f963d", new Object[]{this});
        }
        return this.h;
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69d95c8c", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(mqu.Companion.i(this.e.get(bps.CONFIG_LAUNCH), null), "0");
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("206a6046", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(this.e.get("source"), sj4.TAB2_SOURCE_OUTSIDE);
    }

    public /* synthetic */ TurboEngineConfig(Context context, xod xodVar, s4d s4dVar, String str, Map map, Map map2, Object obj, Activity activity, String str2, a07 a07Var) {
        this(context, xodVar, s4dVar, str, map, map2, obj, activity, str2);
    }
}
