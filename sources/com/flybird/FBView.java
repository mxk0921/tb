package com.flybird;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationSet;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.android.app.template.HtmlLite;
import com.alipay.android.app.template.ITemplateDisposable;
import com.alipay.android.app.template.event.TElementEventHandler;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.flybird.FBScrollView;
import com.flybird.FBView;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.android.agoo.common.AgooConstants;
import tb.f7l;
import tb.ks9;
import tb.l2w;
import tb.pg1;
import tb.pgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBView implements View.OnTouchListener, View.OnClickListener, View.OnFocusChangeListener, ITemplateDisposable, View.OnLongClickListener, View.OnKeyListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FB_SCROLL_EVENT_TYPE_DRAG = -1;
    public static final int FB_SCROLL_EVENT_TYPE_DROP = 0;
    public static final int FB_SCROLL_EVENT_TYPE_ONGOING = 1;
    public static final int FB_SCROLL_EVENT_TYPE_STOP = 2;
    public static final String KEY_BIZID = "bizid";
    public static final String TAG = "FBView";
    public static final String THEME_ASSOCIATED_TYPE_CSS = "CSS";
    public static final String THEME_ASSOCIATED_TYPE_PROP = "prop";

    /* renamed from: a  reason: collision with root package name */
    public static int f4968a = -1;
    public static HashMap<String, String> b;
    public boolean behaviorInfoSet;
    public String[] c;
    public boolean d;
    public String e;
    public Drawable f;
    public boolean fixUepInputClick;
    public int g;
    public float h;
    public float[] i;
    public float j;
    public float[] k;
    public boolean l;
    public boolean m;
    public volatile FBDocument mDoc;
    public Bundle mExtParams;
    public boolean mHasHeight;
    public boolean mHasWidth;
    public int mHeight;
    public boolean mNeedHandleClick;
    public boolean mNeedHandleLongClick;
    public boolean mNeedHandleMoreClick;
    public volatile long mNode;
    public float mOpacity;
    public boolean mOverScrollEnabled;
    public boolean mScrollListenerEnabled;
    public boolean mScrollVisibleDetectEnabled;
    public String mTag;
    public int mTransformDegree;
    public int mTransitionTime;
    public View mView;
    public int mWidth;
    public AnimationSet n;
    public int o;
    public final LinkedHashMap<String, String[]> p;
    public volatile long q;
    public boolean r;
    public boolean s;
    public volatile boolean t;
    public boolean themeModeUseColorMapping;
    public boolean themeModeUseMaskMapping;
    public final FBScrollView.FBScrollViewListener u;
    public FrameLayout.LayoutParams v;
    public AbsListView.LayoutParams w;
    public long x;
    public HashMap<String, String> y;
    public ks9<Integer, Void> z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class ValueWithUnit {
        public ValueWithUnit(float f, int i) {
        }
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>(16);
        b = hashMap;
        hashMap.put("header", "android.widget.TextView");
        b.put("text", "android.widget.TextView");
        b.put("link", "android.widget.TextView");
        b.put("img", "android.widget.ImageView");
        b.put("image", "android.widget.ImageView");
        b.put(pg1.ATOM_EXT_button, "android.widget.Button");
        b.put("searchfield", "android.widget.SearchView");
        b.put(UiUtil.INPUT_TYPE_VALUE_CHECKBOX, "android.widget.CheckBox");
        b.put("list", "android.widget.ListView");
        b.put("listitem", "android.widget.CheckedTextView");
    }

    public FBView(Context context, View view, FBDocument fBDocument) {
        this.c = new String[3];
        this.d = false;
        this.h = Float.NaN;
        this.i = new float[8];
        this.j = Float.NaN;
        this.mWidth = 0;
        this.mHeight = 0;
        this.k = new float[4];
        this.m = true;
        this.o = 0;
        this.mNeedHandleClick = false;
        this.mNeedHandleLongClick = false;
        this.mNeedHandleMoreClick = false;
        this.mScrollVisibleDetectEnabled = false;
        this.mOverScrollEnabled = false;
        this.mScrollListenerEnabled = false;
        this.themeModeUseColorMapping = true;
        this.themeModeUseMaskMapping = false;
        this.p = new LinkedHashMap<>(8);
        this.r = true;
        this.s = false;
        this.mHasWidth = false;
        this.mHasHeight = false;
        this.mTransitionTime = -1;
        this.mTransformDegree = -1;
        this.t = false;
        this.mExtParams = new Bundle();
        this.u = new FBScrollView.FBScrollViewListener() { // from class: com.flybird.FBView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollBegin(int i, int i2, boolean z) {
                FBDocument fBDocument2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4d7cff70", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                } else if (z && (fBDocument2 = FBView.this.getFBDocument()) != null && fBDocument2.mCore != 0) {
                    float dp = FBDocumentAssistor.getDp();
                    FBView.nativePlatformOnScroll(FBView.this.mNode, -1, (int) (i / dp), (int) (i2 / dp));
                }
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollChanged(int i, int i2, int i3, int i4, boolean z) {
                FBPartialVisibilityHelper fBPartialVisibilityHelper;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3f8bab65", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
                    return;
                }
                FBDocument fBDocument2 = FBView.this.getFBDocument();
                if (fBDocument2 != null && fBDocument2.mCore != 0) {
                    float dp = FBDocumentAssistor.getDp();
                    FBView fBView = FBView.this;
                    float f = i2 / dp;
                    fBView.o = (int) (f + 0.5d);
                    if (z) {
                        FBView.nativePlatformOnScroll(fBView.mNode, 1, (int) (i / dp), (int) f);
                    }
                    if (FBView.this.mScrollVisibleDetectEnabled && (fBPartialVisibilityHelper = fBDocument2.K) != null) {
                        fBPartialVisibilityHelper.a();
                    }
                }
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollEnd(int i, int i2, boolean z) {
                FBDocument fBDocument2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c054adfe", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                } else if (z && (fBDocument2 = FBView.this.getFBDocument()) != null && fBDocument2.mCore != 0) {
                    float dp = FBDocumentAssistor.getDp();
                    FBView.nativePlatformOnScroll(FBView.this.mNode, 0, (int) (i / dp), (int) (i2 / dp));
                }
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollStop(int i, int i2, boolean z) {
                FBDocument fBDocument2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5488451f", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                } else if (z && (fBDocument2 = FBView.this.getFBDocument()) != null && fBDocument2.mCore != 0) {
                    float dp = FBDocumentAssistor.getDp();
                    FBView.nativePlatformOnScroll(FBView.this.mNode, 2, (int) (i / dp), (int) (i2 / dp));
                }
            }
        };
        this.v = new FrameLayout.LayoutParams(0, 0);
        this.w = new AbsListView.LayoutParams(0, 0);
        this.mOpacity = 1.0f;
        this.y = null;
        this.z = null;
        this.mDoc = fBDocument;
        setInnerView(view == null ? new FBFrameLayout(context) : view);
    }

    public static native boolean nativePlatformInvokeCallback(long j, String str, String str2);

    public static native boolean nativePlatformIsStableNode(long j);

    public static native boolean nativePlatformOnBlur(long j);

    public static native boolean nativePlatformOnCallback(long j, String str, String str2);

    public static native int nativePlatformOnChange(long j, String str);

    public static native boolean nativePlatformOnClick(long j);

    public static native boolean nativePlatformOnFocus(long j);

    public static native int nativePlatformOnInput(long j, String str);

    public static native boolean nativePlatformOnItemClick(long j, int i, int i2, long j2);

    public static native boolean nativePlatformOnKeyDown(long j, int i);

    public static native boolean nativePlatformOnLoadMore(long j);

    public static native boolean nativePlatformOnLongpress(long j);

    public static native boolean nativePlatformOnMoreClick(long j);

    public static native boolean nativePlatformOnMouseDown(long j, int i, int i2);

    public static native boolean nativePlatformOnMouseMove(long j, int i, int i2);

    public static native boolean nativePlatformOnMouseUp(long j, int i, int i2);

    public static native boolean nativePlatformOnNativeScheme(long j, String str);

    public static native boolean nativePlatformOnRefresh(long j);

    public static native void nativePlatformOnScroll(long j, int i, int i2, int i3);

    public static native boolean nativePlatformValidateEvent(long j, String str);

    public void addView(FBView fBView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76744a", new Object[]{this, fBView});
        } else {
            ((ViewGroup) getInnerView()).addView(fBView.getInnerView());
        }
    }

    @Override // com.alipay.android.app.template.ITemplateDisposable
    public void destroy() {
        FBView value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.t = true;
        if (this == this.mDoc.mRoot) {
            for (Map.Entry<String, FBView> entry : this.mDoc.F.entrySet()) {
                if (!(entry == null || entry.getValue() == null || (value = entry.getValue()) == this)) {
                    value.doDestroy();
                }
            }
            this.mDoc = null;
            doDestroy();
            return;
        }
        doDestroy();
    }

    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        this.mDoc = null;
        this.v = null;
        this.k = null;
        View view = this.mView;
        if (view instanceof IBorderable) {
            ((IBorderable) view).destroy();
        }
        this.mView = null;
        this.mTag = null;
        this.c = null;
    }

    @Override // com.alipay.android.app.template.ITemplateDisposable
    public int getContextHashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfc6032e", new Object[]{this})).intValue();
        }
        return this.mDoc.k.hashCode();
    }

    public String getEncryptValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71c53bb7", new Object[]{this});
        }
        return "";
    }

    public Bundle getExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("72a8820b", new Object[]{this});
        }
        if (!(this.mExtParams.containsKey("bizid") || this.mDoc == null || this.mDoc.getTid() == null)) {
            Bundle bundle = this.mExtParams;
            bundle.putString("bizid", "BirdNest@" + this.mDoc.getTid());
        }
        return this.mExtParams;
    }

    public FBDocument getFBDocument() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBDocument) ipChange.ipc$dispatch("cc27f2a9", new Object[]{this});
        }
        return this.mDoc;
    }

    public View getInnerView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3a4c32ae", new Object[]{this}) : this.mView;
    }

    public int getInnerViewTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("637f7fef", new Object[]{this})).intValue();
        }
        if (f4968a == -1) {
            f4968a = this.mDoc.getEngine().getConfig().getIdProvider().getUniqueResId("alipay_msp_view_wrapper");
            pgh.i(TAG, "innerViewId -> " + f4968a + " from " + this.mDoc.getEngine().getConfig().getIdProvider());
            int i = f4968a;
            if (i <= 0 || (i >>> 24) < 2) {
                pgh.e(TAG, "id provider err 3. " + f4968a + " from " + this.mDoc.getEngine().getConfig().getIdProvider());
            }
        }
        return f4968a;
    }

    public long getNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("beb89ef3", new Object[]{this})).longValue();
        }
        return this.mNode;
    }

    public float getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cc", new Object[]{this})).floatValue();
        }
        return this.mOpacity;
    }

    public int getScrollTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94b1300c", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.mTag;
    }

    @Override // com.alipay.android.app.template.ITemplateDisposable
    public boolean hiddenKeyboardService(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61ef5fed", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return this.mDoc.hiddenKeyboardService(((Activity) this.mDoc.k).getWindow().getDecorView(), z);
    }

    public String invoke(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b56de6d", new Object[]{this, str, str2});
        }
        if (str == null) {
            return null;
        }
        FBLogger.d(TAG, "invoke -> " + str + ": " + str2);
        if (str.equals("fireBehavior")) {
            try {
                if (Looper.getMainLooper() != Looper.myLooper()) {
                    FBLogger.e(TAG, "behavior must be fired in main thread");
                    return null;
                }
                IpChange ipChange2 = Platform.$ipChange;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.alipay.android.app.template.ITemplateDisposable
    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        if (this.mDoc == null || this.mDoc.mCore == 0 || this.t || this.mView == null) {
            return true;
        }
        return false;
    }

    public boolean isScrollVisibleDetectEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9c0fe0e", new Object[]{this})).booleanValue();
        }
        return this.mScrollVisibleDetectEnabled;
    }

    public boolean needHandleClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68e89555", new Object[]{this})).booleanValue();
        }
        return this.mNeedHandleClick;
    }

    public boolean needHandleLongClick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0dc0939", new Object[]{this})).booleanValue() : this.mNeedHandleLongClick;
    }

    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!isDestroyed() && this.q == this.mDoc.mCore) {
            if (getFBDocument() != null) {
                getFBDocument().getClass();
            }
            FBDocument.ClickMode clickMode = this.mDoc.getClickMode();
            if (clickMode == FBDocument.ClickMode.GLOBAL_PROTECT_CLICK) {
                if (this.mDoc.getGlobalClick()) {
                    this.mDoc.setGlobalClick(false);
                } else {
                    return;
                }
            } else if (clickMode == FBDocument.ClickMode.INDIVIDUAL_PROTECT_CLICK) {
                if (this.m) {
                    this.m = false;
                    this.mDoc.b0.postDelayed(new Runnable() { // from class: com.flybird.FBView.8
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                FBView.a(FBView.this, true);
                            }
                        }
                    }, 600);
                } else {
                    return;
                }
            }
            if (this.mDoc.getElementEventObserver() != null) {
                this.mDoc.getElementEventObserver().onEvent(TElementEventHandler.EventType.CLICK, null, null, this.mDoc);
            }
            nativePlatformOnClick(this.mNode);
        }
    }

    public void onFocusChange(View view, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
        } else {
            view.post(new Runnable() { // from class: tb.bv8
                @Override // java.lang.Runnable
                public final void run() {
                    FBView.this.a(z);
                }
            });
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
        }
        if (isDestroyed()) {
            return true;
        }
        if (i == 4) {
            if (!this.mDoc.getGlobalClick()) {
                return true;
            }
            this.mDoc.setGlobalClick(false);
            if (hiddenKeyboardService(false)) {
                return true;
            }
            if (this.mDoc.mCore != 0) {
                return nativePlatformOnKeyDown(this.mNode, i);
            }
        }
        return false;
    }

    public void onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23670df", new Object[]{this});
        } else if (!isDestroyed()) {
            b(false);
            View view = this.mView;
            if (((view instanceof FBScrollView) || (view instanceof FBHScrollView)) && this.mDoc.isFullscreen() && this.mDoc.c0 && this.mView.getLayoutParams() != null) {
                ((FrameLayout.LayoutParams) this.mView.getLayoutParams()).height = -1;
                this.mDoc.getBodyView().v.height = -1;
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        if (isDestroyed() || nativePlatformOnLongpress(this.mNode)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        long j;
        FBDocument fBDocument;
        FBDocument fBDocument2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (isDestroyed()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float dp = FBDocumentAssistor.getDp();
                    boolean nativePlatformOnMouseMove = nativePlatformOnMouseMove(this.mNode, (int) (motionEvent.getRawX() / dp), (int) (motionEvent.getRawY() / dp));
                    if (!(this.mDoc == null || (fBDocument2 = this.mDoc) == null)) {
                        for (int i = 0; i < fBDocument2.I.size(); i++) {
                            fBDocument2.I.get(i).setScrollable(false);
                        }
                        for (int i2 = 0; i2 < fBDocument2.J.size(); i2++) {
                            fBDocument2.J.get(i2).setScrollable(false);
                        }
                    }
                    return nativePlatformOnMouseMove;
                } else if (action != 3) {
                    return false;
                }
            }
            float dp2 = FBDocumentAssistor.getDp();
            boolean nativePlatformOnMouseUp = nativePlatformOnMouseUp(this.mNode, (int) (motionEvent.getRawX() / dp2), (int) (motionEvent.getRawY() / dp2));
            if (!(this.mDoc == null || (fBDocument = this.mDoc) == null)) {
                for (int i3 = 0; i3 < fBDocument.I.size(); i3++) {
                    fBDocument.I.get(i3).setScrollable(true);
                }
                for (int i4 = 0; i4 < fBDocument.J.size(); i4++) {
                    fBDocument.J.get(i4).setScrollable(true);
                }
            }
            if (System.currentTimeMillis() - this.x < 500) {
                view.performClick();
            }
            return nativePlatformOnMouseUp;
        }
        float dp3 = FBDocumentAssistor.getDp();
        boolean nativePlatformOnMouseDown = nativePlatformOnMouseDown(this.mNode, (int) (motionEvent.getRawX() / dp3), (int) (motionEvent.getRawY() / dp3));
        if (nativePlatformOnMouseDown) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        this.x = j;
        motionEvent.getFlags();
        return nativePlatformOnMouseDown;
    }

    public void onVisibilityChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcb329b", new Object[]{this, new Integer(i)});
        }
    }

    public void performOnVisibilityChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c71a5cb", new Object[]{this, new Boolean(z)});
        } else if (this.mNode != 0) {
            nativePlatformInvokeCallback(this.mNode, "onvisibleinparentchange", String.valueOf(z));
        }
    }

    public void putThemeModeAssociatedActions(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae77fc7f", new Object[]{this, str, str2, str3});
            return;
        }
        String str4 = str + ":" + str2;
        this.p.remove(str4);
        this.p.put(str4, new String[]{str2, str3});
    }

    public void removeView(FBView fBView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357311ad", new Object[]{this, fBView});
        } else {
            ((ViewGroup) getInnerView()).removeView(fBView.getInnerView());
        }
    }

    public void setInnerView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63cd68f2", new Object[]{this, view});
        } else if (view != null) {
            this.mView = view;
            try {
                view.setTag(getInnerViewTag(), this);
            } catch (Throwable th) {
                FBLogger.e(TAG, th);
            }
            this.mView.setLayoutParams(this.v);
        }
    }

    public void setNode(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74af7819", new Object[]{this, new Long(j)});
        } else if (this.mDoc != null && this.mDoc.mCore != 0) {
            this.q = this.mDoc.mCore;
            this.mNode = j;
        }
    }

    public void setParentIsListView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd538654", new Object[]{this, new Boolean(z)});
            return;
        }
        this.l = z;
        if (z) {
            AbsListView.LayoutParams layoutParams = this.w;
            FrameLayout.LayoutParams layoutParams2 = this.v;
            layoutParams.width = layoutParams2.width;
            layoutParams.height = layoutParams2.height;
            this.mView.setLayoutParams(layoutParams);
            return;
        }
        this.mView.setLayoutParams(this.v);
    }

    public void setTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
        } else {
            this.mTag = str;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0345, code lost:
        if (r5 == 1) goto L_0x0362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0347, code lost:
        if (r5 == 2) goto L_0x034b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x034b, code lost:
        r13 = r12.mView;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x034f, code lost:
        if ((r13 instanceof com.flybird.FBScrollView) == false) goto L_0x0358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0351, code lost:
        ((com.flybird.FBScrollView) r13).scrollTo(r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x035a, code lost:
        if ((r13 instanceof com.flybird.FBHScrollView) == false) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x035c, code lost:
        ((com.flybird.FBHScrollView) r13).scrollTo(r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateAttr(java.lang.String r13, final java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBView.updateAttr(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void updateCSS(String str, String str2) {
        char c;
        FrameLayout frameLayout;
        FBDocument fBDocument;
        ViewParent parent;
        FrameLayout frameLayout2;
        FBDocument fBDocument2;
        String[] split;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c310ec95", new Object[]{this, str, str2});
        } else if (str != null && !isDestroyed()) {
            switch (str.hashCode()) {
                case -2114666131:
                    if (str.equals("overflow-x")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1724158635:
                    if (str.equals("transition")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1383304148:
                    if (str.equals(pg1.ATOM_EXT_border)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -897113616:
                    if (str.equals("show-shadow")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -806339567:
                    if (str.equals("padding")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -790206670:
                    if (str.equals("background-color:disabled")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -408081145:
                    if (str.equals("visibility-display")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -127966916:
                    if (str.equals("background-color:active")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 529642498:
                    if (str.equals("overflow")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 605322756:
                    if (str.equals(pg1.ATOM_EXT_UDL_background_color)) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 610793468:
                    if (str.equals(pg1.ATOM_EXT_UDL_background_image)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 881039699:
                    if (str.equals(pg1.ATOM_EXT_UDL_border_radius)) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1052666732:
                    if (str.equals("transform")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 1941332754:
                    if (str.equals("visibility")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    View innerView = getInnerView();
                    if (!((str2.equals("scroll") || this.mScrollVisibleDetectEnabled) && (innerView instanceof FBScrollView))) {
                        if (!str2.equals("hidden") || (innerView instanceof FBHScrollView)) {
                            if (str2.equals("scroll-detect-visible")) {
                                this.mScrollVisibleDetectEnabled = true;
                            }
                            if (innerView instanceof FrameLayout) {
                                FrameLayout frameLayout3 = (FrameLayout) innerView;
                                FrameLayout frameLayout4 = (FrameLayout) frameLayout3.getParent();
                                if (str2.equals("scroll") || this.mScrollVisibleDetectEnabled) {
                                    if (frameLayout4 != null) {
                                        frameLayout4.removeView(innerView);
                                    }
                                    innerView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                                    FBHScrollView fBHScrollView = new FBHScrollView(frameLayout3.getContext(), frameLayout3);
                                    fBHScrollView.setLayoutParams(this.v);
                                    fBHScrollView.setScrollViewListener(this.u);
                                    if (frameLayout4 != null) {
                                        frameLayout4.addView(fBHScrollView);
                                    }
                                    if (!(this.mDoc == null || (fBDocument = this.mDoc) == null)) {
                                        fBDocument.J.add(fBHScrollView);
                                    }
                                    this.mHeight = FBTools.getScreenHeight(this.mView.getContext());
                                    this.mWidth = FBTools.getScreenWidth(this.mView.getContext());
                                    frameLayout = fBHScrollView;
                                } else if (frameLayout3 instanceof FBHScrollView) {
                                    FBHScrollView fBHScrollView2 = (FBHScrollView) frameLayout3;
                                    FrameLayout frameLayout5 = (FrameLayout) fBHScrollView2.getContainer();
                                    fBHScrollView2.b.removeView(frameLayout5);
                                    frameLayout = frameLayout5;
                                    if (this.mDoc != null) {
                                        this.mDoc.J.remove(innerView);
                                        frameLayout = frameLayout5;
                                    }
                                } else {
                                    return;
                                }
                                this.mView = frameLayout;
                                a();
                                b();
                                this.mView.setTag(getInnerViewTag(), this);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 1:
                    try {
                        this.mTransitionTime = Integer.parseInt(str2);
                        return;
                    } catch (NumberFormatException e) {
                        FBLogger.e(TAG, e);
                        return;
                    }
                case 2:
                    putThemeModeAssociatedActions(THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    String[] split2 = str2.split(" ");
                    if (split2.length > 0) {
                        float dp = FBDocumentAssistor.getDp();
                        for (String str4 : split2) {
                            if (str4.contains("#") || str4.contains("rgb")) {
                                this.g = FBTools.parseColor(str4, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping);
                            } else if (!str4.contains(pg1.ATOM_EXT_solid) && (str4.contains("px") || str4.contains("PX") || str4.contains("rem"))) {
                                if (!this.mDoc.configRemScaled()) {
                                    try {
                                        this.h = Float.parseFloat(str4.substring(0, str4.length() - 2));
                                    } catch (Exception e2) {
                                        FBLogger.e(getClass().getName(), "exception", e2);
                                    }
                                    if (!str4.contains("PX")) {
                                        this.h *= dp;
                                    }
                                } else {
                                    this.h = d(str4);
                                }
                            }
                        }
                        if (!this.s) {
                            this.mView.setBackgroundColor(0);
                        }
                        View view = this.mView;
                        if (view instanceof IBorderable) {
                            ((IBorderable) view).setBorder(this.g, (int) this.h);
                            return;
                        }
                        return;
                    }
                    return;
                case 3:
                    float parseFloat = Float.parseFloat(str2);
                    this.mOpacity = parseFloat;
                    if (parseFloat < 1.0f) {
                        this.mView.setLayerType(2, null);
                    }
                    UiUtil.setAlpha(this.mView, this.mOpacity);
                    if (TextUtils.equals(this.mTag, AgooConstants.MESSAGE_BODY) && (parent = this.mView.getParent()) != null) {
                        View view2 = (View) parent;
                        UiUtil.setAlpha(view2, this.mOpacity);
                        if (this.mOpacity < 1.0f) {
                            view2.setLayerType(2, null);
                            return;
                        }
                        return;
                    }
                    return;
                case 4:
                    this.mHasHeight = true;
                    return;
                case 5:
                    this.d = Boolean.parseBoolean(str2);
                    b(true);
                    this.s = true;
                    return;
                case 6:
                    String[] split3 = str2.split(" ");
                    this.k[0] = Float.parseFloat(split3[3]);
                    this.k[1] = Float.parseFloat(split3[0]);
                    this.k[2] = Float.parseFloat(split3[1]);
                    this.k[3] = Float.parseFloat(split3[2]);
                    float dp2 = FBDocumentAssistor.getDp();
                    View view3 = this.mView;
                    float[] fArr = this.k;
                    float f = fArr[0];
                    float f2 = this.j * dp2;
                    view3.setPadding((int) (f + f2), (int) (fArr[1] + f2), (int) (fArr[2] + f2), (int) (fArr[3] + f2));
                    return;
                case 7:
                    putThemeModeAssociatedActions(THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    this.c[2] = str2;
                    b(true);
                    this.s = true;
                    return;
                case '\b':
                case 16:
                    int visibility = this.mView.getVisibility();
                    if (str2.equals("visible")) {
                        this.mView.setVisibility(0);
                    } else if (str2.equals("hidden")) {
                        this.mView.setVisibility(8);
                    }
                    int visibility2 = this.mView.getVisibility();
                    if (visibility != visibility2) {
                        onVisibilityChange(visibility2);
                        return;
                    }
                    return;
                case '\t':
                    putThemeModeAssociatedActions(THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    this.c[1] = str2;
                    b(true);
                    this.s = true;
                    return;
                case '\n':
                    this.mHasWidth = true;
                    return;
                case 11:
                    View innerView2 = getInnerView();
                    if (!((str2.equals("scroll") || this.mScrollVisibleDetectEnabled) && (innerView2 instanceof FBScrollView))) {
                        if (!str2.equals("hidden") || (innerView2 instanceof FBScrollView)) {
                            if (str2.equals("scroll-detect-visible")) {
                                this.mScrollVisibleDetectEnabled = true;
                            }
                            if (innerView2 instanceof FrameLayout) {
                                FrameLayout frameLayout6 = (FrameLayout) innerView2;
                                FrameLayout frameLayout7 = (FrameLayout) frameLayout6.getParent();
                                if (str2.equals("scroll") || this.mScrollVisibleDetectEnabled) {
                                    if (frameLayout7 != null) {
                                        frameLayout7.removeView(innerView2);
                                    }
                                    innerView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                                    FBScrollView fBScrollView = new FBScrollView(frameLayout6.getContext(), frameLayout6);
                                    fBScrollView.setLayoutParams(this.v);
                                    fBScrollView.setScrollViewListener(this.u);
                                    if (frameLayout7 != null) {
                                        frameLayout7.addView(fBScrollView);
                                    }
                                    if (!(this.mDoc == null || (fBDocument2 = this.mDoc) == null)) {
                                        fBDocument2.I.add(fBScrollView);
                                    }
                                    this.mHeight = FBTools.getScreenHeight(this.mView.getContext());
                                    this.mWidth = FBTools.getScreenWidth(this.mView.getContext());
                                    frameLayout2 = fBScrollView;
                                } else if (frameLayout6 instanceof FBScrollView) {
                                    FrameLayout frameLayout8 = (FrameLayout) ((FBScrollView) frameLayout6).getContainer();
                                    frameLayout6.removeView(frameLayout8);
                                    frameLayout2 = frameLayout8;
                                    if (this.mDoc != null) {
                                        this.mDoc.I.remove(innerView2);
                                        frameLayout2 = frameLayout8;
                                    }
                                } else {
                                    return;
                                }
                                this.mView = frameLayout2;
                                a();
                                b();
                                this.mView.setTag(getInnerViewTag(), this);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case '\f':
                    putThemeModeAssociatedActions(THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    this.c[0] = str2;
                    b(true);
                    this.s = true;
                    return;
                case '\r':
                    putThemeModeAssociatedActions(THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    if (str2.contains("linear-gradient(")) {
                        String trim = str2.replace("linear-gradient(", "").replace(f7l.BRACKET_END_STR, "").trim();
                        final GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                        if (trim.startsWith("to top right") || trim.startsWith("to right top")) {
                            orientation = GradientDrawable.Orientation.BL_TR;
                        } else if (trim.startsWith("to bottom left") || trim.startsWith("to left bottom")) {
                            orientation = GradientDrawable.Orientation.TR_BL;
                        } else if (trim.startsWith("to top left") || trim.startsWith("to left top")) {
                            orientation = GradientDrawable.Orientation.BR_TL;
                        } else if (trim.startsWith("to bottom right") || trim.startsWith("to right bottom")) {
                            orientation = GradientDrawable.Orientation.TL_BR;
                        } else if (!trim.startsWith("to top")) {
                            if (trim.startsWith("to right")) {
                                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                            } else if (trim.startsWith("to bottom")) {
                                orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                            } else if (trim.startsWith("to left")) {
                                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                            }
                        }
                        try {
                            String[] split4 = trim.replaceAll("to (top|right|left|bottom)\\s*,\\s*", "").replaceAll("to (top|right|left|bottom)\\s*(top|right|left|bottom)\\s*,\\s*", "").split("\\s*,\\s*");
                            if (!(split4 == null || split4.length == 0)) {
                                final ArrayList arrayList = new ArrayList();
                                final ArrayList arrayList2 = new ArrayList();
                                int i = 0;
                                while (i < split4.length) {
                                    String str5 = split4[i];
                                    if (!(str5 == null || (split = str5.split("\\s+")) == null)) {
                                        if (split4.length == 2 && split.length == 1) {
                                            arrayList.add(Integer.valueOf(Color.parseColor(split[0])));
                                            arrayList2.add(Float.valueOf(i == 0 ? 0.0f : 1.0f));
                                        } else if (!(split.length != 2 || (str3 = split[0]) == null || split[1] == null)) {
                                            arrayList.add(Integer.valueOf(Color.parseColor(str3)));
                                            arrayList2.add(Float.valueOf(Math.min(Float.parseFloat(split[1].replace(f7l.MOD, "")) / 100.0f, 1.0f)));
                                        }
                                    }
                                    i++;
                                }
                                ShapeDrawable.ShaderFactory shaderFactory = new ShapeDrawable.ShaderFactory(this) { // from class: com.flybird.FBView.5
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str6, Object... objArr) {
                                        str6.hashCode();
                                        int hashCode = str6.hashCode();
                                        throw new InstantReloadException("String switch could not find '" + str6 + "' with hashcode " + hashCode + " in com/flybird/FBView$5");
                                    }

                                    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                                    public Shader resize(int i2, int i3) {
                                        LinearGradient linearGradient;
                                        LinearGradient linearGradient2;
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            return (Shader) ipChange2.ipc$dispatch("83f6a2c3", new Object[]{this, new Integer(i2), new Integer(i3)});
                                        }
                                        int[] iArr = new int[arrayList.size()];
                                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                            if (arrayList.get(i4) != null) {
                                                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                                            }
                                        }
                                        float[] fArr2 = new float[arrayList2.size()];
                                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                            if (arrayList.get(i5) != null) {
                                                fArr2[i5] = ((Float) arrayList2.get(i5)).floatValue();
                                            }
                                        }
                                        GradientDrawable.Orientation orientation2 = orientation;
                                        if (orientation2 == GradientDrawable.Orientation.LEFT_RIGHT) {
                                            return new LinearGradient(0.0f, 0.0f, i2, 0.0f, iArr, fArr2, Shader.TileMode.REPEAT);
                                        }
                                        if (orientation2 == GradientDrawable.Orientation.RIGHT_LEFT) {
                                            return new LinearGradient(i2, 0.0f, 0.0f, 0.0f, iArr, fArr2, Shader.TileMode.REPEAT);
                                        }
                                        if (orientation2 == GradientDrawable.Orientation.TOP_BOTTOM) {
                                            linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, i3, iArr, fArr2, Shader.TileMode.REPEAT);
                                        } else if (orientation2 == GradientDrawable.Orientation.BOTTOM_TOP) {
                                            linearGradient2 = new LinearGradient(0.0f, i3, 0.0f, 0.0f, iArr, fArr2, Shader.TileMode.REPEAT);
                                        } else {
                                            if (orientation2 == GradientDrawable.Orientation.BL_TR) {
                                                linearGradient = new LinearGradient(0.0f, i3, i2, 0.0f, iArr, fArr2, Shader.TileMode.REPEAT);
                                            } else if (orientation2 == GradientDrawable.Orientation.TR_BL) {
                                                linearGradient = new LinearGradient(i2, 0.0f, 0.0f, i3, iArr, fArr2, Shader.TileMode.REPEAT);
                                            } else if (orientation2 == GradientDrawable.Orientation.BR_TL) {
                                                linearGradient = new LinearGradient(i2, i3, 0.0f, 0.0f, iArr, fArr2, Shader.TileMode.REPEAT);
                                            } else if (orientation2 != GradientDrawable.Orientation.TL_BR) {
                                                return null;
                                            } else {
                                                linearGradient = new LinearGradient(0.0f, 0.0f, i2, i3, iArr, fArr2, Shader.TileMode.REPEAT);
                                            }
                                            return linearGradient;
                                        }
                                        return linearGradient2;
                                    }
                                };
                                PaintDrawable paintDrawable = new PaintDrawable();
                                paintDrawable.setShape(new RectShape());
                                paintDrawable.setShaderFactory(shaderFactory);
                                this.f = paintDrawable;
                                if (this.mDoc != null && this.mDoc.isOnloadFinish()) {
                                    b(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            FBLogger.e(TAG, th);
                            return;
                        }
                    } else if (str2.contains("url(")) {
                        this.e = str2.replace("url(", "").replace(f7l.BRACKET_END_STR, "");
                        b(true);
                        this.s = true;
                        return;
                    } else {
                        return;
                    }
                case 14:
                    String[] split5 = str2.split(" ");
                    float dp3 = FBDocumentAssistor.getDp();
                    if (split5.length == 1) {
                        if (!this.mDoc.configRemScaled()) {
                            this.j = Float.parseFloat(str2.substring(0, str2.length() - 2)) * dp3;
                        } else {
                            this.j = d(str2);
                        }
                        View view4 = this.mView;
                        if (view4 instanceof IBorderable) {
                            ((IBorderable) view4).setBorderRadius((int) this.j);
                            return;
                        }
                        return;
                    } else if (split5.length == 8) {
                        for (int i2 = 0; i2 < split5.length; i2++) {
                            if (!this.mDoc.configRemScaled()) {
                                float[] fArr2 = this.i;
                                String str6 = split5[i2];
                                fArr2[i2] = Float.parseFloat(str6.substring(0, str6.length() - 2)) * dp3;
                            } else {
                                this.i[i2] = d(split5[i2]);
                            }
                        }
                        View view5 = this.mView;
                        if (view5 instanceof IBorderable) {
                            ((IBorderable) view5).setBorderRadiusArray(this.i);
                            return;
                        }
                        return;
                    } else if (split5.length == 4) {
                        for (int i3 = 0; i3 < split5.length; i3++) {
                            if (!this.mDoc.configRemScaled()) {
                                float[] fArr3 = this.i;
                                int i4 = i3 * 2;
                                String str7 = split5[i3];
                                fArr3[i4] = Float.parseFloat(str7.substring(0, str7.length() - 2)) * dp3;
                                String str8 = split5[i3];
                                this.i[i4 + 1] = Float.parseFloat(str8.substring(0, str8.length() - 2)) * dp3;
                            } else {
                                int i5 = i3 * 2;
                                this.i[i5] = d(split5[i3]);
                                float[] fArr4 = this.i;
                                fArr4[i5 + 1] = fArr4[i5];
                            }
                        }
                        View view6 = this.mView;
                        if (view6 instanceof IBorderable) {
                            ((IBorderable) view6).setBorderRadiusArray(this.i);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                case 15:
                    Matcher matcher = Pattern.compile("rotate\\((\\d+)deg\\)").matcher(str2);
                    if (matcher.find()) {
                        try {
                            this.mTransformDegree = Integer.parseInt(matcher.group(1));
                            return;
                        } catch (NumberFormatException e3) {
                            FBLogger.e(TAG, e3);
                            return;
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public void updateFunc(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94461448", new Object[]{this, str, str2});
        } else if (str != null && !isDestroyed()) {
            if (!str.equals(Constants.Event.BLUR)) {
                if (str.equals(Constants.Event.FOCUS)) {
                    if (!this.mView.isFocusable() || !this.mView.isFocusableInTouchMode()) {
                        this.mView.setFocusable(true);
                        View view = this.mView;
                        if (view instanceof EditText) {
                            view.setFocusableInTouchMode(true);
                        }
                    }
                    this.mView.post(new Runnable() { // from class: tb.xu8
                        @Override // java.lang.Runnable
                        public final void run() {
                            FBView.this.c();
                        }
                    });
                }
            } else if (this.mView.isFocused()) {
                this.mView.clearFocus();
            }
        }
    }

    public static /* synthetic */ boolean a(FBView fBView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9973c6b3", new Object[]{fBView, new Boolean(z)})).booleanValue();
        }
        fBView.m = z;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.mView != null) {
            try {
                IpChange ipChange2 = Platform.$ipChange;
            } catch (Throwable unused) {
            }
        }
    }

    public static View getInnerView(FBView fBView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1864a3cb", new Object[]{fBView});
        }
        if (fBView == null) {
            return null;
        }
        return fBView.mView;
    }

    public static float parseFontSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("314ab304", new Object[]{str})).floatValue();
        }
        String str2 = "px";
        if (!str.contains(str2)) {
            str2 = "rem";
        }
        int indexOf = str.indexOf(str2);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 18.0f;
        }
    }

    public static ValueWithUnit parseFontSizeWithUnits(String str) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueWithUnit) ipChange.ipc$dispatch("cf1af1e5", new Object[]{str});
        }
        if (str.contains("px")) {
            i2 = str.indexOf("px");
            i = Platform.f;
        } else if (str.contains("rem")) {
            i2 = str.indexOf("rem");
            i = Platform.f;
        } else if (str.contains("PX")) {
            i2 = str.indexOf("PX");
            i = 0;
        } else {
            i = Platform.f;
            i2 = -1;
        }
        if (i2 != -1) {
            str = str.substring(0, i2);
        }
        try {
            return new ValueWithUnit(Float.parseFloat(str), i);
        } catch (NumberFormatException unused) {
            return new ValueWithUnit(18.0f, Platform.f);
        }
    }

    public final void b(boolean z) {
        FBResourceClient fBResourceClient;
        Object shouldInterceptResource;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.mDoc.isOnloadFinish() || !z) {
            String[] strArr = this.c;
            String str = strArr[0];
            if (str != null || strArr[1] != null || strArr[2] != null) {
                this.mView.setBackgroundDrawable(FBTools.generateBackGroundDrawable(this.h, this.g, this.j, this.i, strArr, 1.0f, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping));
            } else if (this.e != null) {
                getFBDocument().getClass();
                int i2 = this.mWidth;
                int[] iArr = (i2 <= 0 || (i = this.mHeight) <= 0) ? null : new int[]{i2, i};
                Context context = this.mDoc.k;
                this.mDoc.getClass();
                Drawable loadLocalDrawable = (TextUtils.isEmpty(this.e) || this.e.startsWith("http") || this.e.startsWith("https") || this.e.startsWith("www") || this.e.startsWith("data:") || !this.e.contains("/")) ? this.mDoc.getEngine().getImageLoader().loadLocalDrawable(this.mDoc.getEngine().getConfig().getResourceProvider(), context, this.e, this.mDoc.param.bundleName, iArr, true, this.mView, false, false) : this.mDoc.getEngine().getImageLoader().loadLocalDrawable(this.mDoc.getEngine().getConfig().getResourceProvider(), context, this.e, this.mDoc.param.bundleName, iArr, true, this.mView, false, false);
                if (loadLocalDrawable == null) {
                    this.mDoc.getEngine().getImageLoader().loadImage(this.mDoc.getEngine(), this.mView, this.e, this.mDoc.param.bundleName, iArr, true, null, null, 0, false, null, null, new BirdNestEngine.ResourceProvider.Callback() { // from class: com.flybird.FBView.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider.Callback
                        public void onLoadFailure(int i3, int i4, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("4bc2b2a8", new Object[]{this, new Integer(i3), new Integer(i4), obj});
                                return;
                            }
                            FBView.this.mDoc.executeJs("document.onImgLoaded && typeof document.onImgLoaded === 'function' && document.onImgLoaded(false,\"" + FBView.this.e + "\");");
                        }

                        @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider.Callback
                        public void onLoadSuccess(int i3, int i4, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("a1462621", new Object[]{this, new Integer(i3), new Integer(i4), obj});
                                return;
                            }
                            FBView.this.mDoc.executeJs("document.onImgLoaded && typeof document.onImgLoaded === 'function' && document.onImgLoaded(true,\"" + FBView.this.e + "\");");
                        }
                    }, getExtraParams());
                }
                if (loadLocalDrawable == null && (fBResourceClient = this.mDoc.param.resourceClient) != null && !TextUtils.isEmpty(this.e) && (shouldInterceptResource = fBResourceClient.shouldInterceptResource(this.e, FBResourceClient.Type.DRAWABLE)) != null) {
                    this.mView.setBackgroundDrawable((Drawable) shouldInterceptResource);
                } else if (loadLocalDrawable != null) {
                    this.mView.setBackgroundDrawable(loadLocalDrawable);
                }
            } else if (this.f != null) {
                if (getFBDocument() != null) {
                    getFBDocument().getClass();
                }
                if (this.f instanceof PaintDrawable) {
                    if (!Float.isNaN(this.j)) {
                        float f = this.j;
                        if (f > 0.0f) {
                            ((PaintDrawable) this.f).setCornerRadius(f);
                        }
                    }
                    ((PaintDrawable) this.f).setCornerRadii(this.i);
                }
                this.mView.setBackground(this.f);
            } else if (this.d && str != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.mutate();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(Color.parseColor("#CABBBBBB"));
                if (!Float.isNaN(this.j)) {
                    gradientDrawable.setCornerRadius(this.j);
                }
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.mutate();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setColor(Color.parseColor(this.c[0]));
                if (!Float.isNaN(this.j)) {
                    gradientDrawable2.setCornerRadius(this.j);
                }
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
                layerDrawable.setLayerInset(1, 0, 0, 0, 0);
                this.mView.setElevation(18.0f);
                this.mView.setBackground(layerDrawable);
            } else if (!Float.isNaN(this.h) || !Float.isNaN(this.j)) {
                this.mView.setBackgroundDrawable(FBTools.generateBackGroundDrawable(this.h, this.g, this.j, this.i, null, 1.0f, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping));
            }
        }
    }

    public final float d(String str) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e5", new Object[]{this, str})).floatValue();
        }
        float dp = str.endsWith("PX") ? 1.0f : FBDocumentAssistor.getDp();
        try {
            if (str.endsWith("px")) {
                dp *= Float.parseFloat(str.substring(0, str.length() - 2));
                if (nativePlatformIsStableNode(this.mNode) || !this.mDoc.s) {
                    return dp;
                }
                f = this.mDoc.getRemScale();
            } else if (str.endsWith("PX")) {
                f = Float.parseFloat(str.substring(0, str.length() - 2));
            } else if (nativePlatformIsStableNode(this.mNode) || !str.endsWith("rem")) {
                return dp;
            } else {
                dp *= Float.parseFloat(str.substring(0, str.length() - 3));
                f = this.mDoc.getRemScale();
            }
            return dp * f;
        } catch (Exception e) {
            FBLogger.e(getClass().getName(), "exception", e);
            return dp;
        }
    }

    public void needHandleLongClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa5d03f", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedHandleLongClick = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.mView != null) {
            try {
                IpChange ipChange2 = Platform.$ipChange;
            } catch (Throwable unused) {
            }
        }
    }

    public static void dispatchOnLongClickEvent(boolean z, boolean z2, View view, FBView fBView, View.OnLongClickListener onLongClickListener, int i) {
        ViewGroup viewGroup;
        int childCount;
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6b56cf", new Object[]{new Boolean(z), new Boolean(z2), view, fBView, onLongClickListener, new Integer(i)});
        } else if (view != null && fBView != null) {
            if (!z2 && z && !fBView.needHandleLongClick()) {
                view.setOnLongClickListener(onLongClickListener);
                fBView.needHandleLongClick(true);
            } else if (fBView.needHandleLongClick()) {
                onLongClickListener = fBView;
            }
            if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) != 0) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (viewGroup instanceof FBScrollView) {
                        childAt = ((FBScrollView) viewGroup).getFbChildAt(i2);
                    } else if (viewGroup instanceof FBHScrollView) {
                        childAt = ((FBHScrollView) viewGroup).b.getChildAt(i2);
                    } else {
                        childAt = viewGroup.getChildAt(i2);
                    }
                    if (childAt != null && (childAt.getTag(i) instanceof FBView)) {
                        try {
                            dispatchOnLongClickEvent(fBView.needHandleLongClick(), fBView.needHandleClick(), childAt, (FBView) childAt.getTag(i), onLongClickListener, i);
                        } catch (Throwable th) {
                            FBLogger.e(TAG, "subView.getTag fatal error, tagId: " + i, th);
                        }
                    }
                }
            }
        }
    }

    public void addView(FBView fBView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5887f9", new Object[]{this, fBView, new Integer(i)});
        } else {
            ((ViewGroup) getInnerView()).addView(fBView.getInnerView(), i);
        }
    }

    public void replayThemeModeAssociatedActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc6b3839", new Object[]{this});
            return;
        }
        for (Map.Entry<String, String[]> entry : this.p.entrySet()) {
            String key = entry.getKey();
            key.hashCode();
            if (key.equals(THEME_ASSOCIATED_TYPE_CSS)) {
                updateCSS(entry.getValue()[0], entry.getValue()[1]);
            } else if (key.equals(THEME_ASSOCIATED_TYPE_PROP)) {
                updateAttr(entry.getValue()[0], entry.getValue()[1]);
            }
        }
    }

    public void updateA12yNodeInfo() {
        final String str;
        final boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f94cd57", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = this.y;
        IpChange ipChange2 = l2w.$ipChange;
        String str2 = hashMap != null ? hashMap.get("role") : null;
        final String str3 = str2 != null ? b.get(str2.toLowerCase()) : null;
        HashMap<String, String> hashMap2 = this.y;
        String str4 = hashMap2 != null ? hashMap2.get("aria-checked") : null;
        final Boolean valueOf = str4 != null ? Boolean.valueOf("true".equalsIgnoreCase(str4)) : null;
        if (Build.VERSION.SDK_INT >= 33) {
            View view = this.mView;
            if (view instanceof TextView) {
                CharSequence text = ((TextView) view).getText();
                if ((text instanceof Spannable) && HtmlLite.hasUrlSpan((Spannable) text)) {
                    str = text.toString();
                    z = true;
                    ViewCompat.setAccessibilityDelegate(this.mView, new AccessibilityDelegateCompat(this) { // from class: com.flybird.FBView.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass7 r3, String str5, Object... objArr) {
                            int hashCode = str5.hashCode();
                            if (hashCode == -672710132) {
                                super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                                return null;
                            } else if (hashCode == 988787619) {
                                return super.getAccessibilityNodeProvider((View) objArr[0]);
                            } else {
                                int hashCode2 = str5.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str5 + "' with hashcode " + hashCode2 + " in com/flybird/FBView$7");
                            }
                        }

                        @Override // androidx.core.view.AccessibilityDelegateCompat
                        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(final View view2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return (AccessibilityNodeProviderCompat) ipChange3.ipc$dispatch("3aefb3a3", new Object[]{this, view2});
                            }
                            if (z) {
                                return new AccessibilityNodeProviderCompat() { // from class: com.flybird.FBView.7.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str5, Object... objArr) {
                                        str5.hashCode();
                                        int hashCode = str5.hashCode();
                                        throw new InstantReloadException("String switch could not find '" + str5 + "' with hashcode " + hashCode + " in com/flybird/FBView$7$1");
                                    }

                                    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
                                    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
                                        IpChange ipChange4 = $ipChange;
                                        if (ipChange4 instanceof IpChange) {
                                            return (AccessibilityNodeInfoCompat) ipChange4.ipc$dispatch("94f3cbcc", new Object[]{this, new Integer(i)});
                                        }
                                        try {
                                            AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain(view2);
                                            obtain.setSource(view2);
                                            obtain.setClassName(view2.getClass().getName());
                                            obtain.setClickable(true);
                                            obtain.setText(str);
                                            obtain.setContentDescription(view2.getContentDescription());
                                            obtain.setPackageName(view2.getContext().getPackageName());
                                            obtain.setFocusable(true);
                                            obtain.setVisibleToUser(true);
                                            obtain.setEnabled(true);
                                            Rect rect = new Rect();
                                            view2.getGlobalVisibleRect(rect);
                                            obtain.setBoundsInScreen(rect);
                                            return obtain;
                                        } catch (Throwable th) {
                                            pgh.f(FBView.TAG, "getAccessibilityNodeProvider failed ", th);
                                            return null;
                                        }
                                    }
                                };
                            }
                            return super.getAccessibilityNodeProvider(view2);
                        }

                        @Override // androidx.core.view.AccessibilityDelegateCompat
                        public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d7e7420c", new Object[]{this, view2, accessibilityNodeInfoCompat});
                                return;
                            }
                            super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                            String str5 = str3;
                            if (str5 != null) {
                                accessibilityNodeInfoCompat.setClassName(str5);
                            }
                            if (valueOf != null) {
                                accessibilityNodeInfoCompat.setCheckable(true);
                                accessibilityNodeInfoCompat.setChecked(valueOf.booleanValue());
                            }
                        }
                    });
                }
            }
        }
        str = null;
        z = false;
        ViewCompat.setAccessibilityDelegate(this.mView, new AccessibilityDelegateCompat(this) { // from class: com.flybird.FBView.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 r3, String str5, Object... objArr) {
                int hashCode = str5.hashCode();
                if (hashCode == -672710132) {
                    super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                    return null;
                } else if (hashCode == 988787619) {
                    return super.getAccessibilityNodeProvider((View) objArr[0]);
                } else {
                    int hashCode2 = str5.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str5 + "' with hashcode " + hashCode2 + " in com/flybird/FBView$7");
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(final View view2) {
                IpChange ipChange3 = $ipChange;
                if (ipChange3 instanceof IpChange) {
                    return (AccessibilityNodeProviderCompat) ipChange3.ipc$dispatch("3aefb3a3", new Object[]{this, view2});
                }
                if (z) {
                    return new AccessibilityNodeProviderCompat() { // from class: com.flybird.FBView.7.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str5, Object... objArr) {
                            str5.hashCode();
                            int hashCode = str5.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str5 + "' with hashcode " + hashCode + " in com/flybird/FBView$7$1");
                        }

                        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
                        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
                            IpChange ipChange4 = $ipChange;
                            if (ipChange4 instanceof IpChange) {
                                return (AccessibilityNodeInfoCompat) ipChange4.ipc$dispatch("94f3cbcc", new Object[]{this, new Integer(i)});
                            }
                            try {
                                AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain(view2);
                                obtain.setSource(view2);
                                obtain.setClassName(view2.getClass().getName());
                                obtain.setClickable(true);
                                obtain.setText(str);
                                obtain.setContentDescription(view2.getContentDescription());
                                obtain.setPackageName(view2.getContext().getPackageName());
                                obtain.setFocusable(true);
                                obtain.setVisibleToUser(true);
                                obtain.setEnabled(true);
                                Rect rect = new Rect();
                                view2.getGlobalVisibleRect(rect);
                                obtain.setBoundsInScreen(rect);
                                return obtain;
                            } catch (Throwable th) {
                                pgh.f(FBView.TAG, "getAccessibilityNodeProvider failed ", th);
                                return null;
                            }
                        }
                    };
                }
                return super.getAccessibilityNodeProvider(view2);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                IpChange ipChange3 = $ipChange;
                if (ipChange3 instanceof IpChange) {
                    ipChange3.ipc$dispatch("d7e7420c", new Object[]{this, view2, accessibilityNodeInfoCompat});
                    return;
                }
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                String str5 = str3;
                if (str5 != null) {
                    accessibilityNodeInfoCompat.setClassName(str5);
                }
                if (valueOf != null) {
                    accessibilityNodeInfoCompat.setCheckable(true);
                    accessibilityNodeInfoCompat.setChecked(valueOf.booleanValue());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view != null) {
            view.requestFocus();
            view.sendAccessibilityEvent(8);
            view.performAccessibilityAction(64, null);
        }
    }

    public void setRect(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d89c6d", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        } else if (this.v != null && !isDestroyed()) {
            int i = (int) f3;
            this.mWidth = i;
            int i2 = (int) f4;
            this.mHeight = i2;
            FrameLayout.LayoutParams layoutParams = this.v;
            layoutParams.width = i;
            layoutParams.height = i2;
            if (this.mTransitionTime > 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(this.mView.getMeasuredWidth(), this.v.width);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.flybird.FBView.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            return;
                        }
                        FrameLayout.LayoutParams layoutParams2 = FBView.this.v;
                        if (layoutParams2 != null) {
                            layoutParams2.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            FBView fBView = FBView.this;
                            View view = fBView.mView;
                            if (view != null) {
                                view.setLayoutParams(fBView.v);
                            }
                        }
                    }
                });
                ofInt.setDuration(this.mTransitionTime);
                ofInt.start();
                ValueAnimator ofInt2 = ValueAnimator.ofInt(this.mView.getMeasuredHeight(), this.v.height);
                ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.flybird.FBView.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            return;
                        }
                        FrameLayout.LayoutParams layoutParams2 = FBView.this.v;
                        if (layoutParams2 != null) {
                            layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            FBView fBView = FBView.this;
                            View view = fBView.mView;
                            if (view != null) {
                                view.setLayoutParams(fBView.v);
                            }
                        }
                    }
                });
                ofInt2.setDuration(this.mTransitionTime);
                ofInt2.start();
            }
            int i3 = this.mTransformDegree;
            if (i3 > 0) {
                int i4 = this.mTransitionTime;
                if (i4 <= 0) {
                    i4 = 350;
                }
                ObjectAnimator.ofFloat(this.mView, Key.ROTATION, 0.0f, i3 * 1.0f).setDuration(i4).start();
            }
            View view = this.mView;
            if (!(view instanceof FBScrollView) || !(view.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                View view2 = this.mView;
                if (view2 instanceof FBHScrollView) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.topMargin = (int) f2;
                        layoutParams2.leftMargin = (int) f;
                        layoutParams2.height = this.mHeight;
                        layoutParams2.width = this.mWidth;
                        View view3 = this.mView;
                        if (((FBHScrollView) view3).c) {
                            layoutParams2.width = Math.min(this.mWidth, FBTools.getScreenWidth(this.mView.getContext()) - FBTools.getLeftFromRoot(view3));
                        }
                        if (this.mNeedHandleClick || this.mNeedHandleLongClick) {
                            ((FBHScrollView) this.mView).getChildAt(0).setMinimumWidth((this.mWidth - this.mView.getPaddingLeft()) - this.mView.getPaddingRight());
                        }
                    }
                } else {
                    FrameLayout.LayoutParams layoutParams3 = this.v;
                    layoutParams3.leftMargin = (int) f;
                    layoutParams3.topMargin = (int) f2;
                }
            } else {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.mView.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.topMargin = (int) f2;
                    layoutParams4.leftMargin = (int) f;
                    layoutParams4.height = this.mHeight;
                    if (((FBScrollView) this.mView).isScrollable()) {
                        layoutParams4.height = Math.min(this.mHeight, (FBTools.getScreenHeight(this.mView.getContext()) - FBTools.getTopFromRoot(this.mView)) - this.mDoc.actionBarHeight);
                    }
                    if (this.mNeedHandleClick || this.mNeedHandleLongClick) {
                        ((FBScrollView) this.mView).getChildAt(0).setMinimumHeight((this.mHeight - this.mView.getPaddingTop()) - this.mView.getPaddingBottom());
                    }
                }
            }
            View view4 = this.mView;
            if (view4 != null && this.l) {
                AbsListView.LayoutParams layoutParams5 = this.w;
                FrameLayout.LayoutParams layoutParams6 = this.v;
                layoutParams5.width = layoutParams6.width;
                layoutParams5.height = layoutParams6.height;
            }
            if (view4 != null) {
                view4.requestLayout();
            }
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view instanceof FBScrollView) {
            ((FBScrollView) view).setOverScrollEnabled(this.mOverScrollEnabled);
        } else if (view instanceof FBHScrollView) {
            ((FBHScrollView) view).setOverScrollEnabled(this.mOverScrollEnabled);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f5, code lost:
        if (r10.equals("onmousedown") == false) goto L_0x005a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateEvent(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBView.updateEvent(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("9afd6c0e", new Object[]{this, num});
        }
        if (isDestroyed()) {
            return null;
        }
        nativePlatformInvokeCallback(this.mNode, "onthemechange", num.intValue() == 1 ? ThemeUtils.COLOR_SCHEME_DARK : "normal");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!isDestroyed()) {
            if (z) {
                nativePlatformOnFocus(this.mNode);
            } else {
                nativePlatformOnBlur(this.mNode);
            }
        }
    }

    public FBView(FBDocument fBDocument) {
        this.c = new String[3];
        this.d = false;
        this.h = Float.NaN;
        this.i = new float[8];
        this.j = Float.NaN;
        this.mWidth = 0;
        this.mHeight = 0;
        this.k = new float[4];
        this.m = true;
        this.o = 0;
        this.mNeedHandleClick = false;
        this.mNeedHandleLongClick = false;
        this.mNeedHandleMoreClick = false;
        this.mScrollVisibleDetectEnabled = false;
        this.mOverScrollEnabled = false;
        this.mScrollListenerEnabled = false;
        this.themeModeUseColorMapping = true;
        this.themeModeUseMaskMapping = false;
        this.p = new LinkedHashMap<>(8);
        this.r = true;
        this.s = false;
        this.mHasWidth = false;
        this.mHasHeight = false;
        this.mTransitionTime = -1;
        this.mTransformDegree = -1;
        this.t = false;
        this.mExtParams = new Bundle();
        this.u = new FBScrollView.FBScrollViewListener() { // from class: com.flybird.FBView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollBegin(int i, int i2, boolean z) {
                FBDocument fBDocument2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4d7cff70", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                } else if (z && (fBDocument2 = FBView.this.getFBDocument()) != null && fBDocument2.mCore != 0) {
                    float dp = FBDocumentAssistor.getDp();
                    FBView.nativePlatformOnScroll(FBView.this.mNode, -1, (int) (i / dp), (int) (i2 / dp));
                }
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollChanged(int i, int i2, int i3, int i4, boolean z) {
                FBPartialVisibilityHelper fBPartialVisibilityHelper;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3f8bab65", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
                    return;
                }
                FBDocument fBDocument2 = FBView.this.getFBDocument();
                if (fBDocument2 != null && fBDocument2.mCore != 0) {
                    float dp = FBDocumentAssistor.getDp();
                    FBView fBView = FBView.this;
                    float f = i2 / dp;
                    fBView.o = (int) (f + 0.5d);
                    if (z) {
                        FBView.nativePlatformOnScroll(fBView.mNode, 1, (int) (i / dp), (int) f);
                    }
                    if (FBView.this.mScrollVisibleDetectEnabled && (fBPartialVisibilityHelper = fBDocument2.K) != null) {
                        fBPartialVisibilityHelper.a();
                    }
                }
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollEnd(int i, int i2, boolean z) {
                FBDocument fBDocument2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c054adfe", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                } else if (z && (fBDocument2 = FBView.this.getFBDocument()) != null && fBDocument2.mCore != 0) {
                    float dp = FBDocumentAssistor.getDp();
                    FBView.nativePlatformOnScroll(FBView.this.mNode, 0, (int) (i / dp), (int) (i2 / dp));
                }
            }

            @Override // com.flybird.FBScrollView.FBScrollViewListener
            public void onScrollStop(int i, int i2, boolean z) {
                FBDocument fBDocument2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5488451f", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                } else if (z && (fBDocument2 = FBView.this.getFBDocument()) != null && fBDocument2.mCore != 0) {
                    float dp = FBDocumentAssistor.getDp();
                    FBView.nativePlatformOnScroll(FBView.this.mNode, 2, (int) (i / dp), (int) (i2 / dp));
                }
            }
        };
        this.v = new FrameLayout.LayoutParams(0, 0);
        this.w = new AbsListView.LayoutParams(0, 0);
        this.mOpacity = 1.0f;
        this.y = null;
        this.z = null;
        this.mDoc = fBDocument;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            if (this.mView != null) {
                IpChange ipChange2 = Platform.$ipChange;
            }
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view instanceof FBScrollView) {
            ((FBScrollView) view).setScrollListened(this.mScrollListenerEnabled);
        } else if (view instanceof FBHScrollView) {
            ((FBHScrollView) view).setScrollListened(this.mScrollListenerEnabled);
        }
    }
}
