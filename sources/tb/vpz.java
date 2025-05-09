package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vpz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f30167a;
    public Boolean b;
    public Float c;
    public Float d;
    public Integer e;
    public Integer f;

    static {
        t2o.a(352322027);
    }

    public vpz(String str) {
        this.f30167a = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.f30167a;
    }

    public vpz b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vpz) ipChange.ipc$dispatch("3c56323a", new Object[]{this});
        }
        return this;
    }

    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("590fb71c", new Object[]{this, new Float(f)});
        } else {
            this.d = Float.valueOf(f);
        }
    }

    public void d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6d9a6c", new Object[]{this, new Float(f)});
        } else {
            this.c = Float.valueOf(f);
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93152757", new Object[]{this, new Boolean(z)});
        } else {
            this.b = Boolean.valueOf(z);
        }
    }
}
