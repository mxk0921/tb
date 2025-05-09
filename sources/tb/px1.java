package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class px1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f26370a = k7i.x();
    public String b = k7i.y();
    public int c = 4;
    public boolean d = true;
    public long e = f51.DEF_MAX_ASYNC_SECONDS;

    static {
        t2o.a(782237793);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26095428", new Object[]{this});
        }
        return this.f26370a;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd97d6b4", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0e63790", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a224b9b6", new Object[]{this, str});
        } else {
            this.f26370a = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76cdea0c", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd59e010", new Object[]{this, new Long(j)});
        } else if (j > 0) {
            this.e = j;
        } else {
            throw new IllegalArgumentException("cacheTime must be > 0");
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0867cf1", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad83890", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }
}
