package com.taobao.accs.init;

import android.app.Application;
import android.content.ComponentName;
import android.text.TextUtils;
import anet.channel.util.AppLifecycle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsException;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import java.util.HashMap;
import tb.brt;
import tb.j8l;
import tb.re;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Launcher_CrossActivityStarted implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ACCSClient.getAccsClient().bindApp(Launcher_InitAccs.mTtid, Launcher_InitAccs.mAppReceiver);
            } catch (AccsException e) {
                ALog.e("Launcher_CrossActivityStarted", "bindApp", e, new Object[0]);
            }
        }
    }

    static {
        t2o.a(343933109);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        try {
            ALog.e("Launcher_CrossActivityStarted", "onStarted", new Object[0]);
            AppLifecycle.onForeground();
            if (!TextUtils.isEmpty(Launcher_InitAccs.mAppkey) && Launcher_InitAccs.mContext != null) {
                if (Launcher_InitAccs.mIsInited) {
                    if (j8l.u() && !re.u(new ComponentName(Launcher_InitAccs.mContext, AccsIPCProvider.class))) {
                        return;
                    }
                    brt.b(new a());
                    return;
                }
                return;
            }
            ALog.e("Launcher_CrossActivityStarted", "params null!!!", "appkey", Launcher_InitAccs.mAppkey, "context", Launcher_InitAccs.mContext);
        } catch (Throwable th) {
            ALog.e("Launcher_CrossActivityStarted", "onStarted", th, new Object[0]);
            th.printStackTrace();
        }
    }
}
