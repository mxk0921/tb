package com.taobao.android.dinamicx.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXDarkModeCenter;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXGeneralMsgCenterEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.k;
import com.taobao.android.dinamicx.m;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.a66;
import tb.ac6;
import tb.b66;
import tb.bb5;
import tb.bi6;
import tb.c66;
import tb.dh5;
import tb.eb5;
import tb.ei6;
import tb.ex5;
import tb.f76;
import tb.fw5;
import tb.g76;
import tb.h36;
import tb.ic5;
import tb.j26;
import tb.jyc;
import tb.kl6;
import tb.lxb;
import tb.nb6;
import tb.nd5;
import tb.nj6;
import tb.nvb;
import tb.oj6;
import tb.owo;
import tb.pb6;
import tb.pg1;
import tb.ph5;
import tb.q26;
import tb.ql6;
import tb.qub;
import tb.rb6;
import tb.s4z;
import tb.sl6;
import tb.svb;
import tb.t2o;
import tb.tv5;
import tb.u56;
import tb.uch;
import tb.v56;
import tb.vu3;
import tb.vv5;
import tb.w56;
import tb.x56;
import tb.xv5;
import tb.y06;
import tb.y56;
import tb.y76;
import tb.yl6;
import tb.z56;
import tb.zb5;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXWidgetNode implements qub, svb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACCESSIBILITY_AUTO = 3;
    public static final int ACCESSIBILITY_DEF = -1;
    public static final int ACCESSIBILITY_OFF = 0;
    public static final int ACCESSIBILITY_OFF_CHILD = 2;
    public static final int ACCESSIBILITY_ON = 1;
    public static final int BORDER_TYPE_DASH = 1;
    public static final int BORDER_TYPE_NORMAL = 0;
    public static final int DIRECTION_NOT_SET = -1;
    public static final int DXGRAVITY_RLT_DELTA = 6;
    public static final int DXGravityCenter = 4;
    public static final int DXGravityCenterBottom = 5;
    public static final int DXGravityCenterTop = 3;
    public static final int DXGravityLeftBottom = 2;
    public static final int DXGravityLeftCenter = 1;
    public static final int DXGravityLeftTop = 0;
    public static final int DXGravityRightBottom = 8;
    public static final int DXGravityRightCenter = 7;
    public static final int DXGravityRightTop = 6;
    public static final long DXVIEW_ISRELAYOUTBOUNDARY = 350727206366142343L;
    public static final long DXVIEW_NEEDPOSTPREPAREBINDEVENT = -4260932846646087288L;
    public static final long DXVIEW_ONCREATEVIEW = 188822591186414296L;
    public static final long DXVIEW_ROTATIONX = 4617826730867065809L;
    public static final long DXVIEW_ROTATIONY = 4617826730867066322L;
    public static final long DXVIEW_ROTATIONZ = 4617826730867066835L;
    public static final long DXVIEW_SCALEX = 10147632719833830L;
    public static final long DXVIEW_SCALEY = 10147632719833895L;
    private static final long DXVIEW_TBORDERJSON = -1688385493169466985L;
    public static final long DXVIEW_TRANSLATIONX = -5563329329641359597L;
    public static final long DXVIEW_TRANSLATIONY = -5563329329641355500L;
    public static final int DX_BUTTER_FLAGS_NEED_UPDATE_LAYOUT_PARAMS = 1;
    public static final int DX_PROPERTY_MASK_NODE_ACCESSIBILITY = 32;
    public static final int DX_PROPERTY_MASK_NODE_ANIMATION = 256;
    public static final int DX_PROPERTY_MASK_NODE_BORDER = 16;
    public static final int DX_PROPERTY_MASK_NODE_COMMON = 64;
    public static final int DX_PROPERTY_MASK_NODE_CORNER = 8;
    public static final int DX_PROPERTY_MASK_NODE_FRAME = 128;
    public static final int DX_PROPERTY_MASK_NODE_LOW_FREQUENCY_PROPERTY = 4;
    public static final int DX_PROPERTY_MASK_NODE_MARGIN = 2;
    public static final int DX_PROPERTY_MASK_NODE_PADDING = 1;
    public static final int DX_VIEW_EVENTRESPONSEMODE_DISABLE_ALL = 3;
    public static final int DX_VIEW_EVENTRESPONSEMODE_DISABLE_CHILD = 2;
    public static final int DX_VIEW_EVENTRESPONSEMODE_DISABLE_SELF = 1;
    public static final int DX_VIEW_EVENTRESPONSEMODE_NORMAL = 0;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_ALPHA = 1;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_HEIGHT = 4;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_ROTATION_X = 256;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_ROTATION_Y = 512;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_ROTATION_Z = 1024;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_SCALE_X = 8;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_SCALE_Y = 16;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_TRANSLATION_X = 32;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_TRANSLATION_Y = 64;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_TRANSLATION_Z = 128;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_WIDTH = 2;
    public static final int DX_WIDGET_NODE_ATTR_PARSED = 2;
    public static final int DX_WIDGET_NODE_BIND_CHILD_CALLED = 4096;
    public static final int DX_WIDGET_NODE_BIND_CHILD_CALLED_NEED_CHECK = 524288;
    public static final int DX_WIDGET_NODE_EFFECT_EXECUTED = 1048576;
    public static final int DX_WIDGET_NODE_FLATTEND = 128;
    public static final int DX_WIDGET_NODE_FORCE_LAYOUT = 16384;
    public static final int DX_WIDGET_NODE_IS_PRE_RENDERED = 8192;
    public static final int DX_WIDGET_NODE_LAID_OUT = 32;
    public static final int DX_WIDGET_NODE_MEASURED = 8;
    public static final int DX_WIDGET_NODE_NEED_AP_PARSED = 2097152;
    public static final int DX_WIDGET_NODE_NEED_FLATTEN = 64;
    public static final int DX_WIDGET_NODE_NEED_LAYOUT = 16;
    public static final int DX_WIDGET_NODE_NEED_MEASURE = 4;
    public static final int DX_WIDGET_NODE_NEED_MEASURE_BEFORE_LAYOUT = 4194304;
    public static final int DX_WIDGET_NODE_NEED_PARSE = 1;
    public static final int DX_WIDGET_NODE_NEED_RENDER = 256;
    public static final int DX_WIDGET_NODE_PARSED = 32768;
    public static final int DX_WIDGET_NODE_PARSE_IN_MEASURE = 1024;
    public static final int DX_WIDGET_NODE_RENDERED = 512;
    public static final int DX_WIDGET_NODE_STATUS_DEFAULT = -1;
    public static final int DX_WIDGET_NODE_STATUS_EXPAND = 1;
    public static final int DX_WIDGET_NODE_STATUS_FLATTEN = 2;
    public static final int DX_WIDGET_NODE_STATUS_SKIP = 3;
    public static final int DX_WIDGET_NODE_VARIABLE_PARSED = 131072;
    public static final int DX_WIDGET_NODE_VIEW_FROM_CACHE = 65536;
    public static final int DX_WIDGET_NODE_VISIBILITY_PARSED = 2048;
    public static final int GONE = 2;
    public static final int INVISIBLE = 1;
    public static final int IS_ACCESSIBILITY_FALSE = 0;
    public static final int IS_ACCESSIBILITY_TRUE = 1;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;
    public static final int LAYOUT_GRAVITY_INIT_MASK = 1;
    public static final int LISTDATA_INIT_MASK = 2;
    public static final int MATCH_CONTENT = -2;
    public static final int MATCH_PARENT = -1;
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    public static final int MEASURED_SIZE_MASK = 16777215;
    public static final int MEASURED_STATE_MASK = -16777216;
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    public static final int NO = 0;
    public static final int POOL_SIZE_MAX = 10;
    public static final int POOL_SIZE_MID = 6;
    public static final int POOL_SIZE_MIN = 3;
    public static final int VISIBLE = 0;
    public static final int YES = 1;
    public int animationFlags;
    private zb5 animationHolder;
    public JSONObject animationObj;
    private int autoId;
    public Map<String, nd5> bindingXExecutingMap;
    public Map<String, nd5> bindingXSpecMap;
    public int butterFlags;
    public List<DXWidgetNode> children;
    private int childrenCount;
    public DXRuntimeContext dXRuntimeContext;
    private tv5 dxEventChains;
    private byte[] dxExprBytes;
    public u56 dxNodeAccessibility;
    public v56 dxNodeAnimation;
    public w56 dxNodeBorder;
    public m dxNodeCommon;
    public volatile x56 dxNodeConstantProperty;
    public y56 dxNodeCorner;
    public z56 dxNodeFrame;
    public a66 dxNodeLowFrequencyProperty;
    public b66 dxNodeMargin;
    public c66 dxNodePadding;
    public g76 dxOriginTreeProperty;
    private DXWidgetNode dxRootWidgetCache;
    public ql6 dxv3VariableInfo;
    public sl6 dxv4Properties;
    private JSONArray exportMethods;
    public ex5 flattenNode;
    private boolean hasHandleDark;
    public boolean isEnableButter;
    public boolean isFlatten;
    public boolean isViewStub;
    private int lastAutoId;
    public int layoutHeight;
    public int layoutWidth;
    public DXLongSparseArray<Long> mMeasureCache;
    private View nativeView;
    public boolean needSetBackground;
    public f76 originInfo;
    public DXWidgetNode parentWidget;
    public int privateFlags;
    private int propertyDeepCloneFlag;
    public int propertyInitFlag;
    private q26 realLayoutAttribute;
    private WeakReference<DXWidgetNode> referenceNode;
    public DXLongSparseArray<Double> screenAttrNode;
    private WeakReference<DXWidgetNode> sourceWidgetWR;
    private lxb strategy;
    public String userId;
    private ViewGroup viewContainer;
    private fw5 viewStubExprNode;
    private WeakReference<View> weakView;
    public static final int TAG_WIDGET_NODE = R.id.dinamicXWidgetNodeTag;
    private static boolean sAlwaysRemeasureExactly = false;
    private static ThreadLocal<q26> attributeThreadLocal = new ThreadLocal<>();
    private int status = -1;
    private int sourceAutoId = -1;
    private boolean measureCacheInvalidation = false;
    private boolean viewMatrixChanged = false;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXAnimatingPropertyFlag {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXGravity {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DXMeasureSpec {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int AT_MOST = Integer.MIN_VALUE;
        public static final int EXACTLY = 1073741824;
        public static final int UNSPECIFIED = 0;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public @interface MeasureSpecMode {
        }

        static {
            t2o.a(444597442);
        }

        public static int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("841744d6", new Object[]{new Integer(i)})).intValue();
            }
            return i & (-1073741824);
        }

        public static int b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1a33e938", new Object[]{new Integer(i)})).intValue();
            }
            return i & uch.MAX_CAPACITY_MASK;
        }

        public static int c(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a4dd645", new Object[]{new Integer(i), new Integer(i2)})).intValue();
            }
            return (i & uch.MAX_CAPACITY_MASK) | (i2 & (-1073741824));
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXNodePropertyInitMask {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXWidgetNodeStatFlag {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                DXWidgetNode.this.onTapEvent();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            DXWidgetNode.this.onLongTap();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597439);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXWidgetNode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public GradientDrawable.Orientation b;
        public int[] c;

        /* renamed from: a  reason: collision with root package name */
        public int f7413a = -1;
        public final float[] d = {0.0f, 1.0f};

        static {
            t2o.a(444597446);
        }

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1596797a", new Object[]{this})).intValue();
            }
            return this.f7413a;
        }

        public int[] b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("d40ffa62", new Object[]{this});
            }
            return this.c;
        }

        public GradientDrawable.Orientation c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GradientDrawable.Orientation) ipChange.ipc$dispatch("ac74cd23", new Object[]{this});
            }
            return this.b;
        }

        public void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78cf36d0", new Object[]{this, new Integer(i)});
            } else {
                this.f7413a = i;
            }
        }

        public void e(int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9dc47b5c", new Object[]{this, iArr});
            } else {
                this.c = iArr;
            }
        }

        public void f(GradientDrawable.Orientation orientation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5f09997", new Object[]{this, orientation});
            } else {
                this.b = orientation;
            }
        }

        public float[] g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("fa1681fb", new Object[]{this});
            }
            return this.d;
        }
    }

    static {
        t2o.a(444597434);
        t2o.a(444597451);
        t2o.a(444597452);
        t2o.a(444597730);
    }

    private void bindChildrenMeasureFlag(DXWidgetRefreshOption dXWidgetRefreshOption) {
        List<DXWidgetNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66cae44", new Object[]{this, dXWidgetRefreshOption});
            return;
        }
        if (dXWidgetRefreshOption.g() == 3) {
            if (isShouldUpdate()) {
                list = getPartRefreshChildren();
            } else {
                return;
            }
        } else if (!isMarkContainerLayout()) {
            list = getChildren();
        } else if (dXWidgetRefreshOption.g() == 0) {
            return;
        } else {
            if (1 == dXWidgetRefreshOption.g()) {
                if (this instanceof o) {
                    list = ((o) this).itemWidgetNodes;
                } else {
                    list = null;
                }
                if (this instanceof DXAbsContainerBaseLayout) {
                    list = ((DXAbsContainerBaseLayout) this).y();
                }
            } else if (2 != dXWidgetRefreshOption.g()) {
                list = null;
            } else {
                return;
            }
        }
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                DXWidgetNode dXWidgetNode = list.get(i);
                if (dXWidgetRefreshOption.g() != 3 || dXWidgetNode.isShouldUpdate()) {
                    dXWidgetNode.setStatFlag(16384);
                    dXWidgetNode.setStatFlag(4);
                    dXWidgetNode.unsetStatFlag(8);
                    dXWidgetNode.unsetStatFlag(32);
                    dXWidgetNode.unsetStatFlag(2048);
                    dXWidgetNode.bindChildrenMeasureFlag(dXWidgetRefreshOption);
                }
            }
        }
    }

    private void bindChildrenParseFlag(DXWidgetRefreshOption dXWidgetRefreshOption) {
        List<DXWidgetNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6fab59", new Object[]{this, dXWidgetRefreshOption});
            return;
        }
        if (dXWidgetRefreshOption.g() == 3) {
            if (isShouldUpdate()) {
                list = getPartRefreshChildren();
            } else {
                return;
            }
        } else if (isMarkContainerLayout()) {
            if (dXWidgetRefreshOption.g() == 0) {
                return;
            }
            if (1 == dXWidgetRefreshOption.g()) {
                if (this instanceof o) {
                    list = ((o) this).itemWidgetNodes;
                } else {
                    list = null;
                }
                if (this instanceof DXAbsContainerBaseLayout) {
                    list = ((DXAbsContainerBaseLayout) this).y();
                }
            } else if (2 == dXWidgetRefreshOption.g()) {
                unsetStatFlag(4096);
                return;
            } else {
                list = null;
            }
        } else if (this instanceof o) {
            list = ((o) this).itemWidgetNodes;
        } else if (this instanceof DXAbsContainerBaseLayout) {
            list = ((DXAbsContainerBaseLayout) this).y();
        } else {
            list = getChildren();
        }
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                DXWidgetNode dXWidgetNode = list.get(i);
                if ((dXWidgetRefreshOption.g() != 0 || !dXWidgetNode.isMarkContainerLayout()) && (dXWidgetRefreshOption.g() != 3 || dXWidgetNode.isShouldUpdate())) {
                    dXWidgetNode.setStatFlag(1);
                    dXWidgetNode.unsetStatFlag(2);
                    dXWidgetNode.setStatFlag(16384);
                    dXWidgetNode.setStatFlag(4);
                    dXWidgetNode.unsetStatFlag(8);
                    dXWidgetNode.unsetStatFlag(32);
                    dXWidgetNode.setStatFlag(256);
                    dXWidgetNode.unsetStatFlag(2048);
                    if (dXWidgetRefreshOption.l()) {
                        dXWidgetNode.setStatFlag(2097152);
                    }
                    if (dXWidgetRefreshOption.g() == 3) {
                        if (dXWidgetNode.isShouldUpdate()) {
                            unsetStatFlag(4096);
                            setStatFlag(524288);
                        } else {
                            return;
                        }
                    } else if (!dXWidgetNode.isMarkContainerLayout()) {
                        dXWidgetNode.unsetStatFlag(4096);
                    }
                    dXWidgetNode.bindChildrenParseFlag(dXWidgetRefreshOption);
                }
            }
        }
    }

    private void bindParentMeasureFlag(DXWidgetNode dXWidgetNode, boolean z, DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aefc377e", new Object[]{this, dXWidgetNode, new Boolean(z), dXWidgetRefreshOption});
            return;
        }
        this.privateFlags = (this.privateFlags | 16384) & (-41);
        if ((this.parentWidget instanceof DXRecyclerLayout) || ((zg5.p5() && (this.parentWidget instanceof o)) || (zg5.S2() && (this.parentWidget instanceof DXAbsContainerBaseLayout)))) {
            if (dXWidgetRefreshOption == null || !dXWidgetRefreshOption.l()) {
                updateRefreshType(1);
            } else {
                updateRefreshType(2);
            }
            if (z) {
                setStatFlag(1);
            } else {
                setStatFlag(4);
            }
            DXWidgetNode dXWidgetNode2 = this.parentWidget;
            if (dXWidgetNode2 instanceof DXRecyclerLayout) {
                ((DXRecyclerLayout) dXWidgetNode2).V0(this);
                return;
            }
        } else {
            boolean z2 = this instanceof DXRecyclerLayout;
            if (z2 || (this instanceof o) || (zg5.S2() && (this instanceof DXAbsContainerBaseLayout))) {
                if (dXWidgetRefreshOption == null || !dXWidgetRefreshOption.l()) {
                    dXWidgetNode.updateRefreshType(1);
                } else {
                    dXWidgetNode.updateRefreshType(2);
                }
                if (z) {
                    dXWidgetNode.setStatFlag(1);
                } else {
                    dXWidgetNode.setStatFlag(4);
                }
                if (z2) {
                    ((DXRecyclerLayout) this).V0(dXWidgetNode);
                    return;
                }
            }
        }
        DXWidgetNode dXWidgetNode3 = this.parentWidget;
        if (dXWidgetNode3 != null) {
            dXWidgetNode3.bindParentMeasureFlag(this, z, dXWidgetRefreshOption);
        } else if (z) {
            sendPartParserEvent(dXWidgetRefreshOption);
        } else {
            sendPartMeasureLayoutEvent(dXWidgetRefreshOption);
        }
    }

    private void bindParentMeasureFlagWithOption(boolean z, DXWidgetRefreshOption dXWidgetRefreshOption) {
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95dfc1de", new Object[]{this, new Boolean(z), dXWidgetRefreshOption});
        } else if (dXWidgetRefreshOption != null && (dXWidgetNode = this.parentWidget) != null) {
            if (dXWidgetRefreshOption.g() != 3) {
                dXWidgetNode.privateFlags = (dXWidgetNode.privateFlags | 16384) & (-41);
            } else if (dXWidgetNode.isShouldUpdate()) {
                dXWidgetNode.privateFlags = (dXWidgetNode.privateFlags | 16384) & (-41);
            }
            if ((dXWidgetNode instanceof DXRecyclerLayout) || (dXWidgetNode instanceof o) || (zg5.S2() && (dXWidgetNode instanceof DXAbsContainerBaseLayout))) {
                if (dXWidgetRefreshOption.l()) {
                    updateRefreshType(2);
                } else {
                    updateRefreshType(1);
                }
                if (z) {
                    setStatFlag(1);
                } else {
                    setStatFlag(4);
                }
                DXWidgetNode dXWidgetNode2 = this.parentWidget;
                if (dXWidgetNode2 instanceof DXRecyclerLayout) {
                    ((DXRecyclerLayout) dXWidgetNode2).V0(this);
                    return;
                }
            }
            if (dXWidgetNode.parentWidget != null) {
                dXWidgetNode.bindParentMeasureFlagWithOption(z, dXWidgetRefreshOption);
            } else if (z) {
                dXWidgetNode.sendPartParserEvent(dXWidgetRefreshOption);
            } else {
                dXWidgetNode.sendPartMeasureLayoutEvent(dXWidgetRefreshOption);
            }
        }
    }

    public static int combineMeasuredStates(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c972161", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return i | i2;
    }

    public static int getDefaultSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3e116c6", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return size;
        }
        return i;
    }

    private View getRealView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("849d5722", new Object[]{this});
        }
        if (!eb5.w()) {
            WeakReference<View> weakReference = this.weakView;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        } else if (getFlattenNode() == null) {
            return null;
        } else {
            return getFlattenNode().z();
        }
    }

    private final void invalidateSelf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9f82e", new Object[]{this});
        } else {
            getDXRuntimeContext().k().w(this, this.viewContainer);
        }
    }

    private boolean isMarkContainerLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f3c5d7f", new Object[]{this})).booleanValue();
        }
        if ((this instanceof DXAbsContainerBaseLayout) || (this instanceof o)) {
            return ((j) this).isMarkContainer();
        }
        return false;
    }

    private boolean onEventV4(DXEvent dXEvent) {
        nvb nvbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("692580a6", new Object[]{this, dXEvent})).booleanValue();
        }
        sl6 sl6Var = this.dxv4Properties;
        if (sl6Var == null || sl6Var.h() == null || (nvbVar = this.dxv4Properties.h().get(dXEvent.getEventId())) == null) {
            return false;
        }
        return nvbVar.executeEvent(dXEvent, getDXRuntimeContext());
    }

    private void parseTreeInfo(JSONObject jSONObject) {
        ArrayList<DXWidgetNode> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173f656a", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (this instanceof DXAbsContainerBaseLayout) {
            DXAbsContainerBaseLayout dXAbsContainerBaseLayout = (DXAbsContainerBaseLayout) this;
            if (dXAbsContainerBaseLayout.y() != null) {
                for (DXWidgetNode dXWidgetNode : dXAbsContainerBaseLayout.y()) {
                    dXWidgetNode.parseTreeInfo(jSONObject2);
                }
            }
        }
        if ((this instanceof o) && (arrayList = ((o) this).itemWidgetNodes) != null) {
            Iterator<DXWidgetNode> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().parseTreeInfo(jSONObject2);
            }
        }
        List<DXWidgetNode> list = this.children;
        if (list != null) {
            for (DXWidgetNode dXWidgetNode2 : list) {
                dXWidgetNode2.parseTreeInfo(jSONObject2);
            }
        }
        jSONObject.put(toSelfWidgetNodeInfo(), (Object) jSONObject2);
    }

    private DXWidgetNode queryWidgetNodeByUserIdFromMap(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("534ab9bb", new Object[]{this, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals(getUserId())) {
            return this;
        }
        DXWidgetNode queryRootWidgetNode = queryRootWidgetNode();
        if (!(queryRootWidgetNode instanceof j) && !(queryRootWidgetNode instanceof r)) {
            return null;
        }
        Map<String, WeakReference<DXWidgetNode>> dxUserIdMap = queryRootWidgetNode.getDxUserIdMap();
        if (dxUserIdMap == null) {
            return queryWTByUserId(str);
        }
        WeakReference<DXWidgetNode> weakReference = dxUserIdMap.get(str);
        if (weakReference == null) {
            return queryWTByUserId(str);
        }
        DXWidgetNode dXWidgetNode = weakReference.get();
        if (dXWidgetNode == null) {
            return queryWTByUserId(str);
        }
        return dXWidgetNode;
    }

    private void refreshRecyclerLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca7028b", new Object[]{this});
        } else if (this instanceof DXRecyclerLayout) {
            DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) this;
            DXGeneralMsgCenterEvent dXGeneralMsgCenterEvent = new DXGeneralMsgCenterEvent();
            dXGeneralMsgCenterEvent.setMethod(DXRecyclerLayout.MSG_METHOD_REFRESH_DATA);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", (Object) dXRecyclerLayout.x());
            dXGeneralMsgCenterEvent.setParams(jSONObject);
            dXRecyclerLayout.postEvent(dXGeneralMsgCenterEvent);
        }
    }

    public static int resolveSizeAndState(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d425ea8", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int a2 = DXMeasureSpec.a(i2);
        int b2 = DXMeasureSpec.b(i2);
        if (a2 != Integer.MIN_VALUE) {
            if (a2 == 1073741824) {
                i = b2;
            }
        } else if (b2 < i) {
            i = 16777216 | b2;
        }
        return i | ((-16777216) & i3);
    }

    public void _bindAccessibilityToView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5311d96a", new Object[]{this, view, new Integer(i)});
        } else {
            bindAccessibilityToView(view, i);
        }
    }

    public final View _createViewOnlyForCache(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9e41cfe", new Object[]{this, context});
        }
        return onCreateView(context);
    }

    public final void addChild(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bac576d", new Object[]{this, dXWidgetNode});
        } else {
            addChild(dXWidgetNode, true);
        }
    }

    @Deprecated
    public void addLanguageConfig(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de07c864", new Object[]{this, str, jSONObject});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new x56();
        }
        if (this.dxNodeConstantProperty.h == null) {
            this.dxNodeConstantProperty.h = new ConcurrentHashMap();
        }
        this.dxNodeConstantProperty.h.put(str, jSONObject);
    }

    public synchronized void addLanguageConfigSync(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc2188c9", new Object[]{this, str, jSONObject});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new x56();
        }
        if (this.dxNodeConstantProperty.h == null) {
            this.dxNodeConstantProperty.h = new ConcurrentHashMap();
        }
        this.dxNodeConstantProperty.h.put(str, jSONObject);
    }

    public void beforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f39b171", new Object[]{this});
            return;
        }
        lxb lxbVar = this.strategy;
        if (lxbVar != null) {
            lxbVar.d(this);
        } else {
            onBeforeBindChildData();
        }
    }

    public void beforeBindChildDataWithButter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b3d477", new Object[]{this});
        } else {
            onBeforeBindChildDataWithButter();
        }
    }

    public final void beginParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b9c9a05", new Object[]{this, new Boolean(z)});
            return;
        }
        lxb lxbVar = this.strategy;
        if (lxbVar != null) {
            lxbVar.c(this, z);
            return;
        }
        onBeginParser();
        onBeginParser(z);
    }

    public void beginParserWithButter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8cd1d3f", new Object[]{this, new Boolean(z)});
            return;
        }
        onBeginParser();
        onBeginParser(z);
    }

    public final void beginSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f52d08f", new Object[]{this, context});
        } else {
            onBeginSetConstAttribute(context);
        }
    }

    public void bindDataEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296e05a", new Object[]{this});
        } else {
            postEvent(new DXEvent(2683803675109176030L));
        }
    }

    public final void bindEvent(Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e48b9e4", new Object[]{this, context});
        } else if (isV4Node()) {
            if (getDxv4Properties() != null && getDxv4Properties().h() != null) {
                View realView = getRealView();
                while (i < getDxv4Properties().h().size()) {
                    getReferenceNode().onBindEvent(context, realView, getDxv4Properties().h().keyAt(i));
                    i++;
                }
            }
        } else if (getEventHandlersExprNode() != null) {
            View realView2 = getRealView();
            while (i < getEventHandlersExprNode().size()) {
                getReferenceNode().onBindEvent(context, realView2, getEventHandlersExprNode().keyAt(i));
                i++;
            }
        }
    }

    public void bindRenderOptions(DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca762e", new Object[]{this, dXRenderOptions});
        }
    }

    public void bindRuntimeContext(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2788f0c", new Object[]{this, dXRuntimeContext});
        } else {
            bindRuntimeContext(dXRuntimeContext, false);
        }
    }

    @Override // tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXWidgetNode();
    }

    public DXWidgetNode butterClone(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("498d0cd4", new Object[]{this, dXRuntimeContext});
        }
        DXWidgetNode shallowButterClone = shallowButterClone(dXRuntimeContext);
        if (this.children != null) {
            shallowButterClone.children = new ArrayList();
            for (int i = 0; i < this.children.size(); i++) {
                shallowButterClone.addChild(this.children.get(i).butterClone(dXRuntimeContext), false);
            }
        }
        return shallowButterClone;
    }

    public void changeVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b79ba69", new Object[]{this});
            return;
        }
        int checkRealVisibility = checkRealVisibility();
        View nativeView = getNativeView();
        if (nativeView != null) {
            setRealViewVisibility(nativeView, checkRealVisibility);
        }
    }

    public boolean containsExecutingAnimationSpec(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc3f5e21", new Object[]{this, str})).booleanValue();
        }
        Map<String, nd5> map = this.bindingXExecutingMap;
        if (map == null || map.size() == 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.bindingXExecutingMap.containsKey(str);
    }

    public final void createNativeView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1162a9", new Object[]{this, context});
        } else if (getNativeView() == null) {
            View onCreateView = onCreateView(context);
            this.weakView = new WeakReference<>(onCreateView);
            this.nativeView = onCreateView;
            onCreateView.setTag(TAG_WIDGET_NODE, this);
            postEvent(new DXEvent(DXVIEW_ONCREATEVIEW));
        }
    }

    public final View createView(Context context) {
        DXWidgetNode dXWidgetNode;
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        View realView = getRealView();
        if (realView == null) {
            if (Thread.currentThread() != Looper.getMainLooper().getThread() || getDXRuntimeContext() == null || getDXRuntimeContext().s() == null || getDXRuntimeContext().s().f() == null || getDXRuntimeContext().s().f().R() == null || !getDXRuntimeContext().s().p() || (a2 = getDXRuntimeContext().s().f().R().a(getDXRuntimeContext(), getClass())) == null) {
                if (isFlatten()) {
                    dXWidgetNode = getReferenceNode();
                } else {
                    dXWidgetNode = this;
                }
                realView = dXWidgetNode.onCreateView(context);
                this.privateFlags |= 256;
                if (realView == null && zg5.b4(this)) {
                    return null;
                }
                if (eb5.w()) {
                    kl6.d(getFlattenNode(), realView);
                } else {
                    kl6.e(realView, this);
                }
                this.weakView = new WeakReference<>(realView);
                if (isSoftwareRender()) {
                    realView.setLayerType(1, null);
                }
                postEvent(new DXEvent(DXVIEW_ONCREATEVIEW));
            } else {
                getReferenceNode();
                this.privateFlags |= 256;
                if (eb5.w()) {
                    kl6.d(getFlattenNode(), a2);
                } else {
                    kl6.e(a2, this);
                }
                this.weakView = new WeakReference<>(a2);
                if (isSoftwareRender()) {
                    a2.setLayerType(1, null);
                }
                postEvent(new DXEvent(DXVIEW_ONCREATEVIEW));
                setStatFlag(65536);
                DinamicXEngine.j0();
                return a2;
            }
        }
        return realView;
    }

    public DXWidgetNode deepClone(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("442ee468", new Object[]{this, dXRuntimeContext});
        }
        DXWidgetNode dXWidgetNode = (DXWidgetNode) shallowClone(dXRuntimeContext, true);
        if (this.children != null) {
            dXWidgetNode.children = new ArrayList();
            for (int i = 0; i < this.children.size(); i++) {
                dXWidgetNode.addChild(this.children.get(i).deepClone(dXRuntimeContext));
            }
        }
        return dXWidgetNode;
    }

    public DXWidgetNode deepCloneForEmbed(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("5042318", new Object[]{this, dXRuntimeContext});
        }
        DXWidgetNode dXWidgetNode = (DXWidgetNode) shallowClone(dXRuntimeContext, true);
        dXWidgetNode.initOriginInfo(dXWidgetNode);
        dXWidgetNode.setDxOriginTreeProperty(getDxOriginTreeProperty());
        if (this.children != null) {
            dXWidgetNode.children = new ArrayList();
            for (int i = 0; i < this.children.size(); i++) {
                DXWidgetNode deepCloneForEmbed = this.children.get(i).deepCloneForEmbed(dXRuntimeContext);
                deepCloneForEmbed.initOriginInfo(deepCloneForEmbed);
                dXWidgetNode.addChild(deepCloneForEmbed);
            }
        }
        return dXWidgetNode;
    }

    public void defaultLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db45f92", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            int i5 = this.privateFlags;
            if (!((4 & i5) == 0 && (4194304 & i5) == 0)) {
                onMeasure(getOldWidthMeasureSpec(), getOldHeightMeasureSpec());
                this.privateFlags = (this.privateFlags & (-4194309)) | 8;
                if (zg5.g4()) {
                    this.privateFlags |= 16;
                }
            }
            boolean frame = setFrame(i, i2, i3, i4);
            if (frame || (this.privateFlags & 16) == 16) {
                onLayout(frame, i, i2, i3, i4);
                this.privateFlags &= -17;
                DXRuntimeContext dXRuntimeContext = this.dXRuntimeContext;
                if (dXRuntimeContext != null && dXRuntimeContext.b0()) {
                    this.privateFlags |= 256;
                }
            }
            this.privateFlags = (this.privateFlags & (-16385)) | 32;
        } catch (Exception e) {
            xv5.b(e);
            DXRuntimeContext dXRuntimeContext2 = getDXRuntimeContext();
            if (dXRuntimeContext2 != null && dXRuntimeContext2.m() != null) {
                f.a aVar = new f.a("Pipeline_Detail", "Pipeline_Detail_PerformLayout", 80007);
                aVar.e = xv5.a(e);
                ((ArrayList) dXRuntimeContext2.m().c).add(aVar);
            }
        }
    }

    public final void endParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617d693", new Object[]{this, new Boolean(z)});
            return;
        }
        lxb lxbVar = this.strategy;
        if (lxbVar != null) {
            lxbVar.b(this, z);
            this.measureCacheInvalidation = true;
            return;
        }
        if (zg5.w5(getDXRuntimeContext())) {
            processUserId();
        }
        onEndParser();
        onEndParser(z);
        this.measureCacheInvalidation = true;
    }

    public void endParserWithButter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648804d", new Object[]{this, new Boolean(z)});
            return;
        }
        if (zg5.w5(getDXRuntimeContext())) {
            processUserId();
        }
        onEndParser();
        onEndParser(z);
    }

    public final void endSetConstAttribute(Context context) {
        View nativeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873f5941", new Object[]{this, context});
            return;
        }
        onEndSetConstAttribute(context);
        if (isSoftwareRender() && (nativeView = getNativeView()) != null) {
            nativeView.setLayerType(1, null);
        }
    }

    public JSONArray exportMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7cac5ab9", new Object[]{this});
        }
        if (this.exportMethods == null) {
            this.exportMethods = new JSONArray() { // from class: com.taobao.android.dinamicx.widget.DXWidgetNode.2
                {
                    add("render");
                    add("refresh");
                    add(pg1.ATOM_EXT_getBoundingClientRect);
                    add("commit");
                }
            };
        }
        return this.exportMethods;
    }

    public boolean extraHandleDark() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe5f779", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public int getAccessibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d187612", new Object[]{this})).intValue();
        }
        if (eb5.w() && getFlattenNode() != null) {
            return getFlattenNode().e();
        }
        u56 u56Var = this.dxNodeAccessibility;
        if (u56Var == null) {
            return -1;
        }
        return u56Var.f29150a;
    }

    public String getAccessibilityRole() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf74918b", new Object[]{this});
        }
        u56 u56Var = this.dxNodeAccessibility;
        if (u56Var == null) {
            return null;
        }
        return u56Var.c;
    }

    public String getAccessibilityText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4beeb534", new Object[]{this});
        }
        u56 u56Var = this.dxNodeAccessibility;
        if (u56Var == null) {
            return null;
        }
        return u56Var.b;
    }

    public float getAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf8c81f", new Object[]{this})).floatValue();
        }
        m mVar = this.dxNodeCommon;
        if (mVar == null) {
            return 1.0f;
        }
        return mVar.d;
    }

    public String getAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95de4eeb", new Object[]{this});
        }
        if (this.dxNodeConstantProperty == null) {
            return null;
        }
        return this.dxNodeConstantProperty.f;
    }

    public JSONObject getAnimationObj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f72bf070", new Object[]{this});
        }
        if (TextUtils.isEmpty(getAnimation())) {
            return null;
        }
        JSONObject jSONObject = this.animationObj;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            this.animationObj = JSON.parseObject(getAnimation());
        } catch (Throwable th) {
            xv5.b(th);
        }
        return this.animationObj;
    }

    public int getAutoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c55fce9a", new Object[]{this})).intValue();
        }
        return this.autoId;
    }

    public int getBackGroundColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc5e9d79", new Object[]{this})).intValue();
        }
        m mVar = this.dxNodeCommon;
        if (mVar == null) {
            return 0;
        }
        return mVar.e;
    }

    public d getBackgroundGradient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("626a2aba", new Object[]{this});
        }
        m mVar = this.dxNodeCommon;
        if (mVar == null) {
            return null;
        }
        return mVar.f;
    }

    public Map<String, nd5> getBindingXExecutingMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7efc034f", new Object[]{this});
        }
        return this.bindingXExecutingMap;
    }

    public Map<String, nd5> getBindingXSpecMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5926b7f4", new Object[]{this});
        }
        return this.bindingXSpecMap;
    }

    public int getBorderType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9ab9ff6", new Object[]{this})).intValue();
        }
        w56 w56Var = this.dxNodeBorder;
        if (w56Var == null) {
            return 0;
        }
        return w56Var.c;
    }

    public int getBorderWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c84ce3e", new Object[]{this})).intValue();
        }
        w56 w56Var = this.dxNodeBorder;
        if (w56Var == null) {
            return -1;
        }
        return w56Var.f30469a;
    }

    public int getBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e4c91b", new Object[]{this})).intValue();
        }
        z56 z56Var = this.dxNodeFrame;
        if (z56Var == null) {
            return 0;
        }
        return z56Var.d;
    }

    public DXWidgetNode getChildAt(int i) {
        List<DXWidgetNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("2070a3e2", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.childrenCount || (list = this.children) == null) {
            return null;
        }
        return list.get(i);
    }

    public int getChildGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c013082", new Object[]{this})).intValue();
        }
        m mVar = this.dxNodeCommon;
        if (mVar == null) {
            return 0;
        }
        return mVar.c;
    }

    public List<DXWidgetNode> getChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this});
        }
        return this.children;
    }

    public int getChildrenCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62bc4e14", new Object[]{this})).intValue();
        }
        return this.childrenCount;
    }

    public DXLongSparseArray<fw5> getCodeMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("f4dc2d01", new Object[]{this});
        }
        if (this.dxNodeConstantProperty == null) {
            return null;
        }
        return this.dxNodeConstantProperty.e;
    }

    public LongSparseArray<dh5> getConstAttributeMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("b708c693", new Object[]{this});
        }
        if (this.dxNodeConstantProperty == null) {
            return null;
        }
        return this.dxNodeConstantProperty.f31150a;
    }

    public int getCornerRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c34be7b7", new Object[]{this})).intValue();
        }
        y56 y56Var = this.dxNodeCorner;
        if (y56Var == null) {
            return 0;
        }
        return y56Var.f31861a;
    }

    public int getCornerRadiusLeftBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bd77a9", new Object[]{this})).intValue();
        }
        y56 y56Var = this.dxNodeCorner;
        if (y56Var == null) {
            return 0;
        }
        return y56Var.d;
    }

    public int getCornerRadiusLeftTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26c5b4b", new Object[]{this})).intValue();
        }
        y56 y56Var = this.dxNodeCorner;
        if (y56Var == null) {
            return 0;
        }
        return y56Var.b;
    }

    public int getCornerRadiusRightTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37bd3bf0", new Object[]{this})).intValue();
        }
        y56 y56Var = this.dxNodeCorner;
        if (y56Var == null) {
            return 0;
        }
        return y56Var.c;
    }

    public DXRuntimeContext getDXRuntimeContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("a960eebf", new Object[]{this});
        }
        return this.dXRuntimeContext;
    }

    public Map<String, Integer> getDarkModeColorMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e5c85044", new Object[]{this});
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return null;
        }
        return a66Var.k;
    }

    public int getDashGap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8d85f28", new Object[]{this})).intValue();
        }
        w56 w56Var = this.dxNodeBorder;
        if (w56Var == null) {
            return -1;
        }
        return w56Var.e;
    }

    public int getDashWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67bdb018", new Object[]{this})).intValue();
        }
        w56 w56Var = this.dxNodeBorder;
        if (w56Var == null) {
            return -1;
        }
        return w56Var.d;
    }

    public LongSparseArray<fw5> getDataParsersExprNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("2f581ad1", new Object[]{this});
        }
        if (this.dxNodeConstantProperty == null) {
            return null;
        }
        return this.dxNodeConstantProperty.c;
    }

    public Object getDefaultValueForAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("469dcc09", new Object[]{this, new Long(j)});
        }
        return null;
    }

    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }

    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (20052926345925L == j || 9346582897824575L == j || -916628110244908525L == j || -4674119579031497081L == j || -2641581645694792774L == j || 6506044224063169535L == j || -378913133726214547L == j || 3229586316762092001L == j || -2632461973017864940L == j || -4745829179314597287L == j || 4879707785646574221L == j || -3218010051991756042L == j || 7504432960089273802L == j || 5802348655878590802L == j || -8019934667170236535L == j || -8020113231441560440L == j || 1844153004063100714L == j || -6579663421190292502L == j || -5241271604340946425L == j || 3998176004939777025L == j) {
            return 0;
        }
        if (16887479372907L == j || 4804789929613330386L == j || j == -6311293910063768578L) {
            return 1;
        }
        return 0;
    }

    public JSONArray getDefaultValueForListAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a3068013", new Object[]{this, new Long(j)});
        }
        return null;
    }

    public long getDefaultValueForLongAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf4ae4a1", new Object[]{this, new Long(j)})).longValue();
        }
        return 0L;
    }

    public JSONObject getDefaultValueForMapAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("638dd53", new Object[]{this, new Long(j)});
        }
        return null;
    }

    public Object getDefaultValueForObjectAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("68bb4468", new Object[]{this, new Long(j)});
        }
        return null;
    }

    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        return "";
    }

    public int getDirection() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9db770c3", new Object[]{this})).intValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var != null && (i = a66Var.b) != -1) {
            return i;
        }
        DXRuntimeContext dXRuntimeContext = this.dXRuntimeContext;
        if (dXRuntimeContext != null) {
            return dXRuntimeContext.F();
        }
        return 0;
    }

    public tv5 getDxEventChains() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tv5) ipChange.ipc$dispatch("6f765759", new Object[]{this});
        }
        return this.dxEventChains;
    }

    public byte[] getDxExprBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("46cecaa", new Object[]{this});
        }
        return this.dxExprBytes;
    }

    public v56 getDxNodeAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v56) ipChange.ipc$dispatch("d254c5f0", new Object[]{this});
        }
        return this.dxNodeAnimation;
    }

    public g76 getDxOriginTreeProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g76) ipChange.ipc$dispatch("3a5f6916", new Object[]{this});
        }
        if (getOriginNode() == null) {
            return null;
        }
        return getOriginNode().dxOriginTreeProperty;
    }

    public Map<String, WeakReference<DXWidgetNode>> getDxUserIdMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("60c39548", new Object[]{this});
        }
        return null;
    }

    public ql6 getDxv3VariableInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ql6) ipChange.ipc$dispatch("7ee25bb6", new Object[]{this});
        }
        return this.dxv3VariableInfo;
    }

    public sl6 getDxv4Properties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sl6) ipChange.ipc$dispatch("c988f9a6", new Object[]{this});
        }
        return this.dxv4Properties;
    }

    public int getEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84d1ce05", new Object[]{this})).intValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return 1;
        }
        return a66Var.d;
    }

    public DinamicXEngine getEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("b092b8e8", new Object[]{this});
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            return null;
        }
        return dXRuntimeContext.r();
    }

    public DXLongSparseArray<Map<String, Integer>> getEnumMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("d9aac96d", new Object[]{this});
        }
        if (this.dxNodeConstantProperty == null) {
            return null;
        }
        return this.dxNodeConstantProperty.d;
    }

    public LongSparseArray<fw5> getEventHandlersExprNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("ad87ac4a", new Object[]{this});
        }
        if (this.dxNodeConstantProperty == null) {
            return null;
        }
        return this.dxNodeConstantProperty.b;
    }

    public ex5 getFlattenNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ex5) ipChange.ipc$dispatch("27a0acf4", new Object[]{this});
        }
        return this.flattenNode;
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return getBottom() - getTop();
    }

    public String getLanguageString(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7890ba46", new Object[]{this, str, str2});
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new x56();
        }
        if (this.dxNodeConstantProperty.h == null) {
            j26.f(this);
        }
        if (this.dxNodeConstantProperty.h == null) {
            return "";
        }
        JSONObject jSONObject = this.dxNodeConstantProperty.h.get(str);
        if (jSONObject == null) {
            str3 = "";
        } else {
            str3 = (String) jSONObject.get(str2);
        }
        if (!TextUtils.isEmpty(str3) || str.equals("zh_CN")) {
            return str3;
        }
        JSONObject jSONObject2 = this.dxNodeConstantProperty.h.get("zh_CN");
        if (jSONObject2 == null) {
            return "";
        }
        return (String) jSONObject2.get(str2);
    }

    public int getLastAutoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d22d8ed0", new Object[]{this})).intValue();
        }
        return this.lastAutoId;
    }

    public int getLayoutDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff9eba39", new Object[]{this})).intValue();
        }
        return getDirection();
    }

    public int getLayoutGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c5d9588", new Object[]{this})).intValue();
        }
        m mVar = this.dxNodeCommon;
        if (mVar == null) {
            return 0;
        }
        return mVar.b;
    }

    public int getLayoutHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d58ffc61", new Object[]{this})).intValue();
        }
        return this.layoutHeight;
    }

    public int getLayoutWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a60b4500", new Object[]{this})).intValue();
        }
        return this.layoutWidth;
    }

    public int getLeftMarginWithDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ace5c408", new Object[]{this})).intValue();
        }
        if (getDirection() == 1) {
            return getMarginRight();
        }
        return getMarginLeft();
    }

    public int getMarginBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f2a18e9", new Object[]{this})).intValue();
        }
        b66 b66Var = this.dxNodeMargin;
        if (b66Var == null) {
            return 0;
        }
        return b66Var.d;
    }

    public int getMarginLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2087f1c5", new Object[]{this})).intValue();
        }
        b66 b66Var = this.dxNodeMargin;
        if (b66Var == null) {
            return 0;
        }
        return b66Var.f16205a;
    }

    public int getMarginRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ddec852", new Object[]{this})).intValue();
        }
        b66 b66Var = this.dxNodeMargin;
        if (b66Var == null) {
            return 0;
        }
        return b66Var.c;
    }

    public int getMarginTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ee5420b", new Object[]{this})).intValue();
        }
        b66 b66Var = this.dxNodeMargin;
        if (b66Var == null) {
            return 0;
        }
        return b66Var.b;
    }

    public final int getMeasuredState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1cd77af", new Object[]{this})).intValue();
        }
        return (getMeasuredWidthAndState() & (-16777216)) | ((getMeasuredHeightAndState() >> 16) & InputDeviceCompat.SOURCE_ANY);
    }

    @Override // tb.svb
    public final int getMeasuredWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b0f3e64", new Object[]{this})).intValue();
        }
        z56 z56Var = this.dxNodeFrame;
        if (z56Var == null) {
            return 0;
        }
        return z56Var.e & 16777215;
    }

    public final int getMeasuredWidthAndState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82d9e47e", new Object[]{this})).intValue();
        }
        z56 z56Var = this.dxNodeFrame;
        if (z56Var == null) {
            return 0;
        }
        return z56Var.e;
    }

    public int getMinHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ce02a5d", new Object[]{this})).intValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return 0;
        }
        return a66Var.f;
    }

    public int getMinWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("253f6784", new Object[]{this})).intValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return 0;
        }
        return a66Var.g;
    }

    public View getNativeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("89cf52db", new Object[]{this});
        }
        if (this.isEnableButter) {
            return this.nativeView;
        }
        if (eb5.w() && getFlattenNode() != null) {
            return getFlattenNode().z();
        }
        WeakReference<View> weakReference = this.weakView;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean getNeedPostPrepareBindEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be493e8d", new Object[]{this})).booleanValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return false;
        }
        return a66Var.o;
    }

    public int getNextLocationOffset(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("248935aa", new Object[]{this, dXWidgetNode})).intValue();
        }
        return 0;
    }

    public int getOldHeightMeasureSpec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("793a279b", new Object[]{this})).intValue();
        }
        z56 z56Var = this.dxNodeFrame;
        if (z56Var == null) {
            return 0;
        }
        return z56Var.h;
    }

    public int getOldWidthMeasureSpec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("848f281e", new Object[]{this})).intValue();
        }
        z56 z56Var = this.dxNodeFrame;
        if (z56Var == null) {
            return 0;
        }
        return z56Var.g;
    }

    public f76 getOriginInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f76) ipChange.ipc$dispatch("1d417ac2", new Object[]{this});
        }
        return this.originInfo;
    }

    public DXWidgetNode getOriginNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f648fae4", new Object[]{this});
        }
        f76 f76Var = this.originInfo;
        if (f76Var == null) {
            return null;
        }
        return f76Var.f19063a;
    }

    public int getPaddingBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86af8f60", new Object[]{this})).intValue();
        }
        c66 c66Var = this.dxNodePadding;
        if (c66Var == null) {
            return 0;
        }
        return c66Var.c;
    }

    public int getPaddingLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
        }
        c66 c66Var = this.dxNodePadding;
        if (c66Var == null) {
            return 0;
        }
        return c66Var.f16888a;
    }

    public int getPaddingLeftWithDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4d4d2f1", new Object[]{this})).intValue();
        }
        if (getDirection() == 1) {
            return getPaddingRight();
        }
        return getPaddingLeft();
    }

    public int getPaddingRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue();
        }
        c66 c66Var = this.dxNodePadding;
        if (c66Var == null) {
            return 0;
        }
        return c66Var.b;
    }

    public int getPaddingRightWithDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83b59c52", new Object[]{this})).intValue();
        }
        if (getDirection() == 1) {
            return getPaddingLeft();
        }
        return getPaddingRight();
    }

    public int getPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        c66 c66Var = this.dxNodePadding;
        if (c66Var == null) {
            return 0;
        }
        return c66Var.d;
    }

    public DXWidgetNode getParentWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("16e277aa", new Object[]{this});
        }
        return this.parentWidget;
    }

    public List<DXWidgetNode> getPartRefreshChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("17f2cef", new Object[]{this});
        }
        if (this instanceof o) {
            return ((o) this).itemWidgetNodes;
        }
        if (this instanceof DXAbsContainerBaseLayout) {
            return ((DXAbsContainerBaseLayout) this).y();
        }
        if (this instanceof p) {
            return ((p) this).C();
        }
        return getChildren();
    }

    public String getRef() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fee331bc", new Object[]{this});
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return null;
        }
        return a66Var.j;
    }

    public DXWidgetNode getReferenceNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("7f5f1a5d", new Object[]{this});
        }
        if (this.isEnableButter) {
            return this;
        }
        if (eb5.w()) {
            WeakReference<DXWidgetNode> weakReference = this.referenceNode;
            if (weakReference == null || weakReference.get() == null) {
                return this;
            }
            return this.referenceNode.get();
        }
        WeakReference<DXWidgetNode> weakReference2 = this.referenceNode;
        if (weakReference2 == null) {
            return null;
        }
        return weakReference2.get();
    }

    public int getRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d449e0", new Object[]{this})).intValue();
        }
        z56 z56Var = this.dxNodeFrame;
        if (z56Var == null) {
            return 0;
        }
        return z56Var.b;
    }

    public float getRotationX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc08445b", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.dxNodeAnimation;
        if (v56Var == null) {
            return 0.0f;
        }
        return v56Var.e;
    }

    public float getRotationY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc165bdc", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.dxNodeAnimation;
        if (v56Var == null) {
            return 0.0f;
        }
        return v56Var.f;
    }

    public float getRotationZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc24735d", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.dxNodeAnimation;
        if (v56Var == null) {
            return 0.0f;
        }
        return v56Var.g;
    }

    public float getScaleX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("606f85bb", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.dxNodeAnimation;
        if (v56Var == null) {
            return 1.0f;
        }
        return v56Var.c;
    }

    public float getScaleY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("607d9d3c", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.dxNodeAnimation;
        if (v56Var == null) {
            return 1.0f;
        }
        return v56Var.d;
    }

    public DXLongSparseArray<Double> getScreenAttrNodeArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("5dc2fe4c", new Object[]{this});
        }
        return this.screenAttrNode;
    }

    public int getSourceAutoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69169c95", new Object[]{this})).intValue();
        }
        return this.sourceAutoId;
    }

    public DXWidgetNode getSourceWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("dbc277db", new Object[]{this});
        }
        WeakReference<DXWidgetNode> weakReference = this.sourceWidgetWR;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean getStatInPropertyDeepCloneFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52704e47", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if ((this.propertyDeepCloneFlag & i) == i) {
            return true;
        }
        return false;
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return this.status;
    }

    public int getSuggestedMinimumHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c99447e2", new Object[]{this})).intValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return 0;
        }
        return a66Var.f;
    }

    public final int getSuggestedMinimumWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f055f", new Object[]{this})).intValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return 0;
        }
        return a66Var.g;
    }

    public JSONObject getTborderJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d60f2819", new Object[]{this});
        }
        if (this.dxNodeConstantProperty == null) {
            return null;
        }
        return this.dxNodeConstantProperty.g;
    }

    public float getTranslateX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1cd1537", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.dxNodeAnimation;
        if (v56Var == null) {
            return 0.0f;
        }
        return v56Var.f29789a;
    }

    public float getTranslateY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1db2cb8", new Object[]{this})).floatValue();
        }
        v56 v56Var = this.dxNodeAnimation;
        if (v56Var == null) {
            return 0.0f;
        }
        return v56Var.b;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.userId;
    }

    public Map<String, yl6> getVariableNameMap() {
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eb64533b", new Object[]{this});
        }
        if (isV4Node() && (queryRootWidgetNode = queryRootWidgetNode()) != null && queryRootWidgetNode.isV4Node()) {
            return queryRootWidgetNode.getDxv4Properties().t();
        }
        return null;
    }

    public ViewGroup getViewContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("bb9ebe48", new Object[]{this});
        }
        return this.viewContainer;
    }

    public fw5 getViewStubExprNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fw5) ipChange.ipc$dispatch("45b20849", new Object[]{this});
        }
        return this.viewStubExprNode;
    }

    public final DXWidgetNode getVirtualChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("8aa58ee1", new Object[]{this, new Integer(i)});
        }
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f140ee82", new Object[]{this})).intValue();
        }
        return this.childrenCount;
    }

    public int getVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b77db82", new Object[]{this})).intValue();
        }
        m mVar = this.dxNodeCommon;
        if (mVar == null) {
            return 0;
        }
        return mVar.f7445a;
    }

    public WeakReference<View> getWRView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("295b23cb", new Object[]{this});
        }
        if (this.isEnableButter) {
            return this.weakView;
        }
        if (!eb5.w() || getFlattenNode() == null) {
            return this.weakView;
        }
        return getFlattenNode().A();
    }

    public double getWeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("975182e3", new Object[]{this})).doubleValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return a66Var.f15562a;
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return getRight() - getLeft();
    }

    public void handleViewStub() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d007642", new Object[]{this});
        } else {
            this.isViewStub = true;
        }
    }

    public boolean hasAccessibilityOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("117f70de", new Object[]{this})).booleanValue();
        }
        u56 u56Var = this.dxNodeAccessibility;
        if (u56Var != null && u56Var.f29150a == 1) {
            return true;
        }
        return false;
    }

    public boolean hasCornerRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e04e30c", new Object[]{this})).booleanValue();
        }
        if (this.dxNodeCorner != null) {
            return true;
        }
        return false;
    }

    public boolean hasExecutingAnimationSpec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84d7dbd2", new Object[]{this})).booleanValue();
        }
        Map<String, nd5> map = this.bindingXExecutingMap;
        if (map != null && map.size() > 0) {
            return true;
        }
        return false;
    }

    public int indexOf(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbf38ed2", new Object[]{this, dXWidgetNode})).intValue();
        }
        if (dXWidgetNode == null) {
            return -1;
        }
        for (int i = 0; i < getChildrenCount(); i++) {
            if (getChildAt(i).getAutoId() == dXWidgetNode.getAutoId()) {
                return i;
            }
        }
        return -1;
    }

    public void initOriginInfo(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87955e4", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            f76 f76Var = new f76();
            f76Var.f19063a = dXWidgetNode;
            this.originInfo = f76Var;
            setSourceWidget(dXWidgetNode);
        }
    }

    public void initScreenAttrNodeArray(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc70b52", new Object[]{this, new Integer(i)});
        } else if (!nb6.i() && this.screenAttrNode == null) {
            if (i <= 0) {
                i = 10;
            }
            this.screenAttrNode = new DXLongSparseArray<>(i);
        }
    }

    public void insertChild(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a834901e", new Object[]{this, dXWidgetNode, new Integer(i)});
        } else {
            insertChild(dXWidgetNode, i, true);
        }
    }

    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.viewContainer;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public final void invalidateLayoutCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3954044", new Object[]{this});
            return;
        }
        this.privateFlags = (this.privateFlags | 16384) & (-41);
        DXWidgetNode dXWidgetNode = this.parentWidget;
        if (dXWidgetNode != null) {
            dXWidgetNode.invalidateLayoutCache();
        }
    }

    public final void invalidateParseCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17debbb1", new Object[]{this});
            return;
        }
        this.privateFlags = 1 | (this.privateFlags & (-3));
        DXWidgetNode dXWidgetNode = this.parentWidget;
        if (dXWidgetNode != null) {
            dXWidgetNode.invalidateParseCache();
        }
    }

    public boolean isChildResponseEvent() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf622f2", new Object[]{this})).booleanValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null || (i = a66Var.h) == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public boolean isChildWidgetNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("967102a3", new Object[]{this})).booleanValue();
        }
        DXWidgetNode queryRootWidgetNode = queryRootWidgetNode();
        if (queryRootWidgetNode == null || !(queryRootWidgetNode.getParentWidget() instanceof bi6)) {
            return false;
        }
        return true;
    }

    public boolean isEnableButter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a061a1b8", new Object[]{this})).booleanValue();
        }
        return this.isEnableButter;
    }

    public boolean isFlatten() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8d5e105", new Object[]{this})).booleanValue();
        }
        return this.isFlatten;
    }

    public boolean isNeedSetBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f969febb", new Object[]{this})).booleanValue();
        }
        return this.needSetBackground;
    }

    public boolean isRootNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("307736d9", new Object[]{this})).booleanValue();
        }
        DXWidgetNode dXWidgetNode = this.parentWidget;
        if (dXWidgetNode == null || (dXWidgetNode instanceof bi6)) {
            return true;
        }
        return false;
    }

    public boolean isShouldUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e029c31", new Object[]{this})).booleanValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return true;
        }
        return a66Var.m;
    }

    public boolean isV4Node() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fe472f5", new Object[]{this})).booleanValue();
        }
        if (this.dxv4Properties == null) {
            return false;
        }
        return true;
    }

    public boolean isViewMatrixChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14b8cf8f", new Object[]{this})).booleanValue();
        }
        if ((this.viewMatrixChanged || getStatInAnimationFlag(2097152)) && !nb6.i()) {
            return true;
        }
        return false;
    }

    public boolean isViewStub() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("308da248", new Object[]{this})).booleanValue();
        }
        return this.isViewStub;
    }

    public final void layout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1242f1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        lxb lxbVar = this.strategy;
        if (lxbVar != null) {
            lxbVar.a(this, i, i2, i3, i4);
        } else {
            defaultLayout(i, i2, i3, i4);
        }
    }

    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            onLayout(setFrame(i, i2, i3, i4), i, i2, i3, i4);
        }
    }

    public final void measure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3bc8605", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        lxb lxbVar = this.strategy;
        if (lxbVar != null) {
            lxbVar.e(this, i, i2);
        } else {
            defaultMeasure(i, i2);
        }
    }

    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            onMeasure(i, i2);
        }
    }

    public boolean needHandleDark(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93a709b0", new Object[]{this, dXRuntimeContext})).booleanValue();
        }
        if (!DXDarkModeCenter.d() || !DXDarkModeCenter.c(dXRuntimeContext) || isDisableDarkMode()) {
            return false;
        }
        return true;
    }

    public void newConstAttributeMap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a943ed9", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new x56();
        }
        this.dxNodeConstantProperty.f31150a = new DXLongSparseArray<>(i);
    }

    public void newDataParsersExprNode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cd80db", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new x56();
        }
        this.dxNodeConstantProperty.c = new DXLongSparseArray<>(i);
    }

    public void newEnumMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f165e2", new Object[]{this});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new x56();
        }
        this.dxNodeConstantProperty.d = new DXLongSparseArray<>();
    }

    public void newEventHandlersExprNode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a77b82", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new x56();
        }
        this.dxNodeConstantProperty.b = new DXLongSparseArray<>(i);
    }

    public void newVariableInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9a8a91", new Object[]{this});
        } else {
            this.dxv3VariableInfo = new ql6();
        }
    }

    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
        }
    }

    public void onBeforeBindChildDataWithButter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355dbe58", new Object[]{this});
        }
    }

    public void onBeginParser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83893ed0", new Object[]{this});
        }
    }

    public void onBeginSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad746430", new Object[]{this, context});
        } else {
            createNativeView(context);
        }
    }

    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        if (getEnabled() == 1) {
            if (j == 18903999933159L) {
                ViewProxy.setOnClickListener(view, new a());
            } else if (j == -6544685697300501093L) {
                ViewProxy.setOnLongClickListener(view, new b());
            }
        }
        if (j == 2683803675109176030L) {
            bindDataEvent();
        }
        if (isV4Node()) {
            return;
        }
        if (!eb5.k() || getNeedPostPrepareBindEvent()) {
            prePareBindEvent(j);
        }
    }

    public void onButterClone(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17d186a", new Object[]{this, dXWidgetNode});
            return;
        }
        this.autoId = dXWidgetNode.autoId;
        this.isEnableButter = dXWidgetNode.isEnableButter;
        this.isViewStub = dXWidgetNode.isViewStub;
        this.viewStubExprNode = dXWidgetNode.viewStubExprNode;
        this.strategy = dXWidgetNode.strategy;
        this.dxNodeConstantProperty = dXWidgetNode.dxNodeConstantProperty;
        this.privateFlags = dXWidgetNode.privateFlags;
        this.lastAutoId = dXWidgetNode.lastAutoId;
        this.dxEventChains = dXWidgetNode.dxEventChains;
        byte[] bArr = dXWidgetNode.dxExprBytes;
        if (bArr != null) {
            this.dxExprBytes = bArr;
        }
        this.dxv3VariableInfo = dXWidgetNode.dxv3VariableInfo;
        this.originInfo = dXWidgetNode.originInfo;
    }

    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        this.userId = dXWidgetNode.userId;
        this.autoId = dXWidgetNode.autoId;
        this.privateFlags = dXWidgetNode.privateFlags;
        this.isFlatten = dXWidgetNode.isFlatten;
        this.needSetBackground = dXWidgetNode.needSetBackground;
        this.animationObj = dXWidgetNode.animationObj;
        this.propertyInitFlag = dXWidgetNode.propertyInitFlag;
        this.layoutWidth = dXWidgetNode.layoutWidth;
        setLayoutHeight(dXWidgetNode.layoutHeight);
        this.dxNodePadding = dXWidgetNode.dxNodePadding;
        this.dxNodeMargin = dXWidgetNode.dxNodeMargin;
        this.dxNodeLowFrequencyProperty = dXWidgetNode.dxNodeLowFrequencyProperty;
        this.dxNodeCorner = dXWidgetNode.dxNodeCorner;
        this.dxNodeBorder = dXWidgetNode.dxNodeBorder;
        this.dxNodeAccessibility = dXWidgetNode.dxNodeAccessibility;
        this.dxNodeCommon = dXWidgetNode.dxNodeCommon;
        this.dxNodeFrame = dXWidgetNode.dxNodeFrame;
        this.dxNodeConstantProperty = dXWidgetNode.dxNodeConstantProperty;
        this.dxNodeAnimation = dXWidgetNode.dxNodeAnimation;
        this.bindingXSpecMap = dXWidgetNode.bindingXSpecMap;
        this.bindingXExecutingMap = dXWidgetNode.bindingXExecutingMap;
        this.lastAutoId = dXWidgetNode.lastAutoId;
        this.sourceWidgetWR = dXWidgetNode.sourceWidgetWR;
        this.sourceAutoId = dXWidgetNode.sourceAutoId;
        this.dxEventChains = dXWidgetNode.dxEventChains;
        byte[] bArr = dXWidgetNode.dxExprBytes;
        if (bArr != null) {
            this.dxExprBytes = bArr;
        }
        sl6 sl6Var = dXWidgetNode.dxv4Properties;
        if (sl6Var != null) {
            this.dxv4Properties = sl6Var.a(z);
        }
        this.animationFlags = dXWidgetNode.animationFlags;
        this.screenAttrNode = dXWidgetNode.screenAttrNode;
        this.isEnableButter = dXWidgetNode.isEnableButter;
        this.strategy = dXWidgetNode.strategy;
        this.dxv3VariableInfo = dXWidgetNode.dxv3VariableInfo;
        this.originInfo = dXWidgetNode.originInfo;
    }

    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new View(context);
    }

    public void onDiff(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ad7d84", new Object[]{this, dXWidgetNode});
        }
    }

    public void onEndParser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
        }
    }

    public void onEndSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6436122", new Object[]{this, context});
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public void onLongTap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6134112f", new Object[]{this});
        } else {
            postEvent(new DXEvent(-6544685697300501093L));
        }
    }

    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
        }
    }

    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        }
    }

    public void onSetDoubleAttribute(long j, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d2)});
        }
    }

    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        }
    }

    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        }
    }

    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        }
    }

    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        }
    }

    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        }
    }

    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        }
    }

    public void onSetUserDefinedListAttribute(long j, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e671484b", new Object[]{this, new Long(j), list});
        }
    }

    public final void onTapEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c9ed3d", new Object[]{this});
        } else {
            postEvent(new DXEvent(18903999933159L));
        }
    }

    public void parseAp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b882d5c9", new Object[]{this});
            return;
        }
        if (getScreenAttrNodeArray() != null) {
            for (int i = 0; i < getScreenAttrNodeArray().size(); i++) {
                long keyAt = getScreenAttrNodeArray().keyAt(i);
                setIntAttribute(keyAt, pb6.p(getEngine(), getDXRuntimeContext().h(), String.valueOf(getScreenAttrNodeArray().get(keyAt)), 0));
            }
            setStatFlag(4);
        }
        unsetStatFlag(2097152);
    }

    public final boolean postEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba8db67", new Object[]{this, dXEvent})).booleanValue();
        }
        if (!isSelfResponseEvent()) {
            return false;
        }
        if (!this.isFlatten) {
            return onEvent(dXEvent);
        }
        return getReferenceNode().onEvent(dXEvent);
    }

    public void processUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410f1b9c", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.userId)) {
            DXWidgetNode queryRootWidgetNode = queryRootWidgetNode();
            if ((queryRootWidgetNode instanceof j) || (queryRootWidgetNode instanceof r)) {
                queryRootWidgetNode.getDxUserIdMap().put(this.userId, new WeakReference<>(this));
            }
        }
    }

    public void putBindingXExecutingSpec(nd5 nd5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af512604", new Object[]{this, nd5Var});
        } else if (nd5Var != null && !TextUtils.isEmpty(nd5Var.f24656a)) {
            if (this.bindingXExecutingMap == null) {
                this.bindingXExecutingMap = new HashMap();
            }
            this.bindingXExecutingMap.put(nd5Var.f24656a, nd5Var);
        }
    }

    public DXWidgetNode queryRootWidgetNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("fc3bfb76", new Object[]{this});
        }
        if (this.dxRootWidgetCache != null && zg5.w5(getDXRuntimeContext())) {
            return this.dxRootWidgetCache;
        }
        DXWidgetNode dXWidgetNode = this;
        while (dXWidgetNode.getParentWidget() != null) {
            DXWidgetNode parentWidget = dXWidgetNode.getParentWidget();
            if ((parentWidget instanceof bi6) || (parentWidget instanceof s4z)) {
                return dXWidgetNode;
            }
            dXWidgetNode = parentWidget;
        }
        this.dxRootWidgetCache = dXWidgetNode;
        return dXWidgetNode;
    }

    public DXWidgetNode queryWTByAutoId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("974aed15", new Object[]{this, new Integer(i)});
        }
        if (this.autoId == i) {
            return this;
        }
        if (getChildrenCount() <= 0) {
            return null;
        }
        for (DXWidgetNode dXWidgetNode : getChildren()) {
            DXWidgetNode queryWTByAutoId = dXWidgetNode.queryWTByAutoId(i);
            if (queryWTByAutoId != null) {
                return queryWTByAutoId;
            }
        }
        return null;
    }

    public DXWidgetNode queryWTByUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("45e63272", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.isEnableButter) {
            if (getVisibility() != 0) {
                return null;
            }
            if (str.equals(this.userId)) {
                return this;
            }
            if (getChildrenCount() > 0) {
                for (DXWidgetNode dXWidgetNode : getChildren()) {
                    DXWidgetNode queryWTByUserId = dXWidgetNode.queryWTByUserId(str);
                    if (queryWTByUserId != null) {
                        return queryWTByUserId;
                    }
                }
            }
            return null;
        } else if (str.equals(this.userId)) {
            return this;
        } else {
            if (getChildrenCount() > 0) {
                if (!zg5.w5(getDXRuntimeContext()) || !(this instanceof bi6)) {
                    for (DXWidgetNode dXWidgetNode2 : getChildren()) {
                        DXWidgetNode queryWTByUserId2 = dXWidgetNode2.queryWTByUserId(str);
                        if (queryWTByUserId2 != null) {
                            return queryWTByUserId2;
                        }
                    }
                } else {
                    for (DXWidgetNode dXWidgetNode3 : getChildren()) {
                        DXWidgetNode queryWidgetNodeByUserIdFromMap = dXWidgetNode3.queryWidgetNodeByUserIdFromMap(str, false);
                        if (queryWidgetNodeByUserIdFromMap != null) {
                            return queryWidgetNodeByUserIdFromMap;
                        }
                    }
                }
            }
            return null;
        }
    }

    public DXWidgetNode queryWidgetNodeByAutoId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("8d293a0c", new Object[]{this, new Integer(i)});
        }
        return queryRootWidgetNode().queryWTByAutoId(i);
    }

    public void removeBindingXSpec(nd5 nd5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c57202bd", new Object[]{this, nd5Var});
        } else if (this.bindingXExecutingMap != null && nd5Var != null && !TextUtils.isEmpty(nd5Var.f24656a)) {
            this.bindingXExecutingMap.remove(nd5Var.f24656a);
        }
    }

    public void removeChildWithAutoId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e4b3bb4", new Object[]{this, new Integer(i)});
        } else if (this.children != null && this.childrenCount != 0) {
            for (int i2 = 0; i2 < this.childrenCount; i2++) {
                if (this.children.get(i2).autoId == i) {
                    this.children.remove(i2);
                    this.childrenCount--;
                    return;
                }
            }
        }
    }

    public void renderAnimationSupportProperty(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3817d5d5", new Object[]{this, view});
            return;
        }
        if (view.getAlpha() != getAlpha() && !getStatInAnimationFlag(1)) {
            view.setAlpha(getAlpha());
        }
        if (isV4Node()) {
            if (view.getScaleX() != this.dxv4Properties.o() && !getStatInAnimationFlag(8)) {
                view.setScaleX(this.dxv4Properties.o());
            }
            if (view.getScaleY() != this.dxv4Properties.p() && !getStatInAnimationFlag(16)) {
                view.setScaleY(this.dxv4Properties.p());
            }
            if (view.getTranslationX() != this.dxv4Properties.r() && !getStatInAnimationFlag(32)) {
                view.setTranslationX(this.dxv4Properties.r());
            }
            if (view.getTranslationY() != this.dxv4Properties.s() && !getStatInAnimationFlag(64)) {
                view.setTranslationY(this.dxv4Properties.s());
            }
            if (view.getRotationX() != this.dxv4Properties.l() && !getStatInAnimationFlag(256)) {
                view.setRotationX(this.dxv4Properties.l());
            }
            if (view.getRotationY() != this.dxv4Properties.m() && !getStatInAnimationFlag(512)) {
                view.setRotationY(this.dxv4Properties.m());
            }
            if (view.getRotation() != this.dxv4Properties.n() && !getStatInAnimationFlag(1024)) {
                view.setRotation(this.dxv4Properties.n());
            }
        }
    }

    public void renderTransformedProperty(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df392f21", new Object[]{this, view});
        } else if (!isV4Node()) {
            if (getTranslateX() != view.getTranslationX()) {
                view.setTranslationX(getTranslateX());
            }
            if (getTranslateY() != view.getTranslationY()) {
                view.setTranslationY(getTranslateY());
            }
            if (getRotationX() != view.getRotationX()) {
                view.setRotationX(getRotationX());
            }
            if (getRotationY() != view.getRotationY()) {
                view.setRotationY(getRotationY());
            }
            if (getRotationZ() != view.getRotation()) {
                view.setRotation(getRotationZ());
            }
            if (getScaleX() != view.getScaleX()) {
                view.setScaleX(getScaleX());
            }
            if (getScaleY() != view.getScaleY()) {
                view.setScaleY(getScaleY());
            }
        }
    }

    public final void renderView(Context context) {
        DXWidgetNode dXWidgetNode;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8c49a6", new Object[]{this, context});
            return;
        }
        try {
            View realView = getRealView();
            if (realView != null) {
                if ((this.privateFlags & 256) != 0) {
                    DXTraceUtil.b(" onRenderView Before ");
                    setRealViewVisibility(realView, getVisibility());
                    renderAnimationSupportProperty(realView);
                    if (getEnabled() != 1) {
                        z = false;
                    }
                    if (realView.isEnabled() != z) {
                        realView.setEnabled(z);
                    }
                    renderTransformedProperty(realView);
                    bindAccessibilityToView(realView, getAccessibility());
                    if (isFlatten()) {
                        dXWidgetNode = getReferenceNode();
                    } else {
                        dXWidgetNode = this;
                    }
                    dXWidgetNode.setBackground(realView);
                    DXTraceUtil.c();
                    dXWidgetNode.onRenderView(context, realView);
                    DXTraceUtil.b(" onRenderView End ");
                    if (realView instanceof ViewGroup) {
                        if (!eb5.k()) {
                            realView.setLayoutDirection(getDirection());
                        } else if (realView.getLayoutDirection() != getDirection()) {
                            realView.setLayoutDirection(getDirection());
                        }
                    }
                    dXWidgetNode.setForceDark(realView);
                    DXTraceUtil.c();
                }
                this.privateFlags = (this.privateFlags & (-257)) | 512;
            }
        } catch (Exception e) {
            xv5.b(e);
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext != null && dXRuntimeContext.m() != null) {
                f.a aVar = new f.a("Render", "Pipeline_Detail_Render_Detail", 90002);
                aVar.e = xv5.a(e);
                dXRuntimeContext.m().c.add(aVar);
            }
        }
    }

    public final void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else {
            requestLayout(false);
        }
    }

    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 20;
    }

    public void sendBroadcastEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
        } else if (this.isEnableButter) {
            if (getVisibility() == 0) {
                if (getNativeView() != null && isSelfResponseEvent()) {
                    postEvent(dXEvent);
                }
                if (getChildrenCount() > 0) {
                    for (DXWidgetNode dXWidgetNode : getChildren()) {
                        if (isChildResponseEvent()) {
                            dXWidgetNode.sendBroadcastEvent(dXEvent);
                        }
                    }
                }
            }
        } else if (dXEvent != null) {
            try {
                if (eb5.w()) {
                    if (getFlattenNode() != null && isSelfResponseEvent()) {
                        postEvent(dXEvent);
                    }
                } else if (getReferenceNode() != null && isSelfResponseEvent()) {
                    postEvent(dXEvent);
                }
                if (getChildrenCount() > 0) {
                    for (DXWidgetNode dXWidgetNode2 : getChildren()) {
                        if (isChildResponseEvent()) {
                            dXWidgetNode2.sendBroadcastEvent(dXEvent);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setAccessibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2242d0", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeAccessibilityBeforeCheck();
        this.dxNodeAccessibility.f29150a = i;
    }

    public void setAccessibilityRole(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9ca7b3", new Object[]{this, str});
            return;
        }
        setNodeAccessibilityBeforeCheck();
        this.dxNodeAccessibility.c = str;
    }

    public void setAccessibilityText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f66f92a", new Object[]{this, str});
            return;
        }
        setNodeAccessibilityBeforeCheck();
        this.dxNodeAccessibility.b = str;
    }

    @Override // tb.svb
    public void setAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144f37d", new Object[]{this, new Float(f)});
            return;
        }
        setNodeCommonBeforeCheck();
        this.dxNodeCommon.d = f;
    }

    public void setAnimation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8294a53", new Object[]{this, str});
        } else if (!eb5.r()) {
            if (this.dxNodeConstantProperty == null) {
                this.dxNodeConstantProperty = new x56();
            }
            this.dxNodeConstantProperty.f = str;
        } else if (!TextUtils.isEmpty(str)) {
            if (this.dxNodeConstantProperty == null) {
                this.dxNodeConstantProperty = new x56();
            }
            this.dxNodeConstantProperty.f = str;
            try {
                this.animationObj = JSON.parseObject(getAnimation());
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public void setAutoId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cffecb0", new Object[]{this, new Integer(i)});
        } else {
            this.autoId = i;
        }
    }

    @Override // tb.svb
    public void setBackGroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c8b549", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCommonBeforeCheck();
        m mVar = this.dxNodeCommon;
        if (i != mVar.e) {
            mVar.e = i;
            this.needSetBackground = true;
        }
    }

    public void setBackgroundGradient(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527f506", new Object[]{this, dVar});
            return;
        }
        setNodeCommonBeforeCheck();
        this.needSetBackground = true;
        this.dxNodeCommon.f = dVar;
    }

    public void setBindingXExecutingMap(Map<String, nd5> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1048b1f", new Object[]{this, map});
        } else {
            this.bindingXExecutingMap = map;
        }
    }

    public void setBindingXSpecMap(Map<String, nd5> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4fd7b2", new Object[]{this, map});
        } else {
            this.bindingXSpecMap = map;
        }
    }

    public void setBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738a7ba7", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeBorderBeforeCheck();
        w56 w56Var = this.dxNodeBorder;
        if (i != w56Var.b) {
            w56Var.b = i;
            this.needSetBackground = true;
        }
    }

    public void setBorderType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29f6cd4", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeBorderBeforeCheck();
        w56 w56Var = this.dxNodeBorder;
        if (w56Var.c != i) {
            w56Var.c = i;
            this.needSetBackground = true;
        }
    }

    public void setBorderWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8120324", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeBorderBeforeCheck();
        w56 w56Var = this.dxNodeBorder;
        if (w56Var.f30469a != i) {
            w56Var.f30469a = i;
            this.needSetBackground = true;
        }
    }

    public void setBottom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491a424f", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeFrameBeforeCheck();
        this.dxNodeFrame.d = i;
    }

    public void setChildGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb60c8", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCommonBeforeCheck();
        this.dxNodeCommon.c = i;
    }

    public void setClipChildren(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad724adc", new Object[]{this, new Boolean(z)});
        }
    }

    public void setCodeMap(DXLongSparseArray<fw5> dXLongSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536bc61d", new Object[]{this, dXLongSparseArray});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new x56();
        }
        this.dxNodeConstantProperty.e = dXLongSparseArray;
    }

    public void setCornerRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c79033", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCornerBeforeCheck();
        y56 y56Var = this.dxNodeCorner;
        if (y56Var.f31861a != i) {
            y56Var.f31861a = i;
            this.needSetBackground = true;
        }
    }

    public void setCornerRadiusLeftBottom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a09fd81", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCornerBeforeCheck();
        this.dxNodeCorner.d = i;
    }

    public void setCornerRadiusLeftTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faec4bb7", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCornerBeforeCheck();
        this.dxNodeCorner.b = i;
    }

    public void setCornerRadiusRightBottom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d15b3e", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCornerBeforeCheck();
        this.dxNodeCorner.e = i;
    }

    public void setCornerRadiusRightTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b70f1a", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCornerBeforeCheck();
        this.dxNodeCorner.c = i;
    }

    public void setDXRuntimeContext(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff05745", new Object[]{this, dXRuntimeContext});
        } else {
            this.dXRuntimeContext = dXRuntimeContext;
        }
    }

    public void setDarkModeColorMap(HashMap<String, Integer> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a04278", new Object[]{this, hashMap});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.k = hashMap;
    }

    public void setDashGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987cf57a", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeBorderBeforeCheck();
        this.dxNodeBorder.e = i;
    }

    public void setDashWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ef2f8a", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeBorderBeforeCheck();
        this.dxNodeBorder.d = i;
    }

    public void setDataParsersExprNode(DXLongSparseArray<fw5> dXLongSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33572ab", new Object[]{this, dXLongSparseArray});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new x56();
        }
        this.dxNodeConstantProperty.c = dXLongSparseArray;
    }

    public void setDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e12d843f", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.b = i;
    }

    public void setDisableDarkMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ca3a0e", new Object[]{this, new Boolean(z)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.l = z;
    }

    public void setDoubleAttribute(long j, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02c0b0a", new Object[]{this, new Long(j), new Double(d2)});
        } else if (10439708918555150L == j) {
            setWeight(d2);
        } else if (16887479372907L == j) {
            setAlpha((float) d2);
        } else {
            if (isV4Node()) {
                if (j == DXVIEW_SCALEX) {
                    this.dxv4Properties.G((float) d2);
                } else if (j == DXVIEW_SCALEY) {
                    this.dxv4Properties.H((float) d2);
                } else if (j == DXVIEW_ROTATIONX) {
                    this.dxv4Properties.D((float) d2);
                } else if (j == DXVIEW_ROTATIONY) {
                    this.dxv4Properties.E((float) d2);
                } else if (j == DXVIEW_ROTATIONZ) {
                    this.dxv4Properties.F((float) d2);
                }
            }
            onSetDoubleAttribute(j, d2);
        }
    }

    public void setDxEventChains(tv5 tv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d766de9", new Object[]{this, tv5Var});
        } else {
            this.dxEventChains = tv5Var;
        }
    }

    public void setDxExprBytes(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64dd0f0e", new Object[]{this, bArr});
        } else {
            this.dxExprBytes = bArr;
        }
    }

    public void setDxOriginTreeProperty(g76 g76Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9ae486", new Object[]{this, g76Var});
        } else {
            this.dxOriginTreeProperty = g76Var;
        }
    }

    public void setDxv4Properties(sl6 sl6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbf70966", new Object[]{this, sl6Var});
        } else {
            this.dxv4Properties = sl6Var;
        }
    }

    public void setEnableButter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76eef68", new Object[]{this, new Boolean(z)});
        } else {
            this.isEnableButter = z;
        }
    }

    public void setEnabled(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1623d", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.d = i;
        if (this.isEnableButter) {
            if (getEnabled() != 1) {
                z = false;
            }
            View nativeView = getNativeView();
            if (nativeView != null && nativeView.isEnabled() != z) {
                nativeView.setEnabled(z);
            }
        }
    }

    public void setEnumMap(DXLongSparseArray<Map<String, Integer>> dXLongSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870b731", new Object[]{this, dXLongSparseArray});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new x56();
        }
        this.dxNodeConstantProperty.d = dXLongSparseArray;
    }

    public void setEventHandlersExprNode(DXLongSparseArray<fw5> dXLongSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b34f52", new Object[]{this, dXLongSparseArray});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new x56();
        }
        this.dxNodeConstantProperty.b = dXLongSparseArray;
    }

    public void setEventResponseMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e053fe0", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.h = i;
    }

    public void setFlatten(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6838d2b", new Object[]{this, new Boolean(z)});
        } else {
            this.isFlatten = z;
        }
    }

    public void setFlattenNode(ex5 ex5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c439a20", new Object[]{this, ex5Var});
        } else {
            this.flattenNode = ex5Var;
        }
    }

    public void setForceDark(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257e674c", new Object[]{this, view});
        } else if (DXDarkModeCenter.d() && DXDarkModeCenter.c(getDXRuntimeContext())) {
            if (isDisableDarkMode()) {
                DXDarkModeCenter.a(getDXRuntimeContext(), view);
            } else if (extraHandleDark() || this.hasHandleDark) {
                DXDarkModeCenter.a(getDXRuntimeContext(), view);
            }
        }
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("219b20f6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        if (getLeft() == i && getRight() == i3 && getTop() == i2 && getBottom() == i4) {
            return false;
        }
        setLeft(i);
        setTop(i2);
        setRight(i3);
        setBottom(i4);
        return true;
    }

    public final void setIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e07e135", new Object[]{this, new Long(j), new Integer(i)});
        } else if (20052926345925L == j) {
            this.layoutWidth = i;
            this.butterFlags |= 1;
        } else if (9346582897824575L == j) {
            setLayoutHeight(i);
            this.butterFlags |= 1;
        } else if (-916628110244908525L == j) {
            setMarginLeft(i);
            this.butterFlags |= 1;
        } else if (-4674119579031497081L == j) {
            setMarginRight(i);
            this.butterFlags |= 1;
        } else if (-2641581645694792774L == j) {
            setMarginTop(i);
            this.butterFlags |= 1;
        } else if (6506044224063169535L == j) {
            setMarginBottom(i);
            this.butterFlags |= 1;
        } else if (-378913133726214547L == j) {
            setPaddingLeft(i);
            this.butterFlags |= 1;
        } else if (3229586316762092001L == j) {
            setPaddingRight(i);
            this.butterFlags |= 1;
        } else if (-2632461973017864940L == j) {
            setPaddingTop(i);
            this.butterFlags |= 1;
        } else if (-4745829179314597287L == j) {
            setPaddingBottom(i);
            this.butterFlags |= 1;
        } else if (4879707785646574221L == j && i >= 0 && i <= 8) {
            setLayoutGravity(i);
            this.propertyInitFlag |= 1;
            this.butterFlags |= 1;
        } else if (-3218010051991756042L == j && i >= 0 && i <= 8) {
            setChildGravity(i);
            this.butterFlags |= 1;
        } else if (7504432960089273802L == j && (i == 0 || i == 1)) {
            setDirection(i);
        } else if (5802348655878590802L == j && (i == 0 || i == 1 || i == 2)) {
            if (this.isEnableButter) {
                setRealVisibility(i);
            } else {
                setVisibility(i);
            }
        } else if (y06.DXIMAGESPAN_CORNERRADIUS == j) {
            setCornerRadius(i);
            this.needSetBackground = true;
        } else if (-7043958449911898942L == j) {
            setCornerRadiusLeftTop(i);
            this.needSetBackground = true;
        } else if (8679583519247168310L == j) {
            setCornerRadiusRightTop(i);
            this.needSetBackground = true;
        } else if (-3738348576243028217L == j) {
            setCornerRadiusLeftBottom(i);
            this.needSetBackground = true;
        } else if (1691221861925381243L == j) {
            setCornerRadiusRightBottom(i);
            this.needSetBackground = true;
        } else if (-8019934667170236535L == j) {
            setBorderWidth(i);
            this.needSetBackground = true;
        } else if (-8020113231441560440L == j) {
            setBorderColor(i);
            this.needSetBackground = true;
        } else if (1844153004063100714L == j) {
            setBorderType(i);
            this.needSetBackground = true;
        } else if (3657130712798351885L == j) {
            setDashWidth(i);
        } else if (5384687760714897699L == j) {
            setDashGap(i);
        } else if (-6716070147120443019L == j) {
            setAccessibility(i);
        } else if (-2819959685970048978L == j) {
            setBackGroundColor(i);
            this.needSetBackground = true;
        } else if (4804789929613330386L == j) {
            setEnabled(i);
        } else if (2051502660558186662L == j) {
            setMinHeight(i);
        } else if (j == 3998176004939777025L) {
            if (i == 0) {
                z = false;
            }
            setSoftwareRender(z);
        } else if (4694181495334893900L == j) {
            setMinWidth(i);
        } else if (j == -8044124925891189930L) {
            if (i != 1) {
                z = false;
            }
            setClipChildren(z);
        } else if (j == -6579663421190292502L) {
            if (i == 0) {
                z = false;
            }
            setDisableDarkMode(z);
        } else if (j == -5241271604340946425L) {
            setEventResponseMode(i);
        } else if (j == 9037937761546515694L) {
            if (i != 1) {
                z = false;
            }
            setOpenNewFastReturnLogic(z);
        } else if (j == -6311293910063768578L) {
            if (i != 1) {
                z = false;
            }
            setShouldUpdate(z);
        } else if (j == DXVIEW_ISRELAYOUTBOUNDARY) {
            if (i != 1) {
                z = false;
            }
            setRelayoutBoundary(z);
        } else if (j == DXVIEW_NEEDPOSTPREPAREBINDEVENT) {
            if (i != 1) {
                z = false;
            }
            setNeedPostPrepareBindEvent(z);
        } else {
            if (isV4Node()) {
                if (j == DXVIEW_TRANSLATIONX) {
                    this.dxv4Properties.J(i);
                } else if (j == DXVIEW_TRANSLATIONY) {
                    this.dxv4Properties.K(i);
                }
            }
            onSetIntAttribute(j, i);
        }
    }

    public void setLanguageConfig(Map<String, JSONObject> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe7d0e2", new Object[]{this, map});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new x56();
        }
        this.dxNodeConstantProperty.h = map;
    }

    public void setLastAutoId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa5b593a", new Object[]{this, new Integer(i)});
        } else {
            this.lastAutoId = i;
        }
    }

    public void setLayoutGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c681121a", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCommonBeforeCheck();
        this.dxNodeCommon.b = i;
        this.propertyInitFlag |= 1;
    }

    public void setLayoutHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80610c9", new Object[]{this, new Integer(i)});
        } else {
            this.layoutHeight = i;
        }
    }

    public void setLayoutWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5a64a2", new Object[]{this, new Integer(i)});
        } else {
            this.layoutWidth = i;
        }
    }

    public void setLeft(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bffd73", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeFrameBeforeCheck();
        this.dxNodeFrame.f32549a = i;
    }

    public void setListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f87a369", new Object[]{this, new Long(j), jSONArray});
        } else {
            onSetListAttribute(j, jSONArray);
        }
    }

    public void setLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d8e305", new Object[]{this, new Long(j), new Long(j2)});
        } else {
            onSetLongAttribute(j, j2);
        }
    }

    public void setMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1fa015", new Object[]{this, new Long(j), jSONObject});
        } else {
            onSetMapAttribute(j, jSONObject);
        }
    }

    public void setMarginBottom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41af8541", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeMarginBeforeCheck();
        this.dxNodeMargin.d = i;
    }

    public void setMarginLeft(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274d54e5", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeMarginBeforeCheck();
        this.dxNodeMargin.f16205a = i;
    }

    public void setMarginRight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f74b90", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeMarginBeforeCheck();
        this.dxNodeMargin.c = i;
    }

    public void setMarginTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b9dbf7", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeMarginBeforeCheck();
        this.dxNodeMargin.b = i;
    }

    @Override // tb.svb
    public final void setMeasuredDimension(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926701a5", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setNodeFrameBeforeCheck();
        z56 z56Var = this.dxNodeFrame;
        z56Var.e = i;
        z56Var.f = i2;
    }

    public void setMinHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271bfde5", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.f = i;
    }

    public void setMinWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15846406", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.g = i;
    }

    public void setNeedLayout(DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f1b8", new Object[]{this, dXWidgetRefreshOption});
        } else if (this.isEnableButter) {
            getDXRuntimeContext().k().w(this, this.viewContainer);
        } else {
            if (dXWidgetRefreshOption == null) {
                dXWidgetRefreshOption = new DXWidgetRefreshOption();
            }
            setStatFlag(16384);
            setStatFlag(4);
            unsetStatFlag(8);
            unsetStatFlag(32);
            if (dXWidgetRefreshOption.j()) {
                bindChildrenMeasureFlag(dXWidgetRefreshOption);
            }
            DXWidgetNode dXWidgetNode = this.parentWidget;
            if (dXWidgetNode != null) {
                dXWidgetNode.bindParentMeasureFlag(this, false, dXWidgetRefreshOption);
            } else {
                sendPartMeasureLayoutEvent(dXWidgetRefreshOption);
            }
        }
    }

    public final void setNeedParse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa11082", new Object[]{this});
        } else if (this.isEnableButter) {
            getDXRuntimeContext().k().w(this, this.viewContainer);
        } else {
            this.privateFlags = 1 | (this.privateFlags & (-3));
            DXWidgetNode dXWidgetNode = this.parentWidget;
            if (dXWidgetNode instanceof DXRecyclerLayout) {
                ((DXRecyclerLayout) dXWidgetNode).n1(this);
            }
            DXWidgetNode dXWidgetNode2 = this.parentWidget;
            if (dXWidgetNode2 != null) {
                dXWidgetNode2.setNeedParse();
                return;
            }
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext != null) {
                m o = dXRuntimeContext.o();
                ph5 l = dXRuntimeContext.l();
                if (o != null && l != null) {
                    k n = o.n();
                    if (n != null) {
                        n.o(dXRuntimeContext.d());
                    }
                    y76 y76Var = new y76();
                    y76Var.d = 2;
                    y76Var.f25390a = this;
                    l.e(y76Var);
                }
            }
        }
    }

    public void setNeedPostPrepareBindEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2243df", new Object[]{this, new Boolean(z)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.o = z;
    }

    public final void setNeedRender(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f1e413", new Object[]{this, context});
            return;
        }
        this.privateFlags |= 256;
        renderView(context);
    }

    public void setNeedSetBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb48035", new Object[]{this, new Boolean(z)});
        } else {
            this.needSetBackground = z;
        }
    }

    public void setNodeAccessibilityBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f6d3946", new Object[]{this});
        } else if (this.dxNodeAccessibility == null) {
            this.dxNodeAccessibility = new u56();
            setStatInPropertyDeepCloneFlag(32);
        } else if (!getStatInPropertyDeepCloneFlag(32)) {
            this.dxNodeAccessibility = this.dxNodeAccessibility.a();
            setStatInPropertyDeepCloneFlag(32);
        }
    }

    public void setNodeAnimationBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("414ede50", new Object[]{this});
        } else if (this.dxNodeAnimation == null) {
            this.dxNodeAnimation = new v56();
            setStatInPropertyDeepCloneFlag(256);
        } else if (!getStatInPropertyDeepCloneFlag(256)) {
            this.dxNodeAnimation = this.dxNodeAnimation.a();
            setStatInPropertyDeepCloneFlag(256);
        }
    }

    public void setNodeBorderBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719337e0", new Object[]{this});
        } else if (this.dxNodeBorder == null) {
            this.dxNodeBorder = new w56();
            setStatInPropertyDeepCloneFlag(16);
        } else if (!getStatInPropertyDeepCloneFlag(16)) {
            this.dxNodeBorder = this.dxNodeBorder.a(true);
            setStatInPropertyDeepCloneFlag(16);
        }
    }

    public void setNodeCommonBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3546c41", new Object[]{this});
        } else if (this.dxNodeCommon == null) {
            this.dxNodeCommon = new m();
            setStatInPropertyDeepCloneFlag(64);
        } else if (!getStatInPropertyDeepCloneFlag(64)) {
            this.dxNodeCommon = this.dxNodeCommon.a();
            setStatInPropertyDeepCloneFlag(64);
        }
    }

    public void setNodeCornerBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bdf0297", new Object[]{this});
        } else if (this.dxNodeCorner == null) {
            this.dxNodeCorner = new y56();
            setStatInPropertyDeepCloneFlag(8);
        } else if (!getStatInPropertyDeepCloneFlag(8)) {
            this.dxNodeCorner = this.dxNodeCorner.a(true);
            setStatInPropertyDeepCloneFlag(8);
        }
    }

    public void setNodeFrameBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a231347", new Object[]{this});
        } else if (this.dxNodeFrame == null) {
            this.dxNodeFrame = new z56();
            setStatInPropertyDeepCloneFlag(128);
        } else if (!getStatInPropertyDeepCloneFlag(128)) {
            this.dxNodeFrame = this.dxNodeFrame.a();
            setStatInPropertyDeepCloneFlag(128);
        }
    }

    public void setNodeLowFrequencyPropertyBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b52d88f", new Object[]{this});
        } else if (this.dxNodeLowFrequencyProperty == null) {
            this.dxNodeLowFrequencyProperty = new a66();
            setStatInPropertyDeepCloneFlag(4);
        } else if (!getStatInPropertyDeepCloneFlag(4)) {
            this.dxNodeLowFrequencyProperty = this.dxNodeLowFrequencyProperty.a(true);
            setStatInPropertyDeepCloneFlag(4);
        }
    }

    public void setNodeMarginBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b61b21e", new Object[]{this});
        } else if (this.dxNodeMargin == null) {
            this.dxNodeMargin = new b66();
            setStatInPropertyDeepCloneFlag(2);
        } else if (!getStatInPropertyDeepCloneFlag(2)) {
            this.dxNodeMargin = this.dxNodeMargin.a(true);
            setStatInPropertyDeepCloneFlag(2);
        }
    }

    public final void setObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aee60f2", new Object[]{this, new Long(j), obj});
        } else if (obj != null) {
            if (j == 3436950829494956384L) {
                setBackgroundGradient((d) obj);
                this.needSetBackground = true;
            } else if (j == -396946557348092076L) {
                setDarkModeColorMap((HashMap) obj);
            } else {
                onSetObjAttribute(j, obj);
            }
        }
    }

    public void setOldHeightMeasureSpec(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d798cf", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeFrameBeforeCheck();
        this.dxNodeFrame.h = i;
    }

    public void setOldWidthMeasureSpec(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd231944", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeFrameBeforeCheck();
        this.dxNodeFrame.g = i;
    }

    public void setOpenNewFastReturnLogic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be0286af", new Object[]{this, new Boolean(z)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.c = z;
    }

    public void setPaddingBottom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66e5342", new Object[]{this, new Integer(i)});
            return;
        }
        setPaddingBeforeCheck();
        this.dxNodePadding.c = i;
    }

    public void setPaddingLeft(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b9af26", new Object[]{this, new Integer(i)});
            return;
        }
        setPaddingBeforeCheck();
        this.dxNodePadding.f16888a = i;
    }

    public void setPaddingRight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7116396f", new Object[]{this, new Integer(i)});
            return;
        }
        setPaddingBeforeCheck();
        this.dxNodePadding.b = i;
    }

    public void setPaddingTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a528b596", new Object[]{this, new Integer(i)});
            return;
        }
        setPaddingBeforeCheck();
        this.dxNodePadding.d = i;
    }

    public void setParentWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54efce78", new Object[]{this, dXWidgetNode});
        } else {
            this.parentWidget = dXWidgetNode;
        }
    }

    public void setRealViewLayoutParam(View view) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70250cd", new Object[]{this, view});
        } else if (view != null) {
            DXWidgetNode dXWidgetNode = this.parentWidget;
            if (dXWidgetNode == null || !(dXWidgetNode instanceof j)) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(getMeasuredWidth(), getMeasuredHeight());
                } else {
                    layoutParams2.width = getMeasuredWidth();
                    layoutParams2.height = getMeasuredHeight();
                }
                view.setLayoutParams(layoutParams2);
                return;
            }
            q26 q26Var = attributeThreadLocal.get();
            this.realLayoutAttribute = q26Var;
            if (q26Var == null) {
                q26 q26Var2 = new q26();
                this.realLayoutAttribute = q26Var2;
                attributeThreadLocal.set(q26Var2);
            }
            this.realLayoutAttribute.f26456a = getMeasuredWidth();
            this.realLayoutAttribute.b = getMeasuredHeight();
            j jVar = (j) this.parentWidget;
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams = jVar.generateLayoutParams(this.realLayoutAttribute);
            } else {
                layoutParams = jVar.generateLayoutParams(this.realLayoutAttribute, layoutParams3);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public void setRealViewLayoutParamWithButter(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9782492a", new Object[]{this, viewGroup});
            return;
        }
        View view = this.nativeView;
        if (view != null) {
            if (viewGroup instanceof jyc) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                jyc jycVar = (jyc) viewGroup;
                if (layoutParams == null) {
                    this.nativeView.setLayoutParams(jycVar.generateLayoutParams(this));
                    return;
                }
                jycVar.updateLayoutParams(layoutParams, this);
                if (!eb5.n()) {
                    this.nativeView.setLayoutParams(layoutParams);
                } else if ((this.butterFlags & 1) != 0) {
                    this.nativeView.setLayoutParams(layoutParams);
                    this.butterFlags &= -2;
                }
            } else {
                Object tag = viewGroup.getTag(TAG_WIDGET_NODE);
                if (tag instanceof r) {
                    ViewGroup.LayoutParams layoutParams2 = this.nativeView.getLayoutParams();
                    r rVar = (r) tag;
                    if (layoutParams2 == null) {
                        this.nativeView.setLayoutParams(rVar.u(this));
                    } else if (rVar.w(layoutParams2, this)) {
                        this.nativeView.setLayoutParams(layoutParams2);
                    }
                } else {
                    throw new RuntimeException("ViewGroup is incompatible");
                }
            }
        }
    }

    public void setRealVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77e024a", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCommonBeforeCheck();
        this.dxNodeCommon.f7445a = i;
        setRealViewVisibility(this.nativeView, i);
    }

    public void setRef(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0fe8a2", new Object[]{this, str});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.j = str;
    }

    public void setReferenceNode(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b267bd", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null) {
            this.referenceNode = null;
        } else {
            this.referenceNode = new WeakReference<>(dXWidgetNode);
        }
    }

    public void setRelayoutBoundary(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b9f5e4", new Object[]{this, new Boolean(z)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.n = z;
    }

    public void setRight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d9b4c2", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeFrameBeforeCheck();
        this.dxNodeFrame.b = i;
    }

    @Override // tb.svb
    public void setRotationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf718c1", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.e = f;
    }

    @Override // tb.svb
    public void setRotationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eabf160", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.f = f;
    }

    @Override // tb.svb
    public void setRotationZ(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8060c9ff", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.g = f;
    }

    @Override // tb.svb
    public void setScaleX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e70ec9", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.c = f;
    }

    @Override // tb.svb
    public void setScaleY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459be768", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.d = f;
    }

    public void setShouldUpdate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ded440f", new Object[]{this, new Boolean(z)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.m = z;
    }

    public void setSoftwareRender(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("380f2f6e", new Object[]{this, new Boolean(z)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.i = z;
    }

    public void setSourceWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c0fd467", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            this.sourceWidgetWR = new WeakReference<>(dXWidgetNode);
            this.sourceAutoId = dXWidgetNode.getAutoId();
        }
    }

    public void setStatAnimationFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809064c2", new Object[]{this, new Integer(i)});
        } else {
            this.animationFlags = i | this.animationFlags;
        }
    }

    public void setStatFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d05e3a", new Object[]{this, new Integer(i)});
        } else {
            this.privateFlags = i | this.privateFlags;
        }
    }

    public void setStatInPropertyDeepCloneFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24994b4f", new Object[]{this, new Integer(i)});
        } else {
            this.propertyDeepCloneFlag = i | this.propertyDeepCloneFlag;
        }
    }

    public void setStrategy(lxb lxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191516ed", new Object[]{this, lxbVar});
        } else {
            this.strategy = lxbVar;
        }
    }

    public void setStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419fd4be", new Object[]{this, new Long(j), str});
        } else if (10297924263834610L == j) {
            this.userId = str;
        } else if (6301829145275697438L == j) {
            setAccessibilityText(str);
        } else if (6301824781620251403L == j) {
            setAccessibilityRole(str);
        } else if (j == -60331626368423735L || j == -8952773332738010306L) {
            setAnimation(str);
        } else if (j == DXVIEW_TBORDERJSON) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (this.dxNodeConstantProperty == null) {
                        this.dxNodeConstantProperty = new x56();
                    }
                    this.dxNodeConstantProperty.g = JSON.parseObject(str);
                }
            } catch (Exception e) {
                xv5.b(e);
            }
        } else if (j == 526314816) {
            setRef(str);
        } else {
            onSetStringAttribute(j, str);
        }
    }

    public void setTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a28e9a9", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeFrameBeforeCheck();
        this.dxNodeFrame.c = i;
    }

    @Override // tb.svb
    public void setTranslateX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beac94cd", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.f29789a = f;
    }

    @Override // tb.svb
    public void setTranslateY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0616d6c", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.b = f;
    }

    public final void setUserDefinedListAttribute(long j, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a16504c", new Object[]{this, new Long(j), list});
        } else {
            onSetUserDefinedListAttribute(j, list);
        }
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }

    public void setViewContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2efc0591", new Object[]{this, view});
        } else {
            this.viewContainer = (ViewGroup) view;
        }
    }

    public void setViewMatrixChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3fc9e1", new Object[]{this, new Boolean(z)});
        } else {
            this.viewMatrixChanged = z;
        }
    }

    public void setViewStubExprNode(fw5 fw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3c075f", new Object[]{this, fw5Var});
        } else {
            this.viewStubExprNode = fw5Var;
        }
    }

    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCommonBeforeCheck();
        this.dxNodeCommon.f7445a = i;
        if (this.isEnableButter && this.status != -1) {
            changeVisibility();
        }
    }

    public void setWRView(WeakReference<View> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4aa8b5", new Object[]{this, weakReference});
        } else {
            this.weakView = weakReference;
        }
    }

    public void setWeight(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e944af5d", new Object[]{this, new Double(d2)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.f15562a = d2;
    }

    public DXWidgetNode shallowButterClone(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("fd886b20", new Object[]{this, dXRuntimeContext});
        }
        DXWidgetNode build = build(null);
        if (build == null) {
            return null;
        }
        if (dXRuntimeContext != null) {
            build.dXRuntimeContext = dXRuntimeContext.b(build);
        }
        build.onButterClone(this);
        return build;
    }

    public Object shallowClone(DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("10620bbf", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        }
        DXWidgetNode build = build(null);
        if (build == null) {
            return null;
        }
        if (dXRuntimeContext != null) {
            build.dXRuntimeContext = dXRuntimeContext.b(build);
        }
        build.onClone(this, z);
        return build;
    }

    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public String toSelfWidgetNodeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7c6c15e", new Object[]{this});
        }
        if ((this instanceof ei6) || (this instanceof y06)) {
            return "";
        }
        return getClass().getName() + "@" + hashCode();
    }

    public String toTreeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cda5452", new Object[]{this});
        }
        DXWidgetNode queryRootWidgetNode = queryRootWidgetNode();
        if (queryRootWidgetNode != this) {
            return queryRootWidgetNode.toTreeInfo();
        }
        JSONObject jSONObject = new JSONObject(true);
        parseTreeInfo(jSONObject);
        return jSONObject.toJSONString();
    }

    public void unsetStatAnimationFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dfec449", new Object[]{this, new Integer(i)});
        } else {
            this.animationFlags = (~i) & this.animationFlags;
        }
    }

    public void unsetStatFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87a1ad3", new Object[]{this, new Integer(i)});
        } else {
            this.privateFlags = (~i) & this.privateFlags;
        }
    }

    public void unsetStatFlagInPropertyDeepCloneFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ce0122", new Object[]{this, new Integer(i)});
        } else {
            this.propertyDeepCloneFlag = (~i) & this.propertyDeepCloneFlag;
        }
    }

    public void updateRefreshType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22ac2b0", new Object[]{this, new Integer(i)});
            return;
        }
        DXRuntimeContext dXRuntimeContext = this.dXRuntimeContext;
        if (dXRuntimeContext != null) {
            dXRuntimeContext.o0(i);
            if (this.childrenCount > 0) {
                for (DXWidgetNode dXWidgetNode : this.children) {
                    dXWidgetNode.updateRefreshType(i);
                }
            }
        }
    }

    public void updateStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841d1e21", new Object[]{this, new Integer(i)});
        } else {
            this.status = i;
        }
    }

    public boolean validScreenAttrNodeArray() {
        DXLongSparseArray<Double> dXLongSparseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81f2ed69", new Object[]{this})).booleanValue();
        }
        if (nb6.i() || (dXLongSparseArray = this.screenAttrNode) == null || dXLongSparseArray.size() == 0 || !getStatInPrivateFlags(2097152)) {
            return false;
        }
        return true;
    }

    private void prePareBindEvent(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6edf5e7", new Object[]{this, new Long(j)});
            return;
        }
        DXEvent dXEvent = new DXEvent(j);
        dXEvent.setPrepareBind(true);
        postEvent(dXEvent);
    }

    public static int resolveSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d52ae167", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return resolveSizeAndState(i, i2, 0) & 16777215;
    }

    public final void addChild(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29df4907", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && dXWidgetNode != this) {
            if (this.children == null) {
                this.children = new ArrayList();
                this.childrenCount = 0;
            }
            this.children.add(dXWidgetNode);
            this.childrenCount++;
            dXWidgetNode.parentWidget = this;
            DXRuntimeContext dXRuntimeContext = this.dXRuntimeContext;
            if (dXRuntimeContext != null && z) {
                dXWidgetNode.dXRuntimeContext = dXRuntimeContext.b(dXWidgetNode);
            }
        }
    }

    public void bindRuntimeContext(DXRuntimeContext dXRuntimeContext, boolean z) {
        int i;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9a0548", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        } else if (dXRuntimeContext != null) {
            if (z) {
                obj = this.dXRuntimeContext.O();
                i = this.dXRuntimeContext.P();
            } else {
                obj = null;
                i = 0;
            }
            if (this.dXRuntimeContext != dXRuntimeContext) {
                DXRuntimeContext b2 = dXRuntimeContext.b(this);
                this.dXRuntimeContext = b2;
                if (z) {
                    b2.q0(obj);
                    this.dXRuntimeContext.r0(i);
                }
            }
            if (this.childrenCount > 0) {
                for (DXWidgetNode dXWidgetNode : this.children) {
                    dXWidgetNode.bindRuntimeContext(dXRuntimeContext, z);
                }
            }
        }
    }

    public int checkRealVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e56376f2", new Object[]{this})).intValue();
        }
        DXWidgetNode dXWidgetNode = this.parentWidget;
        if (dXWidgetNode == null) {
            return getVisibility();
        }
        int checkRealVisibility = dXWidgetNode.checkRealVisibility();
        if (checkRealVisibility == 0) {
            return getVisibility();
        }
        return checkRealVisibility == 1 ? 1 : 2;
    }

    public int getBorderColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5a9b95b", new Object[]{this})).intValue();
        }
        w56 w56Var = this.dxNodeBorder;
        if (w56Var == null) {
            return 0;
        }
        return w56Var.b;
    }

    public int getCornerRadiusRightBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d48b98e4", new Object[]{this})).intValue();
        }
        y56 y56Var = this.dxNodeCorner;
        if (y56Var == null) {
            return 0;
        }
        return y56Var.e;
    }

    public int getEventResponseMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfdcf102", new Object[]{this})).intValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return 0;
        }
        return a66Var.h;
    }

    @Override // tb.svb
    public int getLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue();
        }
        z56 z56Var = this.dxNodeFrame;
        if (z56Var == null) {
            return 0;
        }
        return z56Var.f32549a;
    }

    @Override // tb.svb
    public final int getMeasuredHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e10b2f7d", new Object[]{this})).intValue();
        }
        z56 z56Var = this.dxNodeFrame;
        if (z56Var == null) {
            return 0;
        }
        return z56Var.f & 16777215;
    }

    public final int getMeasuredHeightAndState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e503ac97", new Object[]{this})).intValue();
        }
        z56 z56Var = this.dxNodeFrame;
        if (z56Var == null) {
            return 0;
        }
        return z56Var.f;
    }

    public int getRightMarginWithDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f628dff", new Object[]{this})).intValue();
        }
        if (getDirection() == 1) {
            return getMarginLeft();
        }
        return getMarginRight();
    }

    @Override // tb.svb
    public int getTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9c9cf19", new Object[]{this})).intValue();
        }
        z56 z56Var = this.dxNodeFrame;
        if (z56Var == null) {
            return 0;
        }
        return z56Var.c;
    }

    public void insertChild(DXWidgetNode dXWidgetNode, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e5e2676", new Object[]{this, dXWidgetNode, new Integer(i), new Boolean(z)});
        } else if (dXWidgetNode != null && dXWidgetNode != this && i <= this.childrenCount) {
            if (this.children == null) {
                this.children = new ArrayList();
                this.childrenCount = 0;
            }
            this.children.add(i, dXWidgetNode);
            this.childrenCount++;
            dXWidgetNode.parentWidget = this;
            DXRuntimeContext dXRuntimeContext = this.dXRuntimeContext;
            if (dXRuntimeContext != null && z) {
                dXWidgetNode.dXRuntimeContext = dXRuntimeContext.b(dXWidgetNode);
            }
        }
    }

    public boolean isClipChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df8b07c4", new Object[]{this})).booleanValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return true;
        }
        return a66Var.e;
    }

    public boolean isDisableDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5ad3c2", new Object[]{this})).booleanValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return false;
        }
        return a66Var.l;
    }

    public boolean isOpenNewFastReturnLogic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7e62b91", new Object[]{this})).booleanValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return false;
        }
        return a66Var.c;
    }

    public boolean isRelayoutBoundary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9c037bc", new Object[]{this})).booleanValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return false;
        }
        return a66Var.n;
    }

    public boolean isSoftwareRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f86936f2", new Object[]{this})).booleanValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return false;
        }
        return a66Var.i;
    }

    public void onBeginParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f4e04", new Object[]{this, new Boolean(z)});
        }
    }

    public void onEndParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e57e52", new Object[]{this, new Boolean(z)});
        }
    }

    public DXWidgetNode queryWidgetNodeByUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("ffaa925b", new Object[]{this, str});
        }
        if (!zg5.w5(getDXRuntimeContext())) {
            return queryRootWidgetNode().queryWTByUserId(str);
        }
        DXWidgetNode queryWidgetNodeByUserIdFromMap = queryWidgetNodeByUserIdFromMap(str, true);
        if (queryWidgetNodeByUserIdFromMap == null && DinamicXEngine.j0()) {
            h36.c(str + " queryWidgetNodeByUserId 没有找到");
        }
        return queryWidgetNodeByUserIdFromMap;
    }

    public void removeAllChild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86c1da6", new Object[]{this});
            return;
        }
        List<DXWidgetNode> list = this.children;
        if (list == null) {
            this.childrenCount = 0;
            return;
        }
        list.clear();
        this.childrenCount = 0;
    }

    public final DXWidgetNode removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("6d316410", new Object[]{this, new Integer(i)});
        }
        List<DXWidgetNode> list = this.children;
        if (list == null) {
            return null;
        }
        if (i >= list.size() || i < 0) {
            throw new IndexOutOfBoundsException("index: " + i + "  size: " + this.children.size());
        }
        this.childrenCount--;
        return this.children.remove(i);
    }

    public final void renderViewWithButter(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf16caa0", new Object[]{this, context});
            return;
        }
        try {
            View nativeView = getNativeView();
            if (nativeView != null) {
                if (nativeView.getAlpha() != getAlpha() && !getStatInAnimationFlag(1)) {
                    nativeView.setAlpha(getAlpha());
                }
                renderTransformedProperty(nativeView);
                bindAccessibilityToView(nativeView, getAccessibility());
                setBackground(nativeView);
                onRenderView(context, nativeView);
                if (nativeView instanceof ViewGroup) {
                    if (!eb5.k()) {
                        nativeView.setLayoutDirection(getDirection());
                    } else if (nativeView.getLayoutDirection() != getDirection()) {
                        nativeView.setLayoutDirection(getDirection());
                    }
                }
                setForceDark(nativeView);
            }
        } catch (Exception e) {
            xv5.b(e);
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext != null && dXRuntimeContext.m() != null) {
                f.a aVar = new f.a("Render", "Pipeline_Detail_Render_Detail", 90002);
                aVar.e = xv5.a(e);
                dXRuntimeContext.m().c.add(aVar);
            }
        }
    }

    public final void requestLayout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94fc0434", new Object[]{this, new Boolean(z)});
        } else if (this.isEnableButter) {
            getDXRuntimeContext().k().w(this, this.viewContainer);
        } else {
            this.privateFlags = (this.privateFlags | 16384) & (-41);
            DXWidgetNode dXWidgetNode = this.parentWidget;
            if (dXWidgetNode != null) {
                dXWidgetNode.requestLayout(z);
                return;
            }
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext != null) {
                m o = dXRuntimeContext.o();
                ph5 l = dXRuntimeContext.l();
                if (o != null && l != null) {
                    k n = o.n();
                    if (n != null) {
                        n.o(dXRuntimeContext.d());
                    }
                    y76 y76Var = new y76();
                    y76Var.d = 3;
                    y76Var.f25390a = this;
                    if (z) {
                        y76Var.e = 1;
                    } else {
                        y76Var.e = 0;
                    }
                    l.d(y76Var);
                }
            }
        }
    }

    public void setPaddingBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc124f81", new Object[]{this});
        } else if (this.dxNodePadding == null) {
            this.dxNodePadding = new c66();
            setStatInPropertyDeepCloneFlag(1);
        } else if (!getStatInPropertyDeepCloneFlag(1)) {
            this.dxNodePadding = this.dxNodePadding.a(true);
            setStatInPropertyDeepCloneFlag(1);
        }
    }

    public static int getAbsoluteGravity(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db55acfb", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return (i2 != 0 && i2 == 1) ? (i == 0 || i == 1 || i == 2) ? i + 6 : (i == 6 || i == 7 || i == 8) ? i - 6 : i : i;
    }

    public void applyTransform(View view, Object obj) {
        List<Animator> list;
        float f;
        float f2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4659229", new Object[]{this, view, obj});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            String string = jSONObject.getString("transform");
            String string2 = jSONObject.getString("transition");
            try {
                List<nj6.a> b2 = nj6.b(string);
                float f3 = 1.0f;
                if (b2 != null) {
                    f = 1.0f;
                    for (nj6.a aVar : b2) {
                        int i2 = aVar.f24771a;
                        if (i2 == 6) {
                            float[] fArr = aVar.b;
                            f3 *= fArr[0];
                            f2 = fArr[1];
                        } else if (i2 == 7) {
                            f3 *= aVar.b[0];
                        } else if (i2 == 8) {
                            f2 = aVar.b[0];
                        } else {
                            throw new IllegalArgumentException("Invalid Transform method: " + aVar.f24771a);
                        }
                        f *= f2;
                    }
                } else {
                    f = 1.0f;
                }
                view.setScaleX(f3);
                view.setScaleY(f);
                List<oj6.e> e = oj6.e(string2, null, null, null, null);
                float floatValue = jSONObject.getFloatValue("opacity");
                String string3 = jSONObject.getString("backgroundColor");
                if (!TextUtils.isEmpty(string3)) {
                    i = Color.parseColor(string3);
                }
                list = oj6.g(e, view, floatValue, i);
            } catch (Throwable unused) {
                list = null;
            }
            if (list == null || list.isEmpty()) {
                zb5 zb5Var = this.animationHolder;
                if (zb5Var != null) {
                    zb5Var.d();
                    this.animationHolder = null;
                    return;
                }
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(0L);
            animatorSet.playTogether(list);
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorSet);
            zb5 zb5Var2 = new zb5(arrayList);
            this.animationHolder = zb5Var2;
            zb5Var2.c();
        }
    }

    public final void bindEventWithButter(Context context) {
        View nativeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26a855e", new Object[]{this, context});
        } else if (getEventHandlersExprNode() != null && (nativeView = getNativeView()) != null) {
            for (int i = 0; i < getEventHandlersExprNode().size(); i++) {
                onBindEvent(context, nativeView, getEventHandlersExprNode().keyAt(i));
            }
        }
    }

    public boolean getStatInAnimationFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e926003f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return (this.animationFlags & i) == i;
    }

    public boolean getStatInPrivateFlags(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eed3094d", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return (this.privateFlags & i) == i;
    }

    public boolean hasAccessibilityAuto() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eebf2bae", new Object[]{this})).booleanValue();
        }
        u56 u56Var = this.dxNodeAccessibility;
        return u56Var != null && u56Var.f29150a == 3;
    }

    public boolean isSelfResponseEvent() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e485d1ee", new Object[]{this})).booleanValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        return a66Var == null || (i = a66Var.h) == 0 || i == 2;
    }

    public boolean needParseAP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee07eb37", new Object[]{this})).booleanValue();
        }
        return validScreenAttrNodeArray() && getStatInPrivateFlags(2097152) && this.dXRuntimeContext.b0();
    }

    public boolean onEvent(DXEvent dXEvent) {
        String str;
        DXTemplateItem dXTemplateItem;
        String str2;
        fw5 fw5Var;
        fw5 fw5Var2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (isV4Node()) {
            return onEventV4(dXEvent);
        }
        try {
            if (getEventHandlersExprNode() == null || dXEvent == null || (fw5Var2 = getEventHandlersExprNode().get(dXEvent.getEventId())) == null) {
                return false;
            }
            if ((getDXRuntimeContext() == null || !getDXRuntimeContext().a0()) && !(fw5Var2 instanceof vv5) && !(fw5Var2 instanceof ac6) && !(fw5Var2 instanceof rb6)) {
                DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
                if (!(dXRuntimeContext == null || dXRuntimeContext.m() == null)) {
                    new f.a(pg1.ATOM_EXT_Event, "Event_Cast_Exception", f.EVENT_DXEXPRNODE_CAST_ERROR, "eventid" + dXEvent.getEventId() + " exprNode id " + fw5Var2.b + " exprNode name " + fw5Var2.d);
                }
                return false;
            }
            fw5Var2.b(dXEvent, getDXRuntimeContext());
            return true;
        } catch (Exception e) {
            xv5.b(e);
            if (getDXRuntimeContext() != null) {
                str = getDXRuntimeContext().c();
                dXTemplateItem = getDXRuntimeContext().p();
            } else {
                str = "dinamicx";
                dXTemplateItem = null;
            }
            if (dXEvent != null) {
                str2 = "eventId : " + dXEvent.getEventId();
                if (!(getEventHandlersExprNode() == null || (fw5Var = getEventHandlersExprNode().get(dXEvent.getEventId())) == null)) {
                    str2 = str2 + " exprNode id " + fw5Var.b + " exprNode name " + fw5Var.d;
                }
            } else {
                str2 = "";
            }
            ic5.s(str, dXTemplateItem, "Pipeline", "Pipeline_Stage_ON_EVENT", f.ONEVENT_CRASH, str2 + " crash stack: " + xv5.a(e));
            return false;
        }
    }

    public int replaceChild(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3f51762", new Object[]{this, dXWidgetNode, dXWidgetNode2})).intValue();
        }
        if (!(this instanceof j) || dXWidgetNode2 == null) {
            return -1;
        }
        while (true) {
            if (i >= getChildrenCount()) {
                i = -1;
                break;
            } else if (getChildAt(i).getAutoId() == dXWidgetNode2.getAutoId()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            removeChildWithAutoId(dXWidgetNode2.getAutoId());
            insertChild(dXWidgetNode, i);
        }
        return i;
    }

    public int tryFetchDarkModeColor(String str, int i, int i2) {
        Integer num;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1cfecf", new Object[]{this, str, new Integer(i), new Integer(i2)})).intValue();
        }
        if (!needHandleDark(getDXRuntimeContext())) {
            return i2;
        }
        if (getDarkModeColorMap() != null) {
            if (!(getDXRuntimeContext() == null || getDXRuntimeContext().r() == null || getDXRuntimeContext().r().K() == null)) {
                z = getDXRuntimeContext().r().K().a();
            }
            if (!z && (num = getDarkModeColorMap().get(str)) != null) {
                this.hasHandleDark = true;
                return num.intValue();
            }
        }
        if (getDXRuntimeContext() != null && getDXRuntimeContext().r() != null && getDXRuntimeContext().r().K() != null) {
            this.hasHandleDark = true;
            return getDXRuntimeContext().r().K().c(i, i2);
        } else if (!DXDarkModeCenter.b()) {
            return i2;
        } else {
            this.hasHandleDark = true;
            return DXDarkModeCenter.e(i, i2);
        }
    }

    private void sendPartMeasureLayoutEvent(DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae4a0763", new Object[]{this, dXWidgetRefreshOption});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext != null) {
            m o = dXRuntimeContext.o();
            ph5 l = dXRuntimeContext.l();
            if (o != null && l != null) {
                k n = o.n();
                if (n != null) {
                    n.o(dXRuntimeContext.d());
                }
                y76 y76Var = new y76();
                y76Var.d = 3;
                y76Var.f25390a = this;
                y76Var.e = 1;
                if (dXWidgetRefreshOption == null) {
                    y76Var.f = false;
                } else {
                    if (dXWidgetRefreshOption.l()) {
                        y76Var.e = 2;
                    }
                    y76Var.f = dXWidgetRefreshOption.k();
                    ((HashMap) y76Var.c).put("width", Integer.valueOf(dXWidgetRefreshOption.i()));
                    ((HashMap) y76Var.c).put("height", Integer.valueOf(dXWidgetRefreshOption.h()));
                }
                if (y76Var.f) {
                    l.d(y76Var);
                } else {
                    l.e(y76Var);
                }
            }
        }
    }

    private void sendPartParserEvent(DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9d72f6", new Object[]{this, dXWidgetRefreshOption});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext != null) {
            m o = dXRuntimeContext.o();
            ph5 l = dXRuntimeContext.l();
            if (o != null && l != null) {
                k n = o.n();
                if (n != null) {
                    n.o(dXRuntimeContext.d());
                }
                y76 y76Var = new y76();
                y76Var.d = 2;
                y76Var.e = 1;
                y76Var.f25390a = this;
                if (dXWidgetRefreshOption == null) {
                    y76Var.f = false;
                } else {
                    if (dXWidgetRefreshOption.l()) {
                        y76Var.e = 2;
                    }
                    y76Var.f = dXWidgetRefreshOption.k();
                    ((HashMap) y76Var.c).put("width", Integer.valueOf(dXWidgetRefreshOption.i()));
                    ((HashMap) y76Var.c).put("height", Integer.valueOf(dXWidgetRefreshOption.h()));
                }
                if (y76Var.f) {
                    l.d(y76Var);
                } else {
                    l.e(y76Var);
                }
            }
        }
    }

    public void bindAccessibilityToView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0dfc7a9", new Object[]{this, view, new Integer(i)});
            return;
        }
        String accessibilityText = getAccessibilityText();
        final String accessibilityRole = getAccessibilityRole();
        if (i != -1 && i != 3) {
            if (accessibilityText != null) {
                view.setContentDescription(accessibilityText);
            }
            if (i == 1) {
                view.setImportantForAccessibility(1);
                view.setFocusable(true);
            } else if (i == 2) {
                view.setImportantForAccessibility(4);
            } else {
                view.setImportantForAccessibility(2);
            }
            if (!TextUtils.isEmpty(accessibilityRole)) {
                ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat(this) { // from class: com.taobao.android.dinamicx.widget.DXWidgetNode.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        if (str.hashCode() == -672710132) {
                            super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                            return null;
                        }
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXWidgetNode$1");
                    }

                    @Override // androidx.core.view.AccessibilityDelegateCompat
                    public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d7e7420c", new Object[]{this, view2, accessibilityNodeInfoCompat});
                            return;
                        }
                        super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                        String a2 = bb5.a(accessibilityRole);
                        if (!TextUtils.isEmpty(a2)) {
                            accessibilityNodeInfoCompat.setRoleDescription(a2);
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
        if (r1 != false) goto L_0x00aa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:6:0x0023, B:10:0x002d, B:12:0x0033, B:19:0x0040, B:21:0x0048, B:25:0x0051, B:27:0x005b, B:31:0x0068, B:33:0x006c, B:35:0x0072, B:37:0x0079, B:39:0x0084, B:41:0x008c, B:44:0x009a, B:53:0x00aa, B:55:0x00b0, B:57:0x00c0, B:58:0x00c7, B:61:0x00d5, B:62:0x00e8, B:63:0x00f3, B:64:0x010b, B:65:0x010e), top: B:72:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:6:0x0023, B:10:0x002d, B:12:0x0033, B:19:0x0040, B:21:0x0048, B:25:0x0051, B:27:0x005b, B:31:0x0068, B:33:0x006c, B:35:0x0072, B:37:0x0079, B:39:0x0084, B:41:0x008c, B:44:0x009a, B:53:0x00aa, B:55:0x00b0, B:57:0x00c0, B:58:0x00c7, B:61:0x00d5, B:62:0x00e8, B:63:0x00f3, B:64:0x010b, B:65:0x010e), top: B:72:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void defaultMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXWidgetNode.defaultMeasure(int, int):void");
    }

    @Deprecated
    public JSONObject invokeRefMethod(String str, JSONArray jSONArray) {
        View D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6cd0df95", new Object[]{this, str, jSONArray});
        }
        if (pg1.ATOM_EXT_getBoundingClientRect.equals(str)) {
            if (getDXRuntimeContext() == null || (D = getDXRuntimeContext().D()) == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            int measuredWidth = D.getMeasuredWidth();
            int measuredHeight = D.getMeasuredHeight();
            int[] iArr = new int[2];
            D.getLocationOnScreen(iArr);
            float g = owo.g(getDXRuntimeContext().h()) / 375.0f;
            jSONObject.put("x", (Object) Float.valueOf(iArr[0] / g));
            jSONObject.put("y", (Object) Float.valueOf(iArr[1] / g));
            jSONObject.put("left", (Object) Float.valueOf(iArr[0] / g));
            jSONObject.put("top", (Object) Float.valueOf(iArr[1] / g));
            jSONObject.put("width", (Object) Float.valueOf(measuredWidth / g));
            jSONObject.put("height", (Object) Float.valueOf(measuredHeight / g));
            jSONObject.put("right", (Object) Float.valueOf((iArr[0] + measuredWidth) / g));
            jSONObject.put("bottom", (Object) Float.valueOf((iArr[1] + measuredHeight) / g));
            return jSONObject;
        } else if (!"commit".equals(str) || getDXRuntimeContext() == null || getDXRuntimeContext().D() == null) {
            return null;
        } else {
            try {
                applyTransform(getDXRuntimeContext().D(), jSONArray.get(0));
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    public void setRealViewVisibility(View view, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a0874f", new Object[]{this, view, new Integer(i)});
        } else if (view != null) {
            if (i != 0) {
                if (i == 1) {
                    i2 = 4;
                } else if (i == 2) {
                    i2 = 8;
                }
            }
            if (view.getVisibility() != i2) {
                view.setVisibility(i2);
            }
        }
    }

    public void setCornerRadius(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9823bd90", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        setNodeCornerBeforeCheck();
        y56 y56Var = this.dxNodeCorner;
        y56Var.b = i;
        y56Var.c = i2;
        y56Var.d = i3;
        y56Var.e = i4;
        this.needSetBackground = true;
    }

    public void setBackground(View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
        } else if (this.needSetBackground || getStatInPrivateFlags(65536)) {
            int tryFetchDarkModeColor = tryFetchDarkModeColor("backgroundColor", 1, getBackGroundColor());
            int tryFetchDarkModeColor2 = tryFetchDarkModeColor("borderColor", 2, getBorderColor());
            Drawable background = view.getBackground();
            int dashWidth = getDashWidth();
            int dashGap = getDashGap();
            int cornerRadius = getCornerRadius();
            int cornerRadiusLeftTop = getCornerRadiusLeftTop();
            int cornerRadiusRightBottom = getCornerRadiusRightBottom();
            int cornerRadiusLeftBottom = getCornerRadiusLeftBottom();
            int cornerRadiusRightTop = getCornerRadiusRightTop();
            int borderWidth = getBorderWidth();
            if (getBorderType() == 1) {
                if (dashWidth <= -1 && DinamicXEngine.x() != null) {
                    dashWidth = pb6.d(getEngine(), DinamicXEngine.x(), 6.0f);
                }
                if (dashGap <= -1 && DinamicXEngine.x() != null) {
                    dashGap = pb6.d(getEngine(), DinamicXEngine.x(), 4.0f);
                }
            } else {
                dashWidth = 0;
                dashGap = 0;
            }
            d backgroundGradient = getBackgroundGradient();
            if (background != null && (background instanceof GradientDrawable)) {
                GradientDrawable gradientDrawable = (GradientDrawable) background;
                gradientDrawable.setColor(tryFetchDarkModeColor);
                if (cornerRadius > 0) {
                    gradientDrawable.setCornerRadius(cornerRadius);
                } else {
                    float f = cornerRadiusLeftTop;
                    float f2 = cornerRadiusRightTop;
                    float f3 = cornerRadiusRightBottom;
                    float f4 = cornerRadiusLeftBottom;
                    gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
                }
                if (borderWidth >= 0 && tryFetchDarkModeColor2 != 0) {
                    gradientDrawable.setStroke(borderWidth, tryFetchDarkModeColor2, dashWidth, dashGap);
                } else if (borderWidth >= 0 && tryFetchDarkModeColor2 == 0) {
                    gradientDrawable.setStroke(0, 0, 0.0f, 0.0f);
                }
                if (backgroundGradient != null && backgroundGradient.a() == 0) {
                    gradientDrawable.setGradientType(backgroundGradient.a());
                    gradientDrawable.setOrientation(backgroundGradient.c());
                    gradientDrawable.setColors(backgroundGradient.b());
                }
            } else if (hasCornerRadius() || tryFetchDarkModeColor2 != 0 || borderWidth >= 0 || backgroundGradient != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                if (cornerRadius > 0) {
                    gradientDrawable2.setCornerRadius(cornerRadius);
                    i = 0;
                } else {
                    float f5 = cornerRadiusLeftTop;
                    float f6 = cornerRadiusRightTop;
                    float f7 = cornerRadiusRightBottom;
                    float f8 = cornerRadiusLeftBottom;
                    i = 0;
                    gradientDrawable2.setCornerRadii(new float[]{f5, f5, f6, f6, f7, f7, f8, f8});
                }
                gradientDrawable2.setShape(i);
                gradientDrawable2.setColor(tryFetchDarkModeColor);
                if (borderWidth >= 0 && tryFetchDarkModeColor2 != 0) {
                    gradientDrawable2.setStroke(borderWidth, tryFetchDarkModeColor2, dashWidth, dashGap);
                } else if (borderWidth >= 0 && tryFetchDarkModeColor2 == 0) {
                    gradientDrawable2.setStroke(0, 0, 0.0f, 0.0f);
                }
                if (backgroundGradient != null && backgroundGradient.a() == 0) {
                    gradientDrawable2.setGradientType(backgroundGradient.a());
                    gradientDrawable2.setOrientation(backgroundGradient.c());
                    gradientDrawable2.setColors(backgroundGradient.b());
                }
                view.setBackground(gradientDrawable2);
            } else {
                view.setBackgroundColor(tryFetchDarkModeColor);
            }
        }
    }

    public final void setNeedLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1530e9", new Object[]{this});
        } else {
            setNeedLayout(false);
        }
    }

    public final void setNeedLayout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7919f0b", new Object[]{this, new Boolean(z)});
        } else if (this.isEnableButter) {
            getDXRuntimeContext().k().w(this, this.viewContainer);
        } else {
            this.privateFlags = (this.privateFlags | 16384) & (-41);
            DXWidgetNode dXWidgetNode = this.parentWidget;
            if (dXWidgetNode instanceof DXRecyclerLayout) {
                if (z) {
                    updateRefreshType(1);
                    ((DXRecyclerLayout) this.parentWidget).V0(this);
                    return;
                }
                ((DXRecyclerLayout) dXWidgetNode).n1(this);
            } else if (dXWidgetNode != null) {
                dXWidgetNode.setNeedLayout(z);
            } else {
                DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
                if (dXRuntimeContext != null) {
                    m o = dXRuntimeContext.o();
                    ph5 l = dXRuntimeContext.l();
                    if (o != null && l != null) {
                        k n = o.n();
                        if (n != null) {
                            n.o(dXRuntimeContext.d());
                        }
                        y76 y76Var = new y76();
                        y76Var.d = 3;
                        y76Var.f25390a = this;
                        if (z) {
                            y76Var.e = 1;
                        } else {
                            y76Var.e = 0;
                        }
                        l.e(y76Var);
                    }
                }
            }
        }
    }

    public void setNeedParse(DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36667011", new Object[]{this, dXWidgetRefreshOption});
        } else if (this.isEnableButter) {
            getDXRuntimeContext().k().w(this, this.viewContainer);
        } else {
            if (dXWidgetRefreshOption == null) {
                dXWidgetRefreshOption = new DXWidgetRefreshOption();
            }
            boolean l = dXWidgetRefreshOption.l();
            if (dXWidgetRefreshOption.g() != 3) {
                this.privateFlags = (this.privateFlags & (-3)) | 5;
                unsetStatFlag(2048);
                if (!isMarkContainerLayout()) {
                    unsetStatFlag(4096);
                }
            } else if (isShouldUpdate()) {
                this.privateFlags = (this.privateFlags & (-3)) | 5;
                unsetStatFlag(2048);
                unsetStatFlag(4096);
                setStatFlag(524288);
            }
            if (l) {
                setStatFlag(2097152);
            }
            if (dXWidgetRefreshOption.g() == 3) {
                if (dXWidgetRefreshOption.j() && isShouldUpdate()) {
                    bindChildrenParseFlag(dXWidgetRefreshOption);
                }
            } else if (dXWidgetRefreshOption.j()) {
                bindChildrenParseFlag(dXWidgetRefreshOption);
            }
            if (this.parentWidget == null) {
                sendPartParserEvent(dXWidgetRefreshOption);
            } else if (DinamicXEngine.j0() && l) {
                throw new IllegalArgumentException(Log.getStackTraceString(new IllegalArgumentException("窗口变化局部刷新必须从根节点调用(getDXRuntimeContext().getRealRootExpandWidget())：")));
            } else if (dXWidgetRefreshOption.g() == 3) {
                this.parentWidget.bindParentMeasureFlagWithOption(true, dXWidgetRefreshOption);
            } else {
                this.parentWidget.bindParentMeasureFlag(this, true, dXWidgetRefreshOption);
            }
        }
    }

    public final void setNeedParse(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4981b292", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            setNeedParse();
        } else {
            this.privateFlags = (this.privateFlags & (-3)) | 5;
            DXWidgetNode dXWidgetNode = this.parentWidget;
            if (dXWidgetNode != null) {
                dXWidgetNode.bindParentMeasureFlag(this, true, null);
            } else {
                sendPartParserEvent(null);
            }
        }
    }
}
