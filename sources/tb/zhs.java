package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import java.util.ArrayList;
import tb.gtl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zhs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends AsyncTask<Void, Void, vq3> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f32780a;
        public final /* synthetic */ k8t b;
        public final /* synthetic */ g8t c;

        public a(zhs zhsVar, Context context, k8t k8tVar, g8t g8tVar) {
            this.f32780a = context;
            this.b = k8tVar;
            this.c = g8tVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/taopassword/querypassword/TPQueryManager$1");
        }

        /* renamed from: a */
        public vq3 doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vq3) ipChange.ipc$dispatch("90c883f0", new Object[]{this, voidArr});
            }
            ArrayList<zwd> a2 = yhs.a();
            for (int i = 0; i < a2.size(); i++) {
                try {
                    vq3 a3 = a2.get(i).a(this.f32780a, this.b);
                    if (a3 != null && a3.f30170a) {
                        return a3;
                    }
                } catch (Throwable th) {
                    Log.e("TPQueryManager", "check error：" + th.getMessage());
                }
            }
            return null;
        }

        /* renamed from: b */
        public void onPostExecute(vq3 vq3Var) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b96a680e", new Object[]{this, vq3Var});
                return;
            }
            g8t g8tVar = this.c;
            if (vq3Var == null || !vq3Var.f30170a) {
                z = false;
            }
            ((gtl.a) g8tVar).g(z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final zhs f32781a = new zhs(null);

        static {
            t2o.a(665845923);
        }

        public static /* synthetic */ zhs a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zhs) ipChange.ipc$dispatch("792b2167", new Object[0]);
            }
            return f32781a;
        }
    }

    static {
        t2o.a(665845921);
    }

    public /* synthetic */ zhs(a aVar) {
        this();
    }

    public static zhs d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zhs) ipChange.ipc$dispatch("5bd5404b", new Object[0]);
        }
        return b.a();
    }

    public void a(Context context, y9 y9Var, g8t g8tVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb1917e", new Object[]{this, context, y9Var, g8tVar});
            return;
        }
        String ttid = ShareBizAdapter.getInstance().getAppEnv().getTTID();
        if (!TextUtils.isEmpty(ttid)) {
            k8t k8tVar = new k8t();
            k8tVar.f22479a = y9Var.f31916a;
            k8tVar.b = y9Var.b;
            b(context, k8tVar, g8tVar, ttid);
            return;
        }
        throw new Exception("miss ttid");
    }

    public void b(Context context, k8t k8tVar, g8t g8tVar, String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6c4620", new Object[]{this, context, k8tVar, g8tVar, str});
        } else if (g8tVar != null) {
            if (!TextUtils.isEmpty(str)) {
                j8t.c(str);
            } else if (TextUtils.isEmpty(j8t.a())) {
                throw new Exception("ttid is null.");
            }
            if (!TextUtils.isEmpty(k8tVar.f22479a)) {
                c(context, k8tVar, g8tVar);
            }
        } else {
            throw new Exception("listener can not be null!");
        }
    }

    public final void c(Context context, k8t k8tVar, g8t g8tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf84f2c", new Object[]{this, context, k8tVar, g8tVar});
        } else if (g8tVar != null) {
            new a(this, context, k8tVar, g8tVar).execute(new Void[0]);
        }
    }

    public zhs() {
    }
}
