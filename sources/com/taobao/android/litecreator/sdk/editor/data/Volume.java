package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Objects;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Volume extends EditableBean<Volume> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static float DEFAULT_VOLUME_VALUE = 1.0f;
    public static float MUTE_VOLUME_VALUE = 0.0f;
    public float musicVolume;
    public float originScaleValue = 1.0f;
    public float originVolume;

    static {
        t2o.a(511705452);
    }

    public Volume() {
        float f = DEFAULT_VOLUME_VALUE;
        this.originVolume = f;
        this.musicVolume = f;
    }

    public static /* synthetic */ Object ipc$super(Volume volume, String str, Object... objArr) {
        if (str.hashCode() == 1403628309) {
            return new Integer(super.hashCode());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/data/Volume");
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
        if (!(obj instanceof Volume)) {
            return false;
        }
        Volume volume = (Volume) obj;
        if (Float.compare(volume.originVolume, this.originVolume) == 0 && Float.compare(volume.musicVolume, this.musicVolume) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(Integer.valueOf(super.hashCode()), Float.valueOf(this.originVolume), Float.valueOf(this.musicVolume));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Volume{originVolume=" + this.originVolume + ", musicVolume=" + this.musicVolume + '}';
    }
}
