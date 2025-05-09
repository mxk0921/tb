package tb;

import com.taobao.contacts.data.member.RecentMember;
import com.taobao.tao.friends.model.ContactType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uk4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f29428a;
    public String b;
    public ContactType c;
    public final String d;

    static {
        t2o.a(666894410);
    }

    public uk4(String str, String str2, int i, String str3) {
        this(str, str2, i);
        this.d = str3;
    }

    public uk4(String str, String str2, int i) {
        this.c = ContactType.CONTINGENT;
        this.f29428a = str;
        this.b = str2;
        if (RecentMember.ShareChannelType.WEIXIN.getValue() != i && RecentMember.ShareChannelType.QQ.getValue() != i && RecentMember.ShareChannelType.ALIPAY.getValue() != i) {
            RecentMember.ShareChannelType.DINGTALK.getValue();
        }
    }

    public uk4() {
        this.c = ContactType.CONTINGENT;
    }
}
