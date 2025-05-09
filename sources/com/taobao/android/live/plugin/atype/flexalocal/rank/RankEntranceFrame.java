package com.taobao.android.live.plugin.atype.flexalocal.rank;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.giftwish.GiftWishFrame;
import com.taobao.android.live.plugin.atype.flexalocal.rank.RankEntranceFrame;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import tb.bp1;
import tb.e9m;
import tb.fkx;
import tb.giv;
import tb.gtc;
import tb.j96;
import tb.nh4;
import tb.nwb;
import tb.o3s;
import tb.ofn;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.t54;
import tb.ux9;
import tb.uyg;
import tb.w2s;
import tb.yh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RankEntranceFrame extends BaseFrame implements s3c, gtc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DX_TEMPLATE_DEFAULT = "taolive_rank_entrance";
    public static final String RANK_ENTRANCE_TAG = "RankEntranceFrame";
    public static final String TAG = "RankEntranceFrame";
    private GiftWishFrame giftWishFrame;
    private FrameLayout rankRootView;
    private boolean isShowRank = false;
    private final boolean enableShowRankLiveEntrance = nh4.G0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(RankEntranceFrame rankEntranceFrame) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/rank/RankEntranceFrame$1");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (880000249 == i) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements nwb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f8647a;
        public final /* synthetic */ nwb b;

        public b(JSONArray jSONArray, nwb nwbVar) {
            this.f8647a = jSONArray;
            this.b = nwbVar;
        }

        @Override // tb.nwb.a
        public void a(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
                return;
            }
            RankEntranceFrame.access$000(RankEntranceFrame.this, dXRootView);
            RankEntranceFrame.access$100(RankEntranceFrame.this, dXRootView, this.f8647a, this.b);
        }
    }

    static {
        t2o.a(295699647);
        t2o.a(806355016);
        t2o.a(806356059);
    }

    public RankEntranceFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ void access$000(RankEntranceFrame rankEntranceFrame, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed5d5f33", new Object[]{rankEntranceFrame, dXRootView});
        } else {
            rankEntranceFrame.replaceViewInLayout(dXRootView);
        }
    }

    public static /* synthetic */ void access$100(RankEntranceFrame rankEntranceFrame, DXRootView dXRootView, JSONArray jSONArray, nwb nwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e932f1", new Object[]{rankEntranceFrame, dXRootView, jSONArray, nwbVar});
        } else {
            rankEntranceFrame.renderRankDxView(dXRootView, jSONArray, nwbVar);
        }
    }

    public static /* synthetic */ Object ipc$super(RankEntranceFrame rankEntranceFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/rank/RankEntranceFrame");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEvent$10(JSONArray jSONArray, nwb nwbVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a6396a", new Object[]{this, jSONArray, nwbVar, dXRootView});
        } else {
            renderRankDxView(dXRootView, jSONArray, nwbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEvent$11(Object obj, nwb nwbVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ebdcdf", new Object[]{this, obj, nwbVar, dXRootView});
            return;
        }
        replaceViewInLayout(dXRootView);
        renderRankDxView(dXRootView, (JSONArray) obj, nwbVar);
    }

    private void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.rankRootView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        sjr.g().b(this);
        IpChange ipChange2 = ofn.$ipChange;
    }

    private void replaceViewInLayout(DXRootView dXRootView) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbae2250", new Object[]{this, dXRootView});
            return;
        }
        FrameLayout frameLayout = this.rankRootView;
        if (frameLayout != null) {
            int i2 = R.id.rank_entrance_view;
            if (frameLayout.findViewById(i2) instanceof DXRootView) {
                DXRootView dXRootView2 = (DXRootView) this.rankRootView.findViewById(i2);
                int indexOfChild = this.rankRootView.indexOfChild(dXRootView2);
                this.rankRootView.removeView(dXRootView2);
                i = indexOfChild;
            }
        }
        FrameLayout frameLayout2 = this.rankRootView;
        if (frameLayout2 != null) {
            frameLayout2.addView(dXRootView, i);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "FavorAnimView2";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "RankEntranceFrame";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_rank_live_entrance_dx_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_RANK_LIVE_ENTRANCE_DATA, j96.EVENT_REFRESH_DX, j96.EVENT_BANNER_PRERENDER};
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
        release();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null) {
            String str = videoInfo.liveId;
            IpChange ipChange2 = ofn.$ipChange;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (bp1.a().booleanValue()) {
            this.mFrameContext.t().a(this);
        }
        super.onDestroy();
        release();
    }

    @Override // tb.gtc
    public void onMessageReceived(int i, Object obj) {
        JSONObject d;
        JSONArray jSONArray;
        nwb b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if ((obj instanceof String) && (d = fkx.d((String) obj)) != null && (jSONArray = d.getJSONArray(j96.KEY_BANNER_DATA)) != null && !jSONArray.isEmpty() && (b2 = giv.b()) != null) {
            b2.a(this.mContext, DX_TEMPLATE_DEFAULT, new b(jSONArray, b2));
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
            this.isShowRank = false;
            sjr.g().a(this);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        if (view instanceof LinearLayout) {
            this.rankRootView = (FrameLayout) view.findViewById(R.id.talive_rank_banner_rootView);
        }
        if (this.giftWishFrame == null) {
            GiftWishFrame giftWishFrame = new GiftWishFrame(this.mContext, this.mFrameContext);
            this.giftWishFrame = giftWishFrame;
            giftWishFrame.createView((ViewStub) findViewById(R.id.taolive_gift_banner_layout));
            addComponent(this.giftWishFrame);
        }
        FlexaLiveX.w("RankEntranceFrame: class: " + getClass().getName() + ", pluginEnv: " + e9m.b());
        if (bp1.a().booleanValue() && this.enableShowRankLiveEntrance) {
            this.mFrameContext.t().l(this, new a(this));
        }
    }

    private void renderRankDxView(DXRootView dXRootView, JSONArray jSONArray, nwb nwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32005e60", new Object[]{this, dXRootView, jSONArray, nwbVar});
        } else if (dXRootView == null) {
            o3s.b("RankEntranceFrame", "onEvent: rankEntranceView is null!");
        } else if (this.rankRootView == null) {
            o3s.b("RankEntranceFrame", "renderRankDxView: rankRootView is null.");
        } else {
            dXRootView.setId(R.id.rank_entrance_view);
            this.rankRootView.removeAllViews();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(j96.KEY_BANNER_DATA, (Object) jSONArray);
            jSONObject.put("nativeParams", NewStyleUtils.a(this.mContext, NewStyleUtils.NewStyleType.SMALL));
            nwbVar.renderDX(dXRootView, jSONObject);
            this.rankRootView.addView(dXRootView);
            this.rankRootView.setPadding(0, 0, w2s.c(this.mContext, 7.0f), w2s.c(this.mContext, 8.0f));
            sjr.g().c(uyg.EVENT_RANK_LIVE_HIDE_GROWTH_FRAME, null, observeUniqueIdentification());
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (uyg.EVENT_RANK_LIVE_ENTRANCE_DATA.equals(str)) {
            if (this.enableShowRankLiveEntrance) {
                if (this.rankRootView == null) {
                    o3s.b("RankEntranceFrame", "onEvent: rankRootView is null.");
                    return;
                }
                o3s.b("RankEntranceFrame", "onEvent: " + obj);
                if (obj instanceof JSONObject) {
                    final JSONArray jSONArray = ((JSONObject) obj).getJSONArray(j96.KEY_BANNER_DATA);
                    if (jSONArray == null || jSONArray.isEmpty()) {
                        o3s.b("RankEntranceFrame", "onEvent: renderDX error: rankLiveEntranceArrayObj is empty!");
                        return;
                    }
                    JSONObject jSONObject = jSONArray.getJSONObject(0);
                    if (jSONObject == null) {
                        o3s.b("RankEntranceFrame", "onEvent: renderDX error: rankLiveEntranceObj is null!");
                        return;
                    }
                    String string = jSONObject.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
                    if (TextUtils.isEmpty(string)) {
                        o3s.b("RankEntranceFrame", "onEvent: renderDX error: templateName is null!");
                        return;
                    }
                    if (this.isShowRank) {
                        FrameLayout frameLayout = this.rankRootView;
                        int i = R.id.rank_entrance_view;
                        if (!(frameLayout.findViewById(i) instanceof DXRootView)) {
                            return;
                        }
                        if (((DXRootView) this.rankRootView.findViewById(i)).getData() != null && ((DXRootView) this.rankRootView.findViewById(i)).getData().equals(jSONObject)) {
                            return;
                        }
                    }
                    this.isShowRank = true;
                    o3s.b("RankEntranceFrame", "onEvent: renderDX" + obj);
                    final nwb b2 = giv.b();
                    if (b2 == null) {
                        o3s.b("RankEntranceFrame", "onEvent: dxRenderEngine is null!");
                    } else {
                        b2.a(this.mContext, string, new nwb.a() { // from class: tb.kfn
                            @Override // tb.nwb.a
                            public final void a(DXRootView dXRootView) {
                                RankEntranceFrame.this.lambda$onEvent$10(jSONArray, b2, dXRootView);
                            }
                        });
                    }
                }
            }
        } else if (!j96.EVENT_REFRESH_DX.equals(str) || !(obj instanceof JSONArray)) {
            if (j96.EVENT_BANNER_PRERENDER.equals(str) && (obj instanceof JSONObject)) {
                String string2 = ((JSONObject) obj).getString("url");
                ux9 ux9Var = this.mFrameContext;
                if (ux9Var instanceof t54) {
                    ((t54) ux9Var).z0().t(string2);
                }
            }
        } else if (this.rankRootView != null) {
            final nwb b3 = giv.b();
            b3.a(this.mContext, DX_TEMPLATE_DEFAULT, new nwb.a() { // from class: tb.mfn
                @Override // tb.nwb.a
                public final void a(DXRootView dXRootView) {
                    RankEntranceFrame.this.lambda$onEvent$11(obj, b3, dXRootView);
                }
            });
        }
    }
}
