package com.taobao.android.mediapick.media;

import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class LocalMedia extends Media implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bucketId;
    public long dateAddTime;
    public long dateModifyTime;
    public String displayName;
    public JSONObject extra;
    public int fileSize;
    public int height;
    public int mediaType;
    public String mimeType;
    public int orientation;
    public String path;
    public Uri uri;
    public int width;

    static {
        t2o.a(519045154);
    }

    public static /* synthetic */ Object ipc$super(LocalMedia localMedia, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/media/LocalMedia");
    }

    private boolean isExtraEquals(LocalMedia localMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99a83638", new Object[]{this, localMedia})).booleanValue();
        }
        JSONObject jSONObject = localMedia.extra;
        JSONObject jSONObject2 = this.extra;
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject == null || !jSONObject.equals(jSONObject2)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof LocalMedia)) {
            return false;
        }
        LocalMedia localMedia = (LocalMedia) obj;
        if (localMedia.id == this.id && localMedia.mediaType == this.mediaType && isExtraEquals(localMedia)) {
            return true;
        }
        return false;
    }

    public LocalMedia clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalMedia) ipChange.ipc$dispatch("2d5e4ff4", new Object[]{this});
        }
        try {
            return (LocalMedia) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
