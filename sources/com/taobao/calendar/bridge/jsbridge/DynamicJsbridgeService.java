package com.taobao.calendar.bridge.jsbridge;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import tb.ihc;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DynamicJsbridgeService extends Service implements ihc {
    static {
        t2o.a(693108751);
        t2o.a(989856204);
    }

    @Override // tb.ihc
    public Class<? extends kpw> getBridgeClass(String str) {
        if (!TextUtils.isEmpty(str) && str.equals("TBCalendar")) {
            return CalendarJsBridge.class;
        }
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }
}
