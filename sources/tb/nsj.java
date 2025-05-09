package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.NetError;
import com.taobao.android.searchbaseframe.net.RequestStats;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.net.ResultException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nsj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f24927a;
    public byte[] b;
    public Map<String, List<String>> c;
    public boolean d = true;
    public NetError e = null;
    public RequestStats f;

    static {
        t2o.a(993001894);
    }

    public static JSONObject c(nsj nsjVar) throws ResultException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("51fc2919", new Object[]{nsjVar});
        }
        if (nsjVar.h()) {
            throw new ResultException(new ResultError(nsjVar.b()));
        } else if (nsjVar.d() != null) {
            return nsjVar.d();
        } else {
            byte[] a2 = nsjVar.a();
            if (a2 == null || a2.length == 0) {
                throw new ResultException(new ResultError(5));
            }
            try {
                String str = new String(a2, "UTF-8");
                if (!TextUtils.isEmpty(str)) {
                    try {
                        return JSON.parseObject(str);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        throw new ResultException(new ResultError(7, e));
                    }
                } else {
                    throw new ResultException(new ResultError(5));
                }
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                throw new ResultException(new ResultError(6, e2));
            }
        }
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e6eec916", new Object[]{this});
        }
        return this.b;
    }

    public NetError b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetError) ipChange.ipc$dispatch("681d66bf", new Object[]{this});
        }
        return this.e;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f3646aab", new Object[]{this});
        }
        return this.f24927a;
    }

    public RequestStats e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestStats) ipChange.ipc$dispatch("fdc1046e", new Object[]{this});
        }
        return this.f;
    }

    public Map<String, List<String>> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1aeb128b", new Object[]{this});
        }
        return this.c;
    }

    public String g() {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        Map<String, List<String>> f = f();
        if (f == null || (list = f.get("eagleeye-traceid")) == null || list.isEmpty()) {
            return "";
        }
        return list.get(0);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a308af12", new Object[]{this})).booleanValue();
        }
        return true ^ this.d;
    }

    public void i(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252501ba", new Object[]{this, bArr});
        } else {
            this.b = bArr;
        }
    }

    public void j(NetError netError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda45c89", new Object[]{this, netError});
            return;
        }
        this.d = false;
        this.e = netError;
    }

    public void k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c343639", new Object[]{this, jSONObject});
        } else {
            this.f24927a = jSONObject;
        }
    }

    public void l(RequestStats requestStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc3d6f8", new Object[]{this, requestStats});
        } else {
            this.f = requestStats;
        }
    }

    public void m(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2616cffb", new Object[]{this, map});
        } else {
            this.c = map;
        }
    }
}
