package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.uploader.implement.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ttx implements i5y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public w8y f28957a;
    public final String b;
    public final long c;
    public final Pair<String, Integer> d;
    public final a e;
    public final v8y f = new v8y(null, 0, 0, 0, e(), null, null, null);

    public ttx(a aVar) throws Exception {
        this.e = aVar;
        this.d = aVar.f14547a.f();
        a.b bVar = aVar.f14547a;
        this.b = bVar.p();
        this.c = bVar.m();
    }

    @Override // tb.i5y
    public /* synthetic */ wtx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (wtx) ipChange.ipc$dispatch("7798d648", new Object[]{this}) : d();
    }

    @Override // tb.i5y
    public v8y b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v8y) ipChange.ipc$dispatch("ffc8a2a1", new Object[]{this}) : this.f;
    }

    public w8y d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w8y) ipChange.ipc$dispatch("6efbcc4d", new Object[]{this});
        }
        w8y w8yVar = this.f28957a;
        if (w8yVar != null) {
            return w8yVar;
        }
        StringBuilder sb = new StringBuilder(32);
        if (((Integer) this.d.second).intValue() == 443) {
            sb.append(h1p.HTTPS_PREFIX);
            sb.append((String) this.d.first);
            sb.append(":");
            sb.append(this.d.second);
        } else {
            sb.append(h1p.HTTP_PREFIX);
            sb.append((String) this.d.first);
        }
        sb.append("/dispatchUpload.api");
        Pair<String, Integer> pair = this.d;
        w8y w8yVar2 = new w8y((String) pair.first, ((Integer) pair.second).intValue(), sb.toString(), this.b);
        this.f28957a = w8yVar2;
        return w8yVar2;
    }

    public final Map<String, String> e() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        String str = this.e.b.a().b;
        String utdid = this.e.b.getUtdid();
        String userId = this.e.b.getUserId();
        String appVersion = this.e.b.getAppVersion();
        String valueOf = String.valueOf(this.c + (System.currentTimeMillis() / 1000));
        String valueOf2 = String.valueOf(bux.c());
        HashMap hashMap = new HashMap();
        hashMap.put("content-type", "application/json;charset=utf-8");
        hashMap.put("x-arup-version", "2.3.4");
        hashMap.put("host", fzx.f(this.b));
        hashMap.put("x-arup-appkey", fzx.f(str));
        hashMap.put("x-arup-appversion", fzx.f(appVersion));
        hashMap.put("x-arup-device-id", fzx.f(utdid));
        if (!TextUtils.isEmpty(userId)) {
            hashMap.put("x-arup-userinfo", fzx.f(userId));
        }
        hashMap.put("x-arup-timestamp", fzx.f(valueOf));
        hashMap.put("x-arup-ip-stack-type", fzx.f(valueOf2));
        StringBuilder sb = new StringBuilder(128);
        sb.append("/dispatchUpload.api&");
        sb.append(str);
        sb.append("&");
        sb.append(appVersion);
        sb.append("&");
        sb.append(utdid);
        sb.append("&");
        sb.append(valueOf);
        String signature = this.e.b.signature(sb.toString());
        if (rtx.d(2)) {
            rtx.a(2, "DeclareUploadActionRequest", "compute api sign:" + signature + ", input=" + ((Object) sb));
        }
        if (TextUtils.isEmpty(signature)) {
            if (rtx.d(16)) {
                rtx.a(16, "DeclareUploadActionRequest", "compute api sign failed.");
            }
            throw new Exception("compute api sign failed.");
        }
        hashMap.put("x-arup-sign", fzx.f(signature));
        if (rtx.d(2)) {
            rtx.a(2, "DeclareUploadActionRequest", " create declare header:" + hashMap.toString());
        }
        return hashMap;
    }

    @Override // tb.i5y
    public Pair<f6y, Integer> a(Map<String, String> map, byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("3deb344e", new Object[]{this, map, bArr, new Integer(i), new Integer(i2)});
        }
        if (map == null || bArr == null) {
            return new Pair<>(null, 0);
        }
        try {
            return new Pair<>(c(map, bArr, i, i2), Integer.valueOf(i2));
        } catch (Exception e) {
            if (rtx.d(2)) {
                rtx.a(2, "DeclareUploadActionRequest", e.toString());
            }
            return new Pair<>(null, -1);
        }
    }

    public final Object[] b(String str) throws Exception {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("ba3f5a13", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject(str);
        JSONArray jSONArray = jSONObject.getJSONArray("apiServerList");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int length = jSONArray.length() - 1; length >= 0; length--) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(length);
            arrayList.add(0, new Pair(jSONObject2.getString(pod.IP), Integer.valueOf(jSONObject2.getInt("port"))));
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("uploadServerList");
        ArrayList arrayList2 = new ArrayList();
        for (int length2 = jSONArray2.length() - 1; length2 >= 0; length2--) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(length2);
            a.b.C0850b bVar = new a.b.C0850b();
            bVar.f14550a = jSONObject3.getString(pod.IP);
            bVar.d = jSONObject3.getBoolean("encrypt");
            bVar.b = jSONObject3.getInt("port");
            bVar.c = jSONObject3.optString("protocol");
            arrayList2.add(0, bVar);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(RemoteMessageConst.TTL);
        if (optJSONObject != null) {
            j2 = optJSONObject.getLong("token");
            j = optJSONObject.getLong("file");
        } else {
            j2 = 0;
            j = 0;
        }
        return new Object[]{jSONObject.getString("token"), Long.valueOf(j2), Long.valueOf(j), arrayList, arrayList2};
    }

    public final f6y c(Map<String, String> map, byte[] bArr, int i, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f6y) ipChange.ipc$dispatch("b7b3029", new Object[]{this, map, bArr, new Integer(i), new Integer(i2)});
        }
        if (map.get("x-arup-error-code") != null) {
            return new utx(5, map);
        }
        String str = bArr != null ? new String(bArr, i, i2) : null;
        map.put("divided_length", Integer.toString(i2));
        return new utx(1, map, b(str));
    }
}
