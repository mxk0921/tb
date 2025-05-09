package com.taobao.uikit.extend.component.unify.Dialog;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum DialogAction {
    POSITIVE,
    NEUTRAL,
    NEGATIVE,
    CLOSE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DialogAction dialogAction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/unify/Dialog/DialogAction");
    }

    public static DialogAction valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogAction) ipChange.ipc$dispatch("2c108f58", new Object[]{str});
        }
        return (DialogAction) Enum.valueOf(DialogAction.class, str);
    }
}
