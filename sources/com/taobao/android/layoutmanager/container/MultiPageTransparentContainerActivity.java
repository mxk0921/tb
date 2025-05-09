package com.taobao.android.layoutmanager.container;

import android.content.Context;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.acq;
import tb.cfu;
import tb.t2o;

/* compiled from: Taobao */
@PopLayer.PopupAllowedFromFragment
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MultiPageTransparentContainerActivity extends MultiPageContainerActivity implements cfu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268006);
        t2o.a(503316972);
    }

    public static /* synthetic */ Object ipc$super(MultiPageTransparentContainerActivity multiPageTransparentContainerActivity, String str, Object... objArr) {
        if (str.hashCode() == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/MultiPageTransparentContainerActivity");
    }

    @Override // com.taobao.android.layoutmanager.container.MultiPageContainerActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }
}
