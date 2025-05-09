package com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a;
import com.taobao.taolive.movehighlight.dx.widget.bottomGroup.HighlightBottomFrame;
import com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;
import tb.axa;
import tb.bte;
import tb.cxg;
import tb.dwt;
import tb.dxa;
import tb.fut;
import tb.gut;
import tb.gw0;
import tb.iut;
import tb.iz1;
import tb.s3c;
import tb.sbu;
import tb.t2o;
import tb.uwa;
import tb.ux9;
import tb.uyg;
import tb.vc;
import tb.wxc;
import tb.ztt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TimeShiftItemTimeShiftDXFrame extends AbstractTimeShiftDXFrame implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TimeShiftItemTimeShiftDXFrame";
    private FrameLayout frameLayout;
    public HighlightBottomFrame highlightBottomFrame;
    private boolean mIsFirst = true;
    private fut timeShiftBottomUtils;
    private DXRootView timeShiftDxRootView;
    private gut timeShiftModel;
    private com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a timeShiftRequestDx;
    private dwt timeshiftDxUtils;
    private VideoInfo videoInfo;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a.c
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25db8289", new Object[]{this, jSONObject});
            } else if (TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this) != null && TimeShiftItemTimeShiftDXFrame.access$100(TimeShiftItemTimeShiftDXFrame.this) != null) {
                TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this).removeAllViews();
                if (TimeShiftItemTimeShiftDXFrame.access$200(TimeShiftItemTimeShiftDXFrame.this) != null) {
                    if (TimeShiftItemTimeShiftDXFrame.access$300(TimeShiftItemTimeShiftDXFrame.this) == null) {
                        TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame = TimeShiftItemTimeShiftDXFrame.this;
                        TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame2 = TimeShiftItemTimeShiftDXFrame.this;
                        TimeShiftItemTimeShiftDXFrame.access$302(timeShiftItemTimeShiftDXFrame, new fut(timeShiftItemTimeShiftDXFrame2.mFrameContext, timeShiftItemTimeShiftDXFrame2.mLiveDataModel, timeShiftItemTimeShiftDXFrame2.mContext, TimeShiftItemTimeShiftDXFrame.access$100(timeShiftItemTimeShiftDXFrame2)));
                    }
                    jSONObject = TimeShiftItemTimeShiftDXFrame.access$300(TimeShiftItemTimeShiftDXFrame.this).m(jSONObject);
                }
                ztt.c(jSONObject);
                TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame3 = TimeShiftItemTimeShiftDXFrame.this;
                ux9 ux9Var = timeShiftItemTimeShiftDXFrame3.mFrameContext;
                if (ux9Var == null || !ux9Var.f) {
                    TimeShiftItemTimeShiftDXFrame.access$000(timeShiftItemTimeShiftDXFrame3).addView(TimeShiftItemTimeShiftDXFrame.access$100(TimeShiftItemTimeShiftDXFrame.this));
                    TimeShiftItemTimeShiftDXFrame.access$500(TimeShiftItemTimeShiftDXFrame.this, jSONObject);
                } else {
                    TimeShiftItemTimeShiftDXFrame.access$400(timeShiftItemTimeShiftDXFrame3, jSONObject);
                }
                axa.f().h(TimeShiftItemTimeShiftDXFrame.access$100(TimeShiftItemTimeShiftDXFrame.this), jSONObject, TimeShiftItemTimeShiftDXFrame.this.mFrameContext);
                TimeShiftItemTimeShiftDXFrame.access$600(TimeShiftItemTimeShiftDXFrame.this).d(DXHighlightScrollableLayoutWidgetNode.LOAD_MORE_IDLE_STRING);
                TimeShiftItemTimeShiftDXFrame.access$600(TimeShiftItemTimeShiftDXFrame.this).u(0);
                dxa.b(TimeShiftItemTimeShiftDXFrame.this.getFrameContext()).m(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HighlightBottomFrame highlightBottomFrame = TimeShiftItemTimeShiftDXFrame.this.highlightBottomFrame;
            if (highlightBottomFrame != null && highlightBottomFrame.getContainerView() != null && TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this) != null) {
                TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame = TimeShiftItemTimeShiftDXFrame.this;
                if (timeShiftItemTimeShiftDXFrame.mContext != null) {
                    int height = timeShiftItemTimeShiftDXFrame.highlightBottomFrame.getContainerView().getHeight();
                    if (height == 0) {
                        height = gw0.a(TimeShiftItemTimeShiftDXFrame.this.mContext, 85.0f);
                    }
                    if (TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this).getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this).getLayoutParams();
                        layoutParams.setMargins(0, 0, 0, height);
                        TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this).setLayoutParams(layoutParams);
                        TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this).invalidate();
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f13057a;

        public c(Object obj) {
            this.f13057a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this) != null) {
                Object obj = this.f13057a;
                if ((obj instanceof Boolean) && TimeShiftItemTimeShiftDXFrame.this.mContext != null) {
                    if (((Boolean) obj).booleanValue()) {
                        i = gw0.a(TimeShiftItemTimeShiftDXFrame.this.mContext, 60.0f);
                    } else {
                        i = gw0.a(TimeShiftItemTimeShiftDXFrame.this.mContext, 82.0f);
                    }
                    if (TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this).getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this).getLayoutParams();
                        layoutParams.setMargins(0, 0, 0, i);
                        TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this).setLayoutParams(layoutParams);
                        TimeShiftItemTimeShiftDXFrame.access$000(TimeShiftItemTimeShiftDXFrame.this).invalidate();
                    }
                }
            }
        }
    }

    static {
        t2o.a(779092524);
        t2o.a(806355884);
        t2o.a(806355016);
    }

    public TimeShiftItemTimeShiftDXFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }

    public static /* synthetic */ FrameLayout access$000(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("86759e8e", new Object[]{timeShiftItemTimeShiftDXFrame});
        }
        return timeShiftItemTimeShiftDXFrame.frameLayout;
    }

    public static /* synthetic */ DXRootView access$100(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("f9cbb6cd", new Object[]{timeShiftItemTimeShiftDXFrame});
        }
        return timeShiftItemTimeShiftDXFrame.timeShiftDxRootView;
    }

    public static /* synthetic */ VideoInfo access$200(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("37fb17e6", new Object[]{timeShiftItemTimeShiftDXFrame});
        }
        return timeShiftItemTimeShiftDXFrame.videoInfo;
    }

    public static /* synthetic */ fut access$300(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fut) ipChange.ipc$dispatch("c0690d21", new Object[]{timeShiftItemTimeShiftDXFrame});
        }
        return timeShiftItemTimeShiftDXFrame.timeShiftBottomUtils;
    }

    public static /* synthetic */ fut access$302(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame, fut futVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fut) ipChange.ipc$dispatch("d0f29ef0", new Object[]{timeShiftItemTimeShiftDXFrame, futVar});
        }
        timeShiftItemTimeShiftDXFrame.timeShiftBottomUtils = futVar;
        return futVar;
    }

    public static /* synthetic */ void access$400(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a8412e9", new Object[]{timeShiftItemTimeShiftDXFrame, jSONObject});
        } else {
            timeShiftItemTimeShiftDXFrame.handleUIDesign(jSONObject);
        }
    }

    public static /* synthetic */ void access$500(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55591a6a", new Object[]{timeShiftItemTimeShiftDXFrame, jSONObject});
        } else {
            timeShiftItemTimeShiftDXFrame.backToLiveUTHandle(jSONObject);
        }
    }

    public static /* synthetic */ dwt access$600(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dwt) ipChange.ipc$dispatch("afed9ded", new Object[]{timeShiftItemTimeShiftDXFrame});
        }
        return timeShiftItemTimeShiftDXFrame.timeshiftDxUtils;
    }

    private void adjustCardListMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759cdb92", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.post(new b());
        }
    }

    private void adjustNewCardListMargin(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c9d5f0", new Object[]{this, obj});
            return;
        }
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.post(new c(obj));
        }
    }

    private void backToLiveUTHandle(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e3eef4", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.get("isLiving") != null && jSONObject.get("highlightLastPreLiveInfo") != null) {
            sbu.k(this.mFrameContext, "Page_TaobaoLiveWatch_Show-BottomNavigationBar", iut.a(jSONObject));
        }
    }

    private void handleUIDesign(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9517fbef", new Object[]{this, jSONObject});
            return;
        }
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setBackground(null);
            if (this.frameLayout.getRootView() != null) {
                FrameLayout frameLayout2 = (FrameLayout) this.frameLayout.getRootView().findViewById(R.id.taolive_highlight_base_bottom_background);
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                ViewGroup viewGroup = (ViewGroup) this.frameLayout.getRootView().findViewById(R.id.taolive_highlight_base_bottom_layout);
                if (viewGroup != null && this.timeShiftDxRootView != null) {
                    viewGroup.setVisibility(0);
                    viewGroup.removeAllViews();
                    HighlightBottomFrame highlightBottomFrame = new HighlightBottomFrame(this.mContext, this.mFrameContext, jSONObject);
                    this.highlightBottomFrame = highlightBottomFrame;
                    highlightBottomFrame.createView(viewGroup);
                    addComponent(this.highlightBottomFrame);
                    this.frameLayout.addView(this.timeShiftDxRootView);
                }
            }
        }
    }

    private void initView() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        VideoInfo e = cxg.e(this.mLiveDataModel);
        this.videoInfo = e;
        if (e != null) {
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var == null || !ux9Var.f) {
                str = "highlight_dx_layout_manager_new";
            } else {
                str = "highlight_dx_layout_manager_2025";
            }
            DXRootView a2 = axa.f().a(this.mContext, str);
            this.timeShiftDxRootView = a2;
            if (!(a2 == null || this.timeShiftRequestDx == null)) {
                dwt dwtVar = new dwt(this.mContext, this.timeShiftDxRootView, this.mFrameContext, this.mLiveDataModel);
                this.timeshiftDxUtils = dwtVar;
                this.timeShiftRequestDx.k(dwtVar);
                this.timeShiftRequestDx.m(this.mLiveDataModel);
                gut gutVar = new gut();
                this.timeShiftModel = gutVar;
                initTimeShiftAction(this.timeShiftRequestDx, this.timeshiftDxUtils, gutVar);
            }
            sbu.k(this.mFrameContext, "Page_TaobaoLiveWatch_Show_timemove_cardB", null);
        }
    }

    public static /* synthetic */ Object ipc$super(TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 1342702087:
                super.createView((ViewGroup) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bundle/timeshift/timeshiftDx/TimeShiftItemTimeShiftDXFrame");
        }
    }

    private void showTimeShift(String str, String str2, String str3, String str4, iz1 iz1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87fe091d", new Object[]{this, str, str2, str3, str4, iz1Var});
            return;
        }
        dwt dwtVar = this.timeshiftDxUtils;
        if (dwtVar != null) {
            int k = dwtVar.k(str3, str2);
            if (this.mIsFirst || (!TextUtils.isEmpty(str) && "goodsList".equals(str) && k == -1)) {
                com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a aVar = this.timeShiftRequestDx;
                if (aVar != null) {
                    aVar.i(this.mFrameContext, iz1Var, str3, str4, new a());
                    this.mIsFirst = false;
                    return;
                }
                return;
            }
            this.timeshiftDxUtils.m(k);
        }
    }

    @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame
    public void abstractRefreshBottomByMute(boolean z) {
        wxc u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6df1b99", new Object[]{this, new Boolean(z)});
        } else if (this.timeShiftBottomUtils != null) {
            ux9 ux9Var = this.mFrameContext;
            if (!(ux9Var == null || (u = ux9Var.u()) == null)) {
                u.i(z);
            }
            this.timeShiftBottomUtils.i(z);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void createView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50080207", new Object[]{this, viewGroup});
            return;
        }
        super.createView(viewGroup);
        if (viewGroup instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) viewGroup;
            this.frameLayout = frameLayout;
            frameLayout.setVisibility(0);
            this.timeShiftRequestDx = new com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a(this.mLiveDataModel, this.frameLayout, this.mFrameContext);
        }
        if (vc.a() && (vc.i(this.mContext) || vc.d(this.mContext))) {
            vc.k(this);
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.h() != null) {
            this.mFrameContext.h().a(this);
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_HIGHLIGHT_NOTIFY_CARD_RENDER};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.h() == null)) {
            this.mFrameContext.h().b(this);
        }
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (vc.a() && (vc.i(this.mContext) || vc.d(this.mContext))) {
            vc.l(this);
        }
        com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a aVar = this.timeShiftRequestDx;
        if (aVar != null) {
            aVar.c();
            this.timeShiftRequestDx = null;
        }
        this.mIsFirst = true;
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!uyg.EVENT_HIGHLIGHT_NOTIFY_CARD_RENDER.equals(str)) {
        } else {
            if (uwa.y()) {
                adjustNewCardListMargin(obj);
            } else {
                adjustCardListMargin();
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        fut futVar = this.timeShiftBottomUtils;
        if (futVar != null) {
            futVar.i(bte.b(this.mFrameContext));
        }
    }

    @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame, tb.huk
    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
        } else if (this.timeShiftDxRootView != null && this.mFrameContext != null) {
            axa f = axa.f();
            DXRootView dXRootView = this.timeShiftDxRootView;
            f.h(dXRootView, dXRootView.getData(), this.mFrameContext);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i == 1) {
            initView();
        }
    }

    @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame
    public void showTimeShiftLayerCallBack(Map<String, String> map, boolean z, iz1 iz1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("550e2130", new Object[]{this, map, new Boolean(z), iz1Var});
        } else if (map != null) {
            String str = map.get("timeMovingId");
            String str2 = map.get("itemId");
            this.mIsFirst = z;
            showTimeShift(map.get("timeShiftSoure"), str, str2, map.get("keyPointId"), iz1Var);
        }
    }
}
