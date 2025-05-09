package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicVideoViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g9w extends u0i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final g9e e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements mqc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.mqc
        public u0i a(JSONObject jSONObject, com.taobao.android.detail2.core.framework.data.global.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (u0i) ipChange.ipc$dispatch("e47d67cf", new Object[]{this, jSONObject, aVar});
            }
            return new g9w(jSONObject, aVar);
        }
    }

    static {
        t2o.a(352322153);
    }

    public g9w(JSONObject jSONObject, com.taobao.android.detail2.core.framework.data.global.a aVar) {
        super(jSONObject);
        if (jSONObject != null) {
            this.e = new g5g(jSONObject, aVar);
        }
    }

    public static mqc h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mqc) ipChange.ipc$dispatch("953ef438", new Object[0]);
        }
        return new a();
    }

    public static /* synthetic */ Object ipc$super(g9w g9wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/model/VideoModel");
    }

    @Override // tb.u0i
    public boolean a(u0i u0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddeb525c", new Object[]{this, u0iVar})).booleanValue();
        }
        return g(u0iVar);
    }

    @Override // tb.u0i
    public boolean b(u0i u0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba9d6ade", new Object[]{this, u0iVar})).booleanValue();
        }
        return g(u0iVar);
    }

    @Override // tb.u0i
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a92c3f5e", new Object[]{this});
        }
        g9e g9eVar = this.e;
        if (g9eVar != null && ((g5g) g9eVar).isDataValid()) {
            return ((g5g) this.e).e();
        }
        return "";
    }

    @Override // tb.u0i
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return MainPicVideoViewHolder.i;
    }

    @Override // tb.u0i
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3f26fb1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean g(u0i u0iVar) {
        g9e i;
        g9e i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e17ffe6", new Object[]{this, u0iVar})).booleanValue();
        }
        if (!(u0iVar instanceof g9w) || (i = ((g9w) u0iVar).i()) == null || i.getVideoId() == null || (i2 = i()) == null || !i.getVideoId().equals(i2.getVideoId())) {
            return false;
        }
        return true;
    }

    public g9e i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g9e) ipChange.ipc$dispatch("51d349ea", new Object[]{this});
        }
        return this.e;
    }
}
