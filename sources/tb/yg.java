package tb;

import com.alibaba.android.aura.service.cache.AURACacheInput;
import com.alibaba.android.aura.service.cache.AURACacheOutput;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_KEY_TEMPLATE_CONTAINER = "templateContainer";
    public static final String CACHE_KEY_TEMPLATE_INFO = "templateInfo";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f32063a;
        public final /* synthetic */ CountDownLatch b;

        public a(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f32063a = atomicReference;
            this.b = countDownLatch;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1584757281) {
                super.c((yk) objArr[0]);
                return null;
            } else if (hashCode == -1339997787) {
                super.b((mi) objArr[0]);
                return null;
            } else if (hashCode == 1044070835) {
                super.a();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/utils/AURACacheUtils$1");
            }
        }

        @Override // tb.pt
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e3b41b3", new Object[]{this});
            } else {
                super.a();
            }
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            super.b(miVar);
            this.b.countDown();
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            super.c(ykVar);
            if (ykVar.b() instanceof AURACacheOutput) {
                this.f32063a.set(((AURACacheOutput) ykVar.b()).cacheData);
            }
            this.b.countDown();
        }
    }

    static {
        t2o.a(81789254);
    }

    public static Object a(nbb nbbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8683cf81", new Object[]{nbbVar, str});
        }
        AtomicReference atomicReference = new AtomicReference(null);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        nbbVar.c("aura.workflow.cache", new AURACacheInput(0, str), new a(atomicReference, countDownLatch));
        if (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await(TBToast.Duration.EXTRA_LONG, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
        return atomicReference.get();
    }

    public static void b(nbb nbbVar, String str, Object obj, pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a88bc69", new Object[]{nbbVar, str, obj, ptVar});
        } else {
            nbbVar.c("aura.workflow.cache", new AURACacheInput(1, str, obj), ptVar);
        }
    }
}
