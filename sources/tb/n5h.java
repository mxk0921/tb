package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.taobao.R;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n5h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_LIVE_DELAY_TIME = 1000;
    public static final int MAX_LIVE_DELAY_TIME = 60000;
    public static long e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final k5h f24526a;
    public Context b;
    public final FluidContext c;
    public Handler d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends wlb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k5h f24527a;

        public a(k5h k5hVar) {
            this.f24527a = k5hVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 2063982600) {
                super.onCreateView((uq9) objArr[0], (RecyclerViewHolder) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/live/manager/player/LiveWarmupManager$1");
        }

        @Override // tb.wlb.a, tb.wlb
        public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
                return;
            }
            super.onCreateView(uq9Var, recyclerViewHolder);
            n5h.a(n5h.this, this.f24527a.R());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/live/manager/player/LiveWarmupManager$2");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (n5h.b(n5h.this) != null) {
                n5h.b(n5h.this).P0();
                n5h n5hVar = n5h.this;
                n5h.c(n5hVar, n5h.b(n5hVar));
                ir9.b("LiveWarmupManager", "onPreCreateDWInstance videoAppearPlay 请求播放器,appeared:" + n5h.b(n5h.this).i0() + "，position" + n5h.b(n5h.this).M());
            }
        }
    }

    static {
        t2o.a(468713978);
    }

    public n5h(k5h k5hVar) {
        this.f24526a = k5hVar;
        this.c = k5hVar.U();
        k5hVar.N().addCardLifecycleListener((wlb.a) new a(k5hVar));
    }

    public static /* synthetic */ Context a(n5h n5hVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("be54eb8e", new Object[]{n5hVar, context});
        }
        n5hVar.b = context;
        return context;
    }

    public static /* synthetic */ k5h b(n5h n5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k5h) ipChange.ipc$dispatch("91c50734", new Object[]{n5hVar});
        }
        return n5hVar.f24526a;
    }

    public static /* synthetic */ void c(n5h n5hVar, k5h k5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00bae43", new Object[]{n5hVar, k5hVar});
        } else {
            n5hVar.k(k5hVar);
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b00ec14d", new Object[0])).booleanValue();
        }
        if (!akt.p2("ShortVideo.enableLivWarmupLiveStream", true) || !i()) {
            return false;
        }
        return true;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d92184bd", new Object[0]);
        }
        ir9.b("LiveWarmupManager", "getABBucketId,AB config bucketId:" + e);
        return String.valueOf(e);
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4510bd47", new Object[0])).intValue();
        }
        return akt.w2("ShortVideo.livePlayerDelayTime", 1000);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48875b41", new Object[0])).booleanValue();
        }
        String G2 = akt.G2("AB_fullscreenpage_video.live_warmup.isOpenWarmup", String.valueOf(false));
        boolean equals = TextUtils.equals("true", G2);
        ir9.b("LiveWarmupManager", "AB config enable:" + equals);
        if (TextUtils.equals(G2, String.valueOf(true)) || TextUtils.equals(G2, String.valueOf(false))) {
            m();
        }
        return equals;
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b904c64f", new Object[0]);
        } else if (e != 0) {
            ir9.b("LiveWarmupManager", "AB config bucketId不为null:" + e);
        } else {
            VariationSet activate = UTABTest.activate("AB_fullscreenpage_video", "live_warmup");
            if (activate != null) {
                e = activate.getExperimentBucketId();
                ir9.b("LiveWarmupManager", "AB config bucketId:" + e);
            }
        }
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64efb6dc", new Object[]{this})).intValue();
        }
        k5h k5hVar = this.f24526a;
        if (k5hVar != null) {
            return k5hVar.M();
        }
        return 0;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea7802e", new Object[]{this});
        } else {
            this.d = new b(Looper.getMainLooper());
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f80d60f", new Object[]{this});
        } else if (this.d != null) {
            ir9.b("LiveWarmupManager", "videoAppearPlay,removePreCreatePlayerMessages");
            this.d.removeMessages(0);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9103ed2f", new Object[]{this});
        } else if (d()) {
            ir9.b("LiveWarmupManager", "onPreCreateDWInstance");
            if (f() == 0) {
                ir9.b("LiveWarmupManager", "首坑，不执行预热");
                return;
            }
            if (this.d == null) {
                h();
            }
            l();
            this.f24526a.y1(true);
            int g = g();
            if (g > 0 && g < 60000) {
                ir9.b("LiveWarmupManager", "延迟x ms创建播放器，x=：" + g);
                this.d.sendEmptyMessageDelayed(0, (long) g);
            } else if (g == 0) {
                ir9.b("LiveWarmupManager", "直接创建播放器");
                this.f24526a.P0();
            } else {
                ir9.b("LiveWarmupManager", "不满足预热条件");
            }
        }
    }

    public final void k(k5h k5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce113b8", new Object[]{this, k5hVar});
        } else if (k5hVar == null || k5hVar.p1() == null || this.b == null) {
            ir9.b("LiveWarmupManager", " mediaView is null");
        } else {
            ir9.b("LiveWarmupManager", "window is null，mContext:" + this.b);
            Window window = ((Activity) this.b).getWindow();
            if (window == null) {
                ir9.b("LiveWarmupManager", "window is null");
                return;
            }
            View decorView = window.getDecorView();
            if (!(decorView instanceof ViewGroup)) {
                ir9.b("LiveWarmupManager", "decorView not instanceof ViewGroup");
                return;
            }
            ViewGroup p1 = k5hVar.p1();
            if (p1.getParent() != null) {
                ((ViewGroup) p1.getParent()).removeView(p1);
            }
            ir9.b("LiveWarmupManager", "preBindVideoView");
            p1.setTag(R.id.fluid_sdk_live_view_to_decorView, Boolean.TRUE);
            ((ViewGroup) decorView).addView(p1, 0, new ViewGroup.LayoutParams(1, 1));
        }
    }
}
