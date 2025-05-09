package android.taobao.windvane.export.prerender;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.g1a;
import tb.lcn;
import tb.vpw;
import tb.vum;
import tb.wum;
import tb.xhv;
import tb.xum;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PrerenderManager$preRender$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g1a $callback;
    public final /* synthetic */ xum $params;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/wum;", "prerenderItem", "Ltb/xhv;", "invoke", "(Ltb/wum;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: android.taobao.windvane.export.prerender.PrerenderManager$preRender$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<wum, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: android.taobao.windvane.export.prerender.PrerenderManager$preRender$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static final class C00051 extends Lambda implements d1a<xhv> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ wum $prerenderItem;

            /* compiled from: Taobao */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            /* renamed from: android.taobao.windvane.export.prerender.PrerenderManager$preRender$1$1$1$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
            public static final class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (PrerenderManager.a(PrerenderManager.INSTANCE).remove(C00051.this.$prerenderItem)) {
                        lcn.f(RVLLevel.Info, "Themis/Performance/Prerender", "prerender webview expired");
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00051(wum wumVar) {
                super(0);
                this.$prerenderItem = wumVar;
            }

            public static /* synthetic */ Object ipc$super(C00051 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/export/prerender/PrerenderManager$preRender$1$1$1");
            }

            @Override // tb.d1a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                    return;
                }
                PrerenderManager.a(PrerenderManager.INSTANCE).add(this.$prerenderItem);
                CommonExtKt.p(new a(), PrerenderManager$preRender$1.this.$params.d());
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "Themis/Performance/Prerender", "start preRendering, url: " + PrerenderManager$preRender$1.this.$params.e() + ", preRenderType: " + PrerenderManager$preRender$1.this.$params.b());
                PrerenderManager$preRender$1.this.$callback.invoke(Boolean.TRUE);
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/export/prerender/PrerenderManager$preRender$1$1");
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(wum wumVar) {
            invoke2(wumVar);
            return xhv.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(wum wumVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa982eb0", new Object[]{this, wumVar});
            } else if (wumVar == null) {
                lcn.f(RVLLevel.Error, "Themis/Performance/Prerender", "failed to create prerender webview");
                PrerenderManager$preRender$1.this.$callback.invoke(Boolean.FALSE);
            } else {
                CommonExtKt.o(new C00051(wumVar));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrerenderManager$preRender$1(g1a g1aVar, xum xumVar) {
        super(0);
        this.$callback = g1aVar;
        this.$params = xumVar;
    }

    public static /* synthetic */ Object ipc$super(PrerenderManager$preRender$1 prerenderManager$preRender$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/export/prerender/PrerenderManager$preRender$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        int i = vpw.commonConfig.u2;
        PrerenderManager prerenderManager = PrerenderManager.INSTANCE;
        if (PrerenderManager.a(prerenderManager).size() >= i) {
            lcn.f(RVLLevel.Error, "Themis/Performance/Prerender", "exceed prerender size limit");
            this.$callback.invoke(Boolean.FALSE);
            return;
        }
        Iterator it = PrerenderManager.a(prerenderManager).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            xum a2 = ((wum) obj).a();
            if (a2.c().a(a2.e(), this.$params.e())) {
                break;
            }
        }
        if (((wum) obj) != null) {
            lcn.f(RVLLevel.Info, "Themis/Performance/Prerender", "found existing prerender webview");
            this.$callback.invoke(Boolean.FALSE);
            return;
        }
        vum.INSTANCE.a(this.$params, new AnonymousClass1());
    }
}
