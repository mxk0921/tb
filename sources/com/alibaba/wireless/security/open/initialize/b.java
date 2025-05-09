package com.alibaba.wireless.security.open.initialize;

import android.content.Context;
import android.util.Log;
import com.alibaba.wireless.security.framework.ApmMonitorAdapter;
import com.alibaba.wireless.security.framework.ISGPluginManager;
import com.alibaba.wireless.security.framework.SGApmMonitorManager;
import com.alibaba.wireless.security.framework.d;
import com.alibaba.wireless.security.framework.utils.FLOG;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.IInitializeComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;
import tb.ku0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Set<IInitializeComponent.IInitFinishListener> f3435a;
    private final Object b;
    private String c;
    private ISGPluginManager d;
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3436a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        static {
            t2o.a(659554369);
        }

        public a(Context context, String str, boolean z, boolean z2) {
            this.f3436a = context;
            this.b = str;
            this.c = z;
            this.d = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                b.this.b(this.f3436a, this.b, this.c, this.d);
            } catch (SecException e) {
                e.printStackTrace();
                b.a(b.this);
            }
        }
    }

    static {
        t2o.a(659554368);
    }

    public b() {
        this.f3435a = new HashSet();
        this.b = new Object();
        this.c = null;
        this.d = null;
        this.e = false;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (IInitializeComponent.IInitFinishListener iInitFinishListener : this.f3435a) {
            if (iInitFinishListener instanceof IInitializeComponent.IInitFinishListenerV2) {
                ((IInitializeComponent.IInitFinishListenerV2) iInitFinishListener).onStart();
            }
        }
    }

    public ISGPluginManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISGPluginManager) ipChange.ipc$dispatch("ac1cd9d0", new Object[]{this}) : this.d;
    }

    public int b(Context context, String str, boolean z, boolean z2) throws SecException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bec1543c", new Object[]{this, context, str, new Boolean(z), new Boolean(z2)})).intValue();
        }
        synchronized (this.b) {
            try {
                if (!this.e) {
                    c();
                    if (context != null) {
                        Log.e("ValarMorghulis", "s");
                        SGApmMonitorManager.getInstance().init(context);
                        SGApmMonitorManager.getInstance().monitorStart(ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
                        SGApmMonitorManager.getInstance().monitorStart("getInstance");
                        long j = FLOG.get_currentTime();
                        ApmMonitorAdapter.jstageStart("main", "1");
                        d dVar = new d();
                        dVar.a(context, this.c, str, z, new Object[0]);
                        SGApmMonitorManager.getInstance().setSGPluginManager(dVar);
                        ApmMonitorAdapter.jstageEnd("main", "1");
                        FLOG.printTimeCost("main", "pluginMgr.init", "", j);
                        dVar.getPluginInfo(dVar.getMainPluginName());
                        FLOG.printTimeCost("main", "getInstance", "", j);
                        SGApmMonitorManager.getInstance().monitorEnd("getInstance");
                        Log.e("ValarMorghulis", "e");
                        this.d = dVar;
                        this.e = true;
                        a(true);
                    } else {
                        throw new SecException(101);
                    }
                }
                i = !this.e ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public b(String str) {
        this.f3435a = new HashSet();
        this.b = new Object();
        this.d = null;
        this.e = false;
        this.c = str;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            try {
                for (IInitializeComponent.IInitFinishListener iInitFinishListener : this.f3435a) {
                    iInitFinishListener.onError();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Context context, String str, boolean z, boolean z2) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd17ae2a", new Object[]{this, context, str, new Boolean(z), new Boolean(z2)});
        } else if (context != null) {
            new Thread(new a(context, str, z, z2), "SGloadLibraryAsync").start();
        } else {
            throw new SecException(101);
        }
    }

    public void a(IInitializeComponent.IInitFinishListener iInitFinishListener) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c092421e", new Object[]{this, iInitFinishListener});
        } else if (iInitFinishListener != null) {
            synchronized (this.b) {
                this.f3435a.add(iInitFinishListener);
            }
        }
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f82130", new Object[]{bVar});
        } else {
            bVar.b();
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        for (IInitializeComponent.IInitFinishListener iInitFinishListener : this.f3435a) {
            if (z) {
                iInitFinishListener.onSuccess();
            } else {
                iInitFinishListener.onError();
            }
        }
    }

    public boolean a(Context context) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        return true;
    }
}
