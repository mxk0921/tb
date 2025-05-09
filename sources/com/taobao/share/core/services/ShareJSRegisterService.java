package com.taobao.share.core.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.tao.TaobaoApplication;
import com.ut.share.business.StartShareMenuJsBrige;
import tb.ihc;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareJSRegisterService extends Service implements ihc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797257);
        t2o.a(989856204);
    }

    public ShareJSRegisterService() {
        ApplicationInvoker.getInstance("com.taobao.clipboard_share").invoke("com.taobao.share.core.ContactsApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(ShareJSRegisterService shareJSRegisterService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/core/services/ShareJSRegisterService");
    }

    @Override // tb.ihc
    public Class<? extends kpw> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if ("TBSharedModule".equals(str)) {
            return StartShareMenuJsBrige.class;
        }
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }
}
