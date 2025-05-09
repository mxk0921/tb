package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.contacts.common.ContactsListController;
import com.taobao.contacts.common.ContactsMgr;
import com.taobao.contacts.data.member.ContactMember;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bl4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ContactsListController f16460a;

    static {
        t2o.a(664797224);
    }

    public bl4(Context context) {
        this.f16460a = new ContactsListController(context.getApplicationContext(), ContactsMgr.instance(context.getApplicationContext()));
    }

    public void a(ArrayList<ContactMember> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4df4dc", new Object[]{this, arrayList});
        } else {
            this.f16460a.saveRecentShare(arrayList);
        }
    }
}
