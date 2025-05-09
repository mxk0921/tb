package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.framing.Framedata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class w07 implements u4c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.u4c
    public u4c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u4c) ipChange.ipc$dispatch("ba7c739d", new Object[]{this});
        }
        return new w07();
    }

    @Override // tb.u4c
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ef678be", new Object[]{this});
        }
        return "";
    }

    @Override // tb.u4c
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8fcf17e", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Override // tb.u4c
    public void d(Framedata framedata) throws InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0442757", new Object[]{this, framedata});
        } else if (framedata.a() || framedata.b() || framedata.c()) {
            throw new InvalidFrameException("bad rsv RSV1: " + framedata.a() + " RSV2: " + framedata.b() + " RSV3: " + framedata.c());
        }
    }

    @Override // tb.u4c
    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5bc2006", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && w07.class == obj.getClass()) {
            return true;
        }
        return false;
    }

    @Override // tb.u4c
    public void f(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7424b75", new Object[]{this, framedata});
        }
    }

    @Override // tb.u4c
    public void g(Framedata framedata) throws InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6a2c9d", new Object[]{this, framedata});
        }
    }

    @Override // tb.u4c
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd35936", new Object[]{this});
        }
        return "";
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return w07.class.hashCode();
    }

    @Override // tb.u4c
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        }
    }

    @Override // tb.u4c
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return w07.class.getSimpleName();
    }
}
