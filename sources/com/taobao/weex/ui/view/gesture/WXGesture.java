package com.taobao.weex.ui.view.gesture;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.s;
import com.taobao.weex.bridge.EventResult;
import com.taobao.weex.common.Constants;
import com.taobao.weex.dom.WXEvent;
import com.taobao.weex.ui.component.Scrollable;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.view.gesture.WXGestureType;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXGesture extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CUR_EVENT = -1;
    public static final String DOWN = "down";
    public static final String END = "end";
    public static final String LEFT = "left";
    public static final String MOVE = "move";
    public static final String RIGHT = "right";
    public static final String START = "start";
    private static final String TAG = "Gesture";
    public static final String UNKNOWN = "unknown";
    public static final String UP = "up";
    private WXComponent component;
    private GestureDetector mGestureDetector;
    private int mParentOrientation;
    private int shouldBubbleInterval;
    private boolean shouldBubbleResult;
    private long swipeDownTime = -1;
    private long panDownTime = -1;
    private WXGestureType mPendingPan = null;
    private boolean mIsPreventMoveEvent = false;
    private boolean mIsTouchEventConsumed = false;
    private boolean requestDisallowInterceptTouchEvent = false;
    private int shouldBubbleCallRemainTimes = 0;
    private final List<View.OnTouchListener> mTouchListeners = new LinkedList();
    private Rect globalRect = new Rect();
    private Point globalOffset = new Point();
    private Point globalEventOffset = new Point();
    private PointF locEventOffset = new PointF();
    private PointF locLeftTop = new PointF();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class GestureHandler extends Handler {
        static {
            t2o.a(985661750);
        }

        public GestureHandler() {
            super(Looper.getMainLooper());
        }
    }

    static {
        t2o.a(985661749);
    }

    public WXGesture(WXComponent wXComponent, Context context) {
        this.mParentOrientation = -1;
        this.shouldBubbleResult = true;
        this.shouldBubbleInterval = 0;
        this.component = wXComponent;
        this.mGestureDetector = new GestureDetector(context, this, new GestureHandler());
        Scrollable parentScroller = wXComponent.getParentScroller();
        if (parentScroller != null) {
            this.mParentOrientation = parentScroller.getOrientation();
        }
        this.shouldBubbleResult = WXUtils.getBoolean(wXComponent.getAttrs().get(Constants.Name.SHOULD_STOP_PROPAGATION_INIT_RESULT), Boolean.TRUE).booleanValue();
        this.shouldBubbleInterval = WXUtils.getNumberInt(wXComponent.getAttrs().get(Constants.Name.SHOULD_STOP_PROPAGATION_INTERVAL), 0);
    }

    private boolean containsSimplePan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65e8fcb7", new Object[]{this})).booleanValue();
        }
        if (this.component.containsGesture(WXGestureType.HighLevelGesture.PAN_START) || this.component.containsGesture(WXGestureType.HighLevelGesture.PAN_MOVE) || this.component.containsGesture(WXGestureType.HighLevelGesture.PAN_END)) {
            return true;
        }
        return false;
    }

    private JSONObject createJSONObject(MotionEvent motionEvent, int i, int i2) {
        PointF pointF;
        PointF pointF2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("25f48c9f", new Object[]{this, motionEvent, new Integer(i), new Integer(i2)});
        }
        if (i == -1) {
            pointF = getEventLocInPageCoordinate(motionEvent, i2);
            pointF2 = getEventLocInScreenCoordinate(motionEvent, i2);
        } else {
            PointF eventLocInPageCoordinate = getEventLocInPageCoordinate(motionEvent, i2, i);
            pointF2 = getEventLocInScreenCoordinate(motionEvent, i2, i);
            pointF = eventLocInPageCoordinate;
        }
        JSONObject createJSONObject = createJSONObject(pointF2, pointF, motionEvent.getPointerId(i2));
        float pressure = motionEvent.getPressure();
        if (pressure > 0.0f && pressure < 1.0f) {
            createJSONObject.put("force", (Object) Float.valueOf(motionEvent.getPressure()));
        }
        return createJSONObject;
    }

    private List<Map<String, Object>> createMultipleFireEventParam(MotionEvent motionEvent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("84b9150c", new Object[]{this, motionEvent, str});
        }
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize() + 1);
        arrayList.add(createFireEventParam(motionEvent, -1, str));
        return arrayList;
    }

    private void finishDisallowInterceptTouchEvent(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b11271c", new Object[]{this, view});
        } else if (view.getParent() != null) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    private PointF getEventLocInPageCoordinate(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("5bdc4316", new Object[]{this, motionEvent, new Integer(i)}) : getEventLocInPageCoordinate(motionEvent, i, -1);
    }

    private PointF getEventLocInScreenCoordinate(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("31456519", new Object[]{this, motionEvent, new Integer(i)}) : getEventLocInScreenCoordinate(motionEvent, i, -1);
    }

    private List<Map<String, Object>> getHistoricalEvents(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("45e9992", new Object[]{this, motionEvent});
        }
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        if (motionEvent.getActionMasked() == 2) {
            for (int i = 0; i < motionEvent.getHistorySize(); i++) {
                arrayList.add(createFireEventParam(motionEvent, i, null));
            }
        }
        return arrayList;
    }

    private boolean handleMotionEvent(WXGestureType wXGestureType, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fb0af25", new Object[]{this, wXGestureType, motionEvent})).booleanValue();
        }
        if (!this.component.containsGesture(wXGestureType)) {
            return false;
        }
        for (Map<String, Object> map : createMultipleFireEventParam(motionEvent, null)) {
            this.component.fireEvent(wXGestureType.toString(), map);
        }
        return true;
    }

    private boolean hasSameOrientationWithParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af09654b", new Object[]{this})).booleanValue();
        }
        if ((this.mParentOrientation != 0 || !this.component.containsGesture(WXGestureType.HighLevelGesture.HORIZONTALPAN)) && (this.mParentOrientation != 1 || !this.component.containsGesture(WXGestureType.HighLevelGesture.VERTICALPAN))) {
            return false;
        }
        return true;
    }

    public static boolean hasStopPropagation(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67f06320", new Object[]{wXComponent})).booleanValue();
        }
        WXEvent events = wXComponent.getEvents();
        if (events == null) {
            return false;
        }
        int size = events.size();
        for (int i = 0; i < size && i < events.size(); i++) {
            if (isStopPropagation(events.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(WXGesture wXGesture, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/gesture/WXGesture");
    }

    private boolean isParentScrollable() {
        Scrollable parentScroller;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fdf1246", new Object[]{this})).booleanValue();
        }
        WXComponent wXComponent = this.component;
        if (wXComponent == null || (parentScroller = wXComponent.getParentScroller()) == null || parentScroller.isScrollable()) {
            return true;
        }
        return false;
    }

    private boolean isPointerNumChanged(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edccbe81", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 3) {
            return true;
        }
        return false;
    }

    public void addOnTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d4e7e48", new Object[]{this, onTouchListener});
        } else if (onTouchListener != null) {
            this.mTouchListeners.add(onTouchListener);
        }
    }

    public boolean isRequestDisallowInterceptTouchEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8921648", new Object[]{this})).booleanValue();
        }
        return this.requestDisallowInterceptTouchEvent;
    }

    public boolean isTouchEventConsumedByAdvancedGesture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29ca658e", new Object[]{this})).booleanValue();
        }
        return this.mIsTouchEventConsumed;
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
        WXComponent wXComponent = this.component;
        WXGestureType.HighLevelGesture highLevelGesture = WXGestureType.HighLevelGesture.LONG_PRESS;
        if (wXComponent.containsGesture(highLevelGesture)) {
            List<Map<String, Object>> createMultipleFireEventParam = createMultipleFireEventParam(motionEvent, null);
            this.component.getInstance().y(this.component.getRef(), highLevelGesture.toString(), createMultipleFireEventParam.get(createMultipleFireEventParam.size() - 1));
            this.mIsTouchEventConsumed = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:10:0x0026, B:12:0x0030, B:14:0x0036, B:15:0x003c, B:17:0x0042, B:20:0x0051, B:30:0x0064, B:31:0x0072, B:32:0x0074, B:33:0x007a, B:34:0x007c, B:35:0x008b, B:37:0x0093, B:39:0x0099, B:41:0x00a5, B:42:0x00a8, B:43:0x00af, B:45:0x00b7, B:47:0x00bf, B:49:0x00c9, B:51:0x00d1, B:52:0x00da, B:54:0x00de, B:56:0x00f6), top: B:60:0x0026 }] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.view.gesture.WXGesture.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean removeTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79db8e70", new Object[]{this, onTouchListener})).booleanValue();
        }
        if (onTouchListener != null) {
            return this.mTouchListeners.remove(onTouchListener);
        }
        return false;
    }

    public void setPreventMoveEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b303a", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsPreventMoveEvent = z;
        }
    }

    public void setRequestDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c586d8", new Object[]{this, new Boolean(z)});
        } else {
            this.requestDisallowInterceptTouchEvent = z;
        }
    }

    private PointF getEventLocInPageCoordinate(MotionEvent motionEvent, int i, int i2) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("e4569b3b", new Object[]{this, motionEvent, new Integer(i), new Integer(i2)});
        }
        if (i2 == -1) {
            f = motionEvent.getX(i);
            f2 = motionEvent.getY(i);
        } else {
            float historicalX = motionEvent.getHistoricalX(i, i2);
            f2 = motionEvent.getHistoricalY(i, i2);
            f = historicalX;
        }
        return getEventLocInPageCoordinate(f, f2);
    }

    private PointF getEventLocInScreenCoordinate(MotionEvent motionEvent, int i, int i2) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("bc11b998", new Object[]{this, motionEvent, new Integer(i), new Integer(i2)});
        }
        if (i2 == -1) {
            f = motionEvent.getX(i);
            f2 = motionEvent.getY(i);
        } else {
            float historicalX = motionEvent.getHistoricalX(i, i2);
            f2 = motionEvent.getHistoricalY(i, i2);
            f = historicalX;
        }
        return getEventLocInScreenCoordinate(f, f2);
    }

    private boolean shouldBubbleTouchEvent(MotionEvent motionEvent) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("602f627a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!hasStopPropagation(this.component)) {
            return true;
        }
        if (this.shouldBubbleInterval <= 0 || (i = this.shouldBubbleCallRemainTimes) <= 0) {
            Map<String, Object> createFireEventParam = createFireEventParam(motionEvent, -1, null);
            createFireEventParam.put("type", s.SCENE);
            if (motionEvent.getAction() == 0) {
                createFireEventParam.put("action", "start");
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                createFireEventParam.put("action", "end");
            } else {
                createFireEventParam.put("action", MOVE);
            }
            WXEvent events = this.component.getEvents();
            String str = Constants.Event.STOP_PROPAGATION;
            if (!events.contains(str)) {
                str = Constants.Event.STOP_PROPAGATION_RAX;
            }
            EventResult fireEventWait = this.component.fireEventWait(str, createFireEventParam);
            if (fireEventWait.isSuccess() && fireEventWait.getResult() != null) {
                this.shouldBubbleResult = !WXUtils.getBoolean(fireEventWait.getResult(), Boolean.valueOf(!this.shouldBubbleResult)).booleanValue();
            }
            this.shouldBubbleCallRemainTimes = this.shouldBubbleInterval;
            return this.shouldBubbleResult;
        }
        this.shouldBubbleCallRemainTimes = i - 1;
        return this.shouldBubbleResult;
    }

    private String getPanEventAction(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2fe0239b", new Object[]{this, motionEvent});
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            return "start";
        }
        if (action == 1) {
            return "end";
        }
        if (action == 2) {
            return MOVE;
        }
        if (action != 3) {
            return "unknown";
        }
        return "end";
    }

    private boolean handlePanMotionEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74ad638f", new Object[]{this, motionEvent})).booleanValue();
        }
        WXGestureType wXGestureType = this.mPendingPan;
        if (wXGestureType == null) {
            return false;
        }
        String panEventAction = (wXGestureType == WXGestureType.HighLevelGesture.HORIZONTALPAN || wXGestureType == WXGestureType.HighLevelGesture.VERTICALPAN) ? getPanEventAction(motionEvent) : null;
        if (!this.component.containsGesture(this.mPendingPan)) {
            return false;
        }
        if (this.mIsPreventMoveEvent && MOVE.equals(panEventAction)) {
            return true;
        }
        for (Map<String, Object> map : createMultipleFireEventParam(motionEvent, panEventAction)) {
            this.component.fireEvent(this.mPendingPan.toString(), map);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.mPendingPan = null;
        }
        return true;
    }

    public static boolean isStopPropagation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f0b1c75", new Object[]{str})).booleanValue();
        }
        return Constants.Event.STOP_PROPAGATION.equals(str) || Constants.Event.STOP_PROPAGATION_RAX.equals(str);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        WXGestureType.HighLevelGesture highLevelGesture;
        boolean z;
        String str;
        String str2;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        if (Math.abs(motionEvent2.getX() - motionEvent.getX()) > Math.abs(motionEvent2.getY() - motionEvent.getY())) {
            highLevelGesture = WXGestureType.HighLevelGesture.HORIZONTALPAN;
        } else {
            highLevelGesture = WXGestureType.HighLevelGesture.VERTICALPAN;
        }
        WXGestureType wXGestureType = this.mPendingPan;
        if (wXGestureType == WXGestureType.HighLevelGesture.HORIZONTALPAN || wXGestureType == WXGestureType.HighLevelGesture.VERTICALPAN) {
            z = handlePanMotionEvent(motionEvent2);
        } else {
            if (this.component.containsGesture(highLevelGesture)) {
                ViewParent parent = this.component.getRealView().getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                WXGestureType wXGestureType2 = this.mPendingPan;
                if (wXGestureType2 != null) {
                    handleMotionEvent(wXGestureType2, motionEvent2);
                }
                this.mPendingPan = highLevelGesture;
                this.component.fireEvent(highLevelGesture.toString(), createFireEventParam(motionEvent2, -1, "start"));
            } else if (!containsSimplePan()) {
                WXComponent wXComponent = this.component;
                WXGestureType.HighLevelGesture highLevelGesture2 = WXGestureType.HighLevelGesture.SWIPE;
                if (!wXComponent.containsGesture(highLevelGesture2) || this.swipeDownTime == motionEvent.getEventTime()) {
                    z = false;
                } else {
                    this.swipeDownTime = motionEvent.getEventTime();
                    List<Map<String, Object>> createMultipleFireEventParam = createMultipleFireEventParam(motionEvent2, null);
                    Map<String, Object> map = createMultipleFireEventParam.get(createMultipleFireEventParam.size() - 1);
                    if (Math.abs(f) > Math.abs(f2)) {
                        if (f > 0.0f) {
                            str2 = "left";
                        } else {
                            str2 = "right";
                        }
                        map.put("direction", str2);
                    } else {
                        if (f2 > 0.0f) {
                            str = "up";
                        } else {
                            str = "down";
                        }
                        map.put("direction", str);
                    }
                    this.component.getInstance().y(this.component.getRef(), highLevelGesture2.toString(), map);
                }
            } else if (this.panDownTime != motionEvent.getEventTime()) {
                this.panDownTime = motionEvent.getEventTime();
                this.mPendingPan = WXGestureType.HighLevelGesture.PAN_END;
                this.component.fireEvent(WXGestureType.HighLevelGesture.PAN_START.toString(), createFireEventParam(motionEvent, -1, null));
            } else {
                this.component.fireEvent(WXGestureType.HighLevelGesture.PAN_MOVE.toString(), createFireEventParam(motionEvent2, -1, null));
            }
            z = true;
        }
        if (!this.mIsTouchEventConsumed && !z) {
            z2 = false;
        }
        this.mIsTouchEventConsumed = z2;
        return z;
    }

    private Map<String, Object> createFireEventParam(MotionEvent motionEvent, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8741b381", new Object[]{this, motionEvent, new Integer(i), str});
        }
        JSONArray jSONArray = new JSONArray(motionEvent.getPointerCount());
        if (motionEvent.getActionMasked() == 2) {
            for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
                jSONArray.add(createJSONObject(motionEvent, i, i2));
            }
        } else if (isPointerNumChanged(motionEvent)) {
            jSONArray.add(createJSONObject(motionEvent, -1, motionEvent.getActionIndex()));
        }
        HashMap hashMap = new HashMap();
        hashMap.put(WXGestureType.GestureInfo.HISTORICAL_XY, jSONArray);
        hashMap.put(WXGestureType.GestureInfo.TOUCHES, jSONArray);
        if (str != null) {
            hashMap.put("state", str);
        }
        return hashMap;
    }

    private PointF getEventLocInPageCoordinate(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("46fdddc6", new Object[]{this, new Float(f), new Float(f2)});
        }
        this.locEventOffset.set(f, f2);
        this.locLeftTop.set(0.0f, 0.0f);
        this.component.computeVisiblePointInViewCoordinate(this.locLeftTop);
        PointF pointF = this.locEventOffset;
        PointF pointF2 = this.locLeftTop;
        pointF.offset(pointF2.x, pointF2.y);
        return new PointF(WXViewInnerUtils.getWebPxByWidth(this.component.getInstance(), this.locEventOffset.x, this.component.getInstance().P()), WXViewInnerUtils.getWebPxByWidth(this.component.getInstance(), this.locEventOffset.y, this.component.getInstance().P()));
    }

    private PointF getEventLocInScreenCoordinate(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("e91fb663", new Object[]{this, new Float(f), new Float(f2)});
        }
        this.globalRect.set(0, 0, 0, 0);
        this.globalOffset.set(0, 0);
        this.globalEventOffset.set((int) f, (int) f2);
        this.component.getRealView().getGlobalVisibleRect(this.globalRect, this.globalOffset);
        Point point = this.globalEventOffset;
        Point point2 = this.globalOffset;
        point.offset(point2.x, point2.y);
        return new PointF(WXViewInnerUtils.getWebPxByWidth(this.component.getInstance(), this.globalEventOffset.x, this.component.getInstance().P()), WXViewInnerUtils.getWebPxByWidth(this.component.getInstance(), this.globalEventOffset.y, this.component.getInstance().P()));
    }

    private JSONObject createJSONObject(PointF pointF, PointF pointF2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2bb42176", new Object[]{this, pointF, pointF2, new Float(f)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WXGestureType.GestureInfo.PAGE_X, (Object) Float.valueOf(pointF2.x));
        jSONObject.put(WXGestureType.GestureInfo.PAGE_Y, (Object) Float.valueOf(pointF2.y));
        jSONObject.put(WXGestureType.GestureInfo.SCREEN_X, (Object) Float.valueOf(pointF.x));
        jSONObject.put(WXGestureType.GestureInfo.SCREEN_Y, (Object) Float.valueOf(pointF.y));
        jSONObject.put("identifier", (Object) Float.valueOf(f));
        return jSONObject;
    }
}
