package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.taobao.impl.TBTMSSDK;
import com.taobao.themis.taobao.initializer.kernel.TMSInitTaskExecutorType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ucs extends z8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249532);
    }

    public ucs(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(ucs ucsVar, String str, Object... objArr) {
        if (str.hashCode() == -1265548210) {
            super.f((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/initializer/task/necessary/TMSSDKInitTask");
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
        return "TMSSDK.init";
    }

    @Override // tb.z8s
    public void f(Application application, HashMap<String, Object> hashMap) {
        super.f(application, hashMap);
        try {
            IpChange ipChange = TBTMSSDK.$ipChange;
            TBTMSSDK.class.getDeclaredMethod("initTBTMSNew", Context.class).invoke(null, application.getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
