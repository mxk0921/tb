package org.java_websocket.exceptions;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class IncompleteHandshakeException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 7906596804233893092L;
    private int preferedSize;

    public IncompleteHandshakeException(int i) {
        this.preferedSize = i;
    }

    public static /* synthetic */ Object ipc$super(IncompleteHandshakeException incompleteHandshakeException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/java_websocket/exceptions/IncompleteHandshakeException");
    }

    public int getPreferedSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58faa340", new Object[]{this})).intValue();
        }
        return this.preferedSize;
    }

    public IncompleteHandshakeException() {
        this.preferedSize = 0;
    }
}
