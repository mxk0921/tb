package com.alipay.mobile.verifyidentity.module.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DataHelperManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile DataHelperManager c;

    /* renamed from: a  reason: collision with root package name */
    public BroadcastReceiver f4336a;
    public ConcurrentHashMap<String, DataHelper> b = new ConcurrentHashMap<>();

    public static /* synthetic */ ConcurrentHashMap access$000(DataHelperManager dataHelperManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("78929332", new Object[]{dataHelperManager});
        }
        return dataHelperManager.b;
    }

    public static /* synthetic */ BroadcastReceiver access$100(DataHelperManager dataHelperManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("f3b02e4a", new Object[]{dataHelperManager});
        }
        return dataHelperManager.f4336a;
    }

    public static DataHelperManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataHelperManager) ipChange.ipc$dispatch("564b2acd", new Object[0]);
        }
        if (c == null) {
            synchronized (DataHelperManager.class) {
                try {
                    if (c == null) {
                        c = new DataHelperManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public DataHelper getHelper(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataHelper) ipChange.ipc$dispatch("d0b6a8d9", new Object[]{this, str});
        }
        if (this.b == null) {
            this.b = new ConcurrentHashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.b.get(str);
    }

    public void putDataHelper(String str, DataHelper dataHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe1abd0", new Object[]{this, str, dataHelper});
            return;
        }
        if (this.b == null) {
            this.b = new ConcurrentHashMap<>();
        }
        this.b.put(str, dataHelper);
        final LocalBroadcastManager instance = LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext());
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.utils.DataHelperManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/utils/DataHelperManager$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                VerifyLogCat.i("DataHelperManager", "receive pwd exit");
                if (DataHelperManager.access$000(DataHelperManager.this) != null) {
                    DataHelperManager.access$000(DataHelperManager.this).clear();
                }
                instance.unregisterReceiver(DataHelperManager.access$100(DataHelperManager.this));
            }
        };
        this.f4336a = broadcastReceiver;
        instance.registerReceiver(broadcastReceiver, new IntentFilter("NEW_PWD_EXIT"));
    }

    public void removeHelper(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fe1263", new Object[]{this, str});
        } else if (this.b != null && !TextUtils.isEmpty(str)) {
            this.b.remove(str);
        }
    }
}
