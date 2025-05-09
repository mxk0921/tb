package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RichLabel extends EditableBean<RichLabel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Goods goods;
    public Label label = new Label();

    static {
        t2o.a(511705445);
    }

    public static /* synthetic */ Object ipc$super(RichLabel richLabel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/data/RichLabel");
    }

    public String toString() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("RichLabel{label=");
        sb.append(this.label.displayName);
        sb.append(", goods=");
        if (this.goods != null) {
            z = true;
        }
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }
}
