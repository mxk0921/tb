package com.taobao.weex.ui.view.border;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.dom.CSSShorthand;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum BorderStyle {
    SOLID,
    DASHED,
    DOTTED;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.weex.ui.view.border.BorderStyle$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$weex$ui$view$border$BorderStyle;

        static {
            int[] iArr = new int[BorderStyle.values().length];
            $SwitchMap$com$taobao$weex$ui$view$border$BorderStyle = iArr;
            try {
                iArr[BorderStyle.DOTTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$weex$ui$view$border$BorderStyle[BorderStyle.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(BorderStyle borderStyle, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/border/BorderStyle");
    }

    public static BorderStyle valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BorderStyle) ipChange.ipc$dispatch("4e46f3e0", new Object[]{str});
        }
        return (BorderStyle) Enum.valueOf(BorderStyle.class, str);
    }

    public Shader getLineShader(float f, int i, CSSShorthand.EDGE edge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shader) ipChange.ipc$dispatch("629f197f", new Object[]{this, new Float(f), new Integer(i), edge});
        }
        int i2 = AnonymousClass1.$SwitchMap$com$taobao$weex$ui$view$border$BorderStyle[ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
        } else if (edge == CSSShorthand.EDGE.LEFT || edge == CSSShorthand.EDGE.RIGHT) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, f * 2.0f, new int[]{i, 0}, new float[]{0.5f, 0.5f}, Shader.TileMode.REPEAT);
        } else {
            if (edge == CSSShorthand.EDGE.TOP || edge == CSSShorthand.EDGE.BOTTOM) {
                return new LinearGradient(0.0f, 0.0f, 2.0f * f, 0.0f, new int[]{i, 0}, new float[]{0.5f, 0.5f}, Shader.TileMode.REPEAT);
            }
        }
        if (edge == CSSShorthand.EDGE.LEFT || edge == CSSShorthand.EDGE.RIGHT) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, f * 6.0f, new int[]{i, 0}, new float[]{0.5f, 0.5f}, Shader.TileMode.REPEAT);
        }
        if (edge == CSSShorthand.EDGE.TOP || edge == CSSShorthand.EDGE.BOTTOM) {
            return new LinearGradient(0.0f, 0.0f, f * 6.0f, 0.0f, new int[]{i, 0}, new float[]{0.5f, 0.5f}, Shader.TileMode.REPEAT);
        }
        return null;
    }
}
