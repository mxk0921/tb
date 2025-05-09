package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e9t implements hln<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f18382a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f18383a;

        public a(List list) {
            this.f18383a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            e9t.b(e9t.this, this.f18383a);
            e9t.c(e9t.this, this.f18383a);
        }
    }

    public e9t(cgd cgdVar) {
        this.f18382a = cgdVar;
    }

    public static /* synthetic */ void b(e9t e9tVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea5d3", new Object[]{e9tVar, list});
        } else {
            e9tVar.d(list);
        }
    }

    public static /* synthetic */ void c(e9t e9tVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ffe872", new Object[]{e9tVar, list});
        } else {
            e9tVar.e(list);
        }
    }

    @Override // tb.hln
    public void a(Collection<String> collection, gk4<String, Void> gk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a48ca24", new Object[]{this, collection, gk4Var});
            return;
        }
        RSoLog.d("prefetch, before rearrange, original=" + collection);
        ArrayList arrayList = new ArrayList(collection);
        rbn.i("rearrange,error", new a(arrayList));
        RSoLog.d("prefetch, after rearrange, list=" + arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gk4Var.a((String) it.next());
        }
    }

    public final void e(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361fc337", new Object[]{this, list});
            return;
        }
        List<String> b = this.f18382a.b("key_prefetch_low_priority_list", "");
        if (b.size() > 0) {
            for (int size = b.size() - 1; size >= 0; size--) {
                String str = b.get(size);
                if (list.remove(str)) {
                    list.add(list.size(), str);
                }
            }
        }
    }

    public final void d(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147b1417", new Object[]{this, list});
            return;
        }
        List<String> b = this.f18382a.b("key_prefetch_high_priority_list", "avcodec,artc_engine,themis_gfx,ALBiometricsJni,PailitaoCUtil,lrc_core,AliNNPython,walle_base,MNN,MNN_Express,MNN_CL,mnnpybridge,kernelu4_7z_uc");
        if (b.size() > 0) {
            for (int size = b.size() - 1; size >= 0; size--) {
                String str = b.get(size);
                if (list.remove(str)) {
                    list.add(0, str);
                }
            }
        }
    }
}
