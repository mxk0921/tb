package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MediaClips implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isChange;
    public List<String> mediaPaths = new ArrayList();

    static {
        t2o.a(511705432);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaClips)) {
            return false;
        }
        MediaClips mediaClips = (MediaClips) obj;
        if (this.isChange != mediaClips.isChange || !Objects.equals(this.mediaPaths, mediaClips.mediaPaths)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(this.mediaPaths, Boolean.valueOf(this.isChange));
    }
}
