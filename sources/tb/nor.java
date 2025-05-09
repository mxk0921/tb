package tb;

import android.content.BroadcastReceiver;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nor implements doc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final nor f24872a = new nor();

        static {
            t2o.a(793772061);
        }

        public static /* synthetic */ nor a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nor) ipChange.ipc$dispatch("187103b4", new Object[0]);
            }
            return f24872a;
        }
    }

    static {
        t2o.a(793772059);
        t2o.a(665845807);
    }

    public static nor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nor) ipChange.ipc$dispatch("a2ea5a9a", new Object[0]);
        }
        return b.a();
    }

    @Override // tb.doc
    public void a(BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b55244", new Object[]{this, broadcastReceiver});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(gjp.a(), broadcastReceiver);
        }
    }

    @Override // tb.doc
    public void b(BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a1572b", new Object[]{this, broadcastReceiver});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(gjp.a(), broadcastReceiver);
        }
    }

    @Override // tb.doc
    public boolean checkSessionValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edaaf5b9", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }

    @Override // tb.doc
    public String getHeadPicLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ea1ca4b", new Object[]{this});
        }
        return Login.getHeadPicLink();
    }

    @Override // tb.doc
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return Login.getUserId();
    }

    @Override // tb.doc
    public void login(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95000964", new Object[]{this, new Boolean(z)});
        } else {
            Login.login(z);
        }
    }

    public nor() {
    }
}
