package org.ifaa.ifaf.message.server;

import org.ifaa.ifaf.message.IFAFMessage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class IFAFServerRequestResp extends IFAFServerMessage {
    private IFAFMessage request;

    public IFAFMessage getRequest() {
        return this.request;
    }

    public void setRequest(IFAFMessage iFAFMessage) {
        this.request = iFAFMessage;
    }
}
