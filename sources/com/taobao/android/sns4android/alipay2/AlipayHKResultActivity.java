package com.taobao.android.sns4android.alipay2;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.acq;
import tb.yeq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AlipayHKResultActivity extends AlipaySSOResultActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(AlipayHKResultActivity alipayHKResultActivity, String str, Object... objArr) {
        if (str.hashCode() == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sns4android/alipay2/AlipayHKResultActivity");
    }

    @Override // com.taobao.android.sns4android.alipay2.AlipaySSOResultActivity
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99bbaeb3", new Object[]{this});
        } else {
            yeq.a(getIntent());
        }
    }

    @Override // com.taobao.android.sns4android.alipay2.AlipaySSOResultActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
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
