package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wqi extends ByteArrayOutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933240);
    }

    public wqi(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(wqi wqiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/utl/MessageStreamBuilder");
    }

    public wqi a(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wqi) ipChange.ipc$dispatch("1ee56857", new Object[]{this, new Byte(b)});
        }
        write(b);
        return this;
    }

    public wqi b(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wqi) ipChange.ipc$dispatch("dba9eb7c", new Object[]{this, new Short(s)});
        }
        write(s >> 8);
        write(s);
        return this;
    }

    public wqi() {
    }
}
