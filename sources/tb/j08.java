package tb;

import anet.channel.AwcnConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.connection.ConnectionWrapper;
import com.taobao.accs.connection.IConnection;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j08 extends wi4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933058);
    }

    public static /* synthetic */ Object ipc$super(j08 j08Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/connection/DualConnectionService");
    }

    @Override // tb.wi4
    public IConnection a(String str, AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConnection) ipChange.ipc$dispatch("e4a78d1a", new Object[]{this, str, accsClientConfig});
        }
        AwcnConfig.setAccsSessionCreateForbiddenInBg(false);
        if (this.f30712a == null) {
            this.f30712a = new ConnectionWrapper(str);
        }
        return this.f30712a;
    }

    @Override // tb.wi4
    public List<IConnection> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e9d0a061", new Object[]{this});
        }
        if (this.f30712a == null) {
            return null;
        }
        return Arrays.asList(this.f30712a);
    }

    @Override // tb.wi4
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("454be8ed", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
