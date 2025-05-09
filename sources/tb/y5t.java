package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import tb.joc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y5t implements joc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092319);
        t2o.a(806355916);
    }

    @Override // tb.joc
    public void a(Activity activity, joc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe1ecd27", new Object[]{this, activity, aVar});
        } else {
            Login.login(true);
        }
    }

    @Override // tb.joc
    public boolean checkSessionValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edaaf5b9", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }

    @Override // tb.joc
    public String getHeadPicLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ea1ca4b", new Object[]{this});
        }
        return Login.getHeadPicLink();
    }

    @Override // tb.joc
    public String getNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
        }
        return Login.getNick();
    }

    @Override // tb.joc
    public String getSid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("169fb061", new Object[]{this});
        }
        return Login.getSid();
    }

    @Override // tb.joc
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return Login.getUserId();
    }
}
