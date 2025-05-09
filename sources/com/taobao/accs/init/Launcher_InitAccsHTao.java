package com.taobao.accs.init;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.rd0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Launcher_InitAccsHTao extends Launcher_InitAccs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933119);
    }

    public static /* synthetic */ Object ipc$super(Launcher_InitAccsHTao launcher_InitAccsHTao, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.init((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/init/Launcher_InitAccsHTao");
    }

    @Override // com.taobao.accs.init.Launcher_InitAccs
    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        Launcher_InitAccs.defaultAppkey = "";
        super.init(application, hashMap);
        rd0.b = "com.taobao.taobao.TaobaoIntentService";
    }
}
