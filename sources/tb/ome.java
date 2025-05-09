package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicImageViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ome extends u0i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String e;

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
            return new ome(jSONObject);
        }
    }

    static {
        t2o.a(352322149);
    }

    public ome(JSONObject jSONObject) {
        super(jSONObject);
        JSONObject jSONObject2 = this.b;
        if (jSONObject2 != null) {
            this.e = jSONObject2.getString("url");
        }
    }

    public static mqc g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mqc) ipChange.ipc$dispatch("953ef438", new Object[0]);
        }
        return new a();
    }

    public static /* synthetic */ Object ipc$super(ome omeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/model/ImageModel");
    }

    @Override // tb.u0i
    public boolean a(u0i u0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddeb525c", new Object[]{this, u0iVar})).booleanValue();
        }
        return c(u0iVar);
    }

    @Override // tb.u0i
    public boolean b(u0i u0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba9d6ade", new Object[]{this, u0iVar})).booleanValue();
        }
        return c(u0iVar);
    }

    @Override // tb.u0i
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a92c3f5e", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.u0i
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return MainPicImageViewHolder.l;
    }

    @Override // tb.u0i
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3f26fb1", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
