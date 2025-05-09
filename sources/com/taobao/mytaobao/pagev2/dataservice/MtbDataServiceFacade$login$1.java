package com.taobao.mytaobao.pagev2.dataservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.iln;
import tb.s3j;
import tb.tz9;
import tb.u1a;
import tb.uuu;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltb/iln;", "reason", "Lcom/alibaba/fastjson/JSONObject;", "fullData", "Ltb/xhv;", "invoke", "(Ltb/iln;Lcom/alibaba/fastjson/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbDataServiceFacade$login$1 extends Lambda implements u1a<iln, JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbDataServiceFacade$login$1 INSTANCE = new MtbDataServiceFacade$login$1();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ iln f11289a;

        public a(iln ilnVar) {
            this.f11289a = ilnVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            tz9 tz9Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            WeakReference a2 = MtbDataServiceFacade.a(MtbDataServiceFacade.INSTANCE);
            if (a2 != null && (tz9Var = (tz9) a2.get()) != null) {
                tz9Var.a(this.f11289a);
            }
        }
    }

    public MtbDataServiceFacade$login$1() {
        super(2);
    }

    public static /* synthetic */ Object ipc$super(MtbDataServiceFacade$login$1 mtbDataServiceFacade$login$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/dataservice/MtbDataServiceFacade$login$1");
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
        ckf.h(jSONObject, "fullData");
        MtbDataServiceFacade mtbDataServiceFacade = MtbDataServiceFacade.INSTANCE;
        s3j a2 = MtbDataServiceFacade.c(mtbDataServiceFacade).a(ilnVar, jSONObject);
        if (a2 != null) {
            MtbDataServiceFacade.e(mtbDataServiceFacade, a2);
            if (ilnVar.b() == 1 || ilnVar.b() == 2) {
                MtbDataServiceFacade.d(mtbDataServiceFacade, MtbDataServiceFacade.b(mtbDataServiceFacade));
            }
            uuu.a(new a(ilnVar));
        }
    }
}
