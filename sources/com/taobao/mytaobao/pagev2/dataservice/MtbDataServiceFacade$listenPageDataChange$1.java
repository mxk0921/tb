package com.taobao.mytaobao.pagev2.dataservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.iln;
import tb.k2b;
import tb.u1a;
import tb.uuu;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltb/iln;", "reason", "Lcom/alibaba/fastjson/JSONObject;", "hierarchyData", "hierarchyMap", "Ltb/xhv;", "invoke", "(Ltb/iln;Lcom/alibaba/fastjson/JSONObject;Lcom/alibaba/fastjson/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbDataServiceFacade$listenPageDataChange$1 extends Lambda implements w1a<iln, JSONObject, JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ u1a $dataChangeListener;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ iln b;
        public final /* synthetic */ Map c;

        public a(iln ilnVar, Map map) {
            this.b = ilnVar;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MtbDataServiceFacade$listenPageDataChange$1.this.$dataChangeListener.invoke(this.b, this.c);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbDataServiceFacade$listenPageDataChange$1(u1a u1aVar) {
        super(3);
        this.$dataChangeListener = u1aVar;
    }

    public static /* synthetic */ Object ipc$super(MtbDataServiceFacade$listenPageDataChange$1 mtbDataServiceFacade$listenPageDataChange$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/dataservice/MtbDataServiceFacade$listenPageDataChange$1");
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(iln ilnVar, JSONObject jSONObject, JSONObject jSONObject2) {
        invoke2(ilnVar, jSONObject, jSONObject2);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(iln ilnVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("478b731e", new Object[]{this, ilnVar, jSONObject, jSONObject2});
            return;
        }
        ckf.h(ilnVar, "reason");
        ckf.h(jSONObject, "hierarchyData");
        ckf.h(jSONObject2, "hierarchyMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = jSONObject.keySet();
        ckf.c(keySet, "hierarchyData.keys");
        for (String str : keySet) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(str);
            if (jSONObject3 != null) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject(str);
                if (jSONObject4 != null) {
                    k2b c = MtbDataServiceFacade.c(MtbDataServiceFacade.INSTANCE);
                    ckf.c(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
                    linkedHashMap.put(str, c.c(ilnVar, str, jSONObject4, jSONObject3));
                } else {
                    ckf.s();
                    throw null;
                }
            }
        }
        uuu.a(new a(ilnVar, linkedHashMap));
    }
}
