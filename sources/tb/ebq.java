package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl;
import tb.hgb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ebq extends NormalLiveRoomWindowImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements hgb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.hgb.a
        public void onAppInBackgroud() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c87472c", new Object[]{this});
            } else {
                ebq.this.p();
            }
        }

        @Override // tb.hgb.a
        public void onAppInForeground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("111bbcb1", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(779093214);
    }

    public ebq(ux9 ux9Var, Context context) {
        super(ux9Var, context);
    }

    public static /* synthetic */ Object ipc$super(ebq ebqVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == -953825274) {
            super.b((String) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/player/standard/window/SpecialLiveRoomWindowImpl");
        }
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf7715a2", new Object[]{this})).booleanValue();
        }
        return ejr.i();
    }

    public final String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d329cd6", new Object[]{this});
        }
        ux9 ux9Var = this.b;
        if (ux9Var == null) {
            return null;
        }
        String m = ux9Var.m();
        this.b.a0(null);
        return m;
    }

    public final boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0a42034", new Object[]{this})).booleanValue();
        }
        if (!ejr.c()) {
            return false;
        }
        String D = D();
        cir.a("Tab2SpecialLiveRoomWindowImpl", "insideDetailFlag:" + D);
        if (!TextUtils.isEmpty(D)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl, tb.cmc
    public void b(String str, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c725c806", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (z2 || E()) {
            o(str, z, C());
        } else {
            super.b(str, z, false, z3);
        }
    }

    @Override // com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl, tb.cmc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            super.destroy();
        }
    }

    @Override // com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f3f934", new Object[]{this});
        } else if (this.f13233a == null) {
            this.f13233a = new a();
        }
    }
}
