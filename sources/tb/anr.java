package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class anr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public zmr f15888a;
    public boolean b = false;
    public boolean c = true;
    public boolean d = false;
    public final nkr e;
    public final Context f;

    static {
        t2o.a(1027604488);
    }

    public anr(Context context, nkr nkrVar) {
        this.e = nkrVar;
        this.f = context;
    }

    public zmr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zmr) ipChange.ipc$dispatch("dbc2270b", new Object[]{this});
        }
        return this.f15888a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8795deb2", new Object[]{this});
        } else if (this.f15888a == null) {
            this.e.s("tlh5_container_init_begin");
            zmr zmrVar = new zmr((Activity) this.f);
            this.f15888a = zmrVar;
            zmrVar.k(this.e.e);
            this.f15888a.h(this.e);
            this.e.j = this.f15888a;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2defa32b", new Object[]{this, str});
            return;
        }
        d(str);
        if (this.c) {
            this.f15888a.d(str);
        }
    }

    public void f(String str) {
        mnr mnrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f47858d", new Object[]{this, str});
            return;
        }
        nkr nkrVar = this.e;
        if (nkrVar != null && (mnrVar = nkrVar.k) != null && mnrVar.i(str, nkrVar)) {
            this.e.s("tlh5_h5_prerender_begin");
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553e1f54", new Object[]{this, str});
        } else if (this.e != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            if (!this.b) {
                this.b = true;
                long s = this.e.s("tlh5_load_url_begin");
                if (!this.d) {
                    e(str, true, false);
                }
                if (this.f15888a == null) {
                    hashMap.put("pre_render_failed_code", "5");
                    b();
                }
                this.f15888a.j(R.id.taolive_container_prerender_status, false);
                mnr mnrVar = this.e.k;
                if (mnrVar != null) {
                    if (mnrVar.g(str)) {
                        hashMap.put("pre_render_failed_code", "0");
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("accessUrl", (Object) str);
                            this.f15888a.g(nkr.EVENT_TBLiveBasePlugin_Event_PreRender_Attach, jSONObject.toJSONString());
                        }
                        this.c = false;
                        this.e.g = "true";
                    } else {
                        if (this.e.k.e() || this.e.k.f()) {
                            float c = qp0.c();
                            if (!this.e.c().e) {
                                hashMap.put("pre_render_failed_code", "1");
                            } else if (c <= 20.0f) {
                                hashMap.put("pre_render_failed_code", "2");
                            } else if (this.e.k.e()) {
                                hashMap.put("pre_render_failed_code", "4");
                            } else if (this.e.k.f()) {
                                hashMap.put("pre_render_failed_code", "7");
                            }
                            this.f15888a.destroy();
                            this.f15888a = null;
                            b();
                        }
                        this.c = true;
                    }
                    this.e.t("tlh5_fsp", hashMap);
                    this.f15888a.i(s);
                    this.e.k.b();
                }
            }
        }
    }

    public void e(String str, boolean z, boolean z2) {
        Uri parse;
        nkr nkrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba1cd5", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
        } else if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (nkrVar = this.e) != null && nkrVar.c() != null) {
            this.e.c().e = parse.getBooleanQueryParameter(nkr.KEY_PRE_RENDER, false) & this.e.c().e;
            if (z) {
                b();
            }
            if (z2 && this.e.c().e) {
                f(str);
            }
            this.d = true;
        }
    }
}
