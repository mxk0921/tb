package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class GradientColorInflaterCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int TILE_MODE_CLAMP = 0;
    private static final int TILE_MODE_MIRROR = 2;
    private static final int TILE_MODE_REPEAT = 1;

    private GradientColorInflaterCompat() {
    }

    private static ColorStops checkColors(ColorStops colorStops, int i, int i2, boolean z, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStops) ipChange.ipc$dispatch("a622a768", new Object[]{colorStops, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3)});
        }
        if (colorStops != null) {
            return colorStops;
        }
        if (z) {
            return new ColorStops(i, i3, i2);
        }
        return new ColorStops(i, i2);
    }

    public static Shader createFromXml(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shader) ipChange.ipc$dispatch("9e2031f1", new Object[]{resources, xmlPullParser, theme});
        }
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return createFromXmlInner(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    private static Shader.TileMode parseTileMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shader.TileMode) ipChange.ipc$dispatch("9bfdaf81", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r13.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.core.content.res.GradientColorInflaterCompat.ColorStops inflateChildElements(android.content.res.Resources r12, org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.core.content.res.GradientColorInflaterCompat.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001e
            java.lang.String r5 = "ac032e3e"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r12
            r6[r2] = r13
            r6[r1] = r14
            r6[r0] = r15
            java.lang.Object r12 = r4.ipc$dispatch(r5, r6)
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r12 = (androidx.core.content.res.GradientColorInflaterCompat.ColorStops) r12
            return r12
        L_0x001e:
            int r4 = r13.getDepth()
            int r4 = r4 + r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 20
            r5.<init>(r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
        L_0x002f:
            int r6 = r13.next()
            if (r6 == r2) goto L_0x009c
            int r8 = r13.getDepth()
            if (r8 >= r4) goto L_0x003d
            if (r6 == r0) goto L_0x009c
        L_0x003d:
            if (r6 == r1) goto L_0x0040
            goto L_0x002f
        L_0x0040:
            if (r8 > r4) goto L_0x002f
            java.lang.String r6 = r13.getName()
            java.lang.String r8 = "item"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0050
            goto L_0x002f
        L_0x0050:
            int[] r6 = com.taobao.taobao.R.styleable.GradientColorItem
            android.content.res.TypedArray r6 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r12, r15, r14, r6)
            int r8 = com.taobao.taobao.R.styleable.GradientColorItem_android_color
            boolean r9 = r6.hasValue(r8)
            int r10 = com.taobao.taobao.R.styleable.GradientColorItem_android_offset
            boolean r11 = r6.hasValue(r10)
            if (r9 == 0) goto L_0x0081
            if (r11 == 0) goto L_0x0081
            int r8 = r6.getColor(r8, r3)
            r9 = 0
            float r9 = r6.getFloat(r10, r9)
            r6.recycle()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r7.add(r6)
            java.lang.Float r6 = java.lang.Float.valueOf(r9)
            r5.add(r6)
            goto L_0x002f
        L_0x0081:
            org.xmlpull.v1.XmlPullParserException r12 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r14.append(r13)
            java.lang.String r13 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            throw r12
        L_0x009c:
            int r12 = r7.size()
            if (r12 <= 0) goto L_0x00a8
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r12 = new androidx.core.content.res.GradientColorInflaterCompat$ColorStops
            r12.<init>(r7, r5)
            return r12
        L_0x00a8:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.GradientColorInflaterCompat.inflateChildElements(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.GradientColorInflaterCompat$ColorStops");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class ColorStops {
        public final int[] mColors;
        public final float[] mOffsets;

        public ColorStops(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.mColors = new int[size];
            this.mOffsets = new float[size];
            for (int i = 0; i < size; i++) {
                this.mColors[i] = list.get(i).intValue();
                this.mOffsets[i] = list2.get(i).floatValue();
            }
        }

        public ColorStops(int i, int i2) {
            this.mColors = new int[]{i, i2};
            this.mOffsets = new float[]{0.0f, 1.0f};
        }

        public ColorStops(int i, int i2, int i3) {
            this.mColors = new int[]{i, i2, i3};
            this.mOffsets = new float[]{0.0f, 0.5f, 1.0f};
        }
    }

    public static Shader createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shader) ipChange.ipc$dispatch("59a553f5", new Object[]{resources, xmlPullParser, attributeSet, theme});
        }
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, R.styleable.GradientColor);
            float namedFloat = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "startX", R.styleable.GradientColor_android_startX, 0.0f);
            float namedFloat2 = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "startY", R.styleable.GradientColor_android_startY, 0.0f);
            float namedFloat3 = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "endX", R.styleable.GradientColor_android_endX, 0.0f);
            float namedFloat4 = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "endY", R.styleable.GradientColor_android_endY, 0.0f);
            float namedFloat5 = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "centerX", R.styleable.GradientColor_android_centerX, 0.0f);
            float namedFloat6 = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "centerY", R.styleable.GradientColor_android_centerY, 0.0f);
            int namedInt = TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "type", R.styleable.GradientColor_android_type, 0);
            int namedColor = TypedArrayUtils.getNamedColor(obtainAttributes, xmlPullParser, "startColor", R.styleable.GradientColor_android_startColor, 0);
            boolean hasAttribute = TypedArrayUtils.hasAttribute(xmlPullParser, "centerColor");
            int namedColor2 = TypedArrayUtils.getNamedColor(obtainAttributes, xmlPullParser, "centerColor", R.styleable.GradientColor_android_centerColor, 0);
            int namedColor3 = TypedArrayUtils.getNamedColor(obtainAttributes, xmlPullParser, "endColor", R.styleable.GradientColor_android_endColor, 0);
            int namedInt2 = TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "tileMode", R.styleable.GradientColor_android_tileMode, 0);
            float namedFloat7 = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "gradientRadius", R.styleable.GradientColor_android_gradientRadius, 0.0f);
            obtainAttributes.recycle();
            ColorStops checkColors = checkColors(inflateChildElements(resources, xmlPullParser, attributeSet, theme), namedColor, namedColor3, hasAttribute, namedColor2);
            if (namedInt != 1) {
                if (namedInt != 2) {
                    return new LinearGradient(namedFloat, namedFloat2, namedFloat3, namedFloat4, checkColors.mColors, checkColors.mOffsets, parseTileMode(namedInt2));
                }
                return new SweepGradient(namedFloat5, namedFloat6, checkColors.mColors, checkColors.mOffsets);
            } else if (namedFloat7 > 0.0f) {
                return new RadialGradient(namedFloat5, namedFloat6, namedFloat7, checkColors.mColors, checkColors.mOffsets, parseTileMode(namedInt2));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }
}
