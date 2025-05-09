package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.android.split.core.internal.ServiceManager;
import com.alibaba.android.split.core.splitinstall.b;
import com.alibaba.android.split.core.splitinstall.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ycq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wnc c = (wnc) d62.b(wnc.class, "SplitInstallService");

    /* renamed from: a  reason: collision with root package name */
    public final String f31990a;
    public final ServiceManager b;

    static {
        t2o.a(677380256);
    }

    public ycq(Context context) {
        this(context, context.getPackageName());
    }

    public static Bundle b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("f2d6d039", new Object[]{new Boolean(z)});
        }
        return c(z);
    }

    public static Bundle c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("95cbb4bc", new Object[]{new Boolean(z)});
        }
        Bundle bundle = new Bundle();
        bundle.putInt("version_code", acq.p().t());
        bundle.putBoolean("silence", z);
        return bundle;
    }

    public static wnc d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wnc) ipChange.ipc$dispatch("531d6508", new Object[0]);
        }
        return c;
    }

    public static String e(ycq ycqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("382fc781", new Object[]{ycqVar});
        }
        return ycqVar.f31990a;
    }

    public static ArrayList<Bundle> g(Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("818cb2bc", new Object[]{collection});
        }
        return h(collection);
    }

    public static ArrayList<Bundle> h(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3366d8d9", new Object[]{collection});
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final bdt<Void> a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdt) ipChange.ipc$dispatch("45c5a005", new Object[]{this, list});
        }
        qft qftVar = new qft();
        this.b.executeTask(new b(this, qftVar, list, qftVar));
        return qftVar.a();
    }

    public final bdt<Integer> f(Collection collection, Collection collection2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdt) ipChange.ipc$dispatch("b7da3be3", new Object[]{this, collection, collection2, new Boolean(z)});
        }
        qft qftVar = new qft();
        this.b.executeTask(new f(this, qftVar, collection, collection2, qftVar));
        return qftVar.a();
    }

    public ycq(Context context, String str) {
        Intent intent = new Intent("com.alibaba.android.split.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE");
        this.f31990a = str;
        intent.setPackage(str);
        this.b = new ServiceManager(context.getApplicationContext(), c, "SplitInstallService", intent, zcq.INSTANCE);
    }
}
