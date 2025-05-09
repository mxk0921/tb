package tb;

import android.app.StatusBarManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.quicksearch.ScreenShotService;
import com.taobao.taobao.R;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class mwo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                runnable.run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b<T> implements Consumer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24347a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f24348a;

            public a(Context context) {
                this.f24348a = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                mzu.n("Page_PhotoSearchResult", "addQuickSearchSuccess", 19999, new String[0]);
                i0u.f(this.f24348a, Localization.q(R.string.taobao_app_1007_1_19041), 0);
            }
        }

        public b(Context context) {
            this.f24347a = context;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a350c488", new Object[]{this, num});
            } else if (num != null && num.intValue() == 2) {
                new Handler(Looper.getMainLooper()).post(new a(this.f24347a));
            }
        }
    }

    static {
        t2o.a(730857694);
    }

    public static final void a(Context context) {
        Object systemService;
        Icon createWithResource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79fc54a8", new Object[]{context});
            return;
        }
        ckf.g(context, "context");
        systemService = context.getSystemService(iwo.a());
        if (systemService != null) {
            StatusBarManager a2 = jwo.a(systemService);
            mzu.n("Page_PhotoSearchResult", "requestQuickSearch", 19999, new String[0]);
            ComponentName componentName = new ComponentName(context, ScreenShotService.class);
            String q = Localization.q(R.string.taobao_app_1007_1_19033);
            createWithResource = Icon.createWithResource(context, R.drawable.ic_quick_search);
            a2.requestAddTileService(componentName, q, createWithResource, a.INSTANCE, ok4.a(new b(context)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.StatusBarManager");
    }
}
