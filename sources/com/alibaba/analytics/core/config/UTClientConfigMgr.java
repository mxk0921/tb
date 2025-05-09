package com.alibaba.analytics.core.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.hsq;
import tb.m0v;
import tb.nhh;
import tb.t2o;
import tb.wu3;
import tb.zdt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UTClientConfigMgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static UTClientConfigMgr d = null;
    public boolean c = false;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f2113a = Collections.synchronizedMap(new HashMap());
    public final Map<String, List<a>> b = Collections.synchronizedMap(new HashMap());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ConfigReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f2115a;
            public final /* synthetic */ Intent b;

            public a(Context context, Intent intent) {
                this.f2115a = context;
                this.b = intent;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    String packageName = this.f2115a.getPackageName();
                    if (!TextUtils.isEmpty(packageName)) {
                        String str = this.b.getPackage();
                        if (!TextUtils.isEmpty(str) && packageName.equalsIgnoreCase(str)) {
                            UTClientConfigMgr.a(UTClientConfigMgr.this, this.b.getStringExtra("key"), this.b.getStringExtra("value"));
                        }
                    }
                } catch (Throwable th) {
                    nhh.h("UTClientConfigMgr", th, new Object[0]);
                }
            }
        }

        static {
            t2o.a(962592830);
        }

        public ConfigReceiver() {
        }

        public static /* synthetic */ Object ipc$super(ConfigReceiver configReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/config/UTClientConfigMgr$ConfigReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                zdt.c().f(new a(context, intent));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        String getKey();

        void onChange(String str);
    }

    static {
        t2o.a(962592829);
    }

    public static /* synthetic */ void a(UTClientConfigMgr uTClientConfigMgr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a658e979", new Object[]{uTClientConfigMgr, str, str2});
        } else {
            uTClientConfigMgr.b(str, str2);
        }
    }

    public static UTClientConfigMgr c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTClientConfigMgr) ipChange.ipc$dispatch("b97fa4be", new Object[0]);
        }
        if (d == null) {
            synchronized (UTClientConfigMgr.class) {
                try {
                    if (d == null) {
                        d = new UTClientConfigMgr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static Intent f(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Intent registerReceiver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("d869e70f", new Object[]{context, broadcastReceiver, intentFilter});
        }
        if (Build.VERSION.SDK_INT < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, 4);
        return registerReceiver;
    }

    public synchronized void e(a aVar) {
        List<a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7730cc1", new Object[]{this, aVar});
            return;
        }
        if (aVar != null && !hsq.f(aVar.getKey())) {
            String key = aVar.getKey();
            if (this.f2113a.containsKey(key)) {
                aVar.onChange(this.f2113a.get(key));
            }
            if (this.b.get(key) == null) {
                list = new ArrayList<>();
            } else {
                list = this.b.get(key);
            }
            if (!list.contains(aVar)) {
                list.add(aVar);
            }
            this.b.put(key, list);
        }
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.c) {
            Context b = wu3.c().b();
            if (b != null) {
                f(b, new ConfigReceiver(), new IntentFilter(m0v.INTENT_CONFIG_CHANGE));
                this.c = true;
                nhh.f("UTClientConfigMgr", "registerReceiver");
            }
        }
    }

    public final synchronized void b(String str, String str2) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90b9a677", new Object[]{this, str, str2});
                return;
            }
            nhh.f("UTClientConfigMgr", "dispatchConfig key", str, "value", str2);
            if (!TextUtils.isEmpty(str)) {
                this.f2113a.put(str, str2);
                List<a> list = this.b.get(str);
                if (list != null) {
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).onChange(str2);
                    }
                }
            }
        }
    }
}
