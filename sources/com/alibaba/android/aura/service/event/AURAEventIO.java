package com.alibaba.android.aura.service.event;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.qi;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURAEventIO extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final qi mEventModel;
    private final String mEventType;

    static {
        t2o.a(80740428);
    }

    public AURAEventIO(String str, qi qiVar) {
        this.mEventType = str;
        this.mEventModel = qiVar;
    }

    public static /* synthetic */ Object ipc$super(AURAEventIO aURAEventIO, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/event/AURAEventIO");
    }

    public qi getEventModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qi) ipChange.ipc$dispatch("7e1f63b1", new Object[]{this});
        }
        qi qiVar = this.mEventModel;
        if (qiVar == null) {
            return new qi();
        }
        return qiVar;
    }

    public String getEventType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        String str = this.mEventType;
        if (str == null) {
            return "";
        }
        return str;
    }
}
