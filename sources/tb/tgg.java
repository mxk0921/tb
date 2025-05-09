package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tgg implements kjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fpk f28706a;

        /* compiled from: Taobao */
        /* renamed from: tb.tgg$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class C1062a implements u11 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C1062a() {
            }

            @Override // tb.u11, com.taobao.application.common.IApmEventListener
            public void onEvent(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                } else if (i == 1) {
                    a.this.f28706a.b();
                } else if (i == 2) {
                    a.this.f28706a.a();
                }
            }
        }

        public a(fpk fpkVar) {
            this.f28706a = fpkVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c21.c(new C1062a());
            }
        }
    }

    static {
        t2o.a(744488968);
        t2o.a(467664918);
    }

    @Override // tb.kjc
    public void onEvent(fpk fpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996fb4a", new Object[]{this, fpkVar});
        } else if (fpkVar != null) {
            new Handler(Looper.getMainLooper()).post(new a(fpkVar));
        }
    }
}
