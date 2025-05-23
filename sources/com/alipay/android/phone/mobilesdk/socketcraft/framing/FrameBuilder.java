package com.alipay.android.phone.mobilesdk.socketcraft.framing;

import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface FrameBuilder extends Framedata {
    void setFin(boolean z);

    void setOptcode(Framedata.Opcode opcode);

    void setPayload(ByteBuffer byteBuffer);

    void setTransferemasked(boolean z);
}
