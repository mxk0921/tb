package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class sfp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean d;
    public static final Object e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public ezc f28017a;
    public jpb b;
    public osk c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final sfp f28018a = new sfp();
    }

    public static sfp a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfp) ipChange.ipc$dispatch("57be9e24", new Object[0]);
        }
        return a.f28018a;
    }

    public ezc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ezc) ipChange.ipc$dispatch("47413ad5", new Object[]{this});
        }
        if (this.f28017a == null) {
            this.f28017a = new c47();
        }
        return this.f28017a;
    }

    public osk c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osk) ipChange.ipc$dispatch("f8d39ecb", new Object[]{this});
        }
        return this.c;
    }

    public void d(Context context, cxe cxeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60b7412", new Object[]{this, context, cxeVar});
            return;
        }
        vg8.f30001a = context;
        if (context == null) {
            g01.a("SettingPageManager", "sAppContext is null");
        }
        if (cxeVar != null) {
            this.f28017a = cxeVar.c();
            this.b = cxeVar.b();
        }
        e();
    }

    public final void e() {
        jpb jpbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf6d4df", new Object[]{this});
            return;
        }
        synchronized (e) {
            try {
                if (!d && (jpbVar = this.b) != null) {
                    jpbVar.a();
                    d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
        } else {
            pyl.e().h(str);
        }
    }

    public void g(osk oskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b1170b1", new Object[]{this, oskVar});
        } else {
            this.c = oskVar;
        }
    }
}
