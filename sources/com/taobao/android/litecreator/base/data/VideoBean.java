package com.taobao.android.litecreator.base.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.t2o;
import tb.thi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class VideoBean extends FileBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VIDEO_RATIO_4_3 = 16;
    public static final int VIDEO_RATIO_OTHERS = 128;
    public static final int VIDEO_RATIO_OVER_16_9 = 32;
    public static final int VIDEO_RATIO_OVER_9_16 = 64;
    public final HashMap<String, Serializable> attach = new HashMap<>();
    public int bitRate;
    public ImageBean cover;
    public long duration;
    public String fileId;
    public long fileSize;
    public float framerate;
    public int height;
    public boolean notSupportEdit;
    public int ratioType;
    public int rotate;
    public int width;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface RatioType {
    }

    static {
        t2o.a(511705130);
        t2o.a(511705142);
    }

    public static /* synthetic */ Object ipc$super(VideoBean videoBean, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/base/data/VideoBean");
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

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VideoBean{attach=" + this.attach + ", width=" + this.width + ", fileSize=" + this.fileSize + ", height=" + this.height + ", framerate=" + this.framerate + ", bitRate=" + this.bitRate + ", rotate=" + this.rotate + ", duration=" + this.duration + ", cover=" + this.cover + ", ratioType=" + this.ratioType + ", type=" + this.type + ", id=" + this.id + ", uri='" + this.uri + "', mimeType='" + this.mimeType + "', path='" + this.path + "', fileId=" + this.fileId + "'}";
    }
}
