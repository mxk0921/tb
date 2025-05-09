package com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.highlightcomment.SwitchData;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.highlightcomment.TLHighLightCommentSwitch;
import com.taobao.android.live.plugin.atype.flexalocal.input.view.MultiSlidingTabStripAType;
import com.taobao.android.live.plugin.atype.flexalocal.input.view.PasteEditText;
import com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.InputPanelFrameKMP;
import com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.adapter.EmojiPanelPagerAdapter;
import com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.adapter.QuickExpressionAdapter;
import com.taobao.aranger.constant.Constants;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiIconItem;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiTabItem;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiViewModel;
import com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.a1u;
import tb.c84;
import tb.d9m;
import tb.g44;
import tb.g5h;
import tb.giv;
import tb.hjr;
import tb.hw0;
import tb.k0r;
import tb.k2c;
import tb.kaf;
import tb.kjy;
import tb.lly;
import tb.m09;
import tb.nh4;
import tb.niy;
import tb.o34;
import tb.o3s;
import tb.qjy;
import tb.rfc;
import tb.s3c;
import tb.s4g;
import tb.sjr;
import tb.t2o;
import tb.t54;
import tb.tmg;
import tb.to8;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.vc;
import tb.z9u;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InputPanelFrameKMP extends BaseFrame implements rfc, s3c, k2c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "sxr=> InputPanelFrameKMP";
    private String mCallbackType;
    private TUrlImageView mDeleteBtn;
    private View mEditBar;
    private View mEditSend;
    private PasteEditText mEditText;
    private ITaoLiveKtEmojiManager mEmojiManager;
    private TaoLiveKtEmojiViewModel mEmojiViewModel;
    private String mInputType;
    private boolean mIsHaveQuickExpression;
    private long mLastSendTime;
    private EmojiPanelPagerAdapter mPagerAdapter;
    private List<ExpressionPanelRecyclerView> mPanelRecyclerViewList;
    private QuickExpressionAdapter mQuickExpressionAdapter;
    private FrameLayout mQuickFrameLayout;
    private RecyclerView mQuickRecyclerView;
    private String mRepliedCommentId;
    private String mRepliedCommentNick;
    private FrameLayout mStickerLayout;
    public TUrlImageView mTVSwitch;
    private List<TaoLiveKtEmojiTabItem> mTabItemList;
    private MultiSlidingTabStripAType mTabLayout;
    private TLHighLightCommentSwitch mTlHighLightCommentSwitch;
    private int mUnEnableDeleteLimit;
    private ViewPager mViewPager;
    private ViewStub parent;
    private String mCommentType = "normal";
    private boolean mIsHighLightComment = false;
    private int mKeyboardHeight = 0;
    private int mCurrentPos = 0;
    private Handler mHandler = new Handler();
    private int mLimitCnt = k0r.I();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f8570a;

        public a(JSONObject jSONObject) {
            this.f8570a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            o3s.b(InputPanelFrameKMP.TAG, "onDataReceived: show gift animation");
            sjr.g().e(uyg.EVENT_SEND_GIFT, JSON.toJSONString(this.f8570a));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f8571a;

        public b(boolean z) {
            this.f8571a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (!this.f8571a && InputPanelFrameKMP.access$400(InputPanelFrameKMP.this) != null) {
                InputPanelFrameKMP.access$400(InputPanelFrameKMP.this).setVisibility(8);
                o3s.b(InputPanelFrameKMP.TAG, "mEditSend animation end visibility gone");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8572a;

        public c(String str) {
            this.f8572a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            InputPanelFrameKMP.access$1600(InputPanelFrameKMP.this, null);
            InputPanelFrameKMP.access$1700(InputPanelFrameKMP.this, this.f8572a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (InputPanelFrameKMP.access$600(InputPanelFrameKMP.this).getVisibility() == 0) {
                InputPanelFrameKMP.access$700(InputPanelFrameKMP.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements View.OnKeyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
            }
            if (keyEvent.getKeyCode() == 67 && InputPanelFrameKMP.access$000(InputPanelFrameKMP.this).getText().length() == InputPanelFrameKMP.access$800(InputPanelFrameKMP.this)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (InputPanelFrameKMP.access$000(InputPanelFrameKMP.this).getText() != null) {
                InputPanelFrameKMP inputPanelFrameKMP = InputPanelFrameKMP.this;
                InputPanelFrameKMP.access$100(inputPanelFrameKMP, InputPanelFrameKMP.access$000(inputPanelFrameKMP).getText().toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                InputPanelFrameKMP.access$000(InputPanelFrameKMP.this).dispatchKeyEvent(new KeyEvent(0, 67));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            InputPanelFrameKMP.access$900(InputPanelFrameKMP.this);
            o3s.b(InputPanelFrameKMP.TAG, "view onclick hideKeyBoard");
            InputPanelFrameKMP.this.hideKeyBoard();
            InputPanelFrameKMP.access$1000(InputPanelFrameKMP.this);
            ux9 ux9Var = InputPanelFrameKMP.this.mFrameContext;
            if (ux9Var != null && ux9Var.j() != null && InputPanelFrameKMP.this.mFrameContext.j().d()) {
                InputPanelFrameKMP.this.mFrameContext.h().c(uyg.d, "assembly", InputPanelFrameKMP.this.mFrameContext.C());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                InputPanelFrameKMP.access$700(InputPanelFrameKMP.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f8580a;
        public final /* synthetic */ int b;
        public final /* synthetic */ View c;

        public k(View view, int i, View view2) {
            this.f8580a = view;
            this.b = i;
            this.c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Rect rect = new Rect();
            this.f8580a.getHitRect(rect);
            int i = rect.left;
            int i2 = this.b;
            rect.left = i - i2;
            rect.top -= i2;
            rect.right += i2;
            rect.bottom += i2;
            this.c.setTouchDelegate(new TouchDelegate(rect, this.f8580a));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class l implements niy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kjy f8581a;
        public final /* synthetic */ WeakReference b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements TLHighLightCommentSwitch.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SwitchData f8582a;

            public a(SwitchData switchData) {
                this.f8582a = switchData;
            }

            @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.highlightcomment.TLHighLightCommentSwitch.b
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fffaadc7", new Object[]{this});
                    return;
                }
                if (InputPanelFrameKMP.access$000(InputPanelFrameKMP.this) != null) {
                    InputPanelFrameKMP.access$000(InputPanelFrameKMP.this).setHint(k0r.N());
                }
                InputPanelFrameKMP.access$1902(InputPanelFrameKMP.this, false);
            }

            @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.highlightcomment.TLHighLightCommentSwitch.b
            public void b() {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c6889175", new Object[]{this});
                } else if (InputPanelFrameKMP.access$000(InputPanelFrameKMP.this) != null) {
                    PasteEditText access$000 = InputPanelFrameKMP.access$000(InputPanelFrameKMP.this);
                    if (TextUtils.isEmpty(this.f8582a.shadingWord)) {
                        str = "今日还可以在最爱直播间发送N条醒目评论";
                    } else {
                        str = this.f8582a.shadingWord;
                    }
                    access$000.setHint(str);
                    InputPanelFrameKMP.access$1902(InputPanelFrameKMP.this, true);
                }
            }
        }

        public l(kjy kjyVar, WeakReference weakReference) {
            this.f8581a = kjyVar;
            this.b = weakReference;
        }

        @Override // tb.niy
        public void a(SwitchData switchData) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efd14f7", new Object[]{this, switchData});
            } else if (!this.f8581a.i(switchData) || this.b.get() == null) {
                InputPanelFrameKMP.access$1800(InputPanelFrameKMP.this).setVisibility(8);
            } else if (!InputPanelFrameKMP.this.isLandscape()) {
                InputPanelFrameKMP.access$1800(InputPanelFrameKMP.this).setVisibility(0);
                if ("FREQUENCY_LIMIT".equals(switchData.reasonType)) {
                    InputPanelFrameKMP.access$1800(InputPanelFrameKMP.this).setSwitchState(false);
                    a1u.a(InputPanelFrameKMP.this.mContext, switchData.reason);
                }
                HashMap hashMap = new HashMap();
                if (InputPanelFrameKMP.access$1800(InputPanelFrameKMP.this).isSwitchOn()) {
                    str = "opened";
                } else {
                    str = IDecisionResult.STATE_CLOSED;
                }
                hashMap.put("switch_status", str);
                hashMap.put("index", switchData.remainCommentCnt);
                qjy.e("ArrestComment_Switch", hashMap);
                InputPanelFrameKMP.access$1800(InputPanelFrameKMP.this).addSwitchStateChangeListener(new a(switchData));
            }
        }
    }

    static {
        t2o.a(295699452);
        t2o.a(295699416);
        t2o.a(806355016);
        t2o.a(295699451);
    }

    public InputPanelFrameKMP(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ PasteEditText access$000(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PasteEditText) ipChange.ipc$dispatch("557e470", new Object[]{inputPanelFrameKMP});
        }
        return inputPanelFrameKMP.mEditText;
    }

    public static /* synthetic */ void access$100(InputPanelFrameKMP inputPanelFrameKMP, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("368f07af", new Object[]{inputPanelFrameKMP, str});
        } else {
            inputPanelFrameKMP.onEditTextSend(str);
        }
    }

    public static /* synthetic */ void access$1000(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6fdf93", new Object[]{inputPanelFrameKMP});
        } else {
            inputPanelFrameKMP.resetInputStatus();
        }
    }

    public static /* synthetic */ int access$1100(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b377a487", new Object[]{inputPanelFrameKMP})).intValue();
        }
        return inputPanelFrameKMP.mCurrentPos;
    }

    public static /* synthetic */ int access$1102(InputPanelFrameKMP inputPanelFrameKMP, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80338ea0", new Object[]{inputPanelFrameKMP, new Integer(i2)})).intValue();
        }
        inputPanelFrameKMP.mCurrentPos = i2;
        return i2;
    }

    public static /* synthetic */ EmojiPanelPagerAdapter access$1200(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmojiPanelPagerAdapter) ipChange.ipc$dispatch("b01db7bf", new Object[]{inputPanelFrameKMP});
        }
        return inputPanelFrameKMP.mPagerAdapter;
    }

    public static /* synthetic */ List access$1300(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7d74e4f1", new Object[]{inputPanelFrameKMP});
        }
        return inputPanelFrameKMP.mTabItemList;
    }

    public static /* synthetic */ void access$1400(InputPanelFrameKMP inputPanelFrameKMP, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("634ff24c", new Object[]{inputPanelFrameKMP, new Integer(i2)});
        } else {
            inputPanelFrameKMP.refreshCurrentPage(i2);
        }
    }

    public static /* synthetic */ void access$1500(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5796b898", new Object[]{inputPanelFrameKMP});
        } else {
            inputPanelFrameKMP.trackTabChange();
        }
    }

    public static /* synthetic */ void access$1600(InputPanelFrameKMP inputPanelFrameKMP, lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba1f5f8", new Object[]{inputPanelFrameKMP, llyVar});
        } else {
            inputPanelFrameKMP.showKeyBoard(llyVar);
        }
    }

    public static /* synthetic */ void access$1700(InputPanelFrameKMP inputPanelFrameKMP, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749db9e4", new Object[]{inputPanelFrameKMP, str});
        } else {
            inputPanelFrameKMP.setTextString(str);
        }
    }

    public static /* synthetic */ TLHighLightCommentSwitch access$1800(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TLHighLightCommentSwitch) ipChange.ipc$dispatch("823f70d7", new Object[]{inputPanelFrameKMP});
        }
        return inputPanelFrameKMP.mTlHighLightCommentSwitch;
    }

    public static /* synthetic */ boolean access$1902(InputPanelFrameKMP inputPanelFrameKMP, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fbaa77a", new Object[]{inputPanelFrameKMP, new Boolean(z)})).booleanValue();
        }
        inputPanelFrameKMP.mIsHighLightComment = z;
        return z;
    }

    public static /* synthetic */ void access$200(InputPanelFrameKMP inputPanelFrameKMP, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ac2356e", new Object[]{inputPanelFrameKMP, new Boolean(z)});
        } else {
            inputPanelFrameKMP.startEditSendAnim(z);
        }
    }

    public static /* synthetic */ TUrlImageView access$300(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("212a6175", new Object[]{inputPanelFrameKMP});
        }
        return inputPanelFrameKMP.mDeleteBtn;
    }

    public static /* synthetic */ View access$400(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1cc92a6a", new Object[]{inputPanelFrameKMP});
        }
        return inputPanelFrameKMP.mEditSend;
    }

    public static /* synthetic */ int access$500(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a32e111c", new Object[]{inputPanelFrameKMP})).intValue();
        }
        return inputPanelFrameKMP.mLimitCnt;
    }

    public static /* synthetic */ FrameLayout access$600(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("497a86f", new Object[]{inputPanelFrameKMP});
        }
        return inputPanelFrameKMP.mStickerLayout;
    }

    public static /* synthetic */ void access$700(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("753d9b2b", new Object[]{inputPanelFrameKMP});
        } else {
            inputPanelFrameKMP.switchSticker();
        }
    }

    public static /* synthetic */ int access$800(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e45601f", new Object[]{inputPanelFrameKMP})).intValue();
        }
        return inputPanelFrameKMP.mUnEnableDeleteLimit;
    }

    public static /* synthetic */ void access$900(InputPanelFrameKMP inputPanelFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474d252d", new Object[]{inputPanelFrameKMP});
        } else {
            inputPanelFrameKMP.hideContentViewInner();
        }
    }

    private void beforeSendComment(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695ddf1c", new Object[]{this, str, map});
        } else if ("H5".equals(this.mCallbackType)) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            WVStandardEventCenter.postNotificationToJS("TBLiveWVPlugin.Event.comment.input", JSON.toJSONString(hashMap));
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(to8.COMMENT, str);
            hashMap2.put("commentType", "input");
            ux9 ux9Var = this.mFrameContext;
            if ((ux9Var instanceof t54) && ((t54) ux9Var).z0() != null) {
                ((t54) this.mFrameContext).z0().v("TBLiveWVPlugin.Event.sendComment", hashMap2);
            }
            g5h f2 = giv.f();
            ux9 ux9Var2 = this.mFrameContext;
            f2.s(ux9Var2, to8.COMMENT, "content=" + str);
            if (isPasteText()) {
                this.mCommentType = "paste";
            }
            kaf.a(this.mFrameContext, str, kaf.b(str, this.mEmojiManager), this.mIsHighLightComment, this.mCommentType, map, "commentType=0");
            this.mCommentType = "normal";
        }
    }

    private boolean checkInput(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9495cb7", new Object[]{this, str})).booleanValue();
        }
        if (!v2s.o().u().checkSessionValid()) {
            v2s.o().u().a((Activity) this.mContext, null);
            return false;
        } else if (k0r.c()) {
            hw0.w(this.mContext.getApplicationContext(), this.mContext.getString(R.string.taolive_disable_publish_comment_flexalocal), 17);
            return false;
        } else if (TextUtils.isEmpty(str)) {
            Context context = this.mContext;
            hw0.w(context, context.getString(R.string.taolive_chat_none_flexalocal), 17);
            return false;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.mLastSendTime;
            if (j2 <= 0 || currentTimeMillis - j2 >= 3000) {
                return true;
            }
            Context context2 = this.mContext;
            hw0.w(context2, context2.getString(R.string.taolive_eleven_chat_too_fast_flexalocal), 17);
            return false;
        }
    }

    public static void expendTouchArea(View view, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67cf5e6", new Object[]{view, new Integer(i2)});
        } else if (view != null) {
            View view2 = (View) view.getParent();
            view2.post(new k(view, i2, view2));
        }
    }

    private HashMap<String, String> genMessageV2BusinessRender(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("376207d8", new Object[]{this, map});
        }
        HashMap<String, String> hashMap = new HashMap<>(m09.e().f());
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(this.mRepliedCommentId)) {
            hashMap.put("userReply2UserCommentId", this.mRepliedCommentId);
        }
        if (!TextUtils.isEmpty(this.mCommentType)) {
            if (TextUtils.equals(this.mCommentType, Constants.PARAM_REPLY) || TextUtils.equals(this.mCommentType, "convenient")) {
                hashMap.put("commentType", this.mCommentType);
            } else if (isPasteText()) {
                hashMap.put("commentType", "paste");
            } else {
                hashMap.put("commentType", "normal");
            }
            if (map != null && "addOne".equals(map.get("commentType"))) {
                hashMap.put("commentType", "addOne");
            }
            if (map != null && map.containsKey("comment_location")) {
                hashMap.put("comment_location", map.get("comment_location"));
            }
            if (map != null && "interactActivity".equals(map.get("comment_type"))) {
                hashMap.remove("comment_type");
                hashMap.put("commentType", "interactActivity");
            }
        }
        return hashMap;
    }

    private TaoLiveKtEmojiIconItem getLargeSticker(String str) {
        TaoLiveKtEmojiIconItem matchedEmoji;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtEmojiIconItem) ipChange.ipc$dispatch("ffb60bcb", new Object[]{this, str});
        }
        int i2 = -1;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if ('[' == charAt) {
                i2 = i3;
            } else if (']' == charAt && i2 >= 0) {
                String substring = str.substring(i2, i3 + 1);
                ITaoLiveKtEmojiManager iTaoLiveKtEmojiManager = this.mEmojiManager;
                if (!(iTaoLiveKtEmojiManager == null || (matchedEmoji = iTaoLiveKtEmojiManager.matchedEmoji(substring)) == null || !matchedEmoji.getLargeType())) {
                    return matchedEmoji;
                }
            }
        }
        return null;
    }

    private void handleAutoInputText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eddea67", new Object[]{this});
            return;
        }
        Map<String, String> D = this.mFrameContext.D();
        if (D != null && !D.isEmpty() && D.containsKey("autoInputText")) {
            String str = D.get("autoInputText");
            if (!TextUtils.isEmpty(str)) {
                this.mHandler.postDelayed(new c(str), 200L);
            }
        }
    }

    private void handleCommentSend(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e79b2a2", new Object[]{this, obj});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            realSendComment(jSONObject.getString("content"), (Map) jSONObject.get("extendVal"));
        }
    }

    private void handlePanelHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f31da5", new Object[]{this});
            return;
        }
        hideContentViewInner();
        hideKeyBoard();
    }

    private void handlePanelShow(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0efdbc", new Object[]{this, obj});
            return;
        }
        lly llyVar = null;
        if (c84.c(this.mLiveDataModel)) {
            a1u.a(this.mContext, "主播已关闭评论功能");
            giv.f().o(this.mFrameContext, 19999, "commentDisabled", null);
            return;
        }
        PasteEditText pasteEditText = this.mEditText;
        if (pasteEditText != null) {
            pasteEditText.setHint(k0r.N());
        }
        parseInputShowObj(obj);
        o3s.b(TAG, "handlePanelShow showKeyBoard");
        if (obj instanceof Map) {
            Object obj2 = ((Map) obj).get("callBack");
            if (obj2 instanceof lly) {
                llyVar = (lly) obj2;
            }
        }
        if (qjy.a()) {
            updateHighLightCommentDisplay();
        }
        showKeyBoard(llyVar);
        refreshQuickEmoji();
    }

    private void hideContentViewInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ed6b21", new Object[]{this});
            return;
        }
        if (getComponentView() != null) {
            getComponentView().setVisibility(4);
            if (!this.mFrameContext.j().t()) {
                this.mFrameContext.h().c("com.taobao.taolive.room.enable_updown_switch", null, this.mFrameContext.C());
            }
        }
        FrameLayout frameLayout = this.mStickerLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        TUrlImageView tUrlImageView = this.mTVSwitch;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01Yssk7o1CLobjwvbKO_!!6000000000065-2-tps-72-72.png");
        }
    }

    private void initOnRequired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d766955", new Object[]{this});
        } else if (this.parent.getParent() != null) {
            this.parent.setLayoutResource(getLayoutResId());
            View inflate = this.parent.inflate();
            this.mContainer = inflate;
            onViewCreated(inflate);
        }
    }

    private void initQuickView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec27fba9", new Object[]{this, view});
            return;
        }
        this.mQuickFrameLayout = (FrameLayout) view.findViewById(R.id.taolive_input_quick_expression_fl);
        this.mQuickRecyclerView = (RecyclerView) view.findViewById(R.id.taolive_input_quick_expression);
        this.mQuickExpressionAdapter = new QuickExpressionAdapter(this.mContext, this.mFrameContext, this);
        this.mQuickRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        this.mQuickRecyclerView.setAdapter(this.mQuickExpressionAdapter);
        this.mQuickRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.InputPanelFrameKMP.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass11 r3, String str, Object... objArr) {
                if (str.hashCode() == -2066002230) {
                    super.getItemOffsets((Rect) objArr[0], (View) objArr[1], (RecyclerView) objArr[2], (RecyclerView.State) objArr[3]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/inputPanelKMP/InputPanelFrameKMP$11");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("84db4eca", new Object[]{this, rect, view2, recyclerView, state});
                    return;
                }
                super.getItemOffsets(rect, view2, recyclerView, state);
                if (recyclerView.getChildAdapterPosition(view2) == 0) {
                    rect.left = hw0.b(InputPanelFrameKMP.this.mContext, 14.0f);
                }
                rect.right = hw0.b(InputPanelFrameKMP.this.mContext, 22.0f);
            }
        });
    }

    private void initViewPager() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77226e75", new Object[]{this});
            return;
        }
        this.mTabLayout = (MultiSlidingTabStripAType) this.mContainer.findViewById(R.id.taolive_emoji_tab);
        this.mViewPager = (ViewPager) this.mContainer.findViewById(R.id.taolive_emoji_viewpager);
        if (this.mTabItemList != null) {
            if (this.mPanelRecyclerViewList == null) {
                this.mPanelRecyclerViewList = new ArrayList();
            }
            this.mPanelRecyclerViewList.clear();
            for (int i2 = 0; i2 < this.mTabItemList.size(); i2++) {
                ExpressionPanelRecyclerView expressionPanelRecyclerView = new ExpressionPanelRecyclerView(this.mContext, this.mFrameContext, this);
                expressionPanelRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
                this.mPanelRecyclerViewList.add(expressionPanelRecyclerView);
            }
            EmojiPanelPagerAdapter emojiPanelPagerAdapter = new EmojiPanelPagerAdapter(this.mContext);
            this.mPagerAdapter = emojiPanelPagerAdapter;
            emojiPanelPagerAdapter.i(this.mPanelRecyclerViewList);
            this.mTabLayout.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.InputPanelFrameKMP.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass13 r2, String str, Object... objArr) {
                    if (str.hashCode() == 407727923) {
                        super.onPageSelected(((Number) objArr[0]).intValue());
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/inputPanelKMP/InputPanelFrameKMP$13");
                }

                @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i3) {
                    boolean z2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i3)});
                        return;
                    }
                    super.onPageSelected(i3);
                    InputPanelFrameKMP.access$1102(InputPanelFrameKMP.this, i3);
                    for (int i4 = 0; i4 < InputPanelFrameKMP.access$1200(InputPanelFrameKMP.this).getCount(); i4++) {
                        TUrlImageView tUrlImageView = (TUrlImageView) InputPanelFrameKMP.access$1200(InputPanelFrameKMP.this).b(i4).findViewById(R.id.taolive_expression_tab_image);
                        if (InputPanelFrameKMP.access$1300(InputPanelFrameKMP.this) != null) {
                            TaoLiveKtEmojiTabItem taoLiveKtEmojiTabItem = (TaoLiveKtEmojiTabItem) InputPanelFrameKMP.access$1300(InputPanelFrameKMP.this).get(i4);
                            View b2 = InputPanelFrameKMP.access$1200(InputPanelFrameKMP.this).b(i4);
                            if (i4 == i3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            b2.setSelected(z2);
                            if (i4 == i3) {
                                tUrlImageView.setImageUrl(taoLiveKtEmojiTabItem.getTabIcon());
                            } else {
                                tUrlImageView.setImageUrl(taoLiveKtEmojiTabItem.getUnTabIcon());
                            }
                        }
                    }
                    InputPanelFrameKMP inputPanelFrameKMP = InputPanelFrameKMP.this;
                    InputPanelFrameKMP.access$1400(inputPanelFrameKMP, InputPanelFrameKMP.access$1100(inputPanelFrameKMP));
                    InputPanelFrameKMP.access$1500(InputPanelFrameKMP.this);
                }
            });
            this.mViewPager.setAdapter(this.mPagerAdapter);
            this.mTabLayout.setViewPager(this.mViewPager);
            this.mViewPager.setCurrentItem(0);
            this.mPagerAdapter.b(0).setSelected(true);
            for (int i3 = 0; i3 < this.mPagerAdapter.getCount(); i3++) {
                TUrlImageView tUrlImageView = (TUrlImageView) this.mPagerAdapter.b(i3).findViewById(R.id.taolive_expression_tab_image);
                TaoLiveKtEmojiTabItem taoLiveKtEmojiTabItem = this.mTabItemList.get(i3);
                View b2 = this.mPagerAdapter.b(i3);
                if (i3 == this.mCurrentPos) {
                    z = true;
                } else {
                    z = false;
                }
                b2.setSelected(z);
                if (i3 == this.mCurrentPos) {
                    tUrlImageView.setImageUrl(taoLiveKtEmojiTabItem.getTabIcon());
                } else {
                    tUrlImageView.setImageUrl(taoLiveKtEmojiTabItem.getUnTabIcon());
                }
            }
            for (int i4 = 0; i4 < this.mPanelRecyclerViewList.size(); i4++) {
                refreshCurrentPage(i4);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(InputPanelFrameKMP inputPanelFrameKMP, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/inputPanelKMP/InputPanelFrameKMP");
        }
    }

    private boolean isPasteText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fdb01e1", new Object[]{this})).booleanValue();
        }
        PasteEditText pasteEditText = this.mEditText;
        if (pasteEditText == null || TextUtils.isEmpty(pasteEditText.getRecentlyPasteText()) || !TextUtils.equals(this.mEditText.getRecentlyPasteText(), this.mEditText.getText().toString())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startEditSendAnim$40(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93800ab5", new Object[]{this, valueAnimator});
            return;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mEditSend.getLayoutParams();
        layoutParams.width = intValue;
        this.mEditSend.setLayoutParams(layoutParams);
    }

    private void onDataReceivedReally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e01d7c", new Object[]{this});
        } else if (d9m.f() != null) {
            ITaoLiveKtEmojiManager emojiManager = d9m.f().getEmojiManager();
            this.mEmojiManager = emojiManager;
            if (emojiManager != null) {
                this.mEditText.setEmojiManager(emojiManager);
                this.mEditText.setFrameContext(this.mFrameContext);
                TaoLiveKtEmojiViewModel emojiViewModel = this.mEmojiManager.getEmojiViewModel();
                this.mEmojiViewModel = emojiViewModel;
                this.mTabItemList = emojiViewModel.getTabInfoList();
                initViewPager();
                handleAutoInputText();
            }
        }
    }

    private void parseInputShowObj(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5408446", new Object[]{this, obj});
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            String str = (String) map.get("content");
            if (!TextUtils.isEmpty(str)) {
                setTextString(str);
            } else {
                setTextString("");
            }
            String str2 = (String) map.get("inputhint");
            if (!TextUtils.isEmpty(str2)) {
                this.mEditText.setHint(str2);
            }
            String str3 = (String) map.get("limitcnt");
            if (!TextUtils.isEmpty(str3)) {
                this.mLimitCnt = zqq.j(str3);
            }
            String str4 = (String) map.get("inputtype");
            if (!TextUtils.isEmpty(str4)) {
                this.mInputType = str4;
            }
            this.mRepliedCommentId = (String) map.get("replied_comment_id");
            this.mRepliedCommentNick = (String) map.get("replied_comment_nick");
            if (!TextUtils.isEmpty(this.mRepliedCommentId) && !TextUtils.isEmpty(this.mRepliedCommentNick)) {
                String str5 = "@" + this.mRepliedCommentNick + " ";
                this.mEditText.setText(str5);
                this.mEditText.setSelection(str5.length());
                this.mUnEnableDeleteLimit = str5.length();
                if (!TextUtils.equals(this.mCommentType, "convenient")) {
                    this.mCommentType = Constants.PARAM_REPLY;
                }
            } else if (!TextUtils.equals(this.mCommentType, "convenient")) {
                this.mCommentType = "normal";
            }
            this.mCallbackType = (String) map.get("callbackType");
        }
    }

    private void realSendComment(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e69f3b", new Object[]{this, str, map});
            return;
        }
        beforeSendComment(str, map);
        o3s.b(hjr.KMPTag, "input frame kmp send");
        new g44(this.mContext, this.mFrameContext).f(str, genMessageV2BusinessRender(map));
        if (nh4.w()) {
            try {
                showCommentKeywordAtmosphere(str);
            } catch (Throwable th) {
                o3s.b(TAG, "showCommentKeywordAtmosphere: show exception msg=" + th.getMessage());
            }
        }
    }

    private void refreshCurrentPage(int i2) {
        ITaoLiveKtEmojiManager iTaoLiveKtEmojiManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21e99af", new Object[]{this, new Integer(i2)});
            return;
        }
        if (i2 == 0 && (iTaoLiveKtEmojiManager = this.mEmojiManager) != null) {
            iTaoLiveKtEmojiManager.prepareRecentNormalSection();
        }
        List<TaoLiveKtEmojiTabItem> list = this.mTabItemList;
        if (list != null) {
            TaoLiveKtEmojiTabItem taoLiveKtEmojiTabItem = list.get(i2);
            List<ExpressionPanelRecyclerView> list2 = this.mPanelRecyclerViewList;
            if (list2 != null && list2.get(i2) != null) {
                this.mPanelRecyclerViewList.get(i2).refreshData(taoLiveKtEmojiTabItem);
            }
        }
    }

    private void refreshQuickEmoji() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e728a1b", new Object[]{this});
        } else if (!vc.a() || vc.j(this.mContext) || !isLandscape()) {
            int i2 = this.mKeyboardHeight;
            if (i2 > 0) {
                setStickerHeight(i2);
            }
            ViewPager viewPager = this.mViewPager;
            if (viewPager != null) {
                viewPager.setCurrentItem(0);
            }
            ITaoLiveKtEmojiManager iTaoLiveKtEmojiManager = this.mEmojiManager;
            if (iTaoLiveKtEmojiManager != null) {
                iTaoLiveKtEmojiManager.prepareRecentUsedEmojis();
                QuickExpressionAdapter quickExpressionAdapter = this.mQuickExpressionAdapter;
                if (quickExpressionAdapter != null) {
                    quickExpressionAdapter.N(this.mEmojiManager.getEmojiViewModel().getRecentList(), this.mQuickFrameLayout);
                }
            }
            if (this.mQuickFrameLayout.getVisibility() == 0) {
                z = true;
            }
            this.mIsHaveQuickExpression = z;
        } else {
            this.mQuickFrameLayout.setVisibility(8);
        }
    }

    private void resetInputStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2879fd94", new Object[]{this});
            return;
        }
        PasteEditText pasteEditText = this.mEditText;
        if (pasteEditText != null) {
            pasteEditText.resetPasteText();
        }
        if (this.mEditText != null && !TextUtils.isEmpty(this.mRepliedCommentId) && !TextUtils.isEmpty(this.mRepliedCommentNick)) {
            this.mEditText.setText("");
            this.mEditText.setSelection(0);
            this.mRepliedCommentId = null;
            this.mRepliedCommentNick = null;
            this.mUnEnableDeleteLimit = 0;
        }
    }

    private void setLayoutParamsAdaptiveLandScape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a0b1a", new Object[]{this});
        } else if (isLandscape()) {
            this.mStickerLayout.setPadding(hw0.b(this.mContext, 39.0f), 0, hw0.b(this.mContext, 30.0f), 0);
            this.mQuickFrameLayout.setPadding(hw0.b(this.mContext, 39.0f), 0, hw0.b(this.mContext, 30.0f), 0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mEditBar.getLayoutParams();
            layoutParams.leftMargin = hw0.b(this.mContext, 51.0f);
            layoutParams.rightMargin = hw0.b(this.mContext, 30.0f);
            this.mEditBar.setLayoutParams(layoutParams);
        }
    }

    private void setStickerHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db43d91a", new Object[]{this, new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mStickerLayout.getLayoutParams();
        layoutParams.height = i2;
        this.mStickerLayout.setLayoutParams(layoutParams);
    }

    private void setTextString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600a8431", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.mEditText.setText(str);
            this.mEditText.setSelection(str.length());
        }
    }

    private void startEditSendAnim(boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a1d6e8", new Object[]{this, new Boolean(z)});
            return;
        }
        int b2 = hw0.b(this.mContext, 54.0f);
        if (!z) {
            i2 = hw0.b(this.mContext, 54.0f);
            b2 = 0;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, b2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.iaf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                InputPanelFrameKMP.this.lambda$startEditSendAnim$40(valueAnimator);
            }
        });
        ofInt.addListener(new b(z));
        ofInt.setDuration(100L);
        ofInt.start();
    }

    private void trackExpressionItemClick(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d07817", new Object[]{this, taoLiveKtEmojiIconItem});
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.mCurrentPos == 0) {
            str = ChatInputConstant.PANEL_ID_EMOJI;
        } else {
            str = "longword";
        }
        hashMap.put("tab", str);
        hashMap.put("module_name", taoLiveKtEmojiIconItem.getType());
        hashMap.put("emoticon_id", taoLiveKtEmojiIconItem.getStickerId());
        giv.f().m(this.mFrameContext, "Comment_Emoticon", hashMap);
    }

    private void trackQuickExpressionClick(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace686f3", new Object[]{this, taoLiveKtEmojiIconItem});
            return;
        }
        HashMap hashMap = new HashMap();
        if (taoLiveKtEmojiIconItem.getLargeType()) {
            str = "longword";
        } else {
            str = ChatInputConstant.PANEL_ID_EMOJI;
        }
        hashMap.put("type", str);
        hashMap.put("emoticon_id", taoLiveKtEmojiIconItem.getStickerId());
        giv.f().m(this.mFrameContext, "Comment_EmoticonConvenient", hashMap);
    }

    private void trackSwitchClick() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5233070", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        FrameLayout frameLayout = this.mStickerLayout;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            str = "input";
        } else {
            str = "emoticon";
        }
        hashMap.put("name", str);
        giv.f().m(this.mFrameContext, "Comment_Switch_InputPanel", hashMap);
    }

    private void trackTabChange() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2191621", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.mCurrentPos == 0) {
            str = ChatInputConstant.PANEL_ID_EMOJI;
        } else {
            str = "longword";
        }
        hashMap.put("tab", str);
        giv.f().m(this.mFrameContext, "Comment_Switch_EmoticonTab", hashMap);
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "InputPanelFrameKMP";
    }

    @Override // tb.k2c
    public void clickEmoji(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem, Drawable drawable, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c104c3", new Object[]{this, taoLiveKtEmojiIconItem, drawable, str, new Boolean(z)});
            return;
        }
        String matchKey = taoLiveKtEmojiIconItem.getMatchKey();
        if (this.mEditText != null && !TextUtils.isEmpty(matchKey) && drawable != null && drawable.getConstantState() != null) {
            if (this.mEditText.getText().length() + matchKey.length() > this.mLimitCnt) {
                Context context = this.mContext;
                int i2 = R.string.taolive_chat_too_long_flexalocal;
                hw0.w(context, context.getString(i2, this.mLimitCnt + ""), 17);
                return;
            }
            Drawable newDrawable = drawable.getConstantState().newDrawable();
            SpannableString spannableString = new SpannableString(matchKey);
            int b2 = hw0.b(this.mContext, 14.0f);
            newDrawable.setBounds(0, 0, (newDrawable.getIntrinsicWidth() * b2) / newDrawable.getIntrinsicHeight(), b2);
            spannableString.setSpan(new o34(newDrawable), 0, matchKey.length(), 33);
            int selectionStart = this.mEditText.getSelectionStart();
            Editable text = this.mEditText.getText();
            if (text != null) {
                text.insert(selectionStart, spannableString);
            }
            ITaoLiveKtEmojiManager iTaoLiveKtEmojiManager = this.mEmojiManager;
            if (iTaoLiveKtEmojiManager != null) {
                iTaoLiveKtEmojiManager.addRecentUsedEmoji(taoLiveKtEmojiIconItem);
            }
            if (z) {
                trackQuickExpressionClick(taoLiveKtEmojiIconItem);
            } else {
                trackExpressionItemClick(taoLiveKtEmojiIconItem);
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public boolean createView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f881d80", new Object[]{this, viewStub})).booleanValue();
        }
        this.parent = viewStub;
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_frame_input_panel_kmp_flexalocal;
    }

    @Override // tb.rfc
    public void hideContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3262a3", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.mStickerLayout;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            hideContentViewInner();
        }
    }

    @Override // tb.rfc
    public void hideKeyBoard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60342b30", new Object[]{this});
            return;
        }
        o3s.b(TAG, "handlePanelHide hideKeyBoard");
        s4g.b(this.mEditText, null);
        this.mInputType = null;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean isVisibleWhenInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be5806fd", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_INPUT_SHOW, uyg.EVENT_INPUT_HIDE, uyg.EVENT_SEND_COMMENT};
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
        PasteEditText pasteEditText = this.mEditText;
        if (pasteEditText != null) {
            pasteEditText.setText((CharSequence) null);
        }
        if (this.mTabItemList != null) {
            this.mTabItemList = null;
        }
        EmojiPanelPagerAdapter emojiPanelPagerAdapter = this.mPagerAdapter;
        if (emojiPanelPagerAdapter != null) {
            emojiPanelPagerAdapter.h();
            this.mPagerAdapter = null;
        }
        List<ExpressionPanelRecyclerView> list = this.mPanelRecyclerViewList;
        if (list != null) {
            list.clear();
            this.mPanelRecyclerViewList = null;
        }
        this.mFrameContext.h().b(this);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mFrameContext.h().a(this);
        this.mFrameContext.z().c(uyg.INTERACTIVE_EVENT_BIZ_CENTER_NOTIFY, "SendComment", observeUniqueIdentification());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ITaoLiveKtEmojiManager iTaoLiveKtEmojiManager = this.mEmojiManager;
        if (iTaoLiveKtEmojiManager != null) {
            iTaoLiveKtEmojiManager.cacheRecentUsedEmojiIfNeeded();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r7.equals(tb.uyg.EVENT_INPUT_SHOW) == false) goto L_0x0023;
     */
    @Override // tb.s3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(java.lang.String r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.InputPanelFrameKMP.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "c3897928"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r3.ipc$dispatch(r4, r5)
            return
        L_0x0018:
            r7.hashCode()
            r3 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case -1588110712: goto L_0x0039;
                case 1595376247: goto L_0x002e;
                case 1595703346: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0043
        L_0x0025:
            java.lang.String r1 = "com.taobao.taolive.room.input_show"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0043
            goto L_0x0023
        L_0x002e:
            java.lang.String r0 = "com.taobao.taolive.room.input_hide"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0037
            goto L_0x0023
        L_0x0037:
            r0 = 1
            goto L_0x0043
        L_0x0039:
            java.lang.String r0 = "com.taobao.taolive.room.send_comment"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0042
            goto L_0x0023
        L_0x0042:
            r0 = 0
        L_0x0043:
            switch(r0) {
                case 0: goto L_0x0055;
                case 1: goto L_0x0051;
                case 2: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0058
        L_0x0047:
            r6.initOnRequired()
            r6.onDataReceivedReally()
            r6.handlePanelShow(r8)
            goto L_0x0058
        L_0x0051:
            r6.handlePanelHide()
            goto L_0x0058
        L_0x0055:
            r6.handleCommentSend(r8)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.InputPanelFrameKMP.onEvent(java.lang.String, java.lang.Object):void");
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.taolive_edit_bar);
        this.mEditBar = findViewById;
        ViewCompat.setElevation(findViewById, 1.0f);
        PasteEditText pasteEditText = (PasteEditText) view.findViewById(R.id.taolive_edit_text);
        this.mEditText = pasteEditText;
        pasteEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.InputPanelFrameKMP.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i2), keyEvent})).booleanValue();
                }
                if (keyEvent == null || keyEvent.getAction() == 0) {
                    InputPanelFrameKMP inputPanelFrameKMP = InputPanelFrameKMP.this;
                    InputPanelFrameKMP.access$100(inputPanelFrameKMP, InputPanelFrameKMP.access$000(inputPanelFrameKMP).getText().toString());
                }
                return true;
            }
        });
        this.mEditText.addTextChangedListener(new d());
        this.mEditText.setOnClickListener(new e());
        this.mEditText.setFilters(new InputFilter[]{new tmg(this.mLimitCnt)});
        this.mEditText.setOnKeyListener(new f());
        View findViewById2 = view.findViewById(R.id.taolive_edit_send);
        this.mEditSend = findViewById2;
        ViewProxy.setOnClickListener(findViewById2, new g());
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.taolive_edit_delete);
        this.mDeleteBtn = tUrlImageView;
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01BXKtVz1JVA06Rbtga_!!6000000001033-2-tps-72-72.png");
        this.mDeleteBtn.setOnClickListener(new h());
        ViewProxy.setOnClickListener(view, new i());
        this.mStickerLayout = (FrameLayout) view.findViewById(R.id.taolive_edit_sticker_layout);
        int i2 = this.mKeyboardHeight;
        if (i2 > 0) {
            setStickerHeight(i2);
        }
        TUrlImageView tUrlImageView2 = (TUrlImageView) view.findViewById(R.id.taolive_edit_switch);
        this.mTVSwitch = tUrlImageView2;
        tUrlImageView2.setOnClickListener(new j());
        this.mTVSwitch.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01Yssk7o1CLobjwvbKO_!!6000000000065-2-tps-72-72.png");
        initQuickView(view);
        setLayoutParamsAdaptiveLandScape();
        expendTouchArea(this.mTVSwitch, hw0.b(this.mContext, 10.0f));
        if (qjy.a()) {
            this.mTlHighLightCommentSwitch = (TLHighLightCommentSwitch) view.findViewById(R.id.tl_highlight_comment_switch);
        }
    }

    @Override // tb.rfc
    public void showContentView(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409a8c7b", new Object[]{this, new Integer(i2)});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.A() == null)) {
            this.mFrameContext.A().accessListener(AccessListenerEnum.onFloatViewShow, new Object[0]);
            if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString().equals(this.mFrameContext.A().bizCode) && vc.j(this.mContext)) {
                i2 -= hw0.b(this.mContext, 48.0f);
            }
        }
        if (i2 != this.mKeyboardHeight) {
            this.mKeyboardHeight = i2;
            if (this.mStickerLayout != null) {
                setStickerHeight(i2);
            }
        }
        if (getComponentView() != null) {
            getComponentView().setVisibility(0);
            getComponentView().bringToFront();
            this.mFrameContext.h().c("com.taobao.taolive.room.disable_updown_switch", "input", this.mFrameContext.C());
        }
    }

    public void updateHighLightCommentDisplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fd1995", new Object[]{this});
        } else if (qjy.a() && this.mTlHighLightCommentSwitch != null) {
            if (isLandscape()) {
                this.mTlHighLightCommentSwitch.setVisibility(8);
            }
            kjy e2 = kjy.e();
            WeakReference<View> weakReference = new WeakReference<>(this.mTlHighLightCommentSwitch);
            e2.d(new l(e2, weakReference), weakReference);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                return;
            }
            if (TextUtils.isEmpty(InputPanelFrameKMP.access$000(InputPanelFrameKMP.this).getText())) {
                o3s.b(InputPanelFrameKMP.TAG, "mEditSend afterTextChanged isTextEmpty");
                InputPanelFrameKMP.access$200(InputPanelFrameKMP.this, false);
                InputPanelFrameKMP.access$300(InputPanelFrameKMP.this).setEnabled(false);
                InputPanelFrameKMP.access$300(InputPanelFrameKMP.this).setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01BXKtVz1JVA06Rbtga_!!6000000001033-2-tps-72-72.png");
            } else {
                if (InputPanelFrameKMP.access$400(InputPanelFrameKMP.this).getVisibility() != 0) {
                    InputPanelFrameKMP.access$400(InputPanelFrameKMP.this).setVisibility(0);
                    o3s.b(InputPanelFrameKMP.TAG, "mEditSend afterTextChanged visibility visible");
                    InputPanelFrameKMP.access$200(InputPanelFrameKMP.this, true);
                }
                InputPanelFrameKMP.access$300(InputPanelFrameKMP.this).setEnabled(true);
                InputPanelFrameKMP.access$300(InputPanelFrameKMP.this).setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01YVjVRB1e64EZ03QiN_!!6000000003821-2-tps-72-72.png");
                if (InputPanelFrameKMP.access$000(InputPanelFrameKMP.this).getText().length() >= InputPanelFrameKMP.access$500(InputPanelFrameKMP.this)) {
                    Context context = InputPanelFrameKMP.this.mContext;
                    int i = R.string.taolive_chat_too_long_flexalocal;
                    hw0.w(context, context.getString(i, InputPanelFrameKMP.access$500(InputPanelFrameKMP.this) + ""), 17);
                }
            }
            o3s.b(InputPanelFrameKMP.TAG, "mEditSend afterTextChanged");
        }
    }

    private void onEditTextSend(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf5660f", new Object[]{this, str});
            return;
        }
        o3s.b(TAG, "onEditTextSend start");
        if (checkInput(str)) {
            TaoLiveKtEmojiIconItem largeSticker = getLargeSticker(str);
            HashMap hashMap = new HashMap();
            if (largeSticker != null) {
                hashMap.put("commentType", "anchor_custom_sticker");
                hashMap.put("stickerId", largeSticker.getStickerId());
                hashMap.put("stickerVersion", "2");
            }
            if (TextUtils.equals(this.mInputType, "linklive")) {
                this.mFrameContext.h().c(uyg.EVENT_START_LINKLIVE_BY_MTOP_MSG, str, observeUniqueIdentification());
            } else {
                realSendComment(str, hashMap);
            }
            this.mEditText.setText("");
            hideContentViewInner();
            hideKeyBoard();
            resetInputStatus();
            this.mLastSendTime = System.currentTimeMillis();
            this.mFrameContext.h().c(uyg.EVENT_EDIT_TEXT_SEND, null, observeUniqueIdentification());
            giv.h().c(2);
            o3s.b(TAG, "onEditTextSend end");
        }
    }

    private void showKeyBoard(lly llyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45fbdd4a", new Object[]{this, llyVar});
            return;
        }
        boolean c2 = s4g.c(this.mEditText, 0);
        if (llyVar != null) {
            llyVar.a(c2, null);
        }
        o3s.b(TAG, "show key board:" + c2);
        if (!TextUtils.equals(this.mInputType, "linklive")) {
            giv.f().n(this.mFrameContext, z9u.OPEN_COMMENT, new String[0]);
            giv.f().s(this.mFrameContext, "openComment", new String[0]);
        }
    }

    private void switchSticker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f4cf70", new Object[]{this});
            return;
        }
        if (this.mStickerLayout.getVisibility() == 0) {
            o3s.b(TAG, "switchSticker showKeyBoard");
            showKeyBoard(null);
            this.mStickerLayout.setVisibility(4);
            this.mTVSwitch.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01Yssk7o1CLobjwvbKO_!!6000000000065-2-tps-72-72.png");
            refreshQuickEmoji();
        } else {
            int i2 = this.mKeyboardHeight;
            if (i2 > 0 && this.mIsHaveQuickExpression) {
                setStickerHeight(i2 + hw0.b(this.mContext, 40.0f));
            }
            this.mQuickFrameLayout.setVisibility(8);
            this.mStickerLayout.setVisibility(0);
            o3s.b(TAG, "switchSticker hideKeyBoard");
            hideKeyBoard();
            this.mTVSwitch.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01aR5U9C206S70bD7E9_!!6000000006800-2-tps-72-72.png");
            refreshCurrentPage(this.mCurrentPos);
        }
        trackSwitchClick();
    }

    private void showCommentKeywordAtmosphere(String str) {
        List<Map<String, String>> keywordAtmosphere;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6049b13a", new Object[]{this, str});
            return;
        }
        TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel = this.mEmojiViewModel;
        if (!(taoLiveKtEmojiViewModel == null || (keywordAtmosphere = taoLiveKtEmojiViewModel.getKeywordAtmosphere()) == null || keywordAtmosphere.isEmpty())) {
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < keywordAtmosphere.size(); i2++) {
                hashMap.putAll(keywordAtmosphere.get(i2));
            }
            if (!hashMap.isEmpty()) {
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str2 = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (TextUtils.equals((CharSequence) entry.getKey(), str)) {
                        str2 = (String) entry.getValue();
                        break;
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", (Object) str2);
                    jSONObject.put("md5", (Object) str2);
                    jSONArray.add(jSONObject);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("originData", (Object) jSONArray);
                    sjr.g().e(uyg.EVENT_PREFETCH_GIFT_RESOURCE, JSON.toJSONString(jSONObject2));
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("animationMp4", (Object) str2);
                    jSONObject3.put("giftLevel", (Object) "999");
                    jSONObject3.put("giftSourceType", (Object) "admire");
                    jSONObject3.put("giftType", (Object) "1");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("giftEffectInfo", (Object) jSONObject3);
                    this.mHandler.postDelayed(new a(jSONObject4), 100L);
                }
            }
        }
    }
}
