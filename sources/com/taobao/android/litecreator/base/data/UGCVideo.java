package com.taobao.android.litecreator.base.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.meta.UGCBase;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UGCVideo extends UGCBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public VideoBean compress;
    public EditorInfo editorInfo;
    public VideoBean origin;
    public VideoBean raw;
    public VideoBean remote;

    static {
        t2o.a(511705129);
    }

    public UGCVideo() {
        setMeta("videoEditNoneEdited", Boolean.TRUE);
    }

    public static /* synthetic */ Object ipc$super(UGCVideo uGCVideo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/base/data/UGCVideo");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UGCVideo{origin=" + this.origin + ", compress=" + this.compress + ", remote=" + this.remote + ", meta=" + getMeta() + ", editorInfo=" + this.editorInfo + '}';
    }
}
