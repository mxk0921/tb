package tb;

import android.content.Intent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cash.activity.CustomBrowserActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zz4 implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CustomBrowserActivity f33116a;

    public zz4(CustomBrowserActivity customBrowserActivity) {
        this.f33116a = customBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        CustomBrowserActivity.l3(this.f33116a);
        this.f33116a.o3(new Intent("com.ali.user.cash.close.all"));
    }
}
