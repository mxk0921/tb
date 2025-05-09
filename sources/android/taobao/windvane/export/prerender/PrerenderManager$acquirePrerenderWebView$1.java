package android.taobao.windvane.export.prerender;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PrerenderManager$acquirePrerenderWebView$1 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PrerenderManager$acquirePrerenderWebView$1 INSTANCE = new PrerenderManager$acquirePrerenderWebView$1();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: android.taobao.windvane.export.prerender.PrerenderManager$acquirePrerenderWebView$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/export/prerender/PrerenderManager$acquirePrerenderWebView$1$1");
        }

        public final void invoke(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return xhv.INSTANCE;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            TMSPrerenderService.INSTANCE.f(AnonymousClass1.INSTANCE);
        }
    }
}
