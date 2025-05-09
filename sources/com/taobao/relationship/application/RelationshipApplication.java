package com.taobao.relationship.application;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.relationship.jsbridge.AllSparkFollowJsBridge;
import com.taobao.relationship.weex.FollowWeexComponent;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKEngine;
import tb.fsw;
import tb.t2o;
import tb.zca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RelationshipApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean isInit = false;
    private static Application sApplication;

    static {
        t2o.a(759169026);
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        if (!isInit) {
            init();
        }
        return sApplication;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!isInit) {
            Application application = Globals.getApplication();
            sApplication = application;
            try {
                zca.b(application);
                fsw.h(AllSparkFollowJsBridge.PAGE, AllSparkFollowJsBridge.class);
                WXSDKEngine.registerComponent("followsdkbutton", FollowWeexComponent.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
            isInit = true;
        }
    }

    public static /* synthetic */ Object ipc$super(RelationshipApplication relationshipApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/relationship/application/RelationshipApplication");
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        new TaoApplication().onCreate(this);
        TLog.logi("FavoriteApplication", "onCreate" + isInit);
        init();
    }
}
