package com.taobao.taolive.movehighlight.bundle.timeshiftContent;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bundle.timeshiftContent.b;
import com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.LiveCommonIssueInteractResponseData;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import tb.axa;
import tb.bte;
import tb.cxa;
import tb.cxg;
import tb.dxa;
import tb.exa;
import tb.fkx;
import tb.fut;
import tb.gut;
import tb.gxa;
import tb.iz1;
import tb.m0e;
import tb.o0e;
import tb.s0u;
import tb.t2o;
import tb.t90;
import tb.ux9;
import tb.wxc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TimeShiftContentFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int selectedPosition = 0;
    private DXRootView contentDxRootView;
    private FrameLayout frameLayout;
    private boolean mIsFirst = true;
    private fut timeShiftBottomUtils;
    private com.taobao.taolive.movehighlight.bundle.timeshiftContent.b timeShiftContentRequest;
    private gut timeShiftModel;
    private VideoInfo videoInfo;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.taolive.movehighlight.bundle.timeshiftContent.b.a
        public void a(NetResponse netResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28a16d86", new Object[]{this, netResponse});
                return;
            }
            JSONObject jSONObject = (JSONObject) fkx.a(netResponse.getDataJsonObject().toString());
            TimeShiftContentFrame.access$000(TimeShiftContentFrame.this, jSONObject);
            TimeShiftContentFrame.access$100(TimeShiftContentFrame.this, jSONObject);
        }

        @Override // com.taobao.taolive.movehighlight.bundle.timeshiftContent.b.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de10db6e", new Object[]{this});
            } else {
                TimeShiftContentFrame.access$000(TimeShiftContentFrame.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXWidgetNode f13068a;
        public final /* synthetic */ DXWidgetRefreshOption b;

        public b(DXWidgetNode dXWidgetNode, DXWidgetRefreshOption dXWidgetRefreshOption) {
            this.f13068a = dXWidgetNode;
            this.b = dXWidgetRefreshOption;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                axa.f().f16057a.I0(this.f13068a, 0, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements m0e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements gut.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ LiveTimemovingModel f13070a;

            public a(LiveTimemovingModel liveTimemovingModel) {
                this.f13070a = liveTimemovingModel;
            }

            @Override // tb.gut.b
            public void a(LiveCommonIssueInteractResponseData liveCommonIssueInteractResponseData) {
                LiveCommonIssueInteractResponseData.BenefitVO benefitVO;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e496a35f", new Object[]{this, liveCommonIssueInteractResponseData});
                } else if (TimeShiftContentFrame.this.mContext != null && (benefitVO = liveCommonIssueInteractResponseData.benefitVO) != null && !TextUtils.isEmpty(benefitVO.toastTips)) {
                    s0u.a(TimeShiftContentFrame.this.mContext, liveCommonIssueInteractResponseData.benefitVO.toastTips);
                    LiveTimemovingModel liveTimemovingModel = this.f13070a;
                    TimeShiftContentFrame timeShiftContentFrame = TimeShiftContentFrame.this;
                    t90.a(liveTimemovingModel, timeShiftContentFrame.mContext, timeShiftContentFrame.mFrameContext);
                }
            }

            @Override // tb.gut.b
            public void onError() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                    return;
                }
                Context context = TimeShiftContentFrame.this.mContext;
                if (context != null) {
                    s0u.a(context, "领取失败：活动太火爆了，领取失败");
                    LiveTimemovingModel liveTimemovingModel = this.f13070a;
                    TimeShiftContentFrame timeShiftContentFrame = TimeShiftContentFrame.this;
                    t90.a(liveTimemovingModel, timeShiftContentFrame.mContext, timeShiftContentFrame.mFrameContext);
                }
            }
        }

        public c() {
        }

        @Override // tb.m0e
        public void a(LiveTimemovingModel liveTimemovingModel, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fdc2248", new Object[]{this, liveTimemovingModel, dXRuntimeContext});
            }
        }

        @Override // tb.m0e
        public void b(boolean z) {
            wxc u;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("442ccd57", new Object[]{this, new Boolean(z)});
            } else if (TimeShiftContentFrame.access$800(TimeShiftContentFrame.this) != null) {
                ux9 ux9Var = TimeShiftContentFrame.this.mFrameContext;
                if (!(ux9Var == null || (u = ux9Var.u()) == null)) {
                    u.i(z);
                }
                TimeShiftContentFrame.access$800(TimeShiftContentFrame.this).i(z);
            }
        }

        @Override // tb.m0e
        public o0e c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o0e) ipChange.ipc$dispatch("473f8490", new Object[]{this});
            }
            return null;
        }

        @Override // tb.m0e
        public com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a) ipChange.ipc$dispatch("7afa8d75", new Object[]{this});
            }
            return null;
        }

        @Override // tb.m0e
        public void e(JSONObject jSONObject) {
            JSONObject jSONObject2;
            LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c5f5c29", new Object[]{this, jSONObject});
            } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("timeMovingPlayInfo")) != null && (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) fkx.j(jSONObject2, LiveItem.TimeMovingPlayInfo.class)) != null) {
                HashMap<String, String> b = gxa.b(timeMovingPlayInfo, timeMovingPlayInfo.playUrl, TimeShiftContentFrame.this.mFrameContext);
                TimeShiftContentFrame timeShiftContentFrame = TimeShiftContentFrame.this;
                cxa.a(b, timeShiftContentFrame.mContext, timeShiftContentFrame.mFrameContext);
                if (!(TimeShiftContentFrame.access$300(TimeShiftContentFrame.this) == null || TimeShiftContentFrame.access$300(TimeShiftContentFrame.this).getExpandWidgetNode() == null)) {
                    TimeShiftContentFrame.access$300(TimeShiftContentFrame.this).getData().put("itemIsSpeaking", (Object) Boolean.valueOf(timeMovingPlayInfo.isSpeaking));
                    TimeShiftContentFrame.access$400(TimeShiftContentFrame.this, TimeShiftContentFrame.access$300(TimeShiftContentFrame.this).getExpandWidgetNode().queryWidgetNodeByUserId("bottomLayoutId"));
                }
                TimeShiftContentFrame timeShiftContentFrame2 = TimeShiftContentFrame.this;
                exa.a(timeShiftContentFrame2.mFrameContext, timeShiftContentFrame2.mLiveDataModel, jSONObject);
            }
        }

        @Override // tb.m0e
        public com.taobao.taolive.movehighlight.bundle.timeshiftContent.b f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.taolive.movehighlight.bundle.timeshiftContent.b) ipChange.ipc$dispatch("9d97d57b", new Object[]{this});
            }
            return TimeShiftContentFrame.access$200(TimeShiftContentFrame.this);
        }

        @Override // tb.m0e
        public void g(LiveTimemovingModel liveTimemovingModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f577d9f5", new Object[]{this, liveTimemovingModel});
                return;
            }
            LiveTimemovingModel.RightInfo rightInfo = liveTimemovingModel.rightInfo;
            if (rightInfo == null || !"1".equals(rightInfo.status) || TimeShiftContentFrame.access$700(TimeShiftContentFrame.this) == null) {
                TimeShiftContentFrame timeShiftContentFrame = TimeShiftContentFrame.this;
                t90.a(liveTimemovingModel, timeShiftContentFrame.mContext, timeShiftContentFrame.mFrameContext);
                return;
            }
            TimeShiftContentFrame.access$700(TimeShiftContentFrame.this).a(liveTimemovingModel, new a(liveTimemovingModel));
        }

        @Override // tb.m0e
        public void h(Map<String, String> map, boolean z, iz1 iz1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34520e15", new Object[]{this, map, new Boolean(z), iz1Var});
            } else if (map != null) {
                TimeShiftContentFrame.access$502(TimeShiftContentFrame.this, z);
                TimeShiftContentFrame.access$600(TimeShiftContentFrame.this, map.get("keyPointId"));
            }
        }
    }

    static {
        t2o.a(779092562);
    }

    public TimeShiftContentFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }

    public static /* synthetic */ void access$000(TimeShiftContentFrame timeShiftContentFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9baad5", new Object[]{timeShiftContentFrame, jSONObject});
        } else {
            timeShiftContentFrame.renderContentRootView(jSONObject);
        }
    }

    public static /* synthetic */ void access$100(TimeShiftContentFrame timeShiftContentFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf0b85b4", new Object[]{timeShiftContentFrame, jSONObject});
        } else {
            timeShiftContentFrame.sendOpenAccessDetailByList(jSONObject);
        }
    }

    public static /* synthetic */ com.taobao.taolive.movehighlight.bundle.timeshiftContent.b access$200(TimeShiftContentFrame timeShiftContentFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.movehighlight.bundle.timeshiftContent.b) ipChange.ipc$dispatch("f16bd3db", new Object[]{timeShiftContentFrame});
        }
        return timeShiftContentFrame.timeShiftContentRequest;
    }

    public static /* synthetic */ DXRootView access$300(TimeShiftContentFrame timeShiftContentFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("6c917cd9", new Object[]{timeShiftContentFrame});
        }
        return timeShiftContentFrame.contentDxRootView;
    }

    public static /* synthetic */ void access$400(TimeShiftContentFrame timeShiftContentFrame, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1b5c90", new Object[]{timeShiftContentFrame, dXWidgetNode});
        } else {
            timeShiftContentFrame.refreshBottomTemplate(dXWidgetNode);
        }
    }

    public static /* synthetic */ boolean access$502(TimeShiftContentFrame timeShiftContentFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7c8ee56", new Object[]{timeShiftContentFrame, new Boolean(z)})).booleanValue();
        }
        timeShiftContentFrame.mIsFirst = z;
        return z;
    }

    public static /* synthetic */ void access$600(TimeShiftContentFrame timeShiftContentFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa25e8b", new Object[]{timeShiftContentFrame, str});
        } else {
            timeShiftContentFrame.showTimeShiftContent(str);
        }
    }

    public static /* synthetic */ gut access$700(TimeShiftContentFrame timeShiftContentFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gut) ipChange.ipc$dispatch("aff7a288", new Object[]{timeShiftContentFrame});
        }
        return timeShiftContentFrame.timeShiftModel;
    }

    public static /* synthetic */ fut access$800(TimeShiftContentFrame timeShiftContentFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fut) ipChange.ipc$dispatch("ae621086", new Object[]{timeShiftContentFrame});
        }
        return timeShiftContentFrame.timeShiftBottomUtils;
    }

    private void initTimeShiftAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4028022", new Object[]{this});
        } else {
            dxa.b(getFrameContext()).u(new c());
        }
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        VideoInfo e = cxg.e(this.mLiveDataModel);
        this.videoInfo = e;
        if (e != null) {
            this.timeShiftContentRequest = new com.taobao.taolive.movehighlight.bundle.timeshiftContent.b(this.mLiveDataModel, this.mFrameContext);
            DXRootView a2 = axa.f().a(this.mContext, "highlight_dx_layout_manager_content");
            this.contentDxRootView = a2;
            if (a2 != null) {
                this.timeShiftModel = new gut();
                this.timeShiftContentRequest = new com.taobao.taolive.movehighlight.bundle.timeshiftContent.b(this.mLiveDataModel, this.mFrameContext);
                initTimeShiftAction();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TimeShiftContentFrame timeShiftContentFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1777320968:
                super.onCreateView2((ViewGroup) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bundle/timeshiftContent/TimeShiftContentFrame");
        }
    }

    private void playKandian(LiveItem.TimeMovingPlayInfo timeMovingPlayInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2cbb7", new Object[]{this, timeMovingPlayInfo});
        } else if (timeMovingPlayInfo != null) {
            HashMap<String, String> b2 = gxa.b(timeMovingPlayInfo, timeMovingPlayInfo.playUrl, this.mFrameContext);
            if (dxa.b(getFrameContext()).f() != null) {
                dxa.b(this.mFrameContext).f().m(this.mFrameContext, b2);
            }
        }
    }

    private void refreshBottomTemplate(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83cf608", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            new Handler().postDelayed(new b(dXWidgetNode, new DXWidgetRefreshOption.a().c(2).d(true).g(true).a()), 100L);
        }
    }

    private void renderContentRootView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5003bf", new Object[]{this, jSONObject});
            return;
        }
        this.frameLayout.setVisibility(0);
        if (this.frameLayout.getChildCount() != 0) {
            this.frameLayout.removeAllViews();
        }
        DXRootView dXRootView = this.contentDxRootView;
        if (dXRootView != null) {
            this.frameLayout.addView(dXRootView);
            if (this.timeShiftBottomUtils == null) {
                this.timeShiftBottomUtils = new fut(this.mFrameContext, this.mLiveDataModel, this.mContext, this.contentDxRootView);
            }
            JSONObject m = this.timeShiftBottomUtils.m(jSONObject);
            handleSpeakingMark(m);
            axa.f().h(this.contentDxRootView, m, this.mFrameContext);
        }
    }

    private void showTimeShiftContent(String str) {
        com.taobao.taolive.movehighlight.bundle.timeshiftContent.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f785f2", new Object[]{this, str});
        } else if (this.mIsFirst && (bVar = this.timeShiftContentRequest) != null) {
            bVar.d(str, new a());
            this.mIsFirst = false;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        super.onCreateView2(viewGroup);
        if (viewGroup instanceof FrameLayout) {
            this.frameLayout = (FrameLayout) viewGroup;
            selectedPosition = 0;
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
        selectedPosition = 0;
        gut gutVar = this.timeShiftModel;
        if (gutVar != null) {
            gutVar.b();
        }
        com.taobao.taolive.movehighlight.bundle.timeshiftContent.b bVar = this.timeShiftContentRequest;
        if (bVar != null) {
            bVar.a();
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

    private void sendOpenAccessDetailByList(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aed5e6d", new Object[]{this, jSONObject});
            return;
        }
        try {
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var != null && ux9Var.A() != null && jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("model")) != null && (jSONArray = jSONObject2.getJSONArray("timeMovingList")) != null && jSONArray.size() > 0 && (jSONObject3 = jSONArray.getJSONObject(0)) != null) {
                exa.a(this.mFrameContext, this.mLiveDataModel, jSONObject3);
            }
        } catch (Exception unused) {
        }
    }

    private void handleSpeakingMark(JSONObject jSONObject) {
        JSONArray jSONArray;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f75aa64", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("model");
        if (jSONObject2 != null && (jSONArray = jSONObject2.getJSONArray("timeMovingList")) != null && jSONArray.size() > 0) {
            com.taobao.taolive.movehighlight.bundle.timeshiftContent.b bVar = this.timeShiftContentRequest;
            if (bVar != null) {
                bVar.e(jSONArray.size());
            }
            if (jSONArray.size() == 1) {
                jSONObject.put("isSingleItem", (Object) Boolean.TRUE);
            } else {
                jSONObject.put("isSingleItem", (Object) Boolean.FALSE);
            }
            JSONObject jSONObject3 = jSONArray.getJSONObject(0).getJSONObject("timeMovingPlayInfo");
            if (jSONObject3 != null && (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) fkx.f(jSONObject3.toJSONString(), LiveItem.TimeMovingPlayInfo.class)) != null) {
                jSONObject.put("itemIsSpeaking", (Object) Boolean.valueOf(timeMovingPlayInfo.isSpeaking));
                playKandian(timeMovingPlayInfo);
            }
        }
    }
}
