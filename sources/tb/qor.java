package tb;

import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.taobao.tao.Globals;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qor implements tlh {
    public mlh a(String str) throws IOException {
        return new por(new DegradableNetwork(Globals.getApplication()).getConnection(new RequestImpl(str), null));
    }
}
