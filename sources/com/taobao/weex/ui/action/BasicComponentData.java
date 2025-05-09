package com.taobao.weex.ui.action;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.dom.WXEvent;
import com.taobao.weex.dom.WXStyle;
import com.taobao.weex.ui.component.list.template.jni.NativeRenderObjectUtils;
import com.taobao.weex.utils.WXUtils;
import java.util.Map;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BasicComponentData<T extends View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WXAttr mAttributes;
    private CSSShorthand mBorders;
    public String mComponentType;
    private WXEvent mEvents;
    private CSSShorthand mMargins;
    private CSSShorthand mPaddings;
    public String mParentRef;
    public String mRef;
    private WXStyle mStyles;
    private long renderObjectPr = 0;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.weex.ui.action.BasicComponentData$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$weex$dom$CSSShorthand$TYPE;

        static {
            int[] iArr = new int[CSSShorthand.TYPE.values().length];
            $SwitchMap$com$taobao$weex$dom$CSSShorthand$TYPE = iArr;
            try {
                iArr[CSSShorthand.TYPE.MARGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$weex$dom$CSSShorthand$TYPE[CSSShorthand.TYPE.PADDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$weex$dom$CSSShorthand$TYPE[CSSShorthand.TYPE.BORDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(985661657);
    }

    public BasicComponentData(String str, String str2, String str3) {
        this.mRef = str;
        this.mComponentType = str2;
        this.mParentRef = str3;
    }

    private void addBorder(CSSShorthand.EDGE edge, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18fdde84", new Object[]{this, edge, new Float(f)});
            return;
        }
        if (this.mBorders == null) {
            this.mBorders = new CSSShorthand();
        }
        this.mBorders.set(edge, f);
    }

    private void addMargin(CSSShorthand.EDGE edge, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8b3506", new Object[]{this, edge, new Float(f)});
            return;
        }
        if (this.mMargins == null) {
            this.mMargins = new CSSShorthand();
        }
        this.mMargins.set(edge, f);
    }

    private void addPadding(CSSShorthand.EDGE edge, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9759e07", new Object[]{this, edge, new Float(f)});
            return;
        }
        if (this.mPaddings == null) {
            this.mPaddings = new CSSShorthand();
        }
        this.mPaddings.set(edge, f);
    }

    public final void addAttr(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35368ac", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            WXAttr wXAttr = this.mAttributes;
            if (wXAttr == null) {
                this.mAttributes = new WXAttr(map, 0);
            } else {
                wXAttr.putAll(map);
            }
        }
    }

    public final void addEvent(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44fa683f", new Object[]{this, set});
        } else if (set != null && !set.isEmpty()) {
            if (this.mEvents == null) {
                this.mEvents = new WXEvent();
            }
            this.mEvents.addAll(set);
        }
    }

    public final void addShorthand(float[] fArr, CSSShorthand.TYPE type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a640f7", new Object[]{this, fArr, type});
            return;
        }
        if (fArr == null) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        }
        if (fArr.length == 4) {
            int i = AnonymousClass1.$SwitchMap$com$taobao$weex$dom$CSSShorthand$TYPE[type.ordinal()];
            if (i == 1) {
                CSSShorthand cSSShorthand = this.mMargins;
                if (cSSShorthand == null) {
                    this.mMargins = new CSSShorthand(fArr);
                } else {
                    cSSShorthand.replace(fArr);
                }
            } else if (i == 2) {
                CSSShorthand cSSShorthand2 = this.mPaddings;
                if (cSSShorthand2 == null) {
                    this.mPaddings = new CSSShorthand(fArr);
                } else {
                    cSSShorthand2.replace(fArr);
                }
            } else if (i == 3) {
                CSSShorthand cSSShorthand3 = this.mBorders;
                if (cSSShorthand3 == null) {
                    this.mBorders = new CSSShorthand(fArr);
                } else {
                    cSSShorthand3.replace(fArr);
                }
            }
        }
    }

    public void addStyle(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44fadc8e", new Object[]{this, map});
        } else {
            addStyle(map, false);
        }
    }

    public final WXAttr getAttrs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXAttr) ipChange.ipc$dispatch("e2b4aa58", new Object[]{this});
        }
        if (this.mAttributes == null) {
            this.mAttributes = new WXAttr();
        }
        return this.mAttributes;
    }

    public CSSShorthand getBorder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CSSShorthand) ipChange.ipc$dispatch("902d3b8c", new Object[]{this});
        }
        if (this.mBorders == null) {
            this.mBorders = new CSSShorthand();
        }
        return this.mBorders;
    }

    public final WXEvent getEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXEvent) ipChange.ipc$dispatch("9d1805d6", new Object[]{this});
        }
        if (this.mEvents == null) {
            this.mEvents = new WXEvent();
        }
        return this.mEvents;
    }

    public final CSSShorthand getMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CSSShorthand) ipChange.ipc$dispatch("a687534a", new Object[]{this});
        }
        if (this.mMargins == null) {
            this.mMargins = new CSSShorthand();
        }
        return this.mMargins;
    }

    public final CSSShorthand getPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CSSShorthand) ipChange.ipc$dispatch("5e728a73", new Object[]{this});
        }
        if (this.mPaddings == null) {
            this.mPaddings = new CSSShorthand();
        }
        return this.mPaddings;
    }

    public long getRenderObjectPr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80a1ec48", new Object[]{this})).longValue();
        }
        return this.renderObjectPr;
    }

    public final WXStyle getStyles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXStyle) ipChange.ipc$dispatch("92801168", new Object[]{this});
        }
        if (this.mStyles == null) {
            this.mStyles = new WXStyle();
        }
        return this.mStyles;
    }

    public boolean isRenderPtrEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("527beb8a", new Object[]{this})).booleanValue();
        }
        if (this.renderObjectPr == 0) {
            return true;
        }
        return false;
    }

    public final void setBorders(CSSShorthand cSSShorthand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d6a10b", new Object[]{this, cSSShorthand});
        } else {
            this.mBorders = cSSShorthand;
        }
    }

    public final void setMargins(CSSShorthand cSSShorthand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3909c149", new Object[]{this, cSSShorthand});
        } else {
            this.mMargins = cSSShorthand;
        }
    }

    public final void setPaddings(CSSShorthand cSSShorthand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f773ca", new Object[]{this, cSSShorthand});
        } else {
            this.mPaddings = cSSShorthand;
        }
    }

    public synchronized void setRenderObjectPr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e0d464", new Object[]{this, new Long(j)});
            return;
        }
        long j2 = this.renderObjectPr;
        if (j2 != j) {
            if (j2 == 0) {
                this.renderObjectPr = j;
            } else {
                throw new RuntimeException("RenderObjectPr has " + j + " old renderObjectPtr " + this.renderObjectPr);
            }
        }
    }

    public final void addStyle(Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a616806", new Object[]{this, map, new Boolean(z)});
        } else if (map != null && !map.isEmpty()) {
            WXStyle wXStyle = this.mStyles;
            if (wXStyle == null) {
                this.mStyles = new WXStyle(map);
            } else {
                wXStyle.putAll(map, z);
            }
        }
    }

    public BasicComponentData clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasicComponentData) ipChange.ipc$dispatch("9852e84f", new Object[]{this});
        }
        BasicComponentData basicComponentData = new BasicComponentData(this.mRef, this.mComponentType, this.mParentRef);
        basicComponentData.setBorders(getBorder().clone());
        basicComponentData.setMargins(getMargin().clone());
        basicComponentData.setPaddings(getPadding().clone());
        WXAttr wXAttr = this.mAttributes;
        if (wXAttr != null) {
            basicComponentData.mAttributes = wXAttr.clone();
        }
        WXStyle wXStyle = this.mStyles;
        if (wXStyle != null) {
            basicComponentData.mStyles = wXStyle.clone();
        }
        WXEvent wXEvent = this.mEvents;
        if (wXEvent != null) {
            basicComponentData.mEvents = wXEvent.clone();
        }
        long j = this.renderObjectPr;
        if (j != 0) {
            basicComponentData.setRenderObjectPr(NativeRenderObjectUtils.nativeCopyRenderObject(j));
        }
        return basicComponentData;
    }

    public final void addShorthand(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b57c94", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                key.hashCode();
                char c = 65535;
                switch (key.hashCode()) {
                    case -1971292586:
                        if (key.equals("borderRightWidth")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1501175880:
                        if (key.equals("paddingLeft")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1452542531:
                        if (key.equals("borderTopWidth")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1290574193:
                        if (key.equals("borderBottomWidth")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1081309778:
                        if (key.equals("margin")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1044792121:
                        if (key.equals("marginTop")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -806339567:
                        if (key.equals("padding")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -289173127:
                        if (key.equals("marginBottom")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -223992013:
                        if (key.equals("borderLeftWidth")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 90130308:
                        if (key.equals("paddingTop")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 202355100:
                        if (key.equals("paddingBottom")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 713848971:
                        if (key.equals("paddingRight")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 741115130:
                        if (key.equals("borderWidth")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 975087886:
                        if (key.equals("marginRight")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case 1970934485:
                        if (key.equals("marginLeft")) {
                            c = 14;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        addBorder(CSSShorthand.EDGE.RIGHT, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case 1:
                        addPadding(CSSShorthand.EDGE.LEFT, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case 2:
                        addBorder(CSSShorthand.EDGE.TOP, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case 3:
                        addBorder(CSSShorthand.EDGE.BOTTOM, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case 4:
                        addMargin(CSSShorthand.EDGE.ALL, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case 5:
                        addMargin(CSSShorthand.EDGE.TOP, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case 6:
                        addPadding(CSSShorthand.EDGE.ALL, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case 7:
                        addMargin(CSSShorthand.EDGE.BOTTOM, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case '\b':
                        addBorder(CSSShorthand.EDGE.LEFT, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case '\t':
                        addPadding(CSSShorthand.EDGE.TOP, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case '\n':
                        addPadding(CSSShorthand.EDGE.BOTTOM, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case 11:
                        addPadding(CSSShorthand.EDGE.RIGHT, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case '\f':
                        addBorder(CSSShorthand.EDGE.ALL, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case '\r':
                        addMargin(CSSShorthand.EDGE.RIGHT, WXUtils.fastGetFloat(map.get(key)));
                        break;
                    case 14:
                        addMargin(CSSShorthand.EDGE.LEFT, WXUtils.fastGetFloat(map.get(key)));
                        break;
                }
            }
        }
    }
}
