package com.taobao.android.litecreator.sdk.editor.data;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Objects;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AiQuality extends EditableBean<AiQuality> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long QUALITY_FLAG = 1;
    public static final String QUALITY_KEY = "beauty";
    public String dirPath;
    public boolean enable = true;
    public boolean isUserSelect;

    static {
        t2o.a(511705419);
    }

    public static /* synthetic */ Object ipc$super(AiQuality aiQuality, String str, Object... objArr) {
        if (str.hashCode() == 1403628309) {
            return new Integer(super.hashCode());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/data/AiQuality");
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
        if (!(obj instanceof AiQuality)) {
            return false;
        }
        AiQuality aiQuality = (AiQuality) obj;
        if (!TextUtils.equals(this.dirPath, aiQuality.dirPath) || this.enable != aiQuality.enable) {
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
        return Objects.hash(Integer.valueOf(super.hashCode()), this.dirPath, Boolean.valueOf(this.enable));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AiQuality{id='" + this.id + "', enable='" + this.enable + "', localPath=" + this.dirPath + '}';
    }
}
