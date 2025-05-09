package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p08 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String c = "CodeTrack-DumpTask";
    private static final String d = "codetrack-ios-new";
    private static final String e = "android_class_unzip";

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f25787a;
    private final jy3 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends syp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f25788a;

        public a(p08 p08Var, Context context) {
            this.f25788a = context;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 280171132) {
                super.onSuccess((z6e) objArr[0], (ozd) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/codetrack/sdk/DumpCoverageFileTask$1");
        }

        @Override // tb.syp, tb.mzd
        public void onSuccess(z6e z6eVar, ozd ozdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
                return;
            }
            super.onSuccess(z6eVar, ozdVar);
            ch4.g(this.f25788a);
            AppMonitor.Counter.commit(t71.MODULE_NAME, t71.MODULE_POINT_DEXCOCO, t71.DUMP_SUCCESS, 1.0d);
        }
    }

    public p08(Context context, jy3 jy3Var) {
        this.f25787a = new WeakReference<>(context);
        this.b = jy3Var;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4148e7db", new Object[]{this, str})).booleanValue();
        }
        return eg9.e(t2o.b(), str);
    }

    private static elv b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (elv) ipChange.ipc$dispatch("d8d82046", new Object[]{str});
        }
        elv elvVar = new elv();
        elvVar.e(d);
        elvVar.f(e);
        long currentTimeMillis = System.currentTimeMillis();
        String format = new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH).format(new Date(currentTimeMillis));
        int nextInt = new Random().nextInt(100000);
        elvVar.g(str + "_" + format + "_" + currentTimeMillis + "_" + nextInt + ".cx");
        return elvVar;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d3415", new Object[]{this});
            return;
        }
        Log.e(c, "DumpCoverageFileTask enter");
        Context context = this.f25787a.get();
        if (context == null) {
            xq2.a(c, "context released ,  wtf  it is application context !!!");
            return;
        }
        String a2 = this.b.a();
        if (TextUtils.isEmpty(a2)) {
            xq2.a(c, "build UploadInfo failed, buildTaskId is empty");
        } else if (!ch4.d()) {
            xq2.a(c, "!isCoverageEnabled");
        } else if (ch4.e(context)) {
            xq2.a(c, "isTired");
        } else {
            String str = eg9.c(context) + File.separator + "coverage.cx";
            if (!a(str)) {
                xq2.a(c, "dumpSuccess == false, dump coverage data failed");
            } else if (!new File(str).exists()) {
                xq2.a(c, "!file.exists, dump coverage data failed");
            } else {
                t2o.d();
                elv b = b(a2);
                b.h(str);
                mmv.a(b, new a(this, context));
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            c();
        } catch (Throwable th) {
            Log.e(c, "DumpCoverageFileTask error", th);
        }
    }
}
