package com.taobao.android.fluid.framework.deprecated.message.module.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.notify.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.h7q;
import tb.ir9;
import tb.k7k;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class NotifyImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashMap<String, Class<? extends a>> b = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<Class<? extends a>, a> f7807a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class CommonBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<a.C0420a> f7808a = new ArrayList();

        static {
            t2o.a(468714343);
        }

        public static /* synthetic */ Object ipc$super(CommonBroadcastReceiver commonBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/deprecated/message/module/notify/NotifyImpl$CommonBroadcastReceiver");
        }

        public void a(a.C0420a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4645ec4e", new Object[]{this, aVar});
            } else {
                ((ArrayList) this.f7808a).add(aVar);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a838569", new Object[]{this});
            } else {
                ((ArrayList) this.f7808a).clear();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                try {
                    if (intent.getAction() != null) {
                        ir9.a("CommonBroadcastReceiver", intent.getAction());
                    }
                    Bundle extras = intent.getExtras();
                    JSONObject jSONObject = null;
                    if (extras != null) {
                        Set<String> keySet = extras.keySet();
                        JSONObject jSONObject2 = new JSONObject();
                        for (String str2 : keySet) {
                            Object obj = extras.get(str2);
                            if (obj == null) {
                                str = null;
                            } else {
                                str = obj.toString();
                            }
                            jSONObject2.put(str2, (Object) str);
                        }
                        jSONObject = jSONObject2;
                    }
                    Iterator it = ((ArrayList) this.f7808a).iterator();
                    while (it.hasNext()) {
                        a.C0420a aVar = (a.C0420a) it.next();
                        if (aVar.b > 0) {
                            aVar.a(jSONObject);
                            aVar.b--;
                        }
                        if (aVar.b <= 0) {
                            it.remove();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(Context context, String str);

        void b(Context context);

        void c(Context context, String str, a.C0420a aVar);
    }

    static {
        t2o.a(468714342);
        f("", k7k.class);
        f("DAI", h7q.class);
    }

    public static void f(String str, Class<? extends a> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5e56ab", new Object[]{str, cls});
        } else {
            b.put(str, cls);
        }
    }

    public void a(Context context, String str, a.C0420a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe87bb4f", new Object[]{this, context, str, aVar});
            return;
        }
        a e = e(str);
        if (e != null) {
            e.c(context, str, aVar);
        }
    }

    public void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bea3575", new Object[]{this, context, str});
            return;
        }
        a e = e(str);
        if (e != null) {
            e.a(context, str);
        }
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10067b6", new Object[]{this, context});
            return;
        }
        for (Map.Entry<Class<? extends a>, a> entry : this.f7807a.entrySet()) {
            a value = entry.getValue();
            if (value != null) {
                value.b(context);
            }
        }
        this.f7807a.clear();
    }

    public final String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca148191", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("_");
            if (split.length > 1) {
                return split[0];
            }
        }
        return "";
    }

    public final a e(String str) {
        Class<? extends a> cls;
        String d = d(str);
        try {
            boolean isEmpty = TextUtils.isEmpty(d);
            HashMap<String, Class<? extends a>> hashMap = b;
            if (!isEmpty) {
                cls = hashMap.get(d);
            } else {
                cls = hashMap.get("");
            }
            if (cls != null) {
                HashMap<Class<? extends a>, a> hashMap2 = this.f7807a;
                a aVar = hashMap2.get(cls);
                if (aVar != null) {
                    return aVar;
                }
                a aVar2 = (a) cls.newInstance();
                hashMap2.put(cls, aVar2);
                return aVar2;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
