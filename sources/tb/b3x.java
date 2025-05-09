package tb;

import android.app.Application;
import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.b;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.taobao.initializer.kernel.TMSInitTaskExecutorType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b3x extends z8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f16167a;

        public a(Application application) {
            this.f16167a = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b3x.h(this.f16167a);
            p9s.g().set(1);
        }
    }

    static {
        t2o.a(847249525);
    }

    public b3x(String str) {
        super(str);
    }

    public static void h(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7379a3", new Object[]{application});
        } else {
            b.d().c(application);
        }
    }

    public static /* synthetic */ Object ipc$super(b3x b3xVar, String str, Object... objArr) {
        if (str.hashCode() == -1265548210) {
            super.f((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/initializer/task/idle/Weex2InitTask");
    }

    @Override // tb.z8s
    public TMSInitTaskExecutorType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSInitTaskExecutorType) ipChange.ipc$dispatch("45d39259", new Object[]{this});
        }
        return TMSInitTaskExecutorType.NORMAL;
    }

    @Override // tb.z8s
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "Weex2.init";
    }

    @Override // tb.z8s
    public void f(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b491444e", new Object[]{this, application, hashMap});
            return;
        }
        super.f(application, hashMap);
        i(application);
    }

    @Override // tb.z8s
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35afa6c7", new Object[]{this})).booleanValue();
        }
        if (p9s.g().get() == 0 || p9s.g().get() == 1) {
            return true;
        }
        return false;
    }

    public final void i(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b415e446", new Object[]{this, application});
            return;
        }
        no8 h = h8s.h(application.getApplicationContext(), "postDelayInitWeexV2");
        if (!h.d() || h.c() == 0) {
            h(application);
            p9s.g().set(1);
        } else {
            Handler b = CommonExtKt.b();
            TMSLogger.b(z8s.TAG, "Weex2InitTask postDelay index: " + h.c());
            if (b != null) {
                b.postDelayed(new a(application), h.c() * 1000);
            }
        }
        vxm.b.e().a("postDelayInitWeexV2", h.b());
    }
}
