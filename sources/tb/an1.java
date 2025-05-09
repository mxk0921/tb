package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class an1 extends zwj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends f47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/collaborator/BXCollaborator$1");
        }

        @Override // tb.f47, tb.sxj
        public void b(VerticalAbsViewHolder verticalAbsViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de29b8d4", new Object[]{this, verticalAbsViewHolder});
            } else {
                an1.b(an1.this, verticalAbsViewHolder);
            }
        }

        @Override // tb.f47, tb.sxj
        public void c(VerticalAbsViewHolder verticalAbsViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a0182d5", new Object[]{this, verticalAbsViewHolder});
            } else if (verticalAbsViewHolder != null) {
                if ((verticalAbsViewHolder.t0() == null || verticalAbsViewHolder.t0().C().N().f0()) && verticalAbsViewHolder.W0()) {
                    an1.b(an1.this, verticalAbsViewHolder);
                }
            }
        }
    }

    static {
        t2o.a(352321573);
    }

    public static /* synthetic */ void b(an1 an1Var, VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be2d51a", new Object[]{an1Var, verticalAbsViewHolder});
        } else {
            an1Var.c(verticalAbsViewHolder);
        }
    }

    public static /* synthetic */ Object ipc$super(an1 an1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/collaborator/BXCollaborator");
    }

    @Override // tb.zwj
    public void a(oxj oxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557e54c4", new Object[]{this, oxjVar});
        } else if (oxjVar != null) {
            oxjVar.e(new a());
        }
    }

    public final void c(VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d1b0ea7", new Object[]{this, verticalAbsViewHolder});
        } else if (verticalAbsViewHolder != null && (verticalAbsViewHolder.t0() instanceof ue7)) {
            HashMap hashMap = new HashMap();
            JSONObject C0 = ((ue7) verticalAbsViewHolder.t0()).C0();
            if (C0 != null) {
                hashMap.put("categoryId", C0.getString("categoryId"));
                hashMap.put("rootCategoryId", C0.getString("rootCategoryId"));
            }
            com.taobao.android.detail2.core.framework.data.global.a C = verticalAbsViewHolder.t0().C();
            if (C != null) {
                hashMap.put(yj4.PARAM_PVID, C.Q());
            }
            JSONObject I0 = ((ue7) verticalAbsViewHolder.t0()).I0();
            if (I0 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("price", (Object) I0.getJSONObject("price"));
                hashMap.put("detailPriceInfo", jSONObject.toJSONString());
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(verticalAbsViewHolder.v0().i(), hashMap);
            txj.e(txj.TAG_RENDER, "BXCollaborator processPagePropertiesUpdate, index: " + verticalAbsViewHolder.u0());
        }
    }
}
