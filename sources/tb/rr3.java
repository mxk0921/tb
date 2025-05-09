package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.utils.ArtcLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rr3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCAL_CATALOG_PATH = "trtc/chipset_catalog.json";

    /* renamed from: a  reason: collision with root package name */
    public final Context f27562a;
    public final ArrayList<Callable<pr3[]>> b = new ArrayList<>();

    static {
        t2o.a(395313324);
    }

    public rr3(Context context) {
        this.f27562a = context.getApplicationContext();
    }

    public rr3 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rr3) ipChange.ipc$dispatch("ec44d5c9", new Object[]{this});
        }
        this.b.add(new zz6(this.f27562a, pr3[].class, LOCAL_CATALOG_PATH));
        return this;
    }

    public rr3 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rr3) ipChange.ipc$dispatch("b72ee79a", new Object[]{this});
        }
        this.b.add(new l9l(this.f27562a, pr3[].class, "chipset_catalog", "trtc_chipset_catalog", "config"));
        return this;
    }

    public qr3 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qr3) ipChange.ipc$dispatch("d51c1abd", new Object[]{this});
        }
        return new qr3(d());
    }

    public final pr3[] d() {
        pr3[] pr3VarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pr3[]) ipChange.ipc$dispatch("66f11b89", new Object[]{this});
        }
        Iterator<Callable<pr3[]>> it = this.b.iterator();
        do {
            pr3VarArr = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                pr3VarArr = it.next().call();
                continue;
            } catch (Throwable unused) {
                ArtcLog.w("DeviceInspector", "configuration error", new Object[0]);
                continue;
            }
        } while (pr3VarArr == null);
        return pr3VarArr;
    }
}
