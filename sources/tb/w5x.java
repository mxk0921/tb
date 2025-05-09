package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w5x extends yio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ byte[] d;
    public final /* synthetic */ String e;
    public final /* synthetic */ u5x f;

    public w5x(u5x u5xVar, byte[] bArr, String str) {
        this.f = u5xVar;
        this.d = bArr;
        this.e = str;
    }

    public static /* synthetic */ Object ipc$super(w5x w5xVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceAsyncBuilderImpl$5");
    }

    @Override // tb.yio
    public void e() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4134b145", new Object[]{this});
        } else {
            u5x.d(this.f).execute(this.d, this.e);
        }
    }
}
