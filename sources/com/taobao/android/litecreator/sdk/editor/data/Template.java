package com.taobao.android.litecreator.sdk.editor.data;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.Objects;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Template extends EditableBean<Template> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String tid;

    static {
        t2o.a(511705447);
    }

    public static /* synthetic */ Object ipc$super(Template template, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1403628309) {
            return new Integer(super.hashCode());
        }
        if (hashCode == 2025021518) {
            return super.clone();
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/litecreator/sdk/editor/data/Template");
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
        if (!(obj instanceof Template)) {
            return false;
        }
        return TextUtils.equals(this.tid, ((Template) obj).tid);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(Integer.valueOf(super.hashCode()), this.tid);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Template{tid='" + this.tid + "'}";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
    public Template clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Template) ipChange.ipc$dispatch("5cb122df", new Object[]{this}) : (Template) super.clone();
    }
}
