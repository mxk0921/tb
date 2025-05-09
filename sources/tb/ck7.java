package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ck7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ck7 f17112a = new ck7();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17113a;
        public final /* synthetic */ File b;
        public final /* synthetic */ bk7 c;

        public a(Context context, File file, bk7 bk7Var) {
            this.f17113a = context;
            this.b = file;
            this.c = bk7Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ck7.a(ck7.this, this.f17113a, this.b, this.c);
            } catch (Throwable th) {
                this.c.onFailed(this.b, th.getMessage());
            }
        }
    }

    static {
        t2o.a(989855814);
        t2o.a(989855818);
    }

    public static /* synthetic */ void a(ck7 ck7Var, Context context, File file, bk7 bk7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa1dd1", new Object[]{ck7Var, context, file, bk7Var});
        } else {
            ck7Var.d(context, file, bk7Var);
        }
    }

    public static ck7 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ck7) ipChange.ipc$dispatch("7f2799b9", new Object[0]);
        }
        return f17112a;
    }

    public void c(Context context, File file, bk7 bk7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569b9e09", new Object[]{this, context, file, bk7Var});
        } else {
            mrt.a().execute(new a(context, file, bk7Var));
        }
    }

    public final void d(Context context, File file, bk7 bk7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef0f666", new Object[]{this, context, file, bk7Var});
        } else if (fk7.c()) {
            bk7Var.onFailed(file, "32bit not supported");
        } else if (!fk7.e(24)) {
            bk7Var.onFailed(file, "only supported on android 8 and above, current version is " + Build.VERSION.SDK_INT);
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i == 29) {
                bk7Var.onFailed(file, "don't do opt on android Q");
            } else if (i > 35) {
                bk7Var.onFailed(file, "don't do opt on android 15 above");
            } else if (!fk7.d(file)) {
                bk7Var.onFailed(file, "dexFile is invalid");
            } else {
                File b = fk7.b(file);
                if (b != null && fk7.d(b)) {
                    bk7Var.onSuccess(file, "oat file is valid");
                } else if (fk7.e(30)) {
                    new ek7().c(context, file, bk7Var);
                } else if (vpw.commonConfig.W2) {
                    new dk7().b(context, file, bk7Var);
                } else {
                    bk7Var.onFailed(file, "don't do opt on android R below");
                }
            }
        }
    }
}
