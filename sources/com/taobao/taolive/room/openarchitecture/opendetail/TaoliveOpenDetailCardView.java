package com.taobao.taolive.room.openarchitecture.opendetail;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ju.track.server.JTrackParams;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.playcontrol.card.TBLOpenPlatformView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import tb.d4s;
import tb.mxf;
import tb.nw0;
import tb.pvs;
import tb.rg0;
import tb.t2o;
import tb.voj;
import tb.x5t;
import tb.xau;
import tb.yj4;
import tb.yqq;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoliveOpenDetailCardView extends FrameLayout implements TBLOpenPlatformView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = TaoliveOpenDetailCardView.class.getSimpleName();
    private Handler handler;
    private TUrlImageView icon;
    private String mJumpUrl;
    private TBLOpenPlatformView mTBLOpenPlatformView;
    private Object proxy;
    private Method proxyMethod;
    private TextView statusTv;
    private HashMap<String, String> trackParams;
    private final HashMap<String, String> mConfigParams = new HashMap<>();
    private int mPlayTime = 300;
    private Runnable mPlayComplete = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TaoliveOpenDetailCardView.this.onEvent("videoPlayer", "TBL100008", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f13199a;

        public b(Context context) {
            this.f13199a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (!yqq.e(TaoliveOpenDetailCardView.access$000(TaoliveOpenDetailCardView.this))) {
                voj.a(this.f13199a, TaoliveOpenDetailCardView.access$000(TaoliveOpenDetailCardView.this));
                TaoliveOpenDetailCardView.this.stop();
            } else {
                x5t.d(TaoliveOpenDetailCardView.access$100(), "onClick : mJumpUrl is null or empty");
            }
            TaoliveOpenDetailCardView.access$200(TaoliveOpenDetailCardView.this);
        }
    }

    static {
        t2o.a(779093055);
        t2o.a(779093468);
    }

    public TaoliveOpenDetailCardView(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ String access$000(TaoliveOpenDetailCardView taoliveOpenDetailCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cadad912", new Object[]{taoliveOpenDetailCardView});
        }
        return taoliveOpenDetailCardView.mJumpUrl;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return TAG;
    }

    public static /* synthetic */ void access$200(TaoliveOpenDetailCardView taoliveOpenDetailCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3aa68c", new Object[]{taoliveOpenDetailCardView});
        } else {
            taoliveOpenDetailCardView.trackOnClick();
        }
    }

    private JSONObject generatePlayParams(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6c072a9a", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject.containsKey("liveUrlList")) {
            jSONObject2.put("liveUrlList", (Object) jSONObject.getJSONArray("liveUrlList"));
        }
        if (jSONObject.containsKey("feedId")) {
            jSONObject2.put("feedId", (Object) jSONObject.getString("feedId"));
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("queryParams", (Object) jSONObject2);
        if (jSONObject.containsKey("roomStatus")) {
            jSONObject3.put("roomStatus", (Object) jSONObject.getString("roomStatus"));
        }
        if (jSONObject.containsKey("product_type")) {
            if (RecModel.MEDIA_TYPE_TIMEMOVE.equals(jSONObject.getString("product_type"))) {
                str = "true";
            } else {
                str = "false";
            }
            jSONObject3.put("isTimeMove", (Object) str);
        }
        if (jSONObject.containsKey("videoInfoType")) {
            jSONObject3.put("videoInfoType", (Object) jSONObject.getString("videoInfoType"));
        }
        if (jSONObject.containsKey("spfPlayVideo")) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("spfPlayVideo", (Object) jSONObject.getJSONObject("spfPlayVideo"));
            if (!jSONObject.containsKey("videoInfoType") || !"video".equals(jSONObject.getString("videoInfoType"))) {
                jSONObject3.put("componentTimeMovingDTO", (Object) jSONObject4);
            } else {
                jSONObject3.put("videoInfo", (Object) jSONObject4);
            }
        }
        return jSONObject3;
    }

    private String getLiveServerParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9107f62", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("liveId", (Object) jSONObject.getString("feedId"));
        jSONObject2.put(z9u.KEY_ACCOUNT_ID, (Object) jSONObject.getString(z9u.KEY_ACCOUNT_ID));
        jSONObject2.put("status", (Object) jSONObject.getString("roomStatus"));
        return jSONObject2.toJSONString();
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.handler = new Handler(Looper.getMainLooper());
        initView(context);
        initOpenPlatform();
        initMediaConfig();
        setOnClickListener(new b(context));
    }

    private void initMediaConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d7e69d", new Object[]{this});
            return;
        }
        this.mConfigParams.put("muted", "true");
        this.mConfigParams.put("forceAutoPlay", "true");
    }

    private void initOpenPlatform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25336014", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setOpenPlatformViewEvent(this);
            this.mTBLOpenPlatformView.setEnableCoverFade(true);
            this.mTBLOpenPlatformView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.mTBLOpenPlatformView.setSubBusinessType("detail_mini_card");
            this.mTBLOpenPlatformView.setVideoLoop(false);
            this.mTBLOpenPlatformView.setEnableConsumePlayer(false);
        }
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        try {
            this.mTBLOpenPlatformView = new TBLOpenPlatformView(context);
            addView(this.mTBLOpenPlatformView, new FrameLayout.LayoutParams(-1, -1));
            LinearLayout linearLayout = new LinearLayout(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, nw0.d(context, 27.0f));
            layoutParams.gravity = 81;
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
            gradientDrawable.setColors(new int[]{context.getResources().getColor(R.color.taolive_updatable_favor_count_text_color), context.getResources().getColor(R.color.taolive_open_detail_card_bottom_bg)});
            linearLayout.setBackground(gradientDrawable);
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            this.icon = tUrlImageView;
            tUrlImageView.setVisibility(8);
            this.icon.setSkipAutoSize(true);
            this.icon.setImageUrl(pvs.h2());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(nw0.d(context, 9.0f), nw0.d(context, 9.0f));
            layoutParams2.rightMargin = nw0.d(context, 6.0f);
            linearLayout.addView(this.icon, layoutParams2);
            TextView textView = new TextView(context);
            this.statusTv = textView;
            textView.setTextColor(context.getResources().getColor(R.color.white));
            this.statusTv.setTextSize(2, 12.0f);
            linearLayout.addView(this.statusTv, -2, -2);
            addView(linearLayout, layoutParams);
        } catch (Exception e) {
            e.printStackTrace();
            x5t.d(TAG, e.getMessage());
        }
    }

    public static /* synthetic */ Object ipc$super(TaoliveOpenDetailCardView taoliveOpenDetailCardView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/opendetail/TaoliveOpenDetailCardView");
    }

    private void trackOnClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f240ca5", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.mConfigParams.containsKey("item_id")) {
            hashMap.put("item_id", this.mConfigParams.get("item_id"));
        }
        if (this.mConfigParams.containsKey("seller_id")) {
            hashMap.put("seller_id", this.mConfigParams.get("seller_id"));
        }
        if (this.mConfigParams.containsKey("shop_id")) {
            hashMap.put("shop_id", this.mConfigParams.get("shop_id"));
        }
        if (this.mConfigParams.containsKey(xau.PROPERTY_VIDEO_ID)) {
            hashMap.put(xau.PROPERTY_VIDEO_ID, this.mConfigParams.get(xau.PROPERTY_VIDEO_ID));
        }
        hashMap.put("detailVersion", "detailV3");
        HashMap<String, String> hashMap2 = this.trackParams;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("Page_Detail", "Button_FloatingVideo");
        uTHitBuilders$UTControlHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
    }

    public void bindData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde2ba22", new Object[]{this, jSONObject});
        } else if (this.mTBLOpenPlatformView != null) {
            if (jSONObject.containsKey(yj4.PARAM_COVER_IMG)) {
                this.mTBLOpenPlatformView.setImageUrl(jSONObject.getString(yj4.PARAM_COVER_IMG));
            }
            String string = jSONObject.getString("product_type");
            jSONObject.put("playParams", (Object) generatePlayParams(jSONObject));
            jSONObject.putAll(this.mConfigParams);
            jSONObject.put("ignorePV", (Object) Boolean.FALSE);
            jSONObject.put("liveServerParams", (Object) getLiveServerParams(jSONObject));
            this.mTBLOpenPlatformView.setData(jSONObject);
            updateBottomView(string);
            this.mPlayTime = yqq.l(jSONObject.getString("playTime"), 300);
            this.mJumpUrl = jSONObject.getString(rg0.JUMP_URL);
            if (jSONObject.containsKey(JTrackParams.TRACK_PARAMS)) {
                this.trackParams = mxf.b(jSONObject.getJSONObject(JTrackParams.TRACK_PARAMS));
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(null);
                this.handler.postDelayed(this.mPlayComplete, TimeUnit.SECONDS.toMillis(this.mPlayTime));
            }
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.destroy();
            if (d4s.e("enable_detail_mini_card_pm_subscribe", true)) {
                this.mTBLOpenPlatformView.stopSubscribePM();
            }
        }
        this.proxy = null;
        this.proxyMethod = null;
        this.mConfigParams.clear();
        removeAllViews();
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.mPlayComplete);
        }
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.playVideo();
            if (d4s.e("enable_detail_mini_card_pm_subscribe", true)) {
                this.mTBLOpenPlatformView.startSubscribePM("detail_mini_card", false);
            }
        }
    }

    public void setMediaConfig(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793366c8", new Object[]{this, hashMap});
        } else {
            this.mConfigParams.putAll(hashMap);
        }
    }

    public void setProxy(Object obj, Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f08537", new Object[]{this, obj, method});
            return;
        }
        this.proxy = obj;
        this.proxyMethod = method;
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.stopVideo();
            if (d4s.e("enable_detail_mini_card_pm_subscribe", true)) {
                this.mTBLOpenPlatformView.stopSubscribePM();
            }
        }
    }

    private void updateBottomView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ad21aea", new Object[]{this, str});
        } else if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -2076614626) {
                if (hashCode == 3322092) {
                    str.equals("live");
                }
            } else if (str.equals(RecModel.MEDIA_TYPE_TIMEMOVE)) {
                this.statusTv.setText(R.string.taolive_status_living_time_move);
                this.icon.setVisibility(0);
                return;
            }
            this.statusTv.setText(R.string.taolive_status_living);
            this.icon.setVisibility(0);
        }
    }

    @Override // com.taobao.taolive.sdk.playcontrol.card.TBLOpenPlatformView.a
    public void onEvent(String str, String str2, String str3) {
        if (!(this.proxy == null || this.proxyMethod == null)) {
            try {
                if ("TBL100005".equals(str2)) {
                    this.proxyMethod.invoke(this.proxy, str, "TBL100006", str3);
                    return;
                }
                this.proxyMethod.invoke(this.proxy, str, str2, str3);
            } catch (IllegalAccessException e) {
                x5t.d(TAG, e.getMessage());
            } catch (InvocationTargetException e2) {
                x5t.d(TAG, e2.getMessage());
            }
        }
        String str4 = TAG;
        x5t.f(str4, "onEvent: type= " + str + " eventCode= " + str2 + " extra=" + str3);
    }

    public TaoliveOpenDetailCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public TaoliveOpenDetailCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
