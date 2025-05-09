package com.alibaba.android.umf.datamodel.service.rule;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.rxu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFRuleIO extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "actions")
    private List<rxu> mActions;
    @JSONField(name = "confirm")
    private boolean mConfirm;
    @JSONField(name = "type")
    private String mType;

    static {
        t2o.a(80740680);
    }

    public UMFRuleIO(List<rxu> list) {
        this.mConfirm = false;
        this.mType = "modify";
        this.mActions = list;
    }

    public static /* synthetic */ Object ipc$super(UMFRuleIO uMFRuleIO, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/datamodel/service/rule/UMFRuleIO");
    }

    public List<rxu> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return this.mActions;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.mType;
    }

    public boolean isConfirm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c069a7c1", new Object[]{this})).booleanValue();
        }
        return this.mConfirm;
    }

    public void setActions(List<rxu> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b28a33", new Object[]{this, list});
        } else {
            this.mActions = list;
        }
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.mType = str;
        }
    }

    public UMFRuleIO(String str) {
        this.mConfirm = false;
        this.mType = str;
    }

    public UMFRuleIO(List<rxu> list, String str, boolean z) {
        this.mActions = list;
        this.mType = str;
        this.mConfirm = z;
    }
}
