package com.taobao.mytaobao.newsetting;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.autosize.TBDeviceUtils;
import kotlin.Metadata;
import tb.ckf;
import tb.nj7;
import tb.t2o;
import tb.xnj;
import tb.zmj;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/mytaobao/newsetting/MTbSettingsNavProcessor;", "Ltb/xnj;", "<init>", "()V", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Ltb/zmj;", "navContext", "", "process", "(Landroid/content/Intent;Ltb/zmj;)Z", "skip", "()Z", "", "name", "()Ljava/lang/String;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MTbSettingsNavProcessor implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537776);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "mtb";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        ckf.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        ckf.h(zmjVar, "navContext");
        if ((TBDeviceUtils.p(zmjVar.d()) || TBDeviceUtils.P(zmjVar.d())) && (data = intent.getData()) != null) {
            intent.setData(data.buildUpon().appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen").build());
        }
        return true;
    }
}
