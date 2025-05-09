package com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant;

import com.alibaba.idst.nls.nlsclientsdk.requests.SpeechResProtocol;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DialogResponse extends SpeechResProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(199229465);
    }

    public static /* synthetic */ Object ipc$super(DialogResponse dialogResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/idst/nls/nlsclientsdk/requests/VirtualAssistant/DialogResponse");
    }

    public String getRecognizedText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b1f0bc0", new Object[]{this});
        }
        return (String) this.payload.get("result");
    }

    public String getTaskId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54ada043", new Object[]{this});
        }
        return (String) this.header.get("task_id");
    }
}
