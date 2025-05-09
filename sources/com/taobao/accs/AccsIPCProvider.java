package com.taobao.accs;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.core.ipc.provider.ARangerProvider;
import tb.j8l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AccsIPCProvider extends ARangerProvider {
    static {
        t2o.a(343932937);
    }

    @Override // com.taobao.aranger.core.ipc.provider.ARangerProvider, android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            GlobalClientInfo.mContext = context;
        }
        UtilityImpl.debug(GlobalClientInfo.mContext);
        if (j8l.u()) {
            GlobalAppRuntimeInfo.setBackground(false);
        }
        super.onCreate();
        return false;
    }
}
