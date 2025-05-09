package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.contacts.data.member.RecentMember;
import com.taobao.share.ui.engine.friend.ContactInfo;
import com.taobao.tao.friends.model.SourceType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rk4 extends ma4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ContactInfo d;
    public uk4 e;
    public RecentMember f;
    public SourceType g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;

    static {
        t2o.a(666894409);
    }

    public static /* synthetic */ Object ipc$super(rk4 rk4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/friends/model/ContactComponent");
    }

    public uk4 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uk4) ipChange.ipc$dispatch("c276adee", new Object[]{this});
        }
        return this.e;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c509bc89", new Object[]{this});
        }
        return this.h;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("813f1942", new Object[]{this});
        }
        return this.j;
    }

    public RecentMember j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecentMember) ipChange.ipc$dispatch("e3134de5", new Object[]{this});
        }
        return this.f;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c00d2ba9", new Object[]{this});
        }
        return this.i;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1429a872", new Object[]{this});
        }
        return this.k;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e681dc82", new Object[]{this});
        }
        return this.l;
    }

    public SourceType n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SourceType) ipChange.ipc$dispatch("70107c4e", new Object[]{this});
        }
        return this.g;
    }

    public void o(uk4 uk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df27ad4", new Object[]{this, uk4Var});
        } else {
            this.e = uk4Var;
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ad150d", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b234f74", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void r(RecentMember recentMember) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7934dbbf", new Object[]{this, recentMember});
        } else {
            this.f = recentMember;
        }
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddad7ed", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9848ac", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a582834", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void v(SourceType sourceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33bcf7ee", new Object[]{this, sourceType});
        } else {
            this.g = sourceType;
        }
    }
}
