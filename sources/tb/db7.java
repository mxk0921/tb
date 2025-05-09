package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class db7 implements rb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IDMComponent f17705a;

    static {
        t2o.a(83886226);
        t2o.a(83886225);
    }

    public IDMComponent a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("80a38852", new Object[]{this});
        }
        return this.f17705a;
    }

    public void b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07afad2", new Object[]{this, iDMComponent});
        } else {
            this.f17705a = iDMComponent;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ced5a91", new Object[]{this, new Integer(i)});
        }
    }
}
