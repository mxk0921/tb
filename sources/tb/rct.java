package tb;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.lang.ref.SoftReference;
import tb.hpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class rct extends yio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String d;
    private final hpc.a e;
    private final MUSImageQuality f;
    private final String g;
    private final String h;
    private final boolean i;
    private boolean j;
    private volatile boolean k;
    private volatile p1m l;
    private boolean m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Bitmap e;

        public a(Bitmap bitmap) {
            this.e = bitmap;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/Task$loadBase64$1");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            hpc.a m = rct.this.m();
            if (!rct.g(rct.this) && rct.this.m().getTag() == rct.this) {
                m.c(new BitmapDrawable(this.e));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b extends rs2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27283a;

        public b(String str) {
            this.f27283a = str;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/Task$loadNetworkPic$creator$1$1");
        }

        @Override // tb.rs2
        public String b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("26344f37", new Object[]{this, str, str2});
            }
            String str3 = this.f27283a;
            ckf.d(str3);
            return str3;
        }

        @Override // tb.rs2
        public String c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("39ea4953", new Object[]{this, str, str2});
            }
            String str3 = this.f27283a;
            ckf.d(str3);
            return str3;
        }
    }

    static {
        t2o.a(815792682);
    }

    public rct(String str, hpc.a aVar, MUSImageQuality mUSImageQuality, String str2, String str3, boolean z, boolean z2) {
        ckf.g(str, "url");
        ckf.g(aVar, "target");
        ckf.g(str2, "key");
        ckf.g(str3, VideoControllerManager.KEY_CACHEKEY);
        this.d = str;
        this.e = aVar;
        this.f = mUSImageQuality;
        this.g = str2;
        this.h = str3;
        this.i = z;
        this.j = z2;
        aVar.g(this);
    }

    public static final /* synthetic */ boolean g(rct rctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a1153c0", new Object[]{rctVar})).booleanValue();
        }
        return rctVar.k;
    }

    public static /* synthetic */ Object ipc$super(rct rctVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/Task");
    }

    private final boolean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b24758d", new Object[]{this, str})).booleanValue();
        }
        if (str != null && TextUtils.equals(Uri.parse(str).getHost(), o4p.A())) {
            return true;
        }
        return false;
    }

    private final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f81bdc", new Object[]{this});
            return;
        }
        int Y = wsq.Y(this.d, nwl.BASE_64, 0, false, 6, null);
        if (Y >= 0) {
            String substring = this.d.substring(Y + 7);
            ckf.f(substring, "substring(...)");
            Bitmap b2 = nwl.b(substring);
            if (!this.k) {
                mwl.Companion.c().post(new a(b2));
            }
        }
    }

    private final void r() {
        String str;
        PhenixCreator phenixCreator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5577589", new Object[]{this});
        } else if (!this.k) {
            if (this.e.getWidth() <= 0 || this.e.getHeight() <= 0) {
                str = this.d;
            } else {
                str = mwl.Companion.a(this.e.getWidth(), this.e.getHeight(), this.d, this.f);
            }
            s0m B = s0m.B();
            if (p(str)) {
                phenixCreator = B.W(str, new b(str));
            } else {
                phenixCreator = B.T(str);
            }
            PhenixCreator failListener = phenixCreator.releasableDrawable(true).scaleFromLarge(true).preloadWithSmall(false).heightScale(true).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "8900").succListener(new s8d() { // from class: tb.tqz
                @Override // tb.s8d
                public final boolean onHappen(b1m b1mVar) {
                    boolean v;
                    v = rct.v(rct.this, (SuccPhenixEvent) b1mVar);
                    return v;
                }
            }).failListener(new s8d() { // from class: tb.uqz
                @Override // tb.s8d
                public final boolean onHappen(b1m b1mVar) {
                    boolean w;
                    w = rct.w(rct.this, (FailPhenixEvent) b1mVar);
                    return w;
                }
            });
            if (this.e.getWidth() > 0 && this.e.getHeight() > 0) {
                hpc.a aVar = this.e;
                if (aVar instanceof xdc) {
                    failListener.limitSize(null, ((xdc) aVar).b(), ((xdc) this.e).a());
                } else {
                    failListener.limitSize(null, aVar.getWidth(), this.e.getHeight());
                }
            }
            this.l = failListener.fetch();
        }
    }

    @Override // tb.yio
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4134b145", new Object[]{this});
        } else if (this.k || this.e == null) {
        } else {
            if (tsq.I(this.d, nwl.BASE_64_PREFIX, false, 2, null)) {
                q();
            } else {
                r();
            }
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (!this.k) {
            this.k = true;
            if (this.l != null) {
                p1m p1mVar = this.l;
                ckf.d(p1mVar);
                p1mVar.a();
                this.l = null;
            }
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd77cc67", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0d367e6", new Object[]{this});
        }
        return this.h;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.g;
    }

    public final MUSImageQuality l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSImageQuality) ipChange.ipc$dispatch("8875d96e", new Object[]{this});
        }
        return this.f;
    }

    public final hpc.a m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hpc.a) ipChange.ipc$dispatch("5a26569d", new Object[]{this});
        }
        return this.e;
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b8adf24", new Object[]{this})).booleanValue();
        }
        boolean I = tsq.I(this.d, nwl.BASE_64_PREFIX, false, 2, null);
        this.m = I;
        return I;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4a983ce", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b9812", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(rct rctVar, SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d827e4d7", new Object[]{rctVar, succPhenixEvent})).booleanValue();
        }
        ckf.g(rctVar, "this$0");
        if (rctVar.k || rctVar.e.getTag() != rctVar) {
            return true;
        }
        if (rctVar.i) {
            mwl.Companion.d().put(rctVar.h, new SoftReference<>(succPhenixEvent.getDrawable()));
        }
        if (succPhenixEvent.getDrawable() instanceof uwn) {
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            ckf.e(drawable, "null cannot be cast to non-null type com.taobao.phenix.cache.memory.ReleasableBitmapDrawable");
            nx7 nx7Var = new nx7((uwn) drawable, rctVar.g);
            rctVar.e.c(nx7Var);
            if (rctVar.j) {
                mwl.Companion.e().b(rctVar.g, nx7Var);
            }
        } else {
            rctVar.e.c(succPhenixEvent.getDrawable());
            if (succPhenixEvent.getDrawable() instanceof cy0) {
                BitmapDrawable drawable2 = succPhenixEvent.getDrawable();
                ckf.e(drawable2, "null cannot be cast to non-null type com.taobao.phenix.animate.AnimatedImageDrawable");
                ((cy0) drawable2).C();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(rct rctVar, FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e21556b4", new Object[]{rctVar, failPhenixEvent})).booleanValue();
        }
        ckf.g(rctVar, "this$0");
        if (rctVar.k || rctVar.e.getTag() != rctVar) {
            return true;
        }
        rctVar.e.e();
        return true;
    }
}
