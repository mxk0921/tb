package tb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.image.ExternalAdapterImageBridge;
import com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.manager.TMSInstanceManager;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.utils.ApPathType;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i9s implements ExternalAdapterImageProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile i9s d;
    public String b;
    public final ReadWriteLock c = new ReentrantReadWriteLock();

    /* renamed from: a  reason: collision with root package name */
    public final Handler f21174a = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbs f21175a;
        public final /* synthetic */ b b;
        public final /* synthetic */ PhenixCreator c;

        public a(bbs bbsVar, b bVar, PhenixCreator phenixCreator) {
            this.f21175a = bbsVar;
            this.b = bVar;
            this.c = phenixCreator;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f21175a.I() == null) {
                this.b.a(null);
            } else {
                this.b.c(this.c.fetch());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements ExternalAdapterImageProvider.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f21176a = false;
        public WeakReference<p1m> b;
        public final ExternalAdapterImageProvider.c c;
        public final String d;

        static {
            t2o.a(834666511);
            t2o.a(945815600);
        }

        public b(String str, ExternalAdapterImageProvider.c cVar) {
            this.d = str;
            this.c = cVar;
        }

        public void a(ExternalAdapterImageProvider.Image image) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5990ad15", new Object[]{this, image});
            } else {
                ((ExternalAdapterImageBridge.a) this.c).a(image);
            }
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.d;
        }

        public void c(p1m p1mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ebeabc4", new Object[]{this, p1mVar});
            } else if (!this.f21176a) {
                this.b = new WeakReference<>(p1mVar);
            }
        }

        @Override // com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider.b
        public void cancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            this.f21176a = true;
            WeakReference<p1m> weakReference = this.b;
            if (weakReference != null) {
                p1m p1mVar = weakReference.get();
                if (p1mVar != null) {
                    p1mVar.a();
                }
                this.b = null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f21177a;
        public final WeakReference<bbs> b;

        static {
            t2o.a(834666512);
            t2o.a(620757101);
        }

        public c(b bVar, bbs bbsVar) {
            this.f21177a = new WeakReference<>(bVar);
            this.b = new WeakReference<>(bbsVar);
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            b bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            bbs bbsVar = this.b.get();
            if (!(bbsVar == null || bbsVar.I() == null || (bVar = this.f21177a.get()) == null)) {
                TMSLogger.b("TMSCanvasImageProvider", "[AliCDN] Request finish failed: " + bVar.b());
                bVar.a(null);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f21178a;
        public final WeakReference<bbs> b;

        static {
            t2o.a(834666513);
            t2o.a(620757101);
        }

        public d(b bVar, bbs bbsVar) {
            this.f21178a = new WeakReference<>(bVar);
            this.b = new WeakReference<>(bbsVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0078 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:32:0x006e, B:37:0x0078, B:39:0x007e), top: B:42:0x006e }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onHappen(com.taobao.phenix.intf.event.SuccPhenixEvent r10) {
            /*
                r9 = this;
                r0 = 1
                r1 = 2
                r2 = 0
                com.android.alibaba.ip.runtime.IpChange r3 = tb.i9s.d.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x001c
                java.lang.String r4 = "362cccf4"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r2] = r9
                r1[r0] = r10
                java.lang.Object r10 = r3.ipc$dispatch(r4, r1)
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                return r10
            L_0x001c:
                java.lang.ref.WeakReference<tb.bbs> r3 = r9.b
                java.lang.Object r3 = r3.get()
                tb.bbs r3 = (tb.bbs) r3
                if (r3 == 0) goto L_0x00a4
                android.app.Activity r3 = r3.I()
                if (r3 != 0) goto L_0x002e
                goto L_0x00a4
            L_0x002e:
                java.lang.ref.WeakReference<tb.i9s$b> r3 = r9.f21178a
                java.lang.Object r3 = r3.get()
                tb.i9s$b r3 = (tb.i9s.b) r3
                if (r3 == 0) goto L_0x00a4
                r4 = 0
                if (r10 != 0) goto L_0x003f
                r3.a(r4)
                return r2
            L_0x003f:
                boolean r5 = r10.isIntermediate()
                if (r5 == 0) goto L_0x0046
                return r2
            L_0x0046:
                android.graphics.drawable.BitmapDrawable r10 = r10.getDrawable()
                if (r10 == 0) goto L_0x0062
                boolean r5 = r10 instanceof tb.uwn
                if (r5 == 0) goto L_0x0056
                r5 = r10
                tb.uwn r5 = (tb.uwn) r5
                r5.l()
            L_0x0056:
                android.graphics.Bitmap r10 = r10.getBitmap()
                if (r10 == 0) goto L_0x0062
                com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider$Image r5 = new com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider$Image
                r5.<init>(r10)
                goto L_0x0063
            L_0x0062:
                r5 = r4
            L_0x0063:
                if (r5 == 0) goto L_0x0069
                android.graphics.Bitmap r4 = r5.getBitmap()
            L_0x0069:
                r3.a(r5)
                if (r4 == 0) goto L_0x0075
                int r10 = r4.getWidth()     // Catch: all -> 0x0073
                goto L_0x0076
            L_0x0073:
                r10 = move-exception
                goto L_0x00a1
            L_0x0075:
                r10 = 0
            L_0x0076:
                if (r4 == 0) goto L_0x007d
                int r4 = r4.getHeight()     // Catch: all -> 0x0073
                goto L_0x007e
            L_0x007d:
                r4 = 0
            L_0x007e:
                java.lang.String r5 = "TMSCanvasImageProvider"
                java.util.Locale r6 = java.util.Locale.CHINA     // Catch: all -> 0x0073
                java.lang.String r7 = "[AliCDN] Request finish. %d * %d, %s\n"
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: all -> 0x0073
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: all -> 0x0073
                java.lang.String r3 = r3.b()     // Catch: all -> 0x0073
                r8 = 3
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: all -> 0x0073
                r8[r2] = r10     // Catch: all -> 0x0073
                r8[r0] = r4     // Catch: all -> 0x0073
                r8[r1] = r3     // Catch: all -> 0x0073
                java.lang.String r10 = java.lang.String.format(r6, r7, r8)     // Catch: all -> 0x0073
                com.taobao.themis.kernel.basic.TMSLogger.a(r5, r10)     // Catch: all -> 0x0073
                goto L_0x00a4
            L_0x00a1:
                r10.printStackTrace()
            L_0x00a4:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.i9s.d.onHappen(com.taobao.phenix.intf.event.SuccPhenixEvent):boolean");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f21179a;

        static {
            t2o.a(834666514);
        }

        public e() {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    static {
        t2o.a(834666509);
        t2o.a(945815597);
    }

    public static i9s a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i9s) ipChange.ipc$dispatch("81ae163", new Object[0]);
        }
        if (d == null) {
            synchronized (i9s.class) {
                try {
                    if (d == null) {
                        d = new i9s();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    /* JADX WARN: Finally extract failed */
    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        ((ReentrantReadWriteLock) this.c).readLock().lock();
        try {
            try {
                String str = this.b;
                ((ReentrantReadWriteLock) this.c).readLock().unlock();
                return str;
            } catch (Exception e2) {
                TMSLogger.b("TMSCanvasImageProvider", e2.getMessage());
                ((ReentrantReadWriteLock) this.c).readLock().unlock();
                return null;
            }
        } catch (Throwable th) {
            ((ReentrantReadWriteLock) this.c).readLock().unlock();
            throw th;
        }
    }

    public final e c(bbs bbsVar, ApPathType apPathType, String str, ExternalAdapterImageProvider.c cVar) {
        Throwable th;
        Exception e2;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("95f3b2ef", new Object[]{this, bbsVar, apPathType, str, cVar});
        }
        FileInputStream fileInputStream2 = null;
        e eVar = new e(null);
        if (!(cVar == null || bbsVar == null || bbsVar.I() == null)) {
            String a2 = ws4.a(TMSInstanceExtKt.f(bbsVar), str, apPathType);
            if (TextUtils.isEmpty(a2)) {
                ((ExternalAdapterImageBridge.a) cVar).a(null);
                return eVar;
            }
            File file = new File(a2);
            if (!file.exists() || file.isDirectory() || !file.canRead()) {
                ((ExternalAdapterImageBridge.a) cVar).a(null);
            } else {
                try {
                    try {
                        fileInputStream = new FileInputStream(file);
                    } catch (Exception e3) {
                        e2 = e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    byte[] d2 = a2d.d(fileInputStream);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(d2, 0, d2.length);
                    if (decodeByteArray != null) {
                        ((ExternalAdapterImageBridge.a) cVar).a(new ExternalAdapterImageProvider.Image(decodeByteArray));
                        eVar.f21179a = true;
                    } else {
                        ((ExternalAdapterImageBridge.a) cVar).a(null);
                    }
                    a2d.a(fileInputStream);
                } catch (Exception e4) {
                    e2 = e4;
                    fileInputStream2 = fileInputStream;
                    TMSLogger.b("TMSCanvasImageProvider", e2.getMessage());
                    a2d.a(fileInputStream2);
                    return eVar;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream;
                    a2d.a(fileInputStream2);
                    throw th;
                }
                return eVar;
            }
        }
        return eVar;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b03f3a3", new Object[]{this, str});
            return;
        }
        ((ReentrantReadWriteLock) this.c).writeLock().lock();
        try {
            try {
                this.b = str;
            } catch (Exception e2) {
                TMSLogger.b("TMSCanvasImageProvider", e2.getMessage());
            }
        } finally {
            ((ReentrantReadWriteLock) this.c).writeLock().unlock();
        }
    }

    @Override // com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider
    public ExternalAdapterImageProvider.b request(String str, int i, int i2, Map<String, String> map, Map<String, String> map2, ExternalAdapterImageProvider.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExternalAdapterImageProvider.b) ipChange.ipc$dispatch("12ab7510", new Object[]{this, str, new Integer(i), new Integer(i2), map, map2, cVar});
        }
        if (TextUtils.isEmpty(str)) {
            TMSLogger.b("TMSCanvasImageProvider", "fetch image failed because of empty url");
            return null;
        }
        bbs e2 = TMSInstanceManager.e(b());
        if (e2 == null || e2.I() == null) {
            ((ExternalAdapterImageBridge.a) cVar).a(null);
            new e(null);
            return null;
        }
        w8s.a(str, i, i2, map2);
        ApPathType d2 = ws4.d(str, e2);
        if ((d2 == ApPathType.AP_PATH_TYPE_USR || d2 == ApPathType.AP_PATH_TYPE_TEMP) && c(e2, d2, str, cVar).f21179a) {
            return null;
        }
        if (d2 == ApPathType.AP_PATH_TYPE_PKG && d(e2, str, cVar).f21179a) {
            return null;
        }
        if (str.startsWith(itw.URL_SEPARATOR)) {
            str = uyv.HTTPS_SCHEMA.concat(str);
        }
        PhenixCreator releasableDrawable = s0m.B().T(str).releasableDrawable(false);
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                releasableDrawable.addLoaderExtra(entry.getKey(), entry.getValue());
            }
        }
        b bVar = new b(str, cVar);
        releasableDrawable.succListener(new d(bVar, e2));
        releasableDrawable.failListener(new c(bVar, e2));
        this.f21174a.post(new a(e2, bVar, releasableDrawable));
        return bVar;
    }

    public final e d(bbs bbsVar, String str, ExternalAdapterImageProvider.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("28749f50", new Object[]{this, bbsVar, str, cVar});
        }
        e eVar = new e(null);
        if (TextUtils.isEmpty(str) || bbsVar == null) {
            ((ExternalAdapterImageBridge.a) cVar).a(null);
            eVar.f21179a = false;
            return eVar;
        }
        ekd ekdVar = (ekd) bbsVar.getExtension(ekd.class);
        if (ekdVar == null) {
            ((ExternalAdapterImageBridge.a) cVar).a(null);
            eVar.f21179a = false;
            return eVar;
        }
        c7o Y = ekdVar.Y(str);
        if (Y == null || Y.getBytes() == null) {
            Y = ekdVar.B(str);
        }
        if (Y != null) {
            byte[] bytes = Y.getBytes();
            ((ExternalAdapterImageBridge.a) cVar).a(new ExternalAdapterImageProvider.Image(BitmapFactory.decodeByteArray(bytes, 0, bytes.length)));
            eVar.f21179a = true;
        } else {
            TMSLogger.b("TMSCanvasImageProvider", "fetch image url failed: " + str);
            iv8.a("1005", "load image failed:" + str, null);
            ((ExternalAdapterImageBridge.a) cVar).a(null);
            eVar.f21179a = false;
        }
        return eVar;
    }
}
