package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.taobao.initializer.kernel.TMSInitTaskExecutorType;
import com.taobao.weex.LauncherInitWeexNew;
import com.taobao.weex.c;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y2x extends z8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249524);
    }

    public y2x(String str) {
        super(str);
    }

    public static void h(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1733f730", new Object[]{application, hashMap});
            return;
        }
        new LauncherInitWeexNew().init(application, hashMap);
        new c().a(application, hashMap);
    }

    public static /* synthetic */ Object ipc$super(y2x y2xVar, String str, Object... objArr) {
        if (str.hashCode() == -1265548210) {
            super.f((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/initializer/task/idle/Weex1InitTask");
    }

    @Override // tb.z8s
    public TMSInitTaskExecutorType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSInitTaskExecutorType) ipChange.ipc$dispatch("45d39259", new Object[]{this});
        }
        return TMSInitTaskExecutorType.IDLE;
    }

    @Override // tb.z8s
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "Weex1.init";
    }

    @Override // tb.z8s
    public void f(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b491444e", new Object[]{this, application, hashMap});
            return;
        }
        super.f(application, hashMap);
        h(application, hashMap);
        p9s.f().set(1);
    }

    @Override // tb.z8s
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35afa6c7", new Object[]{this})).booleanValue();
        }
        if (p9s.f().get() == 1 || p9s.f().get() == 0) {
            return true;
        }
        return false;
    }
}
