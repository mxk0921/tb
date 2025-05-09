package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.global.a;
import com.taobao.android.detail2.core.framework.view.manager.ListViewManager;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class scf extends jcf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321858);
    }

    public scf(cxj cxjVar, dh7 dh7Var, DetailDataManager detailDataManager) {
        super(cxjVar, dh7Var, detailDataManager);
    }

    public static /* synthetic */ Object ipc$super(scf scfVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -594536419) {
            super.e(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 815638576) {
            return new Boolean(super.c(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (JSONObject) objArr[2], (List) objArr[3], ((Number) objArr[4]).intValue(), ((Boolean) objArr[5]).booleanValue()));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail2/core/framework/instancelistener/datafetch/InstanceTppDataFetchCallback");
        }
    }

    @Override // tb.jcf, com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public void b(boolean z, String str, x3w x3wVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1736fd2", new Object[]{this, new Boolean(z), str, x3wVar, new Boolean(z2)});
        } else {
            g(true, false, x3wVar.h, x3wVar);
        }
    }

    @Override // tb.jcf, com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public boolean c(boolean z, int i, JSONObject jSONObject, List<x3w> list, int i2, boolean z2) {
        boolean z3 = true;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("309da830", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, list, new Integer(i2), new Boolean(z2)})).booleanValue();
        }
        q(z, i, jSONObject);
        if (this.c.j().F0()) {
            this.c.j().o().mHasRefresh = true;
            r(true);
            this.f21916a.J0(list);
            this.b.l0(this.f21916a.K().size());
        } else if (DetailDataManager.W(z, i)) {
            z3 = o(list);
            if (z2) {
                this.c.j().b(this.f21916a.L());
            }
            this.b.l0(this.f21916a.K().size());
        } else if (z) {
            this.f21916a.R0(true);
            this.f21916a.n0(list);
            DetailDataManager detailDataManager = this.b;
            if (list != null) {
                i3 = list.size();
            }
            detailDataManager.o(i3);
        } else {
            this.f21916a.v(list);
            if (z2) {
                this.c.j().b(this.f21916a.L());
            }
            DetailDataManager detailDataManager2 = this.b;
            if (list != null) {
                i3 = list.size();
            }
            detailDataManager2.o(i3);
        }
        if (!z) {
            this.f21916a.O0(ListViewManager.ListStatus.STATUS_PULL_LOAD_MORE);
        }
        super.c(z, i, jSONObject, list, i2, z2);
        return z3;
    }

    @Override // tb.jcf, com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public boolean d(boolean z, String str, int i, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27ac07a4", new Object[]{this, new Boolean(z), str, new Integer(i), x3wVar})).booleanValue();
        }
        if (z || !"0".equals(str) || i != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76e2dd19", new Object[]{this})).booleanValue();
        }
        avn V = this.c.j().V();
        if ((V == null || !V.c() || V.d()) && !a.NO_ID_DEFAULT.equals(this.c.j().u())) {
            return true;
        }
        return false;
    }

    public final void q(boolean z, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8920434f", new Object[]{this, new Boolean(z), new Integer(i), jSONObject});
        } else if (jSONObject != null && DetailDataManager.W(z, i)) {
            this.f21916a.I0();
        }
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df544539", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) String.valueOf(z));
        this.f21916a.M0("refreshResult", jSONObject);
    }

    @Override // tb.jcf, com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public boolean a(boolean z, String str, int i, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4dbdb90", new Object[]{this, new Boolean(z), str, new Integer(i), x3wVar})).booleanValue();
        }
        if (z || !"0".equals(str) || i != 0) {
            boolean N = x3wVar.N();
            if (!N) {
                q0j.f(x3wVar, "recommend", q0j.ERROR_CODE_RECOMMEND_NODE_DETAIL_INFO_EMPTY, "推荐数据返回的节点detailinfo为空, 当前id：" + x3wVar.h, true);
            }
            return N;
        }
        if (!p() || TextUtils.equals(this.c.j().u(), x3wVar.h)) {
            boolean N2 = x3wVar.N();
            x3wVar.z = !N2;
            if (!N2) {
                q0j.f(x3wVar, "recommend", q0j.ERROR_CODE_RECOMMEND_FIRST_NODE_DETAIL_INFO_EMPTY, "推荐数据返回的首个节点detailinfo为空", true);
            }
        } else {
            x3wVar.z = true;
            x3wVar.q0();
            q0j.f(x3wVar, "recommend", q0j.ERROR_CODE_RECOMMEND_ITEM_ID_INCONSISTENCY, "推荐数据返回的itemid与入口id不一致, 入口id：" + this.c.j().u() + ", 当前id：" + x3wVar.h, true);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(java.util.List<tb.x3w> r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.scf.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "95a72213"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r9
            r4[r0] = r10
            java.lang.Object r10 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x001c:
            java.lang.Object r2 = r10.get(r1)
            tb.x3w r2 = (tb.x3w) r2
            tb.cxj r3 = r9.c
            com.taobao.android.detail2.core.framework.data.global.a r3 = r3.j()
            int r4 = r10.size()
            tb.cxj r5 = r9.c
            com.taobao.android.detail2.core.framework.data.global.a r5 = r5.j()
            java.lang.String r6 = r2.b
            boolean r5 = r5.J0(r1, r6)
            r3.a(r4, r5)
            boolean r3 = r2.z
            if (r3 == 0) goto L_0x0062
            com.taobao.android.detail2.core.framework.data.DetailDataManager r3 = r9.b
            tb.cxj r4 = r9.c
            com.taobao.android.detail2.core.framework.data.global.a r4 = r4.j()
            java.lang.String r4 = r4.u()
            java.lang.String r2 = r2.b
            tb.x3w r2 = r3.A(r4, r2)
            boolean r3 = r2.z
            if (r3 == 0) goto L_0x0057
            r3 = 0
            goto L_0x0063
        L_0x0057:
            java.lang.String r3 = "首卡错误，但是有兜底数据或者瞬开数据，将列表数据追加"
            java.lang.String r4 = "recommend"
            java.lang.String r5 = "10063"
            tb.q0j.r(r2, r4, r5, r3)
        L_0x0062:
            r3 = 1
        L_0x0063:
            boolean r4 = r2.n()
            if (r4 == 0) goto L_0x006e
            tb.dh7 r4 = r9.f21916a
            r4.D0()
        L_0x006e:
            java.lang.String r4 = r2.h
            r9.g(r0, r1, r4, r2)
            if (r3 != 0) goto L_0x0076
            return r1
        L_0x0076:
            int r3 = r10.size()
            java.util.List r3 = r10.subList(r0, r3)
            tb.dh7 r4 = r9.f21916a
            r4.v(r3)
            tb.cxj r3 = r9.c
            android.app.Activity r3 = r3.i()
            tb.xmo.x(r3, r2)
            boolean r2 = tb.r19.X0()
            if (r2 != 0) goto L_0x00b6
            tb.cxj r2 = r9.c
            tb.vxj r2 = r2.l()
            if (r2 == 0) goto L_0x00b7
            tb.cxj r2 = r9.c
            tb.vxj r2 = r2.l()
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x00b7
            tb.cxj r2 = r9.c
            com.taobao.android.detail2.core.framework.data.global.a r2 = r2.j()
            tb.byj r2 = r2.N()
            boolean r2 = r2.y0()
            if (r2 == 0) goto L_0x00b7
        L_0x00b6:
            r1 = 1
        L_0x00b7:
            java.util.Iterator r10 = r10.iterator()
        L_0x00bb:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00ef
            java.lang.Object r2 = r10.next()
            tb.x3w r2 = (tb.x3w) r2
            if (r2 != 0) goto L_0x00ca
            goto L_0x00bb
        L_0x00ca:
            tb.cxj r3 = r9.c
            android.app.Activity r3 = r3.i()
            com.alibaba.fastjson.JSONArray r4 = r2.G()
            r5 = 0
            tb.hsm.e(r3, r4, r5, r1)
            com.taobao.android.detail2.core.framework.data.DetailDataManager r3 = r9.b
            tb.otm r3 = r3.L()
            tb.cxj r4 = r9.c
            android.app.Activity r4 = r4.i()
            com.alibaba.fastjson.JSONArray r5 = r2.I()
            r6 = 0
            r7 = 0
            r8 = r1
            tb.hsm.h(r3, r4, r5, r6, r7, r8)
            goto L_0x00bb
        L_0x00ef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.scf.o(java.util.List):boolean");
    }

    @Override // tb.jcf, com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public void e(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc90181d", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        super.e(z, i, i2);
        if (DetailDataManager.W(z, i)) {
            if (this.c.j().F0()) {
                r(false);
                txj.e(txj.TAG_REFRESH_DATA, "刷新数据失败,errorCode = " + i2);
            } else if (i2 != 2) {
                a j = this.c.j();
                x3w A = this.b.A(j.u(), j.s());
                g(true, false, A.h, A);
            }
        }
    }
}
