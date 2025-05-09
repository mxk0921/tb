package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Label extends EditableBean<Label> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DIRECTION_LEFT = 0;
    public static final int DIRECTION_RIGHT = 1;
    public String displayName;
    public int direction = 0;
    public double posX = vu3.b.GEO_NOT_SUPPORT;
    public double posY = vu3.b.GEO_NOT_SUPPORT;

    static {
        t2o.a(511705428);
    }

    public static /* synthetic */ Object ipc$super(Label label, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/data/Label");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Label{id='" + this.id + "', displayName='" + this.displayName + "', direction=" + this.direction + ", posX=" + this.posX + ", posY=" + this.posY + '}';
    }
}
