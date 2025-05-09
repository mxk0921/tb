package org.java_websocket.framing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class e extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public e(Framedata.Opcode opcode) {
        super(opcode);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/java_websocket/framing/DataFrame");
    }

    @Override // org.java_websocket.framing.f
    public void e() throws InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fef879", new Object[]{this});
        }
    }
}
