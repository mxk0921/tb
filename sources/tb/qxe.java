package tb;

import android.app.Application;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.ali.adapt.api.AtlasServiceFinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qxe extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public qxe(String str) {
        super(str);
        i(true);
    }

    public static /* synthetic */ Object ipc$super(qxe qxeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitAtlasServiceFinder");
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else {
            AliAdaptServiceManager.getInstance().registerServiceImplStub(new AtlasServiceFinder());
        }
    }
}
