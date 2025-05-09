package com.alibaba.android.aura;

import com.android.alibaba.ip.runtime.IpChange;
import tb.fyc;
import tb.t2o;
import tb.wl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURARaxComponentExtension_InputField_floatView implements IAURAInputField<fyc> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private fyc floatView;
    private String fieldName = "floatView";
    private Class<wl> targetClass = wl.class;
    private boolean isRequired = false;
    private String errorMessage = "";

    static {
        t2o.a(81788930);
        t2o.a(79691821);
    }

    public AURARaxComponentExtension_InputField_floatView(fyc fycVar) {
        this.floatView = fycVar;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IAURAInputField)) {
            return false;
        }
        IAURAInputField iAURAInputField = (IAURAInputField) obj;
        if (getData() == iAURAInputField.getData() && getFieldName() == iAURAInputField.getFieldName() && getTargetClass() == iAURAInputField.getTargetClass()) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.android.aura.IAURAInputField
    public String getErrorMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fedd06c4", new Object[]{this});
        }
        return this.errorMessage;
    }

    @Override // com.alibaba.android.aura.IAURAInputField
    public String getFieldName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("556566a", new Object[]{this});
        }
        return this.fieldName;
    }

    @Override // com.alibaba.android.aura.IAURAInputField
    public Class<wl> getTargetClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("832385e5", new Object[]{this});
        }
        return this.targetClass;
    }

    @Override // com.alibaba.android.aura.IAURAInputField
    public boolean isRequired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7178baf4", new Object[]{this})).booleanValue();
        }
        return this.isRequired;
    }

    @Override // com.alibaba.android.aura.IAURAInputField
    public fyc getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fyc) ipChange.ipc$dispatch("ec0dea35", new Object[]{this}) : this.floatView;
    }
}
