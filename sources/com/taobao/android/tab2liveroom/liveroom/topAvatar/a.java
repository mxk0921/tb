package com.taobao.android.tab2liveroom.liveroom.topAvatar;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.a;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.CustomSwipeRefreshLayout;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;
import tb.akt;
import tb.alc;
import tb.s6o;
import tb.t2o;
import tb.wzt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LiveSecondRefreshManager";

    /* renamed from: a  reason: collision with root package name */
    public final Context f9528a;
    public final int b;
    public CustomSwipeRefreshLayout c;
    public final b d;
    public LinearLayout e;
    public final Handler f;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.tab2liveroom.liveroom.topAvatar.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0490a implements CustomSwipeRefreshLayout.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wzt f9529a;
        public final /* synthetic */ int b;

        public C0490a(wzt wztVar, int i) {
            this.f9529a = wztVar;
            this.b = i;
        }

        public final /* synthetic */ void b(wzt wztVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d75b95f4", new Object[]{this, wztVar});
            } else {
                a.this.t(wztVar);
            }
        }

        public void c(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10fdc7cc", new Object[]{this, new Boolean(z), new Boolean(z2)});
            } else if (a.d(a.this) == null) {
            } else {
                if (z) {
                    a.d(a.this).c(z2);
                } else {
                    a.d(a.this).f(z2);
                }
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
                return;
            }
            this.f9529a.onRefresh();
            if (this.b > 0) {
                a.c(a.this).removeCallbacksAndMessages(null);
                Handler c = a.c(a.this);
                final wzt wztVar = this.f9529a;
                c.postDelayed(new Runnable() { // from class: tb.c4h
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0490a.this.b(wztVar);
                    }
                }, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a(String str);

        void b(boolean z);

        void c(boolean z);

        void d();

        void e();

        void f(boolean z);

        void g();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f9530a;
        public ViewGroup b;
        public View c;
        public TaoliveOpenLiveRoom d;
        public alc e;
        public float f;
        public String g;
        public String h;
        public boolean i;
        public Map j;
        public a k;

        static {
            t2o.a(779092190);
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("22d93583", new Object[]{this});
            }
            return new a(this, null);
        }

        public c b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("d607977d", new Object[]{this, context});
            }
            this.f9530a = context;
            return this;
        }

        public c c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("4b14fca3", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public c d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("1858c1e3", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public c e(alc alcVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("ad035cf7", new Object[]{this, alcVar});
            }
            this.e = alcVar;
            return this;
        }

        public c f(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("6428d126", new Object[]{this, view});
            }
            this.c = view;
            return this;
        }

        public c g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("5877c66c", new Object[]{this, aVar});
            }
            this.k = aVar;
            return this;
        }

        public c h(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("b0b99501", new Object[]{this, map});
            }
            this.j = map;
            return this;
        }

        public c i(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("9fcdf318", new Object[]{this, viewGroup});
            }
            this.b = viewGroup;
            return this;
        }

        public c j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("9a6b9d17", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public c k(TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("312ab8c1", new Object[]{this, taoliveOpenLiveRoom});
            }
            this.d = taoliveOpenLiveRoom;
            return this;
        }

        public c l(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("2c43b37c", new Object[]{this, new Float(f)});
            }
            this.f = f;
            return this;
        }
    }

    static {
        t2o.a(779092187);
    }

    public /* synthetic */ a(c cVar, C0490a aVar) {
        this(cVar);
    }

    public static /* synthetic */ Handler c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("33f1b49f", new Object[]{aVar});
        }
        return aVar.f;
    }

    public static /* synthetic */ b d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e1526961", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ boolean j(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3aefab4", new Object[]{view, motionEvent})).booleanValue();
        }
        return false;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a97512", new Object[]{this});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout != null) {
            customSwipeRefreshLayout.closeFirstStageView();
        }
    }

    public b g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("98687483", new Object[]{this});
        }
        return this.d;
    }

    public CustomSwipeRefreshLayout h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomSwipeRefreshLayout) ipChange.ipc$dispatch("1824cc1e", new Object[]{this});
        }
        return this.c;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8db4c48", new Object[]{this})).booleanValue();
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout != null) {
            return customSwipeRefreshLayout.isFirstStageShowing();
        }
        return false;
    }

    public final /* synthetic */ void k() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68af09d6", new Object[]{this});
        } else if (this.d != null && (customSwipeRefreshLayout = this.c) != null && customSwipeRefreshLayout.isFirstStageShowing()) {
            ((LiveAvatarController) this.d).e();
        }
    }

    public void l(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba2166", new Object[]{this, videoInfo});
            return;
        }
        if (!(g() == null || videoInfo == null || videoInfo.broadCaster == null)) {
            g().a(videoInfo.broadCaster.accountId);
        }
        t(null);
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb83e7a", new Object[]{this, new Boolean(z)});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout != null) {
            customSwipeRefreshLayout.setEnableFirstStage(z);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df26552", new Object[]{this});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout != null) {
            customSwipeRefreshLayout.setFirstBlankView(this.e);
        }
    }

    public void o(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fc572c", new Object[]{this, view, new Boolean(z)});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout != null) {
            customSwipeRefreshLayout.setFirstStageView(view, z);
        }
    }

    public void p(Context context, ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1146eb1", new Object[]{this, context, viewGroup, view});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout == null) {
            this.c = new CustomSwipeRefreshLayout(context, view, f(context), this.b);
        } else {
            customSwipeRefreshLayout.setTarget(view);
        }
        this.c.post(new Runnable() { // from class: tb.a4h
            @Override // java.lang.Runnable
            public final void run() {
                a.this.k();
            }
        });
        viewGroup.removeView(view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.b + s6o.c(context, 10);
        viewGroup.addView(this.c, new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(this.c.getSecondView(), layoutParams);
        this.c.setSecondStageState(false);
        this.c.addView(view, new FrameLayout.LayoutParams(-1, -1));
        this.c.bringFirstView2Front();
    }

    public void q(wzt wztVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63409469", new Object[]{this, wztVar, new Integer(i)});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout != null) {
            customSwipeRefreshLayout.setOnRefreshListener(new C0490a(wztVar, i));
        }
    }

    public void r(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8430b5", new Object[]{this, str, obj});
            return;
        }
        b bVar = this.d;
        if (bVar != null) {
            ((LiveAvatarController) bVar).Q(str, obj);
        }
    }

    public final void s(TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1a963c", new Object[]{this, taoliveOpenLiveRoom});
        } else {
            ((RecyclerView) taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.getRecyclerView, new Object[0])).setTag(CustomSwipeRefreshLayout.getRecyclerViewTagId(), Boolean.TRUE);
        }
    }

    public void t(wzt wztVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83080bc5", new Object[]{this, wztVar});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout != null) {
            customSwipeRefreshLayout.setRefreshing(false);
        }
        if (wztVar != null) {
            wztVar.onRefreshEnd();
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2810aa84", new Object[]{this});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout != null) {
            customSwipeRefreshLayout.showFirstStageWhenStart();
        }
    }

    public void v(ViewGroup viewGroup, View view, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b33ada5", new Object[]{this, viewGroup, view, taoliveOpenLiveRoom});
            return;
        }
        s(taoliveOpenLiveRoom);
        p(this.f9528a, viewGroup, view);
        b bVar = this.d;
        if (bVar != null) {
            ((LiveAvatarController) bVar).V(view, taoliveOpenLiveRoom);
        }
    }

    public a(c cVar) {
        this.f = new Handler(Looper.getMainLooper());
        Context context = cVar.f9530a;
        this.f9528a = context;
        this.b = (int) cVar.f;
        s(cVar.d);
        p(context, cVar.b, cVar.c);
        if (LiveAvatarController.H(cVar.g, cVar.h, cVar.i) && context != null) {
            this.d = new LiveAvatarController(cVar.g(this));
        }
    }

    public final ViewGroup f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("840f012d", new Object[]{this, context});
        }
        if (!akt.e1()) {
            return new LinearLayout(context);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.e.setOrientation(1);
        TNodeImageView tNodeImageView = new TNodeImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(s6o.c(context, 70), s6o.c(context, 40));
        layoutParams.gravity = 1;
        tNodeImageView.setLayoutParams(layoutParams);
        tNodeImageView.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01WSPJcG1N8Uxrvceno_!!6000000001525-2-tps-140-81.png");
        this.e.addView(tNodeImageView);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = s6o.c(context, 11);
        layoutParams2.leftMargin = s6o.c(context, 10);
        layoutParams2.rightMargin = s6o.c(context, 10);
        layoutParams2.bottomMargin = s6o.c(context, 10);
        textView.setLayoutParams(layoutParams2);
        textView.setText("暂时没有直播中的\n关注主播");
        textView.setTextSize(13.0f);
        textView.setTextColor(-1);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setGravity(1);
        this.e.addView(textView);
        linearLayout.addView(this.e);
        this.e.setOnTouchListener(new View.OnTouchListener() { // from class: tb.b4h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean j;
                j = a.j(view, motionEvent);
                return j;
            }
        });
        return linearLayout;
    }
}
