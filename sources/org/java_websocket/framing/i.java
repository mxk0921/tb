package org.java_websocket.framing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;
import tb.tj3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class i extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public i() {
        super(Framedata.Opcode.TEXT);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        if (str.hashCode() == 67041401) {
            super.e();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/java_websocket/framing/TextFrame");
    }

    @Override // org.java_websocket.framing.e, org.java_websocket.framing.f
    public void e() throws InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fef879", new Object[]{this});
            return;
        }
        super.e();
        if (!tj3.b(getPayloadData())) {
            throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
        }
    }
}
