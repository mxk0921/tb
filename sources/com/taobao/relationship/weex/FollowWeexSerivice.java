package com.taobao.relationship.weex;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.relationship.application.RelationshipApplication;
import com.taobao.tao.TaobaoApplication;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.IExternalComponentGetter;
import com.taobao.weex.ui.component.WXComponent;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FollowWeexSerivice extends Service implements IExternalComponentGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FOLLOW_WEEX_BUTTON = "followsdkbutton";

    static {
        t2o.a(759169074);
        t2o.a(985661649);
    }

    public FollowWeexSerivice() {
        ApplicationInvoker.getInstance("com.taobao.relationship").invoke("com.taobao.relationship.application.RelationshipApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(FollowWeexSerivice followWeexSerivice, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/relationship/weex/FollowWeexSerivice");
    }

    @Override // com.taobao.weex.ui.IExternalComponentGetter
    public Class<? extends WXComponent> getExternalComponentClass(String str, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("464bab4e", new Object[]{this, str, wXSDKInstance});
        }
        if (TextUtils.equals(FOLLOW_WEEX_BUTTON, str)) {
            return FollowWeexComponent.class;
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
