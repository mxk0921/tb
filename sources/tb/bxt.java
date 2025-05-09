package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.pub_kit.teenager_protect.PubTeenagerEditionSwitchListener;
import com.taobao.themis.taobao.initializer.kernel.TMSInitTaskExecutorType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class bxt extends z8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(847249522);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(847249521);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxt(String str) {
        super(str);
        ckf.g(str, "parentName");
    }

    public static /* synthetic */ Object ipc$super(bxt bxtVar, String str, Object... objArr) {
        if (str.hashCode() == 1344301040) {
            super.c((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/initializer/task/idle/TinyAppTeenagerProtectIdleTask");
    }

    @Override // tb.z8s
    public void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502067f0", new Object[]{this, application, hashMap});
            return;
        }
        super.c(application, hashMap);
        t1c t1cVar = (t1c) n78.a(t1c.class);
        if (t1cVar != null) {
            t1cVar.addChangeVersionListener(PubTeenagerEditionSwitchListener.INSTANCE);
        }
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
        return "TinyAppTeenagerProtectIdleTask";
    }
}
