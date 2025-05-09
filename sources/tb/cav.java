package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class cav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16952a;
    public final String b;
    public float c = 0.0f;

    static {
        t2o.a(83886277);
    }

    public cav(String str, String str2) {
        this.f16952a = str;
        this.b = str2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd61839e", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this});
        }
        return this.f16952a;
    }

    public float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68809b54", new Object[]{this})).floatValue();
        }
        return this.c;
    }

    public void d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a699f50", new Object[]{this, new Float(f)});
        } else {
            this.c = f;
        }
    }
}
