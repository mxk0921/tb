package com.taobao.falco;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.falco.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.cck;
import tb.ckh;
import tb.pz8;
import tb.s9u;
import tb.uqq;
import tb.utn;
import tb.uz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t extends pz8 implements s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CATEGORY_B2F = "b2f";
    public static final String CATEGORY_F2B = "f2b";
    public static final String CATEGORY_FLICK = "flick";
    public static final String CATEGORY_LAUNCH = "launch";
    public static final String CATEGORY_TAP = "tap";
    public volatile long J = -1;
    public volatile s.a K = null;
    public volatile long L = -1;
    public volatile long M = -1;
    public volatile s.a N = null;
    public volatile long O = -1;
    public volatile float P = -1.0f;
    public volatile float Q = -1.0f;
    public volatile String R;
    public static final uqq FALCO_ID = new uqq("falcoId");
    public static final uqq PARENT_FALCO_ID = new uqq("parentFalcoId");
    public static final uqq LOAD_FALCO_ID = new uqq("loadFalcoId");
    public static final uqq FROM_LOAD_FALCO_ID = new uqq("fromLoadFalcoId");
    public static final uqq CATEGORY = new uqq("category");
    public static final uqq USER_ID = new uqq("uid");
    public static final uqq PAGE_NAME = new uqq("pageName");
    public static final uqq PAGE_URL = new uqq("pageURL");
    public static final ckh TOUCH_DOWN_TIME = new ckh("touchDownT");
    public static final ckh TOUCH_UP_TIME = new ckh("touchUpT");
    public static final uqq TOUCH_DOWN_POINT = new uqq("touchDownPoint");
    public static final uqq TOUCH_UP_POINT = new uqq("touchUpPoint");
    public static final uqq RAGE_CLICKS_GROUP_ID = new uqq("rageClicksGroupId");
    public static final ckh TOUCH_MOVE_START_TIME = new ckh("touchMoveST");
    public static final uqq TOUCH_MOVE_START_POINT = new uqq("touchMoveSPoint");
    public static final ckh TOUCH_MOVE_END_TIME = new ckh("touchMoveET");
    public static final uqq TOUCH_MOVE_END_POINT = new uqq("touchMoveEPoint");
    public static final uqq WINDOW_SIZE = new uqq("windowSize");
    public static final uqq LOW_BUYER = new uqq("lowBuyer");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static final a DEFAULT = new a();

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f10479a;
        public final List<String> b;

        public a() {
            ArrayList arrayList = new ArrayList(5);
            this.f10479a = arrayList;
            ArrayList arrayList2 = new ArrayList(1);
            this.b = arrayList2;
            arrayList.add(t.FALCO_ID.getKey());
            arrayList.add(t.FROM_LOAD_FALCO_ID.getKey());
            arrayList.add(t.x1().getKey());
            arrayList.add(t.LOAD_FALCO_ID.getKey());
            arrayList.add(t.PAGE_NAME.getKey());
            arrayList2.add(t.PAGE_URL.getKey());
        }
    }

    public t(s9u s9uVar, String str, String str2, long j, Map<String, Object> map, List<utn> list) {
        super(s9uVar, str, str2, j, map, list, "MobileService");
        FALCO_ID.a(this, uz8.a());
        USER_ID.a(this, uz8.e());
    }

    public static /* synthetic */ Object ipc$super(t tVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoTouchActionSpanImpl");
    }

    public static /* synthetic */ uqq x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uqq) ipChange.ipc$dispatch("adb7b439", new Object[0]);
        }
        return pz8.ENV_FALCO_ID;
    }

    public void A1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400e27f9", new Object[]{this, str});
        } else {
            FROM_LOAD_FALCO_ID.a(this, str);
        }
    }

    public String B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6c70505", new Object[]{this});
        }
        return this.R;
    }

    public s.a C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s.a) ipChange.ipc$dispatch("8dddbd45", new Object[]{this});
        }
        return this.K;
    }

    public final String D1(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("513e23fa", new Object[]{this, str, new Integer(i)});
        }
        if (str == null || str.length() <= i) {
            return str;
        }
        return str.substring(0, i);
    }

    public void E1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a724a53f", new Object[]{this, str});
        } else {
            PARENT_FALCO_ID.a(this, str);
        }
    }

    public void F1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17dac053", new Object[]{this, str});
        } else {
            RAGE_CLICKS_GROUP_ID.a(this, str);
        }
    }

    public void G1(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0bfff4", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        uqq uqqVar = WINDOW_SIZE;
        uqqVar.a(this, i + "," + i2);
    }

    public void H1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d5fa41", new Object[]{this, str});
        } else {
            LOAD_FALCO_ID.a(this, str);
        }
    }

    public void I1(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f166d19d", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.K = new s.a(f, f2);
        uqq uqqVar = TOUCH_DOWN_POINT;
        uqqVar.a(this, f + "," + f2);
    }

    public void J1(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc46ab4", new Object[]{this, l});
            return;
        }
        this.J = cck.v0(l);
        TOUCH_DOWN_TIME.a(this, Long.valueOf(z1(Long.valueOf(this.J))));
    }

    public void K1(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03f2a8c", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.P = f;
        this.Q = f2;
        if (this.N == null) {
            this.N = new s.a(f, f2);
        }
    }

    public void L1(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed91a4e3", new Object[]{this, l});
            return;
        }
        this.O = cck.v0(l);
        if (this.M <= 0) {
            this.M = this.O;
        }
    }

    public void M1(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f22f96", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        uqq uqqVar = TOUCH_UP_POINT;
        uqqVar.a(this, f + "," + f2);
    }

    public void N1(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f1656d", new Object[]{this, l});
            return;
        }
        this.L = cck.v0(l);
        TOUCH_UP_TIME.a(this, Long.valueOf(z1(Long.valueOf(this.L))));
    }

    @Override // tb.pz8
    public void V0(long j, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eff74e", new Object[]{this, new Long(j), str});
            return;
        }
        if (this.M > 0) {
            TOUCH_MOVE_START_TIME.a(this, Long.valueOf(z1(Long.valueOf(this.M))));
        }
        if (this.N != null) {
            uqq uqqVar = TOUCH_MOVE_START_POINT;
            uqqVar.a(this, this.N.f10478a + "," + this.N.b);
        }
        if (this.O > 0) {
            TOUCH_MOVE_END_TIME.a(this, Long.valueOf(z1(Long.valueOf(this.O))));
        }
        if (this.P >= 0.0f && this.Q >= 0.0f) {
            uqq uqqVar2 = TOUCH_MOVE_END_POINT;
            uqqVar2.a(this, this.P + "," + this.Q);
        }
        if (!TextUtils.isEmpty(this.R)) {
            CATEGORY.a(this, this.R);
        }
        uqq uqqVar3 = LOW_BUYER;
        if (SceneIdentifier.isLowBuyer()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        uqqVar3.a(this, str2);
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("638e43b3", new Object[]{this})).longValue();
        }
        return this.J;
    }

    @Override // com.taobao.falco.s
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this});
        }
        return (String) A0(PAGE_URL.getKey());
    }

    @Override // tb.pz8
    public List<String> f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3ef41017", new Object[]{this});
        }
        return a.DEFAULT.f10479a;
    }

    @Override // com.taobao.falco.s
    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82566f56", new Object[]{this})).longValue();
        }
        if (this.L > 0) {
            return this.L;
        }
        if (this.O > 0) {
            return this.O;
        }
        return this.J;
    }

    @Override // com.taobao.falco.s
    public String getFalcoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d91c337", new Object[]{this});
        }
        return (String) A0(FALCO_ID.getKey());
    }

    @Override // com.taobao.falco.s
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return (String) A0(PAGE_NAME.getKey());
    }

    @Override // com.taobao.falco.s
    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85bf1aec", new Object[]{this})).longValue();
        }
        return this.L;
    }

    public void l0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d065ef1", new Object[]{this, str});
        } else {
            PAGE_URL.a(this, D1(str, 512));
        }
    }

    @Override // tb.pz8
    public boolean r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("573aacde", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.pz8
    public List<String> w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f1f8722d", new Object[]{this});
        }
        return a.DEFAULT.b;
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838144cb", new Object[]{this, str});
        } else {
            PAGE_NAME.a(this, str);
        }
    }

    public void y1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61f050f", new Object[]{this, str});
        } else {
            this.R = str;
        }
    }

    public final long z1(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0765be0", new Object[]{this, l})).longValue();
        }
        return cck.v0(l) - z();
    }
}
