package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o1o implements rb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IDMComponent f25088a;
    public IDMComponent b;

    static {
        t2o.a(83886228);
        t2o.a(83886225);
    }

    public IDMComponent a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("80a38852", new Object[]{this});
        }
        return this.f25088a;
    }

    public IDMComponent b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("16b532b1", new Object[]{this});
        }
        return this.b;
    }

    public void c(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07afad2", new Object[]{this, iDMComponent});
        } else {
            this.f25088a = iDMComponent;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ced5a91", new Object[]{this, new Integer(i)});
        }
    }

    public void e(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f3b6bb", new Object[]{this, iDMComponent});
        } else {
            this.b = iDMComponent;
        }
    }
}
