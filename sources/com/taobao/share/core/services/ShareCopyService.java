package com.taobao.share.core.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.share.aidl.IShareCopy;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import com.ut.share.ShareServiceApi;
import tb.bwr;
import tb.eis;
import tb.hip;
import tb.hjp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareCopyService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IShareCopy.Stub f11747a = new IShareCopy.Stub() { // from class: com.taobao.share.core.services.ShareCopyService.1
        @Override // com.taobao.share.aidl.IShareCopy
        public boolean copyToClipboard(String str, String str2, String str3, String str4) throws RemoteException {
            return ShareCopyService.a(hjp.a().getApplicationContext(), str, str2, str3, str4);
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11748a;

        public a(Context context) {
            this.f11748a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(this.f11748a, Localization.q(R.string.app_copy_success), 0).show();
            }
        }
    }

    static {
        t2o.a(664797251);
    }

    public ShareCopyService() {
        ApplicationInvoker.getInstance("com.taobao.clipboard_share").invoke("com.taobao.share.core.ContactsApplication", TaobaoApplication.sApplication);
    }

    public static boolean a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe5c5ad", new Object[]{context, str, str2, str3, str4})).booleanValue();
        }
        String c = c(str, str3, str4);
        if (!TextUtils.isEmpty(str4)) {
            bwr.h().x(str4);
        } else {
            bwr.h().x("other");
        }
        return b(context, str, str2, c);
    }

    public static boolean b(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36408376", new Object[]{context, str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str3)) {
            hip.b(context, str2);
            ShareBizAdapter.getInstance().getAppEnv().j(str2);
            Handler handler = new Handler(context.getMainLooper());
            if (!TextUtils.isEmpty(str) && str.contains("noToast")) {
                return true;
            }
            handler.post(new a(context));
        } else {
            eis eisVar = new eis();
            eisVar.a(str);
            eisVar.e(str3.replace(" ", ""));
            eisVar.d("copy");
            eisVar.b(bwr.h().o());
            eisVar.c(str2);
            ShareBizAdapter.getInstance().getShareEngine().getShareBizEngine().a(eisVar);
        }
        return true;
    }

    public static String c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42e1288f", new Object[]{str, str2, str3});
        }
        if (!TextUtils.isEmpty(str2)) {
            str2 = ShareServiceApi.urlBackFlow(str, "GoodsTitleURL", str2);
        }
        if ("item".equals(str3) || (!TextUtils.isEmpty(str2) && str2.contains("sourceType=item"))) {
            TBS.Ext.commitEvent(5002, str, "GoodsTitleURL", str2);
        } else {
            TextUtils.isEmpty(str2);
        }
        return str2;
    }

    public static /* synthetic */ Object ipc$super(ShareCopyService shareCopyService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/core/services/ShareCopyService");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return this.f11747a;
    }
}
