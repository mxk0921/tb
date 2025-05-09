package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.goodcard.GoodCardItemTppBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dba extends cba {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String a0;
    public String b0;
    public String d0;
    public Map<String, Object> e0;
    public String f0;
    public yir i0;
    public q6q k0;
    public boolean m0;
    public final ijw Y = new ijw();
    public boolean Z = false;
    public final List<GoodCardItemTppBean> c0 = new ArrayList();
    public boolean g0 = false;
    public boolean h0 = false;
    public final ggg j0 = new ggg();
    public boolean l0 = false;

    static {
        t2o.a(779092842);
    }

    public dba(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(dba dbaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/controller2/GlobalContextForRoom");
    }

    public boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36b15fa0", new Object[]{this})).booleanValue();
        }
        return this.Z;
    }

    public yir s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yir) ipChange.ipc$dispatch("9581bfbf", new Object[]{this});
        }
        return this.i0;
    }

    public ijw t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijw) ipChange.ipc$dispatch("2d63ab1c", new Object[]{this});
        }
        return this.Y;
    }

    public void u0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacd3c76", new Object[]{this, new Boolean(z)});
        } else {
            this.Z = z;
        }
    }

    public void v0(yir yirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62bb2129", new Object[]{this, yirVar});
        } else {
            this.i0 = yirVar;
        }
    }
}
