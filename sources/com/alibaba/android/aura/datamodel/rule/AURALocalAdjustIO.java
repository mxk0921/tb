package com.alibaba.android.aura.datamodel.rule;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ak;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURALocalAdjustIO extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ak mLocalAdjustModel;
    private final String mRuleType;

    static {
        t2o.a(80740412);
    }

    public AURALocalAdjustIO(String str, ak akVar) {
        this.mRuleType = str;
        this.mLocalAdjustModel = akVar;
    }

    public static /* synthetic */ Object ipc$super(AURALocalAdjustIO aURALocalAdjustIO, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/datamodel/rule/AURALocalAdjustIO");
    }

    public ak getLocalAdjustModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ak) ipChange.ipc$dispatch("7849f1ef", new Object[]{this});
        }
        ak akVar = this.mLocalAdjustModel;
        if (akVar == null) {
            return new ak();
        }
        return akVar;
    }

    public String getLocalAdjustType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d8ebabb", new Object[]{this});
        }
        String str = this.mRuleType;
        if (str == null) {
            return "";
        }
        return str;
    }
}
