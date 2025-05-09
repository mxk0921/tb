package com.taobao.schedule;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.InternalPreloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ja8;
import tb.la8;
import tb.pxn;
import tb.ra8;
import tb.z1c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<z1c> f11528a = new ArrayList();

    public final void a(z1c z1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf59b777", new Object[]{this, z1cVar});
        } else {
            ((ArrayList) this.f11528a).add(z1cVar);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.schedule.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class RunnableC0650a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11529a;
        public final /* synthetic */ z1c b;
        public final /* synthetic */ Map c;

        public RunnableC0650a(String str, z1c z1cVar, Map map) {
            this.f11529a = str;
            this.b = z1cVar;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                if ("touch_cancel".equals(this.f11529a)) {
                    this.b.c(this.c);
                } else {
                    this.b.b(this.c);
                }
            } catch (Throwable th) {
                la8.b("elastic.Preload", "[trigger] error.", th, new Object[0]);
            }
            la8.c("elastic.Preload", "[trigger] called.", "name", this.b.toString(), "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        String f = pxn.d().f();
        if (!TextUtils.isEmpty(f)) {
            JSONArray parseArray = JSON.parseArray(f);
            for (int i = 0; i < parseArray.size(); i++) {
                InternalPreloadTask.Properties properties = (InternalPreloadTask.Properties) parseArray.getObject(i, InternalPreloadTask.Properties.class);
                if (properties == null || TextUtils.isEmpty(properties.name)) {
                    la8.c("elastic.Preload", "add preload task error, properties is null or name is empty.", new Object[0]);
                } else {
                    la8.c("elastic.Preload", "add preload task.", "task", properties.name);
                    a(new InternalPreloadTask(properties));
                    try {
                        Class[] clsArr = null;
                        ra8.f(properties.className, properties.callMethod, properties.needParams ? new Class[]{Context.class, Map.class} : null);
                        if (properties.supportCancel) {
                            String str = properties.className;
                            String str2 = properties.cancelMethod;
                            if (properties.needParams) {
                                clsArr = new Class[]{Context.class, Map.class};
                            }
                            ra8.f(str, str2, clsArr);
                        }
                    } catch (Exception e) {
                        la8.b("elastic.Preload", "putStaticMethod error.", e, new Object[0]);
                    }
                }
            }
        }
    }

    public void c(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd4d3b0", new Object[]{this, map, str});
            return;
        }
        Object obj = map.get("template");
        if (obj != null && (obj instanceof String)) {
            String str2 = (String) obj;
            Iterator it = ((ArrayList) this.f11528a).iterator();
            while (it.hasNext()) {
                z1c z1cVar = (z1c) it.next();
                if (z1cVar.a(str2, str)) {
                    la8.c("elastic.Preload", "[trigger] called.", "view", str2);
                    ja8.b(new RunnableC0650a(str, z1cVar, map));
                }
            }
        }
    }
}
