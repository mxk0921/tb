package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Objects;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Sticker extends EditableBean<Sticker> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String groupId;
    public String name;
    public String path;
    public String resId;

    static {
        t2o.a(511705446);
    }

    public static /* synthetic */ Object ipc$super(Sticker sticker, String str, Object... objArr) {
        if (str.hashCode() == 1403628309) {
            return new Integer(super.hashCode());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/data/Sticker");
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sticker)) {
            return false;
        }
        Sticker sticker = (Sticker) obj;
        if (!Objects.equals(this.name, sticker.name) || !Objects.equals(this.path, sticker.path) || !Objects.equals(this.resId, sticker.resId) || !Objects.equals(this.groupId, sticker.groupId)) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(Integer.valueOf(super.hashCode()), this.name, this.path, this.resId, this.groupId);
    }
}
