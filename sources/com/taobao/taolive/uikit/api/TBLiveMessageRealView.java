package com.taobao.taolive.uikit.api;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.Pools;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import tb.arq;
import tb.gbu;
import tb.jw0;
import tb.t2o;
import tb.yxv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveMessageRealView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONArray mCommentInfos;
    private Context mContext;
    private int mShowBarrageTime;
    private JSONObject mShowMaidian;
    private LayoutTransition transition;
    private int maxItem = 2;
    public Pools.SimplePool<View> viewPool = new Pools.SimplePool<>(4);
    private int index = 0;
    private Handler handler = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2145066406:
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                case -1868320925:
                    super.onAnimationCancel((Animator) objArr[0]);
                    return null;
                case 977295137:
                    super.onAnimationStart((Animator) objArr[0]);
                    return null;
                case 1133046404:
                    super.onAnimationRepeat((Animator) objArr[0]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/api/TBLiveMessageRealView$1");
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                super.onAnimationCancel(animator);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            if (TBLiveMessageRealView.this.getChildCount() == TBLiveMessageRealView.access$000(TBLiveMessageRealView.this) + 1 && TBLiveMessageRealView.access$100(TBLiveMessageRealView.this) != null) {
                TBLiveMessageRealView.access$100(TBLiveMessageRealView.this).sendEmptyMessage(2);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            } else {
                super.onAnimationRepeat(animator);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                super.onAnimationStart(animator);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/api/TBLiveMessageRealView$2");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                View obtainMessageView = TBLiveMessageRealView.this.obtainMessageView();
                if (obtainMessageView != null) {
                    TBLiveMessageRealView.this.addView(obtainMessageView);
                }
                TBLiveMessageRealView.access$208(TBLiveMessageRealView.this);
                if (TBLiveMessageRealView.access$200(TBLiveMessageRealView.this) == TBLiveMessageRealView.access$300(TBLiveMessageRealView.this).size()) {
                    TBLiveMessageRealView.access$202(TBLiveMessageRealView.this, 0);
                }
                if (TBLiveMessageRealView.access$400(TBLiveMessageRealView.this) > 0) {
                    j = TBLiveMessageRealView.access$400(TBLiveMessageRealView.this);
                } else {
                    j = 1000;
                }
                sendEmptyMessageDelayed(0, j);
            } else if (i == 2 && TBLiveMessageRealView.this.getChildCount() > 0) {
                TBLiveMessageRealView tBLiveMessageRealView = TBLiveMessageRealView.this;
                tBLiveMessageRealView.removeView(tBLiveMessageRealView.getChildAt(0));
            }
        }
    }

    static {
        t2o.a(779093569);
    }

    public TBLiveMessageRealView(Context context) {
        super(context);
        this.mContext = context;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = jw0.b(this.mContext, 4.0f);
        setLayoutParams(layoutParams);
    }

    public static /* synthetic */ int access$000(TBLiveMessageRealView tBLiveMessageRealView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8470c7f", new Object[]{tBLiveMessageRealView})).intValue();
        }
        return tBLiveMessageRealView.maxItem;
    }

    public static /* synthetic */ Handler access$100(TBLiveMessageRealView tBLiveMessageRealView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("cbbb059", new Object[]{tBLiveMessageRealView});
        }
        return tBLiveMessageRealView.handler;
    }

    public static /* synthetic */ int access$200(TBLiveMessageRealView tBLiveMessageRealView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9b2a601", new Object[]{tBLiveMessageRealView})).intValue();
        }
        return tBLiveMessageRealView.index;
    }

    public static /* synthetic */ int access$202(TBLiveMessageRealView tBLiveMessageRealView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("667cbce6", new Object[]{tBLiveMessageRealView, new Integer(i)})).intValue();
        }
        tBLiveMessageRealView.index = i;
        return i;
    }

    public static /* synthetic */ int access$208(TBLiveMessageRealView tBLiveMessageRealView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1652ee09", new Object[]{tBLiveMessageRealView})).intValue();
        }
        int i = tBLiveMessageRealView.index;
        tBLiveMessageRealView.index = 1 + i;
        return i;
    }

    public static /* synthetic */ JSONArray access$300(TBLiveMessageRealView tBLiveMessageRealView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("348c0d8f", new Object[]{tBLiveMessageRealView});
        }
        return tBLiveMessageRealView.mCommentInfos;
    }

    public static /* synthetic */ int access$400(TBLiveMessageRealView tBLiveMessageRealView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1e3f83", new Object[]{tBLiveMessageRealView})).intValue();
        }
        return tBLiveMessageRealView.mShowBarrageTime;
    }

    public static /* synthetic */ Object ipc$super(TBLiveMessageRealView tBLiveMessageRealView, String str, Object... objArr) {
        if (str.hashCode() == -572887227) {
            super.addView((View) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/api/TBLiveMessageRealView");
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
            return;
        }
        setAnimateView(view);
        super.addView(view);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        setVisibility(8);
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
        LayoutTransition layoutTransition = this.transition;
        if (layoutTransition != null && !layoutTransition.isRunning()) {
            this.transition = null;
        }
    }

    public int[] getShaderParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("c74f5d9c", new Object[]{this});
        }
        return new int[]{jw0.b(getContext(), 30.0f), jw0.b(getContext(), 50.0f)};
    }

    public int getViewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed8ac39c", new Object[]{this})).intValue();
        }
        return jw0.b(this.mContext, 78.0f);
    }

    public View obtainMessageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fc150330", new Object[]{this});
        }
        try {
            View acquire = this.viewPool.acquire();
            if (acquire == null) {
                acquire = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_message_item, (ViewGroup) null);
            }
            TUrlImageView tUrlImageView = (TUrlImageView) acquire.findViewById(R.id.live_chat_icon);
            TextView textView = (TextView) acquire.findViewById(R.id.live_chat_nick);
            TextView textView2 = (TextView) acquire.findViewById(R.id.live_chat_content);
            JSONObject jSONObject = this.mCommentInfos.getJSONObject(this.index);
            if (jSONObject != null) {
                String string = jSONObject.getString("icon");
                String string2 = jSONObject.getString("content");
                String string3 = jSONObject.getString("userNick");
                if (arq.a(string)) {
                    tUrlImageView.setVisibility(8);
                    if (!arq.a(string3)) {
                        textView.setText(string3 + ":");
                        textView.setVisibility(0);
                    }
                } else {
                    textView.setVisibility(8);
                    tUrlImageView.setImageUrl(string);
                    tUrlImageView.setVisibility(0);
                }
                if (!arq.a(string2)) {
                    textView2.setText(string2);
                }
            }
            return acquire;
        } catch (Exception unused) {
            return null;
        }
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.size() > 0) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("bizData");
            JSONArray jSONArray = jSONObject.getJSONArray("commentInfos");
            JSONObject jSONObject3 = jSONObject.getJSONObject("showMaidian");
            if (jSONArray != null && jSONArray.size() != 0) {
                this.mCommentInfos = jSONArray;
                this.mShowMaidian = jSONObject3;
                Map hashMap = new HashMap();
                JSONObject jSONObject4 = this.mShowMaidian;
                if (jSONObject4 != null) {
                    String string = jSONObject4.getString("params");
                    if (!arq.a(string)) {
                        hashMap = yxv.b(string);
                    }
                }
                gbu.b("Page_TaobaoLive", "home_feed_show_realtime", hashMap);
                if (jSONObject2 != null) {
                    if (!arq.a(jSONObject2.getString("showBarrageCount"))) {
                        this.maxItem = Integer.parseInt(jSONObject2.getString("showBarrageCount"));
                    }
                    if (!arq.a(jSONObject2.getString("showBarrageTime"))) {
                        this.mShowBarrageTime = Integer.parseInt(jSONObject2.getString("showBarrageTime"));
                    }
                }
                this.handler.sendEmptyMessage(0);
            }
        }
    }

    public void setAnimateView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0ed07", new Object[]{this, view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", jw0.b(getContext(), 24.0f), 0.0f);
        ofFloat.setDuration(500L);
        ofFloat.addListener(new a());
        ofFloat.start();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, "alpha", childAt.getAlpha(), childAt.getAlpha() - 0.5f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt, "translationY", getTranslationY() + jw0.b(getContext(), 24.0f), getTranslationY());
                ofFloat2.setDuration(500L);
                ofFloat3.setDuration(500L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat2, ofFloat3);
                animatorSet.start();
            }
        }
    }
}
