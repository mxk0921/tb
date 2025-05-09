package tb;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a57 extends wz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f15548a = re.r().getContentResolver();
    public final Uri b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ContentProviderClient f15549a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Bundle c;

        public a(ContentProviderClient contentProviderClient, String str, Bundle bundle) {
            this.f15549a = contentProviderClient;
            this.b = str;
            this.c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ProviderInfo providerInfo;
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ContentProviderClient contentProviderClient = this.f15549a;
                if (contentProviderClient != null) {
                    contentProviderClient.call(this.b, "", this.c);
                } else {
                    a57.g(a57.this).call(a57.f(a57.this), this.b, "", this.c);
                }
            } catch (Exception e) {
                try {
                    Context r = re.r();
                    providerInfo = r.getPackageManager().getProviderInfo(new ComponentName(r.getPackageName(), "com.taobao.accs.AccsIPCProvider"), 8);
                } catch (Throwable th) {
                    b5d.h("DefaultRemoteChannel", "getProviderInfo err", th, new Object[0]);
                    providerInfo = null;
                }
                StringBuilder sb = new StringBuilder("[call exception].enabled=");
                if (providerInfo == null) {
                    obj = "NULL";
                } else {
                    obj = Boolean.valueOf(providerInfo.enabled);
                }
                sb.append(obj);
                b5d.h("DefaultRemoteChannel", sb.toString(), e, new Object[0]);
            }
        }
    }

    static {
        t2o.a(393216045);
    }

    public a57(Uri uri) {
        this.b = uri;
    }

    public static /* synthetic */ Uri f(a57 a57Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d9d2e35e", new Object[]{a57Var});
        }
        return a57Var.b;
    }

    public static /* synthetic */ ContentResolver g(a57 a57Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentResolver) ipChange.ipc$dispatch("76dc5b30", new Object[]{a57Var});
        }
        return a57Var.f15548a;
    }

    public static /* synthetic */ Object ipc$super(a57 a57Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/core/ipc/channel/DefaultRemoteChannel");
    }

    @Override // tb.wz1
    public Reply c(Call call) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("b5789e92", new Object[]{this, call});
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("call", call);
        return h("call", bundle, call.isOneWay(), call.getMethodWrapper().isVoid());
    }

    @Override // tb.vmb
    public void a(List<String> list) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c8618e", new Object[]{this, list});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("keys", (ArrayList) list);
        h(Constants.METHOD_RECYCLE_REMOTE, bundle, true, true);
    }

    public final Reply h(String str, Bundle bundle, boolean z, boolean z2) throws IPCException {
        Bundle bundle2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("d967463e", new Object[]{this, str, bundle, new Boolean(z), new Boolean(z2)});
        }
        try {
            ContentProviderClient acquireUnstableContentProviderClient = this.f15548a.acquireUnstableContentProviderClient(this.b);
            b5d.i("DefaultRemoteChannel", "[call]", "contentProviderClient==null ? ", Boolean.valueOf(acquireUnstableContentProviderClient == null));
            if (!z || !z2) {
                if (acquireUnstableContentProviderClient != null) {
                    bundle2 = acquireUnstableContentProviderClient.call(str, "", bundle);
                } else {
                    bundle2 = this.f15548a.call(this.b, str, "", bundle);
                }
                if (z2) {
                    return Reply.obtain().setResult(null);
                }
                bundle2.setClassLoader(a57.class.getClassLoader());
                Reply reply = (Reply) bundle2.getParcelable(Constants.PARAM_REPLY);
                if (reply != null) {
                    return reply;
                }
                throw new IPCException(33, "reply data encode error from default channel!");
            }
            g5d.b(false, false, new a(acquireUnstableContentProviderClient, str, bundle));
            return Reply.obtain().setResult(null);
        } catch (Throwable th) {
            b5d.h("DefaultRemoteChannel", "[call err]", th, new Object[0]);
            if (th instanceof RemoteException) {
                throw new IPCException(1, th);
            }
            throw new IPCException(9, th);
        }
    }
}
