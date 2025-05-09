package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kz9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Dialog f23018a;
    public WeakReference<Activity> b;
    public String c;
    public String d;
    public String e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final kz9 f23019a = new kz9();

        static {
            t2o.a(664797296);
        }

        public static /* synthetic */ kz9 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kz9) ipChange.ipc$dispatch("cb076dd4", new Object[0]);
            }
            return f23019a;
        }
    }

    static {
        t2o.a(664797294);
    }

    public static kz9 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kz9) ipChange.ipc$dispatch("2520b0b8", new Object[0]);
        }
        return b.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Dialog, java.lang.String] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.kz9.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "cb7441e7"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            r0 = 0
            android.app.Dialog r1 = r4.f23018a     // Catch: all -> 0x0023, Exception -> 0x002e
            if (r1 == 0) goto L_0x0025
            boolean r1 = r1.isShowing()     // Catch: all -> 0x0023, Exception -> 0x002e
            if (r1 == 0) goto L_0x0025
            android.app.Dialog r1 = r4.f23018a     // Catch: all -> 0x0023, Exception -> 0x002e
            r1.dismiss()     // Catch: all -> 0x0023, Exception -> 0x002e
            goto L_0x0025
        L_0x0023:
            r1 = move-exception
            goto L_0x0037
        L_0x0025:
            r4.f23018a = r0
            r4.c = r0
            r4.d = r0
            r4.e = r0
            goto L_0x0036
        L_0x002e:
            java.lang.String r1 = "AddFromShareControl"
            java.lang.String r2 = "dismiss error"
            tb.mv3.b(r1, r2)     // Catch: all -> 0x0023
            goto L_0x0025
        L_0x0036:
            return
        L_0x0037:
            r4.f23018a = r0
            r4.c = r0
            r4.d = r0
            r4.e = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kz9.a():void");
    }

    public WeakReference<Activity> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("9f3d8647", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.b;
        if (weakReference != null && weakReference.get() != null) {
            return this.b;
        }
        TLog.loge("AddFromShareControl", "getCurrentActivity is empty, use onlineMonitor data.");
        return d();
    }

    public Dialog c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f928d0aa", new Object[]{this});
        }
        return this.f23018a;
    }

    public final WeakReference<Activity> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("d81d8ed5", new Object[]{this});
        }
        WeakReference<Activity> s = ClipUrlWatcherControl.z().s();
        this.b = s;
        return s;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b6ea59a", new Object[]{this});
        }
        return this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.c;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f467ca35", new Object[]{this});
        }
        return this.d;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4832a81", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void j(WeakReference<Activity> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837b7d51", new Object[]{this, weakReference});
        } else {
            this.b = weakReference;
        }
    }

    public void k(Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50cd20a", new Object[]{this, dialog});
        } else {
            this.f23018a = dialog;
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caad6bb5", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd43681c", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236ed6e1", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public kz9() {
        this.f23018a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = true;
        Context context = ClipUrlWatcherControl.z().i;
    }
}
