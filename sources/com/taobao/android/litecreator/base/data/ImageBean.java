package com.taobao.android.litecreator.base.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;
import tb.thi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ImageBean extends FileBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int height;
    public int rotate;
    public int width;

    static {
        t2o.a(511705113);
        t2o.a(511705142);
    }

    public static /* synthetic */ Object ipc$super(ImageBean imageBean, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/base/data/ImageBean");
    }

    public int getDisplayHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42401bcd", new Object[]{this})).intValue();
        }
        return thi.a(this.width, this.height, this.rotate);
    }

    public int getDisplayWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4638814", new Object[]{this})).intValue();
        }
        return thi.b(this.width, this.height, this.rotate);
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.height;
    }

    public int getOriginDisplayHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb49fdc7", new Object[]{this})).intValue();
        }
        return getDisplayHeight();
    }

    public int getOriginDisplayWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8df87eda", new Object[]{this})).intValue();
        }
        return getDisplayWidth();
    }

    public int getRotation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c471376e", new Object[]{this})).intValue();
        }
        return this.rotate;
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.width;
    }

    public float ratio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("147cd702", new Object[]{this})).floatValue();
        }
        int displayWidth = getDisplayWidth();
        int displayHeight = getDisplayHeight();
        if (displayHeight == 0) {
            return Float.MAX_VALUE;
        }
        return displayWidth / displayHeight;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ImageBean{width=" + this.width + ", height=" + this.height + ", rotate=" + this.rotate + ", type=" + this.type + ", id=" + this.id + ", uri='" + this.uri + "', mimeType='" + this.mimeType + "', path='" + this.path + "'}";
    }
}
