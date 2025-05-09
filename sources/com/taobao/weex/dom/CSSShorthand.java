package com.taobao.weex.dom;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Enum;
import java.util.Arrays;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CSSShorthand<T extends Enum<? extends CSSProperty>> implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float[] values;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum CORNER implements CSSProperty {
        BORDER_TOP_LEFT,
        BORDER_TOP_RIGHT,
        BORDER_BOTTOM_RIGHT,
        BORDER_BOTTOM_LEFT,
        ALL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CORNER corner, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/dom/CSSShorthand$CORNER");
        }

        public static CORNER valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CORNER) ipChange.ipc$dispatch("90d63081", new Object[]{str});
            }
            return (CORNER) Enum.valueOf(CORNER.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface CSSProperty {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum EDGE implements CSSProperty {
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        ALL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(EDGE edge, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/dom/CSSShorthand$EDGE");
        }

        public static EDGE valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EDGE) ipChange.ipc$dispatch("3872e0d9", new Object[]{str});
            }
            return (EDGE) Enum.valueOf(EDGE.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TYPE {
        MARGIN,
        PADDING,
        BORDER;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TYPE type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/dom/CSSShorthand$TYPE");
        }

        public static TYPE valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TYPE) ipChange.ipc$dispatch("394feefc", new Object[]{str});
            }
            return (TYPE) Enum.valueOf(TYPE.class, str);
        }
    }

    static {
        t2o.a(985661591);
    }

    public CSSShorthand(float[] fArr) {
        replace(fArr);
    }

    private float getInternal(Enum<? extends CSSProperty> r5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("386fa2c4", new Object[]{this, r5})).floatValue();
        }
        if (r5 == EDGE.ALL || r5 == CORNER.ALL) {
            return 0.0f;
        }
        return this.values[r5.ordinal()];
    }

    private void setInternal(Enum<? extends CSSProperty> r4, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c81de0", new Object[]{this, r4, new Float(f)});
        } else if (r4 == EDGE.ALL || r4 == CORNER.ALL) {
            Arrays.fill(this.values, f);
        } else {
            this.values[r4.ordinal()] = f;
        }
    }

    public float get(EDGE edge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bac2de3", new Object[]{this, edge})).floatValue() : getInternal(edge);
    }

    public final void replace(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2dde46", new Object[]{this, fArr});
        } else {
            this.values = fArr;
        }
    }

    public void set(EDGE edge, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b93c339", new Object[]{this, edge, new Float(f)});
        } else {
            setInternal(edge, f);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.values.toString())) {
            return "";
        }
        return Arrays.toString(this.values);
    }

    public CSSShorthand clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CSSShorthand) ipChange.ipc$dispatch("bb48ce31", new Object[]{this}) : (CSSShorthand) super.clone();
    }

    public float get(CORNER corner) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d55be44b", new Object[]{this, corner})).floatValue() : getInternal(corner);
    }

    public void set(CORNER corner, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09446d1", new Object[]{this, corner, new Float(f)});
        } else {
            setInternal(corner, f);
        }
    }

    public CSSShorthand() {
        this(false);
    }

    public CSSShorthand(boolean z) {
        float[] fArr = new float[Math.max(EDGE.values().length, CORNER.values().length)];
        this.values = fArr;
        if (z) {
            Arrays.fill(fArr, Float.NaN);
        }
    }
}
