package com.taobao.taolive.uikit.homepage;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import tb.arq;
import tb.cvd;
import tb.dcc;
import tb.enr;
import tb.fnr;
import tb.fz0;
import tb.jw0;
import tb.kyw;
import tb.r4d;
import tb.t2o;
import tb.viv;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TLiveView extends TUrlImageView implements cvd, Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mDuration;
    private boolean mIsAttachedToWindow;
    private String mLiveId;
    private String mLiveUrl;
    public RecyclerView.OnScrollListener mOnScrollListener;
    public RecyclerView mParentRecycler;
    private JSONObject mPlayerData;
    private final BroadcastReceiver mReceiver;
    private String mSubBusinessType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements dcc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TLiveView tLiveView) {
        }

        @Override // tb.dcc
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TLiveView.access$100(TLiveView.this);
            }
        }
    }

    static {
        t2o.a(779093606);
        t2o.a(806356532);
    }

    public TLiveView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean access$000(TLiveView tLiveView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a20e73c9", new Object[]{tLiveView})).booleanValue();
        }
        return tLiveView.mIsAttachedToWindow;
    }

    public static /* synthetic */ void access$100(TLiveView tLiveView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe70e24", new Object[]{tLiveView});
        } else {
            tLiveView.playVideoIfNecessary();
        }
    }

    public static /* synthetic */ void access$200(TLiveView tLiveView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfa883", new Object[]{tLiveView});
        } else {
            tLiveView.stopVideo();
        }
    }

    public static /* synthetic */ Object ipc$super(TLiveView tLiveView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/uikit/homepage/TLiveView");
        }
    }

    private void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
        } else {
            enr.g(getContext()).n();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else if (getContext() == activity || ("MainActivity3".equals(activity.getLocalClassName()) && getContext() == getContext().getApplicationContext())) {
            if (!enr.j()) {
                enr.g(getContext()).d();
            }
            try {
                ((Application) getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        getContext().registerReceiver(this.mReceiver, intentFilter);
        ViewParent parent = getParent();
        while (!(parent instanceof RecyclerView) && (parent = parent.getParent()) != null) {
        }
        if (parent != null) {
            RecyclerView recyclerView = (RecyclerView) parent;
            this.mParentRecycler = recyclerView;
            recyclerView.addOnScrollListener(this.mOnScrollListener);
        }
        this.mIsAttachedToWindow = true;
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mIsAttachedToWindow = false;
        getContext().unregisterReceiver(this.mReceiver);
        RecyclerView recyclerView = this.mParentRecycler;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.mOnScrollListener);
        }
        this.mParentRecycler = null;
        stopVideo();
    }

    @Override // tb.cvd
    public void onVideoRequestAccept() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49416702", new Object[]{this});
            return;
        }
        r4d h = enr.g(getContext()).h();
        if (h != null && h.getView() != null) {
            ViewGroup viewGroup = (ViewGroup) h.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(h.getView());
            }
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                layoutParams = new FrameLayout.LayoutParams(getWidth(), getHeight());
                layoutParams.setMargins(getLeft(), getTop(), 0, 0);
            } else {
                layoutParams = new FrameLayout.LayoutParams(getWidth(), getHeight());
            }
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.addView(h.getView(), ((ViewGroup) getParent()).indexOfChild(this), layoutParams);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // tb.cvd
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        new StringBuilder("onVideoStart ==== this = ").append(this);
        fz0.a(this, 90L);
    }

    @Override // tb.cvd
    public void onVideoStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a6d85", new Object[]{this});
            return;
        }
        new StringBuilder("onVideoStop ==== this = ").append(this);
        fz0.b(this, 500L);
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            playVideoIfNecessary();
        } else {
            stopVideo();
        }
    }

    public void setDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
        } else {
            this.mDuration = i;
        }
    }

    public void setLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.mLiveId = str;
        }
    }

    public void setLiveUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd3e9f2", new Object[]{this, str});
            return;
        }
        this.mLiveUrl = str;
        new kyw(new a(this)).postDelayed(new b(), 1000L);
    }

    public void setPlayerData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f30ff3c", new Object[]{this, jSONObject});
        } else {
            this.mPlayerData = jSONObject;
        }
    }

    public void setSubBusinessType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c26149", new Object[]{this, str});
        } else {
            this.mSubBusinessType = str;
        }
    }

    public TLiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void playVideoIfNecessary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d85192", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.mLiveUrl) && !jw0.g(getContext())) {
            MediaLiveInfo mediaLiveInfo = null;
            try {
                if (this.mPlayerData != null) {
                    MediaLiveInfo mediaLiveInfo2 = new MediaLiveInfo();
                    mediaLiveInfo2.h265 = arq.c(this.mPlayerData.getString("h265"));
                    mediaLiveInfo2.mediaConfig = "";
                    mediaLiveInfo2.rateAdapte = false;
                    mediaLiveInfo2.liveUrlList = new ArrayList<>();
                    QualityLiveItem qualityLiveItem = new QualityLiveItem();
                    qualityLiveItem.definition = MediaConstant.DEFINITION_MD;
                    qualityLiveItem.flvUrl = this.mLiveUrl;
                    qualityLiveItem.name = "高清";
                    qualityLiveItem.wholeH265FlvUrl = this.mPlayerData.getString(yj4.PARAM_MEDIA_INFO_wholeH265FlvUrl);
                    mediaLiveInfo2.liveUrlList.add(qualityLiveItem);
                    mediaLiveInfo = mediaLiveInfo2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            fnr fnrVar = new fnr(this, this.mLiveUrl, mediaLiveInfo);
            int i = this.mDuration;
            if (i <= 0) {
                i = 10;
            }
            fnrVar.c = i;
            Rect rect = new Rect();
            fnrVar.k = rect;
            fnrVar.h = this.mLiveId;
            fnrVar.d = this.mSubBusinessType;
            fnrVar.e = 0;
            getGlobalVisibleRect(rect);
            enr.g(getContext()).l(fnrVar);
        }
    }

    public TLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSubBusinessType = "HomePageLive";
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.taolive.uikit.homepage.TLiveView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/homepage/TLiveView$4");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    TLiveView.access$200(TLiveView.this);
                } else if ("android.intent.action.USER_PRESENT".equals(action) && TLiveView.this.isShown()) {
                    TLiveView.access$100(TLiveView.this);
                }
            }
        };
        viv.a("TLiveView");
        this.mIsAttachedToWindow = false;
        this.mOnScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.taolive.uikit.homepage.TLiveView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/uikit/homepage/TLiveView$1");
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i2)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i2);
                if (i2 == 0 && TLiveView.access$000(TLiveView.this)) {
                    TLiveView.access$100(TLiveView.this);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                } else {
                    super.onScrolled(recyclerView, i2, i3);
                }
            }
        };
        try {
            ((Application) getContext().getApplicationContext()).registerActivityLifecycleCallbacks(this);
        } catch (Throwable unused) {
        }
    }
}
