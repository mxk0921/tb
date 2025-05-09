package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24136a;
    public final Context b;
    public fmi c;
    public boolean d = true;

    public mmi(Context context, String str, fmi fmiVar) {
        this.b = context;
        this.f24136a = str;
        this.c = fmiVar;
        nmi.a(context).d(this);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.d) {
            nmi.a(this.b).e(this);
            this.d = false;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3babe84c", new Object[]{this});
        }
        return this.f24136a;
    }

    public final void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
            return;
        }
        fmi fmiVar = this.c;
        if (fmiVar != null) {
            fmiVar.b(obj);
        }
    }

    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b814caa", new Object[]{this, obj});
        } else {
            nmi.a(this.b).b(this, obj);
        }
    }

    public void e(fmi fmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e03ce3a1", new Object[]{this, fmiVar});
        } else {
            this.c = fmiVar;
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        a();
        super.finalize();
    }
}
