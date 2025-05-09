package com.taobao.android.ugc.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ugc.service.ITaopai;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TaopaiClient implements ServiceConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERVICE_ACTION_NAME = "com.taobao.android.taopai.invoke";
    private Context mContext;
    private Intent mIntent;
    private ITaopai mTaopaiService;

    static {
        t2o.a(758120524);
        t2o.a(758120517);
    }

    public TaopaiClient(Context context) {
        this.mContext = context;
        Intent intent = new Intent(SERVICE_ACTION_NAME);
        this.mIntent = intent;
        intent.setPackage(this.mContext.getPackageName());
        this.mContext.bindService(this.mIntent, this, 1);
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mContext.unbindService(this);
        }
    }

    public boolean isPhoneSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44699bd6", new Object[]{this})).booleanValue();
        }
        try {
            ITaopai iTaopai = this.mTaopaiService;
            if (iTaopai != null) {
                return iTaopai.isPhoneSupport();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
        } else {
            this.mTaopaiService = ITaopai.Stub.asInterface(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
        }
    }
}
