package com.taobao.themis.inside.adapter;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.orange.OConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.themis.inside.TMSSDK;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import tb.ckf;
import tb.obk;
import tb.p8s;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSOrangeProxy;", "Lcom/taobao/themis/kernel/adapter/IConfigAdapter;", "<init>", "()V", "", "groupName", "", "getConfigs", "(Ljava/lang/String;)Ljava/util/Map;", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getCustomConfig", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getCustomConfigByLocal", "groupKey", "Ltb/xhv;", "clearConfigLocal", "(Ljava/lang/String;Ljava/lang/String;)V", OConstant.DIMEN_CONFIG_NAME, "getConfigByGroupAndName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getConfigByGroupAndNameFromLocal", "Lcom/taobao/themis/kernel/adapter/IConfigAdapter$a;", "configListener", "registerListener", "(Ljava/lang/String;Lcom/taobao/themis/kernel/adapter/IConfigAdapter$a;)V", "unregisterListener", "(Ljava/lang/String;)V", "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSOrangeProxy implements IConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSOrangeProxy INSTANCE = new TMSOrangeProxy();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, obk> f13548a = new ConcurrentHashMap();
    public static final SharedPreferences b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13549a;
        public final /* synthetic */ IConfigAdapter.a b;

        public a(String str, IConfigAdapter.a aVar) {
            this.f13549a = str;
            this.b = aVar;
        }

        @Override // tb.obk
        public final void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (ckf.b(str, this.f13549a)) {
                this.b.a(map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements IConfigAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13550a;

        public b(String str) {
            this.f13550a = str;
        }

        @Override // com.taobao.themis.kernel.adapter.IConfigAdapter.a
        public final void a(Map<String, String> map) {
            SharedPreferences.Editor edit;
            SharedPreferences.Editor putString;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("943a89b4", new Object[]{this, map});
                return;
            }
            String p = ckf.p("tms_local_orange_version_code_", this.f13550a);
            String str = map.get("configVersion");
            if (str != null) {
                SharedPreferences access$getMSp$p = TMSOrangeProxy.access$getMSp$p();
                if (!ckf.b(str, access$getMSp$p == null ? null : access$getMSp$p.getString(p, ""))) {
                    SharedPreferences access$getMSp$p2 = TMSOrangeProxy.access$getMSp$p();
                    if (!(access$getMSp$p2 == null || (edit = access$getMSp$p2.edit()) == null || (putString = edit.putString(p, str)) == null)) {
                        putString.apply();
                    }
                    Map<String, String> configs = OrangeConfig.getInstance().getConfigs(this.f13550a);
                    ckf.f(configs, "getInstance().getConfigs(groupName)");
                    String str2 = this.f13550a;
                    for (Map.Entry<String, String> entry : configs.entrySet()) {
                        TMSOrangeProxy tMSOrangeProxy = TMSOrangeProxy.INSTANCE;
                        String key = entry.getKey();
                        ckf.f(key, "entry.key");
                        String value = entry.getValue();
                        ckf.f(value, "entry.value");
                        TMSOrangeProxy.access$writeConfigToLocal(tMSOrangeProxy, str2, key, value);
                    }
                }
            }
        }
    }

    public static final /* synthetic */ SharedPreferences access$getMSp$p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("154d771b", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ void access$writeConfigToLocal(TMSOrangeProxy tMSOrangeProxy, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9152ec66", new Object[]{tMSOrangeProxy, str, str2, str3});
        } else {
            tMSOrangeProxy.c(str, str2, str3);
        }
    }

    public final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb75ebbc", new Object[]{this, str, str2});
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString(str + '_' + str2, "");
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("247f2c88", new Object[]{this, str});
        } else if (!((ConcurrentHashMap) f13548a).containsKey(str)) {
            registerListener(str, new b(str));
        }
    }

    public final void c(String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd8658d4", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str3) && (sharedPreferences = b) != null && (edit = sharedPreferences.edit()) != null) {
            SharedPreferences.Editor putString = edit.putString(str + '_' + str2, str3);
            if (putString != null) {
                putString.apply();
            }
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public void clearConfigLocal(String str, String str2) {
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ead7", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "groupName");
        ckf.g(str2, "groupKey");
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            SharedPreferences.Editor putString = edit.putString(str + '_' + str2, "");
            if (putString != null) {
                putString.commit();
            }
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getConfigByGroupAndName(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaea1109", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "groupName");
        ckf.g(str2, OConstant.DIMEN_CONFIG_NAME);
        String config = OrangeConfig.getInstance().getConfig(str, str2, "");
        b(str);
        if (TextUtils.isEmpty(config)) {
            return str3;
        }
        ckf.f(config, "config");
        c(str, str2, config);
        return config;
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getConfigByGroupAndNameFromLocal(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac4d0e8c", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "groupName");
        ckf.g(str2, OConstant.DIMEN_CONFIG_NAME);
        String config = OrangeConfig.getInstance().getConfig(str, str2, "");
        b(str);
        if (!TextUtils.isEmpty(config)) {
            ckf.f(config, "config");
            c(str, str2, config);
        } else {
            config = a(str, str2);
        }
        if (!TextUtils.isEmpty(config)) {
            str3 = config;
        }
        ckf.f(str3, "config");
        return str3;
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public Map<String, String> getConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return OrangeConfig.getInstance().getConfigs(str);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getCustomConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a44377c", new Object[]{this, str, str2});
        }
        if (str == null) {
            return null;
        }
        return OrangeConfig.getInstance().getCustomConfig(str, str2);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getCustomConfigByLocal(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d54b1ba", new Object[]{this, str, str2});
        }
        ckf.g(str, "groupName");
        String customConfig = OrangeConfig.getInstance().getCustomConfig(str, "");
        b(str);
        if (!TextUtils.isEmpty(customConfig)) {
            ckf.f(customConfig, "config");
            c(str, str, customConfig);
        } else {
            customConfig = a(str, str);
        }
        if (TextUtils.isEmpty(customConfig)) {
            return str2;
        }
        return customConfig;
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public void registerListener(String str, IConfigAdapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d4c23d", new Object[]{this, str, aVar});
            return;
        }
        ckf.g(str, "groupName");
        ckf.g(aVar, "configListener");
        a aVar2 = new a(str, aVar);
        ((ConcurrentHashMap) f13548a).put(str, aVar2);
        OrangeConfig.getInstance().registerListener(new String[]{str}, aVar2, true);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public void unregisterListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dfcfa1", new Object[]{this, str});
            return;
        }
        ckf.g(str, "groupName");
        obk obkVar = (obk) ((ConcurrentHashMap) f13548a).remove(str);
        if (obkVar != null) {
            OrangeConfig.getInstance().unregisterListener(new String[]{str}, obkVar);
        }
    }

    static {
        t2o.a(837812303);
        t2o.a(839909461);
        Context context = TMSSDK.getContext();
        SharedPreferences sharedPreferences = null;
        SharedPreferences sharedPreferences2 = context == null ? null : context.getSharedPreferences("tms_local_orange", 0);
        if (sharedPreferences2 == null) {
            Application applicationContext = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext();
            if (applicationContext != null) {
                sharedPreferences = applicationContext.getSharedPreferences("tms_local_orange", 0);
            }
        } else {
            sharedPreferences = sharedPreferences2;
        }
        b = sharedPreferences;
    }
}
