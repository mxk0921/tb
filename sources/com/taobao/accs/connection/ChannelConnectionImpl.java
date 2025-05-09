package com.taobao.accs.connection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.state.StateMachine;
import com.taobao.accs.connection.state.a;
import com.taobao.accs.net.BaseConnection;
import com.taobao.accs.net.InAppConnection;
import com.taobao.accs.utl.ALog;
import com.taobao.aranger.exception.IPCException;
import tb.t2o;
import tb.va8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ChannelConnectionImpl implements IChannelConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ChannelConnectionImpl";

    static {
        t2o.a(343933052);
        t2o.a(343933062);
    }

    @Override // com.taobao.accs.connection.IChannelConnection
    public void mainProcessStartUp(StateMachine.Event event) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea44522", new Object[]{this, event});
            return;
        }
        ALog.e(TAG, "mainProcessStartUp", new Object[0]);
        a.v().c(event);
    }

    @Override // com.taobao.accs.connection.IChannelConnection
    public void start(String str, int i, IChannelConnListener iChannelConnListener) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c4f150", new Object[]{this, str, new Integer(i), iChannelConnListener});
            return;
        }
        ALog.e(TAG, "start()", Constants.KEY_CONFIG_TAG, str, "state", Integer.valueOf(i));
        if (iChannelConnListener != null) {
            try {
                iChannelConnListener.onStart();
                InAppConnection.I = true;
                BaseConnection connection = va8.getConnection(GlobalClientInfo.getContext(), str, false, -1, i);
                connection.M(i);
                connection.P();
            } catch (Throwable th) {
                ALog.e(TAG, "start err", th, new Object[0]);
            }
        }
    }
}
