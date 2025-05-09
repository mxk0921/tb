package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m9f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23863a;
    public final String b;
    public final atb c;
    public final r8e d;

    static {
        t2o.a(468714780);
    }

    public m9f() {
    }

    public atb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("1536c415", new Object[]{this});
        }
        return this.c;
    }

    public r8e b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r8e) ipChange.ipc$dispatch("42367b10", new Object[]{this});
        }
        return this.d;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        return this.b;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6179233f", new Object[]{this})).booleanValue();
        }
        return this.f23863a;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601e7ac1", new Object[]{this, new Boolean(z)});
        } else {
            this.f23863a = z;
        }
    }

    public m9f(String str, atb atbVar, r8e r8eVar) {
        this.b = str;
        this.c = atbVar;
        this.d = r8eVar;
    }
}
