package com.ut.mini.exposure;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import tb.c2v;
import tb.ccu;
import tb.k4c;
import tb.m3i;
import tb.nhh;
import tb.op8;
import tb.p3v;
import tb.pg1;
import tb.sp8;
import tb.t2o;
import tb.tp8;
import tb.un8;
import tb.up8;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrackerFrameLayout extends FrameLayout implements GestureDetector.OnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float CLICK_LIMIT = 20.0f;
    private static final String TAG = "TrackerFrameLayout";
    public static final int TRIGGER_VIEW_CHANGED = 0;
    public static final int TRIGGER_VIEW_STATUS_CHANGED = 3;
    public static final int TRIGGER_WINDOW_CHANGED = 1;
    private static final int UT_EXPORSURE_MAX_LENGTH = 25600;
    private static final String UT_SCM_TAG = "scm";
    private static final String UT_SPM_TAG = "spm";
    private static final int eventId = 2201;
    private long traverseTime;
    public static long TIME_INTERVAL = 100;
    private static HashMap<String, Object> mCommonInfo = new HashMap<>();
    private static HashMap<String, HashSet<String>> mHasExposureSet = new HashMap<>();
    private static Map<String, ArrayList> mHasExposrueMap = Collections.synchronizedMap(new HashMap());
    private static HashMap<String, Integer> mHasExposrueDataLength = new HashMap<>();
    private static final Object HasExposrueObjectLock = new Object();
    private static List<String> mImmediatelyCommitBlockList = new Vector();
    private Map<String, tp8> currentViews = new ConcurrentHashMap();
    private long lastDispatchDrawSystemTimeMillis = 0;
    private float mOriX = 0.0f;
    private float mOriY = 0.0f;
    private Runnable traceTask = new a();
    private Rect mGlobalVisibleRect = new Rect();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ExposureEntity implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public double area;
        public long duration;
        public Map<String, String> exargs;
        public String scm;
        public String spm;
        public String viewid;

        static {
            t2o.a(962593285);
        }

        public ExposureEntity(String str, String str2, Map map, long j, double d, String str3) {
            this.spm = str;
            this.scm = str2;
            this.exargs = map;
            this.duration = j;
            this.area = d;
            this.viewid = str3;
        }

        public int length() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
            }
            String str = this.spm;
            if (str != null) {
                i = str.length() + 8;
            }
            String str2 = this.scm;
            if (str2 != null) {
                i += str2.length() + 8;
            }
            Map<String, String> map = this.exargs;
            if (map != null) {
                for (String str3 : map.keySet()) {
                    if (str3 != null) {
                        i += str3.length();
                    }
                    String str4 = this.exargs.get(str3);
                    if (str4 != null) {
                        i += str4.toString().length();
                    }
                    i += 5;
                }
            }
            String str5 = this.viewid;
            if (str5 != null) {
                i += str5.length() + 11;
            }
            return i + 50;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nhh.f(TrackerFrameLayout.TAG, "=====traceTask=====");
            TrackerFrameLayout.access$000(TrackerFrameLayout.this, 0, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements c2v.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593286);
            t2o.a(962593166);
        }

        @Override // tb.c2v.a
        public void onPageAppear(Object obj) {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7330a6", new Object[]{this, obj});
            } else if (obj instanceof Activity) {
                try {
                    view = ((Activity) obj).findViewById(16908290);
                } catch (Exception e) {
                    un8.e(TrackerFrameLayout.TAG, e, new Object[0]);
                    view = null;
                }
                if (view instanceof ViewGroup) {
                    View childAt = ((ViewGroup) view).getChildAt(0);
                    if (childAt instanceof TrackerFrameLayout) {
                        TrackerFrameLayout.access$000((TrackerFrameLayout) childAt, 1, true);
                    } else {
                        un8.w(TrackerFrameLayout.TAG, "cannot found the trace view", childAt);
                    }
                } else {
                    un8.w(TrackerFrameLayout.TAG, "contentView", view);
                }
            }
        }

        @Override // tb.c2v.a
        public void onPageDisAppear(Object obj) {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4c99138", new Object[]{this, obj});
            } else if (obj instanceof Activity) {
                try {
                    view = ((Activity) obj).findViewById(16908290);
                } catch (Exception e) {
                    un8.e(TrackerFrameLayout.TAG, e, new Object[0]);
                    view = null;
                }
                if (view instanceof ViewGroup) {
                    View childAt = ((ViewGroup) view).getChildAt(0);
                    if (childAt instanceof TrackerFrameLayout) {
                        ((TrackerFrameLayout) childAt).onPageDisAppear();
                    } else {
                        un8.w(TrackerFrameLayout.TAG, "cannot found the trace view ", childAt);
                    }
                } else {
                    un8.w(TrackerFrameLayout.TAG, "contentView", view);
                }
            }
        }
    }

    static {
        t2o.a(962593283);
        c2v.addPageChangerListener(new b());
    }

    public TrackerFrameLayout(Context context) {
        super(context);
        addCommonArgsInfo();
        op8.updateExposureConfig();
    }

    public static /* synthetic */ void access$000(TrackerFrameLayout trackerFrameLayout, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6ff48a", new Object[]{trackerFrameLayout, new Integer(i), new Boolean(z)});
        } else {
            trackerFrameLayout.trace(i, z);
        }
    }

    private void addCommonArgsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12f8e3e", new Object[]{this});
        } else if (getContext() != null && (getContext() instanceof Activity)) {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            mCommonInfo.clear();
            HashMap<String, String> hashMap = ccu.getInstance().commonInfoMap;
            if (hashMap != null) {
                mCommonInfo.putAll(hashMap);
            }
            HashMap hashMap2 = (HashMap) decorView.getTag(sp8.ut_exprosure_common_info_tag);
            if (hashMap2 != null && !hashMap2.isEmpty()) {
                mCommonInfo.putAll(hashMap2);
                un8.d(TAG, "addCommonArgsInfo mCommonInfo ", hashMap2);
            }
            un8.d(TAG, "addCommonArgsInfo all mCommonInfo ", hashMap2);
        }
    }

    private void checkViewsStates(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7cf9874", new Object[]{this, new Integer(i)});
            return;
        }
        Map<String, tp8> map = this.currentViews;
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, tp8> entry : this.currentViews.entrySet()) {
                checkViewState(i, this.currentViews.get(String.valueOf(entry.getValue().view.hashCode())));
            }
        }
    }

    public static void commitExposureData() {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c098af", new Object[0]);
            return;
        }
        synchronized (HasExposrueObjectLock) {
            try {
                objArr = mHasExposrueMap.keySet().toArray();
            } catch (Throwable unused) {
                objArr = null;
            }
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        for (int i = 0; i < objArr.length; i++) {
                            commitToUT(objArr[i] + "", mCommonInfo);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            mHasExposrueMap.clear();
        }
    }

    private static void commitToUT(String str, HashMap<String, Object> hashMap) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb591e71", new Object[]{str, hashMap});
            return;
        }
        un8.d();
        ArrayList remove = mHasExposrueMap.remove(str);
        HashMap hashMap2 = new HashMap();
        if (!(hashMap == null || hashMap.size() <= 0 || (a2 = m3i.a(hashMap)) == null)) {
            hashMap2.putAll(a2);
        }
        hashMap2.put("expdata", getExpData(remove));
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(c2v.getInstance().getCurrentPageName(), 2201, str, null, null, hashMap2).build());
        mHasExposrueDataLength.remove(str);
    }

    private static String getExpData(ArrayList<ExposureEntity> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b88d16e", new Object[]{arrayList});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(arrayList);
        return jSONArray.toJSONString();
    }

    private static Object getRootViewTag(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e86451d", new Object[]{view, new Integer(i)});
        }
        while (view != null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
            if (view != null && view.getTag(i) != null) {
                return view.getTag(i);
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(TrackerFrameLayout trackerFrameLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2090125984:
                super.dispatchVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 1476722183:
                super.dispatchWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/exposure/TrackerFrameLayout");
        }
    }

    private boolean isExposured(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("180b3952", new Object[]{this, str, str2})).booleanValue();
        }
        HashSet<String> hashSet = mHasExposureSet.get(str);
        if (hashSet == null) {
            return false;
        }
        return hashSet.contains(str2);
    }

    private boolean isVisableToUser(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5c8a639", new Object[]{this, view})).booleanValue();
        }
        if (viewSize(view) >= op8.dimThreshold) {
            return true;
        }
        return false;
    }

    public static void refreshExposureData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd143a53", new Object[0]);
        } else {
            mHasExposureSet.clear();
        }
    }

    public static void refreshExposureDataByViewId(String str, String str2) {
        HashSet<String> hashSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f455a0de", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (hashSet = mHasExposureSet.get(str)) != null) {
            hashSet.remove(str2);
        }
    }

    public static void setCommitImmediatelyExposureBlock(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c81092", new Object[]{str});
        } else {
            mImmediatelyCommitBlockList.add(str);
        }
    }

    private void setExposuredTag(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f774e2ba", new Object[]{this, str, str2});
            return;
        }
        HashSet<String> hashSet = mHasExposureSet.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            mHasExposureSet.put(str, hashSet);
        }
        hashSet.add(str2);
    }

    private double viewSize(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3469dd3", new Object[]{this, view})).doubleValue();
        }
        int width = view.getWidth() * view.getHeight();
        if (!view.getGlobalVisibleRect(this.mGlobalVisibleRect) || width <= 0) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return ((this.mGlobalVisibleRect.width() * this.mGlobalVisibleRect.height()) * 1.0d) / width;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        un8.d(TAG, "dispatchDraw");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastDispatchDrawSystemTimeMillis > 1000) {
            this.lastDispatchDrawSystemTimeMillis = currentTimeMillis;
            addCommonArgsInfo();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5804fe07", new Object[]{this, new Boolean(z)});
            return;
        }
        un8.d(TAG, "begin");
        long currentTimeMillis = System.currentTimeMillis();
        trace(1, false);
        if (un8.enableLog) {
            un8.d(TAG, "end" + (System.currentTimeMillis() - currentTimeMillis) + "--");
        }
        super.dispatchWindowFocusChanged(z);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        un8.d(TAG, "begin");
        long currentTimeMillis = System.currentTimeMillis();
        trace(0, false);
        if (un8.enableLog) {
            un8.d(TAG, "end costTime=" + (System.currentTimeMillis() - currentTimeMillis) + "--");
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
        }
    }

    public void onPageDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbea805c", new Object[]{this});
            return;
        }
        Handler threadHandle = ccu.getInstance().getThreadHandle();
        if (threadHandle != null) {
            threadHandle.removeCallbacks(this.traceTask);
        }
        trace(1, true);
        commitExposureData();
        mImmediatelyCommitBlockList.clear();
        this.currentViews.clear();
        if (!op8.notClearTagAfterDisAppear) {
            mHasExposureSet.clear();
        }
        up8 exposureViewHandle = ccu.getInstance().getExposureViewHandle();
        if (exposureViewHandle instanceof k4c) {
            ((k4c) exposureViewHandle).onExposureDataCleared();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (un8.enableLog) {
            un8.d(TAG, "action:", Integer.valueOf(motionEvent.getAction()));
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static void refreshExposureData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c955d", new Object[]{str});
            return;
        }
        un8.d(TAG, "[refreshExposureData]block", str);
        if (!TextUtils.isEmpty(str)) {
            mHasExposureSet.remove(str);
        }
    }

    private void trace(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca02487d", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (z || currentTimeMillis - this.traverseTime >= TIME_INTERVAL) {
                un8.d(TAG, "扫描开始");
                this.traverseTime = currentTimeMillis;
                traverseViewTree(this);
                checkViewsStates(i);
                if (un8.enableLog) {
                    un8.d(TAG, "扫描结束，耗时:" + (System.currentTimeMillis() - currentTimeMillis));
                }
            } else if (un8.enableLog) {
                un8.d(TAG, "triggerTime interval is too close to " + TIME_INTERVAL + "ms");
            }
        } catch (Throwable th) {
            un8.e(TAG, th, new Object[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (un8.enableLog) {
            un8.d(TAG, "action:", Integer.valueOf(motionEvent.getAction()));
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mOriX = motionEvent.getX();
            this.mOriY = motionEvent.getY();
        } else if (action == 1) {
            Handler threadHandle = ccu.getInstance().getThreadHandle();
            if (threadHandle != null) {
                threadHandle.removeCallbacks(this.traceTask);
                threadHandle.postDelayed(this.traceTask, 1000L);
            }
        } else if (action == 2) {
            if (Math.abs(motionEvent.getX() - this.mOriX) > 20.0f || Math.abs(motionEvent.getY() - this.mOriY) > 20.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                un8.d(TAG, " begin");
                trace(0, false);
                if (un8.enableLog) {
                    un8.d(TAG, "end costTime=" + (System.currentTimeMillis() - currentTimeMillis) + "--\n");
                }
            } else {
                un8.d(TAG, "onInterceptTouchEvent ACTION_MOVE but not in click limit");
            }
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("836b3560", new Object[]{this, view, new Integer(i)});
            return;
        }
        if (i == 8) {
            un8.d(TAG, "begin");
            long currentTimeMillis = System.currentTimeMillis();
            trace(1, false);
            if (un8.enableLog) {
                un8.d(TAG, "end costTime=" + (System.currentTimeMillis() - currentTimeMillis) + "--");
            }
        } else {
            un8.d(TAG, "visibility", Integer.valueOf(i));
        }
        super.dispatchVisibilityChanged(view, i);
    }

    private void checkViewState(int i, tp8 tp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a826e8b", new Object[]{this, new Integer(i), tp8Var});
        } else if (tp8Var != null) {
            if (isVisableToUser(tp8Var.view)) {
                int i2 = tp8Var.lastState;
                if (i2 == 0) {
                    tp8Var.lastState = 1;
                    tp8Var.beginTime = System.currentTimeMillis();
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        tp8Var.lastState = 1;
                        tp8Var.beginTime = System.currentTimeMillis();
                    }
                } else if (i == 1 || i == 3) {
                    tp8Var.lastState = 2;
                    tp8Var.endTime = System.currentTimeMillis();
                }
            } else if (tp8Var.lastState == 1) {
                tp8Var.lastState = 2;
                tp8Var.endTime = System.currentTimeMillis();
            }
            if (tp8Var.isSatisfyTimeRequired()) {
                addToCommit(tp8Var);
                this.currentViews.remove(String.valueOf(tp8Var.view.hashCode()));
            } else if (tp8Var.lastState == 2) {
                this.currentViews.remove(String.valueOf(tp8Var.view.hashCode()));
                un8.d(TAG, "时间不满足，元素", tp8Var.tag);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0248 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void traverseViewTree(android.view.View r18) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.mini.exposure.TrackerFrameLayout.traverseViewTree(android.view.View):void");
    }

    private void addToCommit(tp8 tp8Var) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad916a09", new Object[]{this, tp8Var});
            return;
        }
        String str = tp8Var.block;
        String str2 = tp8Var.tag;
        if (isExposured(str, str2)) {
            un8.d(TAG, "isExposured block", str, "viewId", str2);
            return;
        }
        setExposuredTag(str, str2);
        Map<String, Object> map2 = tp8Var.viewData;
        HashMap hashMap = new HashMap();
        up8 exposureViewHandle = ccu.getInstance().getExposureViewHandle();
        String[] strArr = null;
        if (exposureViewHandle != null) {
            Context context = tp8Var.view.getContext();
            Map<String, String> exposureViewProperties = exposureViewHandle.getExposureViewProperties(context != null ? c2v.getInstance().getPageUrl(context) : null, tp8Var.view);
            if (exposureViewProperties != null) {
                hashMap.putAll(exposureViewProperties);
            }
        }
        if (!(map2 == null || map2.get(sp8.UT_EXPROSURE_ARGS) == null || (map = (Map) map2.get(sp8.UT_EXPROSURE_ARGS)) == null || map.size() <= 0)) {
            hashMap.putAll(map);
        }
        String str3 = (String) hashMap.remove("spm");
        String str4 = (String) hashMap.remove("scm");
        synchronized (HasExposrueObjectLock) {
            try {
                ArrayList arrayList = mHasExposrueMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    mHasExposrueMap.put(str, arrayList);
                    View view = tp8Var.view;
                    if (view != null) {
                        Object tag = view.getTag(sp8.ut_exposure_data_spm);
                        if (tag instanceof Map) {
                            String str5 = (String) ((Map) tag).get(sp8.UT_EXPOSURE_SPM_C);
                            String str6 = (String) ((Map) tag).get(sp8.UT_EXPOSURE_SPM_D);
                            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                                Object rootViewTag = getRootViewTag(view, sp8.ut_exposure_root_spm);
                                if (rootViewTag instanceof Map) {
                                    String str7 = (String) ((Map) rootViewTag).get(sp8.UT_EXPOSURE_SPM_A);
                                    String str8 = (String) ((Map) rootViewTag).get(sp8.UT_EXPOSURE_SPM_B);
                                    if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                                        str3 = str7 + "." + str8 + "." + str5 + "." + str6;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    View view2 = tp8Var.view;
                    if (view2 != null) {
                        Object tag2 = view2.getTag(sp8.ut_exposure_data_spm);
                        if (tag2 instanceof Map) {
                            String str9 = (String) ((Map) tag2).get(sp8.UT_EXPOSURE_SPM_C);
                            String str10 = (String) ((Map) tag2).get(sp8.UT_EXPOSURE_SPM_D);
                            if (!TextUtils.isEmpty(str9) && !TextUtils.isEmpty(str10)) {
                                String str11 = ((ExposureEntity) arrayList.get(0)).spm;
                                if (!TextUtils.isEmpty(str11)) {
                                    strArr = str11.split("\\.");
                                }
                                if (strArr != null && strArr.length == 4) {
                                    str3 = strArr[0] + "." + strArr[1] + "." + str9 + "." + str10;
                                }
                            }
                        }
                    }
                }
                ExposureEntity exposureEntity = new ExposureEntity(str3, str4, hashMap, System.currentTimeMillis() - tp8Var.beginTime, tp8Var.area, str2);
                arrayList.add(exposureEntity);
                Integer num = mHasExposrueDataLength.get(str);
                if (num == null) {
                    num = 0;
                }
                int intValue = num.intValue() + exposureEntity.length();
                mHasExposrueDataLength.put(str, Integer.valueOf(intValue));
                if (intValue > UT_EXPORSURE_MAX_LENGTH) {
                    commitToUT(str, mCommonInfo);
                } else if (mImmediatelyCommitBlockList.contains(str)) {
                    commitToUT(str, mCommonInfo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p3v.getInstance().addExposureViewToCommit(str, str2, str3, str4, hashMap);
        un8.d(TAG, "提交元素viewId ", str2, pg1.ATOM_EXT_block, str, "spm", str3, "scm", str4, "args", hashMap);
    }
}
