package com.taobao.mytaobao.pagev2.dataservice;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.iln;
import tb.mop;
import tb.u1a;
import tb.uuu;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltb/iln;", "reason", "Lcom/alibaba/fastjson/JSONArray;", mop.KEY_TEMPLATE_LIST, "Ltb/xhv;", "invoke", "(Ltb/iln;Lcom/alibaba/fastjson/JSONArray;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbDataServiceFacade$listenTemplateChange$1 extends Lambda implements u1a<iln, JSONArray, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ u1a $templateChangeListener;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ iln b;
        public final /* synthetic */ List c;

        public a(iln ilnVar, List list) {
            this.b = ilnVar;
            this.c = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MtbDataServiceFacade$listenTemplateChange$1.this.$templateChangeListener.invoke(this.b, this.c);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbDataServiceFacade$listenTemplateChange$1(u1a u1aVar) {
        super(2);
        this.$templateChangeListener = u1aVar;
    }

    public static /* synthetic */ Object ipc$super(MtbDataServiceFacade$listenTemplateChange$1 mtbDataServiceFacade$listenTemplateChange$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/dataservice/MtbDataServiceFacade$listenTemplateChange$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(iln ilnVar, JSONArray jSONArray) {
        invoke2(ilnVar, jSONArray);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(iln ilnVar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4ad5c6", new Object[]{this, ilnVar, jSONArray});
            return;
        }
        ckf.h(ilnVar, "reason");
        ckf.h(jSONArray, mop.KEY_TEMPLATE_LIST);
        uuu.a(new a(ilnVar, MtbDataServiceFacade.c(MtbDataServiceFacade.INSTANCE).b(ilnVar, jSONArray, null)));
    }
}
