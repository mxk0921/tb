package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.GalleryTracker;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.VesselViewHolder;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import java.util.HashMap;
import kotlin.TypeCastException;
import tb.p6m;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class gd7 implements View.OnClickListener, asc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, String> f19910a;
    public s b;
    public Context c;
    public View d;
    public View e;
    public p6m.a f;
    public boolean g;
    public asc h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912262280);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class b implements qtb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262281);
            t2o.a(452985045);
        }

        public b(gd7 gd7Var) {
        }

        @Override // tb.qtb
        public boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            return false;
        }
    }

    static {
        t2o.a(912262279);
        t2o.a(912262299);
        t2o.a(774897787);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f87bc9d", new Object[]{this});
            return;
        }
        s sVar = this.b;
        if (sVar != null) {
            View o = sVar.o();
            this.e = o;
            ViewParent viewParent = null;
            if ((o != null ? o.getParent() : null) != null) {
                View view = this.e;
                if (view != null) {
                    viewParent = view.getParent();
                }
                if (viewParent != null) {
                    ((ViewGroup) viewParent).removeView(this.e);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            View view2 = this.d;
            if (view2 != null) {
                ViewGroup viewGroup = (ViewGroup) view2;
                viewGroup.addView(this.e, new RelativeLayout.LayoutParams(-1, -1));
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("width", Integer.valueOf(viewGroup.getWidth()));
                hashMap.put("height", Integer.valueOf(viewGroup.getHeight()));
                sVar.c("setFrame", hashMap);
            }
        }
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b31b7088", new Object[]{this})).intValue();
        }
        s sVar = this.b;
        if (sVar != null) {
            return (int) sVar.m(1502);
        }
        return -1;
    }

    public void c(Context context, p6m.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfbb4a0", new Object[]{this, context, aVar, new Boolean(z)});
            return;
        }
        ckf.h(context, "context");
        ckf.h(aVar, "videoParam");
        if (this.c == null) {
            this.c = context;
            this.f = aVar;
            this.d = aVar.b;
        }
        d();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfa5052", new Object[]{this});
            return;
        }
        p6m.a aVar = this.f;
        if (aVar != null && !TextUtils.isEmpty(aVar.f25911a) && this.d != null) {
            if (this.b == null) {
                s.d dVar = new s.d();
                dVar.n = nbf.STDPOP_POP_ID_DETAIL;
                View view = this.d;
                if (view != null) {
                    dVar.x = view.getWidth();
                    View view2 = this.d;
                    if (view2 != null) {
                        dVar.y = view2.getHeight();
                        p6m.a aVar2 = this.f;
                        if (aVar2 != null) {
                            dVar.m = aVar2.c;
                            dVar.g = bew.a(this.c);
                            p6m.a aVar3 = this.f;
                            if (aVar3 != null) {
                                dVar.l = aVar3.f25911a;
                                dVar.j = "TBVideo";
                                dVar.c0 = null;
                                dVar.i = true;
                                if (!TextUtils.isEmpty(aVar3.d)) {
                                    p6m.a aVar4 = this.f;
                                    if (aVar4 != null) {
                                        dVar.R = aVar4.d;
                                    } else {
                                        ckf.s();
                                        throw null;
                                    }
                                }
                                dVar.t = this;
                                dVar.G = new b(this);
                                dVar.T = true;
                                dVar.S = false;
                                this.b = s.c.c("", dVar);
                            } else {
                                ckf.s();
                                throw null;
                            }
                        } else {
                            ckf.s();
                            throw null;
                        }
                    } else {
                        ckf.s();
                        throw null;
                    }
                } else {
                    ckf.s();
                    throw null;
                }
            }
            a();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        s sVar = this.b;
        if (sVar != null) {
            sVar.u();
        }
    }

    public final void f() {
        ViewParent viewParent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea0f33b", new Object[]{this});
            return;
        }
        View view = this.e;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            viewGroup.removeView(this.e);
        }
        s sVar = this.b;
        if (sVar != null) {
            sVar.h();
        }
        this.b = null;
    }

    public final void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        s sVar = this.b;
        if (sVar != null) {
            sVar.y(i, false);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c5afa3", new Object[]{this});
            return;
        }
        if (this.f19910a == null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("spm", "a2141.7631564.1999020245");
            this.f19910a = hashMap;
            p6m.a aVar = this.f;
            if (aVar != null) {
                if (aVar != null) {
                    String str = aVar.c;
                    ckf.c(str, "videoParam!!.videoId");
                    hashMap.put(xau.PROPERTY_VIDEO_ID, str);
                } else {
                    ckf.s();
                    throw null;
                }
            }
        }
        GalleryTracker.a(this.c, VesselViewHolder.UT_SHOW_ARG1, this.f19910a);
    }

    public final void i(asc ascVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39001713", new Object[]{this, ascVar});
        } else {
            this.h = ascVar;
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a420d40", new Object[]{this});
            return;
        }
        s sVar = this.b;
        if (sVar != null) {
            int m = (int) sVar.m(1500);
            if (m == 0 || m == 4) {
                sVar.F();
            }
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6929b67", new Object[]{this});
            return;
        }
        f();
        s sVar = this.b;
        if (sVar != null) {
            sVar.h();
        }
        this.b = null;
    }

    public void l(boolean z, boolean z2) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd032a3", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.f != null && (sVar = this.b) != null) {
            if (z && z2) {
                sVar.u();
            }
            int m = (int) sVar.m(1500);
            if (!z || z2) {
                if (z && z2) {
                    sVar.u();
                }
            } else if (m == 8) {
                this.g = true;
            }
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8558e", new Object[]{this});
            return;
        }
        h();
        a();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    @Override // tb.asc
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
            return;
        }
        asc ascVar = this.h;
        if (ascVar != null) {
            ascVar.onMediaClose();
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        asc ascVar = this.h;
        if (ascVar != null) {
            ascVar.onMediaError(iMediaPlayer, i, i2);
        }
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        asc ascVar = this.h;
        if (ascVar != null) {
            ascVar.onMediaInfo(iMediaPlayer, j, j2, j3, obj);
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            return;
        }
        asc ascVar = this.h;
        if (ascVar == null) {
            return;
        }
        if (ascVar != null) {
            ascVar.onMediaPause(z);
        } else {
            ckf.s();
            throw null;
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        asc ascVar = this.h;
        if (ascVar == null) {
            return;
        }
        if (ascVar != null) {
            ascVar.onMediaPlay();
        } else {
            ckf.s();
            throw null;
        }
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            return;
        }
        asc ascVar = this.h;
        if (ascVar != null) {
            ascVar.onMediaPrepared(iMediaPlayer);
        }
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        asc ascVar = this.h;
        if (ascVar != null) {
            ascVar.onMediaProgressChanged(i, i2, i3);
        }
    }

    @Override // tb.asc
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
            return;
        }
        asc ascVar = this.h;
        if (ascVar != null) {
            ascVar.onMediaScreenChanged(mediaPlayScreenType);
        }
    }

    @Override // tb.asc
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
            return;
        }
        asc ascVar = this.h;
        if (ascVar != null) {
            ascVar.onMediaSeekTo(i);
        }
    }

    @Override // tb.asc
    public void onMediaStart() {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
        } else if (!this.g || (sVar = this.b) == null) {
            asc ascVar = this.h;
            if (ascVar != null) {
                ascVar.onMediaStart();
            }
        } else if (sVar != null) {
            sVar.t(false);
            s sVar2 = this.b;
            if (sVar2 != null) {
                sVar2.u();
                this.g = false;
                return;
            }
            ckf.s();
            throw null;
        } else {
            ckf.s();
            throw null;
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            return;
        }
        s sVar2 = this.b;
        if (!(sVar2 == null || ((int) sVar2.m(1503)) != 1 || (sVar = this.b) == null)) {
            sVar.c("toggleScreen", null);
        }
        k();
        asc ascVar = this.h;
        if (ascVar != null) {
            ascVar.onMediaComplete();
        }
    }
}
