package com.taobao.share.core;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import tb.a0m;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ContactsApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SHARE_MODULE = "share";
    private static final String STORAGE_PERMISSION_POINT = "share_write_storage_permission";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a0m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11746a;

        public a(ContactsApplication contactsApplication, Context context) {
            this.f11746a = context;
        }

        @Override // tb.a0m.a
        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba42d9de", new Object[]{this, str})).booleanValue();
            }
            if (ContextCompat.checkSelfPermission(this.f11746a, str) == 0) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(664797215);
    }

    public static /* synthetic */ Object ipc$super(ContactsApplication contactsApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/core/ContactsApplication");
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        TLog.loge("PanguApplication", "ContactsApplication onCreate");
        ShareBizAdapter.getInstance().getAppEnv().h(this);
        try {
            com.android.tools.ir.runtime.a.a("com.taobao.wangxin", null);
        } catch (Throwable th) {
            TLog.loge("ContactsApplication", th.toString());
        }
        if (a0m.b(new a(this, getApplicationContext()))) {
            AppMonitor.Alarm.commitSuccess("share", STORAGE_PERMISSION_POINT);
        } else {
            AppMonitor.Alarm.commitFail("share", STORAGE_PERMISSION_POINT, "", "");
        }
    }
}
