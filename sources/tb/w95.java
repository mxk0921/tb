package tb;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.protocol.DWInteractiveVideoObject;
import com.taobao.media.DWViewUtil;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w95 implements ytb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f30526a;
    public final DWContext c;
    public ImageView d;
    public ImageView e;
    public ImageView f;
    public uli g;
    public nsb h;
    public TextView i;
    public FrameLayout j;
    public String k;
    public String l;
    public View o;
    public ysb p;
    public TextView q;
    public boolean b = false;
    public boolean m = true;
    public boolean n = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (w95.b(w95.this).getDWEventAdapter() != null && w95.e(w95.this) != null) {
                w95.b(w95.this).getDWEventAdapter().openUrl(w95.e(w95.this));
                HashMap hashMap = new HashMap();
                hashMap.put("interact_object_type", "shop");
                hashMap.put("actionResult", "guide");
                w95 w95Var = w95.this;
                w95.f(w95Var, "DWVideo", "Button", "videoShowInteract", w95.b(w95Var).getUTParams(), hashMap);
            }
        }
    }

    static {
        t2o.a(452985164);
        t2o.a(452985011);
    }

    public w95(DWContext dWContext) {
        this.c = dWContext;
        k();
        if (!(dWContext == null || dWContext.getVideo() == null)) {
            dWContext.getVideo().l(this);
        }
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWTopBarController);
    }

    public static /* synthetic */ ysb a(w95 w95Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ysb) ipChange.ipc$dispatch("c931044a", new Object[]{w95Var});
        }
        return w95Var.p;
    }

    public static /* synthetic */ DWContext b(w95 w95Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWContext) ipChange.ipc$dispatch("4207f5bc", new Object[]{w95Var});
        }
        return w95Var.c;
    }

    public static /* synthetic */ nsb c(w95 w95Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsb) ipChange.ipc$dispatch("74a4b1c6", new Object[]{w95Var});
        }
        return w95Var.h;
    }

    public static /* synthetic */ View d(w95 w95Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6b49cd25", new Object[]{w95Var});
        }
        return w95Var.o;
    }

    public static /* synthetic */ String e(w95 w95Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa9468fc", new Object[]{w95Var});
        }
        return w95Var.k;
    }

    public static /* synthetic */ void f(w95 w95Var, String str, String str2, String str3, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62121ae3", new Object[]{w95Var, str, str2, str3, map, map2});
        } else {
            w95Var.w(str, str2, str3, map, map2);
        }
    }

    public View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f30526a;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            this.f30526a.setVisibility(8);
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee652a72", new Object[]{this, new Boolean(z)});
        } else if (!this.b) {
            ImageView imageView = this.f;
            if (!(imageView == null || imageView.getVisibility() == 4)) {
                this.f.setVisibility(4);
            }
            ImageView imageView2 = this.d;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                this.d.setVisibility(4);
            }
            this.b = z;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b7df73", new Object[]{this});
            return;
        }
        this.n = false;
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.c.getActivity()).inflate(R.layout.tbavsdk_video_top_controller, (ViewGroup) null, false);
        this.f30526a = viewGroup;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.dw_controller_back_bt);
        this.e = imageView;
        imageView.setOnClickListener(new s95(this));
        ImageView imageView2 = (ImageView) this.f30526a.findViewById(R.id.video_controller_close);
        this.f = imageView2;
        imageView2.setOnClickListener(new t95(this));
        ImageView imageView3 = (ImageView) this.f30526a.findViewById(R.id.hiv_top_menu_btn);
        this.d = imageView3;
        imageView3.setVisibility(0);
        this.d.setOnClickListener(new u95(this));
        this.j = (FrameLayout) this.f30526a.findViewById(R.id.dw_event_view_container);
        DWContext dWContext = this.c;
        if (oya.a(dWContext, dWContext.getReportShown(), this.c.getReportFullScreenShown(), this.c.getOrangeReportShown())) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
        if (this.g == null) {
            this.g = new uli(this.c.getActivity(), this.c);
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1002);
            this.g.f(new v95(this));
            this.g.e(arrayList);
        }
        this.o = this.g.d();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        this.f30526a.addView(this.g.d(), layoutParams);
        this.o.setVisibility(4);
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e458418a", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.c.getActivity());
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.c.getActivity());
        this.i = textView;
        textView.setTextSize(1, 14.0f);
        this.i.setBackgroundResource(R.drawable.dw_goshop_background);
        TextView textView2 = this.i;
        Resources resources = this.c.getActivity().getResources();
        int i = R.color.dw_interactive_sdk_white;
        textView2.setTextColor(resources.getColor(i));
        Drawable drawable = this.c.getActivity().getResources().getDrawable(R.drawable.dw_goshop_icon);
        drawable.setBounds(0, 0, DWViewUtil.dip2px(this.c.getActivity(), 14.0f), DWViewUtil.dip2px(this.c.getActivity(), 14.0f));
        w3w w3wVar = new w3w(drawable);
        SpannableString spannableString = new SpannableString("    进店");
        spannableString.setSpan(w3wVar, 0, 4, 17);
        this.i.setText(spannableString);
        this.i.setGravity(17);
        this.i.setPadding(DWViewUtil.dip2px(this.c.getActivity(), 4.0f), DWViewUtil.dip2px(this.c.getActivity(), 2.0f), DWViewUtil.dip2px(this.c.getActivity(), 4.0f), DWViewUtil.dip2px(this.c.getActivity(), 2.0f));
        TextView textView3 = new TextView(this.c.getActivity());
        this.q = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.q.setMaxLines(1);
        this.q.setMaxEms(12);
        this.q.setText(this.l);
        this.q.setSingleLine(true);
        this.q.setTextSize(1, 14.0f);
        this.q.setTextColor(this.c.getActivity().getResources().getColor(i));
        this.q.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        linearLayout.addView(this.q, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, DWViewUtil.dip2px(this.c.getActivity(), 24.0f));
        layoutParams2.leftMargin = DWViewUtil.dip2px(this.c.getActivity(), 6.0f);
        layoutParams2.gravity = 16;
        linearLayout.addView(this.i, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, DWViewUtil.dip2px(this.c.getActivity(), 24.0f));
        layoutParams2.gravity = 16;
        this.j.addView(linearLayout, layoutParams3);
        this.i.setOnClickListener(new a());
    }

    public void m(nsb nsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84ff1fa", new Object[]{this, nsbVar});
        } else {
            this.h = nsbVar;
        }
    }

    public void o(ysb ysbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d89afcc8", new Object[]{this, ysbVar});
        } else {
            this.p = ysbVar;
        }
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        uli uliVar = this.g;
        if (uliVar != null) {
            try {
                uliVar.c();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        } else if (dWVideoScreenType != DWVideoScreenType.LANDSCAPE_FULL_SCREEN && (imageView = this.d) != null && imageView.getVisibility() == 0) {
            this.d.setVisibility(8);
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e44ccb6", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.q;
        if (textView != null) {
            textView.setMaxEms(i);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            this.f30526a.setVisibility(0);
        }
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b204ed", new Object[]{this, new Boolean(z)});
        } else if ((this.f != null && !this.b) || z) {
            this.b = false;
            if (this.c.screenType() == DWVideoScreenType.NORMAL) {
                this.f.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r6.screenType() != r3) goto L_0x0055;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(boolean r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.w95.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001a
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r6)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r5
            r6[r0] = r3
            java.lang.String r0 = "a329e852"
            r2.ipc$dispatch(r0, r6)
            return
        L_0x001a:
            com.taobao.avplayer.DWContext r2 = r5.c
            com.taobao.avplayer.DWVideoScreenType r2 = r2.screenType()
            com.taobao.avplayer.DWVideoScreenType r3 = com.taobao.avplayer.DWVideoScreenType.NORMAL
            if (r2 == r3) goto L_0x003f
            com.taobao.avplayer.DWContext r2 = r5.c
            tb.wtb r2 = r2.getVideo()
            int r2 = r2.getVideoState()
            r4 = 4
            if (r2 == r4) goto L_0x003e
            com.taobao.avplayer.DWContext r2 = r5.c
            tb.wtb r2 = r2.getVideo()
            int r2 = r2.getVideoState()
            r4 = 3
            if (r2 != r4) goto L_0x003f
        L_0x003e:
            r6 = 1
        L_0x003f:
            if (r6 == 0) goto L_0x0062
            com.taobao.avplayer.DWContext r6 = r5.c
            boolean r6 = r6.isMute()
            if (r6 == 0) goto L_0x0055
            com.taobao.avplayer.DWContext r6 = r5.c
            boolean r0 = r6.mNeedOldPlayerUI
            if (r0 == 0) goto L_0x005a
            com.taobao.avplayer.DWVideoScreenType r6 = r6.screenType()
            if (r6 == r3) goto L_0x005a
        L_0x0055:
            android.widget.ImageView r6 = r5.e
            r6.setVisibility(r1)
        L_0x005a:
            android.view.ViewGroup r6 = r5.f30526a     // Catch: Exception -> 0x006e
            int r0 = com.taobao.taobao.R.drawable.dw_notify_bar_bg     // Catch: Exception -> 0x006e
            r6.setBackgroundResource(r0)     // Catch: Exception -> 0x006e
            goto L_0x006e
        L_0x0062:
            android.widget.ImageView r6 = r5.e
            r0 = 8
            r6.setVisibility(r0)
            android.view.ViewGroup r6 = r5.f30526a
            r6.setBackgroundColor(r1)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.w95.s(boolean):void");
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127138cd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.m = z;
        if (!z || !z || !this.n || (TextUtils.isEmpty(this.k) && TextUtils.isEmpty(this.l))) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
        }
    }

    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff95283", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.o.getVisibility() == 0) {
            this.o.setVisibility(8);
        }
        if (z) {
            FrameLayout frameLayout = this.j;
            if (frameLayout != null && this.n && this.m) {
                frameLayout.setVisibility(0);
            }
            DWContext dWContext = this.c;
            if (oya.a(dWContext, dWContext.getReportShown(), this.c.getReportFullScreenShown(), this.c.getOrangeReportShown())) {
                this.d.setVisibility(0);
            } else {
                this.d.setVisibility(8);
            }
        } else {
            this.j.setVisibility(8);
            this.d.setVisibility(8);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2538072e", new Object[]{this});
            return;
        }
        this.n = true;
        FrameLayout frameLayout = this.j;
        if (frameLayout != null && this.m) {
            frameLayout.setVisibility(0);
        }
    }

    public final void w(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d943b64", new Object[]{this, str, str2, str3, map, map2});
            return;
        }
        vtb vtbVar = this.c.mUTAdapter;
        if (vtbVar != null) {
            vtbVar.a(str, str2, str3, map, map2);
        }
    }

    public void n(DWInteractiveVideoObject dWInteractiveVideoObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e7fe32a", new Object[]{this, dWInteractiveVideoObject});
        } else if (dWInteractiveVideoObject != null && "shop".equals(dWInteractiveVideoObject.getShowType()) && !TextUtils.isEmpty(dWInteractiveVideoObject.getEnterShopUrl())) {
            this.l = dWInteractiveVideoObject.getUserName();
            l();
            this.k = dWInteractiveVideoObject.getEnterShopUrl();
            FrameLayout frameLayout = this.j;
            if (!this.m || !this.n) {
                i = 8;
            }
            frameLayout.setVisibility(i);
            HashMap hashMap = new HashMap();
            hashMap.put("interact_object_type", "shop");
            w("Page_DWVideo_Button-videoShowInteract", "expose", null, this.c.getUTParams(), hashMap);
        }
    }
}
