package com.alibaba.analytics.core.sync;

import android.text.TextUtils;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import tb.nhh;
import tb.o2w;
import tb.q6e;
import tb.t2o;
import tb.xzu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UploadLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f2126a = 3;
    public q6e b = null;
    public NetworkStatus c = NetworkStatus.ALL;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum NetworkStatus {
        ALL,
        WIFI,
        TWO_GENERATION,
        THRID_GENERATION,
        FOUR_GENERATION,
        NONE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(NetworkStatus networkStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/sync/UploadLog$NetworkStatus");
        }

        public static NetworkStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetworkStatus) ipChange.ipc$dispatch("5330f5f9", new Object[]{str});
            }
            return (NetworkStatus) Enum.valueOf(NetworkStatus.class, str);
        }
    }

    static {
        t2o.a(962592954);
    }

    public NetworkStatus a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatus) ipChange.ipc$dispatch("d6e005d1", new Object[]{this});
        }
        String h = NetworkUtil.h();
        if ("2G".equalsIgnoreCase(h)) {
            return NetworkStatus.TWO_GENERATION;
        }
        if ("3G".equalsIgnoreCase(h)) {
            return NetworkStatus.THRID_GENERATION;
        }
        if ("4G".equalsIgnoreCase(h)) {
            return NetworkStatus.FOUR_GENERATION;
        }
        if ("Wi-Fi".equalsIgnoreCase(h)) {
            return NetworkStatus.WIFI;
        }
        return NetworkStatus.NONE;
    }

    public void c(NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2154d2f", new Object[]{this, networkStatus});
        } else {
            this.c = networkStatus;
        }
    }

    public void d(q6e q6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e40d0a", new Object[]{this, q6eVar});
        } else {
            this.b = q6eVar;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543d2d39", new Object[]{this, new Integer(i)});
        } else if (i < 1 || i > 10) {
            this.f2126a = 3;
        } else {
            this.f2126a = i;
        }
    }

    public void b(String str) {
        JSONObject jSONObject;
        Iterator<String> keys;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8554fc12", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                xzu f = o2w.k().f();
                if (f != null && (jSONObject = new JSONObject(str).getJSONObject("config")) != null) {
                    Iterator<String> keys2 = jSONObject.keys();
                    if (keys2 == null || !keys2.hasNext()) {
                        nhh.m(null, "No Config Update");
                        return;
                    }
                    while (keys2.hasNext()) {
                        String next = keys2.next();
                        if (!TextUtils.isEmpty(next)) {
                            HashMap hashMap = new HashMap();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (!(jSONObject2 == null || (keys = jSONObject2.keys()) == null)) {
                                while (keys.hasNext()) {
                                    String next2 = keys.next();
                                    if (jSONObject2.get(next2) == null) {
                                        str2 = null;
                                    } else {
                                        str2 = jSONObject2.get(next2) + "";
                                    }
                                    hashMap.put(next2, str2);
                                }
                            }
                            nhh.f("Config Update", "namespace", next, "configs", hashMap);
                            f.i(next, hashMap);
                        }
                    }
                }
            } catch (Throwable th) {
                nhh.h("", th, new Object[0]);
            }
        } else {
            nhh.v(null, "Config Is Empty");
        }
    }
}
