package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.Map;
import tb.mz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bos {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String SCREENSHOT_MONITOR_TAG = "detail";
    public static final String TAG = "TTDetailScreenShotTracer";

    /* renamed from: a  reason: collision with root package name */
    public final tz8 f16518a = FalcoGlobalTracer.get();
    public final boolean b;
    public final d1a<? extends Map<String, String>> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912262097);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements mz8.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.mz8.a
        public final Map<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("703083e1", new Object[]{this});
            }
            return (Map) bos.a(bos.this).invoke();
        }
    }

    static {
        t2o.a(912262096);
    }

    public bos(boolean z, d1a<? extends Map<String, String>> d1aVar) {
        ckf.h(d1aVar, "traceInfo");
        this.b = z;
        this.c = d1aVar;
    }

    public static final /* synthetic */ d1a a(bos bosVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("c9f5cab8", new Object[]{bosVar});
        }
        return bosVar.c;
    }

    public final void b() {
        mz8 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
        } else if (!this.b) {
            tgh.b(TAG, "isWaterMaskTrace is false");
        } else {
            try {
                tz8 tz8Var = this.f16518a;
                if (!(tz8Var == null || (g = tz8Var.g()) == null)) {
                    g.a("detail", new b());
                }
            } catch (Exception e) {
                tgh.c(TAG, "register error", e);
            }
            tgh.b(TAG, "register");
        }
    }

    public final void c() {
        mz8 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
        } else if (!this.b) {
            tgh.b(TAG, "isWaterMaskTrace is false");
        } else {
            try {
                tz8 tz8Var = this.f16518a;
                if (!(tz8Var == null || (g = tz8Var.g()) == null)) {
                    g.unregisterListener("detail");
                }
            } catch (Exception e) {
                tgh.c(TAG, "unregister error", e);
            }
            tgh.b(TAG, MiPushClient.COMMAND_UNREGISTER);
        }
    }
}
