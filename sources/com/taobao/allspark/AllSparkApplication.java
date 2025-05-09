package com.taobao.allspark;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AllSparkApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private InitTaskImpl initTask = new InitTaskImpl(this, false);

    public static /* synthetic */ Object ipc$super(AllSparkApplication allSparkApplication, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -364441911) {
            super.onTerminate();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/allspark/AllSparkApplication");
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        this.initTask.p();
    }

    @Override // android.app.Application
    public void onTerminate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea470ec9", new Object[]{this});
            return;
        }
        this.initTask.q();
        super.onTerminate();
    }
}
