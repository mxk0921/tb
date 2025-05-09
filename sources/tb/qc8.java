package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import java.io.PrintStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qc8 implements hbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hbn sFallbackLoader = new qc8();

    @Override // tb.hbn
    public void a(String str, u5h u5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27e1402", new Object[]{this, str, u5hVar});
        } else if (u5hVar == null) {
            System.out.println("W/RemoteSoloadAsync() - empty impl, return , callback == null");
        } else {
            u5hVar.onLoadFinished(load(str));
        }
    }

    @Override // tb.hbn
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2f98724", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.hbn
    public l6h c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("8aed7eb3", new Object[]{this, str});
        }
        return load(str);
    }

    @Override // tb.hbn
    public l6h load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("e22015f8", new Object[]{this, str});
        }
        try {
            System.loadLibrary(str);
            PrintStream printStream = System.out;
            printStream.println("W/RemoteSoload() - empty impl, do System.loadLibrary(" + str + f7l.BRACKET_END_STR);
            return l6h.j(str);
        } catch (Throwable th) {
            RSoException error = RSoException.error(1001, th);
            PrintStream printStream2 = System.err;
            printStream2.println("W/RemoteSoload() - empty impl, System.loadLibrary(" + str + ") caught exception=" + error.getErrorMsg());
            return l6h.b(str, error);
        }
    }
}
