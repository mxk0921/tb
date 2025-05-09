package com.taobao.android.litecreator.base.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.meta.UGCBase;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.TemplateInfo;
import java.io.Serializable;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UGCImage extends UGCBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageBean compress;
    public EditorInfo editorInfo;
    public ImageBean origin;
    public ImageBean remote;
    public ImageBean templateExport;
    public TemplateInfo templateInfo;
    public ArrayList<UGCLabel> labels = new ArrayList<>();
    public boolean immutable = false;
    public boolean isImgTemplateExport = false;

    static {
        t2o.a(511705124);
        t2o.a(511705133);
    }

    public static /* synthetic */ Object ipc$super(UGCImage uGCImage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/base/data/UGCImage");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UGCImage{origin=" + this.origin + ", compress=" + this.compress + ", remote=" + this.remote + ", labels=" + this.labels + ", meta=" + getMeta() + '}';
    }
}
