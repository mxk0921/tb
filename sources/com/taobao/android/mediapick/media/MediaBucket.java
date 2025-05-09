package com.taobao.android.mediapick.media;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class MediaBucket extends LocalMedia implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bucketType;
    public int count;

    static {
        t2o.a(519045156);
    }

    public static /* synthetic */ Object ipc$super(MediaBucket mediaBucket, String str, Object... objArr) {
        if (str.hashCode() == 1814730534) {
            return new Boolean(super.equals(objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/media/MediaBucket");
    }

    @Override // com.taobao.android.mediapick.media.LocalMedia
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!super.equals(obj) || !(obj instanceof LocalMedia) || ((LocalMedia) obj).bucketId != this.bucketId) {
            return false;
        }
        return true;
    }
}
