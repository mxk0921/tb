package com.alibaba.wireless.aliprivacyext.jsbridge.api;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.aliprivacy.AliPrivacyCore;
import com.alibaba.wireless.aliprivacyext.jsbridge.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.mwx;
import tb.osx;
import tb.pwx;

/* compiled from: Taobao */
@c(name = {"setAuthStatus"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class i extends osx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int status;
        private String type;

        private a() {
        }

        public int getStatus() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
            }
            return this.status;
        }

        public String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.type;
        }

        public void setStatus(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
            } else {
                this.status = i;
            }
        }

        public void setType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            } else {
                this.type = str;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/jsbridge/api/i");
    }

    @Override // tb.osx
    public boolean b(Context context, String str, String str2, pwx pwxVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, pwxVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            a(pwxVar, "参数异常", null);
            return true;
        }
        a aVar = (a) mwx.i(str2, a.class);
        if (aVar == null || !"pasteboard".equals(aVar.getType())) {
            a(pwxVar, "参数异常", null);
            return true;
        }
        HashMap hashMap = new HashMap();
        if (aVar.getStatus() == 1) {
            z = true;
        }
        hashMap.put("status", Integer.valueOf(AliPrivacyCore.u(z) ? 1 : -1));
        c(pwxVar, "调用成功", hashMap);
        return true;
    }
}
