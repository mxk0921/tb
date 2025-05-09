package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ComplexColorCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "ComplexColorCompat";
    private int mColor;
    private final ColorStateList mColorStateList;
    private final Shader mShader;

    private ComplexColorCompat(Shader shader, ColorStateList colorStateList, int i) {
        this.mShader = shader;
        this.mColorStateList = colorStateList;
        this.mColor = i;
    }

    public static ComplexColorCompat from(Shader shader) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ComplexColorCompat) ipChange.ipc$dispatch("b8f6a2ba", new Object[]{shader}) : new ComplexColorCompat(shader, null, 0);
    }

    public static ComplexColorCompat inflate(Resources resources, int i, Resources.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComplexColorCompat) ipChange.ipc$dispatch("1e1a1ad5", new Object[]{resources, new Integer(i), theme});
        }
        try {
            return createFromXml(resources, i, theme);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    public int getColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("756dbba7", new Object[]{this})).intValue();
        }
        return this.mColor;
    }

    public Shader getShader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shader) ipChange.ipc$dispatch("553cd2ca", new Object[]{this});
        }
        return this.mShader;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b242421", new Object[]{this})).booleanValue();
        }
        if (this.mShader != null || (colorStateList = this.mColorStateList) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public void setColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
        } else {
            this.mColor = i;
        }
    }

    public boolean willDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13ba91c1", new Object[]{this})).booleanValue();
        }
        if (isGradient() || this.mColor != 0) {
            return true;
        }
        return false;
    }

    public static ComplexColorCompat from(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ComplexColorCompat) ipChange.ipc$dispatch("e07f0032", new Object[]{colorStateList}) : new ComplexColorCompat(null, colorStateList, colorStateList.getDefaultColor());
    }

    private static ComplexColorCompat createFromXml(Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComplexColorCompat) ipChange.ipc$dispatch("725350bf", new Object[]{resources, new Integer(i), theme});
        }
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return from(GradientColorInflaterCompat.createFromXmlInner(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return from(ColorStateListInflaterCompat.createFromXmlInner(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ComplexColorCompat from(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ComplexColorCompat) ipChange.ipc$dispatch("850e204f", new Object[]{new Integer(i)}) : new ComplexColorCompat(null, null, i);
    }

    public boolean isGradient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efdd5605", new Object[]{this})).booleanValue();
        }
        return this.mShader != null;
    }

    public boolean onStateChanged(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efb068bb", new Object[]{this, iArr})).booleanValue();
        }
        if (isStateful()) {
            ColorStateList colorStateList = this.mColorStateList;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.mColor) {
                this.mColor = colorForState;
                return true;
            }
        }
        return false;
    }
}
