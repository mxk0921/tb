package com.alibaba.android.nextrpc.internal.accs;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.wdb;
import tb.wuv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AccsServiceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f2221a = new Object();
    public final Map<String, List<wdb>> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final AccsServiceManager f2222a = new AccsServiceManager();

        public static /* synthetic */ AccsServiceManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccsServiceManager) ipChange.ipc$dispatch("d4dc1b5b", new Object[0]);
            }
            return f2222a;
        }
    }

    public static AccsServiceManager b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsServiceManager) ipChange.ipc$dispatch("b928ffa0", new Object[0]);
        }
        return a.a();
    }

    public void a(Context context, String str, wdb wdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df3d17b", new Object[]{this, context, str, wdbVar});
            return;
        }
        synchronized (this.f2221a) {
            try {
                List list = (List) ((ConcurrentHashMap) this.b).get(str);
                if (list == null) {
                    GlobalClientInfo.getInstance(context).registerService(str, AccsReceiveService.class.getName());
                    list = new ArrayList();
                }
                list.add(wdbVar);
                ((ConcurrentHashMap) this.b).put(str, list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b07258", new Object[]{this, str, str2, str3, str4});
            return;
        }
        synchronized (this.f2221a) {
            try {
                wuv.b("nextrpc-accs-response", null, str, new HashMap<String, String>(str4) { // from class: com.alibaba.android.nextrpc.internal.accs.AccsServiceManager.1
                    public final /* synthetic */ String val$header;

                    {
                        this.val$header = str4;
                        put("header", str4);
                    }
                });
                List<wdb> list = (List) ((ConcurrentHashMap) this.b).get(str);
                if (list != null) {
                    for (wdb wdbVar : list) {
                        wdbVar.a(str, str2, str3, JSON.parseObject(str4));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Context context, String str, wdb wdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84fad94", new Object[]{this, context, str, wdbVar});
            return;
        }
        synchronized (this.f2221a) {
            try {
                List list = (List) ((ConcurrentHashMap) this.b).get(str);
                if (list != null) {
                    if (list.contains(wdbVar)) {
                        list.remove(wdbVar);
                    }
                    if (list.size() == 0) {
                        ((ConcurrentHashMap) this.b).remove(str);
                        GlobalClientInfo.getInstance(context).unregisterListener(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
