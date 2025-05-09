package com.alibaba.one.android.inner;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.IBinder;

/* loaded from: classes.dex */
public class OneStubCenter {

    /* loaded from: classes.dex */
    public static class OneNetworkCallback extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            try {
                OneStubCenter.oneStubCenterCallFunc(0, network, null);
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class OneServiceConnection implements ServiceConnection {
        private String serviceAction;

        public OneServiceConnection(String str) {
            this.serviceAction = str;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                OneStubCenter.oneStubCenterCallFunc(1, iBinder, this.serviceAction);
            } catch (Exception unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static native void oneStubCenterCallFunc(int i, Object obj, Object obj2);
}
