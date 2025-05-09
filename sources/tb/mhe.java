package tb;

import android.util.Log;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mhe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24040a;
        public final /* synthetic */ Runnable b;
        public final /* synthetic */ long c;

        public a(String str, Runnable runnable, long j) {
            this.f24040a = str;
            this.b = runnable;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Log.e("IdleChecker", "kickoff " + this.f24040a);
            Choreographer.getInstance().postFrameCallback(new ohe(this.f24040a, System.nanoTime(), this.b, this.c));
        }
    }

    public static void a(String str, Runnable runnable) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519b00cc", new Object[]{str, runnable});
            return;
        }
        if (c21.g().getBoolean("isFullNewInstall", false)) {
            i = 10000;
        } else {
            i = 4000;
        }
        b(str, runnable, i);
    }

    public static void b(String str, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c58f78", new Object[]{str, runnable, new Long(j)});
            return;
        }
        Log.e("IdleChecker", "setup for " + str + " with timeout " + j + "ms");
        LauncherRuntime.k(new a(str, runnable, j));
    }
}
