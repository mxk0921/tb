package com.taobao.android.fluid.framework.deprecated.message.module.notify;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.ir9;
import tb.pvh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static a b = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Context, NotifyImpl> f7809a = new HashMap();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.fluid.framework.deprecated.message.module.notify.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class C0420a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final pvh f7810a;
        public int b = 1;

        static {
            t2o.a(468714346);
        }

        public C0420a(pvh pvhVar) {
            this.f7810a = pvhVar;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bc05ded", new Object[]{this, jSONObject});
                return;
            }
            pvh pvhVar = this.f7810a;
            if (pvhVar != null) {
                pvhVar.a(jSONObject);
            }
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbdc85af", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }
    }

    static {
        t2o.a(468714345);
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a03eefde", new Object[0]);
            }
            if (b == null) {
                b = new a();
            }
            return b;
        }
    }

    public void b(com.taobao.android.weex_framework.a aVar, String str, C0420a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c386be3e", new Object[]{this, aVar, str, aVar2});
            return;
        }
        NotifyImpl notifyImpl = (NotifyImpl) ((HashMap) this.f7809a).get(aVar.getUIContext());
        if (notifyImpl == null) {
            notifyImpl = new NotifyImpl();
            ((HashMap) this.f7809a).put(aVar.getUIContext(), notifyImpl);
        }
        ir9.a("WeexNotifyManager", "dispatchRegister" + str);
        notifyImpl.a(aVar.getUIContext().getApplicationContext(), str, aVar2);
    }

    public void c(com.taobao.android.weex_framework.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3b1584", new Object[]{this, aVar, str});
            return;
        }
        NotifyImpl notifyImpl = (NotifyImpl) ((HashMap) this.f7809a).get(aVar.getUIContext());
        if (notifyImpl != null) {
            notifyImpl.b(aVar.getUIContext().getApplicationContext(), str);
        }
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25121b7c", new Object[]{this, context});
            return;
        }
        NotifyImpl notifyImpl = (NotifyImpl) ((HashMap) this.f7809a).get(context);
        if (notifyImpl != null) {
            notifyImpl.c(context.getApplicationContext());
            ((HashMap) this.f7809a).remove(context);
        }
    }
}
