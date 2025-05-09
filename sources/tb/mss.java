package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class mss extends vct<String, Void> implements lss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                mss.k(mss.this);
            }
        }
    }

    private mss() {
    }

    public static /* synthetic */ Object ipc$super(mss mssVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/task/TaggedTask");
    }

    public static /* synthetic */ void k(mss mssVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29845e7", new Object[]{mssVar});
        } else {
            mssVar.n();
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7568d9", new Object[]{this});
        } else if (o()) {
            p(LauncherRuntime.h, hhg.c(c()));
        } else {
            p(LauncherRuntime.h, null);
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd9904d3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* renamed from: m */
    public Void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("68657001", new Object[]{this});
        }
        if (l()) {
            new Thread(new a(), c()).start();
            return null;
        }
        n();
        return null;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c246ea2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract /* synthetic */ void p(Application application, HashMap hashMap);

    public mss(String str) {
        g(str);
    }
}
