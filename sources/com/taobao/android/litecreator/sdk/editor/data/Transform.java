package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Arrays;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Transform extends EditableBean<Transform> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float[] matrixValues;
    public int sampleSize;
    public float rotate = 0.0f;
    public float scale = 1.0f;
    public float postionX = 0.0f;
    public float postionY = 0.0f;
    public float offsetX = 0.0f;
    public float offsetY = 0.0f;
    public float unRotateOffsetX = 0.0f;
    public float unRotateOffsetY = 0.0f;

    static {
        t2o.a(511705449);
    }

    public static /* synthetic */ Object ipc$super(Transform transform, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/data/Transform");
    }

    public boolean isSameAs(Transform transform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("785ab4c", new Object[]{this, transform})).booleanValue();
        }
        if (this.rotate == transform.rotate && this.scale == transform.scale && this.postionX == transform.postionX && this.postionY == transform.postionY && this.offsetX == transform.offsetX && this.offsetY == transform.offsetY && Arrays.equals(this.matrixValues, transform.matrixValues)) {
            return true;
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Transform{rotate=" + this.rotate + ", scale=" + this.scale + ", postionX=" + this.postionX + ", postionY=" + this.postionY + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", sampleSize=" + this.sampleSize + ", matrixValues=" + Arrays.toString(this.matrixValues) + '}';
    }
}
