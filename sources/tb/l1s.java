package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l1s implements yyi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public yyi f23060a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static final l1s INSTANCE = new l1s();
    }

    public static l1s c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l1s) ipChange.ipc$dispatch("245702c4", new Object[0]);
        }
        return b.INSTANCE;
    }

    @Override // tb.yyi
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4511219c", new Object[]{this, str, str2, str3});
            return;
        }
        m4s.b("TCrashMonitor", str, str2, str3);
        this.f23060a.a(str, str2, str3);
    }

    public yyi b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyi) ipChange.ipc$dispatch("fa94bc60", new Object[]{this});
        }
        return this.f23060a;
    }

    public void d(yyi yyiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b75e0c6", new Object[]{this, yyiVar});
        } else if (yyiVar == null) {
            ehh.f(new IllegalArgumentException("monitor is null"));
        } else {
            this.f23060a = yyiVar;
        }
    }

    public l1s() {
        this.f23060a = new u0s();
    }
}
