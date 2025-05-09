package tb;

import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface u4c {
    u4c a();

    String b();

    boolean c(String str);

    void d(Framedata framedata) throws InvalidDataException;

    boolean e(String str);

    void f(Framedata framedata);

    void g(Framedata framedata) throws InvalidDataException;

    String h();

    void reset();

    String toString();
}
