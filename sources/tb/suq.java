package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class suq implements otd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final fuq f28284a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (mdy.c()) {
                d9j.c("SubTabViewRenderListener", "旧链路端快照预取链路关闭");
            } else {
                b5b l = suq.a(suq.this).l();
                if (l != null) {
                    l.n();
                    d9j.c("SubTabViewRenderListener", "触发端快照预取");
                }
            }
        }
    }

    static {
        t2o.a(729809472);
        t2o.a(729809471);
    }

    public suq(fuq fuqVar) {
        this.f28284a = fuqVar;
    }

    public static /* synthetic */ fuq a(suq suqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fuq) ipChange.ipc$dispatch("4567ae8", new Object[]{suqVar});
        }
        return suqVar.f28284a;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cf383c", new Object[]{this, new Integer(i)});
        } else if (!(this.f28284a.q(i) instanceof i0b)) {
            d9j.c("SubTabViewRenderListener", "只有推荐容器重新创建了才做会场的端快照预取");
        } else {
            m5a.a().g(new a(), 1000L);
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be384e55", new Object[]{this, new Integer(i)});
        }
    }
}
