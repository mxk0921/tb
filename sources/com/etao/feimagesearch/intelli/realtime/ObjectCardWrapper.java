package com.etao.feimagesearch.intelli.realtime;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.intelli.realtime.DataPool;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a07;
import tb.agh;
import tb.bia;
import tb.caa;
import tb.ckf;
import tb.h19;
import tb.i0u;
import tb.lg4;
import tb.mzu;
import tb.npc;
import tb.p73;
import tb.q0j;
import tb.t2o;
import tb.vkn;
import tb.wkn;
import tb.xhv;
import tb.yh6;
import tb.zb7;
import tb.zwh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ObjectCardWrapper implements npc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long CHECK_EXPIRED_PERIOD = 400;
    public static final a Companion = new a(null);
    public static final int MSG_BEGIN_COUNT_DOWN = 11001;
    public static final int MSG_CHECK_EXPIRED = 10001;
    public static final int MSG_CHECK_TRACK_ANIMATOR = 10002;
    public static final int MSG_GO_IRP = 11002;
    public static final long PLAY_ANIMATOR_PERIOD = 350;
    public static final String TAG = "realtime_ObjectCardWrapper";
    public Bitmap E;
    public RectF F;
    public int G;
    public long H;
    public final e J;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4741a;
    public final ViewGroup b;
    public wkn c;
    public final com.etao.feimagesearch.intelli.realtime.a d;
    public String e;
    public ValueAnimator g;
    public ValueAnimator h;
    public ValueAnimator i;
    public View j;
    public final FrameLayout k;
    public final FrameLayout l;
    public final View m;
    public final View n;
    public final View o;
    public com.taobao.android.weex_framework.a p;
    public CardStatus f = CardStatus.IDLE_CARD;
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean r = new AtomicBoolean(false);
    public final AtomicBoolean s = new AtomicBoolean(false);
    public final long t = lg4.f3();
    public final String u = lg4.g3();
    public final long v = lg4.r3();
    public final float w = lg4.k3();
    public final float x = lg4.s3();
    public final float y = lg4.l3();
    public final boolean z = lg4.Y0();
    public final boolean A = lg4.Z0();
    public final float B = lg4.m3();
    public final boolean C = lg4.a1();
    public final float D = lg4.n3();
    public Point I = new Point(0, 0);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class CardPositionType extends Enum<CardPositionType> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int type;
        private final boolean usable;
        public static final CardPositionType UP = new CardPositionType("UP", 0, 1, false, 2, null);
        public static final CardPositionType DOWN = new CardPositionType(RPCDataItems.DOWN, 1, 2, false, 2, null);
        public static final CardPositionType LEFT = new CardPositionType("LEFT", 2, 3, false, 2, null);
        public static final CardPositionType RIGHT = new CardPositionType("RIGHT", 3, 4, false, 2, null);
        private static final /* synthetic */ CardPositionType[] $VALUES = $values();

        private static final /* synthetic */ CardPositionType[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CardPositionType[]) ipChange.ipc$dispatch("94b97775", new Object[0]) : new CardPositionType[]{UP, DOWN, LEFT, RIGHT};
        }

        private CardPositionType(String str, int i, int i2, boolean z) {
            this.type = i2;
            this.usable = z;
        }

        public static /* synthetic */ Object ipc$super(CardPositionType cardPositionType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/realtime/ObjectCardWrapper$CardPositionType");
        }

        public static CardPositionType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("ff5b8b60", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(CardPositionType.class, str);
            }
            return (CardPositionType) valueOf;
        }

        public static CardPositionType[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("9bb0a51", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (CardPositionType[]) clone;
        }

        public final int getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return this.type;
        }

        public final boolean getUsable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("88f42579", new Object[]{this})).booleanValue();
            }
            return this.usable;
        }

        public /* synthetic */ CardPositionType(String str, int i, int i2, boolean z, int i3, a07 a07Var) {
            this(str, i, i2, (i3 & 2) != 0 ? true : z);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class CardStatus extends Enum<CardStatus> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String content;
        public static final CardStatus IDLE_CARD = new CardStatus("IDLE_CARD", 0, "idleCard");
        public static final CardStatus NATIVE_CARD = new CardStatus("NATIVE_CARD", 1, "nativeCard");
        public static final CardStatus SMALL_MUISE_CARD = new CardStatus("SMALL_MUISE_CARD", 2, "smallCard");
        public static final CardStatus BIG_MUISE_CARD = new CardStatus("BIG_MUISE_CARD", 3, bia.UNDER_TAKE_BIG_CARD);
        public static final CardStatus INTERACTIVE_CARD = new CardStatus("INTERACTIVE_CARD", 4, bia.UNDER_TAKE_BIG_CARD);
        private static final /* synthetic */ CardStatus[] $VALUES = $values();

        private static final /* synthetic */ CardStatus[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CardStatus[]) ipChange.ipc$dispatch("1dbf2f26", new Object[0]) : new CardStatus[]{IDLE_CARD, NATIVE_CARD, SMALL_MUISE_CARD, BIG_MUISE_CARD, INTERACTIVE_CARD};
        }

        private CardStatus(String str, int i, String str2) {
            this.content = str2;
        }

        public static /* synthetic */ Object ipc$super(CardStatus cardStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/realtime/ObjectCardWrapper$CardStatus");
        }

        public static CardStatus valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("e0cd4f51", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(CardStatus.class, str);
            }
            return (CardStatus) valueOf;
        }

        public static CardStatus[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("8caf1702", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (CardStatus[]) clone;
        }

        public final String getContent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
            }
            return this.content;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {

        /* compiled from: Taobao */
        /* renamed from: com.etao.feimagesearch.intelli.realtime.ObjectCardWrapper$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class C0238a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final Point f4742a;
            public float b;

            static {
                t2o.a(730857664);
            }

            public C0238a(Point point, float f) {
                ckf.g(point, "beginPoint");
                this.f4742a = point;
                this.b = f;
            }

            public final Point a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Point) ipChange.ipc$dispatch("63abd795", new Object[]{this});
                }
                return this.f4742a;
            }

            public final float b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("7e409b53", new Object[]{this})).floatValue();
                }
                return this.b;
            }

            public final void c(float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("77f786c9", new Object[]{this, new Float(f)});
                } else {
                    this.b = f;
                }
            }
        }

        static {
            t2o.a(730857663);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(730857665);
            int[] iArr = new int[CardPositionType.values().length];
            iArr[CardPositionType.UP.ordinal()] = 1;
            iArr[CardPositionType.DOWN.ordinal()] = 2;
            iArr[CardPositionType.LEFT.ordinal()] = 3;
            iArr[CardPositionType.RIGHT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;

        public c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = f5;
            this.g = f6;
            this.h = f7;
            this.i = f8;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.g(valueAnimator, "animator");
            Float f = (Float) valueAnimator.getAnimatedValue();
            if (f != null) {
                ObjectCardWrapper objectCardWrapper = ObjectCardWrapper.this;
                float f2 = this.b;
                float f3 = this.c;
                float f4 = this.d;
                float f5 = this.e;
                float f6 = this.f;
                float f7 = this.g;
                float f8 = this.h;
                float f9 = this.i;
                ObjectCardWrapper.a(objectCardWrapper).setX((f.floatValue() * f2) + f3);
                ObjectCardWrapper.a(objectCardWrapper).setY((f.floatValue() * f4) + f5);
                ObjectCardWrapper.c(objectCardWrapper).setX((f.floatValue() * f6) + f7);
                ObjectCardWrapper.c(objectCardWrapper).setY((f.floatValue() * f8) + f9);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            agh.h(ObjectCardWrapper.TAG, "trackAnimator onAnimationCancel");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            if (!ObjectCardWrapper.e(ObjectCardWrapper.this).get()) {
                agh.h(ObjectCardWrapper.TAG, "trackAnimator onAnimationEnd");
                ObjectCardWrapper.f(ObjectCardWrapper.this).sendEmptyMessage(10002);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            agh.h(ObjectCardWrapper.TAG, "trackAnimator onAnimationRepeat");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            agh.h(ObjectCardWrapper.TAG, "trackAnimator onAnimationStart");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/realtime/ObjectCardWrapper$mainHandler$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            ckf.g(message, "msg");
            super.handleMessage(message);
            agh.h(ObjectCardWrapper.TAG, ckf.p("receive msg ", Integer.valueOf(message.what)));
            if (!ObjectCardWrapper.e(ObjectCardWrapper.this).get()) {
                int i = message.what;
                if (i == 10001) {
                    ObjectCardWrapper.k(ObjectCardWrapper.this);
                } else if (i == 10002) {
                    ObjectCardWrapper.m(ObjectCardWrapper.this);
                } else if (i == 11001) {
                    ObjectCardWrapper.j(ObjectCardWrapper.this);
                } else if (i == 11002) {
                    ObjectCardWrapper.l(ObjectCardWrapper.this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.weex_framework.a f4746a;

        public f(com.taobao.android.weex_framework.a aVar) {
            this.f4746a = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            agh.h(ObjectCardWrapper.TAG, "onLayoutChange: width = " + (i3 - i) + ", height = " + (i4 - i2));
            this.f4746a.getRenderRoot().requestLayout();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.taobao.android.weex_framework.a b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ObjectCardWrapper f4748a;

            public a(ObjectCardWrapper objectCardWrapper) {
                this.f4748a = objectCardWrapper;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    this.f4748a.F(true);
                }
            }
        }

        public g(com.taobao.android.weex_framework.a aVar) {
            this.b = aVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.g(valueAnimator, "tmpAnimator");
            Float f = (Float) valueAnimator.getAnimatedValue();
            if (f != null) {
                ObjectCardWrapper objectCardWrapper = ObjectCardWrapper.this;
                com.taobao.android.weex_framework.a aVar = this.b;
                if (f.floatValue() < 1.0f) {
                    ObjectCardWrapper.h(objectCardWrapper).setAlpha(1 - f.floatValue());
                    return;
                }
                if (ckf.b(ObjectCardWrapper.d(objectCardWrapper), ObjectCardWrapper.h(objectCardWrapper))) {
                    ObjectCardWrapper.h(objectCardWrapper).setAlpha(0.0f);
                    agh.h(ObjectCardWrapper.TAG, "switch card...");
                    ((FrameLayout) ObjectCardWrapper.g(objectCardWrapper).findViewById(R.id.rt_muise_card_container)).addView(aVar.getRenderRoot());
                    ObjectCardWrapper.c(objectCardWrapper).addView(ObjectCardWrapper.g(objectCardWrapper), new ViewGroup.LayoutParams(-2, -2));
                    ObjectCardWrapper.o(objectCardWrapper, ObjectCardWrapper.g(objectCardWrapper));
                    ObjectCardWrapper.i(objectCardWrapper).set(true);
                }
                ObjectCardWrapper.g(objectCardWrapper).setAlpha(f.floatValue() - 1);
                ViewProxy.setOnClickListener(ObjectCardWrapper.g(objectCardWrapper), new a(objectCardWrapper));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f4749a;
        public final /* synthetic */ ObjectCardWrapper b;

        public h(boolean z, ObjectCardWrapper objectCardWrapper) {
            this.f4749a = z;
            this.b = objectCardWrapper;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.g(valueAnimator, "animator");
            Float f2 = (Float) valueAnimator.getAnimatedValue();
            if (f2 != null) {
                boolean z = this.f4749a;
                ObjectCardWrapper objectCardWrapper = this.b;
                if (z) {
                    f = 1 - f2.floatValue();
                } else {
                    f = f2.floatValue();
                }
                ObjectCardWrapper.d(objectCardWrapper).setAlpha(f);
                ObjectCardWrapper.b(objectCardWrapper).setAlpha(f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            agh.h(ObjectCardWrapper.TAG, "expiredFadeInAndOutAnimator: onAnimationCancel");
            ObjectCardWrapper.f(ObjectCardWrapper.this).sendEmptyMessageDelayed(10001, 400L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            agh.h(ObjectCardWrapper.TAG, "expiredFadeInAndOutAnimator: onAnimationEnd");
            ObjectCardWrapper.f(ObjectCardWrapper.this).sendEmptyMessageDelayed(10001, 400L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            agh.h(ObjectCardWrapper.TAG, "expiredFadeInAndOutAnimator: onAnimationRepeat");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            agh.h(ObjectCardWrapper.TAG, "expiredFadeInAndOutAnimator: onAnimationStart");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ DataPool.d b;

        public j(DataPool.d dVar) {
            this.b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ObjectCardWrapper.n(ObjectCardWrapper.this, this.b);
            }
        }
    }

    static {
        t2o.a(730857660);
        t2o.a(982515990);
    }

    public ObjectCardWrapper(Context context, ViewGroup viewGroup, wkn wknVar, com.etao.feimagesearch.intelli.realtime.a aVar, String str) {
        ckf.g(context, "context");
        ckf.g(viewGroup, "parentView");
        ckf.g(wknVar, "objectData");
        ckf.g(aVar, "detector");
        ckf.g(str, "mssid");
        this.f4741a = context;
        this.b = viewGroup;
        this.c = wknVar;
        this.d = aVar;
        this.e = str;
        this.k = new FrameLayout(context);
        this.l = new FrameLayout(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.feis_realtime_card_anchor_view, (ViewGroup) null, false);
        ckf.f(inflate, "from(context).inflate(R.…anchor_view, null, false)");
        this.m = inflate;
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.feis_realtime_native_card, (ViewGroup) null, false);
        ckf.f(inflate2, "from(context).inflate(R.…native_card, null, false)");
        this.n = inflate2;
        View inflate3 = LayoutInflater.from(context).inflate(R.layout.feis_realtime_muise_card, (ViewGroup) null, false);
        ckf.f(inflate3, "from(context).inflate(R.…_muise_card, null, false)");
        this.o = inflate3;
        e eVar = new e(Looper.getMainLooper());
        this.J = eVar;
        agh.h(TAG, ckf.p("create card ", Integer.valueOf(this.c.f())));
        this.j = inflate2;
        H();
        J();
        I();
        ValueAnimator K = K();
        this.g = K;
        if (K != null) {
            K.start();
        }
        eVar.sendEmptyMessageDelayed(10001, 400L);
    }

    public static final /* synthetic */ FrameLayout a(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("dac3ac6c", new Object[]{objectCardWrapper});
        }
        return objectCardWrapper.k;
    }

    public static final /* synthetic */ View b(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2ae567b5", new Object[]{objectCardWrapper});
        }
        return objectCardWrapper.m;
    }

    public static final /* synthetic */ FrameLayout c(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("cc23f371", new Object[]{objectCardWrapper});
        }
        return objectCardWrapper.l;
    }

    public static final /* synthetic */ View d(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b8f8a0c6", new Object[]{objectCardWrapper});
        }
        return objectCardWrapper.j;
    }

    public static final /* synthetic */ AtomicBoolean e(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("3dad03df", new Object[]{objectCardWrapper});
        }
        return objectCardWrapper.s;
    }

    public static final /* synthetic */ e f(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("56cdb274", new Object[]{objectCardWrapper});
        }
        return objectCardWrapper.J;
    }

    public static final /* synthetic */ View g(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9839b7d3", new Object[]{objectCardWrapper});
        }
        return objectCardWrapper.o;
    }

    public static final /* synthetic */ View h(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4167563", new Object[]{objectCardWrapper});
        }
        return objectCardWrapper.n;
    }

    public static final /* synthetic */ AtomicBoolean i(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b62a7bec", new Object[]{objectCardWrapper});
        }
        return objectCardWrapper.r;
    }

    public static final /* synthetic */ void j(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("172d33e3", new Object[]{objectCardWrapper});
        } else {
            objectCardWrapper.M();
        }
    }

    public static final /* synthetic */ void k(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3590d17a", new Object[]{objectCardWrapper});
        } else {
            objectCardWrapper.N();
        }
    }

    public static final /* synthetic */ void l(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e5b31e", new Object[]{objectCardWrapper});
        } else {
            objectCardWrapper.O();
        }
    }

    public static final /* synthetic */ void m(ObjectCardWrapper objectCardWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2424451", new Object[]{objectCardWrapper});
        } else {
            objectCardWrapper.P();
        }
    }

    public static final /* synthetic */ void n(ObjectCardWrapper objectCardWrapper, DataPool.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc714a6a", new Object[]{objectCardWrapper, dVar});
        } else {
            objectCardWrapper.R(dVar);
        }
    }

    public static final /* synthetic */ void o(ObjectCardWrapper objectCardWrapper, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebd5242", new Object[]{objectCardWrapper, view});
        } else {
            objectCardWrapper.j = view;
        }
    }

    public final int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d208a01c", new Object[]{this})).intValue();
        }
        return this.l.getHeight();
    }

    public final int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7461bde5", new Object[]{this})).intValue();
        }
        return this.l.getWidth();
    }

    public final Context C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f4741a;
    }

    public final CardStatus D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardStatus) ipChange.ipc$dispatch("f2187038", new Object[]{this});
        }
        float a2 = this.c.a();
        agh.h(TAG, ckf.p("getNextCardStatus areaRate:", Float.valueOf(a2)));
        CardStatus S = S(a2);
        CardStatus cardStatus = this.f;
        if (cardStatus == CardStatus.IDLE_CARD || cardStatus == CardStatus.NATIVE_CARD || S == cardStatus) {
            return S;
        }
        CardStatus S2 = S(a2 - this.w);
        return S2 != this.f ? S2 : S(a2 + this.w);
    }

    public final wkn E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wkn) ipChange.ipc$dispatch("ec3a26a8", new Object[]{this});
        }
        return this.c;
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25bac692", new Object[]{this})).booleanValue();
        }
        float f2 = this.B;
        float f3 = f2 + 0.5f;
        float f4 = f2 + 0.5f;
        if (this.c.d() <= this.b.getWidth() * f3 || this.c.d() >= this.b.getWidth() * f4 || this.c.e() <= this.b.getHeight() * f3 || this.c.e() >= this.b.getHeight() * f4) {
            return false;
        }
        return true;
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac9bb1", new Object[]{this});
            return;
        }
        ((TUrlImageView) this.m.findViewById(R.id.realtime_anchor_iv)).setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01YgUuLA1hVf80e48Dz_!!6000000004283-2-tps-32-32.png");
        this.k.addView(this.m, new FrameLayout.LayoutParams(zb7.a(18.0f), zb7.a(18.0f)));
        this.k.setX(this.c.d());
        this.k.setY(this.c.e());
        this.b.addView(this.k, new ViewGroup.LayoutParams(-2, -2));
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971f7428", new Object[]{this});
            return;
        }
        Point x = x();
        this.I = x;
        this.l.setX(x.x);
        this.l.setY(this.I.y);
        this.b.addView(this.l, new ViewGroup.LayoutParams(-2, -2));
        t(CardStatus.NATIVE_CARD);
    }

    public final ValueAnimator K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("1e5011ad", new Object[]{this});
        }
        float x = this.k.getX();
        float y = this.k.getY();
        float d2 = this.c.d() - x;
        float e2 = this.c.e() - y;
        float x2 = this.l.getX();
        float y2 = this.l.getY();
        Point x3 = x();
        this.I = x3;
        float f2 = x3.y - y2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(350L);
        ofFloat.addUpdateListener(new c(d2, x, e2, y, x3.x - x2, x2, f2, y2));
        ofFloat.addListener(new d());
        return ofFloat;
    }

    public final boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a65eada6", new Object[]{this})).booleanValue();
        }
        return this.q.get();
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7909ae5", new Object[]{this});
            return;
        }
        this.J.removeMessages(10002);
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
        if (this.c.d() == this.k.getX() && this.c.e() == this.k.getY()) {
            agh.h(TAG, "no need to move container");
            this.J.sendEmptyMessageDelayed(10002, 350L);
        } else if (!this.A || !G()) {
            agh.h(TAG, "anchorView.width = " + this.m.getWidth() + " anchorView.height = " + this.m.getHeight());
            agh.h(TAG, "anchorContainer.width: " + this.k.getWidth() + ", anchorContainer.height: " + this.k.getHeight());
            ValueAnimator K = K();
            this.g = K;
            if (K != null) {
                K.start();
            }
            v();
        } else {
            this.J.sendEmptyMessageDelayed(10002, 350L);
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c62d9d", new Object[]{this});
        } else if (this.r.get()) {
            this.c.l();
        }
    }

    public final void R(DataPool.d dVar) {
        String q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb65f9a", new Object[]{this, dVar});
            return;
        }
        CardStatus D = D();
        agh.h(TAG, "renderOrRefreshData nextStatus: " + D + ", cardStatus: " + this.f);
        JSONObject p = p(dVar.a(), D);
        com.taobao.android.weex_framework.a aVar = this.p;
        xhv xhvVar = null;
        if (aVar != null) {
            aVar.refresh(p, null);
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null && (q = q(dVar)) != null) {
            com.taobao.android.weex_framework.a b2 = com.taobao.android.weex_framework.b.f().b(C());
            b2.registerRenderListener(this);
            this.H = System.currentTimeMillis();
            zwh.Companion.a(b2, q, q, p, null);
            this.p = b2;
            t(D);
        }
    }

    public final CardStatus S(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardStatus) ipChange.ipc$dispatch("12f52958", new Object[]{this, new Float(f2)});
        }
        if (f2 < this.x) {
            return CardStatus.SMALL_MUISE_CARD;
        }
        if (f2 < this.y) {
            return CardStatus.BIG_MUISE_CARD;
        }
        return CardStatus.INTERACTIVE_CARD;
    }

    public final void U(wkn wknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be7a8ab", new Object[]{this, wknVar});
            return;
        }
        ckf.g(wknVar, "newData");
        agh.h(TAG, "updateObjectData: " + wknVar.f() + " areaRate: " + wknVar.a());
        this.c = wknVar;
        Q();
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        } else {
            agh.h(TAG, "onDestroyed");
        }
    }

    @Override // tb.npc
    public void onJSException(com.taobao.android.weex_framework.a aVar, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i2), str});
            return;
        }
        agh.c(TAG, "onJSException " + i2 + ' ' + ((Object) str));
    }

    @Override // tb.npc
    public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
        } else {
            agh.a(TAG, "onPrepareSuccess");
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i2, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i2), str, new Boolean(z)});
            return;
        }
        agh.c(TAG, "onRefreshFailed " + i2 + ' ' + ((Object) str) + ' ' + z);
    }

    @Override // tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
        } else {
            agh.a(TAG, "onRefreshSuccess");
        }
    }

    public final JSONObject p(JSONObject jSONObject, CardStatus cardStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c5f59510", new Object[]{this, jSONObject, cardStatus});
        }
        Object obj = jSONObject.get("showCardInfo");
        if (obj != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "model", (String) ((JSONObject) obj));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put((JSONObject) q0j.BIZ_CONTEXT_KEY_CARD_TYPE, cardStatus.getContent());
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put((JSONObject) "updateCount", (String) Integer.valueOf(this.G));
            jSONObject4.put((JSONObject) "category", this.c.h());
            jSONObject3.put((JSONObject) "traceInfo", (String) jSONObject4);
            jSONObject3.put((JSONObject) "spm", "a2141.7631739");
            jSONObject2.put((JSONObject) "status", (String) jSONObject3);
            return jSONObject2;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
    }

    public final String q(DataPool.d dVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5cc3c075", new Object[]{this, dVar});
        }
        Object obj = dVar.a().get("showCardInfo");
        if (obj != null) {
            Object obj2 = ((JSONObject) obj).get("tItemType");
            if (obj2 != null) {
                String str2 = (String) obj2;
                Iterator<Object> it = dVar.e().iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) next;
                        if (ckf.b(str2, h19.i(jSONObject, yh6.CONFIG_KEY_TEMPLATE_NAME, str))) {
                            str = h19.i(jSONObject, "url", str);
                            ckf.f(str, "parseString(template, \"url\", \"\")");
                            break;
                        }
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                agh.h(TAG, ckf.p("url = ", str));
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47b7d4f", new Object[]{this});
        } else if (!this.q.get()) {
            this.J.sendEmptyMessageDelayed(11001, 2000L);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a025e20c", new Object[]{this});
            return;
        }
        this.J.removeMessages(11001);
        this.J.removeMessages(11002);
    }

    public final void t(CardStatus cardStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d7254d", new Object[]{this, cardStatus});
        } else if (this.f != cardStatus) {
            agh.h(TAG, "changeCardStatus preCardStatus:" + this.f + ", nextStatus: " + cardStatus);
            if (cardStatus == CardStatus.INTERACTIVE_CARD) {
                r();
            }
            this.f = cardStatus;
        }
    }

    public final HashMap<CardPositionType, a.C0238a> u(HashMap<CardPositionType, a.C0238a> hashMap, FrameLayout frameLayout) {
        int i2;
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("494dc558", new Object[]{this, hashMap, frameLayout});
        }
        for (Map.Entry<CardPositionType, a.C0238a> entry : hashMap.entrySet()) {
            float b2 = entry.getValue().b();
            Point a2 = entry.getValue().a();
            Point point = new Point(a2.x + frameLayout.getWidth(), a2.y + frameLayout.getHeight());
            for (ObjectCardWrapper objectCardWrapper : DataPool.Companion.a().p()) {
                if (!objectCardWrapper.L() && objectCardWrapper.c.f() != this.c.f()) {
                    Point point2 = objectCardWrapper.I;
                    Point point3 = new Point(point2.x + objectCardWrapper.B(), point2.y + objectCardWrapper.A());
                    int i6 = a2.x;
                    int i7 = point2.x;
                    if ((i6 > i7 && i6 < point3.x) || (((i2 = a2.y) > (i3 = point2.y) && i2 < point3.y) || (((i4 = point.x) > i7 && i4 < point3.x) || ((i5 = point.y) > i3 && i5 < point3.y)))) {
                        b2 -= 1.0f;
                        agh.h(TAG, this.c.f() + ' ' + entry.getKey() + " overlap with " + objectCardWrapper.c.f());
                    }
                }
            }
            if (b2 != entry.getValue().b()) {
                agh.h(TAG, "resign score, before " + entry.getValue().b() + ", after " + b2);
                entry.getValue().c(b2);
            }
        }
        return hashMap;
    }

    public final void v() {
        com.taobao.android.weex_framework.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("754eb76a", new Object[]{this});
            return;
        }
        CardStatus cardStatus = this.f;
        if (cardStatus == CardStatus.IDLE_CARD || cardStatus == CardStatus.NATIVE_CARD) {
            agh.h(TAG, this.f + " and not cloud cache, skip");
            return;
        }
        CardStatus D = D();
        if (D != this.f && (aVar = this.p) != null) {
            agh.h(TAG, "changeMuiseCardStatus cardStatus: " + this.f + ", nextStatus: " + D);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) q0j.BIZ_CONTEXT_KEY_CARD_TYPE, D.getContent());
            aVar.sendInstanceMessage("MUISE", "MetaSightCardChange", jSONObject);
            t(D);
        }
    }

    public final HashMap<CardPositionType, a.C0238a> w(HashMap<CardPositionType, a.C0238a> hashMap, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("29835621", new Object[]{this, hashMap, frameLayout});
        }
        int l = caa.l();
        int j2 = caa.j();
        for (Map.Entry<CardPositionType, a.C0238a> entry : hashMap.entrySet()) {
            float b2 = entry.getValue().b();
            Point a2 = entry.getValue().a();
            int width = this.j.getWidth();
            int height = this.j.getHeight();
            Point point = new Point(a2.x + frameLayout.getWidth(), a2.y + frameLayout.getHeight());
            float f2 = width;
            float f3 = this.D;
            if (a2.x + (f2 * f3) < 0.0f || a2.y + (height * f3) < 0.0f) {
                b2 -= 1.0f;
            }
            if (point.x - (f2 * f3) > l || point.y - (height * f3) > j2) {
                b2 -= 1.0f;
            }
            if (b2 != entry.getValue().b()) {
                agh.h(TAG, "resign score, before " + entry.getValue().b() + ", after " + b2 + ' ' + entry.getKey());
                entry.getValue().c(b2);
            }
        }
        return hashMap;
    }

    public final Point y(CardPositionType cardPositionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("3708902e", new Object[]{this, cardPositionType});
        }
        int width = this.k.getWidth();
        int height = this.k.getHeight();
        if (width == 0 && height == 0) {
            int a2 = zb7.a(18.0f);
            height = zb7.a(18.0f);
            width = a2;
        }
        int width2 = this.l.getWidth();
        int height2 = this.l.getHeight();
        if (width2 == 0 && height2 == 0) {
            width2 = zb7.a(132.0f);
            height2 = zb7.a(52.0f);
        }
        int i2 = b.$EnumSwitchMapping$0[cardPositionType.ordinal()];
        if (i2 == 1) {
            this.I = new Point((int) ((this.c.d() + (width / 2)) - (width2 / 2)), (int) (this.c.e() - (height2 + zb7.a(6.0f))));
        } else if (i2 == 2) {
            this.I = new Point((int) ((this.c.d() + (width / 2)) - (width2 / 2)), (int) (this.c.e() + height + zb7.a(6.0f)));
        } else if (i2 == 3) {
            this.I = new Point((int) (this.c.d() - (width2 + zb7.a(6.0f))), (int) ((this.c.e() + (height / 2)) - (height2 / 2)));
        } else if (i2 == 4) {
            this.I = new Point((int) (this.c.d() + width + zb7.a(6.0f)), (int) ((this.c.e() + (height / 2)) - (height2 / 2)));
        }
        return this.I;
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569e5013", new Object[]{this});
            return;
        }
        CardStatus cardStatus = this.f;
        if (cardStatus == CardStatus.INTERACTIVE_CARD) {
            i0u.f(this.f4741a, this.u, 0);
            this.J.sendEmptyMessageDelayed(11002, this.t * 1000);
            return;
        }
        agh.h(TAG, ckf.p("processBeginCountMsg cardStatus is ", cardStatus));
        s();
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3abc38", new Object[]{this});
        } else if (this.q.get()) {
            agh.h(TAG, "processGoIrpMsg card is expired");
        } else {
            CardStatus cardStatus = this.f;
            if (cardStatus == CardStatus.INTERACTIVE_CARD) {
                F(false);
                return;
            }
            agh.h(TAG, ckf.p("processGoIrpMsg cardStatus is ", cardStatus));
            s();
        }
    }

    public final void T(DataPool.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7246a43", new Object[]{this, dVar});
            return;
        }
        ckf.g(dVar, "cloudMsgModel");
        int i2 = this.G + 1;
        this.G = i2;
        agh.h(TAG, ckf.p("updateCloudMsg-- ", Integer.valueOf(i2)));
        this.E = dVar.b();
        this.F = dVar.d();
        this.e = dVar.c();
        Q();
        this.J.post(new j(dVar));
    }

    @Override // tb.npc
    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i2, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i2), str, new Boolean(z)});
            return;
        }
        ckf.g(str, "errorMsg");
        agh.c(TAG, "onRenderFailed type:" + i2 + ", errorMsg:" + str);
        vkn.Companion.c(false, System.currentTimeMillis() - this.H);
        mzu.n(p73.f25916a, "metasightCardRenderFailed", 2101, "errorCode", String.valueOf(i2), "errorMsg", str);
    }

    public final void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82af582e", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            mzu.n(p73.f25916a, "metasightAutoPullUp", 2101, new String[0]);
        }
        ArrayList arrayList = new ArrayList(1);
        RectF rectF = this.F;
        if (rectF != null) {
            arrayList.add(rectF);
        }
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            this.d.D(bitmap, arrayList, "");
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a0eac3", new Object[]{this});
            return;
        }
        this.l.addView(this.n, new FrameLayout.LayoutParams(-2, -2));
        ((TextView) this.n.findViewById(R.id.native_card_guess_tv)).setText(this.f4741a.getResources().getString(R.string.feis_rt_native_card_guess, this.c.h()));
        mzu.n(p73.f25916a, "metasightNativeCardExpose", 2101, "number", String.valueOf(this.c.f()), "category", this.c.h(), "mssid", this.e);
    }

    public final void N() {
        ValueAnimator valueAnimator;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643c30dc", new Object[]{this});
            return;
        }
        this.J.removeMessages(10001);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.c.k() > this.v) {
            z = true;
        }
        if (z == this.q.get()) {
            this.J.sendEmptyMessageDelayed(10001, 400L);
            return;
        }
        ValueAnimator valueAnimator2 = this.h;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) || ((valueAnimator = this.i) != null && valueAnimator.isRunning())) {
            agh.h(TAG, "animator is running, skip");
            this.J.sendEmptyMessageDelayed(10001, 400L);
            return;
        }
        this.q.set(z);
        agh.h(TAG, "processCheckExpiredMsg: curTime: " + currentTimeMillis + ", timestamp: " + this.c.k() + " expired: " + this.q.get());
        ValueAnimator valueAnimator3 = this.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            valueAnimator3.removeAllUpdateListeners();
            valueAnimator3.removeAllListeners();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ckf.d(ofFloat);
        ofFloat.addUpdateListener(new h(z, this));
        ofFloat.addListener(new i());
        ofFloat.setDuration(400L);
        ofFloat.start();
        agh.h(TAG, ckf.p("start expiredFadeInAndOutAnimator ", Boolean.valueOf(z)));
    }

    @Override // tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        agh.a(TAG, "onRenderSuccess ");
        if (aVar != null) {
            vkn.Companion.c(true, System.currentTimeMillis() - this.H);
            aVar.getRenderRoot().addOnLayoutChangeListener(new f(aVar));
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 2.0f);
            this.i = ofFloat;
            ckf.d(ofFloat);
            ofFloat.setDuration(800L);
            ofFloat.addUpdateListener(new g(aVar));
            ofFloat.start();
        }
    }

    public final Point x() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("4e0c828f", new Object[]{this});
        }
        if (!this.z) {
            return y(CardPositionType.RIGHT);
        }
        HashMap<CardPositionType, a.C0238a> hashMap = new HashMap<>(4);
        CardPositionType cardPositionType = CardPositionType.LEFT;
        hashMap.put(cardPositionType, new a.C0238a(y(cardPositionType), 0.0f));
        CardPositionType cardPositionType2 = CardPositionType.RIGHT;
        hashMap.put(cardPositionType2, new a.C0238a(y(cardPositionType2), 0.1f));
        CardPositionType cardPositionType3 = CardPositionType.UP;
        hashMap.put(cardPositionType3, new a.C0238a(y(cardPositionType3), 0.0f));
        CardPositionType cardPositionType4 = CardPositionType.DOWN;
        hashMap.put(cardPositionType4, new a.C0238a(y(cardPositionType4), 0.0f));
        u(hashMap, this.l);
        if (this.C) {
            w(hashMap, this.l);
        }
        float f2 = -100000.0f;
        for (Map.Entry<CardPositionType, a.C0238a> entry : hashMap.entrySet()) {
            agh.h(TAG, entry.getKey() + " -> " + entry.getValue().b());
            if (entry.getValue().b() > f2) {
                f2 = entry.getValue().b();
                CardPositionType key = entry.getKey();
                ckf.f(key, "entry.key");
                cardPositionType2 = key;
                z = true;
            }
        }
        agh.h(TAG, z + " -> tmpType " + cardPositionType2);
        a.C0238a aVar = hashMap.get(cardPositionType2);
        Point a2 = aVar == null ? null : aVar.a();
        return a2 == null ? y(cardPositionType2) : a2;
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        agh.h(TAG, ckf.p("destroy begin ", Integer.valueOf(this.c.f())));
        this.s.set(true);
        this.q.set(false);
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.i;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            valueAnimator2.removeAllListeners();
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.g;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllListeners();
            valueAnimator3.removeAllUpdateListeners();
            valueAnimator3.cancel();
        }
        this.J.removeCallbacksAndMessages(null);
        this.l.removeView(this.o);
        this.l.removeView(this.n);
        this.k.removeAllViews();
        com.taobao.android.weex_framework.a aVar = this.p;
        if (aVar != null) {
            aVar.destroy();
        }
        this.c.l();
        agh.h(TAG, ckf.p("destroy finish ", Integer.valueOf(this.c.f())));
    }
}
