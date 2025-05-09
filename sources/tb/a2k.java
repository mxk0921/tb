package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity;
import com.taobao.mytaobao.newsetting.business.model.ComplianceSettingItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a2k implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NewTaobaoSettingActivity f15508a;
    public final /* synthetic */ ComplianceSettingItem b;

    public a2k(NewTaobaoSettingActivity newTaobaoSettingActivity, ComplianceSettingItem complianceSettingItem) {
        this.f15508a = newTaobaoSettingActivity;
        this.b = complianceSettingItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        Nav.from(this.f15508a).toUri(this.b.navUrl);
        NewTaobaoSettingActivity.g(this.f15508a, this.b);
    }
}
