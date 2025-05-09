package com.taobao.tao.flexbox.layoutmanager.core;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaPositionType;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.ComponentInfoDef;
import com.taobao.taobao.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.akt;
import tb.anl;
import tb.bc4;
import tb.dgw;
import tb.e0o;
import tb.ec4;
import tb.ejg;
import tb.hfs;
import tb.hk8;
import tb.igs;
import tb.jfw;
import tb.le8;
import tb.nwv;
import tb.ol4;
import tb.pg1;
import tb.piw;
import tb.qy0;
import tb.rbi;
import tb.reu;
import tb.s6o;
import tb.skg;
import tb.t2o;
import tb.tfs;
import tb.uaa;
import tb.w91;
import tb.yhe;
import tb.yk9;
import tb.ytn;
import tb.yzn;
import tb.z5k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class Component<V extends View, P extends jfw> implements com.taobao.tao.flexbox.layoutmanager.core.e<V, P>, w91 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APPEAR_TYPE_ADD = "add";
    public static final String APPEAR_TYPE_BACKGROUND = "background";
    public static final String APPEAR_TYPE_DELETE = "delete";
    public static final String APPEAR_TYPE_FOREGROUND = "foreground";
    public static final String APPEAR_TYPE_Item = "item";
    public static final String APPEAR_TYPE_PAGE = "page";
    public static final String APPEAR_TYPE_TAB = "tab";
    public static final int INVALID_ANIMATION_VALUE = Integer.MIN_VALUE;
    public static final String KEY_PAGE_NAME = "pagename";
    public static final String KEY_SPM = "spm";
    public static final String KEY_SPM_CNT = "spm-cnt";
    public static final String KEY_SPM_URL = "spm-url";
    public static final int MSG_FLAG_APPEAR = 130;
    public static final int MSG_FLAG_DEPTH = 2;
    public static final int MSG_FLAG_DISAPPEAR = 386;
    public static final int MSG_FLAG_EXCEPT_SELF = 64;
    public static final int MSG_FLAG_IGNORE_ALL_HANDLER = 128;
    public static final int MSG_FLAG_IGNORE_CHILD = 2048;
    public static final int MSG_FLAG_IGNORE_CONTAINER = 8;
    public static final int MSG_FLAG_IGNORE_TRACK = 4;
    public static final int MSG_FLAG_MESSAGE_HANDLE = 32;
    public static final int MSG_FLAG_MESSAGE_WATCH = 512;
    public static final int MSG_FLAG_PAGE_APPEAR = 130;
    public static final int MSG_FLAG_PAGE_DISAPPEAR = 130;
    public static final int MSG_FLAG_REVERSE = 256;
    public static final int MSG_FLAG_SIBLING = 16;
    public static final int MSG_FLAG_UP = 1;
    public static final int MSG_FLAG_WATCH_HANDLED = 1024;
    public static final String SELF_TRANSITION_NAME = "tnode_self_transition";
    public static final int TAB_TRANSLATION_DURATION = 250;
    private static Map<String, com.taobao.tao.flexbox.layoutmanager.core.b> attributeHandlers;
    private static boolean fixWidthHeightTransition = akt.p2("fixWidthHeightTransition", true);
    private boolean attrInitInPrepare;
    private ImageLoader.f backgroundTask;
    public View.OnClickListener clickListener;
    public long clickTimeStamp;
    public j currentHostViewComponentInfo;
    public long doubleClickTimeStamp;
    private yk9 flexBoxNode;
    public View.OnLongClickListener longClickListener;
    public rbi measureResult;
    public String name;
    public n node;
    public V prepareView;
    public Map<String, yzn> renderCompleteListeners;
    public View.OnTouchListener touchListener;
    public V view;
    public P viewParams;
    private int animationWidth = Integer.MIN_VALUE;
    private int animationHeight = Integer.MIN_VALUE;
    private int animationLeft = Integer.MIN_VALUE;
    private int animationTop = Integer.MIN_VALUE;
    private int animationRight = Integer.MIN_VALUE;
    private int animationBottom = Integer.MIN_VALUE;
    public boolean attached = false;
    public boolean initRender = true;
    private float componentAlpha = 1.0f;
    private int preRealWidth = 0;
    private int preRealHeight = 0;
    private boolean isFirstTime = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f12182a;

        public a(Object obj) {
            this.f12182a = obj;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2043089436) {
                super.onLongPress((MotionEvent) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/Component$1");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("886c5d07", new Object[]{this, motionEvent})).booleanValue();
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                return;
            }
            Component component = Component.this;
            View.OnLongClickListener onLongClickListener = component.longClickListener;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(component.view);
            }
            super.onLongPress(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
            }
            if (Component.this.clickListener != null && System.currentTimeMillis() - Component.this.doubleClickTimeStamp > ViewConfiguration.getDoubleTapTimeout() * 2) {
                Component component = Component.this;
                component.clickListener.onClick(component.view);
            }
            if (Component.this.clickListener != null) {
                return true;
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
            }
            if (Component.this.clickListener != null) {
                return true;
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
            }
            Component component = Component.this;
            component.sendMessage(component.node, "ondblclick", Component.access$000(component, this.f12182a), Component.this.clickArgs(), null);
            Component.this.doubleClickTimeStamp = System.currentTimeMillis();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GestureDetector f12183a;

        public b(Component component, GestureDetector gestureDetector) {
            this.f12183a = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return this.f12183a.onTouchEvent(motionEvent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f12184a;

        public c(Object obj) {
            this.f12184a = obj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Component component = Component.this;
            int i = component.viewParams.b0;
            if ((i <= 0 || currentTimeMillis - component.clickTimeStamp >= i) && uaa.e().c(Component.this.getNode())) {
                Component component2 = Component.this;
                component2.sendMessage(component2.node, "click", null, null, null);
                Component component3 = Component.this;
                component3.sendMessage(component3.node, "onclick", Component.access$000(component3, this.f12184a), Component.this.clickArgs(), uaa.e().f());
                Component.this.clickTimeStamp = currentTimeMillis;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f12185a;

        public d(Object obj) {
            this.f12185a = obj;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            Component.access$100(Component.this);
            Component component = Component.this;
            component.sendMessage(component.node, "onlongpress", Component.access$000(component, this.f12185a), Component.this.longClickArgs(), null);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            View.OnLongClickListener onLongClickListener = (View.OnLongClickListener) Component.this.node.m0(2);
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(Component.this.view);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/Component$7");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
            }
            if (Component.this.clickListener != null && System.currentTimeMillis() - Component.this.doubleClickTimeStamp > ViewConfiguration.getDoubleTapTimeout() * 2) {
                Component component = Component.this;
                component.clickListener.onClick(component.view);
            }
            if (Component.this.clickListener != null) {
                return true;
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
            }
            if (Component.this.clickListener != null) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GestureDetector f12189a;

        public h(Component component, GestureDetector gestureDetector) {
            this.f12189a = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            ViewProxy.setOnClickListener(view, null);
            return this.f12189a.onTouchEvent(motionEvent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12190a;

        public i(String str) {
            this.f12190a = str;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            Component component = Component.this;
            if (component.measureResult != null && component.view != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("x", Integer.valueOf(s6o.K(Component.this.getNode(), Component.this.view.getContext(), Component.this.measureResult.c)));
                hashMap.put("y", Integer.valueOf(s6o.K(Component.this.getNode(), Component.this.view.getContext(), Component.this.measureResult.d)));
                hashMap.put("w", Integer.valueOf(s6o.K(Component.this.getNode(), Component.this.view.getContext(), Component.this.measureResult.f27261a)));
                hashMap.put("h", Integer.valueOf(s6o.K(Component.this.getNode(), Component.this.view.getContext(), Component.this.measureResult.b)));
                Component component2 = Component.this;
                component2.sendMessage(component2.node, "onviewdidlayout", this.f12190a, hashMap, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public Component f12191a;
        public rbi b;

        static {
            t2o.a(503317023);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public String f12192a;
        public Rect b;
        public Bitmap c;
        public String d;
        public Bitmap e;
        public String f;

        static {
            t2o.a(503317024);
        }
    }

    public static /* synthetic */ String access$000(Component component, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53c0b150", new Object[]{component, obj});
        }
        return component.getString(obj);
    }

    public static /* synthetic */ void access$100(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac179dd3", new Object[]{component});
        } else {
            component.requestParentTouchDisallow();
        }
    }

    private void cancelRunningAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e5aa73", new Object[]{this});
        } else {
            this.node.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkListItemChanged(com.taobao.tao.flexbox.layoutmanager.core.n r10, com.taobao.tao.flexbox.layoutmanager.core.n r11) {
        /*
            r9 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.tao.flexbox.layoutmanager.core.Component.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "a5189342"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r9
            r0 = 1
            r3[r0] = r10
            r10 = 2
            r3[r10] = r11
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0018:
            com.taobao.tao.flexbox.layoutmanager.core.n r1 = com.taobao.tao.flexbox.layoutmanager.core.q.h(r11)
            if (r1 == 0) goto L_0x0073
            android.view.View r2 = r1.w0()
            if (r2 == 0) goto L_0x0073
            com.taobao.tao.flexbox.layoutmanager.core.Component r2 = r1.K()
            boolean r2 = r2 instanceof tb.lkc
            if (r2 == 0) goto L_0x0073
            com.taobao.tao.flexbox.layoutmanager.core.n r2 = r10.Y()
            if (r2 == 0) goto L_0x0049
            com.taobao.tao.flexbox.layoutmanager.core.n r2 = r10.Y()
            java.lang.String r2 = r2.r0()
            java.lang.String r3 = "header"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0049
            r10 = 20
            r4 = 20
        L_0x0047:
            r5 = 0
            goto L_0x005a
        L_0x0049:
            r2 = 4
            com.taobao.tao.flexbox.layoutmanager.core.Component r3 = r1.K()     // Catch: Exception -> 0x0057
            tb.lkc r3 = (tb.lkc) r3     // Catch: Exception -> 0x0057
            int r10 = r3.getAdapterPosition(r10, r11)     // Catch: Exception -> 0x0057
            r5 = r10
            r4 = 4
            goto L_0x005a
        L_0x0057:
            r4 = 4
            goto L_0x0047
        L_0x005a:
            if (r5 < 0) goto L_0x0073
            r1.q1(r0)
            com.taobao.tao.flexbox.layoutmanager.core.Component r10 = r1.K()
            r3 = r10
            tb.lkc r3 = (tb.lkc) r3
            r6 = -1
            r7 = 0
            r8 = r11
            r3.updateListChangedEvent(r4, r5, r6, r7, r8)
            com.taobao.tao.flexbox.layoutmanager.core.n r10 = r1.L()
            r9.checkListItemChanged(r10, r1)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.Component.checkListItemChanged(com.taobao.tao.flexbox.layoutmanager.core.n, com.taobao.tao.flexbox.layoutmanager.core.n):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        if ((r3.d + r3.b) > r5.node.b.f.flexBoxNode.y()) goto L_0x0066;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkOverFlow() {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.flexbox.layoutmanager.core.Component.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "377bb8d1"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            P extends tb.jfw r2 = r5.viewParams
            com.facebook.yoga.YogaPositionType r2 = r2.z
            if (r2 != 0) goto L_0x00b3
            com.taobao.tao.flexbox.layoutmanager.core.n r2 = r5.node
            com.taobao.tao.flexbox.layoutmanager.core.n r2 = r2.b
            if (r2 == 0) goto L_0x00b3
            com.taobao.tao.flexbox.layoutmanager.core.Component r2 = r2.f
            if (r2 == 0) goto L_0x00b3
            boolean r2 = r5.ignoreClipCheck(r2)
            if (r2 != 0) goto L_0x00b3
            com.taobao.tao.flexbox.layoutmanager.core.n r2 = r5.node
            com.taobao.tao.flexbox.layoutmanager.core.n r2 = r2.b
            com.taobao.tao.flexbox.layoutmanager.core.Component r2 = r2.f
            tb.yk9 r2 = r2.flexBoxNode
            if (r2 == 0) goto L_0x00b3
            boolean r2 = tb.akt.s1()
            tb.rbi r3 = r5.measureResult
            int r4 = r3.c
            int r3 = r3.f27261a
            int r4 = r4 + r3
            float r3 = (float) r4
            com.taobao.tao.flexbox.layoutmanager.core.n r4 = r5.node
            com.taobao.tao.flexbox.layoutmanager.core.n r4 = r4.b
            com.taobao.tao.flexbox.layoutmanager.core.Component r4 = r4.f
            tb.yk9 r4 = r4.flexBoxNode
            float r4 = r4.z()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0066
            tb.rbi r3 = r5.measureResult
            int r4 = r3.d
            int r3 = r3.b
            int r4 = r4 + r3
            float r3 = (float) r4
            com.taobao.tao.flexbox.layoutmanager.core.n r4 = r5.node
            com.taobao.tao.flexbox.layoutmanager.core.n r4 = r4.b
            com.taobao.tao.flexbox.layoutmanager.core.Component r4 = r4.f
            tb.yk9 r4 = r4.flexBoxNode
            float r4 = r4.y()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
        L_0x0066:
            r0 = 1
        L_0x0067:
            if (r2 == 0) goto L_0x00b3
            if (r0 == 0) goto L_0x007d
            com.taobao.tao.flexbox.layoutmanager.core.n r0 = r5.node
            com.taobao.tao.flexbox.layoutmanager.core.n r0 = r0.b
            com.taobao.tao.flexbox.layoutmanager.core.Component r0 = r0.f
            tb.jfw r0 = r0.getViewParams()
            boolean r0 = r0.l()
            r5.setupClipStatus(r0)
            goto L_0x00b3
        L_0x007d:
            com.taobao.tao.flexbox.layoutmanager.core.n r0 = r5.node
            com.taobao.tao.flexbox.layoutmanager.core.n r0 = r0.b
            java.lang.String r2 = "clip-children"
            java.lang.Object r0 = r0.H(r2)
            boolean r0 = tb.nwv.o(r0, r1)
            if (r0 == 0) goto L_0x0096
            com.taobao.tao.flexbox.layoutmanager.core.n r0 = r5.node
            com.taobao.tao.flexbox.layoutmanager.core.n r0 = r0.b
            com.taobao.tao.flexbox.layoutmanager.core.Component r0 = r0.f
            r5.updateClipChild(r0, r1)
        L_0x0096:
            com.taobao.tao.flexbox.layoutmanager.core.n r0 = r5.node
            com.taobao.tao.flexbox.layoutmanager.core.n r0 = r0.b
            com.taobao.tao.flexbox.layoutmanager.core.n r0 = r0.b
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = r0.H(r2)
            boolean r0 = tb.nwv.o(r0, r1)
            if (r0 == 0) goto L_0x00b3
            com.taobao.tao.flexbox.layoutmanager.core.n r0 = r5.node
            com.taobao.tao.flexbox.layoutmanager.core.n r0 = r0.b
            com.taobao.tao.flexbox.layoutmanager.core.n r0 = r0.b
            com.taobao.tao.flexbox.layoutmanager.core.Component r0 = r0.f
            r5.updateClipChild(r0, r1)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.Component.checkOverFlow():void");
    }

    @Deprecated
    private void executeCreateAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d7b0ba", new Object[]{this});
            return;
        }
        qy0 O = this.node.O();
        if (O != null) {
            rbi rbiVar = this.measureResult;
            AnimatorSet f2 = hfs.f(this.node.P(), this.node.U(), O, hfs.f.b(rbiVar.f27261a, rbiVar.b, this.viewParams));
            if (f2 != null && !f2.getChildAnimations().isEmpty()) {
                f2.start();
            }
        }
    }

    private n findLongClickableParentNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("1c663642", new Object[]{this});
        }
        n nVar = this.node;
        do {
            nVar = nVar.Y();
            if (nVar != null) {
                if (nVar.H("onlongpress") != null) {
                    break;
                }
            } else {
                return null;
            }
        } while (nVar.H("enabled-drag") == null);
        return nVar;
    }

    private TNodeView findTNodeView(View view) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("2f0fe5e6", new Object[]{this, view});
        }
        while (true) {
            z = view instanceof TNodeView;
            if (z || view == null) {
                break;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                break;
            }
            view = (View) parent;
        }
        if (z) {
            return (TNodeView) view;
        }
        return null;
    }

    public static Map<String, com.taobao.tao.flexbox.layoutmanager.core.b> getBaseAttributeHandles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a96acf72", new Object[0]);
        }
        return attributeHandlers;
    }

    private String getString(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3aaaa176", new Object[]{this, obj});
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private boolean ignoreClipCheck(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e2d442", new Object[]{this, component})).booleanValue();
        }
        if ((component instanceof piw) || (component instanceof z5k) || (component instanceof ol4) || (component instanceof com.taobao.tao.flexbox.layoutmanager.component.e) || component.getNode().b == null || component.getViewParams().z == YogaPositionType.ABSOLUTE) {
            return true;
        }
        return false;
    }

    private void notifyRealLayoutChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458799a8", new Object[]{this});
        } else {
            notifyRealLayoutChange(-1, -1);
        }
    }

    private boolean overFlow(n nVar, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cace20ed", new Object[]{this, nVar, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        yk9 yk9Var = nVar.K().flexBoxNode;
        if (i2 + this.measureResult.f27261a > yk9Var.z() || i3 + this.measureResult.b > yk9Var.y()) {
            return true;
        }
        return false;
    }

    private void postOnViewDidLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca9090c", new Object[]{this});
            return;
        }
        String str = (String) this.node.H("onviewdidlayout");
        V v = this.view;
        if (v != null && str != null) {
            v.addOnLayoutChangeListener(new i(str));
        }
    }

    private void requestParentTouchDisallow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ab3848", new Object[]{this});
        } else if (akt.C() && getView() != null) {
            for (ViewParent parent = getView().getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
        r5 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
        if (ignoreClipCheck(r5) != false) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
        if (r2.f.getViewParams().l() != false) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
        updateClipChild(r2.f, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setupClipStatus(boolean r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.flexbox.layoutmanager.core.Component.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r5)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r4
            r5[r0] = r3
            java.lang.String r0 = "fc637cce"
            r2.ipc$dispatch(r0, r5)
            return
        L_0x001b:
            if (r5 == 0) goto L_0x0058
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r4.node
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r5.b
            java.lang.String r1 = "clip-children"
            java.lang.Object r5 = r5.H(r1)
            boolean r5 = tb.nwv.o(r5, r0)
            if (r5 == 0) goto L_0x0036
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r4.node
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r5.b
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r5.f
            r4.updateClipChild(r5, r0)
        L_0x0036:
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r4.node
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r5.b
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r5.b
            if (r5 == 0) goto L_0x00bc
            com.taobao.tao.flexbox.layoutmanager.core.Component r2 = r5.f
            if (r2 == 0) goto L_0x00bc
            java.lang.Object r5 = r5.H(r1)
            boolean r5 = tb.nwv.o(r5, r0)
            if (r5 == 0) goto L_0x00bc
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r4.node
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r5.b
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r5.b
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r5.f
            r4.updateClipChild(r5, r0)
            goto L_0x00bc
        L_0x0058:
            tb.rbi r5 = r4.measureResult
            int r0 = r5.c
            int r5 = r5.d
            com.taobao.tao.flexbox.layoutmanager.core.n r2 = r4.node
            com.taobao.tao.flexbox.layoutmanager.core.n r2 = r2.b
        L_0x0062:
            if (r2 == 0) goto L_0x009f
            com.taobao.tao.flexbox.layoutmanager.core.Component r3 = r2.f
            if (r3 == 0) goto L_0x009f
            boolean r3 = r4.ignoreClipCheck(r3)
            if (r3 != 0) goto L_0x009f
            boolean r3 = r4.overFlow(r2, r0, r5)
            if (r3 == 0) goto L_0x009f
            float r0 = (float) r0
            com.taobao.tao.flexbox.layoutmanager.core.Component r3 = r2.f
            tb.yk9 r3 = r3.flexBoxNode
            float r3 = r3.A()
            float r0 = r0 + r3
            int r0 = (int) r0
            float r5 = (float) r5
            com.taobao.tao.flexbox.layoutmanager.core.Component r3 = r2.f
            tb.yk9 r3 = r3.flexBoxNode
            float r3 = r3.B()
            float r5 = r5 + r3
            int r5 = (int) r5
            com.taobao.tao.flexbox.layoutmanager.core.Component r3 = r2.f
            tb.jfw r3 = r3.getViewParams()
            boolean r3 = r3.l()
            if (r3 != 0) goto L_0x009e
            com.taobao.tao.flexbox.layoutmanager.core.Component r3 = r2.f
            r4.updateClipChild(r3, r1)
            com.taobao.tao.flexbox.layoutmanager.core.n r2 = r2.b
            goto L_0x0062
        L_0x009e:
            return
        L_0x009f:
            if (r2 == 0) goto L_0x00bc
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r2.f
            if (r5 == 0) goto L_0x00bc
            boolean r5 = r4.ignoreClipCheck(r5)
            if (r5 != 0) goto L_0x00bc
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r2.f
            tb.jfw r5 = r5.getViewParams()
            boolean r5 = r5.l()
            if (r5 != 0) goto L_0x00bc
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r2.f
            r4.updateClipChild(r5, r1)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.Component.setupClipStatus(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateClipChild(Component component, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31507b13", new Object[]{this, component, new Boolean(z)});
        } else if (component != null && component.getViewParams().a0 != z) {
            component.getViewParams().a0 = z;
            com.taobao.tao.flexbox.layoutmanager.core.b.n.c(component, component.getView(), component.getViewParams(), null);
        }
    }

    private void updateShareElement(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6cf797", new Object[]{this, str});
        } else if (getTransitionView() != null) {
            getTransitionView().setTransitionName(str);
            getTransitionView().setId(str.hashCode());
            this.node.P().e0().g(this.node);
        }
    }

    public void addOrUpdateDrawable(boolean z, Drawable[] drawableArr, rbi rbiVar, n nVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8161a058", new Object[]{this, new Boolean(z), drawableArr, rbiVar, nVar, new Boolean(z2)});
        }
    }

    public void addOrUpdateView(boolean z, View view, rbi rbiVar, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f569c", new Object[]{this, new Boolean(z), view, rbiVar, nVar});
        } else if (this.view instanceof ViewGroup) {
            if (view.getParent() != null) {
                if (view.getParent() != this.view) {
                    ((ViewGroup) view.getParent()).removeView(view);
                } else {
                    return;
                }
            }
            ((ViewGroup) this.view).addView(view);
        }
    }

    public void applyAttrForView(V v, P p, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d615c488", new Object[]{this, v, p, map, new Boolean(z)});
        } else if (this.view != null && !this.attrInitInPrepare) {
            if (z || this.node.C0()) {
                onInitAttrs(this, this.view, this.viewParams, this.node.r);
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.core.b.f12204a.c(this, this.view, this.viewParams, this.node.r);
            handleUpdateAttributes(map);
        }
    }

    public void attachComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1e34bf", new Object[]{this});
            return;
        }
        if (this.view != null) {
            j jVar = this.currentHostViewComponentInfo;
            if (jVar == null) {
                jVar = getHostViewComponent();
            }
            if (!(jVar == null || jVar.f12191a == null)) {
                igs.a("addOrUpdateView:" + this.node.c.m);
                jVar.f12191a.addOrUpdateView(this.attached ^ true, this.view, jVar.b, this.node);
                igs.c();
            }
            n Y = this.node.Y();
            if (this.viewParams.Z && Y != null) {
                rbi rbiVar = this.measureResult;
                int i2 = rbiVar.f27261a;
                int i3 = rbiVar.b;
                for (int i4 = 0; i4 < ((ArrayList) this.node.d).size(); i4++) {
                    rbi S = ((n) ((ArrayList) this.node.d).get(i4)).S();
                    i2 = Math.max(i2, S.f27261a);
                    i3 = Math.max(i3, S.b);
                }
                if (this.measureResult.d + i3 > Y.S().b || this.measureResult.c + i2 > Y.S().f27261a) {
                    this.view.setVisibility(8);
                }
            }
        }
        this.attached = true;
    }

    public void calculateLayout(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281c58f7", new Object[]{this, new Float(f2), new Float(f3)});
        } else {
            this.flexBoxNode.s(f2, f3);
        }
    }

    public void cancelImageLoadTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855b433", new Object[]{this});
            return;
        }
        ImageLoader.f fVar = this.backgroundTask;
        if (fVar != null) {
            fVar.a();
        }
    }

    public void clearCacheSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89accc5d", new Object[]{this});
            return;
        }
        yk9 yk9Var = this.flexBoxNode;
        if (yk9Var != null) {
            yk9Var.u();
        }
    }

    public HashMap clickArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("16a46aef", new Object[]{this});
        }
        return null;
    }

    public boolean considerLayoutAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cd20c8c", new Object[]{this})).booleanValue();
        }
        return needAnimation();
    }

    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        onDetach();
        cancelImageLoadTask();
        cancelRunningAnimator();
        this.node.P().e0().o(this.node);
        V v = this.view;
        if (!(v == null || v.getParent() == null)) {
            ((ViewGroup) this.view.getParent()).removeView(this.view);
        }
        V v2 = this.view;
        if (v2 instanceof ViewGroup) {
            ((ViewGroup) v2).removeAllViews();
        }
        this.view = null;
        this.initRender = true;
        yk9 yk9Var = this.flexBoxNode;
        if (yk9Var != null) {
            yk9Var.J();
        }
        this.attached = false;
        this.node.P().K().c(this);
        Map<String, yzn> map = this.renderCompleteListeners;
        if (map != null) {
            map.clear();
            this.renderCompleteListeners = null;
        }
    }

    public P generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (P) ((jfw) ipChange.ipc$dispatch("c0ace32c", new Object[]{this}));
        }
        return (P) new jfw();
    }

    public Map<String, com.taobao.tao.flexbox.layoutmanager.core.b> getAttributeHandleMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("98d47bca", new Object[]{this});
        }
        return attributeHandlers;
    }

    public com.taobao.tao.flexbox.layoutmanager.core.b getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.b) ipChange.ipc$dispatch("d23a2ffb", new Object[]{this, str});
        }
        return getAttributeHandleMap().get(str);
    }

    public float getComponentAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e09f084e", new Object[]{this})).floatValue();
        }
        return this.componentAlpha;
    }

    public View.OnClickListener getComponentClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("5a9761c5", new Object[]{this});
        }
        return this.clickListener;
    }

    public <T> T getComponentInfo(bc4<T, ?> bc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bcfe29c", new Object[]{this, bc4Var});
        }
        return (T) ((ec4) bc4Var).b(this);
    }

    public View.OnTouchListener getComponentTouchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnTouchListener) ipChange.ipc$dispatch("9090f765", new Object[]{this});
        }
        return this.touchListener;
    }

    public CharSequence getContentDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("3a52ebfa", new Object[]{this});
        }
        return this.viewParams.X;
    }

    public yk9 getFlexBoxNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yk9) ipChange.ipc$dispatch("94894f29", new Object[]{this});
        }
        return this.flexBoxNode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
        r2.f12191a = r0.f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.tao.flexbox.layoutmanager.core.Component.j getHostViewComponent() {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.Component.getHostViewComponent():com.taobao.tao.flexbox.layoutmanager.core.Component$j");
    }

    public rbi getHostViewMeasureResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbi) ipChange.ipc$dispatch("a0edcc9c", new Object[]{this});
        }
        j jVar = this.currentHostViewComponentInfo;
        if (jVar != null) {
            return jVar.b;
        }
        return null;
    }

    public int getLayoutBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1870e365", new Object[]{this})).intValue();
        }
        int i2 = this.animationBottom;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getLayoutTop() + getLayoutHeight();
    }

    public int getLayoutHeight() {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d58ffc61", new Object[]{this})).intValue();
        }
        int i4 = this.animationHeight;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        int layoutTop = getLayoutTop();
        rbi rbiVar = this.measureResult;
        if (rbiVar != null) {
            i2 = rbiVar.b;
        } else {
            i2 = 0;
        }
        int i5 = i2 + layoutTop;
        int i6 = this.animationBottom;
        if (i6 != Integer.MIN_VALUE) {
            i5 = i6;
        } else {
            j jVar = this.currentHostViewComponentInfo;
            if (jVar != null) {
                i3 = jVar.b.d;
            } else {
                i3 = 0;
            }
            int i7 = this.animationTop;
            if ((i7 == Integer.MIN_VALUE || (i7 <= i3 && !fixWidthHeightTransition)) && jVar != null) {
                rbi rbiVar2 = jVar.b;
                i5 = rbiVar2.d + rbiVar2.b;
            }
        }
        int i8 = i5 - layoutTop;
        if (i8 < 0) {
            return 0;
        }
        return i8;
    }

    public int getLayoutLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b72b41", new Object[]{this})).intValue();
        }
        int i2 = this.animationLeft;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        j jVar = this.currentHostViewComponentInfo;
        if (jVar != null) {
            return jVar.b.c;
        }
        return 0;
    }

    public int getLayoutRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b96be56", new Object[]{this})).intValue();
        }
        int i2 = this.animationRight;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getLayoutLeft() + getLayoutWidth();
    }

    public int getLayoutTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("876ae90f", new Object[]{this})).intValue();
        }
        int i2 = this.animationTop;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        j jVar = this.currentHostViewComponentInfo;
        if (jVar != null) {
            return jVar.b.d;
        }
        return 0;
    }

    public int getLayoutWidth() {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a60b4500", new Object[]{this})).intValue();
        }
        int i4 = this.animationWidth;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        int layoutLeft = getLayoutLeft();
        rbi rbiVar = this.measureResult;
        if (rbiVar != null) {
            i2 = rbiVar.f27261a;
        } else {
            i2 = 0;
        }
        int i5 = i2 + layoutLeft;
        int i6 = this.animationRight;
        if (i6 != Integer.MIN_VALUE) {
            i5 = i6;
        } else {
            j jVar = this.currentHostViewComponentInfo;
            if (jVar != null) {
                i3 = jVar.b.c;
            } else {
                i3 = 0;
            }
            int i7 = this.animationLeft;
            if ((i7 == Integer.MIN_VALUE || (i7 <= i3 && !fixWidthHeightTransition)) && jVar != null) {
                rbi rbiVar2 = jVar.b;
                i5 = rbiVar2.c + rbiVar2.f27261a;
            }
        }
        int i8 = i5 - layoutLeft;
        if (i8 < 0) {
            return 0;
        }
        return i8;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.e
    public rbi getMeasureResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbi) ipChange.ipc$dispatch("696e1489", new Object[]{this});
        }
        return this.measureResult;
    }

    public n getNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("6c6e1b01", new Object[]{this});
        }
        return this.node;
    }

    public e0o getRenderIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e0o) ipChange.ipc$dispatch("e4ef8073", new Object[]{this});
        }
        TNodeView findTNodeView = findTNodeView(this.view);
        if (findTNodeView != null) {
            return findTNodeView.getRenderIntercept();
        }
        return null;
    }

    public k getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("c0d56852", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.e
    public n getTNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("45ec8f69", new Object[]{this});
        }
        return this.node;
    }

    public View getTransitionView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("23b99399", new Object[]{this});
        }
        return this.view;
    }

    public V getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ((View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}));
        }
        return this.view;
    }

    public P getViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (P) ((jfw) ipChange.ipc$dispatch("eecacf6b", new Object[]{this}));
        }
        return this.viewParams;
    }

    public void handleChildAdded(n nVar, int i2, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c190288e", new Object[]{this, nVar, new Integer(i2), nVar2});
        } else {
            checkListItemChanged(nVar, nVar2);
        }
    }

    public void handleChildChanged(n nVar, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8ce547", new Object[]{this, nVar, nVar2});
        } else {
            checkListItemChanged(nVar, nVar2);
        }
    }

    public void handleChildDeleted(n nVar, int i2, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2e1a55", new Object[]{this, nVar, new Integer(i2), nVar2});
            return;
        }
        checkListItemChanged(nVar, nVar2);
        HashMap hashMap = new HashMap();
        hashMap.put("type", "delete");
        sendMessage(MSG_FLAG_DISAPPEAR, nVar2, "onwilldisappear", null, hashMap, null);
        sendMessage(MSG_FLAG_DISAPPEAR, nVar2, "ondestroy", null, hashMap, null);
    }

    public void handleChildMoved(n nVar, int i2, int i3, n nVar2) {
        Component component;
        yk9 yk9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d053a6", new Object[]{this, nVar, new Integer(i2), new Integer(i3), nVar2});
            return;
        }
        if (!(nVar2 == null || (component = nVar2.f) == null || (yk9Var = component.flexBoxNode) == null)) {
            yk9Var.I(i2, i3);
        }
        if (!akt.d0()) {
            sortChildren();
        }
        checkListItemChanged(nVar, nVar2);
    }

    public void handleUpdateAttributes(Map map) {
        com.taobao.tao.flexbox.layoutmanager.core.b attributeHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30809d6", new Object[]{this, map});
        } else if (map != null) {
            ArrayList arrayList = null;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!str.equals("width") && !str.equals("height") && (attributeHandler = getAttributeHandler(str)) != null) {
                    if (attributeHandler.g() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(attributeHandler)) {
                            onUpdateAttribute(attributeHandler, str, entry.getValue(), this.node.r);
                            arrayList.add(attributeHandler);
                        }
                    } else {
                        onUpdateAttribute(attributeHandler, str, entry.getValue(), this.node.r);
                    }
                }
            }
        }
    }

    public boolean hasComponentClickTouchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("995d26d9", new Object[]{this})).booleanValue();
        }
        if (this.longClickListener == null && this.clickListener == null && this.touchListener == null) {
            return false;
        }
        return true;
    }

    public boolean interceptVNodeDiff(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7f54970", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    public boolean isAttached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f518279", new Object[]{this})).booleanValue();
        }
        return this.attached;
    }

    public boolean isDoubleClickSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a243ded", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final boolean isLayoutKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aad6520", new Object[]{this, str})).booleanValue();
        }
        com.taobao.tao.flexbox.layoutmanager.core.b attributeHandler = getAttributeHandler(str);
        if ((attributeHandler == null || !attributeHandler.h()) && !com.taobao.tao.flexbox.layoutmanager.core.h.g(str)) {
            return false;
        }
        return true;
    }

    public boolean isTransitionChildComponent(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c87ac28", new Object[]{this, component})).booleanValue();
        }
        View view = component.getView();
        if (view == null || view.getParent() != this.view) {
            return false;
        }
        return true;
    }

    public HashMap longClickArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3bdeccd3", new Object[]{this});
        }
        return null;
    }

    public boolean needAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe5c0919", new Object[]{this})).booleanValue();
        }
        n.f fVar = this.node.r;
        if (fVar == null || !fVar.e) {
            return false;
        }
        return true;
    }

    public boolean needApplyAttrForComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e11fa968", new Object[]{this})).booleanValue();
        }
        if (!this.attached || this.initRender || this.node.F0() || this.node.C0() || (this instanceof ol4) || (this instanceof yhe)) {
            return true;
        }
        return false;
    }

    public boolean needUpdateViewParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffaabeb4", new Object[]{this})).booleanValue();
        }
        HashMap<String, Object> s0 = this.node.s0();
        if ((s0 == null || s0.isEmpty()) && !this.node.C0()) {
            return false;
        }
        return true;
    }

    public <T> void notifyComponentInfoChange(bc4<T, ?> bc4Var, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602b51af", new Object[]{this, bc4Var, t});
            return;
        }
        String I = nwv.I(getNode().H("id"), null);
        if (!TextUtils.isEmpty(I)) {
            getNode().P().K().a(this, I, bc4Var, t);
        }
    }

    public boolean onAfterAddToLayoutTree(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d5828a", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    public void onAttach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f7278b", new Object[]{this});
        } else {
            attachComponent();
        }
    }

    public void onAttachComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e92464", new Object[]{this});
        }
    }

    public boolean onBeforeAddToLayoutTree() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51812d71", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void onBindEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89486ec5", new Object[]{this});
        } else {
            bindEvent();
        }
    }

    public void onChildLayoutChanged(Component component, int i2, int i3, int i4, int i5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bb51d", new Object[]{this, component, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z)});
        }
    }

    public void onCreate(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa30cd0", new Object[]{this, nVar});
            return;
        }
        this.node = nVar;
        nVar.S0();
    }

    public YogaMeasureFunction onCreateMeasureFunction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaMeasureFunction) ipChange.ipc$dispatch("622da8f1", new Object[]{this});
        }
        return null;
    }

    public abstract V onCreateView(Context context);

    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        }
    }

    public void onInitAttrs(com.taobao.tao.flexbox.layoutmanager.core.e eVar, V v, P p, n.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d14f29", new Object[]{this, eVar, v, p, fVar});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.b.f12204a.c(eVar, v, p, fVar);
        com.taobao.tao.flexbox.layoutmanager.core.b.d.c(eVar, v, p, fVar);
        com.taobao.tao.flexbox.layoutmanager.core.b.e.c(eVar, v, p, fVar);
        com.taobao.tao.flexbox.layoutmanager.core.b.f.c(eVar, v, p, fVar);
        com.taobao.tao.flexbox.layoutmanager.core.b.h.c(eVar, v, p, fVar);
        com.taobao.tao.flexbox.layoutmanager.core.b.j.c(eVar, v, p, fVar);
        com.taobao.tao.flexbox.layoutmanager.core.b.i.c(eVar, v, p, fVar);
        com.taobao.tao.flexbox.layoutmanager.core.b.l.c(eVar, v, p, fVar);
        com.taobao.tao.flexbox.layoutmanager.core.b.k.c(eVar, v, p, fVar);
        com.taobao.tao.flexbox.layoutmanager.core.b.m.c(eVar, v, p, fVar);
        com.taobao.tao.flexbox.layoutmanager.core.b.n.c(eVar, v, p, fVar);
        com.taobao.tao.flexbox.layoutmanager.core.b.o.c(eVar, v, p, fVar);
        com.taobao.tao.flexbox.layoutmanager.core.b.y.c(eVar, v, p, fVar);
        com.taobao.tao.flexbox.layoutmanager.core.b.A.c(eVar, v, p, fVar);
        if (!(p.k0 == 0.0f && p.l0 == 0.0f)) {
            com.taobao.tao.flexbox.layoutmanager.core.b.p.c(eVar, v, p, fVar);
        }
        if (p.m0 != 0.0f) {
            com.taobao.tao.flexbox.layoutmanager.core.b.s.c(eVar, v, p, fVar);
        }
        if (p.n0 != 0.0f) {
            com.taobao.tao.flexbox.layoutmanager.core.b.t.c(eVar, v, p, fVar);
        }
        if (p.o0 != 0.0f) {
            com.taobao.tao.flexbox.layoutmanager.core.b.u.c(eVar, v, p, fVar);
        }
        if (p.p0 != 1.0f || p.q0 != 1.0f) {
            com.taobao.tao.flexbox.layoutmanager.core.b.v.c(eVar, v, p, fVar);
        }
    }

    public void onLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6839f0", new Object[]{this});
            return;
        }
        if (this.viewParams == null) {
            igs.a("onLayout");
            P generateViewParams = generateViewParams();
            this.viewParams = generateViewParams;
            generateViewParams.E(this.node);
            HashMap I = this.node.I();
            this.viewParams.B(this.node.N(), I);
            if (akt.P()) {
                this.node.B1(I);
            }
            if (!(this.node.P() == null || this.node.P().P() == null || this.node.Y() != null)) {
                le8 P = this.node.P().P();
                P.c(this.viewParams.h0);
                P.e(this.viewParams.i0);
            }
            igs.c();
        } else {
            igs.a("parseViewParams");
            if (needUpdateViewParam()) {
                this.viewParams.B(this.node.N(), this.node.I());
            }
            igs.c();
        }
        if (!(this instanceof piw)) {
            igs.a("setup flexBoxNode");
            if (this.flexBoxNode == null) {
                this.flexBoxNode = yk9.v(this);
            }
            if (this.flexBoxNode.G()) {
                this.flexBoxNode.F();
                this.flexBoxNode.P(onCreateMeasureFunction());
                this.flexBoxNode.p();
            } else {
                if (this.node.D0()) {
                    this.flexBoxNode.H();
                }
                if (this.node.Y() != null && this.node.Y().D0() && akt.u0()) {
                    this.flexBoxNode.H();
                }
                if (this.node.C0()) {
                    this.flexBoxNode.p();
                } else {
                    HashMap<String, Object> s0 = this.node.s0();
                    if (s0 != null) {
                        for (Map.Entry<String, Object> entry : s0.entrySet()) {
                            this.flexBoxNode.q(entry.getKey());
                        }
                    }
                }
            }
            if (!onBeforeAddToLayoutTree()) {
                onAfterAddToLayoutTree(this.flexBoxNode.n());
            }
            igs.c();
        }
    }

    public void onLayoutChanged(int i2, int i3, int i4, int i5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z)});
        } else if (this.node.Y() != null && this.node.Y().K() != null) {
            this.node.Y().K().onChildLayoutChanged(this, i2, i3, i4, i5, z);
        }
    }

    public void onLayoutComplete() {
        boolean z;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        rbi rbiVar = this.measureResult;
        if (rbiVar == null) {
            this.measureResult = new rbi();
            i3 = 0;
            i2 = 0;
            z = true;
        } else {
            i3 = rbiVar.f27261a;
            i2 = rbiVar.b;
            z = false;
        }
        yk9 yk9Var = this.flexBoxNode;
        if (yk9Var != null) {
            this.measureResult.a((int) yk9Var.z(), (int) this.flexBoxNode.y(), (int) this.flexBoxNode.A(), (int) this.flexBoxNode.B());
            checkOverFlow();
            if (q.w(this.node)) {
                this.flexBoxNode.J();
            }
        }
        rbi rbiVar2 = this.measureResult;
        int i4 = rbiVar2.f27261a;
        if (!(i3 == i4 && i2 == rbiVar2.b)) {
            onLayoutChanged(i3, i2, i4, rbiVar2.b, z);
        }
        rbi rbiVar3 = this.measureResult;
        notifyRealLayoutChange(rbiVar3.f27261a, rbiVar3.b);
    }

    public void onLayoutTreeBuilt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4163a9e", new Object[]{this});
        }
    }

    public void onPatchCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2dd229", new Object[]{this});
        }
    }

    public boolean onPrepareComponent(Context context) {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f0f990", new Object[]{this, context})).booleanValue();
        }
        if (this.view != null || (v = this.prepareView) != null) {
            return false;
        }
        if (v == null) {
            V onCreateView = onCreateView(context);
            this.prepareView = onCreateView;
            if (onCreateView != null) {
                onInitAttrs(this, onCreateView, this.viewParams, null);
                this.attrInitInPrepare = true;
            }
        }
        if (this.prepareView != null) {
            return true;
        }
        return false;
    }

    public void onRealLayoutChanged(int i2, int i3, int i4, int i5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa37c980", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z)});
        } else if (i3 != i5) {
            notifyComponentInfoChange(ComponentInfoDef.HEIGHT, Integer.valueOf(i5));
        }
    }

    public void onRenderCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751666fd", new Object[]{this});
            return;
        }
        Map<String, yzn> map = this.renderCompleteListeners;
        if (map != null) {
            for (Map.Entry<String, yzn> entry : map.entrySet()) {
                entry.getValue().a(this.node, this);
            }
        }
    }

    public void onSaveInstanceState(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbed9be", new Object[]{this, map});
        }
    }

    public boolean onUpdateAttribute(com.taobao.tao.flexbox.layoutmanager.core.b bVar, String str, Object obj, n.f fVar) {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec789dae", new Object[]{this, bVar, str, obj, fVar})).booleanValue();
        }
        if (bVar == null || (v = this.view) == null) {
            return false;
        }
        bVar.c(this, v, this.viewParams, this.node.r);
        return true;
    }

    public void onUpdateLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c9fc59", new Object[]{this});
        } else {
            attachComponent();
        }
    }

    public void onViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
        }
    }

    public void parseViewParams(HashMap hashMap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95dd246e", new Object[]{this, hashMap});
            return;
        }
        if (this.viewParams == null) {
            P generateViewParams = generateViewParams();
            this.viewParams = generateViewParams;
            generateViewParams.E(this.node);
        }
        StringBuilder sb = new StringBuilder("parseViewParams:");
        r rVar = this.node.c;
        if (rVar != null) {
            str = rVar.m;
        } else {
            str = "null";
        }
        sb.append(str);
        igs.a(sb.toString());
        this.viewParams.B(this.node.f12238a.f12269a, hashMap);
        igs.c();
    }

    public j peekHostViewComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("ede3b31d", new Object[]{this});
        }
        return this.currentHostViewComponentInfo;
    }

    public void postMessage(n nVar, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a91a7a1", new Object[]{this, nVar, str, str2, map, hk8Var});
        } else {
            this.node.P().M0(0, nVar, str, str2, map, hk8Var);
        }
    }

    public <T, Observer extends bc4.a<T>> T registerComponentInfoChangeObserver(String str, bc4<T, Observer> bc4Var, Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bbd9deaf", new Object[]{this, str, bc4Var, observer});
        }
        return (T) getNode().P().K().b(this, str, bc4Var, observer);
    }

    public void registerRenderCompleteListener(String str, yzn yznVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b6f4769", new Object[]{this, str, yznVar});
            return;
        }
        if (this.renderCompleteListeners == null) {
            this.renderCompleteListeners = new HashMap();
        }
        if (!this.renderCompleteListeners.containsKey(str)) {
            this.renderCompleteListeners.put(str, yznVar);
        }
    }

    public <T, Observer extends bc4.a<T>> void removeComponentInfoChangeObserver(String str, bc4<T, Observer> bc4Var, bc4.a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add31284", new Object[]{this, str, bc4Var, aVar});
        } else {
            getNode().P().K().d(this, str, bc4Var, aVar);
        }
    }

    public void removeDrawable(Drawable[] drawableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398d4010", new Object[]{this, drawableArr});
        }
    }

    public void removePerformClickCallback() {
        Method a2;
        if (this.view != null && (a2 = ytn.a("removePerformClickCallback", View.class)) != null) {
            try {
                a2.invoke(this.view, new Object[0]);
            } catch (IllegalAccessException e2) {
                tfs.d("failed to removePerformClick" + e2.getMessage());
            } catch (InvocationTargetException e3) {
                tfs.d("failed to removePerformClick" + e3.getMessage());
            }
        }
    }

    public void resetAnimationBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44df2607", new Object[]{this});
        } else {
            this.animationBottom = Integer.MIN_VALUE;
        }
    }

    public void resetAnimationHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe3f03", new Object[]{this});
        } else {
            this.animationHeight = Integer.MIN_VALUE;
        }
    }

    public void resetAnimationLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8f0f23", new Object[]{this});
        } else {
            this.animationLeft = Integer.MIN_VALUE;
        }
    }

    public void resetAnimationRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bb552e", new Object[]{this});
        } else {
            this.animationRight = Integer.MIN_VALUE;
        }
    }

    public void resetAnimationTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ccb6a7", new Object[]{this});
        } else {
            this.animationTop = Integer.MIN_VALUE;
        }
    }

    public void resetAnimationWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e2fdbd8", new Object[]{this});
        } else {
            this.animationWidth = Integer.MIN_VALUE;
        }
    }

    public void sendMessage(n nVar, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b26bee89", new Object[]{this, nVar, str, str2, map, hk8Var});
        } else {
            this.node.P().o1(0, nVar, str, str2, map, hk8Var);
        }
    }

    public boolean sendViewAppearForAdd(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6a1a1f5", new Object[]{this, nVar})).booleanValue();
        }
        return true;
    }

    public void setAnimationBottom(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6656f", new Object[]{this, new Integer(i2)});
            return;
        }
        this.animationBottom = i2;
        V v = this.view;
        if (v != null) {
            v.requestLayout();
        }
        notifyRealLayoutChange();
    }

    public void setAnimationHeight(int i2) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3aa6bf3", new Object[]{this, new Integer(i2)});
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        this.animationHeight = i2;
        V v = this.view;
        if (!(v == null || (layoutParams = v.getLayoutParams()) == null)) {
            layoutParams.height = i2;
            this.view.setLayoutParams(layoutParams);
        }
        notifyRealLayoutChange();
    }

    public void setAnimationLeft(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97a6893", new Object[]{this, new Integer(i2)});
            return;
        }
        this.animationLeft = i2;
        V v = this.view;
        if (v != null) {
            v.requestLayout();
        }
        notifyRealLayoutChange();
    }

    public void setAnimationRight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56cada2", new Object[]{this, new Integer(i2)});
            return;
        }
        this.animationRight = i2;
        V v = this.view;
        if (v != null) {
            v.requestLayout();
        }
        notifyRealLayoutChange();
    }

    public void setAnimationTop(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e49a89", new Object[]{this, new Integer(i2)});
            return;
        }
        this.animationTop = i2;
        V v = this.view;
        if (v != null) {
            v.requestLayout();
        }
        notifyRealLayoutChange();
    }

    public void setAnimationWidth(int i2) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c988fc38", new Object[]{this, new Integer(i2)});
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        this.animationWidth = i2;
        V v = this.view;
        if (!(v == null || (layoutParams = v.getLayoutParams()) == null)) {
            layoutParams.width = i2;
            this.view.setLayoutParams(layoutParams);
        }
        notifyRealLayoutChange();
    }

    public n setAttributes(Map<String, Object> map, Map map2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("4cf532c2", new Object[]{this, map, map2});
        }
        if (map != null) {
            n L = this.node.L();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                boolean g1 = this.node.g1(entry.getKey(), entry.getValue());
                z |= g1;
                if (g1) {
                    this.node.f.updateNeedLayoutOrRender(entry.getKey());
                }
            }
            if (z) {
                handleChildChanged(L, this.node);
                return L;
            }
        }
        return null;
    }

    public void setBackgroundTask(ImageLoader.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0f1ea4", new Object[]{this, fVar});
        } else {
            this.backgroundTask = fVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        r2 = r2.getForeground();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean setComponentAlpha(boolean r7, float r8, java.util.List<com.taobao.tao.flexbox.layoutmanager.core.n> r9) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.Component.setComponentAlpha(boolean, float, java.util.List):boolean");
    }

    public void setComponentClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c740bd1", new Object[]{this, onClickListener});
        } else {
            this.clickListener = onClickListener;
        }
    }

    public void setHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i2)});
        } else if (this.view != null) {
            rbi rbiVar = this.measureResult;
            if (rbiVar.b != i2) {
                rbiVar.b = i2;
                if (!((ArrayList) this.node.d).isEmpty()) {
                    rbi rbiVar2 = this.measureResult;
                    int i3 = rbiVar2.c;
                    int i4 = rbiVar2.d;
                    this.node.M0(rbiVar2.f27261a, rbiVar2.b);
                    rbi rbiVar3 = this.measureResult;
                    rbiVar3.c = i3;
                    rbiVar3.d = i4;
                }
                this.node.b1(this.view.getContext());
            }
        }
    }

    public void setWidth(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i2)});
        } else if (this.view != null) {
            rbi rbiVar = this.measureResult;
            if (rbiVar.f27261a != i2) {
                rbiVar.f27261a = i2;
                if (!((ArrayList) this.node.d).isEmpty()) {
                    rbi rbiVar2 = this.measureResult;
                    int i3 = rbiVar2.c;
                    int i4 = rbiVar2.d;
                    this.node.M0(rbiVar2.f27261a, rbiVar2.b);
                    rbi rbiVar3 = this.measureResult;
                    rbiVar3.c = i3;
                    rbiVar3.d = i4;
                }
                this.node.b1(this.view.getContext());
            }
        }
    }

    public void sortChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a97c4", new Object[]{this});
        }
    }

    public void updateAPMToken(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcfe6c11", new Object[]{this, view, str});
        } else if (view == null) {
        } else {
            if (this.viewParams.t0) {
                view.setTag(dgw.APM_VIEW_TOKEN, str);
            } else {
                view.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
            }
        }
    }

    public void updateClickListener() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b6f1a", new Object[]{this});
            return;
        }
        float f2 = this.viewParams.T;
        if (this.view != null) {
            View.OnClickListener componentClickListener = getComponentClickListener();
            View.OnTouchListener componentTouchListener = getComponentTouchListener();
            if (componentTouchListener != null) {
                V v = this.view;
                if (f2 == 0.0f) {
                    componentTouchListener = null;
                }
                ViewProxy.setOnTouchListener(v, componentTouchListener);
            } else if (componentClickListener != null) {
                V v2 = this.view;
                int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i2 == 0) {
                    componentClickListener = null;
                }
                ViewProxy.setOnClickListener(v2, componentClickListener);
                V v3 = this.view;
                if (i2 != 0) {
                    z = true;
                }
                v3.setClickable(z);
            }
        }
    }

    public void updateNeedLayoutOrRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea683293", new Object[]{this, str});
        } else if (isLayoutKey(str)) {
            this.node.r1();
        } else {
            this.node.q1(false);
        }
    }

    private void notifyRealLayoutChange(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2163008", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        if (i2 < 0) {
            i2 = getLayoutWidth();
        }
        if (i3 < 0) {
            i3 = getLayoutHeight();
        }
        int i4 = this.preRealWidth;
        if (i4 != i2 || this.preRealHeight != i3) {
            if (this.isFirstTime && i4 == 0 && this.preRealHeight == 0) {
                this.isFirstTime = false;
            }
            onRealLayoutChanged(i4, this.preRealHeight, i2, i3, this.isFirstTime);
            this.preRealWidth = i2;
            this.preRealHeight = i3;
        }
    }

    public void bindEvent() {
        n findLongClickableParentNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56398a64", new Object[]{this});
            return;
        }
        V v = this.view;
        if (v != null) {
            if (!this.viewParams.W) {
                ViewProxy.setOnClickListener(v, null);
                this.view.setClickable(false);
                ViewProxy.setOnTouchListener(this.view, null);
                this.clickListener = null;
                this.longClickListener = null;
                this.touchListener = null;
                return;
            }
            Object H = this.node.H("ondblclick");
            if (H != null) {
                if (isDoubleClickSupport()) {
                    b bVar = new b(this, new GestureDetector(this.node.N(), new a(H)));
                    this.touchListener = bVar;
                    ViewProxy.setOnTouchListener(this.view, bVar);
                } else {
                    tfs.d("组件" + this.node.r0() + "配置了ondblclick消息, 但是组件本身不支持该事件");
                }
            }
            Object H2 = this.node.H("onclick");
            if (H2 != null) {
                c cVar = new c(H2);
                this.clickListener = cVar;
                if (this.touchListener == null) {
                    ViewProxy.setOnClickListener(this.view, cVar);
                }
            } else {
                ViewProxy.setOnClickListener(this.view, null);
                this.view.setClickable(false);
                this.clickListener = null;
            }
            Object H3 = this.node.H("onlongpress");
            if (H3 != null) {
                d dVar = new d(H3);
                this.longClickListener = dVar;
                if (this.touchListener == null) {
                    ViewProxy.setOnLongClickListener(this.view, dVar);
                }
            } else if (nwv.o(this.node.H("enabled-drag"), false)) {
                e eVar = new e();
                this.longClickListener = eVar;
                if (this.touchListener == null) {
                    ViewProxy.setOnLongClickListener(this.view, eVar);
                }
            } else if (H2 == null || (findLongClickableParentNode = findLongClickableParentNode()) == null) {
                ViewProxy.setOnLongClickListener(this.view, null);
                this.view.setLongClickable(false);
                this.longClickListener = null;
                if (akt.D0() && !(this instanceof skg) && this.touchListener == null && H2 != null) {
                    h hVar = new h(this, new GestureDetector(this.node.N(), new g()));
                    this.touchListener = hVar;
                    ViewProxy.setOnTouchListener(this.view, hVar);
                }
            } else {
                f fVar = new f(findLongClickableParentNode);
                this.longClickListener = fVar;
                if (this.touchListener == null) {
                    ViewProxy.setOnLongClickListener(this.view, fVar);
                }
            }
            if (H2 == null) {
                ViewProxy.setOnClickListener(this.view, null);
                this.view.setClickable(false);
                this.clickListener = null;
            }
        }
    }

    public void postMessage(int i2, n nVar, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50d9fda", new Object[]{this, new Integer(i2), nVar, str, str2, map, hk8Var});
        } else {
            this.node.P().M0(i2, nVar, str, str2, map, hk8Var);
        }
    }

    public void sendMessage(int i2, n nVar, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("887c35f2", new Object[]{this, new Integer(i2), nVar, str, str2, map, hk8Var});
        } else {
            this.node.P().o1(i2, nVar, str, str2, map, hk8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12187a;

        public f(n nVar) {
            this.f12187a = nVar;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            View.OnLongClickListener onLongClickListener;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            HashMap hashMap = null;
            String I = nwv.I(this.f12187a.H("onlongpress"), null);
            if (I != null) {
                Component.access$100(Component.this);
                if (this.f12187a.K() != null) {
                    hashMap = this.f12187a.K().longClickArgs();
                }
                Component.this.sendMessage(this.f12187a, "onlongpress", I, hashMap, null);
            } else if (nwv.o(this.f12187a.H("enabled-drag"), false) && (onLongClickListener = (View.OnLongClickListener) this.f12187a.m0(2)) != null) {
                onLongClickListener.onLongClick(this.f12187a.w0());
            }
            return true;
        }
    }

    private void executeShareElementAnimation() {
        reu transitionInfo;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767dacf9", new Object[]{this});
        } else if (this.view != null && this.node.P().u0()) {
            if (this.viewParams.e0) {
                this.view.setTransitionName(SELF_TRANSITION_NAME);
            }
            Object W = getNode().P().W();
            if (W instanceof anl) {
                anl anlVar = (anl) W;
                if (!anlVar.isEnterTransitionExecuted() && (transitionInfo = anlVar.getTransitionInfo()) != null && transitionInfo.e != null) {
                    int i2 = 0;
                    boolean z2 = false;
                    while (true) {
                        if (i2 >= transitionInfo.e.size()) {
                            z = z2;
                            break;
                        }
                        Map z3 = nwv.z(transitionInfo.e.get(i2), null);
                        boolean z4 = z3.size() == 1;
                        if (nwv.o(z3.get(reu.MATCH_TAG), false)) {
                            z = true;
                            break;
                        }
                        for (Map.Entry entry : z3.entrySet()) {
                            if (entry.getValue() != null && ((String) entry.getValue()).equals(getNode().H((String) entry.getKey()))) {
                                updateShareElement((String) entry.getValue());
                                z2 = true;
                            }
                        }
                        if (z4 && z2) {
                            z3.put(reu.MATCH_TAG, Boolean.TRUE);
                        }
                        i2++;
                    }
                }
            }
            if (!(z || nwv.T(this.viewParams.d0))) {
                updateShareElement(this.viewParams.d0);
            }
        }
    }

    public boolean invoke(d.j jVar, String str, JSONObject jSONObject, d.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f789b95", new Object[]{this, jVar, str, jSONObject, kVar})).booleanValue();
        }
        str.hashCode();
        if (!str.equals("setToFront")) {
            return false;
        }
        if (this.view != null) {
            if (this.node.Y() == null || !(this.node.Y().K() instanceof ejg)) {
                this.view.setZ(1.0f);
            } else {
                ((ejg) this.node.Y().K()).e(this.node);
            }
        }
        return true;
    }

    public void onRender(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6dc40ec", new Object[]{this, context});
            return;
        }
        if (this.view == null) {
            try {
                igs.a("onCreateView:" + this.node.c.m);
                V v = this.prepareView;
                if (v != null) {
                    this.view = v;
                    this.prepareView = null;
                } else {
                    this.view = onCreateView(context);
                }
                V v2 = this.view;
                if (v2 != null) {
                    v2.setTag(R.id.layout_manager_tnode, this.node);
                }
                postOnViewDidLayout();
                onViewCreated();
                String str = (String) this.node.H("oncreate");
                boolean B0 = this.node.B0();
                if (str != null && !B0) {
                    sendMessage(this.node, "oncreate", str, null, null);
                }
                executeCreateAnimation();
                executeShareElementAnimation();
                igs.c();
            } catch (Exception e2) {
                igs.c();
                tfs.e("TNode", e2.getMessage());
            }
        }
        if (this.view != null) {
            j jVar = this.currentHostViewComponentInfo;
            j hostViewComponent = getHostViewComponent();
            if (!(hostViewComponent == null || jVar == null || !hostViewComponent.b.equals(jVar.b))) {
                z = false;
            }
            this.currentHostViewComponentInfo = hostViewComponent;
            if (this.initRender) {
                igs.a("firstRender:" + this.node.c.m);
                onBindEvent();
                igs.c();
            }
            if (z || needApplyAttrForComponent()) {
                igs.a("applyAttrForView:" + this.node.c.m);
                applyAttrForView(this.view, this.viewParams, this.node.s0(), this.initRender);
                igs.c();
            }
            this.initRender = false;
        }
        igs.a("onAttach:" + this.node.c.m);
        if (!this.attached) {
            onAttach();
            onAttachComplete();
        } else if (z) {
            onUpdateLayout();
        }
        this.attrInitInPrepare = false;
        igs.c();
    }

    static {
        t2o.a(503317013);
        t2o.a(503317029);
        t2o.a(503316979);
        HashMap hashMap = new HashMap();
        attributeHandlers = hashMap;
        hashMap.put("width", com.taobao.tao.flexbox.layoutmanager.core.b.b);
        attributeHandlers.put("height", com.taobao.tao.flexbox.layoutmanager.core.b.c);
        Map<String, com.taobao.tao.flexbox.layoutmanager.core.b> map = attributeHandlers;
        com.taobao.tao.flexbox.layoutmanager.core.b bVar = com.taobao.tao.flexbox.layoutmanager.core.b.d;
        map.put("padding", bVar);
        attributeHandlers.put(pg1.ATOM_EXT_UDL_padding_left, bVar);
        attributeHandlers.put(pg1.ATOM_EXT_UDL_padding_top, bVar);
        attributeHandlers.put(pg1.ATOM_EXT_UDL_padding_right, bVar);
        attributeHandlers.put(pg1.ATOM_EXT_UDL_padding_bottom, bVar);
        Map<String, com.taobao.tao.flexbox.layoutmanager.core.b> map2 = attributeHandlers;
        com.taobao.tao.flexbox.layoutmanager.core.b bVar2 = com.taobao.tao.flexbox.layoutmanager.core.b.e;
        map2.put(pg1.ATOM_EXT_UDL_background_color, bVar2);
        attributeHandlers.put(pg1.ATOM_EXT_UDL_background_image, bVar2);
        attributeHandlers.put("background", bVar2);
        Map<String, com.taobao.tao.flexbox.layoutmanager.core.b> map3 = attributeHandlers;
        com.taobao.tao.flexbox.layoutmanager.core.b bVar3 = com.taobao.tao.flexbox.layoutmanager.core.b.g;
        map3.put(pg1.ATOM_EXT_UDL_border_color, bVar3);
        attributeHandlers.put(pg1.ATOM_EXT_UDL_border_radius, bVar3);
        attributeHandlers.put(pg1.ATOM_EXT_UDL_border_bottom_left_radius, bVar3);
        attributeHandlers.put(pg1.ATOM_EXT_UDL_border_bottom_right_radius, bVar3);
        attributeHandlers.put(pg1.ATOM_EXT_UDL_border_top_left_radius, bVar3);
        attributeHandlers.put(pg1.ATOM_EXT_UDL_border_top_right_radius, bVar3);
        attributeHandlers.put(pg1.ATOM_EXT_UDL_border_width, bVar3);
        attributeHandlers.put("foreground-color", com.taobao.tao.flexbox.layoutmanager.core.b.f);
        attributeHandlers.put("opacity", com.taobao.tao.flexbox.layoutmanager.core.b.h);
        attributeHandlers.put("enabled", com.taobao.tao.flexbox.layoutmanager.core.b.k);
        attributeHandlers.put("accessibility-text", com.taobao.tao.flexbox.layoutmanager.core.b.m);
        attributeHandlers.put("visibility", com.taobao.tao.flexbox.layoutmanager.core.b.j);
        attributeHandlers.put(AmnetConstant.VAL_SUPPORT_ZSTD, com.taobao.tao.flexbox.layoutmanager.core.b.l);
        attributeHandlers.put("auto-focus", com.taobao.tao.flexbox.layoutmanager.core.b.i);
        attributeHandlers.put("clip-children", com.taobao.tao.flexbox.layoutmanager.core.b.n);
        attributeHandlers.put("transform", com.taobao.tao.flexbox.layoutmanager.core.b.o);
        attributeHandlers.put("translate", com.taobao.tao.flexbox.layoutmanager.core.b.p);
        attributeHandlers.put("translateX", com.taobao.tao.flexbox.layoutmanager.core.b.q);
        attributeHandlers.put("translateY", com.taobao.tao.flexbox.layoutmanager.core.b.r);
        attributeHandlers.put("rotate", com.taobao.tao.flexbox.layoutmanager.core.b.s);
        attributeHandlers.put("rotateX", com.taobao.tao.flexbox.layoutmanager.core.b.t);
        attributeHandlers.put("rotateY", com.taobao.tao.flexbox.layoutmanager.core.b.u);
        attributeHandlers.put("scaleX", com.taobao.tao.flexbox.layoutmanager.core.b.w);
        attributeHandlers.put("scaleY", com.taobao.tao.flexbox.layoutmanager.core.b.x);
        attributeHandlers.put("scale", com.taobao.tao.flexbox.layoutmanager.core.b.v);
        attributeHandlers.put("apm-valid", com.taobao.tao.flexbox.layoutmanager.core.b.y);
        attributeHandlers.put("fading-edge", com.taobao.tao.flexbox.layoutmanager.core.b.A);
        if (akt.p2("enableBoxShadowHandler", true)) {
            attributeHandlers.put(pg1.ATOM_EXT_UDL_box_shadow, com.taobao.tao.flexbox.layoutmanager.core.b.z);
        }
    }
}
