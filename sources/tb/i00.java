package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.MockResponse;
import mtopsdk.network.domain.NetworkStats;
import org.json.JSONObject;
import tb.o9o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class i00 implements zu2, bs8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean f;
    public static volatile boolean g;
    public static final AtomicBoolean h = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public final h3o f21000a;
    public final Context b;
    public volatile boolean c;
    public Future d;
    public final String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a extends q9o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;
        public final /* synthetic */ byte[] c;

        public a(i00 i00Var, Map map, byte[] bArr) {
            this.b = map;
            this.c = bArr;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/network/AbstractCallImpl$1");
        }

        @Override // tb.q9o
        public InputStream a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputStream) ipChange.ipc$dispatch("9a7074b2", new Object[]{this});
            }
            return null;
        }

        @Override // tb.q9o
        public long b() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("905069ba", new Object[]{this})).longValue();
            }
            byte[] bArr = this.c;
            if (bArr != null) {
                return bArr.length;
            }
            return 0L;
        }

        @Override // tb.q9o
        public byte[] c() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("3e6c8fa1", new Object[]{this});
            }
            return this.c;
        }
    }

    static {
        t2o.a(589300016);
        t2o.a(589300018);
        t2o.a(589300020);
    }

    public i00(h3o h3oVar, Context context) {
        this.f21000a = h3oVar;
        if (h3oVar != null) {
            this.e = h3oVar.e;
        }
        this.b = context;
        if (context != null && h.compareAndSet(false, true)) {
            g = MtopUtils.isApkDebug(context);
            f = MtopUtils.isAppOpenMock(context);
            String str = this.e;
            TBSdkLog.i("mtopsdk.AbstractCallImpl", str, "isDebugApk=" + g + ",isOpenMock=" + f);
        }
    }

    public o9o c(h3o h3oVar, int i, String str, Map<String, List<String>> map, byte[] bArr, NetworkStats networkStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o9o) ipChange.ipc$dispatch("4303e0c4", new Object[]{this, h3oVar, new Integer(i), str, map, bArr, networkStats});
        }
        return new o9o.b().l(h3oVar).g(i).i(str).h(map).d(new a(this, map, bArr)).m(networkStats).e();
    }

    @Override // tb.zu2
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("mtopsdk.AbstractCallImpl", "try to cancel call.");
        }
        this.c = true;
        Future future = this.d;
        if (future != null) {
            future.cancel(true);
        }
    }

    public MockResponse d(String str) {
        MockResponse mockResponse;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MockResponse) ipChange.ipc$dispatch("d89bb9e7", new Object[]{this, str});
        }
        if (str == null) {
            TBSdkLog.e("mtopsdk.AbstractCallImpl", this.e, "[getMockResponse] apiName is null!");
            return null;
        } else if (this.b == null) {
            TBSdkLog.e("mtopsdk.AbstractCallImpl", this.e, "[getMockResponse] mContext is null!");
            return null;
        } else {
            try {
                byte[] readFile = MtopUtils.readFile(this.b.getFilesDir().getCanonicalPath() + "/mock/deMock/" + str + q2s.JSON);
                if (readFile == null) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(readFile));
                    mockResponse = new MockResponse();
                    try {
                        mockResponse.api = str;
                        String optString = jSONObject.optString("mock_body");
                        if (optString != null) {
                            mockResponse.byteData = optString.getBytes("utf-8");
                        }
                        JSONObject optJSONObject = jSONObject.optJSONObject("response_header");
                        if (optJSONObject != null) {
                            mockResponse.headers = new HashMap();
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String string = optJSONObject.getString(next);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(string);
                                mockResponse.headers.put(next, arrayList);
                            }
                        }
                        String optString2 = jSONObject.optString("response_status");
                        if (optString2 != null) {
                            mockResponse.statusCode = Integer.parseInt(optString2);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        TBSdkLog.e("mtopsdk.AbstractCallImpl", this.e, "[getMockData] get MockData error.api=".concat(str), e);
                        return mockResponse;
                    }
                } catch (Exception e3) {
                    mockResponse = null;
                    e = e3;
                }
                return mockResponse;
            } catch (IOException e4) {
                TBSdkLog.e("mtopsdk.AbstractCallImpl", this.e, "[getMockResponse] parse ExternalFilesDir/mock/deMock/" + str + ".json filePath error.", e4);
                return null;
            }
        }
    }

    @Override // tb.zu2
    public h3o request() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3o) ipChange.ipc$dispatch("ef1a9c0d", new Object[]{this});
        }
        return this.f21000a;
    }
}
