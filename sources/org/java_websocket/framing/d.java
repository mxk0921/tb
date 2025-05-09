package org.java_websocket.framing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.framing.Framedata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class d extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public d(Framedata.Opcode opcode) {
        super(opcode);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/java_websocket/framing/ControlFrame");
    }

    @Override // org.java_websocket.framing.f
    public void e() throws InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fef879", new Object[]{this});
        } else if (!isFin()) {
            throw new InvalidFrameException("Control frame cant have fin==false set");
        } else if (a()) {
            throw new InvalidFrameException("Control frame cant have rsv1==true set");
        } else if (b()) {
            throw new InvalidFrameException("Control frame cant have rsv2==true set");
        } else if (c()) {
            throw new InvalidFrameException("Control frame cant have rsv3==true set");
        }
    }
}
