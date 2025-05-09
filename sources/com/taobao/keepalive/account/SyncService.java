package com.taobao.keepalive.account;

import android.accounts.Account;
import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.pxx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SyncService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f10873a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a extends AbstractThreadedSyncAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(499122195);
        }

        public a(Context context, boolean z) {
            super(context, z);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/keepalive/account/SyncService$a");
        }

        @Override // android.content.AbstractThreadedSyncAdapter
        public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f51e5d14", new Object[]{this, account, bundle, str, contentProviderClient, syncResult});
            } else {
                pxx.f26392a.e("AccountSyncService", "onPerformSync", new Object[0]);
            }
        }
    }

    static {
        t2o.a(499122194);
    }

    public static /* synthetic */ Object ipc$super(SyncService syncService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/keepalive/account/SyncService");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        pxx.f26392a.e("AccountSyncService", "onBind", new Object[0]);
        if (this.f10873a == null) {
            this.f10873a = new a(getApplicationContext(), true);
        }
        return this.f10873a.getSyncAdapterBinder();
    }
}
