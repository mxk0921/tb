package com.taobao.android.litecreator.sdk.editor.data;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import tb.t2o;
import tb.thi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Media implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long clipDurationMs;
    public long clipEndTimeUs;
    public Map<String, String> clipExtendInfo;
    public String clipId;
    public long clipStartTimeUs;
    public long durationMs;
    public int height;
    public float isMute;
    public boolean isPlaceHolderClip = true;
    public int mediaId;
    public String mediaType;
    public long originDurationMs;
    public String path;
    public int rotation;
    public long sourceEndTimeUs;
    public long sourceStartTimeUs;
    public String subClipId;
    public String uri;
    public int width;

    static {
        t2o.a(511705431);
        t2o.a(511705142);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        Media media = (Media) obj;
        if (getWidth() == media.getWidth() && getHeight() == media.getHeight() && getRotation() == media.getRotation() && this.originDurationMs == media.originDurationMs && this.durationMs == media.durationMs && this.clipDurationMs == media.clipDurationMs && Float.compare(media.isMute, this.isMute) == 0 && this.sourceStartTimeUs == media.sourceStartTimeUs && this.sourceEndTimeUs == media.sourceEndTimeUs && this.clipStartTimeUs == media.clipStartTimeUs && this.clipEndTimeUs == media.clipEndTimeUs && this.isPlaceHolderClip == media.isPlaceHolderClip && this.mediaId == media.mediaId && Objects.equals(this.path, media.path) && TextUtils.equals(this.mediaType, media.mediaType)) {
            return true;
        }
        return false;
    }

    public int getDisplayHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42401bcd", new Object[]{this})).intValue();
        }
        return thi.a(this.width, this.height, this.rotation);
    }

    public int getDisplayWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4638814", new Object[]{this})).intValue();
        }
        return thi.b(this.width, this.height, this.rotation);
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
        return thi.a(this.width, this.height, this.rotation);
    }

    public int getOriginDisplayWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8df87eda", new Object[]{this})).intValue();
        }
        return thi.b(this.width, this.height, this.rotation);
    }

    public int getRotation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c471376e", new Object[]{this})).intValue();
        }
        return this.rotation;
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.width;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(this.path, Integer.valueOf(this.mediaId), this.mediaType);
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
}
