package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p3h extends jfw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_IS_LAST_TAB = "isLastTab";
    public static final String KEY_PAGE_UT_PARAMS = "pageUtParams";
    public String E0;
    public Map F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public String J0;
    public Map x0;
    public String w0 = a.DEFAULT_REFRESH_URL;
    public float y0 = 0.0f;
    public float z0 = 0.0f;
    public float A0 = 0.0f;
    public float B0 = 0.0f;
    public int C0 = 5000;
    public String D0 = "mixLive";

    static {
        t2o.a(779092119);
    }

    public static /* synthetic */ Object ipc$super(p3h p3hVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -998046064) {
            super.B((Context) objArr[0], (HashMap) objArr[1]);
            return null;
        } else if (hashCode == -407167169) {
            super.v((Context) objArr[0], (String) objArr[1], objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tab2liveroom/liveroom/LiveRoomParams");
        }
    }

    @Override // tb.jfw
    public void B(Context context, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4830690", new Object[]{this, context, hashMap});
            return;
        }
        super.B(context, hashMap);
        if (akt.Q0(this.H0, this.J0)) {
            this.r = 0.0f;
            this.m = 0;
        }
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7a6a70f", new Object[]{this})).booleanValue();
        }
        return this.I0;
    }

    public float J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7f3d94c", new Object[]{this})).floatValue();
        }
        return this.B0;
    }

    public float K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afbb8ce8", new Object[]{this})).floatValue();
        }
        return this.A0;
    }

    public float L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6efbcb8b", new Object[]{this})).floatValue();
        }
        return this.z0;
    }

    public String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
        }
        return this.J0;
    }

    public float N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ab7db09", new Object[]{this})).floatValue();
        }
        return this.y0;
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("addb676a", new Object[]{this})).booleanValue();
        }
        return this.H0;
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf961ea0", new Object[]{this})).booleanValue();
        }
        return this.G0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
        if (r10.equals("source") == false) goto L_0x002a;
     */
    @Override // tb.jfw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(android.content.Context r9, java.lang.String r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.p3h.v(android.content.Context, java.lang.String, java.lang.Object):void");
    }
}
