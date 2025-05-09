package com.taobao.android.weex_uikit.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.instance.WeexMUSInstance;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_uikit.ui.a;
import com.taobao.android.weex_uikit.ui.b;
import com.taobao.android.weex_uikit.widget.border.BorderProp;
import com.taobao.weex.common.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.avu;
import tb.ax0;
import tb.bjd;
import tb.cwh;
import tb.dvu;
import tb.dwh;
import tb.evu;
import tb.fvu;
import tb.hvu;
import tb.hxh;
import tb.j5k;
import tb.jpc;
import tb.jvu;
import tb.kyc;
import tb.my0;
import tb.qvu;
import tb.qwh;
import tb.t2o;
import tb.tjc;
import tb.tvh;
import tb.tvu;
import tb.vvh;
import tb.wvh;
import tb.wwh;
import tb.xn1;
import tb.xuu;
import tb.yio;
import tb.ywh;
import tb.zuu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UINode extends hvu implements INode, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean added;
    private my0 animationHolder;
    private ywh attachedTree;
    private qwh<avu> attributes;
    private qwh<dvu> extras;
    private MUSDKInstance instance;
    private boolean isMeasured;
    private boolean isRootNode;
    private tjc layoutProcessor;
    private xuu layoutState;
    private volatile String mLogName;
    private jpc<UINode> nodeHolder;
    private int nodeId;
    private qwh<evu> nodeInfo;
    private boolean notifyEngineRelayout;
    private UINode parentNode;
    private tvu styleHelper;
    private boolean transformApplied;
    private boolean updatingStyle;
    private Paint borderPaint = new Paint(1);
    private ax0 animNodeInfo = new ax0(this);
    private Rect globalVisibleRect = new Rect();
    private boolean locationChanged = true;
    private int previousParentLeft = -1;
    private int previousParentTop = -1;
    private boolean mountState = false;
    private boolean mHasDelayedAppear = false;
    private boolean mHasDelayedViewAppear = false;
    private boolean mHasAppearSent = false;
    private boolean mHasViewAppearSent = false;
    private final yio mAppearRunnable = new a();
    private final yio mViewAppearRunnable = new b();
    private bjd renderNode = qvu.a(this);
    private final j5k touchHelper = onCreateTouchHelper();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/UINode$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (UINode.access$000(UINode.this)) {
                UINode.access$102(UINode.this, true);
                UINode.this.fireEvent("appear", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/UINode$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (UINode.access$000(UINode.this)) {
                UINode.access$202(UINode.this, true);
                UINode.this.fireEvent(Constants.Event.VIEWAPPEAR, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f10001a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ float j;
        public final /* synthetic */ float k;
        public final /* synthetic */ float l;
        public final /* synthetic */ float m;
        public final /* synthetic */ float n;
        public final /* synthetic */ float o;
        public final /* synthetic */ float p;
        public final /* synthetic */ float q;
        public final /* synthetic */ float r;

        public c(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
            this.f10001a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = f;
            this.f = f2;
            this.g = f3;
            this.h = f4;
            this.i = f5;
            this.j = f6;
            this.k = f7;
            this.l = f8;
            this.m = f9;
            this.n = f10;
            this.o = f11;
            this.p = f12;
            this.q = f13;
            this.r = f14;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            try {
                UINode uINode = UINode.this;
                int i = this.f10001a;
                uINode.setTranslateY((int) (i + ((this.b - i) * ((Float) valueAnimator.getAnimatedValue()).floatValue())));
                UINode uINode2 = UINode.this;
                int i2 = this.c;
                uINode2.setTranslateX((int) (i2 + ((this.d - i2) * ((Float) valueAnimator.getAnimatedValue()).floatValue())));
                ax0 access$300 = UINode.access$300(UINode.this);
                float f = this.e;
                access$300.z(f + ((this.f - f) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                ax0 access$3002 = UINode.access$300(UINode.this);
                float f2 = this.g;
                access$3002.A(f2 + ((this.h - f2) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                ax0 access$3003 = UINode.access$300(UINode.this);
                float f3 = this.i;
                access$3003.w(f3 + ((this.j - f3) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                ax0 access$3004 = UINode.access$300(UINode.this);
                float f4 = this.k;
                access$3004.x(f4 + ((this.l - f4) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                ax0 access$3005 = UINode.access$300(UINode.this);
                float f5 = this.m;
                access$3005.y(f5 + ((this.n - f5) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                ax0 access$3006 = UINode.access$300(UINode.this);
                float f6 = this.o;
                access$3006.B(f6 + ((this.p - f6) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                ax0 access$3007 = UINode.access$300(UINode.this);
                float f7 = this.q;
                access$3007.C(f7 + ((this.r - f7) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                UINode uINode3 = UINode.this;
                if (uINode3.mounted) {
                    uINode3.invalidate();
                }
            } catch (Exception e) {
                dwh.i(e);
                wvh.a().b("UINode,transform, onAnimationUpdate", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;
        public final /* synthetic */ float i;
        public final /* synthetic */ float j;
        public final /* synthetic */ float k;
        public final /* synthetic */ float l;

        public d(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            this.d = i;
            this.e = i2;
            this.f = f;
            this.g = f2;
            this.h = f3;
            this.i = f4;
            this.j = f5;
            this.k = f6;
            this.l = f7;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/UINode$4");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            try {
                UINode.this.setTranslateY(this.d);
                UINode.this.setTranslateX(this.e);
                UINode.access$300(UINode.this).z(this.f);
                UINode.access$300(UINode.this).A(this.g);
                UINode.access$300(UINode.this).w(this.h);
                UINode.access$300(UINode.this).x(this.i);
                UINode.access$300(UINode.this).y(this.j);
                UINode.access$300(UINode.this).B(this.k);
                UINode.access$300(UINode.this).C(this.l);
                UINode uINode = UINode.this;
                if (uINode.mounted) {
                    uINode.invalidate();
                }
            } catch (Exception e) {
                dwh.i(e);
                wvh.a().b("UINode,transform, onAnimationCancel", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f10002a;
        public final /* synthetic */ float b;

        public e(float f, float f2) {
            this.f10002a = f;
            this.b = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            try {
                UINode uINode = UINode.this;
                float f = this.f10002a;
                uINode.setOpacity(f + ((this.b - f) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                UINode uINode2 = UINode.this;
                if (uINode2.mounted) {
                    uINode2.invalidate();
                }
            } catch (Exception e) {
                dwh.i(e);
                wvh.a().b("UINode,transform, onAnimationUpdate", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f10003a;
        public final /* synthetic */ int b;

        public f(int i, int i2) {
            this.f10003a = i;
            this.b = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            try {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int red = Color.red(this.f10003a);
                int green = Color.green(this.f10003a);
                int blue = Color.blue(this.f10003a);
                int alpha = Color.alpha(this.f10003a);
                UINode.this.getNodeInfo().W(Color.argb((int) (alpha + ((Color.alpha(this.b) - alpha) * floatValue)), (int) (red + ((Color.red(this.b) - red) * floatValue)), (int) (green + ((Color.green(this.b) - green) * floatValue)), (int) (blue + ((Color.blue(this.b) - blue) * floatValue))));
                UINode uINode = UINode.this;
                if (uINode.mounted) {
                    uINode.invalidate();
                }
            } catch (Exception e) {
                dwh.i(e);
                wvh.a().b("UINode,transform, onAnimationUpdate", e);
            }
        }
    }

    static {
        t2o.a(986710075);
        t2o.a(982516224);
        t2o.a(986710095);
        t2o.a(986710040);
    }

    public UINode(int i) {
        super(null);
        this.nodeId = i;
        createHolders();
        this.borderPaint.setStyle(Paint.Style.STROKE);
        onNodeCreate(this);
    }

    public static /* synthetic */ boolean access$000(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29d5af5", new Object[]{uINode})).booleanValue();
        }
        return uINode.mountState;
    }

    public static /* synthetic */ boolean access$102(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b8c9c8a", new Object[]{uINode, new Boolean(z)})).booleanValue();
        }
        uINode.mHasAppearSent = z;
        return z;
    }

    public static /* synthetic */ boolean access$202(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b16368b", new Object[]{uINode, new Boolean(z)})).booleanValue();
        }
        uINode.mHasViewAppearSent = z;
        return z;
    }

    public static /* synthetic */ ax0 access$300(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ax0) ipChange.ipc$dispatch("e4d32067", new Object[]{uINode});
        }
        return uINode.animNodeInfo;
    }

    private void createHolders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7bc2b2", new Object[]{this});
            return;
        }
        qwh<avu> qwhVar = new qwh<>(this);
        this.attributes = qwhVar;
        qwhVar.d(createAttribute(false), createAttribute(true));
        qwh<dvu> qwhVar2 = new qwh<>(this);
        this.extras = qwhVar2;
        qwhVar2.d(createExtra(false), createExtra(true));
        qwh<evu> qwhVar3 = new qwh<>(this);
        this.nodeInfo = qwhVar3;
        qwhVar3.d(createNodeInfo(false), createNodeInfo(true));
    }

    private evu createNodeInfo(boolean z) {
        evu evuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (evu) ipChange.ipc$dispatch("665b4a6b", new Object[]{this, new Boolean(z)});
        }
        if (vvh.f30279a) {
            evuVar = new fvu(this);
        } else {
            evuVar = new evu(this);
        }
        if (z) {
            evuVar.h();
        }
        return evuVar;
    }

    private void drawDrawable(Canvas canvas, int i, int i2, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37260a80", new Object[]{this, canvas, new Integer(i), new Integer(i2), drawable});
            return;
        }
        if (!(i == 0 && i2 == 0)) {
            canvas.translate(i, i2);
        }
        drawable.draw(canvas);
        if (i != 0 || i2 != 0) {
            canvas.translate(-i, -i2);
        }
    }

    private void drawView(Canvas canvas, MUSNodeHost mUSNodeHost, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f418a60", new Object[]{this, canvas, mUSNodeHost, view});
            return;
        }
        int i = getGlobalVisibleRect().left;
        int i2 = getGlobalVisibleRect().top;
        int drawTranslateX = i + mUSNodeHost.getDrawTranslateX();
        int drawTranslateY = i2 + mUSNodeHost.getDrawTranslateY();
        if (!(drawTranslateX == 0 && drawTranslateY == 0)) {
            canvas.translate(-drawTranslateX, -drawTranslateY);
        }
        mUSNodeHost.drawChild(view, canvas);
        if (drawTranslateX != 0 || drawTranslateY != 0) {
            canvas.translate(drawTranslateX, drawTranslateY);
        }
    }

    public static /* synthetic */ Object ipc$super(UINode uINode, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -940796597) {
            super.unmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == 26733618) {
            super.mount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_uikit/ui/UINode");
        }
    }

    private ValueAnimator makeValueAnimator(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("b3054b3c", new Object[]{this, aVar});
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(aVar.c);
        ofFloat.setStartDelay(aVar.b);
        ofFloat.setInterpolator(com.taobao.android.weex_uikit.ui.b.a(aVar));
        return ofFloat;
    }

    private void onAriaHidden(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abbd406", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            getNodeInfo().Q(false);
        } else {
            getNodeInfo().Q(mUSValue.getBoolValue());
        }
    }

    private void onAriaLabel(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77056100", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            getNodeInfo().R("");
        } else {
            getNodeInfo().R(mUSValue.getStringValue());
        }
    }

    private void onAriaRole(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca1b8d2", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            getNodeInfo().S(null);
        } else {
            getNodeInfo().S(mUSValue.getStringValue());
        }
    }

    private void relayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa10524", new Object[]{this});
            return;
        }
        this.notifyEngineRelayout = false;
        ((WeexMUSInstance) ((tvh) getInstance()).j()).dirtyNodeAndReLayout(getNodeId(), true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r3.equals(com.taobao.weex.common.Constants.Name.ARIA_LABEL) == false) goto L_0x0032;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean updateArias(tb.wwh r7) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_uikit.ui.UINode.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "f234a88b"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r6
            r0[r1] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001c:
            java.lang.String r3 = r7.f30972a
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0025
            return r2
        L_0x0025:
            java.lang.String r3 = r7.f30972a
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1551689441: goto L_0x0053;
                case -1111969773: goto L_0x0048;
                case -863700117: goto L_0x003f;
                case -9888733: goto L_0x0034;
                default: goto L_0x0032;
            }
        L_0x0032:
            r0 = -1
            goto L_0x005d
        L_0x0034:
            java.lang.String r0 = "className"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x003d
            goto L_0x0032
        L_0x003d:
            r0 = 3
            goto L_0x005d
        L_0x003f:
            java.lang.String r5 = "ariaLabel"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x005d
            goto L_0x0032
        L_0x0048:
            java.lang.String r0 = "ariaHidden"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0051
            goto L_0x0032
        L_0x0051:
            r0 = 1
            goto L_0x005d
        L_0x0053:
            java.lang.String r0 = "ariaRole"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x005c
            goto L_0x0032
        L_0x005c:
            r0 = 0
        L_0x005d:
            switch(r0) {
                case 0: goto L_0x006e;
                case 1: goto L_0x0068;
                case 2: goto L_0x0062;
                case 3: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            return r2
        L_0x0061:
            return r1
        L_0x0062:
            com.taobao.android.weex_framework.MUSValue r7 = r7.b
            r6.onAriaLabel(r7)
            return r1
        L_0x0068:
            com.taobao.android.weex_framework.MUSValue r7 = r7.b
            r6.onAriaHidden(r7)
            return r1
        L_0x006e:
            com.taobao.android.weex_framework.MUSValue r7 = r7.b
            r6.onAriaRole(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.ui.UINode.updateArias(tb.wwh):boolean");
    }

    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
            return;
        }
        throw new RuntimeException("addChild(UINode child) is not supported");
    }

    public void addOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492482f6", new Object[]{this, onClickListener});
        } else {
            this.touchHelper.c(onClickListener);
        }
    }

    public void addViewNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf16e8f", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public void bindNodeHolder(jpc jpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b60f60", new Object[]{this, jpcVar});
        } else {
            this.nodeHolder = jpcVar;
        }
    }

    public void collectBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f091b6", new Object[]{this, list});
            return;
        }
        this.nodeInfo.b(list);
        this.attributes.b(list);
        this.extras.b(list);
        dispatchBatchTasks(list);
        postCollectBatchTask(list);
    }

    public avu createAttribute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (avu) ipChange.ipc$dispatch("136741d5", new Object[]{this, new Boolean(z)});
        }
        avu avuVar = new avu(this);
        if (z) {
            avuVar.h();
        }
        return avuVar;
    }

    public dvu createExtra(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dvu) ipChange.ipc$dispatch("8cc2c855", new Object[]{this, new Boolean(z)});
        }
        dvu dvuVar = new dvu(this);
        if (z) {
            dvuVar.h();
        }
        return dvuVar;
    }

    public void dispatchAccessibleChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edca74b", new Object[]{this});
        }
    }

    public void dispatchBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e1c906", new Object[]{this, list});
        }
    }

    public void dispatchDraw(MUSNodeHost mUSNodeHost, Canvas canvas, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96d02bd", new Object[]{this, mUSNodeHost, canvas, new Float(f2)});
        }
    }

    public void dispatchMethod(String str, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735196f6", new Object[]{this, str, mUSValueArr});
        } else {
            onDispatchMethod(this, str, mUSValueArr);
        }
    }

    public void dispatchMethodToMain(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1417dd34", new Object[]{this, runnable});
        } else if (getInstance() != null && !getInstance().isDestroyed()) {
            getInstance().postTaskToMain(runnable);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0ce5165", new Object[]{this, motionEvent, view})).booleanValue();
        }
        return this.touchHelper.d(motionEvent, view);
    }

    public final void draw(MUSNodeHost mUSNodeHost, Canvas canvas, int i, int i2, boolean z, float f2) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be60289", new Object[]{this, mUSNodeHost, canvas, new Integer(i), new Integer(i2), new Boolean(z), new Float(f2)});
        } else if (this.mounted) {
            int N = getNodeInfo().N();
            int w = getNodeInfo().w();
            if (N != 0 && w != 0) {
                if (i == 0 && i2 == 0) {
                    z2 = false;
                } else {
                    canvas.translate(i, i2);
                    z2 = true;
                }
                if (isRenderNodeEnabled()) {
                    this.renderNode.b(canvas, mUSNodeHost, N, w, f2);
                } else {
                    draw(canvas, mUSNodeHost, false, z, f2);
                }
                if (z2) {
                    canvas.translate(-i, -i2);
                }
            }
        }
    }

    public void drawBackground(Canvas canvas, float f2) {
        int i;
        int alpha;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c042d4", new Object[]{this, canvas, new Float(f2)});
        } else if (getNodeInfo().r() != null) {
            Rect bounds = getNodeInfo().r().getBounds();
            if (isRenderNodeEnabled() || (alpha = (int) (getAlpha() * f2)) >= 255) {
                i = -1;
            } else {
                i = canvas.saveLayerAlpha(0.0f, 0.0f, bounds.width(), bounds.height(), alpha);
            }
            getNodeInfo().r().draw(canvas);
            if (i != -1) {
                canvas.restoreToCount(i);
            }
        }
    }

    public void drawBorder(Canvas canvas, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4720e352", new Object[]{this, canvas, new Float(f2)});
            return;
        }
        BorderProp s = getNodeInfo().s(false);
        if (s != null) {
            if (!isRenderNodeEnabled()) {
                this.borderPaint.setAlpha((int) (getAlpha() * f2));
            }
            s.b(canvas, this.borderPaint);
        }
    }

    public void drawWithRenderNode(MUSNodeHost mUSNodeHost, Canvas canvas, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c455a775", new Object[]{this, mUSNodeHost, canvas, new Boolean(z)});
        } else {
            draw(canvas, mUSNodeHost, !z, false, 1.0f);
        }
    }

    public UINode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("8513f867", new Object[]{this, new Integer(i)});
        }
        if (this.nodeId == i) {
            return this;
        }
        return null;
    }

    public void fireEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
        } else if (getInstance() != null && !getInstance().isDestroyed() && hasEvent(str)) {
            getInstance().fireEventOnNode(getNodeId(), str, jSONObject);
        }
    }

    public void fireNativeEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc7cdc8", new Object[]{this, str, str2});
            return;
        }
        for (UINode uINode = this.parentNode; uINode != null; uINode = uINode.parentNode) {
            if (uINode instanceof kyc) {
                ((kyc) uINode).fireNativeEvent(str, str2);
                return;
            }
        }
        if (getInstance() != null) {
            getInstance().fireNativeEvent(str, str2);
        }
    }

    public int getAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf8c822", new Object[]{this})).intValue();
        }
        return (int) (getOpacity() * 255.0f);
    }

    public ax0 getAnimNodeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ax0) ipChange.ipc$dispatch("618bfe57", new Object[]{this});
        }
        return this.animNodeInfo;
    }

    public MUSValue getArgument(MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("4793a668", new Object[]{this, mUSValueArr, new Integer(i)});
        }
        if (i >= mUSValueArr.length) {
            return null;
        }
        return mUSValueArr[i];
    }

    public String getAriaLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bde13564", new Object[]{this});
        }
        if (getNodeInfo().O()) {
            return null;
        }
        String p = getNodeInfo().p();
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        String str = (String) getExtra(Constants.Name.ARIA_LABEL);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (hasEvent("click")) {
            return "";
        }
        return null;
    }

    public ywh getAttachedTree() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywh) ipChange.ipc$dispatch("deb460c1", new Object[]{this});
        }
        ywh ywhVar = this.attachedTree;
        if (ywhVar != null) {
            return ywhVar;
        }
        UINode uINode = this.parentNode;
        if (uINode != null) {
            return uINode.getAttachedTree();
        }
        return null;
    }

    public final <T> T getAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("60511e1b", new Object[]{this, str});
        }
        T t = (T) this.attributes.c().f(str);
        if (t != null) {
            return t;
        }
        return (T) getDefaultAttribute(str);
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public int getBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e4c91b", new Object[]{this})).intValue();
        }
        return getNodeInfo().t();
    }

    public UINode getChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)});
        }
        throw new RuntimeException("getChildAt(int index) is not supported");
    }

    public int getChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        throw new RuntimeException("getChildCount() is not supported");
    }

    public int getContentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7283ec4", new Object[]{this})).intValue();
        }
        BorderProp s = getNodeInfo().s(false);
        if (s == null) {
            return getLayoutHeight();
        }
        return (getLayoutHeight() - s.g(1)) - s.g(3);
    }

    public int getContentWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ffaa3d", new Object[]{this})).intValue();
        }
        BorderProp s = getNodeInfo().s(false);
        if (s == null) {
            return getLayoutWidth();
        }
        return (getLayoutWidth() - s.g(0)) - s.g(2);
    }

    public Object getDefaultAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("acae82d0", new Object[]{this, str});
        }
        return null;
    }

    public final <T> T getExtra(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("91ec6527", new Object[]{this, str});
        }
        return (T) this.extras.c().f(str);
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public Rect getGlobalVisibleRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("7602996d", new Object[]{this});
        }
        return this.globalVisibleRect;
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public MUSDKInstance getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("ab68dab8", new Object[]{this});
        }
        return this.instance;
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public final cwh<UINode> getInvoker(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cwh) ipChange.ipc$dispatch("5cb65763", new Object[]{this, mUSValue});
        }
        jpc<UINode> jpcVar = this.nodeHolder;
        if (jpcVar == null) {
            return null;
        }
        return jpcVar.getMethodInvoker(mUSValue.getStringValue());
    }

    public int getLayoutHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d58ffc61", new Object[]{this})).intValue();
        }
        return getNodeInfo().w();
    }

    public xuu getLayoutState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xuu) ipChange.ipc$dispatch("9c4d181d", new Object[]{this});
        }
        xuu xuuVar = this.layoutState;
        if (xuuVar != null) {
            return xuuVar;
        }
        ywh attachedTree = getAttachedTree();
        if (attachedTree != null) {
            return attachedTree.p();
        }
        return null;
    }

    public int getLayoutWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a60b4500", new Object[]{this})).intValue();
        }
        return getNodeInfo().N();
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public int getLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue();
        }
        return getNodeInfo().x();
    }

    public String getLogName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a11b60e0", new Object[]{this});
        }
        return this.mLogName;
    }

    public String getNativeState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d706e02b", new Object[]{this, str});
        }
        UINode uINode = this;
        for (UINode uINode2 = this.parentNode; uINode2 != null; uINode2 = uINode2.parentNode) {
            if (uINode2 instanceof kyc) {
                return ((kyc) uINode2).getNativeState(str, uINode);
            }
            uINode = uINode2;
        }
        if (getInstance() != null) {
            return getInstance().getNativeState(str);
        }
        return "";
    }

    public int getNodeId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("246ed4ad", new Object[]{this})).intValue();
        }
        return this.nodeId;
    }

    public evu getNodeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (evu) ipChange.ipc$dispatch("53ca1977", new Object[]{this});
        }
        return this.nodeInfo.c();
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public float getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cc", new Object[]{this})).floatValue();
        }
        return this.animNodeInfo.l();
    }

    public Rect getPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("1a2132ab", new Object[]{this});
        }
        return getNodeInfo().A();
    }

    public UINode getParentNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("3ba74e01", new Object[]{this});
        }
        return this.parentNode;
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public int getRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d449e0", new Object[]{this})).intValue();
        }
        return getNodeInfo().F();
    }

    public float getRotate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e97cf448", new Object[]{this})).floatValue();
        }
        return this.animNodeInfo.m();
    }

    public float getRotateX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4874231e", new Object[]{this})).floatValue();
        }
        return this.animNodeInfo.n();
    }

    public float getRotateY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48823a9f", new Object[]{this})).floatValue();
        }
        return this.animNodeInfo.o();
    }

    public float getScaleX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("606f85bb", new Object[]{this})).floatValue();
        }
        return this.animNodeInfo.p();
    }

    public float getScaleY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("607d9d3c", new Object[]{this})).floatValue();
        }
        return this.animNodeInfo.q();
    }

    public float getSkewX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b41cbb4f", new Object[]{this})).floatValue();
        }
        return this.animNodeInfo.r();
    }

    public float getSkewY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b42ad2d0", new Object[]{this})).floatValue();
        }
        return this.animNodeInfo.s();
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public int getTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9c9cf19", new Object[]{this})).intValue();
        }
        return getNodeInfo().G();
    }

    public int getTranslateX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1cd153a", new Object[]{this})).intValue();
        }
        return this.animNodeInfo.t();
    }

    public int getTranslateY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1db2cbb", new Object[]{this})).intValue();
        }
        return this.animNodeInfo.u();
    }

    public boolean hasEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d65e2b5", new Object[]{this, str})).booleanValue();
        }
        return getNodeInfo().n(str);
    }

    public boolean hasViewChild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bf9c208", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public int indexOf(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bfeac2b", new Object[]{this, uINode})).intValue();
        }
        throw new RuntimeException("indexOf(UINode child) is not supported");
    }

    public void invalidate() {
        ywh ywhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
            return;
        }
        bjd bjdVar = this.renderNode;
        if (bjdVar != null) {
            bjdVar.e();
        }
        UINode uINode = this.parentNode;
        if (uINode != null) {
            uINode.invalidate();
            if (isRoot() && (ywhVar = this.attachedTree) != null && ywhVar.n() != null) {
                this.attachedTree.n().invalidate();
                return;
            }
            return;
        }
        ywh ywhVar2 = this.attachedTree;
        if (ywhVar2 != null && ywhVar2.n() != null) {
            this.attachedTree.n().invalidate();
        }
    }

    public boolean isAccessibilityBlocked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f230d93", new Object[]{this})).booleanValue();
        }
        UINode uINode = this.parentNode;
        if (uINode == null || !uINode.shouldBlock()) {
            return false;
        }
        return !hasEvent("click");
    }

    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isMeasured() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc6eaa9b", new Object[]{this})).booleanValue();
        }
        return this.isMeasured;
    }

    public boolean isMountState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67b2904d", new Object[]{this})).booleanValue();
        }
        return this.mountState;
    }

    public boolean isRenderNodeEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("491d646a", new Object[]{this})).booleanValue();
        }
        if (isRoot() || this.renderNode == null || hasViewChild() || !this.renderNode.isEnabled()) {
            return false;
        }
        return true;
    }

    public boolean isRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6b36bb7", new Object[]{this})).booleanValue();
        }
        return this.isRootNode;
    }

    @Override // tb.hvu
    public void mount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197ec32", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        bjd bjdVar = this.renderNode;
        if (bjdVar != null) {
            bjdVar.attach();
            this.renderNode.setContentDescription(getAriaLabel());
        }
        tryApplyTransform(false);
        super.mount(mUSDKInstance, obj);
        my0 my0Var = this.animationHolder;
        if (my0Var != null) {
            my0Var.c();
        }
        if (getNodeType() == UINodeType.VIEW) {
            notifyAddViewNode(true);
        }
    }

    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        throw new RuntimeException("moveNode(int fromIndex, int toIndex) is not supported");
    }

    public void notifyAccessibleChanged(boolean z) {
        ywh ywhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9078b278", new Object[]{this, new Boolean(z)});
        } else if (!z || !((ywhVar = this.attachedTree) == null || ywhVar.n() == null || !this.attachedTree.n().isAccessibilityEnabled())) {
            dispatchAccessibleChanged();
        }
    }

    public void notifyAddViewNode(boolean z) {
        UINode uINode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c56b3f8e", new Object[]{this, new Boolean(z)});
        } else if ((z || hasViewChild()) && !viewSupportRenderNode() && (uINode = this.parentNode) != null) {
            uINode.addViewNode();
        }
    }

    public void notifyEngineRelayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ee73af", new Object[]{this});
        } else if (!getInstance().isDestroyed()) {
            this.notifyEngineRelayout = true;
            if (!this.updatingStyle) {
                relayout();
            }
        }
    }

    public void notifyLocationChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243dd0f5", new Object[]{this});
            return;
        }
        onLocationChange();
        requestLayout();
        xuu xuuVar = this.layoutState;
        if (xuuVar != null) {
            xuuVar.b();
            this.layoutState.k();
        }
        ywh attachedTree = getAttachedTree();
        if (attachedTree != null && (attachedTree.n() instanceof MUSView)) {
            attachedTree.n().getMountState().c();
            attachedTree.n().requestLayout();
        }
        this.locationChanged = true;
    }

    public void notifyRemoveViewNode(boolean z) {
        UINode uINode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e28b119", new Object[]{this, new Boolean(z)});
        } else if ((z || hasViewChild()) && !viewSupportRenderNode() && (uINode = this.parentNode) != null) {
            uINode.removeViewNode();
        }
    }

    public void onBindInstance(UINode uINode, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362d97e6", new Object[]{this, uINode, mUSDKInstance});
        }
    }

    public void onBorderChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1089fd82", new Object[]{this});
        } else if (this.renderNode != null && isRenderNodeEnabled()) {
            this.renderNode.updateBorderRadius();
        }
    }

    @Override // tb.hvu
    public void onBoundsChange(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb13740b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        bjd bjdVar = this.renderNode;
        if (bjdVar != null) {
            bjdVar.a(i, i2, i3, i4);
        }
    }

    public j5k onCreateTouchHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5k) ipChange.ipc$dispatch("bd2f39c4", new Object[]{this});
        }
        return new j5k(this);
    }

    public void onDispatchMethod(UINode uINode, String str, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d011af1", new Object[]{this, uINode, str, mUSValueArr});
        }
    }

    public void onLocationChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df1a0e0b", new Object[]{this});
        }
    }

    public void onNodeCreate(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78938224", new Object[]{this, uINode});
        }
    }

    public void onParentAccessibleChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861893fe", new Object[]{this, new Boolean(z)});
            return;
        }
        bjd bjdVar = this.renderNode;
        if (bjdVar != null) {
            bjdVar.c(z);
        }
        dispatchAccessibleChanged();
    }

    public void onRefreshAttribute(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c7823", new Object[]{this, uINode, obj, str, obj2});
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c03524e0", new Object[]{this, motionEvent, view})).booleanValue();
        }
        return this.touchHelper.o(motionEvent, view);
    }

    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        return false;
    }

    public void onUpdateExtra(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a127bb", new Object[]{this, uINode, obj, str, obj2});
        }
    }

    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public void postCollectBatchTask(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27c658d", new Object[]{this, list});
        }
    }

    public void refreshAttribute(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fdb07d", new Object[]{this, map});
        } else if (this.nodeHolder == null && !isGenerated()) {
            dwh.v(getClass().getSimpleName().concat(" onUpdateAttr node holder is null"));
        } else if (isMounted()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (isGenerated()) {
                    onRefreshAttribute(this, getMountContent(), entry.getKey(), entry.getValue());
                } else {
                    onRefreshAttribute(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public void registerNativeStateListener(String str, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a201246", new Object[]{this, str, bVar});
            return;
        }
        UINode uINode = this;
        for (UINode uINode2 = this.parentNode; uINode2 != null; uINode2 = uINode2.parentNode) {
            if (uINode2 instanceof kyc) {
                ((kyc) uINode2).registerNativeStateListener(str, uINode, bVar);
                return;
            } else {
                uINode = uINode2;
            }
        }
        if (getInstance() != null) {
            getInstance().registerNativeStateListener(str, bVar);
        }
    }

    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
            return;
        }
        throw new RuntimeException("removeChildAt(int index) is not supported");
    }

    public void removeClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b1931a", new Object[]{this, onClickListener});
        } else {
            this.touchHelper.r(onClickListener);
        }
    }

    public void removeViewNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2331f2", new Object[]{this});
        }
    }

    public void removedFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee0cbfb", new Object[]{this});
            return;
        }
        xuu layoutState = getLayoutState();
        if (layoutState != null) {
            layoutState.l(this);
            this.layoutState = null;
        }
        ywh attachedTree = getAttachedTree();
        if (isMounted() && attachedTree != null && (attachedTree.n() instanceof MUSView)) {
            attachedTree.n().getMountState().m(this, true);
            try {
                UINode uINode = this.parentNode;
                if (uINode != null) {
                    uINode.invalidate();
                }
            } catch (Exception unused) {
            }
        }
        setParentNode(null);
        this.added = false;
    }

    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
            return;
        }
        ywh ywhVar = this.attachedTree;
        if (ywhVar == null || !(ywhVar.n() instanceof MUSView)) {
            UINode uINode = this.parentNode;
            if (uINode != null) {
                uINode.requestLayout();
                return;
            }
            return;
        }
        MUSView n = this.attachedTree.n();
        n.getMountState().c();
        n.requestLayout();
        n.invalidate();
    }

    public void setAnimationHolder(my0 my0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527779c9", new Object[]{this, my0Var});
            return;
        }
        my0 my0Var2 = this.animationHolder;
        if (my0Var2 != null) {
            my0Var2.d();
        }
        this.animationHolder = my0Var;
        if (this.mounted) {
            my0Var.c();
        }
    }

    public void setAttachedTree(ywh ywhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c00767", new Object[]{this, ywhVar});
        } else {
            this.attachedTree = ywhVar;
        }
    }

    public void setAttribute(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd20287", new Object[]{this, str, obj});
        } else if (!dwh.r() || !hxh.a()) {
            this.attributes.c().i(str, obj);
        } else {
            throw new RuntimeException("this method can only called from worker thread");
        }
    }

    public void setClickable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d19a8d", new Object[]{this, new Boolean(z)});
        } else {
            this.touchHelper.t(z);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e19e070", new Object[]{this, charSequence});
        } else if (this.mounted) {
            bjd bjdVar = this.renderNode;
            if (bjdVar != null) {
                bjdVar.setContentDescription(charSequence);
            }
        } else if (dwh.r()) {
            dwh.e("you should call setContentDescription after mounted");
        }
    }

    public void setExtra(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df7f6fb", new Object[]{this, str, obj});
        } else {
            this.extras.c().i(str, obj);
        }
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public void setInstance(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5df198", new Object[]{this, mUSDKInstance});
            return;
        }
        this.instance = mUSDKInstance;
        if (mUSDKInstance != null) {
            setLogName(mUSDKInstance.getJustCreateTagName());
        }
        onBindInstance(this, mUSDKInstance);
    }

    public void setLayoutProcessor(tjc tjcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d42bb2", new Object[]{this, tjcVar});
        } else {
            this.layoutProcessor = tjcVar;
        }
    }

    public void setLogName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895443fe", new Object[]{this, str});
        } else {
            this.mLogName = str;
        }
    }

    public void setLongClickListener(View.OnLongClickListener onLongClickListener) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713da630", new Object[]{this, onLongClickListener});
            return;
        }
        j5k j5kVar = this.touchHelper;
        if (onLongClickListener == null) {
            z = false;
        }
        j5kVar.x(z);
        this.touchHelper.z(onLongClickListener);
        if (getMountContent() instanceof View) {
            jvu.e(this, (View) getMountContent());
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
            return;
        }
        j5k j5kVar = this.touchHelper;
        if (onClickListener == null) {
            z = false;
        }
        j5kVar.t(z);
        this.touchHelper.y(onClickListener);
        if (getMountContent() instanceof View) {
            jvu.d(this, (View) getMountContent());
        }
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public void setOpacity(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c5f5870", new Object[]{this, new Float(f2)});
            return;
        }
        this.animNodeInfo.v(f2);
        if (this.mounted) {
            invalidate();
        }
    }

    public void setPadding(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98ee783", new Object[]{this, rect});
        } else {
            jvu.f(this, rect);
        }
    }

    public void setParentNode(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6dad3", new Object[]{this, uINode});
        } else {
            this.parentNode = uINode;
        }
    }

    public void setRootNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f513d20d", new Object[]{this});
        } else {
            this.isRootNode = true;
        }
    }

    public void setTranslateX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beaca010", new Object[]{this, new Integer(i)});
            return;
        }
        this.animNodeInfo.D(i);
        if (this.mounted) {
            invalidate();
        }
    }

    public void setTranslateY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06178af", new Object[]{this, new Integer(i)});
            return;
        }
        this.animNodeInfo.E(i);
        if (this.mounted) {
            invalidate();
        }
    }

    public void setView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205edae4", new Object[]{this, view});
            return;
        }
        bjd bjdVar = this.renderNode;
        if (bjdVar != null) {
            bjdVar.d(view);
        }
    }

    public boolean shouldBlock() {
        UINode uINode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f736fe25", new Object[]{this})).booleanValue();
        }
        if (hasEvent("click") || ((uINode = this.parentNode) != null && uINode.shouldBlock())) {
            return true;
        }
        return false;
    }

    public boolean shouldClip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f29c16ae", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        Rect globalVisibleRect = getGlobalVisibleRect();
        return "<" + getClass().getSimpleName() + ">(" + this.nodeId + "){" + globalVisibleRect.left + "," + globalVisibleRect.top + "," + globalVisibleRect.right + "," + globalVisibleRect.bottom + "}";
    }

    public void tryApplyTransform(boolean z) {
        List<b.a> list;
        List<a.C0521a> list2;
        float f2;
        int i;
        float f3;
        int i2;
        float f4;
        float f5;
        float f6;
        float f7;
        int i3;
        float f8;
        float f9;
        int i4;
        float f10;
        float f11;
        float f12;
        int i5;
        float f13;
        float f14;
        boolean z2;
        boolean z3;
        UINode uINode;
        float f15;
        float f16;
        float f17;
        UINode uINode2 = this;
        boolean z4 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e944c94", new Object[]{uINode2, new Boolean(z)});
        } else if (z || !uINode2.transformApplied) {
            uINode2.transformApplied = true;
            String H = getNodeInfo().H();
            String I = getNodeInfo().I();
            try {
                list = com.taobao.android.weex_uikit.ui.b.e(I, getNodeInfo().L(), getNodeInfo().K(), getNodeInfo().J(), getNodeInfo().M());
            } catch (Exception e2) {
                dwh.y("[Render], invalid attribute transition: " + I, e2);
                list = null;
            }
            float z5 = getNodeInfo().z();
            xn1 r = getNodeInfo().r();
            int o = r == null ? 0 : r.o();
            try {
                list2 = com.taobao.android.weex_uikit.ui.a.c(H, getInstance().getRpxPerRem());
            } catch (Exception e3) {
                dwh.y("[Render], invalid attribute transform: " + I, e3);
                list2 = null;
            }
            float f18 = 1.0f;
            float f19 = 0.0f;
            if (list2 != null) {
                float f20 = 1.0f;
                float f21 = 0.0f;
                float f22 = 0.0f;
                int i6 = 0;
                float f23 = 0.0f;
                float f24 = 0.0f;
                float f25 = 0.0f;
                int i7 = 0;
                for (a.C0521a aVar : list2) {
                    switch (aVar.f10004a) {
                        case 0:
                        case 1:
                            float[] fArr = aVar.b;
                            i7 = (int) (i7 + fArr[0]);
                            f15 = i6;
                            f16 = fArr[1];
                            i6 = (int) (f15 + f16);
                            break;
                        case 2:
                            i7 = (int) (i7 + aVar.b[0]);
                            break;
                        case 3:
                            f15 = i6;
                            f16 = aVar.b[0];
                            i6 = (int) (f15 + f16);
                            break;
                        case 4:
                        case 5:
                            f21 += aVar.b[0];
                            break;
                        case 6:
                            float[] fArr2 = aVar.b;
                            f18 *= fArr2[0];
                            f17 = fArr2[1];
                            f20 *= f17;
                            break;
                        case 7:
                            f18 *= aVar.b[0];
                            break;
                        case 8:
                            f17 = aVar.b[0];
                            f20 *= f17;
                            break;
                        case 9:
                            float[] fArr3 = aVar.b;
                            f22 += fArr3[0];
                            if (!Float.isNaN(fArr3[1])) {
                                f25 += aVar.b[1];
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            f23 += aVar.b[0];
                            break;
                        case 11:
                            f24 += aVar.b[0];
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid Transform method: " + aVar.f10004a);
                    }
                }
                f7 = f18;
                f3 = f20;
                f4 = f21;
                f6 = f22;
                f19 = f24;
                i2 = i7;
                f2 = f25;
                i = i6;
                f5 = f23;
            } else {
                f7 = 1.0f;
                f6 = 0.0f;
                f5 = 0.0f;
                f4 = 0.0f;
                i2 = 0;
                f3 = 1.0f;
                i = 0;
                f2 = 0.0f;
            }
            if (list == null || list.size() <= 0) {
                f11 = f6;
                f10 = f19;
                i4 = o;
                f9 = z5;
                f14 = f5;
                f13 = f4;
                i3 = i2;
                f8 = f3;
                i5 = i;
                uINode = uINode2;
                f12 = f2;
                z3 = false;
                z2 = false;
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                boolean z6 = false;
                z3 = false;
                while (true) {
                    z2 = false;
                    for (b.a aVar2 : list) {
                        int i8 = aVar2.f10005a;
                        if (i8 != 0) {
                            f4 = f4;
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    o = o;
                                    arrayList3 = arrayList3;
                                    z5 = z5;
                                    arrayList2 = arrayList2;
                                    arrayList = arrayList;
                                    i2 = i2;
                                    f3 = f3;
                                    i = i;
                                    f2 = f2;
                                    f6 = f6;
                                    f19 = f19;
                                } else if (z2) {
                                    f6 = f6;
                                    f19 = f19;
                                } else {
                                    my0 my0Var = uINode2.animationHolder;
                                    if (my0Var != null) {
                                        my0Var.d();
                                        uINode2.animationHolder = null;
                                    }
                                    int u = getNodeInfo().u();
                                    if (o == u) {
                                        break;
                                    }
                                    ValueAnimator makeValueAnimator = uINode2.makeValueAnimator(aVar2);
                                    makeValueAnimator.addUpdateListener(new f(u, o));
                                    arrayList2.add(makeValueAnimator);
                                    o = o;
                                    arrayList3 = arrayList3;
                                    z5 = z5;
                                    arrayList2 = arrayList2;
                                    arrayList = arrayList;
                                    i2 = i2;
                                    f3 = f3;
                                    i = i;
                                    f2 = f2;
                                    f6 = f6;
                                    f19 = f19;
                                    z2 = true;
                                }
                                f5 = f5;
                                uINode2 = this;
                            } else if (z3) {
                                f6 = f6;
                                f19 = f19;
                            } else {
                                my0 my0Var2 = uINode2.animationHolder;
                                if (my0Var2 != null) {
                                    my0Var2.d();
                                    uINode2.animationHolder = null;
                                }
                                float opacity = getOpacity();
                                if (Float.compare(opacity, z5) == 0) {
                                    f6 = f6;
                                    f19 = f19;
                                    f4 = f4;
                                    z3 = false;
                                } else {
                                    ValueAnimator makeValueAnimator2 = uINode2.makeValueAnimator(aVar2);
                                    makeValueAnimator2.addUpdateListener(new e(opacity, z5));
                                    arrayList2.add(makeValueAnimator2);
                                    o = o;
                                    arrayList3 = arrayList3;
                                    z5 = z5;
                                    arrayList2 = arrayList2;
                                    arrayList = arrayList;
                                    i2 = i2;
                                    f3 = f3;
                                    i = i;
                                    f2 = f2;
                                    f6 = f6;
                                    f19 = f19;
                                    z3 = true;
                                    f5 = f5;
                                    uINode2 = this;
                                }
                            }
                        } else {
                            f4 = f4;
                            if (z6) {
                                f6 = f6;
                                f19 = f19;
                            } else {
                                my0 my0Var3 = uINode2.animationHolder;
                                if (my0Var3 != null) {
                                    my0Var3.d();
                                    uINode2.animationHolder = null;
                                }
                                int translateX = getTranslateX();
                                int translateY = getTranslateY();
                                float scaleX = getScaleX();
                                float scaleY = getScaleY();
                                arrayList = arrayList;
                                float rotate = getRotate();
                                i2 = i2;
                                float rotateX = getRotateX();
                                i = i;
                                float rotateY = getRotateY();
                                f2 = f2;
                                float skewX = getSkewX();
                                float skewY = getSkewY();
                                ValueAnimator makeValueAnimator3 = uINode2.makeValueAnimator(aVar2);
                                f6 = f6;
                                f19 = f19;
                                o = o;
                                z5 = z5;
                                f5 = f5;
                                f3 = f3;
                                makeValueAnimator3.addUpdateListener(new c(translateY, i, translateX, i2, scaleX, f7, scaleY, f3, rotate, f4, rotateX, f5, rotateY, f19, skewX, f6, skewY, f2));
                                arrayList3 = arrayList3;
                                arrayList3.add(new d(i, i2, f7, f3, f4, f5, f19, f6, f2));
                                arrayList2 = arrayList2;
                                arrayList2.add(makeValueAnimator3);
                                z6 = true;
                                uINode2 = this;
                            }
                        }
                    }
                    f11 = f6;
                    f10 = f19;
                    i4 = o;
                    f9 = z5;
                    f14 = f5;
                    f13 = f4;
                    i3 = i2;
                    f8 = f3;
                    i5 = i;
                    f12 = f2;
                    if (z6 || z3 || z2) {
                        uINode = this;
                    } else {
                        uINode = this;
                        my0 my0Var4 = uINode.animationHolder;
                        if (my0Var4 != null) {
                            my0Var4.d();
                            uINode.animationHolder = null;
                        }
                    }
                    if (arrayList2.size() > 0) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setStartDelay(0L);
                        animatorSet.playTogether(arrayList2);
                        arrayList.add(animatorSet);
                        my0 my0Var5 = new my0(arrayList, arrayList3);
                        uINode.animationHolder = my0Var5;
                        my0Var5.c();
                    }
                    z4 = z6;
                    f6 = f6;
                    f19 = f19;
                    f4 = f4;
                }
            }
            if (!z4) {
                uINode.setTranslateX(i3);
                uINode.setTranslateY(i5);
                uINode.animNodeInfo.z(f7);
                uINode.animNodeInfo.A(f8);
                uINode.animNodeInfo.w(f13);
                uINode.animNodeInfo.x(f14);
                uINode.animNodeInfo.y(f10);
                uINode.animNodeInfo.B(f11);
                uINode.animNodeInfo.C(f12);
            }
            if (!z3) {
                uINode.animNodeInfo.v(f9);
            }
            if (!z2) {
                getNodeInfo().W(i4);
            }
            if (uINode.mounted) {
                invalidate();
            }
        }
    }

    @Override // tb.hvu
    public void unmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ec954b", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.unmount(mUSDKInstance, obj);
        my0 my0Var = this.animationHolder;
        if (my0Var != null) {
            my0Var.d();
            this.animationHolder = null;
        }
        if (getNodeType() == UINodeType.VIEW) {
            notifyRemoveViewNode(true);
        }
        bjd bjdVar = this.renderNode;
        if (bjdVar != null) {
            bjdVar.detach();
        }
    }

    public void unregisterNativeStateListener(String str, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838ec55f", new Object[]{this, str, bVar});
            return;
        }
        UINode uINode = this;
        for (UINode uINode2 = this.parentNode; uINode2 != null; uINode2 = uINode2.parentNode) {
            if (uINode2 instanceof kyc) {
                ((kyc) uINode2).unregisterNativeStateListener(str, uINode, bVar);
                return;
            } else {
                uINode = uINode2;
            }
        }
        if (getInstance() != null) {
            getInstance().unregisterNativeStateListener(str, bVar);
        }
    }

    public void updateAriaLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be661829", new Object[]{this});
            return;
        }
        bjd bjdVar = this.renderNode;
        if (bjdVar != null) {
            bjdVar.setContentDescription(getAriaLabel());
        }
    }

    public void updateExtra(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c767fbf7", new Object[]{this, map});
        } else if (!map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    if (TextUtils.equals(entry.getKey(), Constants.Name.ARIA_LABEL)) {
                        updateAriaLabel();
                    } else {
                        onUpdateExtra(this, getMountContent(), entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    public final void updateLayout(int i, int i2, int i3, int i4) {
        BorderProp s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdddb41a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.isMeasured = true;
        Rect rect = new Rect(i, i2, i3, i4);
        tjc tjcVar = this.layoutProcessor;
        if (tjcVar != null) {
            tjcVar.modifyFrame(rect);
        }
        getNodeInfo().X(rect.left, rect.top, rect.right, rect.bottom);
        if (!getNodeInfo().g() && (s = getNodeInfo().s(false)) != null) {
            s.E(i3 - i, i4 - i2);
            s.B();
        }
        onUpdateLayout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void updateLayoutState(xuu xuuVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8052e84", new Object[]{this, xuuVar, new Integer(i), new Integer(i2)});
            return;
        }
        this.layoutState = xuuVar;
        this.attachedTree = xuuVar.c();
        if (!this.added) {
            xuuVar.a(this);
            this.added = true;
        }
        if (this.previousParentLeft != i || this.previousParentTop != i2 || this.locationChanged) {
            this.locationChanged = false;
            int left = getLeft() + i;
            int top = getTop() + i2;
            this.previousParentTop = i2;
            this.previousParentLeft = i;
            this.globalVisibleRect.set(left, top, getLayoutWidth() + left, getLayoutHeight() + top);
            if (isMounted()) {
                zuu.b(this, getMountContent(), this.globalVisibleRect);
            }
        }
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public void updateStyles(MUSProps mUSProps) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edda560", new Object[]{this, mUSProps});
            return;
        }
        List<wwh> rawProps = mUSProps.getRawProps();
        if (!rawProps.isEmpty()) {
            this.updatingStyle = true;
            for (wwh wwhVar : rawProps) {
                onUpdateStyle(this, wwhVar.f30972a, wwhVar.b);
            }
            tvu tvuVar = this.styleHelper;
            if (tvuVar != null) {
                tvuVar.a();
            }
            this.updatingStyle = false;
            if (this.notifyEngineRelayout) {
                relayout();
            }
        }
    }

    public boolean viewSupportRenderNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c229a54d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
            return;
        }
        throw new RuntimeException("addChild(int index, UINode child) is not supported");
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public MUSView getAttachedView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSView) ipChange.ipc$dispatch("188dab12", new Object[]{this});
        }
        ywh attachedTree = getAttachedTree();
        if (attachedTree != null) {
            return attachedTree.n();
        }
        return null;
    }

    public void notifyMountState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba527828", new Object[]{this});
            return;
        }
        this.mountState = true;
        if ((hasEvent("disappear") || hasEvent("appear")) && !this.mHasDelayedAppear) {
            this.mHasDelayedAppear = true;
            getInstance().postTaskToMainDelay(this.mAppearRunnable, 100L);
        }
        if (!this.isRootNode) {
            return;
        }
        if ((hasEvent(Constants.Event.VIEWAPPEAR) || hasEvent(Constants.Event.VIEWDISAPPEAR)) && !this.mHasDelayedViewAppear) {
            this.mHasDelayedAppear = true;
            getInstance().postTaskToMainDelay(this.mViewAppearRunnable, 100L);
        }
    }

    public void notifyUnmountState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492740c1", new Object[]{this});
            return;
        }
        this.mountState = false;
        if (hasEvent("disappear") || hasEvent("appear")) {
            this.mHasDelayedAppear = false;
            getInstance().removeTaskFromMain(this.mAppearRunnable);
            if (this.mHasAppearSent) {
                this.mHasAppearSent = false;
                fireEvent("disappear", null);
            }
        }
        if (!this.isRootNode) {
            return;
        }
        if (hasEvent(Constants.Event.VIEWAPPEAR) || hasEvent(Constants.Event.VIEWDISAPPEAR)) {
            this.mHasDelayedViewAppear = false;
            getInstance().removeTaskFromMain(this.mViewAppearRunnable);
            if (this.mHasViewAppearSent) {
                this.mHasViewAppearSent = false;
                fireEvent(Constants.Event.VIEWDISAPPEAR, null);
            }
        }
    }

    public void onRefreshAttribute(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5cdfa2d", new Object[]{this, str, obj});
        } else if (!TextUtils.isEmpty(str)) {
            cwh<UINode> b2 = this.nodeHolder.b(str);
            if (b2 != null) {
                try {
                    b2.c(getInstance(), this, obj);
                } catch (Exception e2) {
                    wvh.a().b("UINode.refreshAttribute", e2);
                    if (dwh.r()) {
                        dwh.f("[Render]", "Attribute/style \"" + str + "\" error for value: " + obj + " in <" + getLogName() + ">, error detail:" + e2.getMessage());
                        e2.printStackTrace();
                    }
                }
            }
        } else if (dwh.r()) {
            dwh.e("onRefreshAttribute error: attrName is empty");
        }
    }

    public boolean onUpdateAttr(String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77acf1b", new Object[]{this, str, mUSValue})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        jpc<UINode> jpcVar = this.nodeHolder;
        if (jpcVar == null) {
            if (dwh.r()) {
                dwh.v(getClass().getSimpleName().concat(" onUpdateAttr node holder is null"));
            }
            return false;
        }
        cwh<UINode> a2 = jpcVar.a(str);
        if (a2 == null) {
            if (dwh.r()) {
                dwh.w("[Render]", "Attribute/style \"" + str + "\" is not support in <" + getLogName() + ">");
            }
            return false;
        }
        try {
            a2.d(getInstance(), this, mUSValue);
            return true;
        } catch (Exception e2) {
            wvh.a().b("UINode.onUpdateAttr", e2);
            if (dwh.r()) {
                StringBuilder sb = new StringBuilder("Attribute/style \"");
                sb.append(str);
                sb.append("\" error for value: ");
                sb.append(mUSValue == null ? "null" : mUSValue.toShortString());
                sb.append(" in <");
                sb.append(getLogName());
                sb.append(">, error detail:");
                sb.append(e2.getMessage());
                dwh.f("[Render]", sb.toString());
                e2.printStackTrace();
            }
            return true;
        }
    }

    public boolean onUpdateStyle(UINode uINode, String str, MUSValue mUSValue) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("208452f3", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (this.styleHelper == null) {
            this.styleHelper = new tvu(this);
        }
        try {
            if (this.styleHelper.w(str, mUSValue)) {
                return true;
            }
            if (!isGenerated()) {
                return onUpdateAttr(str, mUSValue);
            }
            boolean onUpdateAttr = onUpdateAttr(this, str, mUSValue);
            if (!onUpdateAttr && dwh.r()) {
                dwh.w("[Render]", "Attribute/style \"" + str + "\" is not support in <" + getLogName() + ">");
            }
            return onUpdateAttr;
        } catch (Exception e2) {
            wvh.a().b("UINode.onUpdateStyle", e2);
            StringBuilder sb = new StringBuilder("Attribute/style \"");
            sb.append(str);
            sb.append("\" error for value: ");
            if (mUSValue == null) {
                str2 = "null";
            } else {
                str2 = mUSValue.toShortString();
            }
            sb.append(str2);
            sb.append(" in <");
            sb.append(getLogName());
            sb.append(">, error detail:");
            sb.append(e2.getMessage());
            dwh.f("[Render]", sb.toString());
            e2.printStackTrace();
            return true;
        }
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public void updateAttrs(MUSProps mUSProps) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3699fae", new Object[]{this, mUSProps});
            return;
        }
        List<wwh> rawProps = mUSProps.getRawProps();
        if (!rawProps.isEmpty()) {
            this.updatingStyle = true;
            for (wwh wwhVar : rawProps) {
                if (!updateArias(wwhVar)) {
                    if (isGenerated()) {
                        try {
                            if (!onUpdateAttr(this, wwhVar.f30972a, wwhVar.b) && dwh.r()) {
                                dwh.w("[Render]", "Attribute/style \"" + wwhVar.f30972a + "\" is not support in <" + getLogName() + ">");
                            }
                        } catch (Exception e2) {
                            wvh.a().b("UINode.onUpdateAttr", e2);
                            if (dwh.r()) {
                                StringBuilder sb = new StringBuilder("Attribute/style \"");
                                sb.append(wwhVar.f30972a);
                                sb.append("\" error for value: ");
                                MUSValue mUSValue = wwhVar.b;
                                if (mUSValue == null) {
                                    str = "null";
                                } else {
                                    str = mUSValue.toShortString();
                                }
                                sb.append(str);
                                sb.append(" in <");
                                sb.append(getLogName());
                                sb.append(">, error detail:");
                                sb.append(e2.getMessage());
                                dwh.f("[Render]", sb.toString());
                                e2.printStackTrace();
                            }
                        }
                    } else {
                        onUpdateAttr(wwhVar.f30972a, wwhVar.b);
                    }
                }
            }
            this.updatingStyle = false;
            if (this.notifyEngineRelayout) {
                relayout();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r6.equals("touchstart") == false) goto L_0x0027;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addEvent(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_uikit.ui.UINode.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "a85d704a"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            r1[r2] = r6
            r3.ipc$dispatch(r4, r1)
            return
        L_0x0015:
            tb.evu r3 = r5.getNodeInfo()
            r3.l(r6)
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1578593149: goto L_0x0063;
                case -1411068523: goto L_0x0058;
                case -819532484: goto L_0x004c;
                case 94750088: goto L_0x0041;
                case 348755879: goto L_0x0035;
                case 364536720: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            r0 = -1
            goto L_0x006d
        L_0x0029:
            java.lang.String r0 = "touchmove"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0033
            goto L_0x0027
        L_0x0033:
            r0 = 5
            goto L_0x006d
        L_0x0035:
            java.lang.String r0 = "longtap"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003f
            goto L_0x0027
        L_0x003f:
            r0 = 4
            goto L_0x006d
        L_0x0041:
            java.lang.String r0 = "click"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004a
            goto L_0x0027
        L_0x004a:
            r0 = 3
            goto L_0x006d
        L_0x004c:
            java.lang.String r0 = "touchend"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0056
            goto L_0x0027
        L_0x0056:
            r0 = 2
            goto L_0x006d
        L_0x0058:
            java.lang.String r0 = "appear"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0061
            goto L_0x0027
        L_0x0061:
            r0 = 1
            goto L_0x006d
        L_0x0063:
            java.lang.String r1 = "touchstart"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x006d
            goto L_0x0027
        L_0x006d:
            switch(r0) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x009e;
                case 2: goto L_0x0098;
                case 3: goto L_0x0086;
                case 4: goto L_0x0077;
                case 5: goto L_0x0071;
                default: goto L_0x0070;
            }
        L_0x0070:
            goto L_0x00ab
        L_0x0071:
            tb.j5k r6 = r5.touchHelper
            r6.v(r2)
            goto L_0x00ab
        L_0x0077:
            tb.yuu r6 = new tb.yuu
            com.taobao.android.weex_framework.MUSDKInstance r0 = r5.instance
            int r1 = r5.getNodeId()
            r6.<init>(r0, r1)
            r5.setLongClickListener(r6)
            goto L_0x00ab
        L_0x0086:
            tb.puu r6 = new tb.puu
            com.taobao.android.weex_framework.MUSDKInstance r0 = r5.instance
            int r1 = r5.getNodeId()
            r6.<init>(r0, r1)
            r5.setOnClickListener(r6)
            r5.notifyAccessibleChanged(r2)
            goto L_0x00ab
        L_0x0098:
            tb.j5k r6 = r5.touchHelper
            r6.u(r2)
            goto L_0x00ab
        L_0x009e:
            boolean r6 = r5.mountState
            if (r6 == 0) goto L_0x00ab
            r5.notifyMountState()
            goto L_0x00ab
        L_0x00a6:
            tb.j5k r6 = r5.touchHelper
            r6.w(r2)
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.ui.UINode.addEvent(java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r7.equals("click") == false) goto L_0x0028;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void removeEvent(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_uikit.ui.UINode.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "36761a87"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r6
            r0[r1] = r7
            r3.ipc$dispatch(r4, r0)
            return
        L_0x0015:
            tb.evu r3 = r6.getNodeInfo()
            r3.P(r7)
            r7.hashCode()
            r3 = 0
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1578593149: goto L_0x0057;
                case -819532484: goto L_0x004b;
                case 94750088: goto L_0x0042;
                case 348755879: goto L_0x0036;
                case 364536720: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            r0 = -1
            goto L_0x0062
        L_0x002a:
            java.lang.String r0 = "touchmove"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0034
            goto L_0x0028
        L_0x0034:
            r0 = 4
            goto L_0x0062
        L_0x0036:
            java.lang.String r0 = "longtap"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0040
            goto L_0x0028
        L_0x0040:
            r0 = 3
            goto L_0x0062
        L_0x0042:
            java.lang.String r5 = "click"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x0062
            goto L_0x0028
        L_0x004b:
            java.lang.String r0 = "touchend"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0055
            goto L_0x0028
        L_0x0055:
            r0 = 1
            goto L_0x0062
        L_0x0057:
            java.lang.String r0 = "touchstart"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0061
            goto L_0x0028
        L_0x0061:
            r0 = 0
        L_0x0062:
            switch(r0) {
                case 0: goto L_0x007d;
                case 1: goto L_0x0077;
                case 2: goto L_0x0070;
                case 3: goto L_0x006c;
                case 4: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x0082
        L_0x0066:
            tb.j5k r7 = r6.touchHelper
            r7.v(r2)
            goto L_0x0082
        L_0x006c:
            r6.setLongClickListener(r3)
            goto L_0x0082
        L_0x0070:
            r6.setOnClickListener(r3)
            r6.notifyAccessibleChanged(r1)
            goto L_0x0082
        L_0x0077:
            tb.j5k r7 = r6.touchHelper
            r7.u(r2)
            goto L_0x0082
        L_0x007d:
            tb.j5k r7 = r6.touchHelper
            r7.w(r2)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.ui.UINode.removeEvent(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void draw(android.graphics.Canvas r6, com.taobao.android.weex_uikit.ui.MUSNodeHost r7, boolean r8, boolean r9, float r10) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.weex_uikit.ui.UINode.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0030
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r8)
            java.lang.Boolean r8 = new java.lang.Boolean
            r8.<init>(r9)
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            r10 = 6
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r1] = r5
            r10[r0] = r6
            r6 = 2
            r10[r6] = r7
            r6 = 3
            r10[r6] = r3
            r6 = 4
            r10[r6] = r8
            r6 = 5
            r10[r6] = r9
            java.lang.String r6 = "a28782c9"
            r2.ipc$dispatch(r6, r10)
            return
        L_0x0030:
            r2 = -1
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            tb.evu r8 = r5.getNodeInfo()
            com.taobao.android.weex_uikit.widget.border.BorderProp r8 = r8.s(r1)
            if (r8 == 0) goto L_0x0051
            android.graphics.Path r9 = r8.k()
            if (r9 == 0) goto L_0x0051
            int r9 = r6.save()
            android.graphics.Path r8 = r8.k()
            r6.clipPath(r8)
            goto L_0x0068
        L_0x0051:
            boolean r8 = r5.shouldClip()
            if (r8 == 0) goto L_0x0067
            int r9 = r6.save()
            int r8 = r5.getLayoutWidth()
            int r3 = r5.getLayoutHeight()
            r6.clipRect(r1, r1, r8, r3)
            goto L_0x0068
        L_0x0067:
            r9 = -1
        L_0x0068:
            r5.drawBackground(r6, r10)
            com.taobao.android.weex_uikit.ui.UINodeType r8 = r5.getNodeType()
            com.taobao.android.weex_uikit.ui.UINodeType r3 = com.taobao.android.weex_uikit.ui.UINodeType.LAYOUT
            if (r8 != r3) goto L_0x0077
            r5.dispatchDraw(r7, r6, r10)
            goto L_0x00c5
        L_0x0077:
            java.lang.Object r8 = r5.getMountContent()
            tb.evu r3 = r5.getNodeInfo()
            com.taobao.android.weex_uikit.widget.border.BorderProp r3 = r3.s(r1)
            if (r3 != 0) goto L_0x0087
            r4 = 0
            goto L_0x008b
        L_0x0087:
            int r4 = r3.g(r1)
        L_0x008b:
            if (r3 != 0) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            int r1 = r3.g(r0)
        L_0x0092:
            boolean r0 = r8 instanceof android.graphics.drawable.Drawable
            if (r0 == 0) goto L_0x00b3
            boolean r7 = r5.isRenderNodeEnabled()
            if (r7 != 0) goto L_0x00ad
            r7 = r8
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            float r0 = r5.getOpacity()
            float r0 = r0 * r10
            r3 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r3
            int r0 = (int) r0
            r7.setAlpha(r0)
        L_0x00ad:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            r5.drawDrawable(r6, r4, r1, r8)
            goto L_0x00c5
        L_0x00b3:
            boolean r0 = r8 instanceof android.view.View
            if (r0 == 0) goto L_0x00c5
            android.view.View r8 = (android.view.View) r8
            float r0 = r5.getOpacity()
            float r0 = r0 * r10
            r8.setAlpha(r0)
            r5.drawView(r6, r7, r8)
        L_0x00c5:
            r5.drawBorder(r6, r10)
            if (r9 == r2) goto L_0x00cd
            r6.restoreToCount(r9)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.ui.UINode.draw(android.graphics.Canvas, com.taobao.android.weex_uikit.ui.MUSNodeHost, boolean, boolean, float):void");
    }
}
