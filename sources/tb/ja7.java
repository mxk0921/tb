package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ja7 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public l5i f21863a;
    public vxj b;

    static {
        t2o.a(352322006);
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("638dfb32", new Object[]{this})).longValue();
        }
        return 0L;
    }

    public abstract String b();

    public abstract void c();

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            l5i l5iVar = this.f21863a;
            if (l5iVar != null) {
                String n = l5iVar.n();
                l5iVar.a(n, "DelayTask runTask 开始执行: " + b());
            }
            c();
        } catch (Throwable th) {
            th.printStackTrace();
            l5i l5iVar2 = this.f21863a;
            if (l5iVar2 != null) {
                l5iVar2.b(l5iVar2.n(), "未知异常，runTask . throwable  ", th);
            }
        }
        try {
            vxj vxjVar = this.b;
            if (vxjVar != null && !vxjVar.e) {
                int i = vxjVar.c - 1;
                vxjVar.c = i;
                if (i <= 0) {
                    vxjVar.e = true;
                    l5i l5iVar3 = this.f21863a;
                    if (l5iVar3 != null) {
                        l5iVar3.a(l5iVar3.n(), "on task end.mHasStartProcessAllTask and mDelayTaskCount is 0 , all task have been processed. will set mHasProcessAllDelayTaskEnd");
                    }
                }
            }
        } catch (Throwable th2) {
            l5i l5iVar4 = this.f21863a;
            if (l5iVar4 != null) {
                l5iVar4.b(l5iVar4.n(), "未知异常，runTask end.", th2);
            }
        }
    }
}
