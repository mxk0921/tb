package com.taobao.themis.canvas.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.d1a;
import tb.iy4;
import tb.j4a;
import tb.p8s;
import tb.pg1;
import tb.q9s;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class GameForceUpdateGuide {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f13479a;
    public final j4a b;
    public final bbs c;
    public final PopupWindow d;
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(834666596);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            GameForceUpdateGuide.a(GameForceUpdateGuide.this).dismiss();
            GameForceUpdateGuide.this.b().W().e();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                GameForceUpdateGuide.a(GameForceUpdateGuide.this).dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                GameForceUpdateGuide.a(GameForceUpdateGuide.this).dismiss();
            }
        }
    }

    static {
        t2o.a(834666595);
    }

    public GameForceUpdateGuide(Context context, j4a j4aVar, bbs bbsVar) {
        ckf.g(context, "mContext");
        ckf.g(j4aVar, "mModel");
        ckf.g(bbsVar, "instance");
        this.f13479a = context;
        this.b = j4aVar;
        this.c = bbsVar;
        this.d = new PopupWindow(context);
    }

    public static final /* synthetic */ PopupWindow a(GameForceUpdateGuide gameForceUpdateGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("842b3dbc", new Object[]{gameForceUpdateGuide});
        }
        return gameForceUpdateGuide.d;
    }

    public final bbs b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("57ded820", new Object[]{this});
        }
        return this.c;
    }

    public final boolean c(View view) {
        View view2;
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc9d952", new Object[]{this, view})).booleanValue();
        }
        ckf.g(view, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        if (this.e) {
            return false;
        }
        boolean P0 = q9s.P0(this.c.L());
        if (P0) {
            view2 = View.inflate(this.f13479a, R.layout.themis_update_notification_guide_landscape, null);
        } else {
            view2 = View.inflate(this.f13479a, R.layout.themis_update_notification_guide, null);
        }
        if (view2 == null) {
            return false;
        }
        TextView textView = (TextView) view2.findViewById(R.id.content);
        TextView textView2 = (TextView) view2.findViewById(R.id.left_button);
        TextView textView3 = (TextView) view2.findViewById(R.id.right_button);
        TextView textView4 = (TextView) view2.findViewById(R.id.tvTitle);
        TUrlImageView tUrlImageView = (TUrlImageView) view2.findViewById(R.id.ivIcon);
        TUrlImageView tUrlImageView2 = (TUrlImageView) view2.findViewById(R.id.ivClose);
        if (textView == null || textView2 == null || textView3 == null || tUrlImageView == null || textView4 == null || tUrlImageView2 == null) {
            return false;
        }
        textView4.setText(this.b.d());
        tUrlImageView.setImageUrl(this.b.a(), new PhenixOptions().bitmapProcessors(new iy4()));
        textView.setText(this.b.c());
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        if (this.b.b()) {
            textView2.setText("退出游戏");
            textView2.setOnClickListener(new b());
            tUrlImageView2.setVisibility(8);
        } else {
            textView2.setText("忽略");
            textView2.setOnClickListener(new c());
            tUrlImageView2.setVisibility(0);
            tUrlImageView2.setOnClickListener(new d());
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.themis.canvas.ui.GameForceUpdateGuide$show$4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            /* renamed from: com.taobao.themis.canvas.ui.GameForceUpdateGuide$show$4$2  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
            public static final class AnonymousClass2 extends Lambda implements d1a<xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ GameForceUpdateGuide this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(GameForceUpdateGuide gameForceUpdateGuide) {
                    super(0);
                    this.this$0 = gameForceUpdateGuide;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/ui/GameForceUpdateGuide$show$4$2");
                }

                @Override // tb.d1a
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                    } else {
                        this.this$0.b().W().e();
                    }
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                    return;
                }
                GameForceUpdateGuide.a(GameForceUpdateGuide.this).dismiss();
                INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) p8s.b(INavigatorAdapter.class);
                if (iNavigatorAdapter != null) {
                    Activity I = GameForceUpdateGuide.this.b().I();
                    ckf.f(I, "instance.activity");
                    String e0 = GameForceUpdateGuide.this.b().e0();
                    ckf.f(e0, "instance.url");
                    HashMap hashMap = new HashMap();
                    hashMap.put("disableTransition", Boolean.TRUE);
                    xhv xhvVar = xhv.INSTANCE;
                    iNavigatorAdapter.openURL(I, e0, null, null, hashMap);
                }
                CommonExtKt.q(new AnonymousClass2(GameForceUpdateGuide.this), 300L);
            }
        });
        Object systemService = this.f13479a.getSystemService(pg1.ATOM_EXT_window);
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics2);
            FrameLayout frameLayout = new FrameLayout(this.f13479a);
            if (P0) {
                layoutParams = new FrameLayout.LayoutParams((displayMetrics.widthPixels * 750) / 1624, -2);
            } else {
                layoutParams = new FrameLayout.LayoutParams((displayMetrics.widthPixels * 590) / 750, -2);
            }
            layoutParams.gravity = 17;
            frameLayout.addView(view2, layoutParams);
            this.d.setContentView(frameLayout);
            this.d.setOutsideTouchable(false);
            this.d.setFocusable(true);
            this.d.setClippingEnabled(false);
            this.d.setSoftInputMode(16);
            ColorDrawable colorDrawable = new ColorDrawable(-16777216);
            colorDrawable.setAlpha(100);
            this.d.setBackgroundDrawable(colorDrawable);
            this.d.setHeight(displayMetrics.heightPixels);
            this.d.getContentView().setPadding(0, 0, 0, displayMetrics.heightPixels - displayMetrics2.heightPixels);
            this.d.setWidth(-1);
            if (((Activity) this.f13479a).isFinishing()) {
                return false;
            }
            this.d.showAtLocation(view, 17, 0, 0);
            this.e = true;
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
