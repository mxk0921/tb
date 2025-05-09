package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class tx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29011a;
    public Map<String, String> b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29012a;

        public a(String str) {
            this.f29012a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                tlp.c(this.f29012a, JSON.toJSONString(tx.a(tx.this)));
            }
        }
    }

    static {
        t2o.a(491782289);
    }

    public tx(String str) {
        this.f29011a = str;
    }

    public static /* synthetic */ Map a(tx txVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bc2ba1f7", new Object[]{txVar});
        }
        return txVar.b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f78733", new Object[]{this});
            return;
        }
        Map<String, String> map = this.b;
        if (map != null) {
            map.clear();
            tlp.c(e(), null);
        }
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("79854d7f", new Object[]{this});
        }
        if (this.b == null) {
            String e = e();
            String b = tlp.b(e, null);
            if (b == null) {
                fve.e("AbsReqParamSaveModeHandler", "getBizParams 未读到 saveKey ：" + e);
                return null;
            }
            try {
                this.b = (Map) JSON.parseObject(b, Map.class);
            } catch (Throwable th) {
                fve.e("AbsReqParamSaveModeHandler", "getBizParams error : " + th.getMessage());
            }
        }
        return this.b;
    }

    public abstract String d();

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9939f70d", new Object[]{this});
        }
        return d() + this.f29011a;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77a6741", new Object[]{this});
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2df9a19", new Object[]{this});
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ae57f9", new Object[]{this});
        }
    }

    public String i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18a21f0f", new Object[]{this, str, str2});
        }
        Map<String, String> c = c();
        if (c == null) {
            return str2;
        }
        if (c.containsKey(str)) {
            return c.get(str);
        }
        return str2;
    }

    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25d0298", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(this.f29011a) || TextUtils.isEmpty(str)) {
            fve.e("AbsReqParamSaveModeHandler", "save error");
        } else {
            if (this.b == null) {
                this.b = new HashMap();
            }
            if (str2 == null) {
                this.b.remove(str);
            } else {
                this.b.put(str, str2);
            }
            get.a().e(new a(e()));
        }
    }
}
