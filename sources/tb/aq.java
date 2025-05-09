package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.LSDB;
import com.taobao.downgrade.a;
import com.taobao.downgrade.rule.AvailableBizRule;
import com.taobao.downgrade.rule.BusinessRule;
import com.taobao.downgrade.rule.DefaultRule;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class aq implements vnq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LSDB f15924a = LSDB.open("downgrade", null);

    @Override // tb.vnq
    public BusinessRule a(String str) {
        LSDB lsdb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BusinessRule) ipChange.ipc$dispatch("c5abb57c", new Object[]{this, str});
        }
        if (str == null || (lsdb = this.f15924a) == null) {
            return null;
        }
        return fwf.c(lsdb.getString(new k3g(str)));
    }

    @Override // tb.vnq
    public DefaultRule b(String str) {
        LSDB lsdb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultRule) ipChange.ipc$dispatch("9b14470c", new Object[]{this, str});
        }
        if (str == null || (lsdb = this.f15924a) == null) {
            return null;
        }
        return fwf.d(lsdb.getString(new k3g(str)));
    }

    @Override // tb.vnq
    public void c(String str) {
        AvailableBizRule b;
        Map<String, String> bizMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bdbf7d", new Object[]{this, str});
        } else if (this.f15924a.keyIterator() != null && str != null && (b = fwf.b(str)) != null && b.getBizMap() != null && (bizMap = b.getBizMap()) != null) {
            Collection<String> values = bizMap.values();
            jpf<k3g> keyIterator = this.f15924a.keyIterator();
            while (true) {
                k3g next = keyIterator.next();
                if (next != null) {
                    if (!"default".equals(next.a()) && !values.contains(next.a())) {
                        this.f15924a.delete(next);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // tb.vnq
    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3c7ec06", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return this.f15924a.insertString(new k3g("ava"), str);
    }

    @Override // tb.vnq
    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8046b3f7", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return this.f15924a.insertString(new k3g("default"), str);
    }

    @Override // tb.vnq
    public boolean f(String str) {
        BusinessRule c;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8b94dcd", new Object[]{this, str})).booleanValue();
        }
        if (!(str == null || (c = fwf.c(str)) == null || (str2 = c.businessRuleName) == null)) {
            k3g k3gVar = new k3g(str2);
            this.f15924a.delete(k3gVar);
            if (!a.x(c) || !this.f15924a.insertString(k3gVar, str)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
