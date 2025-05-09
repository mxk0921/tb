package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rh1 implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "audid";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f27375a;
        public final /* synthetic */ boolean b;

        public a(Context context, boolean z) {
            this.f27375a = context;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Context context = this.f27375a;
            if (context != null) {
                try {
                    File fileStreamPath = context.getFileStreamPath("3c9b584e65e6c983");
                    if (fileStreamPath.exists()) {
                        if (!this.b) {
                            fileStreamPath.delete();
                        }
                    } else if (this.b) {
                        fileStreamPath.createNewFile();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    static {
        t2o.a(962592816);
        t2o.a(962592825);
    }

    public rh1() {
        c(x2r.f().e(KEY));
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
        } else {
            c(str2);
        }
    }

    public final void b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460fd21f", new Object[]{this, context, new Boolean(z)});
        } else {
            zdt.c().f(new a(context, z));
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{this, str});
            return;
        }
        nhh.f("AudidConfigListener", "parseConfig value", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ("0".equalsIgnoreCase(str)) {
            b(o2w.k().g(), true);
        } else {
            b(o2w.k().g(), false);
        }
    }
}
