package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class le8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23290a;
    public double b = 1.0d;
    public boolean c = false;

    static {
        t2o.a(503317048);
    }

    public double a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b5015c0", new Object[]{this})).doubleValue();
        }
        return this.b;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b5f5833", new Object[]{this})).booleanValue();
        }
        return this.f23290a;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575643bd", new Object[]{this, new Boolean(z)});
        } else {
            this.f23290a = z;
        }
    }

    public void d(fhb fhbVar, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41da73c7", new Object[]{this, fhbVar, oVar});
        } else if (!this.c) {
            this.c = true;
        }
    }

    public void e(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf7c420", new Object[]{this, new Double(d)});
        } else {
            this.b = d;
        }
    }
}
