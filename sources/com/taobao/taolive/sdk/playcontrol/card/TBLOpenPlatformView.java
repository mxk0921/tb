package com.taobao.taolive.sdk.playcontrol.card;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taolive.adapterimpl.LiveRoomInit;
import com.taobao.taolive.sdk.playcontrol.card.TBLiveMediaCardView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.AbsFeature;
import java.util.HashMap;
import java.util.Map;
import tb.cit;
import tb.cpr;
import tb.hbd;
import tb.hjr;
import tb.l6t;
import tb.m6t;
import tb.ncc;
import tb.qlr;
import tb.rlr;
import tb.t2o;
import tb.ujl;
import tb.xlr;
import tb.y83;
import tb.yj4;
import tb.yqq;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLOpenPlatformView extends RelativeLayout implements ncc, cpr.b, qlr, rlr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String account_id;
    private String entryLiveSource;
    private String entrySpm;
    private String feed_id;
    private String ignorePV;
    private String isAD;
    private String liveServerParams;
    private String liveSource;
    private String livestatus;
    private TBLiveMediaCardView.d mCoverImageSuccessCallBack;
    private cpr.b mIMessageListener;
    private a mOpenPlatformViewEvent;
    private String mPMID;
    private Map<String, String> mPMParams;
    private rlr mPlayerCallback;
    private RelativeLayout mRootView;
    private TBLiveMediaCardView mTBLiveOpenCardView;
    private qlr mTBLiveOpenCardViewCallback;
    private xlr mTBLiveQueueMessageProvider;
    private String newRoomType;
    private String playerScene;
    private l6t pmController;
    private String product_type;
    private String roomStatus;
    private String roomType;
    private String spm_cnt;
    private String spm_url;
    private String streamStatus;
    private String subBusinessType;
    private String topic;
    private String trackInfo;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onEvent(String str, String str2, String str3);
    }

    static {
        t2o.a(779093467);
        t2o.a(806355920);
        t2o.a(806356196);
        t2o.a(806356527);
        t2o.a(806356528);
    }

    public TBLOpenPlatformView(Context context) {
        super(context);
        initView(context);
    }

    private void addPowerMessageInterceptorByManager(hbd hbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295ca4a9", new Object[]{this, hbdVar});
        } else {
            ujl.d().a(hbdVar);
        }
    }

    private void addPowerMessageInterceptorByQueue(hbd hbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583e16cd", new Object[]{this, hbdVar});
            return;
        }
        xlr xlrVar = this.mTBLiveQueueMessageProvider;
        if (xlrVar != null) {
            xlrVar.q(hbdVar);
        }
    }

    private Map<String, String> convertToMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf456ef4", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject.keySet().size() > 0) {
                    for (String str2 : parseObject.keySet()) {
                        String valueOf = String.valueOf(str2);
                        hashMap.put(valueOf, parseObject.getString(valueOf));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        try {
            LiveRoomInit.init();
            this.mRootView = new RelativeLayout(context);
            this.mRootView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.mTBLiveOpenCardView = new TBLiveMediaCardView(context);
            this.mTBLiveOpenCardView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.mTBLiveOpenCardView.setEnableReport(true);
            this.mRootView.addView(this.mTBLiveOpenCardView);
            addView(this.mRootView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(TBLOpenPlatformView tBLOpenPlatformView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/playcontrol/card/TBLOpenPlatformView");
    }

    private void notifyH5Event(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80397869", new Object[]{this, str, str2, str3});
            return;
        }
        a aVar = this.mOpenPlatformViewEvent;
        if (aVar != null) {
            aVar.onEvent(str, str2, str3);
        }
    }

    private void setCoverByData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e303f393", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("queryParams");
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("poster");
            if (!TextUtils.isEmpty(string)) {
                this.mTBLiveOpenCardView.setImageUrl(string);
                this.mTBLiveOpenCardView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    private void startSubscribePMByQueue(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0fd7a8e", new Object[]{this, str, new Boolean(z)});
            return;
        }
        xlr xlrVar = new xlr(1, this.topic, null, str, false, true, false, false, z, false, false, this);
        this.mTBLiveQueueMessageProvider = xlrVar;
        xlrVar.d0(this.feed_id);
        this.mTBLiveQueueMessageProvider.a0(this);
        this.mTBLiveQueueMessageProvider.i0();
        this.mTBLiveQueueMessageProvider.y();
    }

    private void startSubscribePMManager(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63060c7b", new Object[]{this, str, new Boolean(z)});
            return;
        }
        this.mPMID = ujl.d().c();
        ujl.d().g(this.mPMID, this.topic, z, str, this.feed_id, this, this);
    }

    private void stopSubscribePMByManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a5b978", new Object[]{this});
        } else {
            ujl.d().b(this.mPMID);
        }
    }

    private void stopSubscribePMByQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc691dc", new Object[]{this});
            return;
        }
        xlr xlrVar = this.mTBLiveQueueMessageProvider;
        if (xlrVar != null) {
            xlrVar.z();
            this.mTBLiveQueueMessageProvider.l0();
            this.mTBLiveQueueMessageProvider = null;
        }
    }

    private void stopSubscribePMController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d7d8e8", new Object[]{this});
            return;
        }
        l6t l6tVar = this.pmController;
        if (l6tVar != null) {
            l6tVar.B();
            this.pmController = null;
        }
    }

    private void subscribeLivePMController(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd603b4", new Object[]{this, str, new Boolean(z)});
            return;
        }
        m6t m6tVar = new m6t(str, z, this.topic, this.feed_id, this);
        m6tVar.p(true);
        m6tVar.o(false);
        m6tVar.s(false);
        l6t l6tVar = new l6t();
        this.pmController = l6tVar;
        l6tVar.v(this);
        this.pmController.y(m6tVar);
    }

    public boolean addFeature(AbsFeature<? super ImageView> absFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa4ab52", new Object[]{this, absFeature})).booleanValue();
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            return tBLiveMediaCardView.addFeature(absFeature);
        }
        return false;
    }

    public void addPowerMessageInterceptor(hbd hbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef6cf7", new Object[]{this, hbdVar});
            return;
        }
        l6t l6tVar = this.pmController;
        if (l6tVar != null) {
            l6tVar.c(hbdVar);
        } else if (hjr.y()) {
            addPowerMessageInterceptorByQueue(hbdVar);
        } else {
            addPowerMessageInterceptorByManager(hbdVar);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.destroy();
        }
    }

    public AbsFeature<? super ImageView> findFeature(Class<? extends AbsFeature<? super ImageView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsFeature) ipChange.ipc$dispatch("67a9db6f", new Object[]{this, cls});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            return tBLiveMediaCardView.findFeature(cls);
        }
        return null;
    }

    public String getAlogParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb6bdba", new Object[]{this});
        }
        return null;
    }

    public TUrlImageView getCover() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("e99e40f4", new Object[]{this});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            return tBLiveMediaCardView.getCover();
        }
        return null;
    }

    public Bitmap getCurrentFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            return tBLiveMediaCardView.getCurrentFrame();
        }
        return null;
    }

    public String getHearParamsServer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86a5082c", new Object[]{this});
        }
        return null;
    }

    @Override // tb.ncc
    public Map<String, String> getHeartParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ab918d32", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("livesource", this.liveSource);
        hashMap.put("entryLiveSource", this.entryLiveSource);
        hashMap.put("spm-url", this.spm_url);
        hashMap.put("spm_cnt", this.spm_cnt);
        hashMap.put(z9u.KEY_LIVE_STATUS, this.livestatus);
        hashMap.put("entrySpm", this.entrySpm);
        hashMap.put("isAD", this.isAD);
        hashMap.put(z9u.KEY_ACCOUNT_ID, this.account_id);
        hashMap.put("feed_id", this.feed_id);
        hashMap.put("product_type", this.product_type);
        hashMap.put(yj4.PARAM_IGNORE_PV, this.ignorePV);
        hashMap.put(z9u.KEY_ROOMTYPE, this.roomType);
        hashMap.put("newRoomType", this.newRoomType);
        hashMap.put("roomStatus", this.roomStatus);
        hashMap.put("streamStatus", this.streamStatus);
        hashMap.put("trackInfo", this.trackInfo);
        hashMap.put("liveServerParams", this.liveServerParams);
        hashMap.put("pmSession", this.mPMID);
        Map<String, String> map = this.mPMParams;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public ViewGroup getPlayerRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2bcf1150", new Object[]{this});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            return tBLiveMediaCardView.getPlayerRootView();
        }
        return null;
    }

    public String getPlayerSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa9b7f9a", new Object[]{this});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            return tBLiveMediaCardView.getPlayerSession();
        }
        return null;
    }

    public String getPlayerToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41c2c5d7", new Object[]{this});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            return tBLiveMediaCardView.getPlayerToken();
        }
        return null;
    }

    public String getRecycleToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7687add", new Object[]{this});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            return tBLiveMediaCardView.getRecycleToken();
        }
        return null;
    }

    public boolean isMuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue();
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            return tBLiveMediaCardView.isMute();
        }
        return false;
    }

    public boolean isPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1b529a8", new Object[]{this})).booleanValue();
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            return tBLiveMediaCardView.isPlayVideo();
        }
        return false;
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            return tBLiveMediaCardView.isPlaying();
        }
        return false;
    }

    @Override // tb.qlr
    public void onError(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            return;
        }
        switch (i) {
            case -90001:
                str = "TBL200002";
                break;
            case -90000:
                str = "TBL200001";
                break;
            default:
                str = null;
                break;
        }
        notifyH5Event("liveCard", str, null);
        qlr qlrVar = this.mTBLiveOpenCardViewCallback;
        if (qlrVar != null) {
            qlrVar.onError(i);
        }
    }

    @Override // tb.qlr
    public void onInfo(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44be144f", new Object[]{this, new Integer(i)});
            return;
        }
        switch (i) {
            case 100001:
                str = "TBL100005";
                break;
            case 100002:
                str = "TBL100007";
                break;
            case 100003:
                str = "TBL100008";
                break;
            case 100004:
                str = "TBL100009";
                break;
            case cit.ERROR_TEMPLATE_INIT_FAILED /* 100005 */:
                str = "TBL100004";
                break;
            case 100006:
                str = "TBL000001";
                break;
            case 100007:
                str = "TBL000002";
                break;
            default:
                str = null;
                break;
        }
        notifyH5Event("player", str, null);
        qlr qlrVar = this.mTBLiveOpenCardViewCallback;
        if (qlrVar != null) {
            qlrVar.onInfo(i);
        }
    }

    @Override // tb.rlr
    public void onMediaError(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        notifyH5Event("player", "TBL100006", String.valueOf(i));
        rlr rlrVar = this.mPlayerCallback;
        if (rlrVar != null) {
            rlrVar.onMediaError(i, i2);
        }
    }

    @Override // tb.rlr
    public void onMediaInfo(long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        rlr rlrVar = this.mPlayerCallback;
        if (rlrVar != null) {
            rlrVar.onMediaInfo(j, j2, j3, obj);
        }
    }

    @Override // tb.gtc
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            return;
        }
        if (i == 1004) {
            notifyH5Event("PowerMsg", "TBL200001", null);
        } else if (i == 1006) {
            notifyH5Event("PowerMsg", "TBL200002", null);
        }
        cpr.b bVar = this.mIMessageListener;
        if (bVar != null) {
            bVar.onMessageReceived(i, obj);
        }
    }

    public boolean playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4075d2b2", new Object[]{this})).booleanValue();
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            return tBLiveMediaCardView.playVideo(this, this);
        }
        return false;
    }

    public void setAnimateTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd97b50", new Object[]{this, new Integer(i)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setAnimateTime(i);
        }
    }

    public void setCloseSkipPlaySwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddf5290", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setCloseSkipPlaySwitch(z);
        }
    }

    public void setColorFilter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca662803", new Object[]{this, new Integer(i)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setColorFilter(i);
        }
    }

    @Deprecated
    public void setCornerRadius(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9823bd90", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setCornerRadius(i, i2, i3, i4);
        }
    }

    public void setCoverImageSuccessCallBack(TBLiveMediaCardView.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc13068", new Object[]{this, dVar});
        } else {
            this.mCoverImageSuccessCallBack = dVar;
        }
    }

    public void setEnableConsumePlayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9960b5", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setEnableConsumePlayer(z);
        }
    }

    public void setEnableCoverFade(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be301c1f", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setEnableCoverFade(z);
        }
    }

    public void setEnableKeepLastFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b948960", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setEnableKeepLastFrame(z);
        }
    }

    public void setIMessageListener(cpr.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76bacab", new Object[]{this, bVar});
        } else {
            this.mIMessageListener = bVar;
        }
    }

    public void setImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setImageResource(i);
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setImageUrl(str);
        }
    }

    @Deprecated
    public void setLiveVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3187caa0", new Object[]{this, new Boolean(z)});
        }
    }

    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setMuted(z);
        }
    }

    public void setOpenPlatformViewEvent(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78bd4b5e", new Object[]{this, aVar});
        } else {
            this.mOpenPlatformViewEvent = aVar;
        }
    }

    public void setPMParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9558116", new Object[]{this, str});
        } else {
            this.mPMParams = convertToMap(str);
        }
    }

    public void setPageId(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0994aaf", new Object[]{this, obj});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setPageId(obj);
        }
    }

    public void setPlaceHoldImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf7958", new Object[]{this, new Integer(i)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setPlaceHoldImageResId(i);
        }
    }

    public void setPlayDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c89b32", new Object[]{this, new Integer(i)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setPlayDuration(i);
        }
    }

    public void setPlayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dab0aa", new Object[]{this, str});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setPlayUrl(str);
        }
    }

    public void setPlayVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d36ae8", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setPlayVideo(z);
        }
    }

    public void setPlayerCallback(rlr rlrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee62999d", new Object[]{this, rlrVar});
        } else {
            this.mPlayerCallback = rlrVar;
        }
    }

    public void setPlayerCover(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d31c7e", new Object[]{this, str, new Integer(i)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setPlayerCover(str, i);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setScaleType(scaleType);
        }
    }

    public void setSubBusinessType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c26149", new Object[]{this, str});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setSubBusinessType(str);
        }
    }

    public void setTBLiveOpenCardViewCallback(qlr qlrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773e6ca6", new Object[]{this, qlrVar});
        } else {
            this.mTBLiveOpenCardViewCallback = qlrVar;
        }
    }

    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setVideoLoop(z);
        }
    }

    public void setViewInfoLifeCycleSyncOpenCard(DinamicXEngine dinamicXEngine, DXWidgetNode dXWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70be9097", new Object[]{this, dinamicXEngine, dXWidgetNode, str});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.setViewInfoLifeCycleSyncOpenCard(dinamicXEngine, dXWidgetNode, str);
        }
    }

    public void startSubscribePM(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbc45be", new Object[]{this, str, new Boolean(z)});
        } else if (hjr.i()) {
            subscribeLivePMController(str, z);
        } else if (hjr.y()) {
            startSubscribePMByQueue(str, z);
        } else {
            startSubscribePMManager(str, z);
        }
    }

    public void stopSubscribePM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba8f16c", new Object[]{this});
        } else if (hjr.i()) {
            stopSubscribePMController();
        } else if (hjr.y()) {
            stopSubscribePMByQueue();
        } else {
            stopSubscribePMByManager();
        }
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.stopVideo();
        }
    }

    public void updatePMParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17b8f3d", new Object[]{this, str});
        } else {
            this.mPMParams = convertToMap(str);
        }
    }

    public void warmVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e127767d", new Object[]{this});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView != null) {
            tBLiveMediaCardView.warmVideo();
        }
    }

    public TBLOpenPlatformView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("playParams");
            if (!(jSONObject2 == null || this.mTBLiveOpenCardView == null)) {
                setCoverByData(jSONObject2);
                this.mTBLiveOpenCardView.setPlayerData(jSONObject2);
                this.mTBLiveOpenCardView.setPlayVideo(true);
                String string = jSONObject.getString("forceAutoPlay");
                if (!TextUtils.isEmpty(string)) {
                    this.mTBLiveOpenCardView.closeSkipPlaySwitch = yqq.i(string, false);
                }
                String string2 = jSONObject.getString("muted");
                if (!TextUtils.isEmpty(string2)) {
                    this.mTBLiveOpenCardView.setMuted(yqq.i(string2, true));
                }
            }
            this.topic = jSONObject.getString("topic");
            this.liveSource = jSONObject.getString("liveSource");
            this.entryLiveSource = jSONObject.getString("entryLiveSource");
            this.spm_url = jSONObject.getString("spm_url");
            this.spm_cnt = jSONObject.getString("spm_cnt");
            this.livestatus = jSONObject.getString(z9u.KEY_LIVE_STATUS);
            this.entrySpm = jSONObject.getString("entrySpm");
            this.isAD = jSONObject.getString("isAD");
            this.feed_id = jSONObject.getString("feed_id");
            this.account_id = jSONObject.getString(z9u.KEY_ACCOUNT_ID);
            this.product_type = jSONObject.getString("product_type");
            this.ignorePV = jSONObject.getString("ignorePV");
            this.subBusinessType = jSONObject.getString("subBusinessType");
            this.playerScene = jSONObject.getString("playerScene");
            this.roomType = jSONObject.getString(z9u.KEY_ROOMTYPE);
            this.newRoomType = jSONObject.getString("newRoomType");
            this.roomStatus = jSONObject.getString("roomStatus");
            this.streamStatus = jSONObject.getString("streamStatus");
            this.trackInfo = jSONObject.getString("trackInfo");
            this.liveServerParams = jSONObject.getString("liveServerParams");
            TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
            if (tBLiveMediaCardView != null) {
                String str = this.subBusinessType;
                if (str != null) {
                    tBLiveMediaCardView.setSubBusinessType(str);
                }
                if (this.mTBLiveOpenCardView.getCardPlayPerformanceTracker() != null) {
                    this.mTBLiveOpenCardView.getCardPlayPerformanceTracker().d(this.feed_id);
                    this.mTBLiveOpenCardView.getCardPlayPerformanceTracker().f(this.livestatus);
                    this.mTBLiveOpenCardView.getCardPlayPerformanceTracker().e(this.liveSource);
                    this.mTBLiveOpenCardView.getCardPlayPerformanceTracker().i("defaultInit");
                    this.mTBLiveOpenCardView.getCardPlayPerformanceTracker().g("liveUrlList");
                    this.mTBLiveOpenCardView.getCardPlayPerformanceTracker().l("didAppear");
                    y83 cardPlayPerformanceTracker = this.mTBLiveOpenCardView.getCardPlayPerformanceTracker();
                    String str2 = this.playerScene;
                    if (str2 == null) {
                        str2 = "tblive_open_h5card";
                    }
                    cardPlayPerformanceTracker.j(str2);
                }
            }
        }
    }

    public TBLOpenPlatformView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }
}
