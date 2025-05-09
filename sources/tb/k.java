package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static k f22317a;

    public static k b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("806084b9", new Object[0]);
        }
        if (f22317a == null) {
            synchronized (k.class) {
                try {
                    if (f22317a == null) {
                        f22317a = new k();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22317a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07a99ff", new Object[]{this});
            return;
        }
        try {
            ogh.i("ABAugeService", "【人群数据】取消更新人群数据。");
            ydt.h(1001);
        } catch (Throwable th) {
            ogh.h("ABAugeService", th.getMessage(), th);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        try {
            jj1.h().f(n.j().b());
            ku0.n();
        } catch (Throwable th) {
            ogh.h("ABAugeService", th.getMessage(), th);
        }
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a8f53f8", new Object[]{this, str})).booleanValue();
        }
        try {
            long nanoTime = System.nanoTime();
            boolean d = jj1.h().d("YiXiu", str, "dT1hbnQ");
            long nanoTime2 = System.nanoTime();
            ku0.r(str, d);
            ku0.c(str, nanoTime2 - nanoTime);
            if (d) {
                ku0.b(ku0.CROWD_EFFECTIVE_COUNTER, str);
            }
            ku0.b(ku0.CROWD_INVOKE_COUNTER, str);
            return d;
        } catch (Throwable th) {
            ogh.h("ABAugeService", "isCrowd judge fail", th);
            return false;
        }
    }
}
