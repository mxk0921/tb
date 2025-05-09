package com.taobao.edlp.mega;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsEdlpAbility;
import com.taobao.android.abilityidl.ability.EdlpOnResultData;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import tb.c98;
import tb.ckf;
import tb.d98;
import tb.gqs;
import tb.jpu;
import tb.kdb;
import tb.pp6;
import tb.t2o;
import tb.tao;
import tb.v1c;
import tb.v3i;
import tb.vk8;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/taobao/edlp/mega/TBEdlpModuleAbility;", "Lcom/taobao/android/abilityidl/ability/AbsEdlpAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/c98;", "params", "Ltb/v1c;", "callback", "Ltb/xhv;", "requestPreloadData", "(Ltb/kdb;Ltb/c98;Ltb/v1c;)V", "Ltb/d98;", "Ltb/tao;", "", "Lcom/alibaba/ability/result/ErrorResult;", "notifyRenderSuccess", "(Ltb/kdb;Ltb/d98;)Ltb/tao;", "taoedlp_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TBEdlpModuleAbility extends AbsEdlpAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements pp6<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10400a;
        public final /* synthetic */ v1c b;

        public a(long j, v1c v1cVar) {
            this.f10400a = j;
            this.b = v1cVar;
        }

        /* renamed from: a */
        public void onData(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8968ec0", new Object[]{this, jSONObject});
                return;
            }
            EdlpOnResultData edlpOnResultData = new EdlpOnResultData();
            edlpOnResultData.data = jSONObject;
            StringBuilder sb = new StringBuilder("callBackData  time is ");
            sb.append(System.currentTimeMillis() - this.f10400a);
            sb.append("|");
            sb.append(jSONObject != null ? Integer.valueOf(jSONObject.size()) : null);
            TLog.loge("tab3edlp", sb.toString());
            this.b.j(edlpOnResultData);
        }

        @Override // tb.pp6
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // tb.pp6
        public void onError(String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b263e360", new Object[]{this, str, str2, obj});
                return;
            }
            EdlpOnResultData edlpOnResultData = new EdlpOnResultData();
            edlpOnResultData.data = new JSONObject();
            this.b.j(edlpOnResultData);
        }
    }

    static {
        t2o.a(1032847379);
    }

    public static /* synthetic */ Object ipc$super(TBEdlpModuleAbility tBEdlpModuleAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/mega/TBEdlpModuleAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsEdlpAbility
    public void requestPreloadData(kdb kdbVar, c98 c98Var, v1c v1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc16efd0", new Object[]{this, kdbVar, c98Var, v1cVar});
            return;
        }
        ckf.h(kdbVar, "context");
        ckf.h(c98Var, "params");
        ckf.h(v1cVar, "callback");
        String userId = Login.getUserId();
        ckf.c(userId, "Login.getUserId()");
        TLog.loge("tab3edlp", " getPreloadData userId|" + userId + '|' + c98Var.f16923a);
        gqs.g(c98Var.f16923a).h(new a(System.currentTimeMillis(), v1cVar));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsEdlpAbility
    public tao<Object, ErrorResult> notifyRenderSuccess(kdb kdbVar, d98 d98Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("124aba3", new Object[]{this, kdbVar, d98Var});
        }
        ckf.h(kdbVar, "context");
        ckf.h(d98Var, "params");
        TLog.loge("tab3edlp", " renderSuccess ");
        vk8.b().d("renderSuccess", v3i.f(jpu.a("data", d98Var.f17665a)));
        return new tao<>(null, null, 3, null);
    }
}
