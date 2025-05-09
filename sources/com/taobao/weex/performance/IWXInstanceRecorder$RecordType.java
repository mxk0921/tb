package com.taobao.weex.performance;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum IWXInstanceRecorder$RecordType {
    MtopRequest,
    ModuleRequest,
    NativeModuleInvoke,
    TemplateRequest;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(IWXInstanceRecorder$RecordType iWXInstanceRecorder$RecordType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/performance/IWXInstanceRecorder$RecordType");
    }

    public static IWXInstanceRecorder$RecordType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXInstanceRecorder$RecordType) ipChange.ipc$dispatch("9a7021e0", new Object[]{str});
        }
        return (IWXInstanceRecorder$RecordType) Enum.valueOf(IWXInstanceRecorder$RecordType.class, str);
    }
}
