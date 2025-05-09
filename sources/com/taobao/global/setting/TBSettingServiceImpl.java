package com.taobao.global.setting;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.io.Serializable;
import tb.j9t;
import tb.mvd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBSettingServiceImpl implements mvd, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT = "default";
    private String bizCode = "default";

    public int getVideoPlayNetworkType(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bfda2e4", new Object[]{this, context, new Integer(i)})).intValue();
        }
        j9t e = j9t.e(context, this.bizCode);
        if (e == null) {
            return i;
        }
        return e.b().e(i);
    }

    @Override // tb.mvd
    public boolean isAutoPlayVideoUnderCurrentNetwork(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b5748a6", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            context = Globals.getApplication();
        }
        j9t e = j9t.e(context, this.bizCode);
        if (e == null) {
            return false;
        }
        return e.b().isAutoPlayVideoUnderCurrentNetwork(context);
    }

    @Override // tb.mvd
    @Deprecated
    public boolean isAutoPlayVideoUnderWifi(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f309c796", new Object[]{this, context, new Boolean(z)})).booleanValue();
        }
        j9t e = j9t.e(context, this.bizCode);
        if (e == null) {
            return z;
        }
        return e.b().i(z);
    }

    public boolean isTaoPassWordCutOpen(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d6dff50", new Object[]{this, context, new Boolean(z)})).booleanValue();
        }
        j9t e = j9t.e(context, this.bizCode);
        if (e == null) {
            return z;
        }
        return e.b().g(z);
    }

    @Deprecated
    public void setAutoPlayVideoUnderWifi(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8b8caca", new Object[]{this, context, new Boolean(z)});
            return;
        }
        j9t e = j9t.e(context, this.bizCode);
        if (e != null) {
            e.c().e(z);
            e.c().b(0);
        }
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.bizCode = str;
        }
    }

    public void setVideoPlayNetworkType(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabdf4fd", new Object[]{this, context, new Integer(i)});
            return;
        }
        j9t e = j9t.e(context, this.bizCode);
        if (e != null) {
            e.c().b(i);
        }
    }
}
