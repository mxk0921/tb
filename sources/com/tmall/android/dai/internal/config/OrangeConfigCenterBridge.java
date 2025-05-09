package com.tmall.android.dai.internal.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.tmall.android.dai.DAIKVStoreage;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import tb.gtf;
import tb.obk;
import tb.ral;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OrangeConfigCenterBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean LOCAL_DEBUG = false;
    public static final String TAG = "OrangeConfigCenter";
    private static volatile OrangeConfigCenterBridge sInstance;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f14205a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ long e;

        public a(int i, boolean z, String str, boolean z2, long j) {
            this.f14205a = i;
            this.b = z;
            this.c = str;
            this.d = z2;
            this.e = j;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (this.f14205a == 1) {
                gtf.i().h().execute(new RunnableC0828a(map));
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.tmall.android.dai.internal.config.OrangeConfigCenterBridge$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class RunnableC0828a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f14206a;

            public RunnableC0828a(Map map) {
                this.f14206a = map;
            }

            private String a(Collection<String> collection) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("1f859440", new Object[]{this, collection});
                }
                StringBuilder sb = null;
                for (String str : collection) {
                    if (sb == null) {
                        sb = new StringBuilder(str);
                    } else {
                        sb.append(',');
                        sb.append(str);
                    }
                }
                if (sb == null) {
                    return "";
                }
                return sb.toString();
            }

            @Override // java.lang.Runnable
            public void run() {
                Map<String, String> map;
                String[] split;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                boolean z = !"true".equals(this.f14206a.get("fromCache"));
                if (a.this.b) {
                    String str = (String) this.f14206a.get("configVersion");
                    String diskValue = DAIKVStoreage.getDiskValue("walle_orange_config_cache_group_name", a.this.c + "_inner_version__");
                    if (!str.equals(diskValue)) {
                        if (a.this.d) {
                            map = OrangeConfig.getInstance().getConfigs(a.this.c);
                        } else {
                            String customConfig = OrangeConfig.getInstance().getCustomConfig(a.this.c, "");
                            HashMap hashMap = new HashMap();
                            hashMap.put("inner_custom_key__", customConfig);
                            map = hashMap;
                        }
                        if (map != null) {
                            for (String str2 : map.keySet()) {
                                DAIKVStoreage.putToDisk("walle_orange_config_cache_group_name", a.this.c + "_" + str2, map.get(str2));
                            }
                            if (diskValue != null && diskValue.length() > 0) {
                                String diskValue2 = DAIKVStoreage.getDiskValue("walle_orange_config_cache_group_name", a.this.c + "_inner_key_list__");
                                if (diskValue2 != null) {
                                    for (String str3 : diskValue2.split(",")) {
                                        if (!map.containsKey(str3)) {
                                            DAIKVStoreage.removeFromDisk("walle_orange_config_cache_group_name", a.this.c + "_" + str3);
                                        }
                                    }
                                }
                            }
                            DAIKVStoreage.putToDisk("walle_orange_config_cache_group_name", a.this.c + "_inner_version__", str);
                            DAIKVStoreage.putToDisk("walle_orange_config_cache_group_name", a.this.c + "_inner_key_list__", a(map.keySet()));
                        } else {
                            return;
                        }
                    }
                }
                a aVar = a.this;
                OrangeConfigCenterBridge.this.onOrangeUpdateNative(aVar.e, aVar.c, z);
            }
        }
    }

    static {
        t2o.a(1034944630);
    }

    private OrangeConfigCenterBridge() {
    }

    public static OrangeConfigCenterBridge getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeConfigCenterBridge) ipChange.ipc$dispatch("1f3164b2", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (ral.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new OrangeConfigCenterBridge();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }

    public String getCustomConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a44377c", new Object[]{this, str, str2});
        }
        return OrangeConfig.getInstance().getCustomConfig(str, str2);
    }

    public native void onOrangeUpdateNative(long j, String str, boolean z);

    public void registerGroupListener(long j, HashMap<String, String> hashMap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a435dd", new Object[]{this, new Long(j), hashMap, new Integer(i)});
            return;
        }
        synchronized (this) {
            String str = hashMap.get("name");
            OrangeConfig.getInstance().registerListener(new String[]{str}, new a(i, "true".equals(hashMap.get("enable_cache")), str, "kv".equals(hashMap.get("content_type")), j), true);
        }
    }
}
