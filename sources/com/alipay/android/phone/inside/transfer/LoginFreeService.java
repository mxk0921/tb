package com.alipay.android.phone.inside.transfer;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.alipay.android.phone.inside.transfer.IFetchLoginInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.esg;
import tb.irg;
import tb.jsg;
import tb.mu7;
import tb.uih;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LoginFreeService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class Mybind extends IFetchLoginInfo.Stub implements IBinder {
        public Mybind() {
        }

        @Override // com.alipay.android.phone.inside.transfer.IFetchLoginInfo
        public String getTokenLoginInfo() {
            irg.a("link_tag", "LoginFreeService === getTokenLoginInfo === 获取到的免登信息：" + uih.f().f29397a);
            String e = jsg.e(LoginFreeService.access$000(LoginFreeService.this));
            if (!TextUtils.isEmpty(e)) {
                ((HashMap) uih.f().b).put(e, Boolean.TRUE);
            }
            irg.a("link_tag", "LoginFreeService === getTokenLoginInfo === 写入免登信息包名集合：" + uih.f().b);
            esg.b(esg.ARG1_READ_LOGIN_FREE, "", uih.f().f29397a, null);
            mu7.k().d(LoginFreeService.access$000(LoginFreeService.this), e);
            return uih.f().f29397a;
        }
    }

    public static /* synthetic */ Context access$000(LoginFreeService loginFreeService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1ef3ae99", new Object[]{loginFreeService});
        }
        return loginFreeService.mContext;
    }

    public static /* synthetic */ Object ipc$super(LoginFreeService loginFreeService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode == 1992651935) {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/phone/inside/transfer/LoginFreeService");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return new Mybind();
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        this.mContext = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        return super.onStartCommand(intent, i, i2);
    }
}
