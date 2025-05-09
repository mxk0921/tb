package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.DetailPreloadBucket;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import tb.ysm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ftm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile Object j;
    public static volatile Method k;
    public yjd c;
    public mmc d;
    public int f;
    public e g;
    public kcd h;

    /* renamed from: a  reason: collision with root package name */
    public final on8 f19523a = new on8();
    public final com.taobao.android.preload.core.task.a b = new com.taobao.android.preload.core.task.a();
    public final ConcurrentHashMap<String, DetailPreloadBucket> e = new ConcurrentHashMap<>();
    public final het i = new het();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f19524a;
        public final /* synthetic */ String b;

        public a(boolean z, String str) {
            this.f19524a = z;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f19524a) {
                ftm.a(ftm.this);
            }
            ftm.b(ftm.this, this.b, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19525a;

        public b(String str) {
            this.f19525a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = PreloadTaskEntity.parser(this.f19525a, ftm.this.h).sourceFrom;
            if (TextUtils.isEmpty(str)) {
                wsm.a(csm.a("PreloadTaskLoader"), "sourceFrom is null");
            } else if (ftm.c(ftm.this) == null || !ftm.c(ftm.this).a(str)) {
                ftm.d(ftm.this).e(this.f19525a, ftm.this.h);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19526a;

        public c(String str) {
            this.f19526a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = PreloadTaskEntity.parser(this.f19526a, ftm.this.h).sourceFrom;
            if (TextUtils.isEmpty(str)) {
                wsm.a(csm.a("PreloadTaskLoader"), "sourceFrom is null");
            } else if (ftm.c(ftm.this) == null || !ftm.c(ftm.this).a(str)) {
                ftm.d(ftm.this).c(this.f19526a, ftm.this.h);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19527a;

        public d(String str) {
            this.f19527a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DetailPreloadBucket parser = DetailPreloadBucket.parser(this.f19527a);
            if (parser != null && !TextUtils.isEmpty(parser.sourceFrom)) {
                ftm.e(ftm.this).put(parser.sourceFrom, parser);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface e {
        boolean a(String str);
    }

    public static /* synthetic */ void a(ftm ftmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633819de", new Object[]{ftmVar});
        } else {
            ftmVar.g();
        }
    }

    public static /* synthetic */ void b(ftm ftmVar, String str, ddt ddtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca40f1b", new Object[]{ftmVar, str, ddtVar});
        } else {
            ftmVar.n(str, ddtVar);
        }
    }

    public static /* synthetic */ e c(ftm ftmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("5f1fe528", new Object[]{ftmVar});
        }
        return ftmVar.g;
    }

    public static /* synthetic */ com.taobao.android.preload.core.task.a d(ftm ftmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.preload.core.task.a) ipChange.ipc$dispatch("f1f49a56", new Object[]{ftmVar});
        }
        return ftmVar.b;
    }

    public static /* synthetic */ ConcurrentHashMap e(ftm ftmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("5b7cd5c4", new Object[]{ftmVar});
        }
        return ftmVar.e;
    }

    public final void g() {
        synchronized (ftm.class) {
            try {
                try {
                    Log.e(csm.a("PreloadTaskLoader"), "checkAndRegisterRequester");
                } catch (Exception e2) {
                    wsm.b(csm.a("PreloadTaskLoader"), "registerLiteDetailRequesterImpl类加载异常", e2);
                }
                if (k != null) {
                    if (j == null) {
                    }
                    k.invoke(j, new Object[0]);
                }
                IpChange ipChange = yq0.$ipChange;
                j = yq0.class.newInstance();
                k = yq0.class.getDeclaredMethod("registerNewDetailPreLoadRequester", new Class[0]);
                Log.e(csm.a("PreloadTaskLoader"), "checkAndRegisterRequester寻找反射方法");
                k.invoke(j, new Object[0]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae8153a3", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            wsm.c(csm.a("PreloadTaskLoader"), "params is null");
        } else {
            i().execute(new c(str));
        }
    }

    public ExecutorService i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("a68732d2", new Object[]{this});
        }
        return this.f19523a.a(1, 60, "Detail Preload Loader");
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6772aef7", new Object[]{this, str});
        } else {
            k(str, false);
        }
    }

    public void k(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e3e2bd", new Object[]{this, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
            wsm.c(csm.a("PreloadTaskLoader"), "params is null");
        } else {
            i().execute(new a(z, str));
        }
    }

    public void l(JSONObject jSONObject, ddt ddtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7bc1dc6", new Object[]{this, jSONObject, ddtVar});
            return;
        }
        PreloadTaskEntity preloadTaskEntity = null;
        try {
            preloadTaskEntity = PreloadTaskEntity.parser(jSONObject, this.h);
            m(preloadTaskEntity, ddtVar);
        } catch (Exception e2) {
            wsm.b(csm.a("PreloadTaskLoader"), "预加载批量接口任务执行失败", e2);
            if (ddtVar != null) {
                ((ysm.a) ddtVar).a(preloadTaskEntity, e2);
            }
        }
    }

    public final void n(String str, ddt ddtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8de27c8", new Object[]{this, str, ddtVar});
            return;
        }
        PreloadTaskEntity preloadTaskEntity = null;
        try {
            preloadTaskEntity = PreloadTaskEntity.parser(str, this.h);
            m(preloadTaskEntity, ddtVar);
        } catch (Exception e2) {
            wsm.b(csm.a("PreloadTaskLoader"), "预加载批量接口任务执行失败", e2);
            if (ddtVar != null) {
                ((ysm.a) ddtVar).a(preloadTaskEntity, e2);
            }
        }
    }

    public void o(mmc mmcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c9c0a6", new Object[]{this, mmcVar});
        } else {
            this.d = mmcVar;
        }
    }

    public void p(kcd kcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c097ed6", new Object[]{this, kcdVar});
        } else {
            this.h = kcdVar;
        }
    }

    public void q(yjd yjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e386d5c6", new Object[]{this, yjdVar});
        } else {
            this.c = yjdVar;
        }
    }

    public void r(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91560b", new Object[]{this, eVar});
        } else {
            this.g = eVar;
        }
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8532299e", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d48e64", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            wsm.c(csm.a("PreloadTaskLoader"), "params is null");
        } else {
            i().execute(new d(str));
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d2e61f", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            wsm.c(csm.a("PreloadTaskLoader"), "dataSourceParams is null");
        } else {
            i().execute(new b(str));
        }
    }

    public void m(PreloadTaskEntity preloadTaskEntity, ddt ddtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24dd2b01", new Object[]{this, preloadTaskEntity, ddtVar});
            return;
        }
        try {
            String str = preloadTaskEntity.sourceFrom;
            if (TextUtils.isEmpty(str)) {
                wsm.a(csm.a("PreloadTaskLoader"), "sourceFrom is null");
                return;
            }
            e eVar = this.g;
            if (eVar == null || !eVar.a(str)) {
                ArrayList<PreloadTaskEntity.a> arrayList = preloadTaskEntity.items;
                if (arrayList != null && !arrayList.isEmpty()) {
                    mmc mmcVar = this.d;
                    if (mmcVar != null) {
                        mmcVar.a(preloadTaskEntity);
                    }
                    com.taobao.android.preload.core.task.b.c(preloadTaskEntity, ddtVar, this.f, 0).d(this.b, this.i.b(preloadTaskEntity.bizName), this.c, this.f19523a);
                    return;
                }
                wsm.a(csm.a("PreloadTaskLoader"), "preloadTaskEntity items is null");
            }
        } catch (Exception e2) {
            wsm.b(csm.a("PreloadTaskLoader"), "预加载批量接口任务执行失败", e2);
            if (ddtVar != null) {
                ((ysm.a) ddtVar).a(preloadTaskEntity, e2);
            }
        }
    }
}
