package com.taobao.relationship.jsbridge;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.relationship.application.RelationshipApplication;
import com.taobao.tao.TaobaoApplication;
import tb.ihc;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FollowJsBridgeService extends Service implements ihc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(759169038);
        t2o.a(989856204);
    }

    public FollowJsBridgeService() {
        ApplicationInvoker.getInstance("com.taobao.relationship").invoke("com.taobao.relationship.application.RelationshipApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(FollowJsBridgeService followJsBridgeService, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/relationship/jsbridge/FollowJsBridgeService");
    }

    @Override // tb.ihc
    public Class<? extends kpw> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.equals(AllSparkFollowJsBridge.PAGE, str)) {
            return AllSparkFollowJsBridge.class;
        }
        if (TextUtils.equals(AllSparkFollowJsBridgeV3.PAGE, str)) {
            return AllSparkFollowJsBridgeV3.class;
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

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        RelationshipApplication.init();
    }
}
