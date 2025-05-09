package com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core;

import android.app.Application;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IAppAdapter extends Serializable {
    String getAppVersion();

    Application getApplication();

    int getStatusBarHeight();

    String getTTID();

    String getUTDID();

    boolean isDebug();
}
