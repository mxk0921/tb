package org.java_websocket.exceptions;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class IncompleteException extends Throwable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 7330519489840500997L;
    private int preferredSize;

    public IncompleteException(int i) {
        this.preferredSize = i;
    }

    public static /* synthetic */ Object ipc$super(IncompleteException incompleteException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/java_websocket/exceptions/IncompleteException");
    }

    public int getPreferredSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d90762e6", new Object[]{this})).intValue();
        }
        return this.preferredSize;
    }
}
