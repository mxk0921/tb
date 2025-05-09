package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class w8w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f30521a;
    public kv7 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final w8w f30522a = new w8w();

        static {
            t2o.a(491782190);
        }
    }

    static {
        t2o.a(491782188);
    }

    public static w8w b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w8w) ipChange.ipc$dispatch("8823a86d", new Object[0]);
        }
        return b.f30522a;
    }

    public void a(String str, n6w n6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8171bd5a", new Object[]{this, str, n6wVar});
        } else if (((HashSet) this.f30521a).add(str)) {
            kv7 kv7Var = new kv7(n6wVar, str);
            this.b = kv7Var;
            kv7Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            kv7 kv7Var2 = this.b;
            if (kv7Var2 != null && kv7Var2.getStatus() == AsyncTask.Status.FINISHED && n6wVar != null) {
                n6wVar.onFail();
            }
        }
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a039eee4", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String b2 = ncw.b(str);
        if (TextUtils.isEmpty(b2) || !new File(b2).exists()) {
            return null;
        }
        ((HashSet) this.f30521a).remove(str);
        return b2;
    }

    public w8w() {
        this.f30521a = new HashSet();
    }
}
