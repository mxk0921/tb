package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.nativetab.NativeContainerProvider;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import java.util.Map;
import tb.qjd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class raj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qjd.b f27227a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements qjd.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.qjd.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3987b210", new Object[]{this, str, str2, str3});
            }
        }

        @Override // tb.qjd.b
        public void b(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d586a494", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
            } else if (raj.a(raj.this, str)) {
                Map<String, AwesomeGetContainerData> map = awesomeGetData.containers;
                if (map.containsKey("recommend_multi_channel")) {
                    map.put(str, map.get("recommend_multi_channel"));
                    map.remove("recommend_multi_channel");
                }
            }
        }

        @Override // tb.qjd.a
        public void c(String str, AwesomeGetRequestParams awesomeGetRequestParams, es8 es8Var) {
            Map<String, AwesomeGetContainerParams> map;
            AwesomeGetContainerParams awesomeGetContainerParams;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5acd92be", new Object[]{this, str, awesomeGetRequestParams, es8Var});
            } else if (raj.a(raj.this, str) && (map = awesomeGetRequestParams.containerParams) != null && (awesomeGetContainerParams = map.get(str)) != null) {
                map.put("recommend_multi_channel", awesomeGetContainerParams);
                map.remove(str);
            }
        }

        @Override // tb.qjd.b
        public void d(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
            Map<String, AwesomeGetContainerParams> map;
            AwesomeGetContainerParams awesomeGetContainerParams;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c78df556", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
            } else if (raj.a(raj.this, str) && (map = awesomeGetRequestParams.containerParams) != null && (awesomeGetContainerParams = map.get(str)) != null) {
                map.put("recommend_multi_channel", awesomeGetContainerParams);
                map.remove(str);
            }
        }
    }

    static {
        t2o.a(729810002);
    }

    public raj(z4a z4aVar, lhd lhdVar) {
        qjd.b b = b();
        this.f27227a = b;
        lhdVar.m(b);
    }

    public static /* synthetic */ boolean a(raj rajVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5538b09e", new Object[]{rajVar, str})).booleanValue();
        }
        return rajVar.c(str);
    }

    public final qjd.b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qjd.b) ipChange.ipc$dispatch("dd6fe33e", new Object[]{this});
        }
        return new a();
    }

    public final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("755e48d", new Object[]{this, str})).booleanValue();
        }
        return str.contains(NativeContainerProvider.MULTI_NATIVE_INFOFLOW_CID_PREFIX);
    }
}
