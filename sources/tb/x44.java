package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.n;
import com.taobao.mmad.data.BaseMmAdModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class x44 extends ku1<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final jj8 c = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements jj8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.jj8
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
            } else if (x44.j(x44.this) != null) {
                x44.k(x44.this).onFail(str, str2);
            }
        }

        @Override // tb.jj8
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            BaseMmAdModel a2 = x44.g(x44.this).d().a();
            ba3.f(a2.getTargetUrl(), a2.cardItemId, jSONObject);
            if (x44.h(x44.this) != null) {
                x44.i(x44.this).onSuccess(jSONObject);
            }
        }
    }

    static {
        t2o.a(573571087);
    }

    public static /* synthetic */ nwi g(x44 x44Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwi) ipChange.ipc$dispatch("7d983649", new Object[]{x44Var});
        }
        return x44Var.b;
    }

    public static /* synthetic */ jj8 h(x44 x44Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jj8) ipChange.ipc$dispatch("ea29945a", new Object[]{x44Var});
        }
        return x44Var.f22924a;
    }

    public static /* synthetic */ jj8 i(x44 x44Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jj8) ipChange.ipc$dispatch("e95023b9", new Object[]{x44Var});
        }
        return x44Var.f22924a;
    }

    public static /* synthetic */ Object ipc$super(x44 x44Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/ability/biz/CommonActionEvent");
    }

    public static /* synthetic */ jj8 j(x44 x44Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jj8) ipChange.ipc$dispatch("e876b318", new Object[]{x44Var});
        }
        return x44Var.f22924a;
    }

    public static /* synthetic */ jj8 k(x44 x44Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jj8) ipChange.ipc$dispatch("e79d4277", new Object[]{x44Var});
        }
        return x44Var.f22924a;
    }

    @Override // tb.ku1
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adef98ca", new Object[]{this});
        }
        return "commonActionEvent";
    }

    public final void l(boolean z) {
        jj8 jj8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5046c", new Object[]{this, new Boolean(z)});
            return;
        }
        BaseMmAdModel a2 = this.b.d().a();
        nj8 f = this.b.f();
        ne0 ne0Var = new ne0(a2);
        if (z) {
            jj8Var = this.c;
        } else {
            jj8Var = this.f22924a;
        }
        f.b(me0.EVENT_TYPE, nj8.a(ne0Var, jj8Var));
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3bc6f7", new Object[]{this});
        } else {
            this.b.f().b(n.LEAVE_TYPE_JUMP_NEXT_PAGE, nj8.a(this.b.d().a().getTargetUrl(), this.f22924a));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r7.equals("3") == false) goto L_0x0033;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.x44.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "6adffea7"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r6
            r0[r1] = r7
            r3.ipc$dispatch(r4, r0)
            return
        L_0x0015:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "commonActionEvent start execute, and actionResponse: "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "CommonActionEvent"
            tb.jgh.a(r4, r3)
            r7.hashCode()
            r3 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case 49: goto L_0x0075;
                case 50: goto L_0x006a;
                case 51: goto L_0x0061;
                case 48626: goto L_0x0056;
                case 48627: goto L_0x004b;
                case 48630: goto L_0x0040;
                case 48631: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            r0 = -1
            goto L_0x007f
        L_0x0035:
            java.lang.String r0 = "106"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x003e
            goto L_0x0033
        L_0x003e:
            r0 = 6
            goto L_0x007f
        L_0x0040:
            java.lang.String r0 = "105"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0049
            goto L_0x0033
        L_0x0049:
            r0 = 5
            goto L_0x007f
        L_0x004b:
            java.lang.String r0 = "102"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0054
            goto L_0x0033
        L_0x0054:
            r0 = 4
            goto L_0x007f
        L_0x0056:
            java.lang.String r0 = "101"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x005f
            goto L_0x0033
        L_0x005f:
            r0 = 3
            goto L_0x007f
        L_0x0061:
            java.lang.String r5 = "3"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x007f
            goto L_0x0033
        L_0x006a:
            java.lang.String r0 = "2"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0073
            goto L_0x0033
        L_0x0073:
            r0 = 1
            goto L_0x007f
        L_0x0075:
            java.lang.String r0 = "1"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x007e
            goto L_0x0033
        L_0x007e:
            r0 = 0
        L_0x007f:
            switch(r0) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x00a1;
                case 2: goto L_0x009d;
                case 3: goto L_0x0096;
                case 4: goto L_0x008f;
                case 5: goto L_0x009d;
                case 6: goto L_0x0096;
                default: goto L_0x0082;
            }
        L_0x0082:
            java.lang.String r0 = "can't handle, default jumpNextPage, actionResponse="
            java.lang.String r7 = r0.concat(r7)
            tb.jgh.a(r4, r7)
            r6.m()
            goto L_0x00a8
        L_0x008f:
            r6.o()
            r6.m()
            goto L_0x00a8
        L_0x0096:
            r6.l(r1)
            r6.m()
            goto L_0x00a8
        L_0x009d:
            r6.m()
            goto L_0x00a8
        L_0x00a1:
            r6.o()
            goto L_0x00a8
        L_0x00a5:
            r6.l(r2)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.x44.e(java.lang.String):void");
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7c28f0", new Object[]{this});
        } else {
            this.b.f().b("claimedCoupon", nj8.a(new rln(this.b.d().a()), this.f22924a));
        }
    }
}
