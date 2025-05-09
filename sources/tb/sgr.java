package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.jacoco.DumpJacocoTask;
import org.jacoco.agent.rt.RT;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f28044a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.f28044a = context;
            this.b = str;
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                Log.e(sgr.a(), "CodeTrack: APM is notifying NOTIFY_FOREGROUND_2_BACKGROUND");
                AsyncTask.execute(new DumpJacocoTask(this.f28044a, this.b));
            }
        }
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return "sgr";
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d829a0c", new Object[]{context, str});
        } else if (b(context)) {
            c21.c(new a(context, str));
        }
    }

    public static boolean b(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98ca9cdb", new Object[]{context})).booleanValue();
        }
        try {
            "initJacoco finish 1, with class name ".concat(RT.class.getSimpleName());
            String[] list = context.getAssets().list("tbJacoco");
            if (list == null || list.length <= 0) {
                z = false;
            }
            new StringBuilder("initJacoco finish 2, jacoco path exists=").append(z);
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
