package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w2l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f30410a;
    public final InputStream b;
    public final RSoException c;

    public w2l(String str, InputStream inputStream, RSoException rSoException) {
        this.f30410a = str;
        this.b = inputStream;
        this.c = rSoException;
    }

    public InputStream a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("b713b4be", new Object[]{this});
        }
        return this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "OpenAssetsResult{name='" + this.f30410a + "', inputStream=" + this.b + ", error=" + this.c + '}';
    }
}
