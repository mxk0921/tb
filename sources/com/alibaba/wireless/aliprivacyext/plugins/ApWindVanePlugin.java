package com.alibaba.wireless.aliprivacyext.plugins;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.g01;
import tb.kpw;
import tb.nsw;
import tb.nwx;
import tb.pwx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ApWindVanePlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ApWindVanePlugin";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements pwx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f3387a;

        public a(WVCallBackContext wVCallBackContext) {
            this.f3387a = wVCallBackContext;
        }

        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else {
                this.f3387a.error(ApWindVanePlugin.access$000(ApWindVanePlugin.this, map, false));
            }
        }

        public void b(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            } else {
                this.f3387a.success(ApWindVanePlugin.access$000(ApWindVanePlugin.this, map, true));
            }
        }
    }

    public static /* synthetic */ nsw access$000(ApWindVanePlugin apWindVanePlugin, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsw) ipChange.ipc$dispatch("d7e80712", new Object[]{apWindVanePlugin, map, new Boolean(z)});
        }
        return apWindVanePlugin.buildWVResultFromMap(map, z);
    }

    private nsw buildWVResultFromMap(Map<String, Object> map, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsw) ipChange.ipc$dispatch("9722e5fa", new Object[]{this, map, new Boolean(z)});
        }
        if (z) {
            str = "HY_SUCCESS";
        } else {
            str = "HY_FAILED";
        }
        nsw nswVar = new nsw(str);
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                nswVar.a(entry.getKey(), entry.getValue());
            }
        }
        g01.a(TAG, nswVar.m());
        return nswVar;
    }

    public static /* synthetic */ Object ipc$super(ApWindVanePlugin apWindVanePlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/plugins/ApWindVanePlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        return nwx.a(this.mContext, str, str2, new a(wVCallBackContext));
    }
}
