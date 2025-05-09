package com.taobao.android.litecreator.sdk.editor.data;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Crop extends EditableBean<Crop> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int aspectRadioIndex;
    public String aspectRadioType;
    public Rect rect;
    public Transform transform = new Transform();
    public boolean isAutoCrop = false;

    static {
        t2o.a(511705421);
    }

    public static /* synthetic */ Object ipc$super(Crop crop, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/data/Crop");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Crop{rect=" + this.rect + ", transform=" + this.transform + ", isAutoCrop=" + this.isAutoCrop + ", aspectRadioType='" + this.aspectRadioType + "', aspectRadioIndex=" + this.aspectRadioIndex + '}';
    }
}
