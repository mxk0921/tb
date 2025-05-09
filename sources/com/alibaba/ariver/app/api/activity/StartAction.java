package com.alibaba.ariver.app.api.activity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum StartAction {
    SHOW_LOADING,
    SHOW_ERROR,
    DIRECT_START;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(StartAction startAction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/app/api/activity/StartAction");
    }

    public static StartAction valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StartAction) ipChange.ipc$dispatch("6ffa620c", new Object[]{str});
        }
        return (StartAction) Enum.valueOf(StartAction.class, str);
    }

    public boolean needWaitIpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9d31cfc", new Object[]{this})).booleanValue();
        }
        if (this == SHOW_LOADING) {
            return true;
        }
        return false;
    }
}
