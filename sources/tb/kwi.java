package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kwi extends wz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean c = false;

    /* renamed from: a  reason: collision with root package name */
    public final wz1 f22967a;
    public final wz1 b;
    public final Uri h;

    static {
        t2o.a(393216048);
    }

    public kwi(Uri uri) {
        this.h = uri;
        this.f22967a = new a57(uri);
        this.b = new f9n(uri);
    }

    public static /* synthetic */ Object ipc$super(kwi kwiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/core/ipc/channel/MixRemoteChannel");
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db9891f7", new Object[]{this})).booleanValue();
        }
        if (k8l.d()) {
            return this.g;
        }
        return c;
    }

    @Override // tb.vmb
    public void a(List<String> list) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c8618e", new Object[]{this, list});
        } else if (g()) {
            ((a57) this.f22967a).a(list);
        } else {
            try {
                ((f9n) this.b).a(list);
            } catch (IPCException e) {
                int errorCode = e.getErrorCode();
                if (errorCode != 1) {
                    if (errorCode == 19) {
                        c = true;
                        this.g = true;
                        b5d.i("MixRemoteChannel", "internalRecycle degrade", "mUri", this.h);
                    } else {
                        throw e;
                    }
                }
                ((a57) this.f22967a).a(list);
            }
        }
    }

    @Override // tb.wz1
    public Reply c(Call call) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("b5789e92", new Object[]{this, call});
        }
        if (g()) {
            return this.f22967a.c(call);
        }
        try {
            return this.b.c(call);
        } catch (IPCException e) {
            int errorCode = e.getErrorCode();
            if (errorCode != 1) {
                if (errorCode == 19) {
                    c = true;
                    this.g = true;
                    b5d.i("MixRemoteChannel", "internalSendCall degrade", "mUri", this.h);
                } else {
                    throw e;
                }
            }
            return this.f22967a.c(call);
        }
    }
}
