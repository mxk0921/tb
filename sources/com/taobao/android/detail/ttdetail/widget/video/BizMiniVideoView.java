package com.taobao.android.detail.ttdetail.widget.video;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.RatioFrameLayout;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.opendetail.TaoliveOpenDetailCardView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cbw;
import tb.ksk;
import tb.r4q;
import tb.rcw;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BizMiniVideoView extends AbsMiniVideoView<r4q> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BizMiniVideoView";
    private List<r4q> mBizVideoDataList;
    private View mCloseBtn;
    private String mCurVideoType;
    private View mCurVideoView;
    private RatioFrameLayout mLayout;
    private String mRealDimensionRatio = cbw.VALUE_THREE_FOUR_RATIO;
    private ConstraintLayout mRootLayout;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ksk kskVar = BizMiniVideoView.this.mOnMiniVideoListener;
            if (kskVar != null) {
                kskVar.b(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7038a;

        public b(View view) {
            this.f7038a = view;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.BizMiniVideoView.c
        public void onEvent(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f44d8360", new Object[]{this, str, str2, str3});
                return;
            }
            tgh.b(BizMiniVideoView.TAG, "liveVideo onEvent: type=" + str + ", eventCode=" + str2 + ", extra=" + str3);
            if (TextUtils.isEmpty(str2) || TextUtils.equals("TBL200001", str2) || TextUtils.equals("TBL200002", str2) || TextUtils.equals("TBL100006", str2) || TextUtils.equals("TBL100007", str2) || TextUtils.equals("TBL100008", str2)) {
                BizMiniVideoView.access$000(BizMiniVideoView.this, this.f7038a, "destroy");
                BizMiniVideoView.access$100(BizMiniVideoView.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void onEvent(String str, String str2, String str3);
    }

    static {
        t2o.a(912263098);
    }

    public BizMiniVideoView(Context context) {
        super(context);
        initViews();
    }

    public static /* synthetic */ boolean access$000(BizMiniVideoView bizMiniVideoView, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df9dae3c", new Object[]{bizMiniVideoView, view, str})).booleanValue();
        }
        return bizMiniVideoView.reflectInvokeLiveMethod(view, str);
    }

    public static /* synthetic */ void access$100(BizMiniVideoView bizMiniVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a65f260f", new Object[]{bizMiniVideoView, new Boolean(z)});
        } else {
            bizMiniVideoView.updateVideoView(z);
        }
    }

    private void addBizVideoView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b21b3fd", new Object[]{this, view});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.mLayout.removeAllViews();
        this.mLayout.addView(view, layoutParams);
        this.mLayout.setWHRatio(this.mRealDimensionRatio);
        this.mCloseBtn.setVisibility(0);
    }

    private View getNextVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c693be20", new Object[]{this});
        }
        List<r4q> list = this.mBizVideoDataList;
        if (list == null || list.isEmpty()) {
            this.mCurVideoType = null;
            return null;
        }
        r4q r4qVar = this.mBizVideoDataList.get(0);
        if (r4qVar != null) {
            String t = r4qVar.t();
            JSONObject s = r4qVar.s();
            this.mTrackParams = r4qVar.u();
            if (TextUtils.equals("liveVideo", t)) {
                this.mBizVideoDataList.remove(0);
                this.mCurVideoType = "liveVideo";
                return getLiveVideoView(s);
            }
        }
        this.mCurVideoType = null;
        return null;
    }

    private void initViews() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        PreRenderManager g = PreRenderManager.g(tq4.d(this));
        if (g != null) {
            view = g.j(tq4.d(this), R.layout.tt_detail_biz_mini_video, this, true);
        } else {
            view = LayoutInflater.from(tq4.d(this)).inflate(R.layout.tt_detail_biz_mini_video, (ViewGroup) this, false);
        }
        addView(view, new FrameLayout.LayoutParams(-2, -2));
        this.mRootLayout = (ConstraintLayout) view.findViewById(R.id.cl_biz_root_container);
        RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) view.findViewById(R.id.rfl_biz_constraint_container);
        this.mLayout = ratioFrameLayout;
        ratioFrameLayout.setWHRatio(this.mRealDimensionRatio);
        View findViewById = view.findViewById(R.id.biz_view_close);
        this.mCloseBtn = findViewById;
        ViewProxy.setOnClickListener(findViewById, new a());
    }

    public static /* synthetic */ Object ipc$super(BizMiniVideoView bizMiniVideoView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/video/BizMiniVideoView");
    }

    private boolean isLiveVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1199f2f0", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("liveVideo", this.mCurVideoType);
    }

    private boolean play() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6fe955bf", new Object[]{this})).booleanValue() : play(null, null);
    }

    private boolean reflectInvokeLiveMethod(View view, String str) {
        if (view != null && !TextUtils.isEmpty(str)) {
            try {
                IpChange ipChange = TaoliveOpenDetailCardView.$ipChange;
                TaoliveOpenDetailCardView.class.getDeclaredMethod(str, new Class[0]).invoke(view, new Object[0]);
                return true;
            } catch (Exception e) {
                tgh.b(TAG, "failed to invoke live videoView method: " + str + ", exception: " + e);
            }
        }
        return false;
    }

    private void updateVideoView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5115ba96", new Object[]{this, new Boolean(z)});
            return;
        }
        View nextVideoView = getNextVideoView();
        this.mCurVideoView = nextVideoView;
        if (nextVideoView != null) {
            addBizVideoView(nextVideoView);
            if (!z) {
                play();
            }
        } else if (!TextUtils.isEmpty(this.mCurVideoType)) {
            updateVideoView(false);
        } else {
            ksk kskVar = this.mOnMiniVideoListener;
            if (kskVar != null) {
                kskVar.onFinish();
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public void detachVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d239f174", new Object[]{this});
        } else if (isLiveVideo()) {
            reflectInvokeLiveMethod(this.mCurVideoView, "destroy");
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public void setVideoData(List<r4q> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a80b87b", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            this.mBizVideoDataList = list;
            updateVideoView(true);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public boolean pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315dbf81", new Object[]{this})).booleanValue();
        }
        if (isLiveVideo()) {
            return reflectInvokeLiveMethod(this.mCurVideoView, "stop");
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public boolean play(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d49d8953", new Object[]{this, str, str2})).booleanValue() : playWithUniqueIdentifier(rcw.a(str, str2));
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public boolean playWithUniqueIdentifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e861d29", new Object[]{this, str})).booleanValue();
        }
        closeGlobalLiveVideoView();
        if (isLiveVideo()) {
            return reflectInvokeLiveMethod(this.mCurVideoView, "play");
        }
        return false;
    }

    public BizMiniVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViews();
    }

    public BizMiniVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initViews();
    }

    private View getLiveVideoView(JSONObject jSONObject) {
        if (jSONObject != null && !jSONObject.isEmpty()) {
            try {
                IpChange ipChange = TaoliveOpenDetailCardView.$ipChange;
                View view = (View) TaoliveOpenDetailCardView.class.getConstructor(Context.class).newInstance(this.mContext);
                Method declaredMethod = TaoliveOpenDetailCardView.class.getDeclaredMethod("setMediaConfig", HashMap.class);
                HashMap hashMap = new HashMap();
                ze7 ze7Var = this.mDetailContext;
                if (ze7Var != null) {
                    hashMap.putAll((Map) JSON.toJavaObject(UtUtils.c(ze7Var.e()), Map.class));
                }
                hashMap.put("liveSource", "liveitem.streaming_floating_video");
                declaredMethod.invoke(view, hashMap);
                TaoliveOpenDetailCardView.class.getDeclaredMethod("bindData", JSONObject.class).invoke(view, jSONObject);
                TaoliveOpenDetailCardView.class.getDeclaredMethod("setProxy", Object.class, Method.class).invoke(view, new b(view), c.class.getDeclaredMethod(MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, String.class, String.class, String.class));
                return view;
            } catch (Exception e) {
                tgh.b(TAG, "failed to get live videoView by reflection: " + e);
            }
        }
        return null;
    }
}
