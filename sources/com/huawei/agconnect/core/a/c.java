package com.huawei.agconnect.core.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.core.ServiceDiscovery;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ddp;
import tb.tdp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5228a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Serializable, Comparator<Map.Entry<String, Integer>> {
        private a() {
        }

        /* renamed from: a */
        public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry.getValue().intValue() - entry2.getValue().intValue();
        }
    }

    public c(Context context) {
        this.f5228a = context;
    }

    public List<ddp> a() {
        List<String> c = c();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) c).iterator();
        while (it.hasNext()) {
            tdp b2 = b((String) it.next());
            if (b2 != null) {
                Context context = this.f5228a;
                b2.initialize(context);
                List<ddp> a2 = b2.a(context);
                if (a2 != null) {
                    arrayList.addAll(a2);
                }
            }
        }
        arrayList.size();
        return arrayList;
    }

    public final <T extends tdp> T b(String str) {
        String str2;
        Throwable e;
        StringBuilder sb;
        try {
            Class<?> cls = Class.forName(str);
            if (tdp.class.isAssignableFrom(cls)) {
                return (T) ((tdp) Class.forName(str).newInstance());
            }
            Log.e("AGC_Registrar", cls + " must extends from ServiceRegistrar.");
            return null;
        } catch (ClassNotFoundException e2) {
            str2 = "Can not found service class, " + e2.getMessage();
            Log.e("AGC_Registrar", str2);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            sb = new StringBuilder("instantiate service class exception ");
            sb.append(e.getLocalizedMessage());
            str2 = sb.toString();
            Log.e("AGC_Registrar", str2);
            return null;
        } catch (InstantiationException e4) {
            e = e4;
            sb = new StringBuilder("instantiate service class exception ");
            sb.append(e.getLocalizedMessage());
            str2 = sb.toString();
            Log.e("AGC_Registrar", str2);
            return null;
        }
    }

    public final List<String> c() {
        String concat;
        ArrayList arrayList = new ArrayList();
        Bundle d = d();
        if (d == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap(10);
        for (String str : d.keySet()) {
            if ("com.huawei.agconnect.core.ServiceRegistrar".equals(d.getString(str))) {
                String[] split = str.split(":");
                if (split.length == 2) {
                    try {
                        hashMap.put(split[0], Integer.valueOf(split[1]));
                    } catch (NumberFormatException e) {
                        concat = "registrar configuration format error:" + e.getMessage();
                    }
                } else if (split.length == 1) {
                    hashMap.put(split[0], 1000);
                } else {
                    concat = "registrar configuration error, ".concat(str);
                    Log.e("AGC_Registrar", concat);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList2, new a());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }

    public final Bundle d() {
        ServiceInfo serviceInfo;
        Context context = this.f5228a;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ServiceDiscovery.class), 128);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AGC_Registrar", "get ServiceDiscovery exception." + e.getLocalizedMessage());
        }
        if (serviceInfo != null) {
            return serviceInfo.metaData;
        }
        Log.e("AGC_Registrar", "Can not found ServiceDiscovery service.");
        return null;
    }
}
