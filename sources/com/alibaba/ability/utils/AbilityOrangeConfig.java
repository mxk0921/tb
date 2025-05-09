package com.alibaba.ability.utils;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.orange.OrangeConfig;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import tb.ckf;
import tb.i04;
import tb.iih;
import tb.kfp;
import tb.njg;
import tb.obk;
import tb.ru1;
import tb.sm8;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AbilityOrangeConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AbilityOrangeConfig INSTANCE = new AbilityOrangeConfig();

    /* renamed from: a  reason: collision with root package name */
    public static Set<String> f2077a = kfp.d();
    public static Set<String> b = kfp.d();
    public static boolean c = true;
    public static final njg d = kotlin.a.b(AbilityOrangeConfig$sysPropClzz$2.INSTANCE);
    public static final Map<String, Boolean> e = new LinkedHashMap();
    public static final njg f = kotlin.a.b(AbilityOrangeConfig$isDebuggable$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.alibaba.ability.utils.AbilityOrangeConfig$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class RunnableC0056a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final RunnableC0056a INSTANCE = new RunnableC0056a();

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AbilityOrangeConfig.a(AbilityOrangeConfig.INSTANCE);
                }
            }
        }

        @Override // tb.obk
        public final void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (ckf.b("megability", str)) {
                MegaUtils.C(RunnableC0056a.INSTANCE);
            }
        }
    }

    public static final /* synthetic */ void a(AbilityOrangeConfig abilityOrangeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f0c38a", new Object[]{abilityOrangeConfig});
        } else {
            abilityOrangeConfig.l();
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d02b169", new Object[]{this})).booleanValue();
        }
        return c;
    }

    public final Set<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("98c940a5", new Object[]{this});
        }
        return f2077a;
    }

    public final Set<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("f0010a08", new Object[]{this});
        }
        return b;
    }

    public final String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49b465f7", new Object[]{this, str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("openability_option_abconfig", str, str2);
        ckf.f(config, "OrangeConfig.getInstance…   defaultValue\n        )");
        return config;
    }

    public final Class<?> g() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("fb0857d7", new Object[]{this});
        } else {
            value = d.getValue();
        }
        return (Class) value;
    }

    public final boolean h() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("4500e523", new Object[]{this});
        } else {
            value = f.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public final boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("864cbcd7", new Object[]{this, str})).booleanValue();
        }
        Map<String, Boolean> map = e;
        Boolean bool = (Boolean) ((LinkedHashMap) map).get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean i = i(str);
        map.put(str, Boolean.valueOf(i));
        return i;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d54a1", new Object[]{this});
            return;
        }
        OrangeConfig instance = OrangeConfig.getInstance();
        String config = instance.getConfig("megability", "mainThreadApis", "");
        ckf.f(config, "sApis");
        if (config.length() > 0) {
            b = i04.G0(wsq.z0(config, new String[]{","}, false, 0, 6, null));
        }
        String config2 = instance.getConfig("megability", "mainThreadAbilities", "");
        ckf.f(config2, "sAbilities");
        if (config2.length() > 0) {
            f2077a = i04.G0(wsq.z0(config2, new String[]{","}, false, 0, 6, null));
        }
        c = ckf.b(instance.getConfig("megability", "enableParametersLog", "true"), "true");
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca08143", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"megability"}, a.INSTANCE, true);
        }
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c1f887", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, ru1.FEATURE_NAME);
        ckf.g(str2, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        if (h()) {
            return ckf.b("true", f(str, str2)) || j(str);
        }
        return ckf.b("true", f(str, str2));
    }

    public final boolean i(String str) {
        Object obj;
        try {
            Class<?> g = g();
            Object obj2 = null;
            Method declaredMethod = g != null ? g.getDeclaredMethod("get", String.class) : null;
            if (declaredMethod != null) {
                obj = declaredMethod.invoke(g(), "debug.taobao.mega.switch." + str);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                obj2 = obj;
            }
            return Boolean.parseBoolean((String) obj2);
        } catch (Throwable th) {
            iih.INSTANCE.b("AbilityOrangeConfig", "获取 SystemProperties.get 方法失败：".concat(sm8.b(th)));
            return false;
        }
    }
}
