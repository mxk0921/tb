package com.taobao.accs.init;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsException;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.TaobaoRegister;
import java.io.Serializable;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Launcher_Logout implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = Launcher_Logout.class.getSimpleName();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends ICallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Launcher_Logout launcher_Logout) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/init/Launcher_Logout$1");
        }

        @Override // com.taobao.agoo.ICallback
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            } else if (ALog.isPrintLog(ALog.Level.D)) {
                String access$000 = Launcher_Logout.access$000();
                ALog.d(access$000, "removeAlias fail, errDesc:" + str2 + " errorCode:" + str, new Object[0]);
            }
        }

        @Override // com.taobao.agoo.ICallback
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(Launcher_Logout.access$000(), "removeAlias success", new Object[0]);
            }
        }
    }

    static {
        t2o.a(343933127);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return TAG;
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        ALog.i("Launcher_Logout", "logout", new Object[0]);
        Launcher_InitAccs.mUserId = null;
        Launcher_InitAccs.mSid = null;
        try {
            ACCSClient.getAccsClient().unbindUser();
            TaobaoRegister.removeAlias(application, new a(this));
        } catch (AccsException e) {
            ALog.e(TAG, e.getMessage(), new Object[0]);
        }
    }
}
