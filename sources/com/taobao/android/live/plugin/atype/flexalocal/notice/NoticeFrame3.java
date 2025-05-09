package com.taobao.android.live.plugin.atype.flexalocal.notice;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.room.ui.view.MarqueeTextView;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.ccc;
import tb.cpr;
import tb.e9m;
import tb.fkx;
import tb.hw0;
import tb.jyw;
import tb.k0r;
import tb.q0h;
import tb.qtq;
import tb.qvs;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class NoticeFrame3 extends BaseFrame implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MSG_HIDE_NOTICE = 1000;
    private static final String TAG = "NoticeFrame3";
    private MarqueeTextView mNoticeContent;
    private final jyw mHandler = new jyw(this);
    private final Queue<String> mNoticeQueue = new ConcurrentLinkedQueue();
    private final View.OnLayoutChangeListener mOnLayoutChangeListener = new a();
    private final cpr.b mMessageListener = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            int i9 = i3 - i;
            if (i9 > i7 - i5) {
                NoticeFrame3.access$000(NoticeFrame3.this).setParentWidth(i9 - hw0.b(NoticeFrame3.this.mContext, 38.0f));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements cpr.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.gtc
        public void onMessageReceived(int i, Object obj) {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                return;
            }
            ux9 ux9Var = NoticeFrame3.this.mFrameContext;
            if (ux9Var != null && ux9Var.c()) {
                q0h.a(NoticeFrame3.TAG, "live home mix, not notice");
            } else if (i == 1023) {
                if (obj != null) {
                    try {
                        JSONObject d = fkx.d(new String(((TLiveMsg) obj).data));
                        if (d != null) {
                            NoticeFrame3.access$100(NoticeFrame3.this, d.getString("notice"));
                        }
                    } catch (Exception unused) {
                        q0h.a(NoticeFrame3.TAG, "parser notice error");
                    }
                }
            } else if (i == 1004 && (view = NoticeFrame3.this.mContainer) != null) {
                view.setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            NoticeFrame3.access$200(NoticeFrame3.this).removeMessages(1000);
            NoticeFrame3.access$200(NoticeFrame3.this).sendEmptyMessage(1000);
            NoticeFrame3.access$000(NoticeFrame3.this).stopScroll();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(NoticeFrame3 noticeFrame3) {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/notice/NoticeFrame3$4");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1023 || i == 1004) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            NoticeFrame3.access$300(NoticeFrame3.this).poll();
            NoticeFrame3.access$400(NoticeFrame3.this);
            if (qvs.O()) {
                ADaemon.resumeFrameLock(5);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                NoticeFrame3.access$500(NoticeFrame3.this);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements MarqueeTextView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.taobao.taolive.room.ui.view.MarqueeTextView.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2ce223", new Object[]{this});
            } else if (NoticeFrame3.access$200(NoticeFrame3.this) != null) {
                NoticeFrame3.access$200(NoticeFrame3.this).removeMessages(1000);
                NoticeFrame3.access$200(NoticeFrame3.this).sendEmptyMessageDelayed(1000, 0L);
            }
        }
    }

    static {
        t2o.a(295699530);
        t2o.a(806356161);
    }

    public NoticeFrame3(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ MarqueeTextView access$000(NoticeFrame3 noticeFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MarqueeTextView) ipChange.ipc$dispatch("90e2ba0d", new Object[]{noticeFrame3});
        }
        return noticeFrame3.mNoticeContent;
    }

    public static /* synthetic */ void access$100(NoticeFrame3 noticeFrame3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566f398a", new Object[]{noticeFrame3, str});
        } else {
            noticeFrame3.handleNotice(str);
        }
    }

    public static /* synthetic */ jyw access$200(NoticeFrame3 noticeFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyw) ipChange.ipc$dispatch("578dd423", new Object[]{noticeFrame3});
        }
        return noticeFrame3.mHandler;
    }

    public static /* synthetic */ Queue access$300(NoticeFrame3 noticeFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("9a17961e", new Object[]{noticeFrame3});
        }
        return noticeFrame3.mNoticeQueue;
    }

    public static /* synthetic */ void access$400(NoticeFrame3 noticeFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82807dd", new Object[]{noticeFrame3});
        } else {
            noticeFrame3.showNextNoticeOrHide();
        }
    }

    public static /* synthetic */ void access$500(NoticeFrame3 noticeFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f353c", new Object[]{noticeFrame3});
        } else {
            noticeFrame3.startMarquee();
        }
    }

    private void handleNotice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d3d5b1", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.mNoticeQueue.isEmpty()) {
                this.mNoticeQueue.add(str);
                showNotice();
                return;
            }
            this.mNoticeQueue.add(str);
        }
    }

    private void hideNotice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808e7e41", new Object[]{this});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, -1.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        this.mContainer.clearAnimation();
        this.mContainer.setAnimation(translateAnimation);
        translateAnimation.setAnimationListener(new e());
        translateAnimation.start();
    }

    public static /* synthetic */ Object ipc$super(NoticeFrame3 noticeFrame3, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/notice/NoticeFrame3");
        }
    }

    private void showNextNoticeOrHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c0cc74", new Object[]{this});
        } else if (!this.mNoticeQueue.isEmpty()) {
            showNotice();
        } else {
            this.mContainer.setVisibility(8);
        }
    }

    private void showNotice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1349ce3c", new Object[]{this});
            return;
        }
        stopMarquee();
        this.mNoticeContent.setText(this.mNoticeQueue.peek());
        TranslateAnimation translateAnimation = new TranslateAnimation(1, -1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        this.mContainer.clearAnimation();
        this.mContainer.setAnimation(translateAnimation);
        this.mContainer.setVisibility(0);
        if (qvs.O()) {
            ADaemon.pauseFrameLock(5);
        }
        translateAnimation.start();
        translateAnimation.setAnimationListener(new f());
    }

    private void startMarquee() {
        jyw jywVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c873de7", new Object[]{this});
        } else if (this.mNoticeContent.outOfBounds() || (jywVar = this.mHandler) == null) {
            this.mNoticeContent.setMarqueeRepeatLimit(k0r.V());
            this.mNoticeContent.startScroll();
            this.mNoticeContent.setOnMarqueeCompleteListener(new g());
        } else {
            jywVar.removeMessages(1000);
            this.mHandler.sendEmptyMessageDelayed(1000, k0r.W() * 1000);
        }
    }

    private void stopMarquee() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974b7647", new Object[]{this});
            return;
        }
        jyw jywVar = this.mHandler;
        if (jywVar != null) {
            jywVar.removeMessages(1000);
        }
        this.mNoticeContent.stopScroll();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_frame_notice3_flexalocal;
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what == 1000) {
            hideNotice();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        View view = this.mContainer;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null) {
            ux9Var.c0(false);
            this.mFrameContext.t().a(this.mMessageListener);
        }
        MarqueeTextView marqueeTextView = this.mNoticeContent;
        if (marqueeTextView != null) {
            marqueeTextView.clearAnimation();
            this.mNoticeContent.stopScroll();
        }
        jyw jywVar = this.mHandler;
        if (jywVar != null) {
            jywVar.removeCallbacksAndMessages(null);
        }
        this.mNoticeQueue.clear();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mContainer.setVisibility(8);
        this.mContainer.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        this.mFrameContext.t().l(this.mMessageListener, new d(this));
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        NewStyleUtils.d(this.mContext, this.mContainer, NewStyleUtils.NewStyleType.SMALL);
        this.mNoticeContent = (MarqueeTextView) view.findViewById(R.id.taolive_notice_content);
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.taolive_notice_icon);
        TUrlImageView tUrlImageView2 = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_notice_close);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01A41kqq1Hg2KuMDHKE_!!6000000000786-2-tps-56-56.png");
        qtq.d(this.mContext, tUrlImageView, hw0.b(this.mContext, 14.0f));
        tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01SxF4l51PMMF9vzxWi_!!6000000001826-2-tps-40-40.png");
        qtq.d(this.mContext, tUrlImageView2, hw0.b(this.mContext, 10.0f));
        tUrlImageView2.setOnClickListener(new c());
        FlexaLiveX.w("NoticeFrame3: class: " + getClass().getName() + ", pluginEnv: " + e9m.b());
    }
}
