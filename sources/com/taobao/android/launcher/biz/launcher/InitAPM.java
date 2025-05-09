package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.monitor.adapter.TBAPMAdapterLauncher;
import com.taobao.monitor.adapter.TBAPMInitiator;
import java.util.HashMap;
import tb.bxk;
import tb.eiq;
import tb.nnl;
import tb.t5r;
import tb.vrg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InitAPM extends bxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class WelcomeBAPMInitiator extends TBAPMInitiator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private WelcomeBAPMInitiator() {
        }

        public static /* synthetic */ Object ipc$super(WelcomeBAPMInitiator welcomeBAPMInitiator, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1273028391) {
                super.initPage((Application) objArr[0]);
                return null;
            } else if (hashCode == 247898730) {
                super.initExpendLauncher((Application) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/launcher/biz/launcher/InitAPM$WelcomeBAPMInitiator");
            }
        }

        @Override // com.taobao.monitor.adapter.AbsAPMInitiator
        public void initExpendLauncher(Application application) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec6a26a", new Object[]{this, application});
            } else {
                super.initExpendLauncher(application);
            }
        }

        @Override // com.taobao.monitor.adapter.TBAPMInitiator, com.taobao.monitor.adapter.AbsAPMInitiator
        public void initPage(Application application) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b41f20d9", new Object[]{this, application});
                return;
            }
            super.initPage(application);
            nnl.n("com.taobao.tao.welcome.Welcome");
            nnl.g("com.taobao.tao.welcome.Welcome");
            t5r.b("welBreak", Boolean.TRUE);
        }
    }

    public InitAPM(String str) {
        super(str);
        i(true);
    }

    public static /* synthetic */ Object ipc$super(InitAPM initAPM, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitAPM");
    }

    @Override // tb.bxk, tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        if (LauncherRuntime.m) {
            new TBAPMAdapterLauncher().init(application, hashMap);
        } else {
            new WelcomeBAPMInitiator().init(application, hashMap);
        }
        t5r.b("isLinkOptOpened", Boolean.valueOf(vrg.b(application)));
        eiq.a(application, hashMap);
    }
}
