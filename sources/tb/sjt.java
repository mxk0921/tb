package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class sjt implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String NAMESPACE = "search_template_preload";

    /* renamed from: a  reason: collision with root package name */
    public final qjt f28094a = new rjt();
    public String b = "";
    public final float c = Float.parseFloat(r4p.SERVER_VERSION_VALUE);
    public final HashMap<String, tjt> d = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793513);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793512);
        t2o.a(613416995);
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        ckf.g(map, "args");
        long currentTimeMillis = System.currentTimeMillis();
        if (!o4p.y2()) {
            OrangeConfig.getInstance().unregisterListener(new String[]{NAMESPACE}, this);
            return;
        }
        String str2 = map.get("configVersion");
        if (!TextUtils.isEmpty(str2)) {
            c4p.D("TemplatePreLoaderListener", "receive config, currentVersion:" + this.b + ", newVersion:" + str2, new Object[0]);
            if (!ckf.b(this.b, str2)) {
                ckf.d(str2);
                this.b = str2;
                a();
            }
            c4p.D("TemplatePreLoaderListener", "handle preload on " + Thread.currentThread() + ", cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms", new Object[0]);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1192585e", new Object[]{this});
            return;
        }
        c4p.D("TemplatePreLoaderListener", "trigger preload", new Object[0]);
        JSONArray parseArray = JSON.parseArray(OrangeConfig.getInstance().getCustomConfig(NAMESPACE, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264));
        ArrayList arrayList = new ArrayList();
        int size = parseArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = parseArray.getJSONObject(i);
            String string = jSONObject.getString(BizContext.KEY_SDK_VERSION);
            ckf.f(string, "getString(...)");
            if (Float.parseFloat(string) <= this.c) {
                String string2 = jSONObject.getString("url");
                String string3 = jSONObject.getString("md5");
                String string4 = jSONObject.getString("name");
                if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string4)) {
                    tjt tjtVar = this.d.get(string4);
                    if (tjtVar == null || !ckf.b(tjtVar.c(), string2)) {
                        ckf.d(string2);
                        ckf.d(string3);
                        ckf.d(string4);
                        tjt tjtVar2 = new tjt(string2, string3, string4);
                        this.d.put(tjtVar2.b(), tjtVar2);
                        arrayList.add(tjtVar2);
                    } else {
                        c4p.D("TemplatePreLoaderListener", "模板" + string4 + "未发生变化，不触发预加载", new Object[0]);
                    }
                }
            }
        }
        ((rjt) this.f28094a).b(arrayList);
    }
}
