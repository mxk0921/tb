package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.animation.TransformParser;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nj6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int METHOD_ROTATE = 4;
    public static final int METHOD_ROTATE_Z = 5;
    public static final int METHOD_SCALE = 6;
    public static final int METHOD_SCALE_X = 7;
    public static final int METHOD_SCALE_Y = 8;
    public static final int METHOD_TRANSLATE = 0;
    public static final int METHOD_TRANSLATE_3D = 1;
    public static final int METHOD_TRANSLATE_X = 2;
    public static final int METHOD_TRANSLATE_Y = 3;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f24771a;
        public final float[] b;

        static {
            t2o.a(444597495);
        }

        public a(int i, float[] fArr) {
            this.f24771a = i;
            this.b = fArr;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TransformProp{method=" + this.f24771a + ", args=" + Arrays.toString(this.b) + '}';
        }
    }

    static {
        t2o.a(444597494);
    }

    public static List<a> b(String str) {
        LinkedList linkedList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2ffdc739", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        float[] fArr = new float[3];
        Arrays.fill(fArr, Float.NaN);
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == ' ') {
                i++;
            } else if (!z) {
                if (charAt == '(') {
                    i2 = a(str.substring(i, i4).trim());
                    i = i4 + 1;
                    z = true;
                }
            } else if (!z) {
                continue;
            } else if (charAt == ',') {
                float c = c(str.substring(i, i4).trim(), i2, i3);
                if (i3 < 3) {
                    fArr[i3] = c;
                    i3++;
                    i = i4 + 1;
                } else {
                    throw new IllegalArgumentException("Invalid Transform args, too many args: ".concat(str));
                }
            } else if (charAt == ')') {
                float c2 = c(str.substring(i, i4).trim(), i2, i3);
                if (i3 < 3) {
                    fArr[i3] = c2;
                    linkedList2.add(new a(i2, fArr));
                    float[] fArr2 = new float[3];
                    Arrays.fill(fArr2, Float.NaN);
                    i = i4 + 1;
                    fArr = fArr2;
                    z = false;
                    i2 = -1;
                    i3 = 0;
                } else {
                    throw new IllegalArgumentException("Invalid Transform args, too many args: ".concat(str));
                }
            } else {
                continue;
            }
        }
        if (linkedList2.isEmpty()) {
            linkedList = null;
        } else {
            linkedList = linkedList2;
        }
        if (linkedList != null || TextUtils.isEmpty(str.trim())) {
            return linkedList;
        }
        throw new IllegalArgumentException("Invalid Transform format: ".concat(str));
    }

    public static float c(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95765f1f", new Object[]{str, new Integer(i), new Integer(i2)})).floatValue();
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return Float.parseFloat(str);
            case 4:
            case 5:
                if (str.endsWith("deg")) {
                    return Float.parseFloat(str.substring(0, str.length() - 3));
                }
                throw new IllegalArgumentException("Invalid Transform deg arg: ".concat(str));
            case 6:
            case 7:
            case 8:
                return Float.parseFloat(str);
            default:
                throw new IllegalArgumentException("Invalid Transform method: " + i);
        }
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13172375", new Object[]{str})).intValue();
        }
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1840653217:
                    if (str.equals("translate3d")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1721943862:
                    if (str.equals("translateX")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1721943861:
                    if (str.equals("translateY")) {
                        c = 2;
                        break;
                    }
                    break;
                case -925180581:
                    if (str.equals("rotate")) {
                        c = 3;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 4;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 5;
                        break;
                    }
                    break;
                case 109250890:
                    if (str.equals("scale")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1052832078:
                    if (str.equals("translate")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1384173151:
                    if (str.equals(TransformParser.WX_ROTATE_Z)) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 7;
                case 5:
                    return 8;
                case 6:
                    return 6;
                case 7:
                    return 0;
                case '\b':
                    return 5;
                default:
                    throw new IllegalArgumentException("Invalid Transform method: ".concat(str));
            }
        } else {
            throw new IllegalArgumentException("Invalid Transform method: " + str);
        }
    }
}
