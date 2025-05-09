package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.jni.ResourceJniInteract;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x8o implements ocd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<WeakReference<o5o>> f31214a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.x8o$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class RunnableC1097a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1097a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                x8o x8oVar = x8o.this;
                x8o.c(x8oVar, x8o.b(x8oVar), true);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AsyncTask.SERIAL_EXECUTOR.execute(new RunnableC1097a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements frc<MaterialDetailBean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31217a;

        public b(String str) {
            this.f31217a = str;
        }

        /* renamed from: a */
        public void onSuccess(MaterialDetailBean materialDetailBean) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e6fba8", new Object[]{this, materialDetailBean});
            } else {
                x8o.d(x8o.this, materialDetailBean, this.f31217a);
            }
        }

        @Override // tb.pjd
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                return;
            }
            Log.e("ResourcePreloadProvider", "request url fail " + str + "|" + str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements crc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31218a;
        public final /* synthetic */ MaterialDetailBean b;

        public c(String str, MaterialDetailBean materialDetailBean) {
            this.f31218a = str;
            this.b = materialDetailBean;
        }

        @Override // tb.crc
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6558de82", new Object[]{this, str, str2, str3});
                return;
            }
            StringBuilder sb = new StringBuilder("Material resource tag ");
            sb.append(this.f31218a);
            sb.append(" download fail ");
            sb.append(str2);
            sb.append(" | ");
            sb.append(str3);
            x8o.e(x8o.this, this.b);
        }

        @Override // tb.crc
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b538f3f", new Object[]{this, str, str2});
                return;
            }
            StringBuilder sb = new StringBuilder("Material resource tag ");
            sb.append(this.f31218a);
            sb.append(" download success, ");
            sb.append(str2);
            x8o.e(x8o.this, this.b);
        }

        @Override // tb.crc
        public void onProgress(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("947093e6", new Object[]{this, str, new Integer(i)});
                return;
            }
            StringBuilder sb = new StringBuilder("tag = ");
            sb.append(this.f31218a);
            sb.append(" download progress = ");
            sb.append(i);
        }
    }

    static {
        t2o.a(782237785);
        t2o.a(782237779);
    }

    public static /* synthetic */ List b(x8o x8oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("595f6b25", new Object[]{x8oVar});
        }
        return x8oVar.i();
    }

    public static /* synthetic */ void c(x8o x8oVar, List list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b9fbc0", new Object[]{x8oVar, list, new Boolean(z)});
        } else {
            x8oVar.g(list, z);
        }
    }

    public static /* synthetic */ void d(x8o x8oVar, MaterialDetailBean materialDetailBean, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5dec8eb", new Object[]{x8oVar, materialDetailBean, str});
        } else {
            x8oVar.f(materialDetailBean, str);
        }
    }

    public static /* synthetic */ void e(x8o x8oVar, MaterialDetailBean materialDetailBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7822", new Object[]{x8oVar, materialDetailBean});
        } else {
            x8oVar.j(materialDetailBean);
        }
    }

    @Override // tb.ocd
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        ListIterator listIterator = ((ArrayList) this.f31214a).listIterator();
        while (listIterator.hasNext()) {
            o5o o5oVar = (o5o) ((WeakReference) listIterator.next()).get();
            if (o5oVar != null) {
                try {
                    o5oVar.b.cancel();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        ((ArrayList) this.f31214a).clear();
    }

    public final void f(MaterialDetailBean materialDetailBean, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26fcf6fe", new Object[]{this, materialDetailBean, str});
        } else if (!b9o.d(str, materialDetailBean.resourceUrl)) {
            ((ArrayList) this.f31214a).add(new WeakReference(new o5o(materialDetailBean.resourceUrl, b9o.c(str, materialDetailBean, new c(str, materialDetailBean)))));
        }
    }

    public final void g(List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e86f6e6", new Object[]{this, list, new Boolean(z)});
        } else if (list != null && list.size() != 0) {
            for (String str : list) {
                if (z || TextUtils.isEmpty(ResourceJniInteract.getResourceFromCacheWithIdOrTag(str))) {
                    b9o.g(str, new b(str));
                }
            }
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ddf28a6", new Object[]{this});
        } else {
            ovu.c(new a(), 5000L);
        }
    }

    public final void j(MaterialDetailBean materialDetailBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926e1373", new Object[]{this, materialDetailBean});
            return;
        }
        ListIterator listIterator = ((ArrayList) this.f31214a).listIterator();
        while (listIterator.hasNext()) {
            WeakReference weakReference = (WeakReference) listIterator.next();
            if (weakReference.get() != null && TextUtils.equals(((o5o) weakReference.get()).f25152a, materialDetailBean.resourceUrl)) {
                listIterator.remove();
                return;
            }
        }
    }

    @Override // tb.ocd
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5cbff", new Object[]{this, context});
            return;
        }
        long a2 = gaq.a(context, gaq.KEY_RESOURCE_CHECK_TIME);
        if (a2 <= 0 || System.currentTimeMillis() - a2 >= t9l.d(86400000L)) {
            gaq.b(context, gaq.KEY_RESOURCE_CHECK_TIME, System.currentTimeMillis());
            g(bct.c(), false);
            h();
        }
    }

    public final List<String> i() {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fe3fcd1f", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String h = ztl.h();
        if (!(h == null || !new File(h).exists() || (listFiles = new File(h).listFiles()) == null)) {
            for (File file : listFiles) {
                arrayList.add(file.getName());
            }
        }
        new StringBuilder("local resource count = ").append(arrayList.size());
        return arrayList;
    }
}
