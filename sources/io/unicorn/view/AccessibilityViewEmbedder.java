package io.unicorn.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.hdh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final b reflectionAccessors = new b();
    private final SparseArray<c> flutterIdToOrigin = new SparseArray<>();
    private final Map<c, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Method f15233a;
        public final Method b;
        public final Method c;
        public final Method d;
        public final Field e;
        public final Method f;

        static {
            t2o.a(945815865);
        }

        public static int j(long j) {
            return (int) (j >> 32);
        }

        public static boolean k(long j, int i) {
            if ((j & (1 << i)) != 0) {
                return true;
            }
            return false;
        }

        public static Long l(AccessibilityNodeInfo accessibilityNodeInfo) {
            Long l = null;
            if (Build.VERSION.SDK_INT < 26) {
                hdh.f(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (k(readLong, 0)) {
                obtain2.readInt();
            }
            if (k(readLong, 1)) {
                obtain2.readLong();
            }
            if (k(readLong, 2)) {
                obtain2.readInt();
            }
            if (k(readLong, 3)) {
                l = Long.valueOf(obtain2.readLong());
            }
            obtain2.recycle();
            return l;
        }

        public final Long f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            Throwable e;
            Method method = this.f;
            Field field = this.e;
            Method method2 = this.d;
            if (method2 == null && (field == null || method == null)) {
                return null;
            }
            if (method2 != null) {
                try {
                    return (Long) method2.invoke(accessibilityNodeInfo, Integer.valueOf(i));
                } catch (IllegalAccessException e2) {
                    hdh.g(AccessibilityViewEmbedder.TAG, "Failed to access getChildId method.", e2);
                } catch (InvocationTargetException e3) {
                    hdh.g(AccessibilityViewEmbedder.TAG, "The getChildId method threw an exception when invoked.", e3);
                }
            } else {
                try {
                    Long l = (Long) method.invoke(field.get(accessibilityNodeInfo), Integer.valueOf(i));
                    l.longValue();
                    return l;
                } catch (ArrayIndexOutOfBoundsException e4) {
                    e = e4;
                    hdh.g(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                } catch (IllegalAccessException e5) {
                    hdh.g(AccessibilityViewEmbedder.TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e5);
                } catch (InvocationTargetException e6) {
                    e = e6;
                    hdh.g(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                }
            }
            return null;
        }

        public final Long g(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.b;
            if (method != null) {
                try {
                    Long l = (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
                    l.longValue();
                    return l;
                } catch (IllegalAccessException e) {
                    hdh.g(AccessibilityViewEmbedder.TAG, "Failed to access getParentNodeId method.", e);
                } catch (InvocationTargetException e2) {
                    hdh.g(AccessibilityViewEmbedder.TAG, "The getParentNodeId method threw an exception when invoked.", e2);
                }
            }
            return l(accessibilityNodeInfo);
        }

        public final Long h(AccessibilityRecord accessibilityRecord) {
            Method method = this.c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e) {
                hdh.g(AccessibilityViewEmbedder.TAG, "Failed to access the getRecordSourceNodeId method.", e);
                return null;
            } catch (InvocationTargetException e2) {
                hdh.g(AccessibilityViewEmbedder.TAG, "The getRecordSourceNodeId method threw an exception when invoked.", e2);
                return null;
            }
        }

        public final Long i(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f15233a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e) {
                hdh.g(AccessibilityViewEmbedder.TAG, "Failed to access getSourceNodeId method.", e);
                return null;
            } catch (InvocationTargetException e2) {
                hdh.g(AccessibilityViewEmbedder.TAG, "The getSourceNodeId method threw an exception when invoked.", e2);
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Field field;
            Method method5 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                hdh.f(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                hdh.f(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (Build.VERSION.SDK_INT <= 26) {
                try {
                    method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
                } catch (NoSuchMethodException unused3) {
                    hdh.f(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                    method5 = null;
                }
                try {
                    method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                    method4 = null;
                } catch (NoSuchMethodException unused4) {
                    hdh.f(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                    method3 = null;
                    method4 = null;
                }
                field = method4;
            } else {
                try {
                    Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method4 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                    method3 = null;
                    field = declaredField;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused5) {
                    hdh.f(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method3 = null;
                    method4 = null;
                    field = 0;
                }
            }
            this.f15233a = method;
            this.b = method5;
            this.c = method2;
            this.d = method3;
            this.e = field;
            this.f = method4;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final View f15234a;
        public final int b;

        static {
            t2o.a(945815866);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.b != cVar.b || !this.f15234a.equals(cVar.f15234a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f15234a.hashCode() + 31) * 31) + this.b;
        }

        public c(View view, int i) {
            this.f15234a = view;
            this.b = i;
        }
    }

    static {
        t2o.a(945815863);
    }

    public AccessibilityViewEmbedder(View view, int i) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i;
        for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); i2++) {
            Long f = this.reflectionAccessors.f(accessibilityNodeInfo, i2);
            if (f != null) {
                int j = b.j(f.longValue());
                c cVar = new c(view, j);
                if (this.originToFlutterId.containsKey(cVar)) {
                    i = this.originToFlutterId.get(cVar).intValue();
                } else {
                    int i3 = this.nextFlutterId;
                    this.nextFlutterId = i3 + 1;
                    cacheVirtualIdMappings(view, j, i3);
                    i = i3;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i, int i2) {
        c cVar = new c(view, i);
        this.originToFlutterId.put(cVar, Integer.valueOf(i2));
        this.flutterIdToOrigin.put(i2, cVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, this.embeddedViewToDisplayBounds.get(view), obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        List availableExtraData;
        CharSequence hintText;
        boolean isShowingHintText;
        int drawingOrder;
        boolean isImportantForAccessibility;
        boolean isContextClickable;
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        int i = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        if (i >= 23) {
            isContextClickable = accessibilityNodeInfo.isContextClickable();
            accessibilityNodeInfo2.setContextClickable(isContextClickable);
        }
        if (i >= 24) {
            drawingOrder = accessibilityNodeInfo.getDrawingOrder();
            accessibilityNodeInfo2.setDrawingOrder(drawingOrder);
            isImportantForAccessibility = accessibilityNodeInfo.isImportantForAccessibility();
            accessibilityNodeInfo2.setImportantForAccessibility(isImportantForAccessibility);
        }
        if (i >= 26) {
            availableExtraData = accessibilityNodeInfo.getAvailableExtraData();
            accessibilityNodeInfo2.setAvailableExtraData(availableExtraData);
            hintText = accessibilityNodeInfo.getHintText();
            accessibilityNodeInfo2.setHintText(hintText);
            isShowingHintText = accessibilityNodeInfo.isShowingHintText();
            accessibilityNodeInfo2.setShowingHintText(isShowingHintText);
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long g = this.reflectionAccessors.g(accessibilityNodeInfo);
        if (g != null) {
            Integer num = this.originToFlutterId.get(new c(view, b.j(g.longValue())));
            if (num != null) {
                accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
            }
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        c cVar = this.flutterIdToOrigin.get(i);
        if (cVar == null) {
            return null;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = cVar.f15234a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long h = this.reflectionAccessors.h(accessibilityRecord);
        if (h == null) {
            return null;
        }
        return this.originToFlutterId.get(new c(view, b.j(h.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i, Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long i2 = this.reflectionAccessors.i(createAccessibilityNodeInfo);
        if (i2 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, b.j(i2.longValue()), i);
        return convertToFlutterNode(createAccessibilityNodeInfo, i, view);
    }

    public boolean onAccessibilityHoverEvent(int i, MotionEvent motionEvent) {
        c cVar = this.flutterIdToOrigin.get(i);
        if (cVar == null) {
            return false;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = cVar.f15234a;
        Rect rect = map.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i2] = pointerProperties;
            motionEvent.getPointerProperties(i2, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i2, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i2] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        c cVar = this.flutterIdToOrigin.get(i);
        if (cVar == null || (accessibilityNodeProvider = cVar.f15234a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.b, i2, bundle);
    }

    public View platformViewOfNode(int i) {
        c cVar = this.flutterIdToOrigin.get(i);
        if (cVar == null) {
            return null;
        }
        return cVar.f15234a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Long h = this.reflectionAccessors.h(accessibilityEvent);
        if (h == null) {
            return false;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        int j = b.j(h.longValue());
        Integer num = this.originToFlutterId.get(new c(view, j));
        if (num == null) {
            int i = this.nextFlutterId;
            this.nextFlutterId = i + 1;
            Integer valueOf = Integer.valueOf(i);
            cacheVirtualIdMappings(view, j, i);
            num = valueOf;
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i2 = 0; i2 < obtain.getRecordCount(); i2++) {
            AccessibilityRecord record = obtain.getRecord(i2);
            Long h2 = this.reflectionAccessors.h(record);
            if (h2 == null) {
                return false;
            }
            c cVar = new c(view, b.j(h2.longValue()));
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(cVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
