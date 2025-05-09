package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Objects;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Cut extends EditableBean<Cut> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Canvas canvas;
    public long endTime;
    public long startTime;

    static {
        t2o.a(511705422);
    }

    public static /* synthetic */ Object ipc$super(Cut cut, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1403628309) {
            return new Integer(super.hashCode());
        }
        if (hashCode == 2025021518) {
            return super.clone();
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/litecreator/sdk/editor/data/Cut");
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
        if (!(obj instanceof Cut)) {
            return false;
        }
        Cut cut = (Cut) obj;
        if (this.startTime == cut.startTime && this.endTime == cut.endTime && Objects.equals(this.canvas, cut.canvas)) {
            return true;
        }
        return false;
    }

    public long getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        return this.endTime - this.startTime;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(Integer.valueOf(super.hashCode()), Long.valueOf(this.startTime), Long.valueOf(this.endTime), this.canvas);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Cut{startTime=" + this.startTime + ", endTime=" + this.endTime + ", canvas=" + this.canvas + '}';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public Cut clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cut) ipChange.ipc$dispatch("2ebb739b", new Object[]{this});
        }
        Cut cut = (Cut) super.clone();
        cut.startTime = this.startTime;
        cut.endTime = this.endTime;
        Canvas canvas = this.canvas;
        if (canvas != null) {
            cut.canvas = canvas.clone();
        }
        return cut;
    }
}
