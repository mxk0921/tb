package com.taobao.weex.dom;

import android.text.Layout;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.Constants;
import com.taobao.weex.dom.binding.ELUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXStyle implements Map<String, Object>, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TEXT_DEFAULT_SIZE = 32;
    public static final int UNSET = -1;
    private static final long serialVersionUID = 611132641365274134L;
    private ArrayMap<String, Object> mBindingStyle;
    private Map<String, Object> mPesudoResetStyleMap;
    private Map<String, Map<String, Object>> mPesudoStyleMap;
    private Map<String, Object> mStyles;

    static {
        t2o.a(985661600);
    }

    public WXStyle() {
        this.mStyles = new ConcurrentHashMap();
    }

    private boolean addBindingStyleIfStatement(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70833056", new Object[]{this, str, obj})).booleanValue();
        }
        if (!ELUtils.isBinding(obj)) {
            return false;
        }
        if (this.mBindingStyle == null) {
            this.mBindingStyle = new ArrayMap<>();
        }
        this.mBindingStyle.put(str, ELUtils.bindingBlock(obj));
        return true;
    }

    public static String getFontFamily(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe05204b", new Object[]{map});
        }
        if (map == null || (obj = map.get("fontFamily")) == null) {
            return null;
        }
        return obj.toString();
    }

    public static int getFontSize(WXSDKInstance wXSDKInstance, Map<String, Object> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2c53272", new Object[]{wXSDKInstance, map, new Integer(i)})).intValue();
        }
        if (map == null) {
            return (int) WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, 32.0f, i);
        }
        int i2 = WXUtils.getInt(map.get("fontSize"));
        if (i2 <= 0) {
            i2 = 32;
        }
        return (int) WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, i2, i);
    }

    public static int getFontWeight(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17de3554", new Object[]{map})).intValue();
        }
        if (map == null || (obj = map.get("fontWeight")) == null) {
            return 0;
        }
        String obj2 = obj.toString();
        obj2.hashCode();
        char c = 65535;
        switch (obj2.hashCode()) {
            case 53430:
                if (obj2.equals("600")) {
                    c = 0;
                    break;
                }
                break;
            case 54391:
                if (obj2.equals("700")) {
                    c = 1;
                    break;
                }
                break;
            case 55352:
                if (obj2.equals("800")) {
                    c = 2;
                    break;
                }
                break;
            case 56313:
                if (obj2.equals("900")) {
                    c = 3;
                    break;
                }
                break;
            case 3029637:
                if (obj2.equals("bold")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    public static int getLineHeight(WXSDKInstance wXSDKInstance, Map<String, Object> map, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4287fcc7", new Object[]{wXSDKInstance, map, new Integer(i)})).intValue();
        }
        if (map != null && (i2 = WXUtils.getInt(map.get("lineHeight"))) > 0) {
            return (int) WXViewInnerUtils.getRealPxByWidth(wXSDKInstance, i2, i);
        }
        return -1;
    }

    public static int getLines(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("587ee428", new Object[]{map})).intValue();
        }
        return WXUtils.getInt(map.get(Constants.Name.LINES));
    }

    public static Layout.Alignment getTextAlignment(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Layout.Alignment) ipChange.ipc$dispatch("9a912944", new Object[]{map}) : getTextAlignment(map, false);
    }

    public static String getTextColor(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb5c7bc2", new Object[]{map});
        }
        if (map == null || (obj = map.get("color")) == null) {
            return "";
        }
        return obj.toString();
    }

    public static TextUtils.TruncateAt getTextOverflow(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextUtils.TruncateAt) ipChange.ipc$dispatch("78d12f6f", new Object[]{map});
        }
        if (TextUtils.equals("ellipsis", (String) map.get("textOverflow"))) {
            return TextUtils.TruncateAt.END;
        }
        return null;
    }

    private void initPesudoMapsIfNeed(Map<? extends String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27f6d22", new Object[]{this, map});
            return;
        }
        if (this.mPesudoStyleMap == null) {
            this.mPesudoStyleMap = new ArrayMap();
        }
        if (this.mPesudoResetStyleMap == null) {
            this.mPesudoResetStyleMap = new ArrayMap();
        }
        if (this.mPesudoResetStyleMap.isEmpty()) {
            this.mPesudoResetStyleMap.putAll(map);
        }
    }

    private Map<String, Object> parseBindingStylesStatements(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9bb244fb", new Object[]{this, map});
        }
        if (!(map == null || map.size() == 0)) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (addBindingStyleIfStatement((String) entry.getKey(), entry.getValue())) {
                    Map<String, Map<String, Object>> map2 = this.mPesudoStyleMap;
                    if (map2 != null) {
                        map2.remove(entry.getKey());
                    }
                    Map<String, Object> map3 = this.mPesudoResetStyleMap;
                    if (map3 != null) {
                        map3.remove(entry.getKey());
                    }
                    it.remove();
                }
            }
        }
        return map;
    }

    @Override // java.util.Map
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mStyles.clear();
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, obj})).booleanValue();
        }
        return this.mStyles.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, obj})).booleanValue();
        }
        return this.mStyles.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("b3acf2c6", new Object[]{this});
        }
        return this.mStyles.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        return this.mStyles.equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, obj});
        }
        return this.mStyles.get(obj);
    }

    public String getBackgroundColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66ad4fba", new Object[]{this});
        }
        Object obj = get("backgroundColor");
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    public ArrayMap<String, Object> getBindingStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("7b473cae", new Object[]{this});
        }
        return this.mBindingStyle;
    }

    public String getBlur() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("442eb23c", new Object[]{this});
        }
        if (get("filter") == null) {
            return null;
        }
        return get("filter").toString().trim();
    }

    public String getBorderColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("925d3838", new Object[]{this});
        }
        Object obj = get("borderColor");
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public float getBorderRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("909bc8cb", new Object[]{this})).floatValue();
        }
        float f = WXUtils.getFloat(get("borderRadius"));
        if (WXUtils.isUndefined(f)) {
            return Float.NaN;
        }
        return f;
    }

    public String getBorderStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d98e6aa", new Object[]{this});
        }
        Object obj = get("borderStyle");
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public float getBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e4c918", new Object[]{this})).floatValue();
        }
        float f = WXUtils.getFloat(get("bottom"));
        if (WXUtils.isUndefined(f)) {
            return Float.NaN;
        }
        return f;
    }

    public float getLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2350674", new Object[]{this})).floatValue();
        }
        float f = WXUtils.getFloat(get("left"));
        if (WXUtils.isUndefined(f)) {
            return Float.NaN;
        }
        return f;
    }

    public float getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cc", new Object[]{this})).floatValue();
        }
        Object obj = get("opacity");
        if (obj == null) {
            return 1.0f;
        }
        return WXUtils.getFloat(obj);
    }

    public String getOverflow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f01f5881", new Object[]{this});
        }
        Object obj = get("overflow");
        if (obj == null) {
            return "visible";
        }
        return obj.toString();
    }

    public Map<String, Object> getPesudoResetStyles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("62db8d55", new Object[]{this});
        }
        if (this.mPesudoResetStyleMap == null) {
            this.mPesudoResetStyleMap = new ArrayMap();
        }
        return this.mPesudoResetStyleMap;
    }

    public Map<String, Map<String, Object>> getPesudoStyles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7434d7d6", new Object[]{this});
        }
        if (this.mPesudoStyleMap == null) {
            this.mPesudoStyleMap = new ArrayMap();
        }
        return this.mPesudoStyleMap;
    }

    public float getRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d449dd", new Object[]{this})).floatValue();
        }
        float f = WXUtils.getFloat(get("right"));
        if (WXUtils.isUndefined(f)) {
            return Float.NaN;
        }
        return f;
    }

    public int getTimeFontSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a1704d", new Object[]{this})).intValue();
        }
        int i = WXUtils.getInt(get("timeFontSize"));
        if (i <= 0) {
            return 32;
        }
        return i;
    }

    public float getTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9c9cf16", new Object[]{this})).floatValue();
        }
        float f = WXUtils.getFloat(get("top"));
        if (WXUtils.isUndefined(f)) {
            return Float.NaN;
        }
        return f;
    }

    @Override // java.util.Map
    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.mStyles.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.mStyles.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
        }
        return this.mStyles.keySet();
    }

    public void parseStatements() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0328fe", new Object[]{this});
            return;
        }
        Map<String, Object> map = this.mStyles;
        if (map != null) {
            this.mStyles = parseBindingStylesStatements(map);
        }
    }

    public <T extends String, V> void processPesudoClasses(Map<T, V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571b5449", new Object[]{this, map});
            return;
        }
        ArrayMap arrayMap = null;
        for (Map.Entry<T, V> entry : map.entrySet()) {
            T key = entry.getKey();
            int indexOf = key.indexOf(":");
            if (indexOf > 0) {
                initPesudoMapsIfNeed(map);
                String substring = key.substring(indexOf);
                if (substring.equals(Constants.PSEUDO.ENABLED)) {
                    String substring2 = key.substring(0, indexOf);
                    if (arrayMap == null) {
                        arrayMap = new ArrayMap();
                    }
                    arrayMap.put(substring2, entry.getValue());
                    this.mPesudoResetStyleMap.put(substring2, entry.getValue());
                } else {
                    String replace = substring.replace(Constants.PSEUDO.ENABLED, "");
                    Map<String, Object> map2 = this.mPesudoStyleMap.get(replace);
                    if (map2 == null) {
                        map2 = new ArrayMap<>();
                        this.mPesudoStyleMap.put(replace, map2);
                    }
                    map2.put(key.substring(0, indexOf), entry.getValue());
                }
            }
        }
        if (!(arrayMap == null || arrayMap.isEmpty())) {
            putAll(arrayMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6703aacc", new Object[]{this, map});
            return;
        }
        for (Map.Entry<? extends String, ? extends Object> entry : map.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null)) {
                this.mStyles.put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, obj});
        }
        return this.mStyles.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.mStyles.size();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.mStyles.toString();
    }

    public void updateStyle(Map<? extends String, ?> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6fa4de", new Object[]{this, map, new Boolean(z)});
            return;
        }
        parseBindingStylesStatements(map);
        putAll(map, z);
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("26a6afbe", new Object[]{this});
        }
        return this.mStyles.values();
    }

    public static int getFontStyle(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc0faca5", new Object[]{map})).intValue();
        }
        return (map == null || (obj = map.get("fontStyle")) == null || !obj.toString().equals("italic")) ? 0 : 2;
    }

    public static Layout.Alignment getTextAlignment(Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout.Alignment) ipChange.ipc$dispatch("1564ac9c", new Object[]{map, new Boolean(z)});
        }
        Layout.Alignment alignment = z ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        String str = (String) map.get(Constants.Name.TEXT_ALIGN);
        if (TextUtils.equals("left", str)) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (TextUtils.equals("center", str)) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        return TextUtils.equals("right", str) ? Layout.Alignment.ALIGN_OPPOSITE : alignment;
    }

    public WXStyle clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXStyle) ipChange.ipc$dispatch("4086deed", new Object[]{this});
        }
        WXStyle wXStyle = new WXStyle();
        wXStyle.putAll(this.mStyles);
        ArrayMap<String, Object> arrayMap = this.mBindingStyle;
        if (arrayMap != null) {
            wXStyle.mBindingStyle = new ArrayMap<>(arrayMap);
        }
        if (this.mPesudoStyleMap != null) {
            wXStyle.mPesudoStyleMap = new ArrayMap();
            for (Map.Entry<String, Map<String, Object>> entry : this.mPesudoStyleMap.entrySet()) {
                ArrayMap arrayMap2 = new ArrayMap();
                arrayMap2.putAll(entry.getValue());
                wXStyle.mPesudoStyleMap.put(entry.getKey(), arrayMap2);
            }
        }
        if (this.mPesudoResetStyleMap != null) {
            ArrayMap arrayMap3 = new ArrayMap();
            wXStyle.mPesudoResetStyleMap = arrayMap3;
            arrayMap3.putAll(this.mPesudoResetStyleMap);
        }
        return wXStyle;
    }

    public boolean isFixed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72b8d3f5", new Object[]{this})).booleanValue();
        }
        Object obj = get("position");
        if (obj == null) {
            return false;
        }
        return obj.toString().equals("fixed");
    }

    public boolean isSticky() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b2496be", new Object[]{this})).booleanValue();
        }
        Object obj = get("position");
        if (obj == null) {
            return false;
        }
        return obj.toString().equals("sticky");
    }

    public Object put(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fd14d676", new Object[]{this, str, obj});
        }
        if (addBindingStyleIfStatement(str, obj) || str == null || obj == null) {
            return null;
        }
        return this.mStyles.put(str, obj);
    }

    public WXStyle(Map<String, Object> map) {
        this();
        putAll(map);
        processPesudoClasses(this.mStyles);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r4.equals(tb.pg1.ATOM_EXT_UDL_line_through) == false) goto L_0x0030;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.weex.ui.component.WXTextDecoration getTextDecoration(java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.weex.dom.WXStyle.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "4d5fdcec"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            com.taobao.weex.ui.component.WXTextDecoration r4 = (com.taobao.weex.ui.component.WXTextDecoration) r4
            return r4
        L_0x0015:
            if (r4 == 0) goto L_0x0063
            java.lang.String r2 = "textDecoration"
            java.lang.Object r4 = r4.get(r2)
            if (r4 != 0) goto L_0x0021
            goto L_0x0063
        L_0x0021:
            java.lang.String r4 = r4.toString()
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case -1171789332: goto L_0x004a;
                case -1026963764: goto L_0x003e;
                case 3387192: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            r0 = -1
            goto L_0x0054
        L_0x0032:
            java.lang.String r0 = "none"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x003c
            goto L_0x0030
        L_0x003c:
            r0 = 2
            goto L_0x0054
        L_0x003e:
            java.lang.String r0 = "underline"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0048
            goto L_0x0030
        L_0x0048:
            r0 = 1
            goto L_0x0054
        L_0x004a:
            java.lang.String r1 = "line-through"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0054
            goto L_0x0030
        L_0x0054:
            switch(r0) {
                case 0: goto L_0x0060;
                case 1: goto L_0x005d;
                case 2: goto L_0x005a;
                default: goto L_0x0057;
            }
        L_0x0057:
            com.taobao.weex.ui.component.WXTextDecoration r4 = com.taobao.weex.ui.component.WXTextDecoration.INVALID
            goto L_0x0065
        L_0x005a:
            com.taobao.weex.ui.component.WXTextDecoration r4 = com.taobao.weex.ui.component.WXTextDecoration.NONE
            goto L_0x0065
        L_0x005d:
            com.taobao.weex.ui.component.WXTextDecoration r4 = com.taobao.weex.ui.component.WXTextDecoration.UNDERLINE
            goto L_0x0065
        L_0x0060:
            com.taobao.weex.ui.component.WXTextDecoration r4 = com.taobao.weex.ui.component.WXTextDecoration.LINETHROUGH
            goto L_0x0065
        L_0x0063:
            com.taobao.weex.ui.component.WXTextDecoration r4 = com.taobao.weex.ui.component.WXTextDecoration.NONE
        L_0x0065:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.dom.WXStyle.getTextDecoration(java.util.Map):com.taobao.weex.ui.component.WXTextDecoration");
    }

    public void putAll(Map<? extends String, ?> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79726188", new Object[]{this, map, new Boolean(z)});
            return;
        }
        putAll(map);
        if (!z) {
            processPesudoClasses(map);
        }
    }

    public WXStyle(Map<String, Object> map, boolean z) {
        this();
        putAll(map, z);
    }
}
