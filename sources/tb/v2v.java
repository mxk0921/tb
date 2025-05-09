package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class v2v implements x4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29754a;
    public final String b;
    public final e8p c;

    static {
        t2o.a(962593272);
        t2o.a(962593268);
    }

    public v2v(String str, String str2) {
        this.c = null;
        this.f29754a = str;
        this.b = str2;
        this.c = new e8p(str, str2);
    }

    @Override // tb.x4e
    public String getAppkey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this});
        }
        return this.f29754a;
    }

    public String getAuthcode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c81d9ece", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.x4e
    public String getSign(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b4a049c", new Object[]{this, str});
        }
        return this.c.getSign(str);
    }
}
