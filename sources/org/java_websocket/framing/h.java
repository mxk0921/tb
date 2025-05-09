package org.java_websocket.framing;

import org.java_websocket.framing.Framedata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class h extends d {
    public h() {
        super(Framedata.Opcode.PONG);
    }

    public h(g gVar) {
        super(Framedata.Opcode.PONG);
        g(gVar.getPayloadData());
    }
}
