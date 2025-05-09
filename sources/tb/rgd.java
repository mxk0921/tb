package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IRRoomProxy f27358a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final rgd f27359a = new rgd();

        static {
            t2o.a(295700135);
        }

        public static /* synthetic */ rgd a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rgd) ipChange.ipc$dispatch("f12b722a", new Object[0]);
            }
            return f27359a;
        }
    }

    static {
        t2o.a(295700134);
    }

    public static rgd b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgd) ipChange.ipc$dispatch("967b1685", new Object[0]);
        }
        return a.a();
    }

    public IRRoomProxy a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRRoomProxy) ipChange.ipc$dispatch("7ba1e9bb", new Object[]{this});
        }
        if (!giv.c().b()) {
            if (this.f27358a == null) {
                this.f27358a = (IRRoomProxy) yfd.c().b(IRRoomProxy.KEY);
            }
        } else if (this.f27358a == null) {
            this.f27358a = (IRRoomProxy) yfd.c().b(IRRoomProxy.KEY_DIANTAO);
        }
        return this.f27358a;
    }

    public int c(String str) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a98c03a0", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str) || b().a() == null || b().a().getRoomRIdMap() == null || (num = b().a().getRoomRIdMap().get(str)) == null) {
            return -233;
        }
        return num.intValue();
    }
}
