package com.taobao.search.musie.stack;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tb.fxh;
import tb.j5k;
import tb.t2o;
import tb.xuu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MUStack extends UINodeGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_ALIGNMENT = "alignment";
    private static final String ATTR_AXIS = "axis";
    private static final String ATTR_SPACE = "space";
    private static final String AXIS_HORIZONTAL = "horizontal";
    private static final String AXIS_VERTICAL = "vertical";
    private static final String EVENT_ITEMS_APPEAR = "itemsappear";
    private static final String EXTRA_APPEAR_ITEMS = "items";
    private static final int MODE_CENTER = 2;
    private static final int MODE_LEADING = 1;
    private static final int MODE_TRAILING = 3;
    private boolean appear;
    private boolean refresh;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Comparator<MUStackItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(MUStack mUStack) {
        }

        /* renamed from: a */
        public int compare(MUStackItem mUStackItem, MUStackItem mUStackItem2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9d94613f", new Object[]{this, mUStackItem, mUStackItem2})).intValue();
            }
            int i = mUStackItem.index;
            int i2 = mUStackItem2.index;
            if (i > i2) {
                return 1;
            }
            if (i < i2) {
                return -1;
            }
            return 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends j5k<UINodeGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public UINode n;

        static {
            t2o.a(815792771);
        }

        public b(UINodeGroup uINodeGroup) {
            super(uINodeGroup);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/stack/MUStack$StackTouchHelper");
        }

        @Override // tb.j5k
        public boolean d(MotionEvent motionEvent, View view) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f0ce5165", new Object[]{this, motionEvent, view})).booleanValue();
            }
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                s();
                B(true);
            }
            UINode uINode = this.n;
            if (uINode != null) {
                if (uINode != this.i) {
                    Rect y = uINode.getNodeInfo().y();
                    UINode uINode2 = this.n;
                    if (uINode2 instanceof MUStackItem) {
                        y = ((MUStackItem) uINode2).drawRect;
                    }
                    motionEvent.offsetLocation(-y.left, -y.top);
                    z = this.n.dispatchTouchEvent(motionEvent, view);
                    motionEvent.offsetLocation(y.left, y.top);
                    if (!z) {
                        z = o(motionEvent, view);
                    }
                } else {
                    z = o(motionEvent, view);
                }
                if (!z) {
                    this.n = null;
                }
            } else {
                int childCount = ((UINodeGroup) this.i).getChildCount() - 1;
                z = false;
                while (true) {
                    if (childCount < 0) {
                        break;
                    }
                    MUStackItem mUStackItem = (MUStackItem) ((UINodeGroup) this.i).getChildAt(childCount);
                    if (mUStackItem.canDraw && mUStackItem.drawRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        Rect rect = mUStackItem.drawRect;
                        motionEvent.offsetLocation(-rect.left, -rect.top);
                        boolean dispatchTouchEvent = mUStackItem.dispatchTouchEvent(motionEvent, view);
                        motionEvent.offsetLocation(rect.left, rect.top);
                        if (dispatchTouchEvent) {
                            this.n = mUStackItem;
                            z = dispatchTouchEvent;
                            break;
                        }
                        z = dispatchTouchEvent;
                    }
                    childCount--;
                }
                if (!z) {
                    z = o(motionEvent, view);
                    if (z) {
                        this.n = this.i;
                    } else {
                        s();
                    }
                }
            }
            if (action == 1 || action == 3) {
                this.n = null;
                B(false);
            }
            return z;
        }
    }

    static {
        t2o.a(815792769);
    }

    public MUStack(int i) {
        super(i);
    }

    private void addToSortedItems(MUStackItem mUStackItem, SparseArray<List<MUStackItem>> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f721e66", new Object[]{this, mUStackItem, sparseArray});
            return;
        }
        int priority = mUStackItem.getPriority();
        List<MUStackItem> list = sparseArray.get(priority);
        if (list == null) {
            list = new LinkedList<>();
            sparseArray.put(priority, list);
        }
        list.add(mUStackItem);
    }

    private void drawHorizontally(Canvas canvas, float f, MUSNodeHost mUSNodeHost, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a751130f", new Object[]{this, canvas, new Float(f), mUSNodeHost, new Integer(i)});
            return;
        }
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            MUStackItem mUStackItem = (MUStackItem) getChildAt(i3);
            if (mUStackItem.canDraw) {
                if (i2 == 0 && mUStackItem.margin == 0) {
                    z = false;
                } else {
                    canvas.translate(i2, mUStackItem.margin);
                    z = true;
                }
                mUStackItem.draw(mUSNodeHost, canvas, 0, 0, false, f);
                if (z) {
                    canvas.translate(-i2, -mUStackItem.margin);
                }
                i2 += mUStackItem.getLayoutWidth() + i;
            }
        }
    }

    private void drawVertically(Canvas canvas, float f, MUSNodeHost mUSNodeHost, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb6907d", new Object[]{this, canvas, new Float(f), mUSNodeHost, new Integer(i)});
            return;
        }
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            MUStackItem mUStackItem = (MUStackItem) getChildAt(i3);
            if (mUStackItem.canDraw) {
                if (i2 == 0 && mUStackItem.margin == 0) {
                    z = false;
                } else {
                    canvas.translate(mUStackItem.margin, i2);
                    z = true;
                }
                mUStackItem.draw(mUSNodeHost, canvas, 0, 0, false, f);
                if (z) {
                    canvas.translate(-mUStackItem.margin, -i2);
                }
                i2 += mUStackItem.getLayoutHeight() + i;
            }
        }
    }

    private int getAlignTranslation(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4983308d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i == 2) {
            return (i2 - i3) / 2;
        }
        if (i != 3) {
            return 0;
        }
        return i2 - i3;
    }

    private int getAlignment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("489b3927", new Object[]{this})).intValue();
        }
        Object attribute = getAttribute(ATTR_ALIGNMENT);
        if (attribute instanceof Integer) {
            return ((Integer) attribute).intValue();
        }
        return 1;
    }

    public static /* synthetic */ Object ipc$super(MUStack mUStack, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1487412538:
                super.addChild((UINode) objArr[0]);
                return null;
            case -828468633:
                super.addChild(((Number) objArr[0]).intValue(), (UINode) objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case 253441194:
                super.dispatchUpdateLayoutState((xuu) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 1084303291:
                super.onUpdateExtra((UINode) objArr[0], objArr[1], (String) objArr[2], objArr[3]);
                return null;
            case 1676731387:
                super.fireEvent((String) objArr[0], (JSONObject) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/stack/MUStack");
        }
    }

    private boolean isVertical() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d064334b", new Object[]{this})).booleanValue();
        }
        Object attribute = getAttribute(ATTR_AXIS);
        if (!(attribute instanceof Boolean) || !((Boolean) attribute).booleanValue()) {
            return false;
        }
        return true;
    }

    private void notifyItemsAppear(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f28661b", new Object[]{this, jSONArray});
        } else if (jSONArray != null && hasEvent(EVENT_ITEMS_APPEAR) && this.appear && getChildCount() > 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("items", (Object) jSONArray);
            fireEvent(EVENT_ITEMS_APPEAR, jSONObject);
        }
    }

    private void sortItems(List<MUStackItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6edc033a", new Object[]{this, list});
        } else {
            Collections.sort(list, new a(this));
        }
    }

    private void validOrThrow(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633d101a", new Object[]{this, uINode});
        } else if (!(uINode instanceof MUStackItem)) {
            throw new RuntimeException("mus-stack的子节点只支持mus-stack-item");
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
            return;
        }
        validOrThrow(uINode);
        ((MUStackItem) uINode).parent = this;
        super.addChild(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void dispatchDraw(MUSNodeHost mUSNodeHost, Canvas canvas, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96d02bd", new Object[]{this, mUSNodeHost, canvas, new Float(f)});
        } else if (this.children != null && getChildCount() != 0) {
            if (!isRenderNodeEnabled()) {
                f *= getOpacity();
            }
            int space = getSpace();
            if (isVertical()) {
                drawVertically(canvas, f, mUSNodeHost, space);
            } else {
                drawHorizontally(canvas, f, mUSNodeHost, space);
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup
    public void dispatchUpdateLayoutState(xuu xuuVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b34aa", new Object[]{this, xuuVar, new Integer(i), new Integer(i2)});
            return;
        }
        super.dispatchUpdateLayoutState(xuuVar, i, i2);
        if (this.refresh) {
            notifyAccessibleChanged(true);
            this.refresh = false;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void fireEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
            return;
        }
        super.fireEvent(str, jSONObject);
        if (TextUtils.equals(str, "appear")) {
            this.appear = true;
            notifyItemsAppear((JSONArray) getExtra("items"));
        } else if (TextUtils.equals(str, "disappear")) {
            this.appear = false;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public j5k onCreateTouchHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5k) ipChange.ipc$dispatch("bd2f39c4", new Object[]{this});
        }
        return new b(this);
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        this.appear = false;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateExtra(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a127bb", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        super.onUpdateExtra(uINode, obj, str, obj2);
        if (TextUtils.equals(str, "items")) {
            notifyItemsAppear((JSONArray) obj2);
        }
    }

    @MUSNodeProp(name = ATTR_ALIGNMENT, refresh = true)
    public void refreshAlignment(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2fa5714", new Object[]{this, new Integer(i)});
            return;
        }
        notifyLocationChange();
        this.refresh = true;
    }

    @MUSNodeProp(name = ATTR_ALIGNMENT, refresh = true)
    public void refreshAxis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1519c7c0", new Object[]{this, new Integer(i)});
            return;
        }
        notifyLocationChange();
        this.refresh = true;
    }

    @MUSNodeProp(name = ATTR_SPACE, refresh = true)
    public void refreshSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d91b51", new Object[]{this, new Integer(i)});
            return;
        }
        notifyLocationChange();
        this.refresh = true;
    }

    @MUSNodeProp(name = ATTR_AXIS)
    public void setAxis(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b00574", new Object[]{this, str});
        } else if (str == null) {
            setAttribute(ATTR_AXIS, Boolean.FALSE);
        } else {
            int hashCode = str.hashCode();
            if (hashCode != -1984141450) {
                if (hashCode == 1387629604) {
                    str.equals("horizontal");
                }
            } else if (str.equals("vertical")) {
                setAttribute(ATTR_AXIS, Boolean.TRUE);
                return;
            }
            setAttribute(ATTR_AXIS, Boolean.FALSE);
        }
    }

    @MUSNodeProp(name = ATTR_SPACE)
    public void setSpace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47e8155", new Object[]{this, str});
        } else {
            setAttribute(ATTR_SPACE, Integer.valueOf((int) fxh.e(str)));
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public boolean shouldClip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f29c16ae", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void updateItems(xuu xuuVar, int i, int i2) {
        MUStackItem next;
        int layoutHeight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabe033d", new Object[]{this, xuuVar, new Integer(i), new Integer(i2)});
            return;
        }
        int layoutWidth = getLayoutWidth();
        int layoutHeight2 = getLayoutHeight();
        SparseArray<List<MUStackItem>> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            MUStackItem mUStackItem = (MUStackItem) getChildAt(i3);
            if (mUStackItem != null) {
                if (xuuVar != null) {
                    mUStackItem.updateLayoutState(xuuVar, layoutWidth, layoutHeight2);
                }
                addToSortedItems(mUStackItem, sparseArray);
                mUStackItem.canDraw = false;
                mUStackItem.drawRect.setEmpty();
                mUStackItem.index = i3;
            }
        }
        int space = getSpace();
        int alignment = getAlignment();
        LinkedList<MUStackItem> linkedList = new LinkedList();
        if (isVertical()) {
            int contentHeight = getContentHeight();
            for (int size = sparseArray.size(); size >= 0; size--) {
                List<MUStackItem> valueAt = sparseArray.valueAt(size);
                if (valueAt != null) {
                    Iterator<MUStackItem> it = valueAt.iterator();
                    while (it.hasNext() && (layoutHeight = (next = it.next()).getLayoutHeight()) <= contentHeight) {
                        int layoutWidth2 = next.getLayoutWidth();
                        next.canDraw = true;
                        next.margin = getAlignTranslation(alignment, layoutWidth, layoutWidth2);
                        contentHeight -= layoutHeight + space;
                        linkedList.add(next);
                    }
                }
            }
            sortItems(linkedList);
            int i4 = 0;
            for (MUStackItem mUStackItem2 : linkedList) {
                int layoutHeight3 = mUStackItem2.getLayoutHeight();
                int layoutWidth3 = mUStackItem2.getLayoutWidth();
                if (xuuVar != null) {
                    mUStackItem2.updateLayoutState(xuuVar, mUStackItem2.margin + i, i2 + i4);
                }
                Rect rect = mUStackItem2.drawRect;
                int i5 = mUStackItem2.margin;
                rect.set(i5, i4, layoutWidth3 + i5, i4 + layoutHeight3);
                i4 += layoutHeight3 + space;
            }
            return;
        }
        int contentWidth = getContentWidth();
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            List<MUStackItem> valueAt2 = sparseArray.valueAt(size2);
            if (valueAt2 != null) {
                for (MUStackItem mUStackItem3 : valueAt2) {
                    int layoutWidth4 = mUStackItem3.getLayoutWidth();
                    if (mUStackItem3.getLayoutWidth() <= contentWidth) {
                        int layoutHeight4 = mUStackItem3.getLayoutHeight();
                        mUStackItem3.canDraw = true;
                        mUStackItem3.margin = getAlignTranslation(alignment, layoutHeight2, layoutHeight4);
                        contentWidth -= layoutWidth4 + space;
                        linkedList.add(mUStackItem3);
                    }
                }
            }
        }
        sortItems(linkedList);
        JSONArray jSONArray = new JSONArray(linkedList.size());
        int i6 = 0;
        for (MUStackItem mUStackItem4 : linkedList) {
            int layoutHeight5 = mUStackItem4.getLayoutHeight();
            int layoutWidth5 = mUStackItem4.getLayoutWidth();
            if (xuuVar != null) {
                mUStackItem4.updateLayoutState(xuuVar, i + i6, mUStackItem4.margin + i2);
            }
            Rect rect2 = mUStackItem4.drawRect;
            int i7 = mUStackItem4.margin;
            rect2.set(i6, i7, i6 + layoutWidth5, layoutHeight5 + i7);
            i6 += layoutWidth5 + space;
            String itemKey = mUStackItem4.getItemKey();
            if (itemKey != null) {
                jSONArray.add(itemKey);
            }
        }
        setExtra("items", jSONArray);
    }

    private int getSpace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c67ff3ca", new Object[]{this})).intValue();
        }
        Object attribute = getAttribute(ATTR_SPACE);
        if (attribute instanceof Integer) {
            return ((Integer) attribute).intValue();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r7.equals("center") != false) goto L_0x0055;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    @com.taobao.android.weex_framework.ui.MUSNodeProp(name = com.taobao.search.musie.stack.MUStack.ATTR_ALIGNMENT)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAlignment(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.search.musie.stack.MUStack.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "8e7d2f72"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            java.lang.String r3 = "alignment"
            if (r7 != 0) goto L_0x0021
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r6.setAttribute(r3, r7)
            return
        L_0x0021:
            int r4 = r7.hashCode()
            r5 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r4 == r5) goto L_0x004b
            r1 = 50359046(0x3006b06, float:3.7738676E-37)
            if (r4 == r1) goto L_0x0040
            r1 = 1276059676(0x4c0f201c, float:3.7519472E7)
            if (r4 == r1) goto L_0x0035
            goto L_0x0054
        L_0x0035:
            java.lang.String r1 = "trailing"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0040:
            java.lang.String r1 = "leading"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0054
            r1 = 2
            goto L_0x0055
        L_0x004b:
            java.lang.String r4 = "center"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r1 = -1
        L_0x0055:
            if (r1 == 0) goto L_0x006a
            if (r1 == r0) goto L_0x0061
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r6.setAttribute(r3, r7)
            goto L_0x0071
        L_0x0061:
            r7 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.setAttribute(r3, r7)
            goto L_0x0071
        L_0x006a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r6.setAttribute(r3, r7)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.stack.MUStack.setAlignment(java.lang.String):void");
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
            return;
        }
        validOrThrow(uINode);
        ((MUStackItem) uINode).parent = this;
        super.addChild(i, uINode);
    }
}
