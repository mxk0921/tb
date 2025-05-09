package com.taobao.mytaobao.pagev2.dataservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.iln;
import tb.u1a;
import tb.uuu;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltb/iln;", "reason", "Lcom/alibaba/fastjson/JSONObject;", "global", "Ltb/xhv;", "invoke", "(Ltb/iln;Lcom/alibaba/fastjson/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbDataServiceFacade$listenGlobalDataChange$1 extends Lambda implements u1a<iln, JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ u1a $globalChangeListener;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ iln b;
        public final /* synthetic */ JSONObject c;

        public a(iln ilnVar, JSONObject jSONObject) {
            this.b = ilnVar;
            this.c = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MtbDataServiceFacade$listenGlobalDataChange$1.this.$globalChangeListener.invoke(this.b, this.c);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbDataServiceFacade$listenGlobalDataChange$1(u1a u1aVar) {
        super(2);
        this.$globalChangeListener = u1aVar;
    }

    public static /* synthetic */ Object ipc$super(MtbDataServiceFacade$listenGlobalDataChange$1 mtbDataServiceFacade$listenGlobalDataChange$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/dataservice/MtbDataServiceFacade$listenGlobalDataChange$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(iln ilnVar, JSONObject jSONObject) {
        invoke2(ilnVar, jSONObject);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(iln ilnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca40d212", new Object[]{this, ilnVar, jSONObject});
            return;
        }
        ckf.h(ilnVar, "reason");
        ckf.h(jSONObject, "global");
        uuu.a(new a(ilnVar, jSONObject));
    }
}
