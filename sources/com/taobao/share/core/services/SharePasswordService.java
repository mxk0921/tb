package com.taobao.share.core.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.share.aidl.ISharePassword;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.TaobaoApplication;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SharePasswordService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ISharePassword.Stub f11750a = new ISharePassword.Stub() { // from class: com.taobao.share.core.services.SharePasswordService.1
        @Override // com.taobao.share.aidl.ISharePassword
        public void putPassworToHistory(String str, String str2) throws RemoteException {
            ShareBizAdapter.getInstance().getAppEnv().j(str2);
        }
    };

    static {
        t2o.a(664797258);
    }

    public SharePasswordService() {
        ApplicationInvoker.getInstance("com.taobao.clipboard_share").invoke("com.taobao.share.core.ContactsApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(SharePasswordService sharePasswordService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/core/services/SharePasswordService");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return this.f11750a;
    }
}
